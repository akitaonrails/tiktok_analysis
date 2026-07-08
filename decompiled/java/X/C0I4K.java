package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I4K, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I4K extends C0I5K {
    public final UrlModel LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final C0I4N LJIJI;
    public final String LJIJJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotedPicture(photoUrlModel=");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(", photoWidth=");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append(", photoHeight=");
        sbLIZ.append(this.LJIJ);
        sbLIZ.append(", maskStyle=");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(", mediaLightenKey=");
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (this.LJIILLIIL.getUrlList().hashCode() * 31) + this.LJIJI.hashCode();
    }

    @Override // X.C0I5K
    public final String LIZ() {
        return this.LJIJJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I4K)) {
            return false;
        }
        C0I4K c0i4k = (C0I4K) obj;
        if (Intrinsics.LJFF(this.LJIILLIIL.getUrlList(), c0i4k.LJIILLIIL.getUrlList()) && this.LJIJI == c0i4k.LJIJI) {
            return true;
        }
        return false;
    }

    public C0I4K(UrlModel urlModel, int i, int i2, C0I4N c0i4n, String str) {
        C0I5E c0i5e;
        C460450I3v c460450I3v;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        C1233704sB c1233704sB = new C1233704sB(2131831882, (List<String>) null);
        C0I4N c0i4n2 = C0I4N.BLUR;
        if (c0i4n == c0i4n2) {
            c0i5e = C0I5E.EYE_SLASH;
        } else {
            c0i5e = C0I5E.NONE;
        }
        if (c0i4n == c0i4n2) {
            c460450I3v = new C460450I3v(R.raw.icon_eye_slash, Integer.valueOf(R.attr.zi));
        } else {
            c460450I3v = null;
        }
        super(urlModel, Integer.valueOf(R.drawable.c_l), null, InterfaceC1320380kSq.LJI, new AwS585S0100000_6(c0i4n, 270), false, str, c1233704sB, c0i5e, null, c460450I3v, i2, i, iLIZIZ, c0i4n != C0I4N.NONE ? Integer.valueOf(R.drawable.c_k) : null, 16932);
        this.LJIILLIIL = urlModel;
        this.LJIIZILJ = i;
        this.LJIJ = i2;
        this.LJIJI = c0i4n;
        this.LJIJJ = str;
    }
}
