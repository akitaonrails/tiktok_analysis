package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0LSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C543180LSa {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        boolean z;
        boolean z2 = false;
        if (a0.LJJIIZI(str, "{", false) && a0.LJJIIZI(str, "}", false)) {
            z = true;
        } else {
            z = false;
        }
        if (a0.LJJIIZI(str, e3.e, false) && a0.LJJIIZI(str, e3.f, false)) {
            z2 = true;
        }
        if (z || z2) {
            return "";
        }
        return str;
    }

    public static String LIZJ(int i) {
        if (C547120Ld0.LIZIZ.contains(Integer.valueOf(i))) {
            return C0LLZ.SERVER_TNS.getValue();
        }
        return C0LLZ.SERVER_BUSINESS.getValue();
    }

    public static List LIZIZ(C0LSZ c0lsz, C0LSZ c0lsz2) {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        if (!Intrinsics.LJFF(c0lsz.LIZ, c0lsz2.LIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("id: ");
            sbLIZ.append(c0lsz.LIZ);
            sbLIZ.append(" -> ");
            sbLIZ.append(c0lsz2.LIZ);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!Intrinsics.LJFF(c0lsz.LIZIZ, c0lsz2.LIZIZ)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("name: ");
            sbLIZ2.append(c0lsz.LIZIZ);
            sbLIZ2.append(" -> ");
            sbLIZ2.append(c0lsz2.LIZIZ);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (!Intrinsics.LJFF(c0lsz.LIZJ, c0lsz2.LIZJ)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("icon: ");
            sbLIZ3.append(c0lsz.LIZJ);
            sbLIZ3.append(" -> ");
            sbLIZ3.append(c0lsz2.LIZJ);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (!Intrinsics.LJFF(c0lsz.LIZLLL, c0lsz2.LIZLLL)) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("type: ");
            sbLIZ4.append(c0lsz.LIZLLL);
            sbLIZ4.append(" -> ");
            sbLIZ4.append(c0lsz2.LIZLLL);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ4));
        }
        if (!Intrinsics.LJFF(c0lsz.LJ, c0lsz2.LJ)) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("status: ");
            sbLIZ5.append(c0lsz.LJ);
            sbLIZ5.append(" -> ");
            sbLIZ5.append(c0lsz2.LJ);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ5));
        }
        if (!Intrinsics.LJFF(c0lsz.LJFF, c0lsz2.LJFF)) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("asyncStatus: ");
            sbLIZ6.append(c0lsz.LJFF);
            sbLIZ6.append(" -> ");
            sbLIZ6.append(c0lsz2.LJFF);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ6));
        }
        if (!Intrinsics.LJFF(c0lsz.LJI, c0lsz2.LJI)) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("step: ");
            sbLIZ7.append(c0lsz.LJI);
            sbLIZ7.append(" -> ");
            sbLIZ7.append(c0lsz2.LJI);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ7));
        }
        if (c0lsz.LJII != c0lsz2.LJII) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("progress: ");
            sbLIZ8.append(c0lsz.LJII);
            sbLIZ8.append(" -> ");
            sbLIZ8.append(c0lsz2.LJII);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ8));
        }
        if (!Intrinsics.LJFF(c0lsz.LJIIIIZZ, c0lsz2.LJIIIIZZ)) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("childTaskId: ");
            sbLIZ9.append(c0lsz.LJIIIIZZ);
            sbLIZ9.append(" -> ");
            sbLIZ9.append(c0lsz2.LJIIIIZZ);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ9));
        }
        if (!Intrinsics.LJFF(c0lsz.LJIIIZ, c0lsz2.LJIIIZ)) {
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("parentTaskId: ");
            sbLIZ10.append(c0lsz.LJIIIZ);
            sbLIZ10.append(" -> ");
            sbLIZ10.append(c0lsz2.LJIIIZ);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ10));
        }
        if (!Intrinsics.LJFF(c0lsz.LJIIJ, c0lsz2.LJIIJ)) {
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append("creationId: ");
            sbLIZ11.append(c0lsz.LJIIJ);
            sbLIZ11.append(" -> ");
            sbLIZ11.append(c0lsz2.LJIIJ);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ11));
        }
        if (c0lsz.LJIIJJI != c0lsz2.LJIIJJI) {
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append("creationVersion: ");
            sbLIZ12.append(c0lsz.LJIIJJI);
            sbLIZ12.append(" -> ");
            sbLIZ12.append(c0lsz2.LJIIJJI);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ12));
        }
        if (c0lsz.LJIIL != c0lsz2.LJIIL) {
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append("source: ");
            sbLIZ13.append(c0lsz.LJIIL);
            sbLIZ13.append(" -> ");
            sbLIZ13.append(c0lsz2.LJIIL);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ13));
        }
        if (!Intrinsics.LJFF(c0lsz.LJIILIIL, c0lsz2.LJIILIIL)) {
            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
            sbLIZ14.append("param: ");
            sbLIZ14.append(c0lsz2.LJIILIIL);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ14));
        }
        if (!Intrinsics.LJFF(c0lsz.LJIILJJIL, c0lsz2.LJIILJJIL)) {
            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
            sbLIZ15.append("prompt: ");
            sbLIZ15.append(c0lsz.LJIILJJIL);
            sbLIZ15.append(" -> ");
            sbLIZ15.append(c0lsz2.LJIILJJIL);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ15));
        }
        if (c0lsz.LJIILL != c0lsz2.LJIILL) {
            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
            sbLIZ16.append("errorCode: ");
            sbLIZ16.append(c0lsz.LJIILL);
            sbLIZ16.append(" -> ");
            sbLIZ16.append(c0lsz2.LJIILL);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ16));
        }
        if (!Intrinsics.LJFF(c0lsz.LJIILLIIL, c0lsz2.LJIILLIIL)) {
            StringBuilder sbLIZ17 = C2188811AlT.LIZ();
            sbLIZ17.append("errorMsg: ");
            sbLIZ17.append(c0lsz.LJIILLIIL);
            sbLIZ17.append(" -> ");
            sbLIZ17.append(c0lsz2.LJIILLIIL);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ17));
        }
        if (!Intrinsics.LJFF(c0lsz.LJIIZILJ, c0lsz2.LJIIZILJ)) {
            StringBuilder sbLIZ18 = C2188811AlT.LIZ();
            sbLIZ18.append("errorSource: ");
            sbLIZ18.append(c0lsz.LJIIZILJ);
            sbLIZ18.append(" -> ");
            sbLIZ18.append(c0lsz2.LJIIZILJ);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ18));
        }
        if (!Intrinsics.LJFF(c0lsz.LJIJ, c0lsz2.LJIJ)) {
            StringBuilder sbLIZ19 = C2188811AlT.LIZ();
            sbLIZ19.append("failReasonMsg: ");
            sbLIZ19.append(c0lsz.LJIJ);
            sbLIZ19.append(" -> ");
            sbLIZ19.append(c0lsz2.LJIJ);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ19));
        }
        if (!Intrinsics.LJFF(c0lsz.LJIJI, c0lsz2.LJIJI)) {
            StringBuilder sbLIZ20 = C2188811AlT.LIZ();
            sbLIZ20.append("resourceId: ");
            sbLIZ20.append(c0lsz.LJIJI);
            sbLIZ20.append(" -> ");
            sbLIZ20.append(c0lsz2.LJIJI);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ20));
        }
        if (c0lsz.LJIJJ != c0lsz2.LJIJJ) {
            StringBuilder sbLIZ21 = C2188811AlT.LIZ();
            sbLIZ21.append("createdAt: ");
            sbLIZ21.append(c0lsz.LJIJJ);
            sbLIZ21.append(" -> ");
            sbLIZ21.append(c0lsz2.LJIJJ);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ21));
        }
        if (!Intrinsics.LJFF(c0lsz.LJIJJLI, c0lsz2.LJIJJLI)) {
            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
            sbLIZ22.append("serverTaskId: ");
            sbLIZ22.append(c0lsz.LJIJJLI);
            sbLIZ22.append(" -> ");
            sbLIZ22.append(c0lsz2.LJIJJLI);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ22));
        }
        if (c0lsz.LJIL != c0lsz2.LJIL) {
            StringBuilder sbLIZ23 = C2188811AlT.LIZ();
            sbLIZ23.append("remainTime: ");
            sbLIZ23.append(c0lsz.LJIL);
            sbLIZ23.append(" -> ");
            sbLIZ23.append(c0lsz2.LJIL);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ23));
        }
        if (!Intrinsics.LJFF(c0lsz.LJJ, c0lsz2.LJJ)) {
            StringBuilder sbLIZ24 = C2188811AlT.LIZ();
            sbLIZ24.append("logExtra: ");
            sbLIZ24.append(c0lsz2.LJJ);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ24));
        }
        if (!Intrinsics.LJFF(c0lsz.LJJI, c0lsz2.LJJI)) {
            StringBuilder sbLIZ25 = C2188811AlT.LIZ();
            sbLIZ25.append("aiCreationId: ");
            sbLIZ25.append(c0lsz.LJJI);
            sbLIZ25.append(" -> ");
            sbLIZ25.append(c0lsz2.LJJI);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ25));
        }
        if (!Intrinsics.LJFF(c0lsz.LJJIFFI, c0lsz2.LJJIFFI)) {
            StringBuilder sbLIZ26 = C2188811AlT.LIZ();
            sbLIZ26.append("quotaResult: ");
            sbLIZ26.append(c0lsz.LJJIFFI);
            sbLIZ26.append(" -> ");
            sbLIZ26.append(c0lsz2.LJJIFFI);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ26));
        }
        if (c0lsz.LJJII != c0lsz2.LJJII) {
            StringBuilder sbLIZ27 = C2188811AlT.LIZ();
            sbLIZ27.append("remainTimeStage: ");
            sbLIZ27.append(c0lsz.LJJII);
            sbLIZ27.append(" -> ");
            sbLIZ27.append(c0lsz2.LJJII);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ27));
        }
        if (!Intrinsics.LJFF(c0lsz.LJJIII, c0lsz2.LJJIII)) {
            StringBuilder sbLIZ28 = C2188811AlT.LIZ();
            sbLIZ28.append("inputCache: ");
            sbLIZ28.append(c0lsz2.LJJIII);
            c13dvLIZIZ.add(C2188811AlT.LIZIZ(sbLIZ28));
        }
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }
}
