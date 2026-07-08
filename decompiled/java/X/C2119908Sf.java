package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.08Sf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2119908Sf implements InterfaceC2119808Se {
    public final /* synthetic */ C2120008Sg LIZ;
    public final /* synthetic */ Keva LIZIZ;

    public /* synthetic */ C2119908Sf(C2120008Sg c2120008Sg, Keva keva) {
        this.LIZ = c2120008Sg;
        this.LIZIZ = keva;
    }

    public final void LIZ(List list, boolean z) {
        File fileLIZ;
        BufferedWriter bufferedWriter;
        Iterator it2;
        int i;
        File[] fileArrListFiles;
        C2120008Sg c2120008Sg = this.LIZ;
        Keva keva = this.LIZIZ;
        boolean z2 = true;
        if (!c2120008Sg.LIZIZ) {
            if (!z) {
                keva.storeBoolean("trace_bootfinish_classes_load_failed", true);
                return;
            }
        } else if (!z) {
            return;
        }
        if (c2120008Sg.LIZIZ || (fileLIZ = C2120008Sg.LIZ()) == null) {
            return;
        }
        fileLIZ.getParentFile().mkdirs();
        try {
            bufferedWriter = new BufferedWriter(new C794210VDn(fileLIZ));
            try {
                it2 = list.iterator();
            } finally {
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return;
        }
        while (true) {
            if (it2.hasNext()) {
                String str = (String) it2.next();
                if (!z2) {
                    bufferedWriter.newLine();
                }
                bufferedWriter.write(str);
                z2 = false;
            } else {
                try {
                    break;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            TryCatchGuardChecker.doCheck(th);
            return;
        }
        C0VSJ c0vsj = C2120008Sg.LIZLLL;
        if (c0vsj != null && (fileArrListFiles = c0vsj.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                if (!TextUtils.equals(file.getName(), fileLIZ.getName())) {
                    file.delete();
                }
            }
        }
        bufferedWriter.close();
    }
}
