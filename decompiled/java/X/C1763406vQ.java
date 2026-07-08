package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06vQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1763406vQ implements InterfaceC1891350zJl {
    public final UrlModel LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1763406vQ)) {
            return false;
        }
        C1763406vQ c1763406vQ = (C1763406vQ) obj;
        return Intrinsics.LJFF(this.LL, c1763406vQ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1763406vQ.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        UrlModel urlModel = this.LL;
        return ((urlModel == null ? 0 : urlModel.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatIntroCardData(image=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", introContent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1763406vQ(UrlModel urlModel, String str) {
        this.LL = urlModel;
        this.LLILLJJLI = str;
    }
}
