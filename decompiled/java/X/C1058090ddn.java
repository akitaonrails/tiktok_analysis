package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ddn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058090ddn extends AbstractC1066890drz {
    public C2344009Gk LLJ;

    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "app_page";
    }

    @Override // X.AbstractC1066890drz
    public final boolean LJIJI() {
        return true;
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(this, 691);
        return new C1400390mXt(awS560S0100000_16, awS560S0100000_16, awS560S0100000_16, null, null, 24);
    }

    public final JSONObject LJJIJIIJI() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            List<AnchorCommonStruct> anchors = LJIIZILJ().getAnchors();
            Object objLJJLIIIJ = null;
            if (anchors != null) {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (AnchorCommonStruct anchorCommonStruct2 : anchors) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    Integer numValueOf = anchorCommonStruct2.getType() == EnumC1430380nKG.LIVE_EVENT.getTYPE() ? Integer.valueOf(i2) : null;
                    if (numValueOf != null) {
                        arrayList.add(numValueOf);
                    }
                    i = i2;
                }
                objLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            }
            jSONObject.put("live_event_pos", objLJJLIIIJ);
            jSONObject.put("is_author", Intrinsics.LJFF(C1017070cZd.LJIJ(LJIIZILJ()), ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID()) ? 1 : 0);
            jSONObject.put("live_event_id", C1058130ddr.LIZ(anchorCommonStruct.getSchema()));
            if (!TextUtils.isEmpty(anchorCommonStruct.getExtra())) {
                try {
                    JSONObject jSONObject2 = new JSONObject(anchorCommonStruct.getExtra());
                    jSONObject.put("is_free_event", jSONObject2.optBoolean("is_paid_event", false) ? CardStruct.IStatusCode.DEFAULT : "1");
                    jSONObject.put("live_event_type", jSONObject2.optString("live_event_type", ""));
                    return jSONObject;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return jSONObject;
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1058090ddn();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.LIVE_EVENT.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            AbstractC1066890drz.LJIILLIIL(c2344009Gk, LJJIJIIJI());
            LJJIIJ(c2344009Gk);
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        return super.LJJJJLL(list);
    }

    @C14EU
    public final void onWebViewFinish(C585740MyC c585740MyC) throws IOException {
        Map<String, String> mapLJ;
        String schema;
        String str = "";
        String schema2 = null;
        if (this instanceof C19580511j9) {
            C2344009Gk c2344009GkLJJ = LJJ();
            c2344009GkLJJ.LIZLLL(c585740MyC.LIZ, "duration");
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            if (anchorCommonStruct != null) {
                schema = anchorCommonStruct.getSchema();
            } else {
                schema = null;
            }
            String strLIZ = C1058130ddr.LIZ(schema);
            if (strLIZ == null) {
                strLIZ = "";
            }
            c2344009GkLJJ.LJIIIIZZ("live_event_id", strLIZ);
            C20684815ws.LJIILLIIL("multi_anchor_stay_time", c2344009GkLJJ.LIZ);
        }
        C2344009Gk c2344009GkLJJ2 = LJJ();
        C2344009Gk c2344009Gk = this.LLJ;
        if (c2344009Gk == null || (mapLJ = c2344009Gk.LIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        c2344009GkLJJ2.LJI(new HashMap(mapLJ));
        c2344009GkLJJ2.LIZLLL(c585740MyC.LIZ, "duration");
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 != null) {
            schema2 = anchorCommonStruct2.getSchema();
        }
        String strLIZ2 = C1058130ddr.LIZ(schema2);
        if (strLIZ2 != null) {
            str = strLIZ2;
        }
        c2344009GkLJJ2.LJIIIIZZ("live_event_id", str);
        C20684815ws.LJIILLIIL("multi_anchor_stay_time", c2344009GkLJJ2.LIZ);
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            AbstractC1066890drz.LJIILLIIL(c2344009Gk, LJJIJIIJI());
            super.p1(c2344009Gk);
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", LJIIZILJ().getAwemeRawAd());
        c1022820ciuLIZLLL.LIZJ("live_anchor", "refer");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) throws JSONException, IOException {
        String schema;
        Long creativeId;
        String logExtra;
        this.LLJ = c2344009Gk;
        Activity activityLJIILJJIL = LJIILJJIL();
        try {
            if (C036E.LIZ.LIZIZ()) {
                AbstractC1066890drz.LJIILLIIL(c2344009Gk, LJJIJIIJI());
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", LJIIZILJ().getAwemeRawAd());
                c1022820ciuLIZLLL.LIZJ("live_anchor", "refer");
                c1022820ciuLIZLLL.LJII();
                LJJII(c2344009Gk, true, true);
                AnchorCommonStruct anchorCommonStruct = this.LLIZ;
                if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
                    EventBus.LIZLLL().LJIJJ(this);
                    String strLIZ = C1058130ddr.LIZ(schema);
                    Bundle bundle = new Bundle();
                    bundle.putFloat("bundle_dialog_screen_size", 0.95f);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("&live_event_enter_from=anchor&group_id=");
                    String aid = LJIIZILJ().getAid();
                    String str = "";
                    if (aid == null) {
                        aid = "";
                    }
                    sbLIZ.append(aid);
                    C786410Ut5.LJJJI("bundle_url_extra_param", C2188811AlT.LIZIZ(sbLIZ), bundle);
                    C786410Ut5.LJJJI("bundle_Hybrid_Dialog_Fragment_from_label", "live_event_from_anchor_maker", bundle);
                    if (LJIIZILJ().isAd() && LJIIZILJ().getAwemeRawAd() != null) {
                        C596450NaN c596450NaN = C596440NaM.LIZ;
                        JSONObject jSONObject = new JSONObject();
                        AwemeRawAd awemeRawAd = LJIIZILJ().getAwemeRawAd();
                        Long groupId = null;
                        if (awemeRawAd != null) {
                            creativeId = awemeRawAd.getCreativeId();
                        } else {
                            creativeId = null;
                        }
                        jSONObject.put("creative_id", creativeId);
                        AwemeRawAd awemeRawAd2 = LJIIZILJ().getAwemeRawAd();
                        if (awemeRawAd2 != null) {
                            logExtra = awemeRawAd2.getLogExtra();
                        } else {
                            logExtra = null;
                        }
                        jSONObject.put("log_extra", logExtra);
                        AwemeRawAd awemeRawAd3 = LJIIZILJ().getAwemeRawAd();
                        if (awemeRawAd3 != null) {
                            groupId = awemeRawAd3.getGroupId();
                        }
                        jSONObject.put("group_id", groupId);
                        c596450NaN.LIZJ(C786410Ut5.J3(jSONObject), "live_event_ad_info");
                        String string = bundle.getString("bundle_url_extra_param");
                        if (string == null) {
                            string = "";
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("&is_ads=true");
                        sbLIZ2.append(string);
                        C786410Ut5.LJJJI("bundle_url_extra_param", C2188811AlT.LIZIZ(sbLIZ2), bundle);
                    }
                    String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
                    InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
                    if (strLIZ != null) {
                        str = strLIZ;
                    }
                    currentUserID.toString();
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    interfaceC20673515v3K4.LJZI(activityLJIILJJIL, str, currentUserID, bundle, new DialogInterface.OnDismissListener() { // from class: X.0Nnf
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            C1440005kM.LIZ(new C585740MyC(System.currentTimeMillis() - jCurrentTimeMillis));
                        }
                    });
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activityLJIILJJIL);
        c1389890mGx.LJIIIZ(2131837960);
        c1389890mGx.LJIIJJI();
    }
}
