package X;

import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS20S1100000_15;
import Y.AUListenerS264S0100000_15;
import Y.AfS181S0100000_12;
import Y.AfS184S0100000_15;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.mask.utils.MultiGuestScoreMarginOptSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayStatusChangeEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicTicketIconUrlSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLeaveGiftRankIsUSRegionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS664S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940240aZi extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final WeakReference<C938220aWS> LLJ;
    public final C11PQ<Boolean> LLJI;
    public final InterfaceC920220a3Q LLJIJIL;
    public C1105630esT LLJILJIL;
    public C1105630esT LLJILJILJ;
    public C1126540fQC LLJILLL;
    public LiveIconView LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public FrameLayout LLJJIJI;
    public long LLJJIJIIJIL;
    public final C2252321DDq LLJJIJIL;
    public final C2252321DDq LLJJJ;
    public final C2252321DDq LLJJJIL;
    public String LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public InterfaceC940910aan LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public String LLJLIL;
    public final C940270aZl LLJLILLLLZIIL;
    public ValueAnimator LLJLL;
    public ValueAnimator LLJLLIL;

    private final C1AGN getExpressionHelper() {
        return (C1AGN) this.LLJJJJLIIL.getValue();
    }

    private final InterfaceC946970akZ getLetsDanceService() {
        return (InterfaceC946970akZ) this.LLJJL.getValue();
    }

    private final Function1<C938160aWM, Unit> getPlayStatusObserver() {
        return (Function1) this.LLJJJJJIL.getValue();
    }

    private final User getTargetUser() {
        String str;
        C11PQ<List<C2262071DgL>> c11pq;
        List<C2262071DgL> listLJLZ;
        C2262071DgL c2262071DgL;
        C938220aWS c938220aWS = this.LLJ.get();
        if (c938220aWS == null) {
            return null;
        }
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null) {
            str = "";
        }
        C938230aWT c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false);
        if (c938230aWTLIZJ == null || (c11pq = c938230aWTLIZJ.LJ) == null || (listLJLZ = c11pq.LJLZ()) == null || (c2262071DgL = (C2262071DgL) C13LP.LJJJLL(listLJLZ)) == null) {
            return null;
        }
        return c2262071DgL.LIZ;
    }

    public final boolean LJIIJJI() {
        User targetUser;
        C938220aWS c938220aWS = this.LLJ.get();
        if (c938220aWS == null || (targetUser = getTargetUser()) == null) {
            return true;
        }
        String strLJIIJ = c938220aWS.LJIIJ(targetUser.getId());
        return a0.LJJJIL(strLJIIJ) || Intrinsics.LJFF(strLJIIJ, "default");
    }

    public final boolean LJIIL() {
        String strLJIIJ = null;
        if (this.LLJIJIL.getPageType() != EnumC940090aZT.FEED) {
            InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
            if (C500260Jjc.LJJJI(interfaceC302601FgLIZ != null ? Boolean.valueOf(interfaceC302601FgLIZ.LJIJI()) : null)) {
                return true;
            }
            InterfaceC927690aFT interfaceC927690aFTLIZ = C924220a9s.LIZ();
            if (C500260Jjc.LJJJI(interfaceC927690aFTLIZ != null ? Boolean.valueOf(interfaceC927690aFTLIZ.LJFF()) : null)) {
                return true;
            }
            InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
            return C500260Jjc.LJJJI(interfaceC938530aWxLIZ != null ? Boolean.valueOf(interfaceC938530aWxLIZ.LJIIJ()) : null);
        }
        C938220aWS c938220aWS = this.LLJ.get();
        if (c938220aWS != null) {
            User targetUser = getTargetUser();
            if (targetUser == null) {
                return false;
            }
            strLJIIJ = c938220aWS.LJIIJ(targetUser.getId());
        }
        boolean z = (Intrinsics.LJFF(strLJIIJ, "default_highlight") || Intrinsics.LJFF(strLJIIJ, "default")) ? false : true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isInPlayMode:");
        sbLIZ.append(z);
        C939200aY2.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public final void LJIILIIL() {
        boolean zIsInUS = MultiGuestLeaveGiftRankIsUSRegionSetting.INSTANCE.isInUS();
        if (zIsInUS) {
            C940280aZm.LIZ(getContext(), getDataChannel());
        } else {
            if (zIsInUS) {
                throw new C1954807lC();
            }
            User targetUser = getTargetUser();
            C01ZG.LIZ(getContext(), Long.valueOf(targetUser != null ? targetUser.getId() : 0L));
        }
    }

    public final void LJIILL() {
        View view = this.LLJJIII;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        FrameLayout frameLayout = this.LLJJIJI;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
    }

    public final boolean LJIIJ() {
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<Boolean> c11pq;
        Boolean boolLJLZ;
        PosIdentity posIdentity = getWindow().getPosIdentity();
        boolean z = false;
        if (posIdentity != null && posIdentity.type == 1 && (str = posIdentity.value) != null && (c938220aWS = this.LLJ.get()) != null && (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) != null && (c11pq = c938230aWTLIZJ.LJIIL) != null && (boolLJLZ = c11pq.LJLZ()) != null && C500260Jjc.LJJJI(boolLJLZ)) {
            z = true;
        }
        return !z;
    }

    public final void LJJIIJ() {
        if (C01ZE.LIZ()) {
            return;
        }
        C176600m4.LIZJ(new AwS559S0100000_15(this, 1125));
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return Integer.valueOf(R.layout.htu);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        PosIdentity posIdentity;
        final String str;
        final C938230aWT c938230aWTLIZJ;
        C947420alI c947420alILJII;
        String str2;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view;
        super.onAttachedToWindow();
        getCompositeDisposable().LIZ(new C11IW(this.LLJI.LJJIFFI().LJJIJIIJIL(new AfS181S0100000_12(this, 317))).LJIILL().LJIIZILJ());
        C1105630esT c1105630esT = (C1105630esT) findViewById(R.id.pn8);
        c1105630esT.setOptState(false);
        if (LJII()) {
            c1105630esT.LJJJI(R.style.a9k);
        }
        this.LLJILJIL = c1105630esT;
        C1105630esT c1105630esT2 = (C1105630esT) findViewById(R.id.pn9);
        c1105630esT2.setOptState(false);
        if (LJII()) {
            c1105630esT2.LJJJI(R.style.a9k);
        }
        this.LLJILJILJ = c1105630esT2;
        this.LLJILLL = (C1126540fQC) findViewById(R.id.pn_);
        this.LLJJ = (LiveIconView) findViewById(R.id.pna);
        View viewFindViewById = findViewById(R.id.mgt);
        this.LLJJI = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS150S0100000_15(this, 293), viewFindViewById);
        }
        this.LLJJIII = findViewById(R.id.mgu);
        this.LLJJIJI = (FrameLayout) findViewById(R.id.fc8);
        if (LJII() && (view = this.LLJJIII) != null) {
            view.setBackgroundResource(R.drawable.ea_);
        }
        EnumC947440alK enumC947440alK = null;
        if (MultiGuestScoreMarginOptSetting.INSTANCE.getValue()) {
            View view2 = this.LLJJIII;
            ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.rightMargin = 0;
                View view3 = this.LLJJIII;
                if (view3 != null) {
                    C786410Ut5.W5(view3, marginLayoutParams);
                }
            }
        }
        if (getWindow().getShapeDescriptor().LIZ.width() >= ((int) C497740JfY.LIZIZ(64.0f))) {
            C1126540fQC c1126540fQC = this.LLJILLL;
            if (c1126540fQC == null) {
                c1126540fQC = null;
            }
            C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ(10.0f), c1126540fQC);
            C1126540fQC c1126540fQC2 = this.LLJILLL;
            if (c1126540fQC2 == null) {
                c1126540fQC2 = null;
            }
            C500260Jjc.LJJZ((int) C497740JfY.LIZIZ(10.0f), c1126540fQC2);
        } else {
            C1126540fQC c1126540fQC3 = this.LLJILLL;
            if (c1126540fQC3 == null) {
                c1126540fQC3 = null;
            }
            C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ(7.0f), c1126540fQC3);
            C1126540fQC c1126540fQC4 = this.LLJILLL;
            if (c1126540fQC4 == null) {
                c1126540fQC4 = null;
            }
            C500260Jjc.LJJZ((int) C497740JfY.LIZIZ(7.0f), c1126540fQC4);
        }
        if (C01ZE.LIZ()) {
            PosIdentity posIdentity2 = getWindow().getPosIdentity();
            if (posIdentity2 != null && posIdentity2.type == 1 && (str2 = posIdentity2.value) != null && (c938220aWS = this.LLJ.get()) != null && (c938230aWTLIZJ2 = c938220aWS.LIZJ(str2, false, false)) != null) {
                getCompositeDisposable().LIZ(new C11IW(c938230aWTLIZJ2.LJI.LJJIFFI().LJJIJIIJIL(new AfS184S0100000_15(this, 232))).LJIILL().LJIIZILJ());
            }
        } else {
            final C938220aWS c938220aWS2 = this.LLJ.get();
            if (c938220aWS2 != null && (posIdentity = getWindow().getPosIdentity()) != null && posIdentity.type == 1 && (str = posIdentity.value) != null && (c938230aWTLIZJ = c938220aWS2.LIZJ(str, false, false)) != null) {
                getCompositeDisposable().LIZ(new C11IW(C11NZ.LJIIJ(c938230aWTLIZJ.LJII.LJJIFFI(), c938220aWS2.LJII().LLJ.LJJIFFI(), new InterfaceC500500Jk0() { // from class: X.0Jk1
                    @Override // X.InterfaceC500500Jk0
                    public final Object apply(Object obj, Object obj2) {
                        return new Pair(obj, obj2);
                    }
                }).LJJIJIIJIL(new C09JN() { // from class: X.0aWZ
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        String strLJII;
                        C2262071DgL c2262071DgL;
                        List<UserFanTicket> list;
                        UserFanTicket next;
                        C1C7U.LIZ("ScoreBizViewElement@17eb.setFanTicketObservableByInfoCenter$1$1$1$2");
                        long jLongValue = ((Number) ((Pair) obj).getFirst()).longValue();
                        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
                        C940780aaa c940780aaa = null;
                        if (multiGuestDataHolder != null) {
                            strLJII = multiGuestDataHolder.LJII();
                        } else {
                            strLJII = null;
                        }
                        List<C2262071DgL> listLJLZ = c938230aWTLIZJ.LJ.LJLZ();
                        if (listLJLZ != null && (c2262071DgL = (C2262071DgL) C13LP.LJJJLL(listLJLZ)) != null) {
                            long id = c2262071DgL.getId();
                            C938220aWS c938220aWS3 = c938220aWS2;
                            String str3 = str;
                            FanTicketRoomNoticeContent fanTicketRoomNoticeContent = c938220aWS3.LJII().LLIZLLLIL;
                            if (fanTicketRoomNoticeContent != null && (list = fanTicketRoomNoticeContent.userFanTicket) != null) {
                                Iterator<UserFanTicket> it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        UserFanTicket userFanTicket = next;
                                        if (userFanTicket.userId == id || (str3 != null && str3.length() != 0 && Intrinsics.LJFF(userFanTicket.LIZ, str3))) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                UserFanTicket userFanTicket2 = next;
                                if (userFanTicket2 != null) {
                                    C940780aaa c940780aaa2 = new C940780aaa(userFanTicket2.animationName, userFanTicket2.iconName);
                                    userFanTicket2.animationName = null;
                                    c940780aaa = c940780aaa2;
                                }
                            }
                        }
                        this.LJIJ(strLJII, jLongValue, c940780aaa);
                        C1C7U.LIZIZ("ScoreBizViewElement@17eb.setFanTicketObservableByInfoCenter$1$1$1$2");
                    }
                })).LJIILL().LJIIZILJ());
            }
        }
        getDataChannel().BQ2(this, PlayStatusChangeEvent.class, getPlayStatusObserver());
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            interfaceC302601FgLIZ.LJFF(this.LLJLILLLLZIIL);
        }
        LJJIIJ();
        InterfaceC946970akZ letsDanceService = getLetsDanceService();
        this.LLJJLIIIJLLLLLLLZ = letsDanceService != null ? letsDanceService.LIZ(new AwS664S0100000_15(this, 18)) : null;
        InterfaceC946970akZ letsDanceService2 = getLetsDanceService();
        if (letsDanceService2 != null && (c947420alILJII = letsDanceService2.LJII()) != null) {
            enumC947440alK = c947420alILJII.LIZJ;
        }
        if (enumC947440alK == EnumC947440alK.PLAYING) {
            C439101nJ.LJI(this);
        } else {
            C12ES.LJIILL(0, this);
        }
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLJLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLJLLIL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        getDataChannel().HQ2(this, PlayStatusChangeEvent.class, getPlayStatusObserver());
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            interfaceC302601FgLIZ.LJIIIZ(this.LLJLILLLLZIIL);
        }
        InterfaceC940910aan interfaceC940910aan = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC940910aan != null) {
            interfaceC940910aan.unsubscribe();
        }
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.SCORE;
    }

    public final void LJIIIZ(int i) {
        ArrayList<View> arrayList = new ArrayList();
        C1105630esT c1105630esT = this.LLJILJILJ;
        if (c1105630esT != null) {
            arrayList.add(c1105630esT);
        }
        C1105630esT c1105630esT2 = this.LLJILJIL;
        if (c1105630esT2 == null) {
            c1105630esT2 = null;
        }
        arrayList.add(c1105630esT2);
        for (View view : arrayList) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMarginStart(i);
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    public final void LJIILLIIL(String str) {
        C1126540fQC c1126540fQC = null;
        if (TextUtils.isEmpty(str)) {
            MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
            if (multiGuestDataHolder != null) {
                str = multiGuestDataHolder.LJII();
            } else {
                str = null;
            }
        }
        if (str != null) {
            if (!TextUtils.isEmpty(str) && Intrinsics.LJFF(str, this.LLJLIL) && this.LLJL) {
                return;
            }
            this.LLJLIL = str;
            C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
            url.LJJ = Boolean.FALSE;
            url.LJIIIZ = R.drawable.emi;
            url.LJIIL = new C987140bnM(this, 14);
            C1126540fQC c1126540fQC2 = this.LLJILLL;
            if (c1126540fQC2 != null) {
                c1126540fQC = c1126540fQC2;
            }
            url.LJJI(c1126540fQC);
            return;
        }
        C1126540fQC c1126540fQC3 = this.LLJILLL;
        if (c1126540fQC3 != null) {
            c1126540fQC = c1126540fQC3;
        }
        c1126540fQC.setActualImageResource(R.drawable.emi);
    }

    public final void LJIIZILJ(long j) {
        String upperCase = C1850730yGF.LJFF(j).toUpperCase(Locale.ROOT);
        if (LJIIL()) {
            LJIL(upperCase);
            return;
        }
        C1105630esT c1105630esT = this.LLJILJIL;
        if (c1105630esT == null) {
            c1105630esT = null;
        }
        if (Intrinsics.LJFF(upperCase, String.valueOf(c1105630esT.getText()))) {
            return;
        }
        LJIJJLI(upperCase);
    }

    public final void LJIJI(C940260aZk c940260aZk) {
        String str;
        LinkMicTicketIconUrlSetting linkMicTicketIconUrlSetting = LinkMicTicketIconUrlSetting.INSTANCE;
        String str2 = c940260aZk.LIZLLL;
        if (str2 == null) {
            str2 = "";
        }
        String iconValueByName = linkMicTicketIconUrlSetting.getIconValueByName(str2);
        Integer iconBgColorByName = linkMicTicketIconUrlSetting.getIconBgColorByName(c940260aZk.LIZLLL);
        if (!LJIIJ() && (str = c940260aZk.LJ) != null && str.length() != 0 && getExpressionHelper().LIZJ(iconBgColorByName, iconValueByName, c940260aZk.LJ, c940260aZk.LIZLLL)) {
            LJIJJ(c940260aZk.LIZJ, c940260aZk.LIZIZ, c940260aZk.LIZ);
            return;
        }
        LJIILLIIL(iconValueByName);
        LJJI(c940260aZk.LIZLLL);
        LJIJJ(c940260aZk.LIZJ, c940260aZk.LIZIZ, c940260aZk.LIZ);
    }

    public final void LJIJJLI(final String str) {
        int height;
        final int measuredWidth;
        View view;
        C1105630esT c1105630esT = this.LLJILJIL;
        C1105630esT c1105630esT2 = null;
        if (c1105630esT == null) {
            c1105630esT = null;
        }
        Object parent = c1105630esT.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            height = view.getHeight();
        } else {
            C1105630esT c1105630esT3 = this.LLJILJIL;
            if (c1105630esT3 == null) {
                c1105630esT3 = null;
            }
            height = c1105630esT3.getHeight();
        }
        float f = height;
        C1105630esT c1105630esT4 = this.LLJILJIL;
        if (c1105630esT4 == null) {
            c1105630esT4 = null;
        }
        C786410Ut5.rd(c1105630esT4, 0.0f);
        C1105630esT c1105630esT5 = this.LLJILJIL;
        if (c1105630esT5 == null) {
            c1105630esT5 = null;
        }
        final int measuredWidth2 = c1105630esT5.getMeasuredWidth();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (-1.0f) * f);
        this.LLJLL = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator = this.LLJLL;
        if (valueAnimator != null) {
            valueAnimator.setDuration(250L);
        }
        ValueAnimator valueAnimator2 = this.LLJLL;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS264S0100000_15(this, 16));
        }
        ValueAnimator valueAnimator3 = this.LLJLL;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
        C1105630esT c1105630esT6 = this.LLJILJILJ;
        if (c1105630esT6 != null) {
            C786410Ut5.LLLF(c1105630esT6, 0);
        }
        C1105630esT c1105630esT7 = this.LLJILJILJ;
        if (c1105630esT7 != null) {
            c1105630esT7.setText(str);
        }
        C1105630esT c1105630esT8 = this.LLJILJILJ;
        if (c1105630esT8 != null) {
            c1105630esT8.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        C1105630esT c1105630esT9 = this.LLJILJILJ;
        if (c1105630esT9 != null) {
            measuredWidth = c1105630esT9.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        if (measuredWidth >= measuredWidth2) {
            measuredWidth2 = measuredWidth;
        }
        if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow()) {
            C1105630esT c1105630esT10 = this.LLJILJIL;
            if (c1105630esT10 != null) {
                c1105630esT2 = c1105630esT10;
            }
            LJIILJJIL(c1105630esT2, measuredWidth2);
        }
        C1105630esT c1105630esT11 = this.LLJILJILJ;
        if (c1105630esT11 != null) {
            C786410Ut5.rd(c1105630esT11, f);
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f, 0.0f);
        this.LLJLLIL = valueAnimatorOfFloat2;
        if (valueAnimatorOfFloat2 != null) {
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator4 = this.LLJLLIL;
        if (valueAnimator4 != null) {
            valueAnimator4.setDuration(250L);
        }
        ValueAnimator valueAnimator5 = this.LLJLLIL;
        if (valueAnimator5 != null) {
            valueAnimator5.addUpdateListener(new AUListenerS264S0100000_15(this, 17));
        }
        ValueAnimator valueAnimator6 = this.LLJLLIL;
        if (valueAnimator6 != null) {
            valueAnimator6.addListener(new Animator.AnimatorListener() { // from class: X.0aZj
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (this.LL.LJIIL()) {
                        return;
                    }
                    String realTag = this.LL.getRealTag();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("animatorScrollIn onAnimationEnd,  countStr=");
                    sbLIZ.append(str);
                    C937310aUz.LJII(realTag, C2188811AlT.LIZIZ(sbLIZ));
                    C1105630esT c1105630esT12 = this.LL.LLJILJILJ;
                    if (c1105630esT12 != null) {
                        C786410Ut5.LLLF(c1105630esT12, 8);
                    }
                    C1105630esT c1105630esT13 = this.LL.LLJILJIL;
                    C1105630esT c1105630esT14 = null;
                    if (c1105630esT13 == null) {
                        c1105630esT13 = null;
                    }
                    C786410Ut5.rd(c1105630esT13, 0.0f);
                    C1105630esT c1105630esT15 = this.LL.LLJILJIL;
                    if (c1105630esT15 == null) {
                        c1105630esT15 = null;
                    }
                    c1105630esT15.setText(str);
                    if (!MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow()) {
                        C1105630esT c1105630esT16 = this.LL.LLJILJIL;
                        if (c1105630esT16 != null) {
                            c1105630esT14 = c1105630esT16;
                        }
                        C940240aZi.LJIILJJIL(c1105630esT14, measuredWidth2);
                    } else {
                        C1105630esT c1105630esT17 = this.LL.LLJILJIL;
                        if (c1105630esT17 != null) {
                            c1105630esT14 = c1105630esT17;
                        }
                        C940240aZi.LJIILJJIL(c1105630esT14, measuredWidth);
                    }
                    View view2 = this.LL.LLJJIII;
                    if (view2 != null) {
                        C940240aZi.LJIILJJIL(view2, -2);
                    }
                    View view3 = this.LL.LLJJI;
                    if (view3 != null) {
                        C940240aZi.LJIILJJIL(view3, -2);
                    }
                }
            });
        }
        ValueAnimator valueAnimator7 = this.LLJLLIL;
        if (valueAnimator7 != null) {
            valueAnimator7.start();
        }
    }

    public final void LJIL(String str) {
        ValueAnimator valueAnimator = this.LLJLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLJLLIL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        C1105630esT c1105630esT = this.LLJILJIL;
        if (c1105630esT == null) {
            c1105630esT = null;
        }
        HandlerHook.viewPost(c1105630esT, new ARunnableS20S1100000_15(this, str, 5));
        C1105630esT c1105630esT2 = this.LLJILJILJ;
        if (c1105630esT2 != null) {
            C439101nJ.LJI(c1105630esT2);
        }
    }

    public final void LJJ(Integer num) {
        GradientDrawable gradientDrawable;
        if (num != null) {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{num.intValue(), num.intValue()});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(57.0f));
        } else {
            gradientDrawable = null;
        }
        LJJIFFI(gradientDrawable);
    }

    public final void LJJI(String str) {
        if (str == null) {
            return;
        }
        C2252321DDq c2252321DDq = this.LLJJJIL;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), str)) {
        }
        if (!Intrinsics.LJFF(str, "mg_default_without_bg") && !Intrinsics.LJFF(str, "mg_default_new_without_bg")) {
            LJJ(LinkMicTicketIconUrlSetting.INSTANCE.getIconBgColorByName(str));
        } else {
            LJJIFFI(C0UDZ.LIZ(R.drawable.e3i));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018b A[PHI: r0
      0x018b: PHI (r0v32 int) = (r0v30 int), (r0v41 int) binds: [B:91:0x0188, B:86:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(android.graphics.drawable.Drawable r14) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C940240aZi.LJJIFFI(android.graphics.drawable.Drawable):void");
    }

    public static final void LJIILJJIL(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public static final LayerDrawable LJJII(Drawable drawable, C013C c013c) {
        LayerDrawable layerDrawable;
        if ((drawable instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) drawable) != null) {
            c013c.element = true;
            return layerDrawable;
        }
        if (!C497740JfY.LJJ()) {
            Drawable drawableLIZ = C0UDZ.LIZ(R.drawable.e4v);
            if (drawableLIZ instanceof LayerDrawable) {
                return (LayerDrawable) drawableLIZ;
            }
        } else {
            Drawable drawableLIZ2 = C0UDZ.LIZ(R.drawable.e4w);
            if (drawableLIZ2 instanceof LayerDrawable) {
                return (LayerDrawable) drawableLIZ2;
            }
        }
        return null;
    }

    public final void LJIJ(String str, long j, C940780aaa c940780aaa) {
        Pair pair;
        String str2;
        LJJIIJ();
        if (c940780aaa != null && (str2 = c940780aaa.LIZIZ) != null && str2.length() != 0) {
            LinkMicTicketIconUrlSetting linkMicTicketIconUrlSetting = LinkMicTicketIconUrlSetting.INSTANCE;
            pair = new Pair(linkMicTicketIconUrlSetting.getIconValueByName(c940780aaa.LIZIZ), linkMicTicketIconUrlSetting.getIconBgColorByName(c940780aaa.LIZIZ));
        } else {
            pair = new Pair(str, null);
        }
        String str3 = (String) pair.getFirst();
        Integer num = (Integer) pair.getSecond();
        if (!LJIIJ() && c940780aaa != null && c940780aaa.LIZ != null && c940780aaa.LIZ.length() > 0 && getExpressionHelper().LIZJ(num, str3, c940780aaa.LIZ, c940780aaa.LIZIZ)) {
            LJIIZILJ(j);
            return;
        }
        LJIILLIIL(str3);
        LJJ(num);
        LJIIZILJ(j);
    }

    public final void LJIJJ(int i, int i2, long j) {
        Object value;
        Object value2;
        C2252321DDq c2252321DDq = this.LLJJJ;
        do {
            value = c2252321DDq.getValue();
            ((Number) value).intValue();
        } while (!c2252321DDq.compareAndSet(value, Integer.valueOf(i2)));
        C2252321DDq c2252321DDq2 = this.LLJJIJIL;
        do {
            value2 = c2252321DDq2.getValue();
            ((Number) value2).longValue();
        } while (!c2252321DDq2.compareAndSet(value2, Long.valueOf(j)));
        String upperCase = C1850730yGF.LJFF(j).toUpperCase(Locale.ROOT);
        C1105630esT c1105630esT = null;
        if (i == 2) {
            String strLJIJJ = C497740JfY.LJIJJ(2131852938, upperCase);
            C1105630esT c1105630esT2 = this.LLJILJIL;
            if (c1105630esT2 == null) {
                c1105630esT2 = null;
            }
            if (Intrinsics.LJFF(strLJIJJ, String.valueOf(c1105630esT2.getText()))) {
                return;
            }
            C1105630esT c1105630esT3 = this.LLJILJIL;
            if (c1105630esT3 != null) {
                c1105630esT = c1105630esT3;
            }
            LJIILJJIL(c1105630esT, -2);
            LJIL(strLJIJJ);
            return;
        }
        C1105630esT c1105630esT4 = this.LLJILJIL;
        if (c1105630esT4 != null) {
            c1105630esT = c1105630esT4;
        }
        if (Intrinsics.LJFF(upperCase, String.valueOf(c1105630esT.getText()))) {
            return;
        }
        LJIJJLI(upperCase);
    }

    public static final LayerDrawable LJJIII(LayerDrawable layerDrawable, C940240aZi c940240aZi, int i, boolean z, int i2) {
        Number numberValueOf;
        if (i != 100 && i2 > 0) {
            float fLIZIZ = C497740JfY.LIZIZ(14.0f);
            float f = i2;
            float f2 = 100;
            float f3 = (((((f - fLIZIZ) * i) / f2) + fLIZIZ) / f) * f2;
            if (f3 > 0.0f) {
                numberValueOf = Float.valueOf(f3);
            } else {
                numberValueOf = Integer.valueOf(i);
            }
        } else {
            numberValueOf = Integer.valueOf(i);
        }
        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.progress);
        if (drawableFindDrawableByLayerId != null) {
            if (z && drawableFindDrawableByLayerId.getLevel() != 10000 && numberValueOf.intValue() == 100) {
                C1105630esT c1105630esT = c940240aZi.LLJILJIL;
                if (c1105630esT == null) {
                    c1105630esT = null;
                }
                C954140aw8.LIZLLL(c1105630esT);
                HandlerHook.viewPost(c940240aZi, new ARunnableS115S0100000_15(c940240aZi, 202));
            }
            drawableFindDrawableByLayerId.setLevel(numberValueOf.intValue() * 100);
        }
        return layerDrawable;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0aZl] */
    public C940240aZi(Context context, DataChannel dataChannel, WeakReference<C938220aWS> weakReference, C957020b0m c957020b0m, C11PQ<Boolean> c11pq, InterfaceC920220a3Q interfaceC920220a3Q) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = weakReference;
        this.LLJI = c11pq;
        this.LLJIJIL = interfaceC920220a3Q;
        this.LLJJIJIL = C1BNE.LIZ(0L);
        this.LLJJJ = C1BNE.LIZ(0);
        this.LLJJJIL = C1BNE.LIZ("");
        this.LLJJJJ = "";
        this.LLJJJJJIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1124));
        this.LLJJJJLIIL = C930540aK4.LJJIJIL(new AwS416S0200000_15(c957020b0m, this, 114));
        this.LLJJL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(463));
        this.LLJLILLLLZIIL = new C01FR() { // from class: X.0aZl
            @Override // X.C01FR
            public final void LIZIZ() {
                C937310aUz.LIZLLL(this.LIZ.getRealTag(), "toStateShowing");
                this.LIZ.LJJIIJ();
            }

            @Override // X.C01FR
            public final void LIZJ() {
                C937310aUz.LIZLLL(this.LIZ.getRealTag(), "toStateIdle");
                this.LIZ.LJJIIJ();
            }

            @Override // X.C01FR
            public final void LIZLLL() {
                C937310aUz.LIZLLL(this.LIZ.getRealTag(), "toStateEnd");
                this.LIZ.LJJIIJ();
            }

            @Override // X.C01FR
            public final void LIZ(C01FL c01fl) {
                C937310aUz.LIZLLL(this.LIZ.getRealTag(), "toStateReady");
                this.LIZ.LJJIIJ();
            }
        };
    }
}
