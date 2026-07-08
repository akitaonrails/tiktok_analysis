package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: X.12kc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19844412kc implements Comparable {
    public static void LJI(String str) {
        new C19844512kd(str);
    }

    public int LIZJ() {
        return 0;
    }

    public abstract int zza();

    public static AbstractC19844412kc LJII(byte... bArr) {
        bArr.getClass();
        C19849712lT c19849712lT = new C19849712lT(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            AbstractC19844412kc abstractC19844412kcLIZ = C19849212lO.LIZ(c19849712lT);
            try {
                c19849712lT.close();
                return abstractC19844412kcLIZ;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return abstractC19844412kcLIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                c19849712lT.close();
                throw th;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw th;
            }
        }
    }

    public final AbstractC19844412kc LJFF(Class cls) throws Exception {
        if (cls.isInstance(this)) {
            return (AbstractC19844412kc) cls.cast(this);
        }
        String name = cls.getName();
        String name2 = getClass().getName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected a ");
        sbLIZ.append(name);
        sbLIZ.append(" value, but got ");
        sbLIZ.append(name2);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        throw new Exception(strLIZIZ) { // from class: X.12kg
        };
    }
}
