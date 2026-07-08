package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.08Ut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2126508Ut {
    public final C0VSJ LIZ;
    public final String LIZIZ;
    public final long LIZJ = 604800;

    public final boolean LIZ() {
        if (!this.LIZ.exists()) {
            return true;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            long j = CastLongProtector.parseLong(C08SE.LIZLLL(this.LIZ.getAbsolutePath()));
            if (jCurrentTimeMillis < j) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(": time error currentTime is earlier than lastTime");
                C2188811AlT.LIZIZ(sbLIZ);
                return false;
            }
            if (jCurrentTimeMillis - j >= this.LIZJ) {
                String absolutePath = this.LIZ.getAbsolutePath();
                if (!TextUtils.isEmpty(absolutePath)) {
                    C08SE.LIZIZ(new C0VSJ(absolutePath));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.LIZIZ);
                sbLIZ2.append(": deleteFile guard file");
                C2188811AlT.LIZIZ(sbLIZ2);
                return true;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.LIZIZ);
            sbLIZ3.append(": CheckTime Less than ");
            sbLIZ3.append(this.LIZJ);
            sbLIZ3.append(" seconds, lastTime:");
            sbLIZ3.append(j);
            sbLIZ3.append(" currentTime:");
            sbLIZ3.append(jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ3);
            return false;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(this.LIZIZ);
            sbLIZ4.append(": read guard file faild!");
            C2188811AlT.LIZIZ(sbLIZ4);
            return false;
        }
    }

    public final void LIZIZ() {
        try {
            C08SE.LJIIIIZZ(this.LIZ, String.valueOf(System.currentTimeMillis() / 1000), false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(": createGuardFile success");
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LIZIZ);
            sbLIZ2.append(": createGuardFile fail");
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public C2126508Ut(String str, String str2) {
        this.LIZ = new C0VSJ(str, str2);
        this.LIZIZ = str2;
    }
}
