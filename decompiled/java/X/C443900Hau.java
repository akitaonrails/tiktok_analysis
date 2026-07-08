package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0Hau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443900Hau extends C443910Hav {
    public StickerSetInfo LIZIZ;

    @Override // X.InterfaceC444050Hb9
    public final int LIZJ() {
        return 9;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final String getIconUrl() {
        StickerUrlStruct stickerUrlStruct;
        UrlModel urlModel;
        List<String> urlList;
        StickerSetInfo stickerSetInfo = this.LIZIZ;
        if (stickerSetInfo == null || (stickerUrlStruct = stickerSetInfo.iconUrl) == null || (urlModel = stickerUrlStruct.midResolutionUrl) == null || (urlList = urlModel.getUrlList()) == null) {
            return null;
        }
        return (String) C13LP.LJJJLZIJ(0, urlList);
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final List<C451030HmP> LIZ() {
        return C13BV.INSTANCE;
    }
}
