package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastAutoCoverLynxUrl;
import com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0TjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C754900TjM {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, r2) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(com.bytedance.android.livesdkapi.depend.model.live.LiveMode r5, webcast.api.game.CreateInfoResponse.ResponseData r6) {
        /*
            r4 = 0
            if (r5 != 0) goto L4
            return r4
        L4:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            r3 = 1
            if (r5 == r0) goto L32
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.THIRD_PARTY
            if (r5 != r0) goto L2f
            X.0Tiz r0 = X.EnumC754690Tj1.Companion
            r0.getClass()
            X.0Tj1 r0 = X.C754670Tiz.LIZ(r5)
            r2 = 0
            if (r0 == 0) goto L30
            com.bytedance.android.livesdk.model.Hashtag r0 = r0.getHashtag()
            if (r0 == 0) goto L30
            java.lang.Long r1 = r0.id
        L21:
            com.bytedance.android.livesdk.model.Hashtag r0 = X.C754700Tj2.LIZ()
            if (r0 == 0) goto L29
            java.lang.Long r2 = r0.id
        L29:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r0 != 0) goto L32
        L2f:
            return r4
        L30:
            r1 = r2
            goto L21
        L32:
            if (r6 == 0) goto L39
            boolean r0 = r6.useCustomCover
            r0 = r0 ^ 1
            return r0
        L39:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C754900TjM.LIZ(com.bytedance.android.livesdkapi.depend.model.live.LiveMode, webcast.api.game.CreateInfoResponse$ResponseData):boolean");
    }

    public static void LIZIZ(Context context, LiveMode liveMode) {
        String str;
        if (context == null) {
            return;
        }
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(BroadcastAutoCoverLynxUrl.INSTANCE.getMain());
        if (C354201Zc.LIZLLL(liveMode)) {
            str = "mobile_gaming";
        } else {
            str = "obs";
        }
        c760370TsBLIZ.LJJIFFI("live_room_mode", str);
        if (SecondPageCodeCacheABSetting.INSTANCE.isMatch()) {
            c760370TsBLIZ.LJJIFFI("enable_code_cache", "1");
        } else {
            c760370TsBLIZ.LJJIFFI("enable_code_cache", CardStruct.IStatusCode.DEFAULT);
        }
        IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
        if (iHybridContainerService != null) {
            iHybridContainerService.YC1(context, c760370TsBLIZ.LIZ().toString(), null);
        }
    }
}
