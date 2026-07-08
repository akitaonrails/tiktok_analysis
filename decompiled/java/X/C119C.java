package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService;
import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.119C, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C119C {
    public static final C119C LIZ = new C119C();

    public static final void LIZ(Context context, LiveEventModule liveEventModule) {
        String string;
        Resources resources;
        String str;
        JSONObject jSONObject = new JSONObject();
        long j = liveEventModule.startTime;
        try {
            jSONObject.put("third_id", liveEventModule.id);
            jSONObject.put("time", j);
            jSONObject.put("add_from", 2);
            jSONObject.put("common_type", false);
            if (liveEventModule.isPaidEvent) {
                str = "paid";
            } else if (liveEventModule.LIZ()) {
                str = "free_periodic";
            } else {
                str = "free";
            }
            jSONObject.put("live_event_type", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C2276411E8h.LIZIZ.LIZIZ("anchor_business", e);
        }
        String strLJIIJJI = C2215101Bmm.LJIIJJI(j);
        if (context == null || (resources = context.getResources()) == null || (string = resources.getString(2131834256)) == null) {
            string = "LIVE Events";
        }
        int type = EnumC1430380nKG.LIVE_EVENT.getTYPE();
        String strJ3 = C786410Ut5.J3(jSONObject);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append(": ");
        sbLIZ.append(strLJIIJJI);
        C1440005kM.LIZ(new C1799610wvn(new AnchorTransData(type, strJ3, C2188811AlT.LIZIZ(sbLIZ), "", 1, liveEventModule.id, null, true, "", "", Long.MAX_VALUE, "", "", true, null, null, null, null, 0, -1, null, null)));
    }

    public static final void LIZIZ(Context context, ExtensionMisc extensionMisc, String str) {
        ILiveOuterService iLiveOuterService;
        ILiveEventOuterService iLiveEventOuterServiceK5;
        String liveEventCreateSchema;
        if (context != null && (iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)) != null && (iLiveEventOuterServiceK5 = iLiveOuterService.K5()) != null && (liveEventCreateSchema = iLiveEventOuterServiceK5.getLiveEventCreateSchema()) != null && liveEventCreateSchema.length() != 0) {
            Uri uri = UriProtector.parse(liveEventCreateSchema);
            Uri.Builder builderClearQuery = UriProtector.parse(liveEventCreateSchema).buildUpon().clearQuery();
            for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                if (!Intrinsics.LJFF(str2, "show_mask")) {
                    builderClearQuery.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
                }
            }
            iLiveOuterService.W3(context, builderClearQuery.appendQueryParameter("anchor_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()).appendQueryParameter("show_mask", "1").appendQueryParameter("mask_bg_color", "00000080").appendQueryParameter("enter_from", "video_post_page").build().toString(), new C119I(str, extensionMisc));
        }
    }
}
