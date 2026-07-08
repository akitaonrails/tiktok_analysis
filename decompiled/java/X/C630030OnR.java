package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0OnR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630030OnR {
    public static final boolean LIZ(Context context, Aweme aweme, String str) {
        if (C1017070cZd.LJJLIL(aweme)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
            c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
            C20684815ws.LJIILLIIL("dou_promote_layer_show", c2344009Gk.LIZ);
            C1233040iBy c1233040iBy = new C1233040iBy(context);
            c1233040iBy.LIZIZ(2131824739);
            c1233040iBy.LIZLLL();
            return false;
        }
        return true;
    }

    public static void LIZIZ(Bundle bundle, String str, List list) {
        UrlModel cover;
        ImageInfo imageInfo;
        UrlModel labelThumb;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme = (Aweme) it2.next();
                if (aweme.getAwemeType() == 2) {
                    List<ImageInfo> imageInfos = aweme.getImageInfos();
                    if (imageInfos != null && (imageInfo = (ImageInfo) C13LP.LJJJLL(imageInfos)) != null && (labelThumb = imageInfo.getLabelThumb()) != null) {
                        arrayList.add(labelThumb);
                    }
                } else {
                    Video video = aweme.getVideo();
                    if (video != null && (cover = video.getCover()) != null) {
                        arrayList.add(cover);
                    }
                }
                i++;
                if (i >= 3) {
                    break;
                }
            }
            if (arrayList.size() >= 3) {
                C786410Ut5.LJJJI(str, JsonParseUtils.LJ(arrayList), bundle);
            }
        }
    }
}
