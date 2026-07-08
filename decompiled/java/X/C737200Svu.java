package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Svu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737200Svu {
    public static final int LIZ(List<? extends Aweme> list) {
        if (list == null) {
            return -1;
        }
        int i = 0;
        for (Aweme aweme : list) {
            if (!AwemeExtKt.isTop(aweme) && !AwemeExtKt.isScheduleVideo(aweme)) {
                break;
            }
            i++;
        }
        if (C1601110rld.LIZ()) {
            for (Aweme aweme2 : list) {
                Aweme aweme3 = aweme2;
                if (aweme3.getIsTikTokStory() || aweme3.getAwemeType() == 40) {
                    if (aweme3.getUserStory() != null) {
                        if (aweme2 != null) {
                            return i + 1;
                        }
                        return i;
                    }
                }
            }
            return i;
        }
        return i;
    }

    public static final int LIZIZ(String str, List<? extends Aweme> list) {
        boolean z;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return -1;
        }
        if (str.length() == 0) {
            Iterator<? extends Aweme> it2 = list.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                PublishPreviewInfo previewData = AwemeBizExtKt.getPreviewData(it2.next());
                if (previewData != null && !previewData.inPublishing) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        Iterator<? extends Aweme> it3 = list.iterator();
        while (it3.hasNext()) {
            if (Intrinsics.LJFF(str, AwemeBizExtKt.getScheduleId(it3.next()))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
