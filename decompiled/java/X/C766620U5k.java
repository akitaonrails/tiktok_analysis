package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766620U5k {
    public static final boolean LIZIZ(LiveEffect liveEffect, DataChannel dataChannel) {
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL;
        String str;
        if (C500260Jjc.LJJJIL(dataChannel) || (stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL()) == null || (str = stickerSDKExtraLJLJLLL.redDotKey) == null || str.length() <= 0) {
            return false;
        }
        C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC766480U4w.LJJJJZ;
        if (!c20337914i1.LIZIZ().containsKey(str)) {
            return true;
        }
        return Intrinsics.LJFF(c20337914i1.LIZIZ().get(str), Boolean.FALSE);
    }

    public static final void LIZ(long j, LiveEffect liveEffect, boolean z) {
        String name;
        String str;
        if (liveEffect == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_beauty_resource_download");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - j), "duration");
        c474500IjALIZ.LJJII(Long.valueOf(liveEffect.getEffectId()), "effect_id");
        c474500IjALIZ.LJJII(liveEffect.getResourceId(), "resource_id");
        String strLJJIJLIJ = liveEffect.LJJIJLIJ();
        if (strLJJIJLIJ == null) {
            strLJJIJLIJ = liveEffect.getName();
        }
        c474500IjALIZ.LJJII(strLJJIJLIJ, "beauty_type_name");
        if (liveEffect.LLLIIII()) {
            name = liveEffect.getName();
        } else {
            name = "";
        }
        c474500IjALIZ.LJJII(name, "beauty_type_name_tier2");
        if (z) {
            str = "done";
        } else {
            str = "failed";
        }
        c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LIZ();
    }
}
