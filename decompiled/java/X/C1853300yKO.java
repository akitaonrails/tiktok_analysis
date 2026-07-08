package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yKO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1853300yKO implements InterfaceC1891350zJl {
    public final TikTokMediaModel LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1853300yKO)) {
            return false;
        }
        C1853300yKO c1853300yKO = (C1853300yKO) obj;
        return Intrinsics.LJFF(this.LL, c1853300yKO.LL) && this.LLILLJJLI == c1853300yKO.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectedItem(tikTokMediaModel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isPreviewSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1853300yKO) {
            C1853300yKO c1853300yKO = (C1853300yKO) interfaceC1891350zJl;
            if (c1853300yKO.LLILLJJLI == this.LLILLJJLI && c1853300yKO.LL.selectIndex == this.LL.selectIndex) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1853300yKO) && Intrinsics.LJFF(((MediaModel) ((C1853300yKO) interfaceC1891350zJl).LL).id, ((MediaModel) this.LL).id)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (!(interfaceC1891350zJl instanceof C1853300yKO)) {
            return null;
        }
        C1853300yKO c1853300yKO = (C1853300yKO) interfaceC1891350zJl;
        boolean z2 = true;
        if (this.LLILLJJLI != c1853300yKO.LLILLJJLI) {
            z = true;
        } else {
            z = false;
        }
        if (this.LL.selectIndex == c1853300yKO.LL.selectIndex) {
            z2 = false;
        }
        return new C1853310yKP(z, z2);
    }

    public C1853300yKO(TikTokMediaModel tikTokMediaModel, boolean z) {
        this.LL = tikTokMediaModel;
        this.LLILLJJLI = z;
    }
}
