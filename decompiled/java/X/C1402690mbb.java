package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.TempPublishAnchorModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mbb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402690mbb {
    public static final List<TextStickerTextWrap> LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return new ArrayList();
        }
        List<TextStickerData> listLJI = C0F7U.LJI(videoPublishEditModel);
        ArrayList arrayList = new ArrayList();
        Iterator<TextStickerData> it2 = listLJI.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getTextWrapList(), arrayList);
        }
        return arrayList;
    }

    public static final boolean LIZIZ(BaseShortVideoContext baseShortVideoContext) {
        String str;
        if (baseShortVideoContext != null && (str = baseShortVideoContext.commerceData) != null && str.length() != 0) {
            try {
                TempPublishAnchorModel tempPublishAnchorModel = (TempPublishAnchorModel) C0CHQ.LIZ().getGson().LJII(baseShortVideoContext.commerceData, TempPublishAnchorModel.class);
                if (tempPublishAnchorModel != null && tempPublishAnchorModel.anchorBusinessType == 0 && tempPublishAnchorModel.anchorId != null && tempPublishAnchorModel.anchorContent != null) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
