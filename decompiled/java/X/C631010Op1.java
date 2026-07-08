package X;

import com.ss.android.ugc.aweme.music.model.ArtistHonorLabel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Op1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631010Op1 implements InterfaceC1891350zJl {
    public final String LL;
    public final C630990Ooz LLILLJJLI;
    public final ArtistHonorLabel LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C631010Op1)) {
            return false;
        }
        C631010Op1 c631010Op1 = (C631010Op1) obj;
        return Intrinsics.LJFF(this.LL, c631010Op1.LL) && Intrinsics.LJFF(this.LLILLJJLI, c631010Op1.LLILLJJLI) && this.LLILLL == c631010Op1.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C630990Ooz c630990Ooz = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c630990Ooz == null ? 0 : c630990Ooz.hashCode())) * 31;
        ArtistHonorLabel artistHonorLabel = this.LLILLL;
        return iHashCode2 + (artistHonorLabel != null ? artistHonorLabel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArtistProfileUncertMusicOwnerItem(name=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", artistType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C631010Op1) {
            return Intrinsics.LJFF(((C631010Op1) interfaceC1891350zJl).LL, this.LL);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C631010Op1) {
            return Intrinsics.LJFF(((C631010Op1) interfaceC1891350zJl).LL, this.LL);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C631010Op1(String str, C630990Ooz c630990Ooz, ArtistHonorLabel artistHonorLabel) {
        this.LL = str;
        this.LLILLJJLI = c630990Ooz;
        this.LLILLL = artistHonorLabel;
    }
}
