package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.tiktok.location_api.service.experiment.JsbPassListFullPartialData;
import com.ss.android.ugc.tiktok.location_api.service.experiment.JsbPassListHostPathData;
import com.ss.android.ugc.tiktok.location_api.service.experiment.JsbPassListModel;
import java.util.Collections;

/* JADX INFO: renamed from: X.1AUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180141AUa {
    public static final JsbPassListModel LIZ = new JsbPassListModel(new JsbPassListFullPartialData(new JsbPassListHostPathData(C1697810uHb.LJIIJJI("lf-main-gecko-source.tiktokcdn.com", "fe_poi_ls_lynx", "fe_poi_react_lynx", "lf19-gecko-source.tiktokcdn.com", "fe_poi_creator_lynx", "fe_poi_react_lynx_od"), C1697810uHb.LJIIJJI("/obj/tiktok-teko-source-sg/8/gecko/resource/fe_poi_ls_lynx/poi_product_detail/template.js", "/poi_product_detail/template.js", "/poi_creator_center_op_detail/template.js", "/obj/byte-gurd-source-sg/8/gecko/resource/fe_poi_react_lynx/poi_creator_center_op_detail/template.js", "/obj/tiktok-teko-source-sg/8/gecko/resource/fe_poi_ls_lynx/poi_order_detail/template.js", "/poi_order_detail/template.js", "/poi_creator_center/template.js", "/poi_creator_center_marketplace_list/template.js", "/obj/byte-gurd-source-sg/8/gecko/resource/fe_poi_react_lynx_od/pray_for_geo_auth/template.js", "/pray_for_geo_auth/template.js", "/obj/tiktok-teko-source-sg/8/gecko/resource/fe_poi_ls_lynx/poi_refund_submit_outlet_select/template.js", "/poi_refund_submit_outlet_select/template.js")), new JsbPassListHostPathData(C1697810uHb.LJIIJJI("lf-main-gecko-source", "lf19-gecko-source"), C1697810uHb.LJIIJJI("/obj/tiktok-teko-source-sg/74/gecko/resource/", "/obj/tiktok-teko-source-euttp/74/gecko/resource/", "/obj/byte-gurd-source-tx/74/gecko/resource/"))), new JsbPassListFullPartialData(new JsbPassListHostPathData(Collections.singletonList("lf16-gecko-source.tiktokcdn.com"), C1697810uHb.LJIIJJI("/obj/tiktok-teko-internal-sg/tiktok/fe/live/tiktok_fe_address_map_pia/index.html", "/obj/tiktok-teko-source-sg/tiktok/fe/live/tiktok_fe_address_map_pia/index.html")), new JsbPassListHostPathData(C1697810uHb.LJIIJJI("ad-instantpage", "lf-main-gecko-source", "lf19-gecko-source", "activity-va.tiktok.com"), C1697810uHb.LJIIJJI("/instant_page/client/page/", "/obj/tiktok-teko-source-sg/74/gecko/resource/", "/obj/tiktok-teko-source-euttp/74/gecko/resource/", "/obj/byte-gurd-source-tx/74/gecko/resource/", "/magic/eco/runtime/release/", "/magic/eco/runtime/beta/"))));

    public static final JsbPassListModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        JsbPassListModel jsbPassListModel = LIZ;
        JsbPassListModel jsbPassListModel2 = (JsbPassListModel) settingsManagerLIZLLL.LJIIIIZZ("location_compliance_jsb_pass_list", JsbPassListModel.class, jsbPassListModel);
        return jsbPassListModel2 != null ? jsbPassListModel2 : jsbPassListModel;
    }
}
