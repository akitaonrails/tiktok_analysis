package X;

import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0pUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513690pUd implements InterfaceC2179261AQq {
    public final /* synthetic */ Aweme LIZ;

    @Override // X.InterfaceC2179261AQq
    public final String getAlbumName() {
        return "";
    }

    @Override // X.InterfaceC2179261AQq
    public final long getDuration() {
        return -1L;
    }

    @Override // X.InterfaceC2179261AQq
    public final String getLocalPath() {
        return "";
    }

    @Override // X.InterfaceC2179261AQq
    public final String getPlayUrl() {
        return "";
    }

    @Override // X.InterfaceC2179261AQq
    public final String getArtistName() {
        User author = this.LIZ.getAuthor();
        if (author != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('@');
            sbLIZ.append(author.getUniqueId());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
        }
        return "";
    }

    @Override // X.InterfaceC2179261AQq
    public final String getCoverUrl() {
        UrlModel avatarMedium;
        List<String> urlList;
        String str;
        User author = this.LIZ.getAuthor();
        return (author == null || (avatarMedium = author.getAvatarMedium()) == null || (urlList = avatarMedium.getUrlList()) == null || (str = (String) C13LP.LJJJJZI(urlList)) == null) ? "" : str;
    }

    @Override // X.InterfaceC2179261AQq
    public final String getId() {
        return this.LIZ.getAid();
    }

    @Override // X.InterfaceC2179261AQq
    public final PlayModel getPlayModel() {
        return new PlayModel("", "", null);
    }

    @Override // X.InterfaceC2179261AQq
    public final String getSongName() {
        String desc = this.LIZ.getDesc();
        return desc == null ? "" : desc;
    }

    public C1513690pUd(Aweme aweme) {
        this.LIZ = aweme;
    }
}
