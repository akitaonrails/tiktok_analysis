package Y;

import X.AbstractC1110800f0o;
import X.C011L;
import X.C013C;
import X.C098200Yq;
import X.C0IJT;
import X.C0IP3;
import X.C0KYL;
import X.C1109770ez9;
import X.C1110930f11;
import X.C1120560fGY;
import X.C1120580fGa;
import X.C1120950fHB;
import X.C1121570fIB;
import X.C1125800fP0;
import X.C1128450fTH;
import X.C1143980fsK;
import X.C1146980fxA;
import X.C1151190g3x;
import X.C1161920gLG;
import X.C1196320hEk;
import X.C13LE;
import X.C1558520qew;
import X.C16FS;
import X.C189200o6;
import X.C2011307uJ;
import X.C20441214yg;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C474500IjA;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C760370TsB;
import X.C786410Ut5;
import X.EnumC1120600fGc;
import X.InterfaceC1118070fCX;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftIconGuideInfo;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.consumption.binder.SendGiftBinder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS131S1100000_17;
import qo2.w;
import webcast.data.TPClickableText;

/* JADX INFO: loaded from: classes18.dex */
public class ACListenerS53S0400000_17 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS53S0400000_17 aCListenerS53S0400000_17, View view) {
        Object c098200Yq;
        String string;
        String secUid;
        String string2;
        String secUid2;
        String string3;
        User owner;
        User owner2;
        Object c098200Yq2;
        GiftIconGuideInfo giftIconGuideInfo = (GiftIconGuideInfo) aCListenerS53S0400000_17.l0;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_panel_guide_bubble_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(C1120560fGY.LIZ(giftIconGuideInfo));
        c474500IjALIZ.LIZ();
        C011L c011l = C011L.LIZ;
        Context context = ((C1120950fHB) aCListenerS53S0400000_17.l1).getContext();
        DataChannel dataChannel = (DataChannel) aCListenerS53S0400000_17.l2;
        GiftIconGuideInfo giftIconGuideInfo2 = (GiftIconGuideInfo) aCListenerS53S0400000_17.l0;
        c011l.getClass();
        if (!giftIconGuideInfo2.clickable) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("click skipped, guide is not clickable, guide_id=");
            sbLIZ.append(giftIconGuideInfo2.guideId);
            C20441214yg.LIZIZ("LiveGiftIconGuideClickHandler", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            int i = giftIconGuideInfo2.clickAction;
            User owner3 = null;
            boolean zHandle = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("click ignored, unknown click_action=");
                            sbLIZ2.append(giftIconGuideInfo2.clickAction);
                            sbLIZ2.append(", guide_id=");
                            sbLIZ2.append(giftIconGuideInfo2.guideId);
                            C20441214yg.LJIIL("LiveGiftIconGuideClickHandler", C2188811AlT.LIZIZ(sbLIZ2));
                        } else {
                            String str = giftIconGuideInfo2.openClientPageUrl;
                            if (context != null && str != null && str.length() != 0) {
                                try {
                                    String strLIZ = C011L.LIZ(str);
                                    IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                                    if (iActionHandlerService != null) {
                                        zHandle = iActionHandlerService.handle(context, strLIZ);
                                    }
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("open_client_page invoked, handled=");
                                    sbLIZ3.append(zHandle);
                                    sbLIZ3.append(", guide_id=");
                                    sbLIZ3.append(giftIconGuideInfo2.guideId);
                                    sbLIZ3.append(", url=");
                                    sbLIZ3.append(strLIZ);
                                    C20441214yg.LJIIIZ("LiveGiftIconGuideClickHandler", C2188811AlT.LIZIZ(sbLIZ3));
                                    c098200Yq2 = Unit.LIZ;
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq2 = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                }
                                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                                if (thM5exceptionOrNullimpl != null) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("open_client_page failed, guide_id=");
                                    sbLIZ4.append(giftIconGuideInfo2.guideId);
                                    C20441214yg.LJFF("LiveGiftIconGuideClickHandler", C2188811AlT.LIZIZ(sbLIZ4), thM5exceptionOrNullimpl);
                                }
                            } else {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("open_client_page skipped, ctx or url empty, guide_id=");
                                sbLIZ5.append(giftIconGuideInfo2.guideId);
                                C20441214yg.LJIIL("LiveGiftIconGuideClickHandler", C2188811AlT.LIZIZ(sbLIZ5));
                            }
                        }
                    } else if (dataChannel != null) {
                        long j = giftIconGuideInfo2.locateGiftId;
                        if (j <= 0) {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("locate_gift skipped, gift_id missing, guide_id=");
                            sbLIZ6.append(giftIconGuideInfo2.guideId);
                            C20441214yg.LJIIL("LiveGiftIconGuideClickHandler", C2188811AlT.LIZIZ(sbLIZ6));
                        } else {
                            C1121570fIB c1121570fIB = new C1121570fIB((User) null);
                            c1121570fIB.LIZJ = "gift_panel_bubble";
                            c1121570fIB.LJIIIZ = j;
                            c1121570fIB.LIZLLL = C1120580fGa.LIZ(GiftManager.inst().getTabByGiftId(j));
                            c1121570fIB.LJIILIIL = SystemClock.uptimeMillis();
                            dataChannel.LC0(SendGiftEvent.class, c1121570fIB);
                        }
                    }
                } else if (dataChannel != null) {
                    EnumC1120600fGc enumC1120600fGcLIZ = C1120580fGa.LIZ(giftIconGuideInfo2.switchPageType);
                    if (enumC1120600fGcLIZ == EnumC1120600fGc.DEFAULT) {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("switch_tab skipped, unsupported tab=");
                        sbLIZ7.append(giftIconGuideInfo2.switchPageType);
                        sbLIZ7.append(", guide_id=");
                        sbLIZ7.append(giftIconGuideInfo2.guideId);
                        C20441214yg.LJIIL("LiveGiftIconGuideClickHandler", C2188811AlT.LIZIZ(sbLIZ7));
                    } else {
                        C1121570fIB c1121570fIB2 = new C1121570fIB((User) null);
                        c1121570fIB2.LIZJ = "gift_panel_bubble";
                        c1121570fIB2.LIZLLL = enumC1120600fGcLIZ;
                        c1121570fIB2.LJJIFFI = true;
                        c1121570fIB2.LJIILIIL = SystemClock.uptimeMillis();
                        dataChannel.LC0(SendGiftEvent.class, c1121570fIB2);
                    }
                }
            } else {
                String str2 = giftIconGuideInfo2.openPageUrl;
                if (context != null && str2 != null && str2.length() != 0 && dataChannel != null) {
                    try {
                        String strLJFF = C1128450fTH.LJFF();
                        User userLIZJ = C1125800fP0.LIZJ();
                        if (userLIZJ == null) {
                            Room room = (Room) dataChannel.gg0(RoomChannel.class);
                            if (room != null) {
                                owner3 = room.getOwner();
                            }
                        } else {
                            owner3 = userLIZJ;
                        }
                        C760370TsB c760370TsBLIZ = C0KYL.LIZ(str2);
                        c760370TsBLIZ.LJJIFFI("enter_from", "gift_panel_bubble");
                        c760370TsBLIZ.LJJIFFI("enter_time", String.valueOf(System.currentTimeMillis()));
                        String str3 = "";
                        if (strLJFF == null) {
                            strLJFF = "";
                        }
                        c760370TsBLIZ.LJJIFFI("send_gift_scene", strLJFF);
                        if (owner3 == null || (string = Long.valueOf(owner3.getId()).toString()) == null) {
                            string = "";
                        }
                        c760370TsBLIZ.LJJIFFI("gift_to_user_id", string);
                        if (owner3 == null || (secUid = owner3.getSecUid()) == null) {
                            secUid = "";
                        }
                        c760370TsBLIZ.LJJIFFI("gift_to_sec_user_id", secUid);
                        c760370TsBLIZ.LJJIFFI("container_gift_id", String.valueOf(giftIconGuideInfo2.locateGiftId));
                        Room room2 = (Room) dataChannel.gg0(RoomChannel.class);
                        if (room2 == null || (owner2 = room2.getOwner()) == null || (string2 = Long.valueOf(owner2.getId()).toString()) == null) {
                            string2 = "";
                        }
                        c760370TsBLIZ.LJJIFFI("anchor_id", string2);
                        Room room3 = (Room) dataChannel.gg0(RoomChannel.class);
                        if (room3 == null || (owner = room3.getOwner()) == null || (secUid2 = owner.getSecUid()) == null) {
                            secUid2 = "";
                        }
                        c760370TsBLIZ.LJJIFFI("sec_anchor_id", secUid2);
                        Room room4 = (Room) dataChannel.gg0(RoomChannel.class);
                        if (room4 == null || (string3 = Long.valueOf(room4.getId()).toString()) == null) {
                            string3 = "";
                        }
                        c760370TsBLIZ.LJJIFFI("room_id", string3);
                        w.LIZ.getClass();
                        if (!C2093608Ic.LJ(w.LJIIJJI())) {
                            String strLJIIJJI = w.LJIIJJI();
                            if (strLJIIJJI != null) {
                                str3 = strLJIIJJI;
                            }
                            c760370TsBLIZ.LJJIFFI("enter_url_source", str3);
                        }
                        c760370TsBLIZ.LJIIIIZZ("bottom");
                        c760370TsBLIZ.LJIJJLI("bottom");
                        c098200Yq = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZ.LIZ().toString(), new AwS131S1100000_17(owner3, str2, 4));
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl2 != null) {
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("open_page failed, guide_id=");
                        sbLIZ8.append(giftIconGuideInfo2.guideId);
                        C20441214yg.LJFF("LiveGiftIconGuideClickHandler", C2188811AlT.LIZIZ(sbLIZ8), thM5exceptionOrNullimpl2);
                    }
                } else {
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("open_page skipped, ctx or url empty, guide_id=");
                    sbLIZ9.append(giftIconGuideInfo2.guideId);
                    C20441214yg.LJIIL("LiveGiftIconGuideClickHandler", C2188811AlT.LIZIZ(sbLIZ9));
                }
            }
        }
        InterfaceC1118070fCX interfaceC1118070fCX = (InterfaceC1118070fCX) aCListenerS53S0400000_17.l3;
        if (interfaceC1118070fCX != null) {
            interfaceC1118070fCX.LIZJ((C1120950fHB) aCListenerS53S0400000_17.l1);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void onClick$1(ACListenerS53S0400000_17 aCListenerS53S0400000_17, View view) {
        String str;
        RechargePanelInputParams inputParams;
        TouchPointAbility touchPointAbility;
        PanelHostAbility panelHostAbility;
        PanelHostAbility panelHostAbility2;
        Map<String, String> logExtra = null;
        DataChannel dataChannelProvideDataChannel = null;
        logExtra = null;
        if (((C013C) aCListenerS53S0400000_17.l0).element) {
            AssemVMLazy assemVMLazy = ((SendGiftBinder) aCListenerS53S0400000_17.l1).LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SendGiftBinder.LLILZ;
            AssemViewModel value = assemVMLazy.getValue();
            SendGiftBinder sendGiftBinder = (SendGiftBinder) aCListenerS53S0400000_17.l1;
            Context context = ((C16FS) aCListenerS53S0400000_17.l2).getContext();
            sendGiftBinder.getClass();
            C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(C500260Jjc.LIZ(context));
            if (c0ip3LIZIZ != null) {
                dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel();
            }
            GiftService.LLILLJJLI.sendGiftFromIncentivePage(dataChannelProvideDataChannel, "consume_cash_recharge_task", ((C2011307uJ) value.getState()).LL, null);
            return;
        }
        TPClickableText tPClickableText = ((C1146980fxA) aCListenerS53S0400000_17.l3).LLILLL;
        if (tPClickableText == null || (str = tPClickableText.schema) == null) {
            return;
        }
        SendGiftBinder sendGiftBinder2 = (SendGiftBinder) aCListenerS53S0400000_17.l1;
        sendGiftBinder2.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(sendGiftBinder2);
        if (interfaceC665370Q7zLIZ != null && (panelHostAbility2 = (PanelHostAbility) C1558520qew.LIZIZ(interfaceC665370Q7zLIZ, C13LE.LIZ(CampaignPanelScope.class), C13LE.LIZ(PanelHostAbility.class))) != null) {
            panelHostAbility2.closePanel();
        }
        SendGiftBinder sendGiftBinder3 = (SendGiftBinder) aCListenerS53S0400000_17.l1;
        sendGiftBinder3.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLIZ2 = C1196320hEk.LIZ(sendGiftBinder3);
        if (interfaceC665370Q7zLIZ2 != null && (panelHostAbility = (PanelHostAbility) C1558520qew.LIZIZ(interfaceC665370Q7zLIZ2, C13LE.LIZ(CampaignPanelScope.class), C13LE.LIZ(PanelHostAbility.class))) != null) {
            inputParams = panelHostAbility.getInputParams();
        } else {
            inputParams = null;
        }
        SendGiftBinder sendGiftBinder4 = (SendGiftBinder) aCListenerS53S0400000_17.l1;
        sendGiftBinder4.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLIZ3 = C1196320hEk.LIZ(sendGiftBinder4);
        if (interfaceC665370Q7zLIZ3 != null && (touchPointAbility = (TouchPointAbility) C1558520qew.LIZIZ(interfaceC665370Q7zLIZ3, C13LE.LIZ(CampaignPanelScope.class), C13LE.LIZ(TouchPointAbility.class))) != null) {
            logExtra = touchPointAbility.getLogExtra();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_incentive_task_page_click");
        C1151190g3x.LIZJ(c474500IjALIZ, inputParams, logExtra);
        c474500IjALIZ.LIZ();
        C1143980fsK.LJ(((SendGiftBinder) aCListenerS53S0400000_17.l1).itemView.getContext(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[PHI: r7
      0x0026: PHI (r7v3 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:13:0x0024, B:11:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$2(Y.ACListenerS53S0400000_17 r16, android.view.View r17) {
        /*
            r4 = r16
            java.lang.Object r6 = r4.l0
            X.0f0o r6 = (X.AbstractC1110800f0o) r6
            boolean r0 = r6 instanceof X.AbstractC1110790f0n
            if (r0 == 0) goto L62
            if (r6 == 0) goto L62
            java.lang.Object r5 = r4.l1
            X.0f5B r5 = (X.C1113510f5B) r5
            X.0f5D r1 = r5.LIZIZ
            if (r1 != 0) goto L15
            return
        L15:
            java.lang.Object r2 = r4.l2
            com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon$CreatorSuccessInfo$Topic r2 = (com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.CreatorSuccessInfo.Topic) r2
            com.bytedance.android.livesdk.model.message.common.Text r0 = r2.topicText
            java.lang.String r8 = ""
            if (r0 == 0) goto L23
            java.lang.String r7 = r0.key
            if (r7 != 0) goto L26
        L23:
            r7 = r8
            if (r0 == 0) goto L2b
        L26:
            java.lang.String r0 = r0.key
            if (r0 == 0) goto L2b
            r8 = r0
        L2b:
            r9 = 1
            java.lang.String r10 = ""
            java.lang.String r11 = "negative_page_feed"
            java.lang.String r12 = "tag_cta"
            com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon$CreatorSuccessInfo$Topic$ActionButton r0 = r2.actionButton
            if (r0 == 0) goto L60
            int r0 = r0.buttonType
        L38:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r16 = 0
            r17 = 1024(0x400, float:1.435E-42)
            r14 = r9
            r15 = r9
            X.C1113510f5B.LJIIL(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r3 = r4.l2
            com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon$CreatorSuccessInfo$Topic r3 = (com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.CreatorSuccessInfo.Topic) r3
            java.lang.Object r2 = r4.l3
            com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon$CreatorSuccessInfo$Topic$ActionButton r2 = (com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton) r2
            java.lang.Object r0 = r4.l1
            X.0f5B r0 = (X.C1113510f5B) r0
            android.view.View r0 = r0.LIZ
            android.content.Context r8 = r0.getContext()
            r9 = 0
            r7 = r6
            r4 = r1
            r5 = r3
            r6 = r2
            r4.LIZ(r5, r6, r7, r8, r9)
            return
        L60:
            r0 = 0
            goto L38
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS53S0400000_17.onClick$2(Y.ACListenerS53S0400000_17, android.view.View):void");
    }

    public static final void onClick$3(ACListenerS53S0400000_17 aCListenerS53S0400000_17, View view) {
        ((C1110930f11) aCListenerS53S0400000_17.l0).V5((C1109770ez9) aCListenerS53S0400000_17.l1, (AbstractC1110800f0o) aCListenerS53S0400000_17.l2, (List) aCListenerS53S0400000_17.l3);
        C786410Ut5.T7(((C1110930f11) aCListenerS53S0400000_17.l0).LLJJJIL, null);
    }

    public ACListenerS53S0400000_17(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
