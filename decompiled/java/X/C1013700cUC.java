package X;

import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.measurement.exception.ICommerceExceptionService;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: renamed from: X.0cUC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013700cUC {
    public static final C1013700cUC LIZ = new C1013700cUC();

    public static final AnoleComponentModel LIZ(AbstractC1000340c8e abstractC1000340c8e, Map<String, AnoleComponentModel> map) {
        if (!(abstractC1000340c8e instanceof C1000350c8f) || map == null) {
            return null;
        }
        return map.get(abstractC1000340c8e.LIZIZ);
    }

    public static final void LIZIZ(ViewGroup viewGroup, Aweme aweme, String str) {
        ICommerceExceptionService iCommerceExceptionService;
        Integer numValueOf;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        try {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("disable_commerce_feed_mount_slardar_exception", true) && viewGroup != null && viewGroup.getChildCount() > 0 && (iCommerceExceptionService = (ICommerceExceptionService) PluggableExtentionKt.pluggableSpi$default(ICommerceExceptionService.class, false, false, false, 14, null)) != null) {
                Pair[] pairArr = new Pair[5];
                String creativeIdStr = null;
                if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                    numValueOf = Integer.valueOf(awemeRawAd2.getRit());
                } else {
                    numValueOf = null;
                }
                pairArr[0] = new Pair("rit", numValueOf);
                if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                    creativeIdStr = awemeRawAd.getCreativeIdStr();
                }
                pairArr[1] = new Pair("creative_id", creativeIdStr);
                pairArr[2] = new Pair("slot_id", str);
                pairArr[3] = new Pair("slot_child_num", String.valueOf(viewGroup.getChildCount()));
                pairArr[4] = new Pair("slot_child_view_names", C09RB.LJIILLIIL(new C09RD(viewGroup), null, null, null, AFwS252S0000000_16.get$arr$(4), 31));
                Map<String, ? extends Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                C1013720cUE c1013720cUE = new C1013720cUE("anole_slot_mount_error", false, "anole_slot_mount_error");
                c1013720cUE.LJ = "anole_slot_mount";
                c1013720cUE.LJFF = str;
                c1013720cUE.LJI = mapLJIIIIZZ;
                iCommerceExceptionService.LIZ(c1013720cUE, aweme);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
