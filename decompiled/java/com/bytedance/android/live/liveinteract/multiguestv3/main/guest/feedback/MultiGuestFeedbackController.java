package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback;

import X.C01GW;
import X.C0KVU;
import X.C1161920gLG;
import X.C11NJ;
import X.C13LE;
import X.C1548820qPI;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C304201Fw;
import X.C452501pT;
import X.C500260Jjc;
import X.C914810Zuh;
import X.C926650aDn;
import X.C944240agA;
import X.C987150bnN;
import X.InterfaceC1059280dfi;
import X.InterfaceC2217461Bqa;
import X.InterfaceC923710a93;
import X.InterfaceC948500an2;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFeSchemaConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestDisconnectFeedbackUrlSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "MULTI_GUEST_FEEDBACK_OF_DISCONNECT")
public final class MultiGuestFeedbackController implements InterfaceC923710a93 {
    public static final C914810Zuh LJIIJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
    public final Room LIZ;
    public final User LIZIZ;
    public final Context LIZJ;
    public final Function0<Unit> LIZLLL;
    public SparkContext LJIIIIZZ;
    public final C304201Fw LJ = new C304201Fw("MULTI_GUEST_DATA_HOLDER");
    public String LJFF = "";
    public String LJI = "";
    public final C01GW LJII = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(498));
    public final C987150bnN LJIIIZ = new C987150bnN(this, 4);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MultiGuestFeedbackController.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C13LE.LIZ.getClass();
        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LJIIJ = new C914810Zuh();
    }

    @Override // X.InterfaceC923710a93
    public final void LJFF() {
        C1548820qPI.LJIIIIZZ("Multi_guest_feedback_submit", this.LJIIIZ);
        ((C11NJ) this.LJII.getValue()).LJ();
        LJI();
    }

    public final void LJI() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        SparkContext sparkContext = this.LJIIIIZZ;
        if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
        this.LJIIIIZZ = null;
    }

    @Override // X.InterfaceC923710a93
    public final Function0<Unit> LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC923710a93
    public final void LIZLLL() {
        LJI();
    }

    @Override // X.InterfaceC923710a93
    public final void LIZ(String str) {
        this.LJFF = str;
    }

    @Override // X.InterfaceC923710a93
    public final boolean LIZIZ(C926650aDn c926650aDn) throws JSONException {
        String strLJIILJJIL;
        boolean zLJJIIZ = C500260Jjc.LJJIIZ(MultiGuestDisconnectFeedbackUrlSetting.INSTANCE.getUrl());
        C914810Zuh c914810Zuh = LJIIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canShowFeedbackDialogBeforeDisconnected ");
        sbLIZ.append(zLJJIIZ);
        sbLIZ.append(' ');
        sbLIZ.append(true);
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c914810Zuh.getClass();
        C944240agA.LIZJ("MultiGuestFeedbackController", strLIZIZ);
        if (!zLJJIIZ) {
            return false;
        }
        Room room = this.LIZ;
        User user = this.LIZIZ;
        C304201Fw c304201Fw = this.LJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJIIJJI;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c304201Fw.LIZ();
        if (multiGuestDataHolder != null) {
            strLJIILJJIL = multiGuestDataHolder.LJIILJJIL();
        } else {
            strLJIILJJIL = "no_permission";
        }
        c926650aDn.LIZIZ = String.valueOf(user.getId());
        c926650aDn.LIZJ = C0KVU.LIZ(room.getOwner());
        c926650aDn.LIZLLL = String.valueOf(room.getOwnerUserId());
        String idStr = room.getIdStr();
        if (idStr == null) {
            idStr = "";
        }
        c926650aDn.LJ = idStr;
        c926650aDn.LJFF = strLJIILJJIL;
        c926650aDn.LJI = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(MultiGuestFeSchemaConfigSetting.INSTANCE.getValue().feedback);
        sb.append("&guest_id=");
        sb.append(c926650aDn.LIZIZ);
        sb.append("&room_id=");
        sb.append(c926650aDn.LJ);
        sb.append("&anchor_id=");
        sb.append(c926650aDn.LIZLLL);
        sb.append("&disconnection_type=");
        sb.append(c926650aDn.LIZ);
        sb.append("&guest_permission=");
        sb.append(c926650aDn.LJFF);
        sb.append("&username=");
        sb.append(c926650aDn.LIZJ);
        sb.append("&multi_guest_disconnect_feedback=");
        sb.append(c926650aDn.LJI);
        sb.append("&track_info=");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("linkmic_id", this.LJI);
        jSONObject.put("channel_id", this.LJFF);
        jSONObject.put("room_id", c926650aDn.LJ);
        sb.append(jSONObject);
        String string = sb.toString();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("showFeedbackLynxDialog ");
        sbLIZ2.append(string);
        C944240agA.LIZJ("MultiGuestFeedbackController", C2188811AlT.LIZIZ(sbLIZ2));
        LJI();
        this.LJIIIIZZ = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(this.LIZJ, string, null);
        return true;
    }

    @Override // X.InterfaceC923710a93
    public final void LJ(String str) {
        this.LJI = str;
    }

    public MultiGuestFeedbackController(Room room, User user, Context context, AwS559S0100000_15 awS559S0100000_15) {
        this.LIZ = room;
        this.LIZIZ = user;
        this.LIZJ = context;
        this.LIZLLL = awS559S0100000_15;
    }
}
