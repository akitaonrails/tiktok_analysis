package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsNewLeadsAwarenessEnableSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsNewLeadsBarrageSceneKeySetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsRunPinCardClientAiStrategySetting2;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSMBPinCardOpt;
import com.bytedance.android.livesdk.dataChannel.PcsAnchorServicePlusIconVisibleChannel;
import com.bytedance.android.livesdk.dataChannel.PcsAnchorShoppingIconVisibleChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePcsFixBusinessIconConflictSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.subscription.SubscribeUpsellLynxUrlSetting;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SMBIndustryInfo;
import com.bytedance.android.livesdkapi.depend.model.live.SMBInfo;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.api.sub.SMBMyServicePlusResponse;

/* JADX INFO: renamed from: X.0eoc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103240eoc implements InterfaceViewOnClickListenerC1102800enu, OnIMMessageListener {
    public final /* synthetic */ C1103530ep5 LL = new C1103530ep5();
    public DataChannel LLILLJJLI;
    public InterfaceC1103130eoR LLILLL;
    public Context LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public final InterfaceC759600Tqw LLIZLLLIL;
    public IMessageManager LLJ;
    public final C054G LLJI;
    public AnonymousClass0956 LLJIJIL;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "Pcs_anchor_service_plus_toolbar";
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    public final InterfaceC1083960eJW LIZ() {
        String secUid;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LLILLJJLI);
        if (roomLJJLIIIIJ == null) {
            return null;
        }
        String strValueOf = String.valueOf(roomLJJLIIIIJ.getId());
        InterfaceC1097310ef3 interfaceC1097310ef3LIZJ = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).UN1().LIZJ();
        C054G c054g = this.LLJI;
        User owner = roomLJJLIIIIJ.getOwner();
        if (owner == null || (secUid = owner.getSecUid()) == null) {
            secUid = "";
        }
        return interfaceC1097310ef3LIZJ.LIZLLL(secUid, strValueOf, c054g);
    }

    public C1103240eoc() {
        ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).ei().LIZLLL();
        this.LLIZLLLIL = C518990KWz.LIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJI = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public final void LIZJ(String str) {
        Long lValueOf;
        Long lValueOf2;
        String secUid;
        Long lValueOf3;
        Long lValueOf4;
        boolean z;
        boolean z2;
        SMBInfo sMBInfo;
        User owner;
        InterfaceC1083960eJW interfaceC1083960eJWLIZ;
        C1142360fpi c1142360fpiLJI;
        Boolean bool;
        if (LivePcsFixBusinessIconConflictSetting.INSTANCE.getValue() && (interfaceC1083960eJWLIZ = LIZ()) != null && (c1142360fpiLJI = interfaceC1083960eJWLIZ.LJI()) != null && (bool = (Boolean) c1142360fpiLJI.getValue()) != null && !bool.booleanValue()) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131856378));
            return;
        }
        SubscribeUpsellLynxUrlSetting subscribeUpsellLynxUrlSetting = SubscribeUpsellLynxUrlSetting.INSTANCE;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LLILLJJLI);
        Integer numValueOf = null;
        if (roomLJJLIIIIJ != null) {
            lValueOf = Long.valueOf(roomLJJLIIIIJ.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        Room roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(this.LLILLJJLI);
        if (roomLJJLIIIIJ2 != null) {
            lValueOf2 = Long.valueOf(roomLJJLIIIIJ2.getOwnerUserId());
        } else {
            lValueOf2 = null;
        }
        String strValueOf2 = String.valueOf(lValueOf2);
        Room roomLJJLIIIIJ3 = C500260Jjc.LJJLIIIIJ(this.LLILLJJLI);
        String str2 = "";
        if (roomLJJLIIIIJ3 == null || (owner = roomLJJLIIIIJ3.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
            secUid = "";
        }
        boolean z3 = false;
        if (this.LLIZ != 0 && System.currentTimeMillis() - this.LLIZ <= 7000) {
            str2 = "moderator_list";
        }
        String smbAnchorServicePage = subscribeUpsellLynxUrlSetting.getSmbAnchorServicePage(str, strValueOf, strValueOf2, secUid, str2);
        Context context = this.LLILZ;
        if (context != null) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, smbAnchorServicePage);
        }
        InterfaceC759600Tqw interfaceC759600Tqw = this.LLIZLLLIL;
        if (interfaceC759600Tqw != null) {
            Room roomLJJLIIIIJ4 = C500260Jjc.LJJLIIIIJ(this.LLILLJJLI);
            if (roomLJJLIIIIJ4 != null) {
                lValueOf3 = Long.valueOf(roomLJJLIIIIJ4.getOwnerUserId());
            } else {
                lValueOf3 = null;
            }
            String strValueOf3 = String.valueOf(lValueOf3);
            Room roomLJJLIIIIJ5 = C500260Jjc.LJJLIIIIJ(this.LLILLJJLI);
            if (roomLJJLIIIIJ5 != null) {
                lValueOf4 = Long.valueOf(roomLJJLIIIIJ5.getId());
            } else {
                lValueOf4 = null;
            }
            String strValueOf4 = String.valueOf(lValueOf4);
            Room roomLJJLIIIIJ6 = C500260Jjc.LJJLIIIIJ(this.LLILLJJLI);
            if (roomLJJLIIIIJ6 != null && (sMBInfo = roomLJJLIIIIJ6.smbInfo) != null) {
                numValueOf = Integer.valueOf(sMBInfo.optInStatus);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (this.LLILZIL != 0 && System.currentTimeMillis() - this.LLILZIL <= 7000) {
                z = true;
            } else {
                z = false;
            }
            linkedHashMap.put("is_pin_card_guide_show", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0));
            if (this.LLILZLL != 0 && System.currentTimeMillis() - this.LLILZLL <= 7000) {
                z2 = true;
            } else {
                z2 = false;
            }
            linkedHashMap.put("has_new_leads_bubble", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0));
            if (this.LLIZ != 0 && System.currentTimeMillis() - this.LLIZ <= 7000) {
                z3 = true;
            }
            linkedHashMap.put("has_pin_bubble", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0));
            interfaceC759600Tqw.LIZIZ(strValueOf3, str, strValueOf4, false, numValueOf, linkedHashMap, this.LLILLJJLI);
        }
        C1103280eog c1103280eog = C1103280eog.LIZLLL;
        c1103280eog.getClass();
        c1103280eog.LIZLLL(1, "smb_anchor_service_plus_entrance_click_count");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LIZJ("live_detail_anchor_toolbar_service_plus");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        View contentView;
        if (iMessage instanceof BarrageMessage) {
            String str = ((BarrageMessage) iMessage).scene;
            if (LivePcsNewLeadsBarrageSceneKeySetting.INSTANCE.isTargetScene(str) && LivePcsNewLeadsAwarenessEnableSetting.INSTANCE.getValue()) {
                String strLJIJI = C497740JfY.LJIJI(2131855840);
                EnumC1120860fH2 enumC1120860fH2 = EnumC1120860fH2.GOLIVE_GUIDE_SERVICE_NEW_LEADS_NOTICE;
                C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                InterfaceC1103130eoR interfaceC1103130eoR = this.LLILLL;
                if (interfaceC1103130eoR != null) {
                    contentView = interfaceC1103130eoR.getContentView();
                } else {
                    contentView = null;
                }
                C785230UrB c785230UrB = new C785230UrB(contentView);
                c785230UrB.LJIJJ = strLJIJI;
                c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0KX1
                    @Override // X.InterfaceC254600ye
                    public final void onShow() {
                        this.LIZ.LLILZLL = System.currentTimeMillis();
                        this.LIZ.getClass();
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_entrance_new_leads_bubble_show");
                        c474500IjALIZ.LJIIIIZZ();
                        c474500IjALIZ.LJJII("live_detail_anchor_toolbar_service_plus", "show_entrance");
                        c474500IjALIZ.LIZ();
                    }
                };
                c1113800f5e.LJ(new C785270UrF(c785230UrB), enumC1120860fH2, this.LLILLJJLI);
            }
            if (Intrinsics.LJFF(str, "smb_leads_dm_send")) {
                C1103280eog c1103280eog = C1103280eog.LIZLLL;
                c1103280eog.getClass();
                c1103280eog.LIZLLL(1, "smb_anchor_dm_received_count");
                JSONObject jSONObject = new JSONObject();
                c1103280eog.LIZ.getClass();
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).onlyEmitAppLogEventToCaiEventStream("live_smb_feature_host_receive_dm", jSONObject);
                return;
            }
            if (!Intrinsics.LJFF(str, "smb_leads_form_send")) {
                return;
            }
            C1103280eog c1103280eog2 = C1103280eog.LIZLLL;
            c1103280eog2.getClass();
            c1103280eog2.LIZLLL(1, "smb_anchor_form_received_count");
            JSONObject jSONObject2 = new JSONObject();
            c1103280eog2.LIZ.getClass();
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).onlyEmitAppLogEventToCaiEventStream("live_smb_feature_host_receive_form", jSONObject2);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        C1093180eYO.LIZIZ();
        IMessageManager iMessageManager = this.LLJ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        C2296808zG.LIZJ(this.LLJI, null);
        ((C11NJ) this.LL.LIZ.getValue()).dispose();
        DataChannelGlobal.LLILZ.HQ2(PcsAnchorServicePlusIconVisibleChannel.class, Boolean.FALSE);
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        SMBInfo sMBInfo;
        int i;
        View viewLJ;
        View viewLJ2;
        LifecycleOwner lifecycleOwnerLJFF;
        long jLongValue;
        Long l;
        Long lValueOf;
        Long lValueOf2;
        Integer numValueOf;
        SMBInfo sMBInfo2;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = interfaceC1103130eoR;
        this.LLILZ = interfaceC1103130eoR.getContext();
        LifecycleOwner lifecycleOwnerLJFF2 = null;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LLJ = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.BARRAGE_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
        C1097400efC.LIZ();
        InterfaceC759600Tqw interfaceC759600Tqw = this.LLIZLLLIL;
        if (interfaceC759600Tqw != null) {
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
            if (roomLJJLIIIIJ != null) {
                lValueOf = Long.valueOf(roomLJJLIIIIJ.getOwnerUserId());
            } else {
                lValueOf = null;
            }
            String strValueOf = String.valueOf(lValueOf);
            Room roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(dataChannel);
            if (roomLJJLIIIIJ2 != null) {
                lValueOf2 = Long.valueOf(roomLJJLIIIIJ2.getId());
            } else {
                lValueOf2 = null;
            }
            String strValueOf2 = String.valueOf(lValueOf2);
            Room roomLJJLIIIIJ3 = C500260Jjc.LJJLIIIIJ(dataChannel);
            if (roomLJJLIIIIJ3 != null && (sMBInfo2 = roomLJJLIIIIJ3.smbInfo) != null) {
                numValueOf = Integer.valueOf(sMBInfo2.optInStatus);
            } else {
                numValueOf = null;
            }
            interfaceC759600Tqw.LIZIZ(strValueOf, "live_detail_anchor_toolbar_service_plus", strValueOf2, true, numValueOf, new LinkedHashMap(), dataChannel);
        }
        InterfaceC513260KAy interfaceC513260KAyLIZIZ = C1826730xdX.LIZIZ();
        if (interfaceC513260KAyLIZIZ != null) {
            int iHashCode = hashCode();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (dataChannel != null && (l = (Long) dataChannel.gg0(C781130UkZ.class)) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            interfaceC513260KAyLIZIZ.LIZLLL("ServicePlusAnchorEntranceInLive", new C517530KRj(iHashCode, 8, jCurrentTimeMillis - jLongValue, "live_detail_anchor_toolbar_service_plus", linkedHashMap));
        }
        Boolean boolLIZ = InterfaceC1106030et7.Y4.LIZ();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.LJFF(boolLIZ, bool)) {
            C1093180eYO.LIZJ = new C759580Tqu(this);
            int intValue = SettingsManager.INSTANCE.getIntValue("live_pcs_run_pin_card_client_ai_strategy2", LivePcsRunPinCardClientAiStrategySetting2.DEFAULT);
            boolean zEnable = LivePcsRunPinCardClientAiStrategySetting2.INSTANCE.enable();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init pin card guide strategy, group=");
            sbLIZ.append(intValue);
            sbLIZ.append(", enabled=");
            sbLIZ.append(zEnable);
            C20441214yg.LJIIIZ("PcsPinCardGuideClientAIStrategy", C2188811AlT.LIZIZ(sbLIZ));
            if (zEnable) {
                C1DFH c1dfh = C0PEM.LIZ;
                C1093180eYO.LIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1096160edC(intValue, null), 3);
            }
        }
        if (LivePcsFixBusinessIconConflictSetting.INSTANCE.getValue()) {
            if (Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(PcsAnchorShoppingIconVisibleChannel.class), bool)) {
                AnonymousClass0956 anonymousClass0956 = this.LLJIJIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LLJIJIL = null;
                this.LLJIJIL = C23250099c.LIZLLL(this.LLJI, null, null, new C473160Ih0(null), 3);
            }
            InterfaceC1103130eoR interfaceC1103130eoR2 = this.LLILLL;
            if (interfaceC1103130eoR2 != null && (viewLJ2 = interfaceC1103130eoR2.LJ()) != null) {
                IHostCreativeTool iHostCreativeTool = C520010KaN.LIZ;
                AbstractC1387200mCc abstractC1387200mCcLIZ = C520040KaQ.LIZ(viewLJ2);
                if (abstractC1387200mCcLIZ != null && (lifecycleOwnerLJFF = abstractC1387200mCcLIZ.LJFF()) != null) {
                    DataChannelGlobal.LLILZ.EQ2(this, lifecycleOwnerLJFF, PcsAnchorShoppingIconVisibleChannel.class, new C1084000eJa(this));
                }
            }
        }
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        InterfaceC1103130eoR interfaceC1103130eoR3 = this.LLILLL;
        if (interfaceC1103130eoR3 != null && (viewLJ = interfaceC1103130eoR3.LJ()) != null) {
            IHostCreativeTool iHostCreativeTool2 = C520010KaN.LIZ;
            AbstractC1387200mCc abstractC1387200mCcLIZ2 = C520040KaQ.LIZ(viewLJ);
            if (abstractC1387200mCcLIZ2 != null) {
                lifecycleOwnerLJFF2 = abstractC1387200mCcLIZ2.LJFF();
            }
        }
        c784440UpuLIZ.LIZJ(lifecycleOwnerLJFF2, C489710JIj.class).LIZJ(new C09JN() { // from class: X.0eod
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PcsToolbarAnchorServicePlusBehavior@57d9.registerBulletClickEvent$1");
                C489710JIj c489710JIj = (C489710JIj) obj;
                InterfaceC1103130eoR interfaceC1103130eoR4 = this.LL.LLILLL;
                if (interfaceC1103130eoR4 == null || interfaceC1103130eoR4.getVisibility() != 8) {
                    this.LL.LIZJ(c489710JIj.LIZ);
                }
                C1C7U.LIZIZ("PcsToolbarAnchorServicePlusBehavior@57d9.registerBulletClickEvent$1");
            }
        });
        if (LiveSMBPinCardOpt.INSTANCE.enable()) {
            C480460Ism.LIZ().getClass();
            ((C11NJ) this.LL.LIZ.getValue()).LIZ(((PcsApi) C480460Ism.LIZLLL(PcsApi.class)).getMyServicePlusInfo(C500260Jjc.LJJLIIIJ(this.LLILLJJLI)).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0Tpe
                @Override // X.C09JN
                public final void accept(Object obj) {
                    View contentView;
                    C1C7U.LIZ("PcsToolbarAnchorServicePlusBehavior@57d9.fetchMyServicePlusPageApi$1");
                    if (((SMBMyServicePlusResponse.ResponseData) ((BaseResponse) obj).data).showModeratorPinCardEntrance) {
                        final C1103240eoc c1103240eoc = this.LL;
                        c1103240eoc.getClass();
                        if (LiveSMBPinCardOpt.INSTANCE.enable() && !Intrinsics.LJFF(InterfaceC1106030et7.W4.LIZ(), Boolean.TRUE)) {
                            String strLJIJI = C497740JfY.LJIJI(2131856036);
                            EnumC1120860fH2 enumC1120860fH2 = EnumC1120860fH2.GOLIVE_GUIDE_SERVICE_PLUS_MODERATOR_PIN;
                            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                            InterfaceC1103130eoR interfaceC1103130eoR4 = c1103240eoc.LLILLL;
                            if (interfaceC1103130eoR4 != null) {
                                contentView = interfaceC1103130eoR4.getContentView();
                            } else {
                                contentView = null;
                            }
                            C785230UrB c785230UrB = new C785230UrB(contentView);
                            c785230UrB.LJIJJ = strLJIJI;
                            c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0KX0
                                @Override // X.InterfaceC254600ye
                                public final void onShow() {
                                    c1103240eoc.LLIZ = System.currentTimeMillis();
                                    InterfaceC1106030et7.W4.LIZJ(Boolean.TRUE);
                                    C518990KWz.LIZJ("live_detail_anchor_toolbar_service_plus", "anchor");
                                }
                            };
                            c785230UrB.LJIILLIIL = new InterfaceC254900yh() { // from class: X.0Tpf
                                @Override // X.InterfaceC254900yh
                                public final void x1(int i2) {
                                }
                            };
                            c1113800f5e.LJ(new C785270UrF(c785230UrB), enumC1120860fH2, c1103240eoc.LLILLJJLI);
                        }
                    }
                    C1C7U.LIZIZ("PcsToolbarAnchorServicePlusBehavior@57d9.fetchMyServicePlusPageApi$1");
                }
            }, new C09JN() { // from class: X.00MJ
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PcsToolbarAnchorServicePlusBehavior@57d9.fetchMyServicePlusPageApi$2");
                    C1C7U.LIZIZ("PcsToolbarAnchorServicePlusBehavior@57d9.fetchMyServicePlusPageApi$2");
                }
            }));
        }
        C1103280eog c1103280eog = C1103280eog.LIZLLL;
        Room roomLJJLIIIIJ4 = C500260Jjc.LJJLIIIIJ(dataChannel);
        c1103280eog.LJFF();
        if (roomLJJLIIIIJ4 != null && (sMBInfo = roomLJJLIIIIJ4.smbInfo) != null) {
            c1103280eog.LJI("smb_anchor_service_plus_status", Integer.valueOf(sMBInfo.optInStatus));
            SMBIndustryInfo sMBIndustryInfo = roomLJJLIIIIJ4.smbIndustryInfo;
            if (sMBIndustryInfo != null) {
                i = sMBIndustryInfo.type;
            } else {
                i = 0;
            }
            c1103280eog.LJI("smb_industry_type", Integer.valueOf(i));
            c1103280eog.LJI("smb_anchor_service_plus_entrance_show", bool);
        }
        DataChannelGlobal.LLILZ.HQ2(PcsAnchorServicePlusIconVisibleChannel.class, bool);
    }

    public static final void LIZIZ(final C1103240eoc c1103240eoc, final Long l, String str, EnumC1120860fH2 enumC1120860fH2) {
        View contentView;
        Map<String, Object> map = C1338270kvh.LIZ;
        C1093180eYO.LIZIZ();
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        InterfaceC1103130eoR interfaceC1103130eoR = c1103240eoc.LLILLL;
        if (interfaceC1103130eoR != null) {
            contentView = interfaceC1103130eoR.getContentView();
        } else {
            contentView = null;
        }
        C785230UrB c785230UrB = new C785230UrB(contentView);
        c785230UrB.LJIJJ = str;
        c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0Tqv
            @Override // X.InterfaceC254600ye
            public final void onShow() {
                this.LIZ.LLILZIL = System.currentTimeMillis();
                InterfaceC1106030et7.Y4.LIZJ(Boolean.TRUE);
                InterfaceC759600Tqw interfaceC759600Tqw = this.LIZ.LLIZLLLIL;
                if (interfaceC759600Tqw != null) {
                    interfaceC759600Tqw.LIZ(this.LIZ.LLILLJJLI, (int) l.longValue());
                }
            }
        };
        c1113800f5e.LJ(new C785270UrF(c785230UrB), enumC1120860fH2, c1103240eoc.LLILLJJLI);
    }
}
