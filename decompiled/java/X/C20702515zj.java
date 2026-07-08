package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15zj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20702515zj {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(Aweme aweme) {
        return C0SCU.LIZ().LLFFF(aweme, false);
    }

    public static final CaptionItemModel LIZLLL(Aweme aweme) {
        return LIZJ(aweme, C161N.LIZIZ.LLIIZ());
    }

    public static final boolean LIZ(Aweme aweme, String[] strArr) {
        Video video;
        CaptionModel captionModel;
        CaptionLanguage captionLanguage;
        String str;
        if (aweme != null && (video = aweme.getVideo()) != null && (captionModel = video.getCaptionModel()) != null && (captionLanguage = captionModel.originalCaptionLanguage) != null && (str = captionLanguage.languageCode) != null) {
            if (strArr == null) {
                strArr = C0SCU.LIZ().LL();
            }
            return C13LQ.LJIILLIIL(str, strArr);
        }
        return false;
    }

    public static final CaptionItemModel LIZJ(Aweme aweme, String str) {
        String str2;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> list;
        Video video2;
        CaptionModel captionModel2;
        CaptionLanguage captionLanguage;
        CaptionItemModel captionItemModel = null;
        if (aweme != null && (video2 = aweme.getVideo()) != null && (captionModel2 = video2.getCaptionModel()) != null && (captionLanguage = captionModel2.originalCaptionLanguage) != null) {
            str2 = captionLanguage.languageCode;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, str) || aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (list = captionModel.captionList) == null) {
            return null;
        }
        Iterator<CaptionItemModel> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            CaptionItemModel next = it2.next();
            if (Intrinsics.LJFF(str, next.languageCode)) {
                captionItemModel = next;
                break;
            }
        }
        return captionItemModel;
    }
}
