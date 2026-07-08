package X;

import Y.ACListenerS150S0100000_15;
import Y.AfS184S0100000_15;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import avg.f;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiGuestAnchorMaskTouchEventChannel;
import com.bytedance.android.live.liveinteract.api.OnSelfWindowCreatedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.InvokeGiftPanelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3PreviewPanelV2OpenEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ShowUserListDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings.MultiGuestDataSourceOptSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings.MultiGuestSkipTouchEventWhenDrawGuessingSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.MultiGuestFixGiftLeakSetting;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.dataChannel.BaseSingleTapEvent;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSupportNewLayoutInFeedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorTapFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestBlockHostViewDiggingSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLayoutDiggingAllowSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLayoutLeakFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.EnableMicSeatEmojiFeatureSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestSwitchSpotPassThroughDoubleTapSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import mf.a;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939730aYt extends ConstraintLayout implements LifecycleOwner {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final C940650aaN LLJJJIL;
    public final DataChannel LL;
    public final WeakReference<C938220aWS> LLILLJJLI;
    public C957020b0m LLILLL;
    public final FrameLayout LLILZ;
    public Pair<String, ? extends Map<EnumC939920aZC, ? extends List<? extends EnumC939900aZA>>> LLILZIL;
    public final InterfaceC920220a3Q LLILZLL;
    public final InterfaceC940060aZQ LLIZ;
    public final boolean LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C11NJ LLJIJIL;
    public final C01GW LLJILJIL;
    public final LifecycleRegistry LLJILJILJ;
    public Map<EnumC939920aZC, ? extends List<? extends AbstractC939840aZ4>> LLJILLL;
    public final Map<EnumC939920aZC, Integer> LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C304201Fw LLJJIJI;
    public C932420aN6 LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0aaN] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C939730aYt.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJIL = new C0UKQ() { // from class: X.0aaN
            @Override // X.C0UKQ
            public final boolean LIZIZ(MotionEvent motionEvent) {
                return false;
            }

            @Override // X.C0UKQ
            public final boolean LJFF(float f, float f2, long j) {
                return false;
            }
        };
    }

    private final int getTopUnderBannerWidth() {
        return 0;
    }

    private final C939980aZI getAnchorMaskTouchEventProxy() {
        return (C939980aZI) this.LLJJIII.getValue();
    }

    private final C11PQ<Boolean> getCountDownPbShownSubject() {
        return (C11PQ) this.LLJI.getValue();
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.LLJ.getValue();
    }

    private final C2182691Abb getGiftExpressionHelperV2() {
        return (C2182691Abb) this.LLJILJIL.getValue();
    }

    private final C935160aRW getGuestFollowAbility() {
        return (C935160aRW) this.LLJJIJIL.getValue();
    }

    private final ViewOnLayoutChangeListenerC986930bn1 getLayoutChangeListener() {
        return (ViewOnLayoutChangeListenerC986930bn1) this.LLJJI.getValue();
    }

    private final InterfaceC927510aFB getZoomService() {
        C304201Fw c304201Fw = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (InterfaceC927510aFB) c304201Fw.LIZ();
    }

    public final User E0() {
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<C2262071DgL>> c11pq;
        List<C2262071DgL> listLJLZ;
        C2262071DgL c2262071DgL;
        PosIdentity posIdentity = this.LLILLL.getPosIdentity();
        if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null || (c938220aWS = this.LLILLJJLI.get()) == null || (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) == null || (c11pq = c938230aWTLIZJ.LJ) == null || (listLJLZ = c11pq.LJLZ()) == null || (c2262071DgL = (C2262071DgL) C13LP.LJJJLL(listLJLZ)) == null) {
            return null;
        }
        return c2262071DgL.LIZ;
    }

    public final List<AbstractC939840aZ4> getAllBottomElements() {
        ArrayList arrayList = new ArrayList();
        List<? extends AbstractC939840aZ4> list = this.LLJILLL.get(EnumC939920aZC.BOTTOM_START);
        if (list != null) {
            arrayList.addAll(list);
        }
        List<? extends AbstractC939840aZ4> list2 = this.LLJILLL.get(EnumC939920aZC.BOTTOM_START_SECOND);
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        List<? extends AbstractC939840aZ4> list3 = this.LLJILLL.get(EnumC939920aZC.BOTTOM_END);
        if (list3 != null) {
            arrayList.addAll(list3);
        }
        return arrayList;
    }

    public final List<AbstractC939840aZ4> getAllElements() {
        Iterator<Map.Entry<EnumC939920aZC, ? extends List<? extends AbstractC939840aZ4>>> it2 = this.LLJILLL.entrySet().iterator();
        ArrayList arrayList = new ArrayList();
        while (it2.hasNext()) {
            arrayList.addAll(it2.next().getValue());
        }
        return arrayList;
    }

    public final EnumC939930aZD getLayoutBizViewType() {
        C957020b0m c957020b0m = this.LLILLL;
        if (c957020b0m.LLJIJIL) {
            return EnumC939930aZD.ANCHOR;
        }
        PosIdentity posIdentity = c957020b0m.getPosIdentity();
        if (posIdentity != null && posIdentity.type == 1) {
            return EnumC939930aZD.GUEST;
        }
        PosIdentity posIdentity2 = this.LLILLL.getPosIdentity();
        return (posIdentity2 == null || posIdentity2.type != 2) ? EnumC939930aZD.NO_GUEST : EnumC939930aZD.CONTENT;
    }

    public final Map<EnumC939920aZC, Integer> getLinearLayoutMap() {
        return C2097608Jq.LJIIZILJ(this.LLJJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:363:0x07c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0() {
        /*
            Method dump skipped, instruction units count: 2193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939730aYt.h0():void");
    }

    public final boolean i0() {
        List<PosIdentity> listLIZIZ;
        List<PosIdentity> listLIZIZ2;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        Boolean boolValueOf = null;
        if (!C01ZD.LIZ(7)) {
            if (this.LLILZLL.LJII() != 2) {
                InterfaceC927510aFB zoomService = getZoomService();
                if (!C500260Jjc.LJJJI(zoomService != null ? Boolean.valueOf(zoomService.LJJ()) : null)) {
                    InterfaceC927510aFB zoomService2 = getZoomService();
                    if (zoomService2 != null && (listLIZIZ = zoomService2.LIZIZ()) != null) {
                        boolValueOf = Boolean.valueOf(!listLIZIZ.isEmpty());
                    }
                    if (!C500260Jjc.LJJJI(boolValueOf)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (this.LLILZLL.LJJIIZI() || this.LLILZLL.LJII() != 2) {
            InterfaceC927510aFB zoomService3 = getZoomService();
            if (!C500260Jjc.LJJJI(zoomService3 != null ? Boolean.valueOf(zoomService3.LJJ()) : null)) {
                InterfaceC927510aFB zoomService4 = getZoomService();
                if (zoomService4 != null && (listLIZIZ2 = zoomService4.LIZIZ()) != null) {
                    boolValueOf = Boolean.valueOf(!listLIZIZ2.isEmpty());
                }
                if (!C500260Jjc.LJJJI(boolValueOf)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean j0() {
        int size = this.LLILZLL.LJIIIZ().size();
        if (MultiGuestDataSourceOptSetting.INSTANCE.getValue()) {
            int iLJII = this.LLILZLL.LJII();
            if (iLJII != 4 && iLJII != 3) {
                return false;
            }
        } else if (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).k81()) {
            return false;
        }
        if (this.LLILZLL.LJII() != 4 && size <= 1) {
            InterfaceC927510aFB zoomService = getZoomService();
            if (!C500260Jjc.LJJJI(zoomService != null ? Boolean.valueOf(zoomService.LJIIIIZZ()) : null)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l0() {
        /*
            r6 = this;
            X.0a3Q r0 = r6.LLILZLL
            int r0 = r0.LJII()
            r5 = 0
            r4 = 1
            if (r0 == r4) goto L22
            X.01GW<X.0aFK> r0 = X.C927600aFK.LIZIZ
            X.0aFK r0 = X.C307001Gy.LIZ()
            r0.getClass()
            r1 = 7
            boolean r0 = X.C01ZD.LIZ(r1)
            if (r0 == 0) goto L6d
            X.0a3Q r0 = r6.LLILZLL
            int r0 = r0.getPanelLayoutType()
            if (r0 != r1) goto L6d
        L22:
            boolean r0 = X.C930540aK4.LIZJ()
            boolean r0 = X.C932490aND.LIZ(r0)
            if (r0 == 0) goto L6d
            X.0b0m r2 = r6.LLILLL
            X.0a3Q r1 = r6.LLILZLL
            android.content.Context r0 = r6.getContext()
            boolean r0 = X.C941460abg.LIZIZ(r2, r1, r0, r4)
            if (r0 != 0) goto L6d
            r3 = 1
        L3b:
            X.0a3Q r0 = r6.LLILZLL
            int r0 = r0.getPanelLayoutType()
            if (r0 == r4) goto L6b
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt.LJJIFFI()
            if (r0 == 0) goto L6b
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r0 = r0.LIZIZ()
            if (r0 == 0) goto L6b
            int r1 = r0.showAvailableSpot
            r0 = 3
            if (r1 != r0) goto L6b
            r2 = 1
        L55:
            com.bytedance.android.live.liveinteract.api.IInteractService r0 = X.C915980Zwa.LIZLLL()
            int r0 = r0.getGuestCount()
            if (r0 <= 0) goto L69
            r1 = 1
        L60:
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.EnableMicSeatEmojiFeatureSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.EnableMicSeatEmojiFeatureSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 != 0) goto L6f
            return r3
        L69:
            r1 = 0
            goto L60
        L6b:
            r2 = 0
            goto L55
        L6d:
            r3 = 0
            goto L3b
        L6f:
            if (r3 != 0) goto L75
            if (r2 != 0) goto L75
            if (r1 == 0) goto L77
        L75:
            r5 = 1
            return r5
        L77:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939730aYt.l0():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0() {
        String str;
        User userE0;
        String str2;
        String str3;
        C930480aJy c930480aJy = C930480aJy.LIZ;
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        c930480aJy.getClass();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (C930480aJy.LJIJI(userLJIJJLI)) {
            LiveMode liveMode = (LiveMode) this.LL.gg0(LiveModeChannel.class);
            if (liveMode == null || C781520UlC.LJ(liveMode) || !C918090Zzz.LIZ()) {
                PosIdentity posIdentity = this.LLILLL.getPosIdentity();
                if (posIdentity != null && posIdentity.type == 1 && (str3 = posIdentity.value) != null) {
                    this.LL.LC0(InvokeGiftPanelEvent.class, new C932870aNp(E0(), str3, "anchor_link_guest"));
                }
            } else {
                u0(this, false, false, 3);
            }
        } else {
            LiveMode liveMode2 = (LiveMode) this.LL.gg0(LiveModeChannel.class);
            if (liveMode2 == null || C781520UlC.LJ(liveMode2) || !C930480aJy.LJIIIIZZ() || !((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).py0() || !C918090Zzz.LIZIZ() || ((userE0 = E0()) != null && userE0.getId() == UserService.getInstance().user().getCurrentUserId())) {
                User userE02 = E0();
                if (userE02 == null || userE02.getId() != UserService.getInstance().user().getCurrentUserId()) {
                    PosIdentity posIdentity2 = this.LLILLL.getPosIdentity();
                    if (posIdentity2 != null && posIdentity2.type == 1 && (str = posIdentity2.value) != null) {
                        this.LL.LC0(InvokeGiftPanelEvent.class, new C932870aNp(E0(), str, "anchor_link_guest"));
                    }
                } else if (C930540aK4.LJJJIL()) {
                    u0(this, true, false, 2);
                } else {
                    this.LL.LC0(MultiGuestV3PreviewPanelV2OpenEvent.class, new C924030a9Z(null, "selfie_window", "link_management_pannel"));
                }
            } else {
                PosIdentity posIdentity3 = this.LLILLL.getPosIdentity();
                if (posIdentity3 != null && posIdentity3.type == 1 && (str2 = posIdentity3.value) != null) {
                    User userE03 = E0();
                    C932420aN6 c932420aN6 = userE03 != null ? new C932420aN6(getContext(), (InterfaceC932640aNS) getGuestFollowAbility(), userE03, str2, this.LL, (String) (objArr2 == true ? 1 : 0), (C932100aMa) (objArr == true ? 1 : 0), 224) : null;
                    this.LLJJIJIIJIL = c932420aN6;
                    if (c932420aN6 != null) {
                        c932420aN6.LJJLIIIJILLIZJL(this);
                    }
                }
            }
        }
        User userE04 = E0();
        C0JGU.LIZ(userE04 != null ? Long.valueOf(userE04.getId()) : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C2182691Abb giftExpressionHelperV2;
        if (this.LLJILJILJ.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            Lifecycle.State currentState = this.LLJILJILJ.getCurrentState();
            Lifecycle.State state = Lifecycle.State.DESTROYED;
            if (currentState != state) {
                this.LLJILJILJ.setCurrentState(state);
            }
        }
        EnumC939930aZD layoutBizViewType = getLayoutBizViewType();
        EnumC939930aZD enumC939930aZD = EnumC939930aZD.ANCHOR;
        if (layoutBizViewType == enumC939930aZD) {
            C2182691Abb giftExpressionHelperV22 = getGiftExpressionHelperV2();
            if (giftExpressionHelperV22 != null) {
                giftExpressionHelperV22.LIZJ();
            }
        } else if (getLayoutBizViewType() == EnumC939930aZD.GUEST) {
            C2182691Abb giftExpressionHelperV23 = getGiftExpressionHelperV2();
            if (giftExpressionHelperV23 != null) {
                giftExpressionHelperV23.LIZJ();
            }
        } else if (MultiGuestFixGiftLeakSetting.INSTANCE.getValue() && (giftExpressionHelperV2 = getGiftExpressionHelperV2()) != null) {
            giftExpressionHelperV2.LIZJ();
        }
        if (getLayoutBizViewType() == enumC939930aZD) {
            this.LL.zW(MultiGuestAnchorMaskTouchEventChannel.class, LLJJJIL);
        } else {
            C932420aN6 c932420aN6 = this.LLJJIJIIJIL;
            if (c932420aN6 != null) {
                c932420aN6.dismiss();
            }
        }
        this.LLJIJIL.LJ();
        super.onDetachedFromWindow();
    }

    public final boolean p0() {
        return MultiGuestSwitchSpotPassThroughDoubleTapSetting.INSTANCE.isEnable() && C930540aK4.LIZJ() && C932490aND.LIZ(C930540aK4.LIZJ()) && l0();
    }

    public final void s0() {
        String str;
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkListUser linkListUser;
        PosIdentity posIdentity = this.LLILLL.getPosIdentity();
        if (posIdentity != null) {
            User user = null;
            if (posIdentity.type != 1 || (str = posIdentity.value) == null) {
                return;
            }
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
            if ((objLJIIIZ instanceof InterfaceC917640ZzG) && (interfaceC917640ZzG = (InterfaceC917640ZzG) objLJIIIZ) != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (linkListUser = (LinkListUser) abstractC928510aGnLIZ.LJFF(str)) != null) {
                user = linkListUser.user;
            }
            C1121570fIB c1121570fIB = new C1121570fIB(user);
            C930480aJy.LIZ.getClass();
            c1121570fIB.LJI = C930480aJy.LJJIIZI();
            c1121570fIB.LJII = C308401Hm.LIZ();
            c1121570fIB.LIZJ = "anchor_link_guest";
            this.LL.LC0(SendGiftEvent.class, c1121570fIB);
        }
    }

    public final boolean e0() {
        if (!C930540aK4.LIZJ()) {
            return false;
        }
        if (C916800Zxu.LIZLLL()) {
            return true;
        }
        return C932490aND.LIZ(C930540aK4.LIZJ()) && l0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJILJILJ.setCurrentState(Lifecycle.State.STARTED);
        if (C497740JfY.LJJ()) {
            setLayoutDirection(1);
        }
        Integer num = null;
        if (getLayoutBizViewType() == EnumC939930aZD.ANCHOR) {
            if (this.LLILLL.LLJIJIL && this.LLILZLL.getPanelLayoutType() == 1) {
                C20441214yg.LIZIZ("LayoutBizView_onAttachedToWindow", "don't need attach gift expression helper v2 in full screen");
            } else {
                C2182691Abb giftExpressionHelperV2 = getGiftExpressionHelperV2();
                if (giftExpressionHelperV2 != null) {
                    Iterator<Map.Entry<EnumC939920aZC, ? extends List<? extends AbstractC939840aZ4>>> it2 = this.LLJILLL.entrySet().iterator();
                    loop0: while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Map.Entry<EnumC939920aZC, ? extends List<? extends AbstractC939840aZ4>> next = it2.next();
                        EnumC939920aZC key = next.getKey();
                        List<? extends AbstractC939840aZ4> value = next.getValue();
                        if (!value.isEmpty()) {
                            Iterator<? extends AbstractC939840aZ4> it3 = value.iterator();
                            while (it3.hasNext()) {
                                if (it3.next().getElementType() == EnumC939900aZA.HOST_TAG) {
                                    num = (Integer) ((LinkedHashMap) this.LLJJ).get(key);
                                    break loop0;
                                }
                            }
                        }
                    }
                    giftExpressionHelperV2.LIZ(num);
                }
            }
            this.LL.zW(MultiGuestAnchorMaskTouchEventChannel.class, getAnchorMaskTouchEventProxy());
            this.LL.BQ2(this, BaseSingleTapEvent.class, new AwS594S0100000_15(this, 1128));
            return;
        }
        if (getLayoutBizViewType() == EnumC939930aZD.GUEST) {
            if (this.LLILLL.LLJILJIL) {
                this.LL.FQ2(OnSelfWindowCreatedEvent.class);
            }
            C2182691Abb giftExpressionHelperV22 = getGiftExpressionHelperV2();
            if (giftExpressionHelperV22 != null) {
                Iterator<Map.Entry<EnumC939920aZC, ? extends List<? extends AbstractC939840aZ4>>> it4 = this.LLJILLL.entrySet().iterator();
                loop2: while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Map.Entry<EnumC939920aZC, ? extends List<? extends AbstractC939840aZ4>> next2 = it4.next();
                    EnumC939920aZC key2 = next2.getKey();
                    List<? extends AbstractC939840aZ4> value2 = next2.getValue();
                    if (!value2.isEmpty()) {
                        Iterator<? extends AbstractC939840aZ4> it5 = value2.iterator();
                        while (it5.hasNext()) {
                            if (it5.next().getElementType() == EnumC939900aZA.SCORE) {
                                num = (Integer) ((LinkedHashMap) this.LLJJ).get(key2);
                                break loop2;
                            }
                        }
                    }
                }
                giftExpressionHelperV22.LIZ(num);
            }
            if (MultiGuestAnchorTapFixSetting.INSTANCE.enable() && MultiGuestBlockHostViewDiggingSetting.INSTANCE.enable()) {
                return;
            }
            View.OnClickListener aCListenerS150S0100000_15 = new ACListenerS150S0100000_15(this, 294);
            if (C1848410yCV.LIZ) {
                aCListenerS150S0100000_15 = new f(aCListenerS150S0100000_15);
            }
            a aVar = new a(aCListenerS150S0100000_15);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(aVar);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        if (C917910Zzh.LIZ(C930540aK4.LIZJ())) {
            try {
                Iterator<View> it2 = new C09RD(this).iterator();
                while (it2.hasNext()) {
                    it2.next().removeOnLayoutChangeListener(getLayoutChangeListener());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("removeAllViews e:");
                sbLIZ.append(th.getMessage());
                C937310aUz.LJII("LayoutBizView", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        super.removeAllViews();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LLJILJILJ;
    }

    private final void setEndToEndIfNeeded(C19ME c19me) {
        c19me.endToEnd = 0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zE0;
        if (getLayoutBizViewType() == EnumC939930aZD.ANCHOR) {
            if (MultiGuestSkipTouchEventWhenDrawGuessingSetting.INSTANCE.enable() && ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).o52(this.LL)) {
                return false;
            }
            int panelLayoutType = this.LLILZLL.getPanelLayoutType();
            if (MultiGuestBlockHostViewDiggingSetting.INSTANCE.enable()) {
                if (!C13LQ.LJIILLIIL(String.valueOf(panelLayoutType), MultiGuestLayoutDiggingAllowSetting.INSTANCE.getValue())) {
                    if (motionEvent != null && getGestureDetector().onTouchEvent(motionEvent)) {
                        return true;
                    }
                    return false;
                }
            }
            if (p0()) {
                if (C930540aK4.LIZJ() && C916800Zxu.LIZLLL()) {
                    zE0 = true;
                } else {
                    return false;
                }
            } else {
                zE0 = e0();
                if (zE0) {
                }
                return zE0;
            }
            if (motionEvent != null && motionEvent.getAction() == 1) {
                if (EnableMicSeatEmojiFeatureSetting.INSTANCE.isEnable()) {
                    u0(this, false, true, 1);
                } else {
                    this.LL.FQ2(ShowUserListDialog.class);
                    return zE0;
                }
            }
            return zE0;
        }
        if (getLayoutBizViewType() == EnumC939930aZD.GUEST) {
            if (MultiGuestAnchorTapFixSetting.INSTANCE.enable() && MultiGuestBlockHostViewDiggingSetting.INSTANCE.enable()) {
                if (motionEvent != null) {
                    C0UKQ c0ukq = (C0UKQ) this.LL.gg0(MultiGuestAnchorMaskTouchEventChannel.class);
                    if (c0ukq != null) {
                        if (!c0ukq.LJFF(motionEvent.getRawX(), motionEvent.getRawY(), this.LLILLL.getZOrder())) {
                            if (motionEvent == null) {
                                return false;
                            }
                        }
                    }
                    if (getGestureDetector().onTouchEvent(motionEvent)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0028 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<X.EnumC939920aZC, java.util.List<X.AbstractC939840aZ4>> z0(java.util.Map<X.EnumC939920aZC, ? extends java.util.List<? extends X.EnumC939900aZA>> r19) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939730aYt.z0(java.util.Map):java.util.Map");
    }

    public static void C0(C19ME c19me, C938370aWh c938370aWh) {
        c19me.setMarginStart(c938370aWh.LIZ);
        ((ViewGroup.MarginLayoutParams) c19me).topMargin = c938370aWh.LIZIZ;
        c19me.setMarginEnd(c938370aWh.LIZJ);
        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = c938370aWh.LIZLLL;
    }

    public final void B0(C957020b0m c957020b0m, Pair<String, ? extends Map<EnumC939920aZC, ? extends List<? extends EnumC939900aZA>>> pair) {
        C2182691Abb giftExpressionHelperV2;
        this.LLILLL = c957020b0m;
        Iterator<Map.Entry<EnumC939920aZC, ? extends List<? extends AbstractC939840aZ4>>> it2 = this.LLJILLL.entrySet().iterator();
        while (it2.hasNext()) {
            Iterator<? extends AbstractC939840aZ4> it3 = it2.next().getValue().iterator();
            while (it3.hasNext()) {
                it3.next().LLILLJJLI = c957020b0m;
            }
        }
        Map<EnumC939920aZC, ? extends List<? extends EnumC939900aZA>> second = this.LLILZIL.getSecond();
        Map<EnumC939920aZC, ? extends List<? extends EnumC939900aZA>> second2 = pair.getSecond();
        if (second.size() == second2.size()) {
            loop2: for (Map.Entry<EnumC939920aZC, ? extends List<? extends EnumC939900aZA>> entry : second.entrySet()) {
                List<? extends EnumC939900aZA> list = second2.get(entry.getKey());
                if (list != null && entry.getValue().size() == list.size()) {
                    Iterator<? extends EnumC939900aZA> it4 = entry.getValue().iterator();
                    while (it4.hasNext()) {
                        if (!list.contains(it4.next())) {
                        }
                    }
                }
                this.LLILZIL = pair;
                this.LLJILLL = z0(pair.getSecond());
                h0();
            }
        } else {
            this.LLILZIL = pair;
            this.LLJILLL = z0(pair.getSecond());
            h0();
            break;
        }
        if (MultiGuestLayoutLeakFixSetting.INSTANCE.enable()) {
            EnumC939930aZD layoutBizViewType = getLayoutBizViewType();
            if ((layoutBizViewType == EnumC939930aZD.ANCHOR || layoutBizViewType == EnumC939930aZD.GUEST) && (giftExpressionHelperV2 = getGiftExpressionHelperV2()) != null) {
                giftExpressionHelperV2.LIZIZ = c957020b0m;
                return;
            }
            return;
        }
        C2182691Abb giftExpressionHelperV22 = getGiftExpressionHelperV2();
        if (giftExpressionHelperV22 == null) {
            return;
        }
        giftExpressionHelperV22.LIZIZ = c957020b0m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u0(C939730aYt c939730aYt, boolean z, boolean z2, int i) {
        String str;
        User userE0;
        C932420aN6 c932420aN6;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        PosIdentity posIdentity = c939730aYt.LLILLL.getPosIdentity();
        if (posIdentity != null && posIdentity.type == 1 && (str = posIdentity.value) != null && (userE0 = c939730aYt.E0()) != null) {
            if (z) {
                Context context = c939730aYt.getContext();
                C935160aRW guestFollowAbility = c939730aYt.getGuestFollowAbility();
                DataChannel dataChannel = c939730aYt.LL;
                c932420aN6 = new C932420aN6(context, guestFollowAbility, userE0, str, dataChannel, "guest_control_popup_panel", C932440aN8.LIZIZ(C930540aK4.LJI(dataChannel)), EnumC932550aNJ.V3);
            } else if (z2) {
                c932420aN6 = new C932420aN6(c939730aYt.getContext(), c939730aYt.getGuestFollowAbility(), userE0, str, c939730aYt.LL, "guest_control_popup_panel", C932440aN8.LIZ(), EnumC932550aNJ.V3);
            } else {
                c932420aN6 = new C932420aN6(c939730aYt.getContext(), (InterfaceC932640aNS) c939730aYt.getGuestFollowAbility(), userE0, str, c939730aYt.LL, (String) null, (C932100aMa) (0 == true ? 1 : 0), 224);
            }
            c939730aYt.LLJJIJIIJIL = c932420aN6;
            c932420aN6.LJJLIIIJILLIZJL(c939730aYt);
        }
    }

    public C939730aYt(Context context, DataChannel dataChannel, WeakReference<C938220aWS> weakReference, C957020b0m c957020b0m, FrameLayout frameLayout, Pair<String, ? extends Map<EnumC939920aZC, ? extends List<? extends EnumC939900aZA>>> pair, InterfaceC920220a3Q interfaceC920220a3Q, InterfaceC940060aZQ interfaceC940060aZQ, boolean z) {
        C938220aWS c938220aWS;
        C11PQ<C938380aWi> c11pqLJ;
        super(context);
        this.LL = dataChannel;
        this.LLILLJJLI = weakReference;
        this.LLILLL = c957020b0m;
        this.LLILZ = frameLayout;
        this.LLILZIL = pair;
        this.LLILZLL = interfaceC920220a3Q;
        this.LLIZ = interfaceC940060aZQ;
        this.LLIZLLLIL = z;
        this.LLJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1130));
        this.LLJI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(465));
        C11NJ c11nj = new C11NJ();
        this.LLJIJIL = c11nj;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1131));
        this.LLJILJILJ = new LifecycleRegistry(this);
        this.LLJILLL = C2097608Jq.LJ();
        this.LLJJ = new LinkedHashMap();
        this.LLJJI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1133));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        this.LLJILLL = z0(this.LLILZIL.getSecond());
        if ((C917910Zzh.LIZ(C930540aK4.LIZJ()) || LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue()) && (c938220aWS = weakReference.get()) != null && (c11pqLJ = c938220aWS.LJ()) != null) {
            c11nj.LIZ(new C11IW(c11pqLJ.LJJIFFI().LJJIJIIJIL(new AfS184S0100000_15(this, 231))).LJIILL().LJIIZILJ());
        }
        h0();
        this.LLJJIII = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1129));
        this.LLJJIJI = new C304201Fw("ZOOM_SERVICE");
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1132));
    }
}
