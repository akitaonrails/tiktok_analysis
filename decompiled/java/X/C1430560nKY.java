package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;

/* JADX INFO: renamed from: X.0nKY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430560nKY {
    public static AnchorTransData LIZ(CreateAnchorInfo createAnchorInfo) {
        int type = createAnchorInfo.getType();
        String content = createAnchorInfo.getContent();
        String keyword = createAnchorInfo.getKeyword();
        UrlModel urlModel = new UrlModel();
        boolean zBooleanValue = true;
        urlModel.setUrlList(C1697810uHb.LJ(createAnchorInfo.getIconUrl()));
        urlModel.setUri(Uri.decode(createAnchorInfo.getIconUrl()));
        String url = createAnchorInfo.getUrl();
        String extra = createAnchorInfo.getExtra();
        Boolean canDelete = createAnchorInfo.getCanDelete();
        if (canDelete != null) {
            zBooleanValue = canDelete.booleanValue();
        }
        return new AnchorTransData(type, content, keyword, "", 0, "", urlModel, zBooleanValue, url, "", Long.MAX_VALUE, extra, createAnchorInfo.getSubtype(), true, createAnchorInfo.getPluginInfo(), createAnchorInfo.getMinisInfos(), null, null, 0, -1, null, createAnchorInfo.getIconRawId());
    }
}
