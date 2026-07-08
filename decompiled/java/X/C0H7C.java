package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H7C, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H7C implements InterfaceC1891350zJl {
    public final MediaModel LL;
    public final C0H7E LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0H7C)) {
            return false;
        }
        C0H7C c0h7c = (C0H7C) obj;
        return Intrinsics.LJFF(this.LL, c0h7c.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0h7c.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        MediaModel mediaModel = this.LL;
        int iHashCode = (mediaModel == null ? 0 : mediaModel.hashCode()) * 31;
        C0H7E c0h7e = this.LLILLJJLI;
        return iHashCode + (c0h7e != null ? c0h7e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalServiceHorizontalPhotoItem(photoData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", photoModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean zLJFF;
        if (!(interfaceC1891350zJl instanceof C0H7C)) {
            zLJFF = false;
        } else {
            zLJFF = Intrinsics.LJFF(this.LL, ((C0H7C) interfaceC1891350zJl).LL);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("areContentsTheSame: ");
        sbLIZ.append(zLJFF);
        C2188811AlT.LIZIZ(sbLIZ);
        return zLJFF;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean zLJFF;
        if (!(interfaceC1891350zJl instanceof C0H7C)) {
            zLJFF = false;
        } else {
            zLJFF = Intrinsics.LJFF(this.LL, ((C0H7C) interfaceC1891350zJl).LL);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("areItemTheSame: ");
        sbLIZ.append(zLJFF);
        C2188811AlT.LIZIZ(sbLIZ);
        return zLJFF;
    }

    public C0H7C(MediaModel mediaModel, C0H7E c0h7e) {
        this.LL = mediaModel;
        this.LLILLJJLI = c0h7e;
    }
}
