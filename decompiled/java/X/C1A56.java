package X;

import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.live.RelatedLiveTagStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.panel.live.RelatedTag;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1A56, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A56 {
    public static RelatedTag LIZ(RelatedLiveTagStruct relatedLiveTagStruct) {
        String str;
        if (relatedLiveTagStruct == null || (str = relatedLiveTagStruct.relatedTag) == null || str.length() == 0) {
            return null;
        }
        try {
            C1227904rF.LIZ.getClass();
            return (RelatedTag) C1227904rF.LIZIZ(str, RelatedTag.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C589080N8o.LIZLLL(C20267014Rw.LIZ, "GameLiveBottomBarAssemTest", new AwS577S0100000_33(e, 3641));
            return null;
        }
    }

    public static boolean LIZIZ(View view) {
        FeedBottomBannerView feedBottomBannerView;
        Layout layout;
        if (view != null && (feedBottomBannerView = (FeedBottomBannerView) view.findViewById(R.id.tr7)) != null && (layout = feedBottomBannerView.LLIZLLLIL.getLayout()) != null) {
            Iterable iterableLJIILJJIL = C13LZ.LJIILJJIL(0, feedBottomBannerView.LLIZLLLIL.getLineCount());
            if (!(iterableLJIILJJIL instanceof Collection) || !((Collection) iterableLJIILJJIL).isEmpty()) {
                C531650Kt9 it2 = iterableLJIILJJIL.iterator();
                while (it2.LLILLL) {
                    if (layout.getEllipsisCount(it2.nextInt()) > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean LJ(VideoItemParams videoItemParams) {
        boolean z;
        String str;
        String str2;
        if (!C1163550gNt.LIZ()) {
            return false;
        }
        User author = videoItemParams.getAweme().getAuthor();
        String str3 = null;
        if (author != null && Long.valueOf(author.roomId) != null && videoItemParams.getAweme().getAuthor().roomId > 0) {
            z = true;
        } else {
            z = false;
        }
        RelatedLiveTagStruct relatedLiveTag = videoItemParams.getAweme().getRelatedLiveTag();
        if (relatedLiveTag != null) {
            str = relatedLiveTag.relatedTag;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (relatedLiveTag != null) {
            str2 = relatedLiveTag.content;
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2) || z) {
            return false;
        }
        if (relatedLiveTag != null) {
            str3 = relatedLiveTag.tagName;
        }
        if (TextUtils.isEmpty(str3)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.lang.String r9, com.ss.android.ugc.aweme.feed.model.VideoItemParams r10, boolean r11, boolean r12, long r13) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A56.LIZLLL(java.lang.String, com.ss.android.ugc.aweme.feed.model.VideoItemParams, boolean, boolean, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.09Gk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams r16, com.ss.android.ugc.aweme.feed.model.live.RelatedLiveTagStruct r17, boolean r18, boolean r19, boolean r20, long r21, long r23, boolean r25, java.lang.String r26, int r27) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A56.LIZJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams, com.ss.android.ugc.aweme.feed.model.live.RelatedLiveTagStruct, boolean, boolean, boolean, long, long, boolean, java.lang.String, int):void");
    }
}
