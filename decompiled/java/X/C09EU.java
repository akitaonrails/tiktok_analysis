package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.SelfDataManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.09EU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09EU {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static volatile C09EY LIZJ = new C09EY() { // from class: X.09EW
        @Override // X.C09EY
        public final void LIZ() {
        }

        @Override // X.C09EY
        public final void LIZIZ(Throwable th) {
        }

        @Override // X.C09EY
        public final void LIZJ() {
        }

        @Override // X.C09EY
        public final void LIZLLL() {
        }

        @Override // X.C09EY
        public final void LJ() {
        }

        @Override // X.C09EY
        public final void LJFF(Throwable th, Map map) {
        }

        @Override // X.C09EY
        public final void LJI(Throwable th) {
            if (th != null) {
                Keva repo = KevaImpl.getRepo("protector_throwable_repo", 1);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                th.printStackTrace(new PrintStream(byteArrayOutputStream));
                repo.storeString("protector_throwable_key", byteArrayOutputStream.toString());
            }
        }
    };

    public static boolean LIZIZ() {
        if (LIZIZ) {
            return LIZ;
        }
        return false;
    }

    public static C08FV LIZ(C08FG c08fg, Throwable th) {
        C09EY c09ey = LIZJ;
        if (c09ey != null) {
            c09ey.LIZIZ(th);
            try {
                C08FV c08fvLIZ = C09EQ.LIZIZ.LIZ(c08fg, th);
                if (c08fvLIZ != null) {
                    c09ey.LJI(th);
                    return c08fvLIZ;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                HashMap map = new HashMap();
                map.put("Protector/SelfData", SelfDataManager.LJ.LIZJ(th2).toString());
                LIZJ.LJFF(th2, map);
            }
            c09ey.LIZIZ(th);
        }
        return null;
    }
}
