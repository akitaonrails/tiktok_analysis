package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.config.CCAnchorLandingPageSecondOpt;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mNM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1393860mNM extends AbstractC1066890drz {
    public long LLJ;

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        C1387620mDI c1387620mDI = C1387620mDI.LIZ;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        c1387620mDI.getClass();
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("is_install_lv", C1387620mDI.LIZJ(contextLIZ)));
        return new C1400390mXt(new AwS565S0100000_21(mapLIZJ, (Map<String, String>) 1256), new AwS565S0100000_21(mapLIZJ, (Map<String, String>) 1257), new AwS422S0200000_21(this, (C1393860mNM) C2097608Jq.LJIIJ(new Pair("is_install_lv", C1387620mDI.LIZJ(C844470XAv.LIZ()))), (Map<String, String>) 82), null, null, 24);
    }

    @Override // X.InterfaceC1393560mMs
    public InterfaceC1393560mMs clone() {
        return new C1393860mNM();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public int type() {
        return EnumC1430380nKG.CAPCUT.getTYPE();
    }

    @Override // X.AbstractC1066890drz
    public final void LJJIIJ(C2344009Gk c2344009Gk) {
        LJJIJIIJI(c2344009Gk);
        super.LJJIIJ(c2344009Gk);
    }

    @Override // X.AbstractC1066890drz
    public final void LJJIIJZLJL(C2344009Gk c2344009Gk) {
        LJJIJIIJI(c2344009Gk);
        this.LLJ = System.currentTimeMillis();
        super.LJJIIJZLJL(c2344009Gk);
    }

    public final void LJJIJIIJI(C2344009Gk c2344009Gk) {
        C1387620mDI c1387620mDI = C1387620mDI.LIZ;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        c1387620mDI.getClass();
        c2344009Gk.LJFF("is_install_lv", C1387620mDI.LIZJ(contextLIZ));
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null && anchorCommonStruct.isCCTemplate()) {
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            LJIIZILJ();
            C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct2);
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) C13LP.LJJJLL(arrayList);
        if (anchorCommonStruct2 != null) {
            LJIILIIL(anchorCommonStruct2);
            list.remove(anchorCommonStruct2);
        } else {
            anchorCommonStruct2 = null;
        }
        this.LLIZ = anchorCommonStruct2;
        return EnumC1050190dR3.DONE;
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String string;
        String string2;
        String strSubType;
        Integer num;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        InterfaceC1392640mLO interfaceC1392640mLO2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        Activity activityLIZIZ = interfaceC1392640mLO.LIZIZ();
        LJJII(c2344009Gk, true, true);
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            string = anchorCommonStruct.getSchema();
        } else {
            string = null;
        }
        if (string != null) {
            Uri.Builder builderBuildUpon = UriProtector.parse(string).buildUpon();
            C1395100mPM.LIZ.getClass();
            if (C1395100mPM.LIZIZ()) {
                builderBuildUpon.appendQueryParameter("thread_strategy", "2");
            }
            CCAnchorLandingPageSecondOpt cCAnchorLandingPageSecondOptLIZ = C1395100mPM.LIZ();
            if (cCAnchorLandingPageSecondOptLIZ != null && (num = cCAnchorLandingPageSecondOptLIZ.multiRate) != null && num.intValue() == 1) {
                builderBuildUpon.appendQueryParameter("video_level", String.valueOf(C1395170mPT.LIZ()));
            }
            string = builderBuildUpon.toString();
        }
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 != null) {
            String str = "";
            if (string == null) {
                string2 = "";
            } else {
                Uri.Builder builderAppendQueryParameter = UriProtector.parse(string).buildUpon().appendQueryParameter("entrance_from", LJIJJLI());
                if (LJIIZILJ() != null && LJIIZILJ().getCcTemplateInfo() != null && LJIIZILJ().getCcTemplateInfo().isMatchThePolicy()) {
                    builderAppendQueryParameter.appendQueryParameter("music_copyright", LJIIZILJ().getCcTemplateInfo().getMusicCopyrightStr());
                }
                string2 = builderAppendQueryParameter.build().toString();
            }
            AnchorCommonStruct anchorCommonStruct3 = this.LLIZ;
            if (anchorCommonStruct3 != null && anchorCommonStruct3.isCCTemplate()) {
                Uri uri = UriProtector.parse(string2);
                try {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "server_common_log");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } else {
                        JSONObject jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        jSONObject.put("tt_template_type", anchorCommonStruct3.subType());
                        jSONObject.put("tt_template_id", anchorCommonStruct3.getId());
                        string2 = C011J.LIZ(uri, "server_common_log", C786410Ut5.J3(jSONObject)).toString();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZIZ, string2);
            smartRouteBuildRoute.withParam("anchor_event_map", (HashMap) LJIJ(c2344009Gk));
            smartRouteBuildRoute.withParam(C2429209fW.LIZ().appendDataFlowId(new Bundle(), "402673664"));
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
            if (interfaceC1392640mLO3 == null) {
                interfaceC1392640mLO3 = null;
            }
            String authorUid = AwemeExtKt.getAuthorUid(interfaceC1392640mLO3.LJJLIIIJJIZ());
            if (authorUid == null) {
                authorUid = "";
            }
            smartRouteBuildRoute.withParam("author_id", authorUid);
            InterfaceC1392640mLO interfaceC1392640mLO4 = this.LL;
            if (interfaceC1392640mLO4 == null) {
                interfaceC1392640mLO4 = null;
            }
            String aid = interfaceC1392640mLO4.LJJLIIIJJIZ().getAid();
            if (aid == null) {
                aid = "";
            }
            smartRouteBuildRoute.withParam("group_id", aid);
            smartRouteBuildRoute.withParam("anchor_id", anchorCommonStruct2.getId());
            smartRouteBuildRoute.withParam("enter_from", LJIJJLI());
            InterfaceC1392640mLO interfaceC1392640mLO5 = this.LL;
            if (interfaceC1392640mLO5 != null) {
                interfaceC1392640mLO2 = interfaceC1392640mLO5;
            }
            String aid2 = interfaceC1392640mLO2.LJJLIIIJJIZ().getAid();
            if (aid2 == null) {
                aid2 = "";
            }
            smartRouteBuildRoute.withParam("from_group_id", aid2);
            smartRouteBuildRoute.withParam("previous_page", LJIJJLI());
            smartRouteBuildRoute.withParam("detail_aweme_from", LJIJJLI());
            AnchorCommonStruct anchorCommonStruct4 = this.LLIZ;
            if (anchorCommonStruct4 != null && C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1430380nKG.CAPCUT.getTYPE()), Integer.valueOf(EnumC1430380nKG.VIA_MAKER.getTYPE())).contains(Integer.valueOf(anchorCommonStruct4.getType()))) {
                n nVar = new n();
                for (Map.Entry entry : ((LinkedHashMap) C1197304mJ.LIZ()).entrySet()) {
                    nVar.LJJIIJ((String) entry.getKey(), (String) entry.getValue());
                }
                smartRouteBuildRoute.withParam("jump_capcut_params", C1741890vQh.LJIIIIZZ(nVar));
            }
            AnchorCommonStruct anchorCommonStruct5 = this.LLIZ;
            if (anchorCommonStruct5 != null && (strSubType = anchorCommonStruct5.subType()) != null) {
                str = strSubType;
            }
            smartRouteBuildRoute.withParam("anchor_subtype", str);
            smartRouteBuildRoute.withParam("anchor_click_time", SystemClock.elapsedRealtime());
            smartRouteBuildRoute.open();
        }
    }

    @Override // X.AbstractC1066890drz
    public final void LJJII(C2344009Gk c2344009Gk, boolean z, boolean z2) {
        LJJIJIIJI(c2344009Gk);
        if (this.LLJ > 0) {
            c2344009Gk.LJFF("duration", String.valueOf(System.currentTimeMillis() - this.LLJ));
        }
        super.LJJII(c2344009Gk, z, z2);
    }
}
