package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H7B, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H7B implements InterfaceC1891350zJl {
    public final String LL;
    public final MediaModel LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;
    public final boolean LLILZIL;
    public final Function1<C0H7B, Unit> LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0H7B)) {
            return false;
        }
        C0H7B c0h7b = (C0H7B) obj;
        return Intrinsics.LJFF(this.LL, c0h7b.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0h7b.LLILLJJLI) && this.LLILLL == c0h7b.LLILLL && this.LLILZ == c0h7b.LLILZ && this.LLILZIL == c0h7b.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c0h7b.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        MediaModel mediaModel = this.LLILLJJLI;
        int iHashCode2 = (((((((iHashCode + (mediaModel == null ? 0 : mediaModel.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        Function1<C0H7B, Unit> function1 = this.LLILZLL;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalServicePhotoItem(imageUrl=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", photoData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selectedIndex=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectedStrict=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", clickCallback=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String strLJFF;
        if (!(interfaceC1891350zJl instanceof C0H7B)) {
            return false;
        }
        MediaModel mediaModel = this.LLILLJJLI;
        String strLJFF2 = null;
        if (mediaModel != null) {
            strLJFF = mediaModel.LJFF();
        } else {
            strLJFF = null;
        }
        MediaModel mediaModel2 = ((C0H7B) interfaceC1891350zJl).LLILLJJLI;
        if (mediaModel2 != null) {
            strLJFF2 = mediaModel2.LJFF();
        }
        return Intrinsics.LJFF(strLJFF, strLJFF2);
    }

    public static C0H7B LIZ(C0H7B c0h7b, boolean z, int i, boolean z2) {
        String str = c0h7b.LL;
        MediaModel mediaModel = c0h7b.LLILLJJLI;
        Function1<C0H7B, Unit> function1 = c0h7b.LLILZLL;
        c0h7b.getClass();
        return new C0H7B(str, mediaModel, z, i, z2, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0H7B(String str, MediaModel mediaModel, boolean z, int i, boolean z2, Function1<? super C0H7B, Unit> function1) {
        this.LL = str;
        this.LLILLJJLI = mediaModel;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = z2;
        this.LLILZLL = function1;
    }
}
