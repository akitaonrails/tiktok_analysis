package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lWe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361180lWe implements InterfaceC1361270lWn {
    public final Aweme LL;

    @Override // X.InterfaceC1361270lWn
    public final String LJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1361270lWn
    public final User LLILLL() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1361180lWe) && Intrinsics.LJFF(this.LL, ((C1361180lWe) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.C14NM
    public final int getContentType() {
        return 50401;
    }

    @Override // X.InterfaceC1361290lWp
    public final String getType() {
        return "cell_story_reveal_promo";
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3StoryRevealPromoItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1361290lWp
    public final String getUniqueKey() {
        String aid = this.LL.getAid();
        if (aid == null) {
            aid = "";
        }
        if (aid.length() != 0) {
            return aid;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1361180lWe.class.getSimpleName());
        sbLIZ.append(System.identityHashCode(this));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0OB8
    public final Aweme getAweme() {
        return this.LL;
    }

    public C1361180lWe(Aweme aweme) {
        this.LL = aweme;
    }

    @Override // X.InterfaceC1361270lWn, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1361260lWm.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1361260lWm.LIZIZ(this, interfaceC1891350zJl);
    }
}
