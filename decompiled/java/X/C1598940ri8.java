package X;

import java.util.Calendar;
import kotlin.Pair;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0ri8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598940ri8 {
    public static final C1598940ri8 LIZ = new C1598940ri8();
    public static final C1620970sHf LIZIZ = new C1620970sHf(CoroutineExceptionHandler.LJJLIL, 1);

    public static Pair LIZ(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return new Pair(Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse r8) {
        /*
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService> r0 = com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService r0 = (com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService) r0
            boolean r0 = r0.needJumpToOnThisDayPreviewPage()
            r7 = 0
            r1 = 0
            if (r0 == 0) goto L99
            java.util.List r0 = r8.getAwemes()
            if (r0 == 0) goto L95
            java.lang.Object r2 = X.C13LP.LJJJLZIJ(r1, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
        L20:
            if (r2 == 0) goto L96
            long r5 = r2.getCreateTime()
        L26:
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r3
            kotlin.Pair r5 = LIZ(r5)
            long r3 = java.lang.System.currentTimeMillis()
            kotlin.Pair r0 = LIZ(r3)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto L94
            int r0 = r8.isPosted()
            if (r0 != 0) goto L94
            if (r2 == 0) goto L94
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isPhotoMode(r2)
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r2.getPhotoModeImageInfo()
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r2.getPhotoModeImageInfo()
            if (r0 == 0) goto L59
            java.util.List r7 = r0.getImageList()
        L59:
            boolean r0 = X.C086I.LIZIZ(r7)
            if (r0 == 0) goto L93
        L5f:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r2.getVideo()
            if (r0 == 0) goto L94
            com.ss.android.ugc.aweme.feed.model.Video r0 = r2.getVideo()
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.getPlayAddr()
            if (r0 == 0) goto L94
            com.ss.android.ugc.aweme.feed.model.Video r0 = r2.getVideo()
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.getPlayAddr()
            java.util.List r0 = r0.getUrlList()
            boolean r0 = X.C086I.LIZIZ(r0)
            if (r0 != 0) goto L94
            com.ss.android.ugc.aweme.feed.model.Video r0 = r2.getVideo()
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.getPlayAddrH264()
            java.util.List r0 = r0.getUrlList()
            boolean r0 = X.C086I.LIZIZ(r0)
            if (r0 != 0) goto L94
        L93:
            r1 = 1
        L94:
            return r1
        L95:
            r2 = r7
        L96:
            r5 = 0
            goto L26
        L99:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.getAweme()
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598940ri8.LIZIZ(com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse):boolean");
    }
}
