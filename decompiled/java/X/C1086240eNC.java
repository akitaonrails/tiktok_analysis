package X;

import com.bytedance.android.livesdk.livesetting.rank.AudienceListPromoteAwarenessTypeSetting;

/* JADX INFO: renamed from: X.0eNC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086240eNC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, boolean z) {
        Object obj;
        int i;
        AudienceListPromoteAwarenessTypeSetting audienceListPromoteAwarenessTypeSetting = AudienceListPromoteAwarenessTypeSetting.INSTANCE;
        boolean zEnablePromote = audienceListPromoteAwarenessTypeSetting.enablePromote();
        boolean zEnableCoolDown = audienceListPromoteAwarenessTypeSetting.enableCoolDown();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_liveroom_audience_number_click");
        c474500IjALIZ.LJIL();
        if (!zEnablePromote) {
            obj = null;
        } else if (zEnableCoolDown) {
            obj = "periodic";
        } else {
            obj = "permanent";
        }
        c474500IjALIZ.LJJII(obj, "effect_show_strategy");
        c474500IjALIZ.LJJII(Integer.valueOf(C1086280eNG.LIZIZ.LJI ? 1 : 0), "is_flare_trigger");
        c474500IjALIZ.LJJII(Integer.valueOf(C1086280eNG.LIZIZ() ? 1 : 0), "is_promote");
        c474500IjALIZ.LJJII(str, "user_type");
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_promote_effect_show");
        c474500IjALIZ.LIZ();
    }
}
