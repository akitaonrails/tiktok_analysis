package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05jb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1435305jb {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);

    public static void LIZ(String str) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadShopTabImmediately: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        AtomicBoolean atomicBoolean = LIZ;
        boolean z = !atomicBoolean.get();
        if ((!z && !Intrinsics.LJFF(str, "page_close_resume") && !Intrinsics.LJFF(str, "final_resume") && !Intrinsics.LJFF(str, "immediately_load")) || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        C1440005kM.LIZ(new C1435405jc(str, z));
    }

    public static void LIZIZ(long j, String str) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1351205Qo(j, str, null), 3);
    }
}
