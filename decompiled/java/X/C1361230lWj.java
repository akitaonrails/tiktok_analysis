package X;

import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361230lWj extends C1361250lWl implements InterfaceC1357880lRK {
    public final FriendsV3RepostModel LLILLJJLI;
    public final C1357800lRC LLILLL;
    public final String LLILZ;
    public final int LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1361230lWj)) {
            return false;
        }
        C1361230lWj c1361230lWj = (C1361230lWj) obj;
        return Intrinsics.LJFF(this.LLILLJJLI, c1361230lWj.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1361230lWj.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LLILLJJLI.hashCode() * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3RepostPhotoItem(repostModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", commentModel=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1361270lWn
    public final String LJJIJIIJIL() {
        return LLD().repostText;
    }

    @Override // X.InterfaceC1361270lWn
    public final User LLILLL() {
        return LLD().reposter;
    }

    @Override // X.InterfaceC1357880lRK, X.InterfaceC1361290lWp
    public final String getUniqueKey() {
        String str = LLD().repostId;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC1357880lRK
    public final C1357800lRC LJLJL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1357880lRK
    public final FriendsV3RepostModel LLD() {
        return this.LLILLJJLI;
    }

    @Override // X.C14NM
    public final int getContentType() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1361290lWp
    public final String getType() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1361270lWn, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1357890lRL.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1361260lWm.LIZIZ(this, interfaceC1891350zJl);
    }

    public C1361230lWj(FriendsV3RepostModel friendsV3RepostModel, C1357800lRC c1357800lRC) {
        String str;
        this.LLILLJJLI = friendsV3RepostModel;
        this.LLILLL = c1357800lRC;
        if (C1206304nl.LIZ()) {
            str = "cell_repost_card_photo";
        } else if (C1206404nm.LIZ()) {
            str = "cell_repost_photo";
        } else {
            str = "cell_photo";
        }
        this.LLILZ = str;
        this.LLILZIL = 50102;
    }
}
