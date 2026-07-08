package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VBP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VBP {
    public SharedPreferences LIZ;
    public SharedPreferences LIZIZ;
    public volatile boolean LIZJ;
    public C0VSJ LIZLLL;
    public final ConcurrentHashMap<String, C0VBY> LJ = new ConcurrentHashMap<>();
    public long LJFF = 0;
    public volatile boolean LJI = false;
    public final ArrayList<String> LJII = new ArrayList<>();

    public final synchronized void LIZJ() {
        if (this.LIZJ) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(C793630VBh.LIZLLL(), "log");
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        this.LIZLLL = c0vsj;
        this.LIZ = C810670Vr7.LIZJ(C792190V5t.LIZIZ, 0, "log_report_message");
        this.LIZIZ = C810670Vr7.LIZJ(C792190V5t.LIZIZ, 0, "store_region_record");
        this.LIZJ = true;
    }

    public final synchronized void LJ() {
        int i = 0;
        if (!this.LJI) {
            C0VBP c0vbp = C793560VBa.LIZ;
            c0vbp.LIZJ();
            String[] list = c0vbp.LIZLLL.list();
            int length = list.length;
            while (i < length) {
                String str = list[i];
                if (!this.LJII.contains(str)) {
                    LIZ(str);
                }
                i++;
            }
            this.LJI = true;
        } else if (this.LJFF > 0 && this.LJII.size() == 0) {
            C0VBP c0vbp2 = C793560VBa.LIZ;
            c0vbp2.LIZJ();
            String[] list2 = c0vbp2.LIZLLL.list();
            int length2 = list2.length;
            while (i < length2) {
                String str2 = list2[i];
                if (!this.LJII.contains(str2)) {
                    LIZ(str2);
                }
                i++;
            }
            this.LJFF -= (long) this.LJII.size();
        }
    }

    public final void LIZ(String str) {
        if (this.LJII.size() > Mp4ScreenVideoLoadTimeout.CONTROL) {
            this.LJFF++;
        } else {
            this.LJII.add(str);
        }
    }

    public final synchronized void LIZIZ(C0VSJ c0vsj) {
        this.LJII.remove(c0vsj.getName());
        LIZJ();
        C2404609bY.LIZ(c0vsj);
        this.LJ.remove(c0vsj.getName());
        SharedPreferences.Editor editorEdit = this.LIZ.edit();
        editorEdit.remove(c0vsj.getName());
        editorEdit.commit();
        SharedPreferences.Editor editorEdit2 = this.LIZIZ.edit();
        editorEdit2.remove(c0vsj.getName());
        editorEdit2.commit();
    }

    public final C0VBY LIZLLL(C0VSJ c0vsj) {
        LIZJ();
        String name = c0vsj.getName();
        if (this.LJ.containsKey(name)) {
            return this.LJ.get(name);
        }
        if (this.LIZ.contains(name)) {
            String string = this.LIZ.getString(name, "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    String[] strArrSplit = string.split("_");
                    C0VBY c0vby = new C0VBY(CastIntegerProtector.parseInt(strArrSplit[0]), CastLongProtector.parseLong(strArrSplit[1]));
                    this.LJ.put(name, c0vby);
                    return c0vby;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return null;
    }

    public final void LJI(int i, long j, C0VSJ c0vsj) {
        C0VBY c0vby;
        try {
            LIZJ();
            SharedPreferences.Editor editorEdit = this.LIZ.edit();
            String name = c0vsj.getName();
            if (this.LJ.containsKey(name)) {
                c0vby = this.LJ.get(name);
            } else {
                c0vby = new C0VBY(i, j);
                this.LJ.put(name, c0vby);
            }
            c0vby.LIZ = i;
            c0vby.LIZIZ = j;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0vby.LIZ);
            sbLIZ.append("_");
            sbLIZ.append(c0vby.LIZIZ);
            editorEdit.putString(name, C2188811AlT.LIZIZ(sbLIZ));
            editorEdit.commit();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C792910V8n.LIZJ("APM-Slardar", "updateRetryMessage", th);
        }
    }

    public final synchronized boolean LJFF(C793730VBr c793730VBr, String str, int i, long j, String str2) {
        LIZJ();
        if (this.LIZLLL == null) {
            return false;
        }
        String strJ4 = C786410Ut5.j4("%d%s%s%s%s", new Object[]{Long.valueOf(System.currentTimeMillis()), "_", UUID.randomUUID().toString(), e3.d, str});
        C0VSJ c0vsj = new C0VSJ(this.LIZLLL, strJ4);
        FileChannel channel = null;
        try {
            LJI(i, j, c0vsj);
            channel = new C0VSV(c0vsj).getChannel();
            channel.write(ByteBuffer.wrap(c793730VBr.LIZ, 0, c793730VBr.LIZIZ));
            if (!this.LJII.contains(strJ4)) {
                LIZ(strJ4);
            }
            SharedPreferences.Editor editorEdit = this.LIZIZ.edit();
            editorEdit.putString(strJ4, str2);
            editorEdit.commit();
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("saveFile:");
                sbLIZ.append(c0vsj.getName());
                C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ));
            }
            C2105408Mq.LIZ(channel);
            return true;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                C792910V8n.LIZJ("APM-Slardar", "saveFile", th);
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
