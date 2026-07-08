package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1340400kz8 extends AbstractC1049450dPr {
    public final Comment LLILLJJLI;
    public final C1340410kz9 LLILLL;
    public C1340420kzA LLILZ;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseCommentItem(comment=");
        sbLIZ.append(LIZ());
        sbLIZ.append(", commentUIState=");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(", extraData=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1049450dPr
    public Comment LIZ() {
        return this.LLILLJJLI;
    }

    public C1340410kz9 LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1049450dPr, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1340400kz8)) {
            return false;
        }
        C1340400kz8 c1340400kz8 = (C1340400kz8) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c1340400kz8.LIZIZ().LIZ, LIZIZ().LIZ) || c1340400kz8.LIZIZ().LIZIZ != LIZIZ().LIZIZ || c1340400kz8.LIZIZ().LIZJ != LIZIZ().LIZJ || c1340400kz8.LIZIZ().LIZLLL != LIZIZ().LIZLLL || !Intrinsics.LJFF(c1340400kz8.LIZIZ().LJ, LIZIZ().LJ) || c1340400kz8.LIZIZ().LJII != LIZIZ().LJII || !Intrinsics.LJFF(c1340400kz8.LIZIZ().LJIIIIZZ, LIZIZ().LJIIIIZZ) || c1340400kz8.LIZIZ().LJIIIZ != LIZIZ().LJIIIZ || c1340400kz8.LIZIZ().LJIIJ != LIZIZ().LJIIJ || c1340400kz8.LIZIZ().LJIIJJI != LIZIZ().LJIIJJI || !Intrinsics.LJFF(c1340400kz8.LIZIZ().LJIIL, LIZIZ().LJIIL) || !Intrinsics.LJFF(c1340400kz8.LIZIZ().LJIILIIL, LIZIZ().LJIILIIL) || c1340400kz8.LIZIZ().LJIILJJIL != LIZIZ().LJIILJJIL || c1340400kz8.LIZIZ().LJIILL != LIZIZ().LJIILL || !Intrinsics.LJFF(c1340400kz8.LIZIZ().LJIILLIIL, LIZIZ().LJIILLIIL) || c1340400kz8.LIZIZ().LJIJ != LIZIZ().LJIJ || c1340400kz8.LIZIZ().LJIJI != LIZIZ().LJIJI || c1340400kz8.LIZIZ().LJIJI || LIZIZ().LJIJI || !Intrinsics.LJFF(c1340400kz8.LIZIZ().LJIJJLI, LIZIZ().LJIJJLI) || !Intrinsics.LJFF(c1340400kz8.LIZIZ().LJIL, LIZIZ().LJIL) || c1340400kz8.LIZIZ().LJJ != LIZIZ().LJJ) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1049450dPr, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1340400kz8)) {
            return false;
        }
        if (C703302op.LIZ(LIZ().getFakeId())) {
            AbstractC1049450dPr abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl;
            if (C703302op.LIZ(abstractC1049450dPr.LIZ().getFakeId())) {
                LIZ().hashCode();
                return Intrinsics.LJFF(abstractC1049450dPr.LIZ().getFakeId(), LIZ().getFakeId());
            }
        }
        return Intrinsics.LJFF(((AbstractC1049450dPr) interfaceC1891350zJl).LIZ().getCid(), LIZ().getCid());
    }

    @Override // X.AbstractC1049450dPr, X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (!(interfaceC1891350zJl instanceof C1340400kz8)) {
            return null;
        }
        C1340400kz8 c1340400kz8 = (C1340400kz8) interfaceC1891350zJl;
        boolean z15 = true;
        boolean z16 = !Intrinsics.LJFF(c1340400kz8.LIZIZ().LJ, LIZIZ().LJ);
        boolean z17 = !Intrinsics.LJFF(c1340400kz8.LIZIZ().LIZ, LIZIZ().LIZ);
        if (c1340400kz8.LIZIZ().LIZIZ == LIZIZ().LIZIZ && !z16) {
            z = false;
        } else {
            z = true;
        }
        if (c1340400kz8.LIZIZ().LIZJ != LIZIZ().LIZJ || z16 || ((c1340400kz8.LIZIZ().LIZJ || LIZIZ().LIZJ) && C07CD.LIZ())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c1340400kz8.LIZIZ().LIZLLL != LIZIZ().LIZLLL) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z18 = !Intrinsics.LJFF(c1340400kz8.LIZIZ().LJ, LIZIZ().LJ);
        if (c1340400kz8.LIZIZ().LJII != LIZIZ().LJII) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z19 = !Intrinsics.LJFF(c1340400kz8.LIZIZ().LJIIIIZZ, LIZIZ().LJIIIIZZ);
        if (c1340400kz8.LIZIZ().LJIIIZ != LIZIZ().LJIIIZ) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (c1340400kz8.LIZIZ().LJIIJ != LIZIZ().LJIIJ) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (c1340400kz8.LIZIZ().LJIIJJI == LIZIZ().LJIIJJI && !z16) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (Intrinsics.LJFF(c1340400kz8.LIZIZ().LJIIL, LIZIZ().LJIIL) && Intrinsics.LJFF(c1340400kz8.LIZIZ().LJIILIIL, LIZIZ().LJIILIIL)) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (c1340400kz8.LIZIZ().LJIILJJIL != LIZIZ().LJIILJJIL) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (c1340400kz8.LIZIZ().LJIILL == LIZIZ().LJIILL) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z20 = !z10;
        boolean z21 = !Intrinsics.LJFF(c1340400kz8.LIZIZ().LJIILLIIL, LIZIZ().LJIILLIIL);
        if (c1340400kz8.LIZIZ().LJIIZILJ != LIZIZ().LJIIZILJ) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c1340400kz8.LIZIZ().LJIJ != LIZIZ().LJIJ) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c1340400kz8.LIZIZ().LJIJI == LIZIZ().LJIJI && !c1340400kz8.LIZIZ().LJIJI && !LIZIZ().LJIJI) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (c1340400kz8.LIZIZ().LJIJJ != LIZIZ().LJIJJ) {
            z14 = true;
        } else {
            z14 = false;
        }
        boolean z22 = !Intrinsics.LJFF(c1340400kz8.LIZIZ().LJIJJLI, LIZIZ().LJIJJLI);
        boolean z23 = !Intrinsics.LJFF(c1340400kz8.LIZIZ().LJIL, LIZIZ().LJIL);
        if (c1340400kz8.LIZIZ().LJJ == LIZIZ().LJJ) {
            z15 = false;
        }
        return new C1339470kxd(z17, z, z2, z3, z18, z4, z19, z5, z6, z7, z8, z9, z20, z21, z11, z12, z13, z14, z22, z23, z15);
    }

    public C1340400kz8(Comment comment, C1340410kz9 c1340410kz9) {
        C1340420kzA c1340420kzA = new C1340420kzA();
        super(comment);
        this.LLILLJJLI = comment;
        this.LLILLL = c1340410kz9;
        this.LLILZ = c1340420kzA;
    }
}
