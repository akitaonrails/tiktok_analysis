package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361220lWi extends C1361250lWl implements InterfaceC1361270lWn {
    public Aweme LLILLJJLI;
    public final String LLILLL = "cell_live";
    public final int LLILZ = 50201;

    @Override // X.InterfaceC1361270lWn
    public final String LJJIJIIJIL() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1361220lWi) && Intrinsics.LJFF(this.LLILLJJLI, ((C1361220lWi) obj).LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3LiveItem(aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1361270lWn
    public final User LLILLL() {
        return this.LLILLJJLI.getAuthor();
    }

    @Override // X.InterfaceC1361290lWp
    public final String getUniqueKey() {
        return C1361260lWm.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.model.VideoItemParams, X.C0OB8
    public final Aweme getAweme() {
        return this.LLILLJJLI;
    }

    @Override // X.C14NM
    public final int getContentType() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1361290lWp
    public final String getType() {
        return this.LLILLL;
    }

    public C1361220lWi(Aweme aweme) {
        this.LLILLJJLI = aweme;
    }

    @Override // X.InterfaceC1361270lWn, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1361260lWm.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1361260lWm.LIZIZ(this, interfaceC1891350zJl);
    }

    @Override // com.ss.android.ugc.aweme.feed.model.VideoItemParams
    public final void setAweme(Aweme aweme) {
        this.LLILLJJLI = aweme;
    }
}
