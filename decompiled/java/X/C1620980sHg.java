package X;

import com.ss.android.ugc.aweme.series.vip.assem.SeriesVipSubscriptionFooterAssem;
import com.ss.android.ugc.aweme.series.vip.fragment.SeriesVipSubscriptionOptionsPanelFragment;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620980sHg extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1620980sHg(C0SBM c0sbm, int i) {
        super(4);
        this.$t = i;
        this.l0 = c0sbm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1620980sHg(SeriesVipSubscriptionFooterAssem seriesVipSubscriptionFooterAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = seriesVipSubscriptionFooterAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1620980sHg(SeriesVipSubscriptionOptionsPanelFragment seriesVipSubscriptionOptionsPanelFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = seriesVipSubscriptionOptionsPanelFragment;
    }

    public static final Object invoke$0(C1620980sHg c1620980sHg, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        EnumC1614900s7s enumC1614900s7s = (EnumC1614900s7s) obj3;
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        SeriesVipSubscriptionFooterAssem seriesVipSubscriptionFooterAssem = (SeriesVipSubscriptionFooterAssem) c1620980sHg.l0;
        C1614790s7h c1614790s7h = seriesVipSubscriptionFooterAssem.LLJILJIL;
        if (c1614790s7h != null) {
            seriesVipSubscriptionFooterAssem.Jo(c1614790s7h, zBooleanValue, enumC1614900s7s, zBooleanValue2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1620980sHg c1620980sHg, Object obj, Object obj2, Object obj3, Object obj4) {
        EnumC1614900s7s enumC1614900s7s;
        boolean z;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        if (obj2 == EnumC1614730s7b.AUTO_RENEW_CANCELED) {
            enumC1614900s7s = EnumC1614900s7s.REACTIVATE;
        } else {
            enumC1614900s7s = EnumC1614900s7s.CONTINUE;
        }
        if (zBooleanValue && obj4 == enumC1614900s7s) {
            z = true;
        } else {
            z = false;
        }
        C197039127h c197039127h = ((SeriesVipSubscriptionOptionsPanelFragment) c1620980sHg.l0).LLJIJIL;
        if (c197039127h != null) {
            c197039127h.setLoading(z);
        }
        C197039127h c197039127h2 = ((SeriesVipSubscriptionOptionsPanelFragment) c1620980sHg.l0).LLJIJIL;
        if (c197039127h2 != null) {
            c197039127h2.setEnabled(!z);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(C1620980sHg c1620980sHg, Object obj, Object obj2, Object obj3, Object obj4) throws JSONException {
        String str;
        String str2 = (String) obj;
        String str3 = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Map map = (Map) obj4;
        ((C0SBM) c1620980sHg.l0).getClass();
        if (str3.length() != 0 && str2.length() != 0) {
            if (zBooleanValue) {
                str = "auto_renew";
            } else {
                str = "one_time";
            }
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("creator_id", str2), new Pair("package_id", str3), new Pair("purchase_type", str), new Pair("enter_from", "subscription_surface"));
            JSONObject jSONObject = new JSONObject();
            String str4 = (String) map.get("enter_from");
            if (str4 != null && str4.length() > 0) {
                jSONObject.put("enter_from", str4);
            }
            Object obj5 = map.get("previous_page");
            if (obj5 == null) {
                obj5 = "";
            }
            jSONObject.put("previous_page", obj5);
            String str5 = (String) map.get("series_enter_entrance");
            if (str5 != null && str5.length() > 0) {
                jSONObject.put("series_enter_entrance", str5);
            }
            String strLIZ = C0SBM.LIZ(map.get("payment_type"));
            if (strLIZ != null) {
                jSONObject.put("payment_type", strLIZ);
            }
            String strLIZ2 = C0SBM.LIZ(map.get("group_id"), map.get("groupId"), map.get("collection_id"), map.get("purchase_option_group_id"));
            if (strLIZ2 != null) {
                jSONObject.put("group_id", strLIZ2);
            }
            if (jSONObject.length() > 0) {
                mapLJIIJ.put("iap_tracking_data", jSONObject);
            }
            C1200704mr.LIZ.getClass();
            C1200704mr.LIZIZ = new C1200604mq(str2, str3, C2097608Jq.LJIILIIL(mapLJIIJ, new Pair("biz_type", "subscription")));
        }
        return Unit.LIZ;
    }
}
