package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveAvatarEntranceUnifySetting;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811310xEf {
    public static boolean LIZ;
    public static String LIZIZ;

    public static final String LIZ() {
        if (LIZIZ == null) {
            LIZIZ = (LiveAvatarEntranceUnifySetting.getValue() || ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).oI0()) ? C1143780fs0.LJIIJ("tiktok_live_watch_resource_normal_1", "live_skylight_icon_anim_small_size.webp") : C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_item_rank_top_on_going_hd.webp");
        }
        return LIZIZ;
    }

    public static final void LIZIZ() {
        if (LIZ) {
            return;
        }
        LIZ = true;
        C485880J3q.LIZ.getClass();
        C485880J3q.LJFF(C1811180xES.class, R.layout.gr5, 1, 1);
        C485880J3q.LJFF(C1810790xDp.class, R.layout.gr4, 7, 7);
    }
}
