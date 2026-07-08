package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406540mho implements InterfaceC1406670mi1 {
    public final Video LL;
    public final boolean LLILLJJLI;
    public final int LLILLL = EnumC1752690vi7.DESCRIPTION.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406540mho)) {
            return false;
        }
        C1406540mho c1406540mho = (C1406540mho) obj;
        return Intrinsics.LJFF(this.LL, c1406540mho.LL) && this.LLILLJJLI == c1406540mho.LLILLJJLI;
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaProductVideoVO(video=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showViewMore=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    public C1406540mho(Video video, boolean z) {
        this.LL = video;
        this.LLILLJJLI = z;
    }
}
