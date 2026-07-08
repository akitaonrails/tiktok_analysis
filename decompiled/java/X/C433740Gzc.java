package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gzc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C433740Gzc implements InterfaceC1891350zJl {
    public final String LL;
    public final List<MediaModel> LLILLJJLI;
    public final Function1<C433740Gzc, Unit> LLILLL;
    public final boolean LLILZ;

    public C433740Gzc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C433740Gzc)) {
            return false;
        }
        C433740Gzc c433740Gzc = (C433740Gzc) obj;
        return Intrinsics.LJFF(this.LL, c433740Gzc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c433740Gzc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c433740Gzc.LLILLL) && this.LLILZ == c433740Gzc.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        Function1<C433740Gzc, Unit> function1 = this.LLILLL;
        return ((iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalServiceAlbumItem(albumName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mediaModels=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", clickCallback=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isRecentsAlbum=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C433740Gzc)) {
            return false;
        }
        C433740Gzc c433740Gzc = (C433740Gzc) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL, c433740Gzc.LL) || !Intrinsics.LJFF(C13LP.LJJJLL(this.LLILLJJLI), C13LP.LJJJLL(c433740Gzc.LLILLJJLI)) || this.LLILLJJLI.size() != c433740Gzc.LLILLJJLI.size()) {
            return false;
        }
        return true;
    }

    public C433740Gzc(String str, List list, boolean z, int i) {
        z = (i & 8) != 0 ? false : z;
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = null;
        this.LLILZ = z;
    }
}
