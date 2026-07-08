package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yJX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852770yJX implements InterfaceC1891350zJl {
    public final BaseImage LL;
    public final boolean LLILLJJLI;
    public final Function1<Boolean, Unit> LLILLL;

    public C1852770yJX() {
        this(null, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1852770yJX)) {
            return false;
        }
        C1852770yJX c1852770yJX = (C1852770yJX) obj;
        return Intrinsics.LJFF(this.LL, c1852770yJX.LL) && this.LLILLJJLI == c1852770yJX.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1852770yJX.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        BaseImage baseImage = this.LL;
        int iHashCode = (((baseImage == null ? 0 : baseImage.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        Function1<Boolean, Unit> function1 = this.LLILLL;
        return iHashCode + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoImageEditSelectAndPreviewSelectItem(image=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onSelected=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        if (!(interfaceC1891350zJl instanceof C1852770yJX)) {
            return false;
        }
        BaseImage baseImage = this.LL;
        String str2 = null;
        if (baseImage != null) {
            str = baseImage.uri;
        } else {
            str = null;
        }
        BaseImage baseImage2 = ((C1852770yJX) interfaceC1891350zJl).LL;
        if (baseImage2 != null) {
            str2 = baseImage2.uri;
        }
        return Intrinsics.LJFF(str, str2);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        if (interfaceC1891350zJl instanceof C1852770yJX) {
            BaseImage baseImage = this.LL;
            String str2 = null;
            if (baseImage != null) {
                str = baseImage.imageUuid;
            } else {
                str = null;
            }
            BaseImage baseImage2 = ((C1852770yJX) interfaceC1891350zJl).LL;
            if (baseImage2 != null) {
                str2 = baseImage2.imageUuid;
            }
            if (Intrinsics.LJFF(str, str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1852770yJX(BaseImage baseImage, boolean z, Function1<? super Boolean, Unit> function1) {
        this.LL = baseImage;
        this.LLILLJJLI = z;
        this.LLILLL = function1;
    }
}
