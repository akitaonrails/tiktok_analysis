package X;

import Y.ARunnableS76S0200000_7;
import android.content.Context;
import android.os.Handler;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: renamed from: X.0Kbu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520960Kbu extends C521160KcE implements InterfaceC1110900f0y {
    public final BadgeStruct LJIJJ;

    @Override // X.InterfaceC1110900f0y
    public final BadgeStruct LIZIZ() {
        return this.LJIJJ;
    }

    @Override // X.C521160KcE
    public final void LJI(C521100Kc8 c521100Kc8) {
        int i;
        BadgeStruct badgeStruct = this.LJIJJ;
        if (badgeStruct != null && badgeStruct.badgeScene == 8) {
            if (c521100Kc8 != null) {
                i = c521100Kc8.LJIILJJIL;
            } else {
                i = -1;
            }
            LJIIJ(i, false);
        }
    }

    @Override // X.C521160KcE
    public final void LJII(C521100Kc8 c521100Kc8) {
        int i;
        BadgeStruct badgeStruct = this.LJIJJ;
        if (badgeStruct != null && badgeStruct.badgeScene == 8) {
            if (c521100Kc8 != null) {
                i = c521100Kc8.LJIILJJIL;
            } else {
                i = -1;
            }
            LJIIJ(i, true);
        }
    }

    public final void LJIIJ(int i, boolean z) {
        String str;
        List urls;
        Object objLJJJLZIJ;
        Object obj = "";
        if (i != 1) {
            if (i != 6) {
                str = "";
            } else {
                str = "user_level_avatar";
            }
        } else {
            str = "user_level_badge";
        }
        ImageModel imageModel = this.LJI.LIZ;
        if (imageModel != null && (urls = imageModel.getUrls()) != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, urls)) != null) {
            obj = objLJJJLZIJ;
        }
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_user_level_badge_load_result", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_1000()));
        c474500IjALIZIZ.LJJII(Integer.valueOf(z ? 1 : 0), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZIZ.LJJII(obj, "uri");
        c474500IjALIZIZ.LJJII(str, Scene.SCENE_SERVICE);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LIZ();
        } else {
            c474500IjALIZIZ.LJJIJLIJ();
            c474500IjALIZIZ.LJIIIIZZ();
            c474500IjALIZIZ.LJJIJL();
        }
    }

    public C520960Kbu(int i, Handler handler, C520970Kbv c520970Kbv, BadgeStruct badgeStruct, Context context, C521100Kc8 c521100Kc8, C521150KcD c521150KcD, ARunnableS76S0200000_7 aRunnableS76S0200000_7) {
        super(i, handler, c520970Kbv, context, c521100Kc8, c521150KcD, aRunnableS76S0200000_7);
        this.LJIJJ = badgeStruct;
    }
}
