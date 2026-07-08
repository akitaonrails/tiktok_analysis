package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15MU, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15MU {
    public static final C15MU LIZ = new C15MU();

    public static final void LIZ(C2344009Gk c2344009Gk, String str, String str2, String str3, boolean z) {
        int i;
        if (C1355510lNV.LIZ().LIZIZ(C1398110mUD.LIZIZ)) {
            c2344009Gk.LJFF("previous_page", "push");
        }
        if (!TextUtils.isEmpty(str)) {
            c2344009Gk.LJFF("log_pb", str);
        }
        c2344009Gk.LIZJ(((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getParallelPublishTaskSize(), "publish_cnt");
        c2344009Gk.LJFF("from_inbox_page", str3);
        C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
        if ((c2277881EDy.isShowGuideCreateVideoInGuideUserUtil() || c2277881EDy.isTooltipInGuideUserUtil()) && Intrinsics.LJFF(str2, "personal_homepage")) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "with_guidence");
        c2344009Gk.LJFF("tab_name", c2277881EDy.getTabNameInGuideUserUtil());
        if (z) {
            c2344009Gk.LIZJ(1, "is_special_icon");
            String effectId = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).specialPlusService().getEffectId();
            if (!TextUtils.isEmpty(effectId)) {
                c2344009Gk.LJFF("prop_id", effectId);
                c2344009Gk.LJFF("template_id", effectId);
            }
        }
        if (C1386360mBG.LJI(str2)) {
            c2344009Gk.LJFF("play_mode", C1386360mBG.LJ());
        }
        if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).specialPlusService().isEffectVideoPlusShowed()) {
            c2344009Gk.LJFF("is_prop_plus", "1");
            c2344009Gk.LJFF("prop_selected_from", "direct_shoot");
        } else {
            c2344009Gk.LJFF("is_prop_plus", CardStruct.IStatusCode.DEFAULT);
        }
        c2344009Gk.LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
        c2344009Gk.LJFF("prop_category", "");
        C1449400now.LIZ.getClass();
        Keva keva = C1449400now.LIZJ;
        long j = keva.getLong("last_shoot_timestamp_ms", 0L);
        keva.storeLong("last_shoot_timestamp_ms", System.currentTimeMillis());
        if (j > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (jCurrentTimeMillis > 0) {
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "last_shoot_duration");
            }
        }
        ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZ(c2344009Gk.LIZ);
    }
}
