package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H8A, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H8A implements InterfaceC1891350zJl {
    public final AnonymousClass0957<Bitmap> LL;
    public final SearchKeyFramePoint LLILLJJLI;
    public boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0H8A)) {
            return false;
        }
        C0H8A c0h8a = (C0H8A) obj;
        return Intrinsics.LJFF(this.LL, c0h8a.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0h8a.LLILLJJLI) && this.LLILLL == c0h8a.LLILLL;
    }

    public final int hashCode() {
        AnonymousClass0957<Bitmap> anonymousClass0957 = this.LL;
        return ((((anonymousClass0957 == null ? 0 : anonymousClass0957.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyframeCellState(imageDeferJob=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", keyPoint=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C0H8A) || this.LLILLL != ((C0H8A) interfaceC1891350zJl).LLILLL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C0H8A) || this.LLILLJJLI.secondStart != ((C0H8A) interfaceC1891350zJl).LLILLJJLI.secondStart) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C0H8A)) {
            return null;
        }
        return Boolean.valueOf(((C0H8A) interfaceC1891350zJl).LLILLL);
    }

    public C0H8A(AnonymousClass0957<Bitmap> anonymousClass0957, SearchKeyFramePoint searchKeyFramePoint, boolean z) {
        this.LL = anonymousClass0957;
        this.LLILLJJLI = searchKeyFramePoint;
        this.LLILLL = z;
    }
}
