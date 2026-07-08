package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I51, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I51 extends C0I5J {
    public final UrlModel LJIILIIL;
    public final boolean LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotedGif(gifUrlModel=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", isAnimated=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", gifHeight=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(", gifWidth=");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(", isUseLastFrame=");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append(", isReverse=");
        sbLIZ.append(this.LJIJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LJIILIIL.getUrlList().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I51)) {
            return super.equals(obj);
        }
        return Intrinsics.LJFF(this.LJIILIIL.getUrlList(), ((C0I51) obj).LJIILIIL.getUrlList());
    }

    public C0I51(UrlModel urlModel, boolean z, int i, int i2, boolean z2, boolean z3) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C1233704sB c1233704sB = new C1233704sB(2131831887, (List<String>) null);
        C0I5E c0i5e = C0I5E.NONE;
        super(urlModel, Integer.valueOf(R.drawable.c_l), InterfaceC1320380kSq.LIZ, new C0I65(i, i2, z, z2), c1233704sB, c0i5e, i, i2, iLIZIZ, z3);
        this.LJIILIIL = urlModel;
        this.LJIILJJIL = z;
        this.LJIILL = i;
        this.LJIILLIIL = i2;
        this.LJIIZILJ = z2;
        this.LJIJ = z3;
    }
}
