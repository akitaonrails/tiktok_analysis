package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460360I3m extends C0I5K {
    public final UrlModel LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotedVideo(videoUrlModel=");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(", videoWidth=");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append(", videoHeight=");
        sbLIZ.append(this.LJIJ);
        sbLIZ.append(", isMasked=");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(", isDynamicCard=");
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LJIJI);
        return this.LJIILLIIL.getUrlList() != null ? (iZ2 * 31) + this.LJIILLIIL.getUrlList().hashCode() : iZ2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C460360I3m)) {
            return false;
        }
        C460360I3m c460360I3m = (C460360I3m) obj;
        if (Intrinsics.LJFF(this.LJIILLIIL.getUrlList(), c460360I3m.LJIILLIIL.getUrlList()) && this.LJIJI == c460360I3m.LJIJI) {
            return true;
        }
        return false;
    }

    public C460360I3m(UrlModel urlModel, int i, int i2, boolean z, boolean z2) {
        int i3;
        C0I5E c0i5e;
        C460450I3v c460450I3v;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        if (z2) {
            i3 = 2131831889;
        } else {
            i3 = 2131831618;
        }
        C1233704sB c1233704sB = new C1233704sB(i3, (List<String>) null);
        if (z) {
            c0i5e = C0I5E.EYE_SLASH;
        } else {
            c0i5e = C0I5E.PLAY;
        }
        if (z) {
            c460450I3v = new C460450I3v(R.raw.icon_eye_slash, Integer.valueOf(R.attr.zi));
        } else {
            c460450I3v = new C460450I3v(R.raw.icon_play_fill, Integer.valueOf(R.attr.ef));
        }
        super(urlModel, Integer.valueOf(R.drawable.c_l), null, InterfaceC1320380kSq.LJI, new AwS21S0010000_6(z, 16), false, null, c1233704sB, c0i5e, null, c460450I3v, i2, i, iLIZIZ, z ? Integer.valueOf(R.drawable.c_k) : null, 16996);
        this.LJIILLIIL = urlModel;
        this.LJIIZILJ = i;
        this.LJIJ = i2;
        this.LJIJI = z;
        this.LJIJJ = z2;
    }
}
