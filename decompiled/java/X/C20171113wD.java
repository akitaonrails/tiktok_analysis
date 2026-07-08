package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventPrepareData;

/* JADX INFO: renamed from: X.13wD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20171113wD {
    public static final C20171113wD LIZ = new C20171113wD();

    public static void LIZ(C20170413w6 c20170413w6, StorySocialEventPrepareData storySocialEventPrepareData) {
        String flowId;
        Integer numValueOf;
        String str;
        if (!((Boolean) C304840BxC.LIZIZ.getValue()).booleanValue()) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("task_name", c20170413w6.LIZ.LIZ);
        c2344009Gk.LIZJ(storySocialEventPrepareData.getEnterEditParam().getCelebrationType(), "celebration_type");
        C20171513wH performanceMetaData = storySocialEventPrepareData.getPerformanceMetaData();
        String message = null;
        if (performanceMetaData != null) {
            flowId = performanceMetaData.getFlowId();
        } else {
            flowId = null;
        }
        c2344009Gk.LJIIIIZZ("flow_id", flowId);
        C20171513wH performanceMetaData2 = storySocialEventPrepareData.getPerformanceMetaData();
        if (performanceMetaData2 != null) {
            numValueOf = Integer.valueOf(performanceMetaData2.getSubType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "sub_type");
        c2344009Gk.LJIIIIZZ("enter_method", storySocialEventPrepareData.getEnterEditParam().getMobData().getEnterMethod());
        if (c20170413w6.LIZIZ == EnumC20169713vz.SUCCESS) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_success", str);
        c2344009Gk.LIZLLL(c20170413w6.LIZJ, "duration");
        c2344009Gk.LJ(Boolean.valueOf(c20170413w6.LJFF), "is_hit_preload");
        c2344009Gk.LIZJ(c20170413w6.LJII, "is_hit_keva_cache");
        c2344009Gk.LJ(Boolean.valueOf(c20170413w6.LJI), "is_preload");
        c2344009Gk.LJ(c20170413w6.LJ, "error_code");
        Throwable th = c20170413w6.LIZLLL;
        if (th != null) {
            message = th.getMessage();
        }
        c2344009Gk.LJIIIIZZ("error_msg", message);
        C20684815ws.LJIILLIIL("create_story_event_post_prepare_monitor", c2344009Gk.LIZ);
    }
}
