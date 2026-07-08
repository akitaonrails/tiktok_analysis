package X;

import Y.ACListenerS150S0100000_15;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import avg.f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoSizeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoViewRealSizeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.IGuidenceAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.IApplyGuideAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAndAudienceRoleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.GuestInviteViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.IGuestInviteAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.live.room.MultiLiveUIChangeEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS133S0110000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0aPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934130aPr extends FrameLayout implements C1AXB, LifecycleOwner, InterfaceC937630aVV {
    public static final /* synthetic */ int LLLIIIIL = 0;
    public InterfaceC937840aVq LL;
    public final DataChannel LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public ViewGroup LLILZ;
    public ViewGroup LLILZIL;
    public ViewGroup LLILZLL;
    public C16F5 LLIZ;
    public LiveIconView LLIZLLLIL;
    public ViewGroup LLJ;
    public View LLJI;
    public View LLJIJIL;
    public ViewGroup LLJILJIL;
    public C476100Ilk LLJILJILJ;
    public IGuestInviteAbility LLJILLL;
    public final List<Function0<Unit>> LLJJ;
    public ViewStub LLJJI;
    public ViewStub LLJJIII;
    public View LLJJIJI;
    public IThemeAbility LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public final AwS594S0100000_15 LLJJJIL;
    public C933460aOm LLJJJJ;
    public IGuidenceAbility LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public C1324720kZq LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public C1324720kZq LLJLIL;
    public C1324720kZq LLJLILLLLZIIL;
    public C1324720kZq LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public final C01GW LLJZ;
    public ImageView LLJZIJLIL;
    public ImageView LLL;
    public IApplyGuideAbility LLLF;
    public Animator LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final LifecycleRegistry LLLIIII;

    private final int getAnchorEmptyLayoutId() {
        return R.layout.he0;
    }

    private final int getGuestEmptyLayoutId() {
        return R.layout.he4;
    }

    @Override // X.InterfaceC937630aVV
    public final void LIZLLL() {
        setGuidanceInfo(null);
        LJIILJJIL();
    }

    @Override // X.C1AXB
    public Boolean getAudioMute() {
        return null;
    }

    @Override // X.C1AXB
    public String getLinkMicId() {
        return null;
    }

    @Override // X.C1AXB
    public Long getUid() {
        return null;
    }

    @Override // X.C1AXB
    public Boolean getVideoMute() {
        return null;
    }

    @Override // X.C1AXB
    public final boolean isEmpty() {
        return true;
    }

    private final C987140bnM getAvatarImageLoadListener() {
        return (C987140bnM) this.LLJZ.getValue();
    }

    private final int getEmptyViewLayoutId() {
        DataChannel dataChannel = this.LLILLJJLI;
        return (dataChannel == null || !C500260Jjc.LJIIZILJ(dataChannel)) ? getGuestEmptyLayoutId() : getAnchorEmptyLayoutId();
    }

    private final GradientDrawable getNormalBgDrawable() {
        return (GradientDrawable) this.LLLII.getValue();
    }

    private final GradientDrawable getRoundCornerBgDrawable() {
        return (GradientDrawable) this.LLLI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934130aPr.LJIIIZ():void");
    }

    public final void LJIILIIL() {
        C20441214yg.LIZ("emptyMask#updateEmptyRequestText");
        if (C925790aCP.LIZ()) {
            DataChannel dataChannel = this.LLILLJJLI;
            if ((dataChannel != null ? dataChannel.gg0(MultiGuestAndAudienceRoleChannel.class) : null) == C01FV.GUEST) {
                C16F5 c16f5 = this.LLIZ;
                if (c16f5 != null) {
                    c16f5.setText(C497740JfY.LJIJI(2131842208));
                    return;
                }
                return;
            }
            C16F5 c16f52 = this.LLIZ;
            if (c16f52 != null) {
                c16f52.setText(C497740JfY.LJIJI(2131843977));
            }
        }
    }

    public final float getCornerRadiusOfAudience() {
        return (this.LLJJJ * 8.0f) / this.LLJJIJIL;
    }

    private final int getDrawableId() {
        return C917900Zzg.LIZ() ? R.drawable.ewy : R.drawable.ewx;
    }

    private final Drawable getEmptyBgDrawable() {
        return C936720aU2.LIZIZ() ? getNormalBgDrawable() : C930540aK4.LIZLLL() ? getRoundCornerBgDrawable() : getNormalBgDrawable();
    }

    private final View getOriginEmptyLayoutView() {
        return LinkCoreModelKt.currentUserIsAnchor() ? this.LLILZ : this.LLILZIL;
    }

    private final int getPos() {
        Layout layoutLJJLIIIJLLLLLLLZ;
        InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
        if (interfaceC937900aVwLJIIIIZZ == null || (layoutLJJLIIIJLLLLLLLZ = interfaceC937900aVwLJIIIIZZ.LJJLIIIJLLLLLLLZ()) == null || !layoutLJJLIIIJLLLLLLLZ.isFloatType()) {
            return getWindow().LJI() ? getWindow().LJIILL() : getWindow().LJIIIIZZ();
        }
        return -1;
    }

    public final void LJIIL() {
        getWindow().LJJIIJ().setBackground(null);
        setBackground(null);
        ViewGroup viewGroup = this.LLILZLL;
        if (viewGroup != null) {
            viewGroup.setBackground(getEmptyBgDrawable());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL() {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934130aPr.LJIILJJIL():void");
    }

    @Override // X.C1AXB
    public int getH() {
        return getHeight();
    }

    @Override // X.C1AXB
    public Integer getLogicPos() {
        return Integer.valueOf(getWindow().LJIILL());
    }

    @Override // X.C1AXB
    public Integer getUiPos() {
        return Integer.valueOf(getWindow().LJIIIIZZ());
    }

    @Override // X.C1AXB
    public int getW() {
        return getWidth();
    }

    @Override // android.view.View, X.C1AXB
    public int getX() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getLeft();
    }

    @Override // android.view.View, X.C1AXB
    public int getY() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC665370Q7z interfaceC665370Q7z;
        InterfaceC665370Q7z interfaceC665370Q7z2;
        MultiGuestThemeViewModel multiGuestThemeViewModelMG0;
        MultiGuestThemeViewModel multiGuestThemeViewModelMG02;
        InterfaceC665370Q7z interfaceC665370Q7z3;
        InterfaceC665370Q7z interfaceC665370Q7z4;
        Context contextLJJIIZI;
        super.onAttachedToWindow();
        this.LLLIIII.setCurrentState(Lifecycle.State.STARTED);
        IGuestInviteAbility iGuestInviteAbility = null;
        iGuidenceAbility = null;
        IGuidenceAbility iGuidenceAbility = null;
        iGuestInviteAbility = null;
        View viewTd = (getEmptyViewLayoutId() == 0 || (contextLJJIIZI = C520010KaN.LJJIIZI(getContext(), true)) == null) ? null : C786410Ut5.Td(C786410Ut5.ne(contextLJJIIZI), getEmptyViewLayoutId(), this, true);
        ViewGroup viewGroup = viewTd instanceof ViewGroup ? (ViewGroup) viewTd : null;
        this.LLILZLL = viewGroup;
        if (viewGroup != null) {
            View.OnClickListener aCListenerS150S0100000_15 = new ACListenerS150S0100000_15(this, 79);
            if (C1848410yCV.LIZ) {
                aCListenerS150S0100000_15 = new f(aCListenerS150S0100000_15);
            }
            a aVar = new a(aCListenerS150S0100000_15);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(aVar);
            ViewGroup viewGroup2 = this.LLILZLL;
            this.LLILZ = viewGroup2 != null ? (ViewGroup) viewGroup2.findViewById(R.id.h3v) : null;
            ViewGroup viewGroup3 = this.LLILZLL;
            this.LLIZLLLIL = viewGroup3 != null ? (LiveIconView) viewGroup3.findViewById(R.id.h35) : null;
            ViewGroup viewGroup4 = this.LLILZLL;
            this.LLIZ = viewGroup4 != null ? (C16F5) viewGroup4.findViewById(R.id.h38) : null;
            if (!LinkCoreModelKt.currentUserIsAnchor()) {
                this.LLILZIL = (ViewGroup) findViewById(R.id.mah);
                ViewGroup viewGroup5 = this.LLILZLL;
                ViewGroup viewGroup6 = viewGroup5 != null ? (ViewGroup) viewGroup5.findViewById(R.id.i7q) : null;
                this.LLJILJIL = viewGroup6;
                this.LLJ = viewGroup6 != null ? (ViewGroup) viewGroup6.findViewById(R.id.mah) : null;
                ViewGroup viewGroup7 = this.LLJILJIL;
                this.LLJI = viewGroup7 != null ? viewGroup7.findViewById(R.id.mai) : null;
                LJIILIIL();
            }
            this.LLJJI = (ViewStub) findViewById(R.id.jfl);
            this.LLJJIII = (ViewStub) findViewById(R.id.am9);
            if (C925150aBN.LJJIL(false, false, 3) || C925150aBN.LJJIIZI() || C925150aBN.LJJIIZI()) {
                LJIIJJI(true);
            } else {
                LJI(true);
            }
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.CQ2(MultiLiveUIChangeEvent.class, this, new AwS594S0100000_15(this, 362));
                dataChannel.DQ2(MultiGuestV3VideoSizeChannel.class, this, new AwS594S0100000_15(this, 351));
                dataChannel.DQ2(MultiGuestV3VideoViewRealSizeChannel.class, this, new AwS594S0100000_15(this, 352));
            }
            LJIILJJIL();
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        this.LLJJIJIIJIL = (dataChannel2 == null || (interfaceC665370Q7z4 = (InterfaceC665370Q7z) dataChannel2.gg0(C956790b0P.class)) == null) ? null : (IThemeAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z4, IThemeAbility.class, null);
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            DataChannel dataChannel3 = this.LLILLJJLI;
            if (dataChannel3 != null && (interfaceC665370Q7z3 = (InterfaceC665370Q7z) dataChannel3.gg0(C956790b0P.class)) != null) {
                iGuidenceAbility = (IGuidenceAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z3, IGuidenceAbility.class, null);
            }
            this.LLJJJJJIL = iGuidenceAbility;
        } else {
            DataChannel dataChannel4 = this.LLILLJJLI;
            this.LLLF = (dataChannel4 == null || (interfaceC665370Q7z2 = (InterfaceC665370Q7z) dataChannel4.gg0(C956790b0P.class)) == null) ? null : (IApplyGuideAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z2, IApplyGuideAbility.class, null);
            DataChannel dataChannel5 = this.LLILLJJLI;
            if (dataChannel5 != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel5.gg0(C956790b0P.class)) != null) {
                iGuestInviteAbility = (IGuestInviteAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IGuestInviteAbility.class, null);
            }
            this.LLJILLL = iGuestInviteAbility;
        }
        IThemeAbility iThemeAbility = this.LLJJIJIIJIL;
        if (iThemeAbility != null && (multiGuestThemeViewModelMG02 = iThemeAbility.MG0()) != null) {
            multiGuestThemeViewModelMG02.vQ2(new C2217371BqR() { // from class: X.0aPt
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C938810aXP) obj).LL;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C938810aXP) obj).LL = (Integer) obj2;
                }
            }, null, this, new AwS594S0100000_15(this, 359));
        }
        IThemeAbility iThemeAbility2 = this.LLJJIJIIJIL;
        if (iThemeAbility2 != null && (multiGuestThemeViewModelMG0 = iThemeAbility2.MG0()) != null) {
            multiGuestThemeViewModelMG0.vQ2(new C2217371BqR() { // from class: X.0aPv
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C938810aXP) obj).LLILLJJLI;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C938810aXP) obj).LLILLJJLI = (Integer) obj2;
                }
            }, null, this, new AwS594S0100000_15(this, 360));
        }
        DataChannel dataChannel6 = this.LLILLJJLI;
        if (dataChannel6 != null) {
            dataChannel6.CQ2(MultiGuestAndAudienceRoleChannel.class, this, new AwS594S0100000_15(this, 361));
        }
        C924790aAn.LIZLLL().LIZ(new C934240aQ2(this.LLJJJIL));
        LJIIL();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator it2 = ((ArrayList) this.LLJJ).iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
        ((ArrayList) this.LLJJ).clear();
        if (this.LLLIIII.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            Lifecycle.State currentState = this.LLLIIII.getCurrentState();
            Lifecycle.State state = Lifecycle.State.DESTROYED;
            if (currentState != state) {
                this.LLLIIII.setCurrentState(state);
            }
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C924790aAn.LIZLLL().LIZJ(new C934240aQ2(this.LLJJJIL));
    }

    public final DataChannel getDataChannel() {
        return this.LLILLJJLI;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LLLIIII;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC937630aVV
    public InterfaceC937840aVq getWindow() {
        return this.LL;
    }

    private final void setGuidanceInfo(C933460aOm c933460aOm) {
        this.LLJJJJ = c933460aOm;
        this.LLJLLL = false;
    }

    @Override // X.InterfaceC937640aVW
    public final void LIZ(AwS559S0100000_15 awS559S0100000_15) {
        ((ArrayList) this.LLJJ).add(awS559S0100000_15);
    }

    @Override // X.InterfaceC937630aVV
    public final void LIZJ(C933460aOm c933460aOm) {
        String idStr;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C934130aPr.class.getSimpleName());
        sbLIZ.append("_showGuidenceStyle user:");
        User user = c933460aOm.LIZ;
        if (user != null) {
            idStr = user.getIdStr();
        } else {
            idStr = null;
        }
        sbLIZ.append(idStr);
        C20441214yg.LIZIZ("live_guidence", C2188811AlT.LIZIZ(sbLIZ));
        setGuidanceInfo(c933460aOm);
        LJIILJJIL();
    }

    @Override // X.InterfaceC937640aVW
    public final InterfaceC943500aey LJ(C943450aet c943450aet) {
        View viewLJLLLL;
        Object objInvoke = null;
        if (this.LLJJIJI == null) {
            ViewStub viewStub = this.LLJJIII;
            if (viewStub != null) {
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            } else {
                viewLJLLLL = null;
            }
            this.LLJJIJI = viewLJLLLL;
        }
        View originEmptyLayoutView = getOriginEmptyLayoutView();
        View view = this.LLJJIJI;
        AwS451S0200000_15 awS451S0200000_15 = new AwS451S0200000_15(this, c943450aet, 4);
        if (originEmptyLayoutView != null && view != null) {
            objInvoke = awS451S0200000_15.invoke(originEmptyLayoutView, view);
        }
        return (InterfaceC943500aey) objInvoke;
    }

    public final void LJI(boolean z) {
        Drawable drawableLJIIJ;
        MultiGuestThemeViewModel multiGuestThemeViewModelMG0;
        C938810aXP state;
        Integer num;
        LJIIJ(this.LLJ, new AwS133S0110000_15(z, this, 4));
        if (this.LLILZLL != null) {
            LiveIconView liveIconView = this.LLIZLLLIL;
            if (liveIconView != null) {
                liveIconView.setIconTintAttr(R.attr.c9k);
                liveIconView.setBackgroundResource(0);
                IThemeAbility iThemeAbility = this.LLJJIJIIJIL;
                if (iThemeAbility != null && (multiGuestThemeViewModelMG0 = iThemeAbility.MG0()) != null && (state = multiGuestThemeViewModelMG0.getState()) != null && (num = state.LLILLJJLI) != null && (drawableLJIIJ = C497740JfY.LJIIJ(num.intValue())) != null) {
                    drawableLJIIJ.setAlpha((int) (0.9f * 255));
                } else {
                    drawableLJIIJ = C497740JfY.LJIIJ(getDrawableId());
                    if (drawableLJIIJ != null) {
                        drawableLJIIJ.setAlpha((int) (1.0f * 255));
                        if (drawableLJIIJ != null) {
                        }
                    }
                }
                liveIconView.setImageDrawable(drawableLJIIJ);
            }
            C16F5 c16f5 = this.LLIZ;
            if (c16f5 != null) {
                c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.c9i, c16f5.getContext()));
            }
        }
    }

    public final void LJII(View view) {
        ViewGroup viewGroup;
        C1324720kZq c1324720kZq;
        View viewFindViewById;
        ViewGroup viewGroup2;
        C1324720kZq c1324720kZq2;
        C1324720kZq c1324720kZq3;
        C1324720kZq c1324720kZq4;
        User user;
        TextView textView;
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            Long lValueOf = null;
            if (view != null) {
                viewGroup = (ViewGroup) view.findViewById(R.id.jfi);
            } else {
                viewGroup = null;
            }
            this.LLJJJJLIIL = viewGroup;
            if (view != null) {
                c1324720kZq = (C1324720kZq) view.findViewById(R.id.pn1);
            } else {
                c1324720kZq = null;
            }
            this.LLJJL = c1324720kZq;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.jfk);
            } else {
                viewFindViewById = null;
            }
            this.LLJJLIIIJLLLLLLLZ = viewFindViewById;
            C923190a8D.LIZJ("show");
            if (view != null) {
                viewGroup2 = (ViewGroup) view.findViewById(R.id.wof);
            } else {
                viewGroup2 = null;
            }
            this.LLJL = viewGroup2;
            if (view != null) {
                c1324720kZq2 = (C1324720kZq) view.findViewById(R.id.woc);
            } else {
                c1324720kZq2 = null;
            }
            this.LLJLIL = c1324720kZq2;
            if (view != null) {
                c1324720kZq3 = (C1324720kZq) view.findViewById(R.id.wod);
            } else {
                c1324720kZq3 = null;
            }
            this.LLJLILLLLZIIL = c1324720kZq3;
            if (view != null) {
                c1324720kZq4 = (C1324720kZq) view.findViewById(R.id.woe);
            } else {
                c1324720kZq4 = null;
            }
            this.LLJLL = c1324720kZq4;
            if (view != null && (textView = (TextView) view.findViewById(R.id.wog)) != null) {
                textView.setText(C497740JfY.LJIJI(2131856558));
            }
            ViewGroup viewGroup3 = this.LLJL;
            if (viewGroup3 != null) {
                C786410Ut5.K7(viewGroup3, new ACListenerS150S0100000_15(this, 72));
            }
            if (this.LLJLLIL) {
                ViewGroup viewGroup4 = this.LLJL;
                if (viewGroup4 != null) {
                    C786410Ut5.LJLZ(0, viewGroup4);
                }
                C1324720kZq c1324720kZq5 = this.LLJJL;
                if (c1324720kZq5 != null) {
                    C786410Ut5.LLJJIII(c1324720kZq5, 8);
                }
                View view2 = this.LLJJLIIIJLLLLLLLZ;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
            } else {
                ViewGroup viewGroup5 = this.LLJL;
                if (viewGroup5 != null) {
                    C786410Ut5.LJLZ(8, viewGroup5);
                }
                C1324720kZq c1324720kZq6 = this.LLJJL;
                if (c1324720kZq6 != null) {
                    C786410Ut5.LLJJIII(c1324720kZq6, 0);
                }
                View view3 = this.LLJJLIIIJLLLLLLLZ;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(0, view3);
                }
            }
            C930480aJy c930480aJy = C930480aJy.LIZ;
            C933460aOm c933460aOm = this.LLJJJJ;
            if (c933460aOm != null && (user = c933460aOm.LIZ) != null) {
                lValueOf = Long.valueOf(user.getId());
            }
            C930480aJy.LJJIJLIJ(c930480aJy, lValueOf, this.LLILLJJLI, getWindow().LJJIIJ().getLayoutParams().width, getWindow().LJJIIJ().getLayoutParams().height, this.LLJJL, false, null, 192);
            C1324720kZq c1324720kZq7 = this.LLJJL;
            if (c1324720kZq7 != null) {
                C786410Ut5.e8(c1324720kZq7, new ACListenerS150S0100000_15(this, 77));
            }
            View view4 = this.LLJJLIIIJLLLLLLLZ;
            if (view4 != null) {
                C786410Ut5.I7(new ACListenerS150S0100000_15(this, 78), view4);
            }
        }
    }

    public final void LJIIJJI(boolean z) {
        long followStatus;
        Room room;
        User owner;
        FollowInfo followInfo;
        LJIIJ(this.LLJ, null);
        if (z) {
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                followStatus = followInfo.getFollowStatus();
            } else {
                followStatus = 0;
            }
            C924640aAY.LIZIZ(followStatus, this.LLILLJJLI, "plus_button", true);
        }
    }

    @Override // X.InterfaceC937630aVV
    public void setGuestInviteGuideUI(List<? extends ImageModel> list) {
        GuestInviteViewModel viewModel;
        C937550aVN c937550aVN;
        Animator animatorLIZ;
        C476100Ilk c476100Ilk;
        ViewStub viewStub;
        this.LLLFZ = false;
        Animator animator = this.LLLFF;
        if (animator != null) {
            animator.cancel();
        }
        View viewLJLLLL = null;
        this.LLLFF = null;
        if (C930540aK4.LJFF() && list != null && !list.isEmpty()) {
            if (this.LLJIJIL == null) {
                ViewGroup viewGroup = this.LLILZLL;
                if (viewGroup != null && (viewStub = (ViewStub) viewGroup.findViewById(R.id.jap)) != null) {
                    viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                }
                this.LLJIJIL = viewLJLLLL;
            }
            View view = this.LLJIJIL;
            if (view != null) {
                this.LLJJJJLIIL = (ViewGroup) view.findViewById(R.id.dwi);
                this.LLJILJILJ = new C476100Ilk((FrameLayout) view.findViewById(R.id.i36), new C476110Ill(false, 0.0f, 0.0f, 0.0f, 15));
                if (list != null && (c476100Ilk = this.LLJILJILJ) != null) {
                    c476100Ilk.LIZJ(list);
                }
                IGuestInviteAbility iGuestInviteAbility = this.LLJILLL;
                if (iGuestInviteAbility != null && (viewModel = iGuestInviteAbility.getViewModel()) != null && (c937550aVN = (C937550aVN) viewModel.LLILZIL.getValue()) != null && (animatorLIZ = c937550aVN.LIZ(this.LLJJJJLIIL, this.LLIZLLLIL, this.LLIZ)) != null) {
                    this.LLLFZ = true;
                    animatorLIZ.start();
                    this.LLLFF = animatorLIZ;
                }
            }
        }
    }

    public void setWindow(InterfaceC937840aVq interfaceC937840aVq) {
        this.LL = interfaceC937840aVq;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    @Override // X.InterfaceC937630aVV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934130aPr.LIZIZ(boolean, boolean):void");
    }

    public final void LJIIIIZZ(ImageModel imageModel, List<ImageModel> list) {
        if (list != null) {
            if (!this.LLJLLL && C500260Jjc.LJJJJIZL(this.LLJL)) {
                this.LLJLLL = true;
                if (list.size() >= 3) {
                    C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ((ImageModel) ListProtector.get(list, 0));
                    c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
                    Boolean bool = Boolean.TRUE;
                    c1324610kZfLJIIIZ.LJIILIIL = bool;
                    c1324610kZfLJIIIZ.LJIIL = getAvatarImageLoadListener();
                    c1324610kZfLJIIIZ.LJJI(this.LLJLIL);
                    C1324610kZf c1324610kZfLJIIIZ2 = C1819620xS4.LIZ().LJIIIZ((ImageModel) ListProtector.get(list, 1));
                    c1324610kZfLJIIIZ2.LJIIIZ = R.drawable.el_;
                    c1324610kZfLJIIIZ2.LJIILIIL = bool;
                    c1324610kZfLJIIIZ2.LJIIL = getAvatarImageLoadListener();
                    c1324610kZfLJIIIZ2.LJJI(this.LLJLILLLLZIIL);
                    C1324610kZf c1324610kZfLJIIIZ3 = C1819620xS4.LIZ().LJIIIZ((ImageModel) ListProtector.get(list, 2));
                    c1324610kZfLJIIIZ3.LJIIIZ = R.drawable.el_;
                    c1324610kZfLJIIIZ3.LJIILIIL = bool;
                    c1324610kZfLJIIIZ3.LJIIL = getAvatarImageLoadListener();
                    c1324610kZfLJIIIZ3.LJJI(this.LLJLL);
                    return;
                }
                return;
            }
            return;
        }
        C1324720kZq c1324720kZq = this.LLJJL;
        if (c1324720kZq != null && !this.LLJLLL && C500260Jjc.LJJJJIZL(c1324720kZq)) {
            this.LLJLLL = true;
            if (imageModel == null) {
                this.LLJLLL = false;
            }
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                C1324610kZf c1324610kZfLJIIIZ4 = C1819620xS4.LIZ().LJIIIZ(imageModel);
                c1324610kZfLJIIIZ4.LJIIIZ = R.drawable.el_;
                int width = c1324720kZq.getWidth();
                int height = c1324720kZq.getHeight();
                c1324610kZfLJIIIZ4.LJ = width;
                c1324610kZfLJIIIZ4.LJFF = height;
                c1324610kZfLJIIIZ4.LJIILIIL = Boolean.TRUE;
                c1324610kZfLJIIIZ4.LJIIL = getAvatarImageLoadListener();
                c1324610kZfLJIIIZ4.LJJI(this.LLJJL);
                return;
            }
            C0JSS.LJIIIIZZ(c1324720kZq, imageModel, c1324720kZq.getWidth(), c1324720kZq.getHeight(), R.drawable.el_, getAvatarImageLoadListener());
        }
    }

    public final void LJIIJ(View view, Function0<Unit> function0) {
        ViewGroup viewGroup = this.LLJILJIL;
        if (viewGroup != null) {
            Iterator<View> it2 = new C09RD(viewGroup).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (c09re.hasNext()) {
                    View view2 = (View) c09re.next();
                    if (!Intrinsics.LJFF(view2, view)) {
                        if (view2.getVisibility() == 0) {
                            C439101nJ.LJI(view2);
                        }
                    } else if (view2.getVisibility() == 8) {
                        C12ES.LJIILL(0, view2);
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C934130aPr(InterfaceC937840aVq interfaceC937840aVq, DataChannel dataChannel, WindowMaskAssem windowMaskAssem, Context context) {
        super(context);
        this.LL = interfaceC937840aVq;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = windowMaskAssem;
        this.LLJJ = new ArrayList();
        this.LLJJIJIL = 720;
        this.LLJJJ = 720;
        this.LLJJJIL = new AwS594S0100000_15(this, 353);
        this.LLJZ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 296));
        this.LLLI = C930540aK4.LJJIJIL(new AwS416S0200000_15(context, this, 32));
        this.LLLII = C452501pT.LIZIZ(new AwS550S0100000_6(context, 14));
        this.LLLIIII = new LifecycleRegistry(this);
    }
}
