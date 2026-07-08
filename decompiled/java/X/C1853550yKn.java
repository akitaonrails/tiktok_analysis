package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1853550yKn implements InterfaceC1891350zJl {
    public final TikTokMediaModel LL;
    public final int LLILLJJLI;
    public EnumC1767370w5n LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1853550yKn)) {
            return false;
        }
        C1853550yKn c1853550yKn = (C1853550yKn) obj;
        return Intrinsics.LJFF(this.LL, c1853550yKn.LL) && this.LLILLJJLI == c1853550yKn.LLILLJJLI && this.LLILLL == c1853550yKn.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoItem(tikTokMediaModel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", columns=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", radiusCorner=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1853550yKn(TikTokMediaModel tikTokMediaModel) {
        EnumC1767370w5n enumC1767370w5n = EnumC1767370w5n.NONE;
        this.LL = tikTokMediaModel;
        this.LLILLJJLI = 3;
        this.LLILLL = enumC1767370w5n;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1853550yKn)) {
            return false;
        }
        C1853550yKn c1853550yKn = (C1853550yKn) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(((MediaModel) this.LL).id, ((MediaModel) c1853550yKn.LL).id) || this.LL.selectIndex != c1853550yKn.LL.selectIndex || this.LLILLL != c1853550yKn.LLILLL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1853550yKn)) {
            return false;
        }
        return Intrinsics.LJFF(((MediaModel) this.LL).id, ((MediaModel) ((C1853550yKn) interfaceC1891350zJl).LL).id);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (!(interfaceC1891350zJl instanceof C1853550yKn)) {
            return null;
        }
        C1853550yKn c1853550yKn = (C1853550yKn) interfaceC1891350zJl;
        boolean z2 = true;
        if (this.LL.selectIndex != c1853550yKn.LL.selectIndex) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLILLL == c1853550yKn.LLILLL) {
            z2 = false;
        }
        return new C1853570yKp(z, z2);
    }
}
