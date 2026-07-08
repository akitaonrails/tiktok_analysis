package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iaV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248250iaV {
    public static final C1248250iaV LIZ = new C1248250iaV();

    public static BizBaseData LIZ(ProfileComponents profileComponents) {
        try {
            return (BizBaseData) C1250210idf.LIZ(String.valueOf(profileComponents.bizData), BizBaseData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("ProfileMenuDataUtils", "parseComponentBizData error", e);
            return null;
        }
    }

    public static void LIZJ(ProfileComponents profileComponents, Context context) {
        String url;
        List<Action> list = profileComponents.actions;
        if (list != null) {
            for (Action action : list) {
                if (Intrinsics.LJFF(action.getType(), "router")) {
                    Action.RouterInfo router = action.getRouter();
                    if (router != null) {
                        url = router.getUrl();
                    } else {
                        url = null;
                    }
                    SmartRouter.buildRoute(context, url).open();
                }
            }
        }
    }

    public static Integer LIZIZ(BizBaseData bizBaseData, Context context, String str) {
        Integer iconInt$default;
        Icon icon = bizBaseData.getIcon();
        if (icon != null) {
            iconInt$default = Icon.getIconInt$default(icon, null, null, 3, null);
            if (iconInt$default == null || iconInt$default.intValue() == 0) {
            }
            return iconInt$default;
        }
        iconInt$default = null;
        Icon icon2 = bizBaseData.getIcon();
        if (icon2 != null) {
            Map<Integer, Integer> map = C1721460utk.LIZ;
            C698190Ra5 c698190Ra5LIZJ = C1721460utk.LIZJ(context, icon2.getLocalIcon(), icon2.getIconColor(), str, "ProfileMenuDataUtils");
            if (c698190Ra5LIZJ == null) {
                return null;
            }
            return Integer.valueOf(c698190Ra5LIZJ.LIZ);
        }
        return iconInt$default;
    }
}
