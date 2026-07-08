package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yJC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852560yJC implements InterfaceC1891350zJl {
    public final BaseImage LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1852560yJC)) {
            return false;
        }
        C1852560yJC c1852560yJC = (C1852560yJC) obj;
        return Intrinsics.LJFF(this.LL, c1852560yJC.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1852560yJC.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoPhotoDisplayItem(image=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mediaModelId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1852560yJC) {
            C1852560yJC c1852560yJC = (C1852560yJC) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1852560yJC.LL.uri, this.LL.uri)) {
                BaseImage baseImage = c1852560yJC.LL;
                int i = baseImage.width;
                BaseImage baseImage2 = this.LL;
                if (i == baseImage2.width && baseImage.height == baseImage2.height) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1852560yJC) && Intrinsics.LJFF(((C1852560yJC) interfaceC1891350zJl).LL.uri, this.LL.uri)) {
            return true;
        }
        return false;
    }

    public C1852560yJC(BaseImage baseImage, String str) {
        this.LL = baseImage;
        this.LLILLJJLI = str;
    }
}
