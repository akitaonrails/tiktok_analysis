package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VC0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VC0 {
    public SharedPreferences LIZ;
    public SharedPreferences LIZIZ;
    public volatile boolean LIZJ;
    public final ConcurrentHashMap<String, C793860VCe> LIZLLL = new ConcurrentHashMap<>();

    public final synchronized void LIZIZ() {
        if (this.LIZJ) {
            return;
        }
        this.LIZ = C810670Vr7.LIZJ(C0VC5.LIZ, 0, "sdk_log_report_message");
        this.LIZIZ = C810670Vr7.LIZJ(C0VC5.LIZ, 0, "sdk_store_region_record");
        this.LIZJ = true;
    }

    public final synchronized void LIZ(C0VSJ c0vsj) {
        if (c0vsj == null) {
            return;
        }
        LIZIZ();
        C2404609bY.LIZ(c0vsj);
        this.LIZLLL.remove(c0vsj.getName());
        SharedPreferences.Editor editorEdit = this.LIZ.edit();
        editorEdit.remove(c0vsj.getName());
        editorEdit.commit();
        SharedPreferences.Editor editorEdit2 = this.LIZIZ.edit();
        editorEdit2.remove(c0vsj.getName());
        editorEdit2.commit();
    }

    public final C793860VCe LIZJ(C0VSJ c0vsj) {
        LIZIZ();
        String name = c0vsj.getName();
        if (this.LIZLLL.containsKey(name)) {
            return this.LIZLLL.get(name);
        }
        C793860VCe c793860VCe = null;
        if (this.LIZ.contains(name)) {
            String string = this.LIZ.getString(name, "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    String[] strArrSplit = string.split("_");
                    if (strArrSplit.length == 2) {
                        c793860VCe = new C793860VCe(CastIntegerProtector.parseInt(strArrSplit[0]), CastLongProtector.parseLong(strArrSplit[1]));
                    } else {
                        c793860VCe = new C793860VCe(0, 0L);
                    }
                    this.LIZLLL.put(name, c793860VCe);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("parseRetryMessage ");
                    sbLIZ.append(string);
                    C0VCY.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), e);
                    return null;
                }
            }
        }
        return c793860VCe;
    }

    public final void LJ(int i, long j, C0VSJ c0vsj) {
        C793860VCe c793860VCe;
        LIZIZ();
        SharedPreferences.Editor editorEdit = this.LIZ.edit();
        String name = c0vsj.getName();
        if (this.LIZLLL.containsKey(name)) {
            c793860VCe = this.LIZLLL.get(name);
        } else {
            c793860VCe = new C793860VCe(i, j);
            this.LIZLLL.put(name, c793860VCe);
        }
        c793860VCe.LIZ = i;
        c793860VCe.LIZIZ = j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c793860VCe.LIZ);
        sbLIZ.append("_");
        sbLIZ.append(c793860VCe.LIZIZ);
        editorEdit.putString(name, C2188811AlT.LIZIZ(sbLIZ));
        editorEdit.commit();
    }

    public final synchronized boolean LIZLLL(C793730VBr c793730VBr, int i, long j, String str) {
        LIZIZ();
        if (C0VC2.LIZLLL() == null) {
            return false;
        }
        String strJ4 = C786410Ut5.j4("%d%s%s%s", new Object[]{Long.valueOf(System.currentTimeMillis()), "_", UUID.randomUUID().toString(), ".log"});
        C0VSJ c0vsj = new C0VSJ(C0VC2.LIZLLL(), strJ4);
        FileChannel channel = null;
        try {
            LJ(i, j, c0vsj);
            channel = new C0VSV(c0vsj).getChannel();
            channel.write(ByteBuffer.wrap(c793730VBr.LIZ, 0, c793730VBr.LIZIZ));
            SharedPreferences.Editor editorEdit = this.LIZIZ.edit();
            editorEdit.putString(strJ4, str);
            editorEdit.commit();
            C2105408Mq.LIZ(channel);
            return true;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("saveFile:");
                sbLIZ.append(c0vsj.getName());
                C0VCY.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), th);
                C2105408Mq.LIZ(channel);
                return false;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C2105408Mq.LIZ(channel);
                throw th2;
            }
        }
    }
}
