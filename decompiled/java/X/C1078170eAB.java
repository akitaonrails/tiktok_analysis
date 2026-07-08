package X;

import Y.AObjectS60S0000000_7;
import Y.ARunnableS117S0100000_17;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.unityanimation.service.IUnityAnimationService;
import com.bytedance.android.livesdk.api.revenue.IRevenueService;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.function.UserPermissionCheckWidget;
import com.bytedance.android.livesdk.impl.revenue.strategy.widgets.RevenueStrategyWidget;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0eAB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078170eAB extends AbstractC1081700eFs<Object> {
    public final InterfaceC1078180eAC LIZ;
    public String LIZIZ;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC1081700eFs
    public final Object LIZIZ() {
        String str = this.LIZIZ;
        if (str != null) {
            switch (str.hashCode()) {
                case -2103318482:
                    if (str.equals("AudioChat")) {
                        this.LIZ.zl();
                        return Unit.LIZ;
                    }
                    break;
                case -2074973785:
                    if (str.equals("Casters")) {
                        this.LIZ.u7();
                        return Unit.LIZ;
                    }
                    break;
                case -2074534828:
                    if (str.equals("CustomizedPerksCard")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).UR();
                        this.LIZ.el();
                        return Unit.LIZ;
                    }
                    break;
                case -2037065540:
                    if (str.equals("SubGuide")) {
                        this.LIZ.Ax();
                        return Unit.LIZ;
                    }
                    break;
                case -2025149226:
                    if (str.equals("SubTrial")) {
                        this.LIZ.uQ();
                        return Unit.LIZ;
                    }
                    break;
                case -1981781877:
                    if (str.equals("ProgrammedLiveOnlineAudience")) {
                        this.LIZ.jk();
                        return Unit.LIZ;
                    }
                    break;
                case -1913884352:
                    if (str.equals("QACard")) {
                        this.LIZ.Xb();
                        return Unit.LIZ;
                    }
                    break;
                case -1850320718:
                    if (str.equals("GameMoment")) {
                        this.LIZ.eQ();
                        return Unit.LIZ;
                    }
                    break;
                case -1745901333:
                    if (str.equals("FrameSlot")) {
                        this.LIZ.Yi();
                        return Unit.LIZ;
                    }
                    break;
                case -1679915457:
                    if (str.equals("Comment")) {
                        this.LIZ.bf();
                        return Unit.LIZ;
                    }
                    break;
                case -1577108072:
                    if (str.equals("MicBase")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).qT();
                        return Unit.LIZ;
                    }
                    break;
                case -1521971164:
                    if (str.equals("RoomNotify")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).DT();
                        return Unit.LIZ;
                    }
                    break;
                case -1492519227:
                    if (str.equals("ProgrammedLiveFollow")) {
                        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) this.LIZ;
                        C1077990e9t c1077990e9t = absAudienceInteractionFragment.LLJJIII;
                        Class<? extends LiveRecyclableWidget> clsMa0 = ((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).ma0();
                        if (clsMa0 != null) {
                            c1077990e9t.getClass();
                            if (C1081990eGL.LIZ(clsMa0.getSimpleName())) {
                                absAudienceInteractionFragment.LLJJIJI.addMessageListener(C001A.FOLLOW_CARD_MESSAGE.getIntType(), new C1151720g4o(new C1078440eAc(c1077990e9t, R.id.s88, clsMa0), 10));
                            } else {
                                c1077990e9t.LIZ.load(R.id.s88, clsMa0);
                            }
                        } else {
                            c1077990e9t.LIZ.load(R.id.s88, clsMa0);
                        }
                        return Unit.LIZ;
                    }
                    break;
                case -1305959186:
                    if (str.equals("LiveEvent")) {
                        this.LIZ.iE();
                        return Unit.LIZ;
                    }
                    break;
                case -1085425562:
                    if (str.equals("IconSlotExp")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).lT();
                        return Unit.LIZ;
                    }
                    break;
                case -1080279678:
                    if (str.equals("NameFrame")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).LLJJI.load(((IRevenueService) C1161920gLG.LIZJ(IRevenueService.class)).getLiveNameFrameWidget());
                        return Unit.LIZ;
                    }
                    break;
                case -981741850:
                    if (str.equals("QuizBase")) {
                        this.LIZ.l7();
                        return Unit.LIZ;
                    }
                    break;
                case -875141512:
                    if (str.equals("PrivilegeAnnouncement")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).oT();
                        return Unit.LIZ;
                    }
                    break;
                case -842555153:
                    if (str.equals("BizRoomSticker")) {
                        this.LIZ.u6();
                        return Unit.LIZ;
                    }
                    break;
                case -811057840:
                    if (str.equals("AudienceMultiMatch")) {
                        this.LIZ.sE();
                        return Unit.LIZ;
                    }
                    break;
                case -728124220:
                    if (str.equals("ProgrammedLiveTitle")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).vT();
                        return Unit.LIZ;
                    }
                    break;
                case -709330227:
                    if (str.equals("XMultiTabContainer")) {
                        this.LIZ.BO();
                        return Unit.LIZ;
                    }
                    break;
                case -705290276:
                    if (str.equals("PinCardContainer")) {
                        this.LIZ.N5();
                        return Unit.LIZ;
                    }
                    break;
                case -698074560:
                    if (str.equals("ECommerce")) {
                        AbsAudienceInteractionFragment absAudienceInteractionFragment2 = (AbsAudienceInteractionFragment) this.LIZ;
                        if (absAudienceInteractionFragment2.NS()) {
                            absAudienceInteractionFragment2.gT();
                        }
                        return Unit.LIZ;
                    }
                    break;
                case -679725969:
                    if (str.equals("LiveEventSticker")) {
                        this.LIZ.ub();
                        return Unit.LIZ;
                    }
                    break;
                case -679198504:
                    if (str.equals("UpSellPinCard")) {
                        this.LIZ.XO();
                        return Unit.LIZ;
                    }
                    break;
                case -673310153:
                    if (str.equals("IconSlot")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).XS();
                        return Unit.LIZ;
                    }
                    break;
                case -523553259:
                    if (str.equals("CommentTray")) {
                        this.LIZ.r4();
                        return Unit.LIZ;
                    }
                    break;
                case -471876315:
                    if (str.equals("TopicStation")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).pT();
                        return Unit.LIZ;
                    }
                    break;
                case -402891820:
                    if (str.equals("BottomLeftLinkHost")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).VS();
                        return Unit.LIZ;
                    }
                    break;
                case -117518773:
                    if (str.equals("EntranceContainer")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).AT();
                        return Unit.LIZ;
                    }
                    break;
                case -92586702:
                    if (str.equals("FrameSlotExp")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).hT();
                        return Unit.LIZ;
                    }
                    break;
                case 2129989:
                    if (str.equals("Digg")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).eU();
                        return Unit.LIZ;
                    }
                    break;
                case 2219344:
                    if (str.equals("Gift")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).gS();
                        return Unit.LIZ;
                    }
                    break;
                case 2493407:
                    if (str.equals("Poll")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).VR();
                        this.LIZ.Ev();
                        this.LIZ.kq();
                        return Unit.LIZ;
                    }
                    break;
                case 65203672:
                    if (str.equals("Close")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).YS();
                        return Unit.LIZ;
                    }
                    break;
                case 65906227:
                    if (str.equals("Debug")) {
                        this.LIZ.b6();
                        this.LIZ.KG();
                        return Unit.LIZ;
                    }
                    break;
                case 79847359:
                    if (str.equals("Share")) {
                        this.LIZ.EG();
                        return Unit.LIZ;
                    }
                    break;
                case 80993551:
                    if (str.equals("Topic")) {
                        this.LIZ.getClass();
                        return Unit.LIZ;
                    }
                    break;
                case 135910352:
                    if (str.equals("InteractCutShort")) {
                        this.LIZ.Ya();
                        return Unit.LIZ;
                    }
                    break;
                case 163446525:
                    if (str.equals("ECommerce_EXP_V2")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).fT();
                        return Unit.LIZ;
                    }
                    break;
                case 189636562:
                    if (str.equals("QuickComment")) {
                        this.LIZ.L7();
                        return Unit.LIZ;
                    }
                    break;
                case 228367792:
                    if (str.equals("Orientation")) {
                        this.LIZ.Ij();
                        return Unit.LIZ;
                    }
                    break;
                case 315301646:
                    if (str.equals("PaidEvent")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).uT();
                        return Unit.LIZ;
                    }
                    break;
                case 338897858:
                    if (str.equals("RoomSticker")) {
                        this.LIZ.ak();
                        return Unit.LIZ;
                    }
                    break;
                case 411652848:
                    if (str.equals("CustomPoll")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).eT();
                        return Unit.LIZ;
                    }
                    break;
                case 415774467:
                    if (str.equals("SubGoalCard")) {
                        this.LIZ.gK();
                        return Unit.LIZ;
                    }
                    break;
                case 520741867:
                    if (str.equals("GroupLive")) {
                        this.LIZ.CB();
                        return Unit.LIZ;
                    }
                    break;
                case 522130153:
                    if (str.equals("MicBackUp")) {
                        this.LIZ.PM();
                        return Unit.LIZ;
                    }
                    break;
                case 524559195:
                    if (str.equals("Toolbar")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).ET();
                        return Unit.LIZ;
                    }
                    break;
                case 583090562:
                    if (str.equals("IconSlotExpV2")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).kT();
                        return Unit.LIZ;
                    }
                    break;
                case 728608196:
                    if (str.equals("Karaoke")) {
                        this.LIZ.Yh();
                        return Unit.LIZ;
                    }
                    break;
                case 794521893:
                    if (str.equals("MessageList")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).WR();
                        ((AbsAudienceInteractionFragment) this.LIZ).xT();
                        return Unit.LIZ;
                    }
                    break;
                case 962885726:
                    if (str.equals("ECommerceSlot")) {
                        this.LIZ.J8();
                        return Unit.LIZ;
                    }
                    break;
                case 963204990:
                    if (str.equals("ECommerce_EXP")) {
                        AbsAudienceInteractionFragment absAudienceInteractionFragment3 = (AbsAudienceInteractionFragment) this.LIZ;
                        absAudienceInteractionFragment3.getClass();
                        IHostCommerce iHostCommerce = (IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class);
                        if (absAudienceInteractionFragment3.NS() && iHostCommerce.Ch()) {
                            absAudienceInteractionFragment3.gT();
                        }
                        return Unit.LIZ;
                    }
                    break;
                case 1064344846:
                    if (str.equals("UserPermissionCheck")) {
                        AbsAudienceInteractionFragment absAudienceInteractionFragment4 = (AbsAudienceInteractionFragment) this.LIZ;
                        absAudienceInteractionFragment4.LLJJI.load(absAudienceInteractionFragment4.LLJJI.getRecyclableWidgetFromCacheOrNew(UserPermissionCheckWidget.class, null, new AObjectS60S0000000_7(15)));
                        return Unit.LIZ;
                    }
                    break;
                case 1070197254:
                    if (str.equals("Marketing")) {
                        this.LIZ.RE();
                        return Unit.LIZ;
                    }
                    break;
                case 1163092576:
                    if (str.equals("MicUserInfo")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).rT();
                        return Unit.LIZ;
                    }
                    break;
                case 1223027634:
                    if (str.equals("Donation")) {
                        this.LIZ.NE();
                        return Unit.LIZ;
                    }
                    break;
                case 1262633903:
                    if (str.equals("UnityAnimation")) {
                        AbsAudienceInteractionFragment absAudienceInteractionFragment5 = (AbsAudienceInteractionFragment) this.LIZ;
                        absAudienceInteractionFragment5.getClass();
                        absAudienceInteractionFragment5.LLJJI.load(((IUnityAnimationService) C1161920gLG.LIZJ(IUnityAnimationService.class)).BI0());
                        return Unit.LIZ;
                    }
                    break;
                case 1304694752:
                    if (str.equals("InteractiveTopBar")) {
                        this.LIZ.OI();
                        return Unit.LIZ;
                    }
                    break;
                case 1331502528:
                    if (str.equals("Barrage")) {
                        this.LIZ.xA();
                        return Unit.LIZ;
                    }
                    break;
                case 1365013286:
                    if (str.equals("TopEffect")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).GT();
                        return Unit.LIZ;
                    }
                    break;
                case 1390470387:
                    if (str.equals("PadAutoRotateScreenGuide")) {
                        this.LIZ.Vm();
                        return Unit.LIZ;
                    }
                    break;
                case 1442000943:
                    if (str.equals("BottomRightSlot")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).QS();
                        return Unit.LIZ;
                    }
                    break;
                case 1481945663:
                    if (str.equals("LiveGoal")) {
                        this.LIZ.vr();
                        return Unit.LIZ;
                    }
                    break;
                case 1549670441:
                    if (str.equals("SkyLightSwitch")) {
                        this.LIZ.si();
                        return Unit.LIZ;
                    }
                    break;
                case 1711391611:
                    if (str.equals("GameLinkMic")) {
                        this.LIZ.Pq();
                        return Unit.LIZ;
                    }
                    break;
                case 1734818242:
                    if (str.equals("SubExtendGuide")) {
                        this.LIZ.getClass();
                        return Unit.LIZ;
                    }
                    break;
                case 1803757455:
                    if (str.equals("RevenueStrategy")) {
                        AbsAudienceInteractionFragment absAudienceInteractionFragment6 = (AbsAudienceInteractionFragment) this.LIZ;
                        absAudienceInteractionFragment6.getClass();
                        RevenueStrategyWidget revenueStrategyWidgetLL2 = C1126800fQc.LIZIZ().lL2(absAudienceInteractionFragment6.LLJJI);
                        if (revenueStrategyWidgetLL2 != null) {
                            absAudienceInteractionFragment6.LLJJI.load(R.id.tfq, revenueStrategyWidgetLL2);
                        }
                        return Unit.LIZ;
                    }
                    break;
                case 1841716173:
                    if (str.equals("LinkMic")) {
                        this.LIZ.Aq();
                        this.LIZ.kh();
                        return Unit.LIZ;
                    }
                    break;
                case 1851387208:
                    if (str.equals("QuizCumulative")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).ZS();
                        return Unit.LIZ;
                    }
                    break;
                case 1916893788:
                    if (str.equals("ParterShip")) {
                        this.LIZ.ws();
                        return Unit.LIZ;
                    }
                    break;
                case 1919724590:
                    if (str.equals("RoomProfile")) {
                        this.LIZ.G8();
                        return Unit.LIZ;
                    }
                    break;
                case 1938606382:
                    if (str.equals("AudienceRankList")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).sT();
                        return Unit.LIZ;
                    }
                    break;
                case 1982491468:
                    if (str.equals("Banner")) {
                        ((AbsAudienceInteractionFragment) this.LIZ).RS();
                        return Unit.LIZ;
                    }
                    break;
                case 2055070993:
                    if (str.equals("Drawer")) {
                        this.LIZ.rG();
                        return Unit.LIZ;
                    }
                    break;
                case 2078831242:
                    if (str.equals("MiddleTouch")) {
                        this.LIZ.RB();
                        return Unit.LIZ;
                    }
                    break;
                case 2128599763:
                    if (str.equals("DrawGuess")) {
                        this.LIZ.a6();
                        return Unit.LIZ;
                    }
                    break;
                case 2140520320:
                    if (str.equals("GamePartnerShipInfo")) {
                        AbsAudienceInteractionFragment absAudienceInteractionFragment7 = (AbsAudienceInteractionFragment) this.LIZ;
                        absAudienceInteractionFragment7.getClass();
                        C0IK5.LIZIZ(absAudienceInteractionFragment7.LLLZL, new ARunnableS117S0100000_17(absAudienceInteractionFragment7, 68));
                        return Unit.LIZ;
                    }
                    break;
            }
        }
        return Boolean.FALSE;
    }

    public C1078170eAB(InterfaceC1078180eAC interfaceC1078180eAC) {
        this.LIZ = interfaceC1078180eAC;
    }
}
