package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.tako.detail.model.TakoKeyFramePoint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H8B, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H8B implements InterfaceC1891350zJl {
    public final AnonymousClass0957<Bitmap> LL;
    public final TakoKeyFramePoint LLILLJJLI;
    public final boolean LLILLL;

    public C0H8B() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0H8B)) {
            return false;
        }
        C0H8B c0h8b = (C0H8B) obj;
        return Intrinsics.LJFF(this.LL, c0h8b.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0h8b.LLILLJJLI) && this.LLILLL == c0h8b.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
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
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C0H8B) || this.LLILLJJLI.timestamp != ((C0H8B) interfaceC1891350zJl).LLILLJJLI.timestamp) {
            return false;
        }
        return true;
    }

    public C0H8B(AnonymousClass0957 anonymousClass0957, TakoKeyFramePoint takoKeyFramePoint) {
        this.LL = anonymousClass0957;
        this.LLILLJJLI = takoKeyFramePoint;
        this.LLILLL = false;
    }
}
