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
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
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
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934120aPq extends FrameLayout implements C1AXB, LifecycleOwner, InterfaceC937630aVV {
    public static final /* synthetic */ int LLLI = 0;
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
    public View LLJILJILJ;
    public C476100Ilk LLJILLL;
    public ViewStub LLJJ;
    public ViewStub LLJJI;
    public View LLJJIII;
    public IThemeAbility LLJJIJI;
    public C933460aOm LLJJIJIIJIL;
    public IGuidenceAbility LLJJIJIL;
    public ViewGroup LLJJJ;
    public C1324720kZq LLJJJIL;
    public ViewGroup LLJJJJ;
    public C1324720kZq LLJJJJJIL;
    public C1324720kZq LLJJJJLIIL;
    public C1324720kZq LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public boolean LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public ImageView LLJLL;
    public ImageView LLJLLIL;
    public IApplyGuideAbility LLJLLL;
    public Animator LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public IGuestInviteAbility LLLF;
    public final List<Function0<Unit>> LLLFF;
    public final LifecycleRegistry LLLFFI;
    public final C01GW LLLFZ;

    private final int getAnchorEmptyLayoutId() {
        return R.layout.he0;
    }

    private final int getGuestEmptyLayoutId() {
        return R.layout.he4;
    }

    @Override // X.InterfaceC937630aVV
    public final void LIZLLL() {
        setGuidenceInfo(null);
        LJIILLIIL();
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
        return (C987140bnM) this.LLJLILLLLZIIL.getValue();
    }

    private final int getEmptyViewLayoutId() {
        DataChannel dataChannel = this.LLILLJJLI;
        return (dataChannel == null || !C500260Jjc.LJIIZILJ(dataChannel)) ? getGuestEmptyLayoutId() : getAnchorEmptyLayoutId();
    }

    private final GradientDrawable getNormalBgDrawable() {
        return (GradientDrawable) this.LLLFZ.getValue();
    }

    private final int getPos() {
        Layout layoutLJJLIIIJLLLLLLLZ;
        List<PosIdentity> listLJIIJJI;
        PosIdentity posIdentity;
        String str;
        Integer numLJJLIIJ;
        C918060Zzw c918060Zzw = C918060Zzw.LIZ;
        DataChannel dataChannel = this.LLILLJJLI;
        boolean zLJJJI = C500260Jjc.LJJJI(dataChannel != null ? Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel)) : null);
        c918060Zzw.getClass();
        if (!C918060Zzw.LIZ(zLJJJI)) {
            InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
            if (interfaceC937900aVwLJIIIIZZ == null || (layoutLJJLIIIJLLLLLLLZ = interfaceC937900aVwLJIIIIZZ.LJJLIIIJLLLLLLLZ()) == null || !layoutLJJLIIIJLLLLLLLZ.isFloatType()) {
                return getWindow().LJI() ? getWindow().LJIILL() : getWindow().LJIIIIZZ();
            }
            return -1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("window.uiPos() = ");
        sbLIZ.append(getWindow().LJIIIIZZ());
        sbLIZ.append(", ui_pos: ");
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        sbLIZ.append(interfaceC954180awCLLJLL != null ? interfaceC954180awCLLJLL.LJIIJJI() : null);
        C20441214yg.LIZIZ("EmptyMask", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 == null || (listLJIIJJI = interfaceC954180awCLLJLL2.LJIIJJI()) == null || (posIdentity = (PosIdentity) C13LP.LJJJLZIJ(getWindow().LJIIIIZZ(), listLJIIJJI)) == null || (str = posIdentity.value) == null || (numLJJLIIJ = C500260Jjc.LJJLIIJ(str)) == null) {
            return -1;
        }
        return numLJJLIIJ.intValue();
    }

    public final void LJI() {
        Drawable drawableLJIIIIZZ;
        LJIIL(this.LLJ, null);
        if (this.LLILZLL != null) {
            LiveIconView liveIconView = this.LLIZLLLIL;
            if (liveIconView != null && (drawableLJIIIIZZ = LJIIIIZZ(0.2f, getDrawableId())) != null) {
                liveIconView.setBackgroundResource(0);
                liveIconView.setImageDrawable(drawableLJIIIIZZ);
            }
            C16F5 c16f5 = this.LLIZ;
            if (c16f5 != null) {
                c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.c9g, getContext()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI() {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934120aPq.LJIIJJI():void");
    }

    public final void LJIILL() {
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

    private final int getDrawableId() {
        return C917900Zzg.LIZ() ? R.drawable.ewy : R.drawable.ewx;
    }

    private final View getOriginEmptyLayoutView() {
        return LinkCoreModelKt.currentUserIsAnchor() ? this.LLILZ : this.LLILZIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL() {
        /*
            r4 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "updateEmptyViewUi uid:"
            r1.append(r0)
            X.0aOm r0 = r4.LLJJIJIIJIL
            r2 = 0
            if (r0 == 0) goto L30
            com.bytedance.android.live.base.model.user.User r0 = r0.LIZ
            if (r0 == 0) goto L30
            java.lang.String r0 = r0.getIdStr()
        L16:
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "live_guidence"
            X.C20441214yg.LIZIZ(r0, r1)
            X.0aOm r3 = r4.LLJJIJIIJIL
            if (r3 == 0) goto L2e
            com.bytedance.android.live.base.model.user.User r0 = r3.LIZ
        L28:
            r1 = 0
            if (r0 == 0) goto L49
            if (r3 == 0) goto L38
            goto L32
        L2e:
            r0 = r2
            goto L28
        L30:
            r0 = r2
            goto L16
        L32:
            java.util.List<com.bytedance.android.live.base.model.ImageModel> r0 = r3.LJ     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L38
            r0 = 1
            goto L39
        L38:
            r0 = 0
        L39:
            r4.LLJJLIIIJLLLLLLLZ = r0     // Catch: java.lang.Throwable -> L58
            android.view.ViewStub r0 = r4.LLJJ     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L47
            android.view.View r0 = X.C786410Ut5.LJLLLL(r0)     // Catch: java.lang.Throwable -> L58
        L43:
            r4.LJIIIZ(r0)     // Catch: java.lang.Throwable -> L58
            goto L63
        L47:
            r0 = r2
            goto L43
        L49:
            android.view.ViewGroup r0 = r4.LLILZ
            if (r0 == 0) goto L50
            X.C12ES.LJIILL(r1, r0)
        L50:
            android.view.ViewGroup r0 = r4.LLJJJ
            if (r0 == 0) goto L80
            X.C439101nJ.LJI(r0)
            return
        L58:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            android.view.ViewStub r0 = r4.LLJJ
            if (r0 == 0) goto L63
            X.C12ES.LJIILL(r1, r0)
        L63:
            android.view.ViewGroup r0 = r4.LLILZ
            if (r0 == 0) goto L6a
            X.C439101nJ.LJI(r0)
        L6a:
            android.view.ViewGroup r0 = r4.LLJJJ
            if (r0 == 0) goto L71
            X.C12ES.LJIILL(r1, r0)
        L71:
            X.0aOm r1 = r4.LLJJIJIIJIL
            if (r1 == 0) goto L8e
            java.util.List<com.bytedance.android.live.base.model.ImageModel> r0 = r1.LJ
            if (r0 == 0) goto L83
            if (r1 == 0) goto L81
            java.util.List<com.bytedance.android.live.base.model.ImageModel> r0 = r1.LJ
        L7d:
            r4.LJIIJ(r2, r0)
        L80:
            return
        L81:
            r0 = r2
            goto L7d
        L83:
            if (r1 == 0) goto L8e
            com.bytedance.android.live.base.model.user.User r0 = r1.LIZ
            if (r0 == 0) goto L8e
            com.bytedance.android.live.base.model.ImageModel r0 = r0.getAvatarThumb()
            goto L8f
        L8e:
            r0 = r2
        L8f:
            r4.LJIIJ(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934120aPq.LJIILLIIL():void");
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
        ViewGroup.LayoutParams layoutParams;
        MultiGuestThemeViewModel multiGuestThemeViewModelMG0;
        MultiGuestThemeViewModel multiGuestThemeViewModelMG02;
        InterfaceC665370Q7z interfaceC665370Q7z3;
        InterfaceC665370Q7z interfaceC665370Q7z4;
        Context contextLJJIIZI;
        super.onAttachedToWindow();
        this.LLLFFI.setCurrentState(Lifecycle.State.STARTED);
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        View viewTd = (getEmptyViewLayoutId() == 0 || (contextLJJIIZI = C520010KaN.LJJIIZI(getContext(), true)) == null) ? null : C786410Ut5.Td(C786410Ut5.ne(contextLJJIIZI), getEmptyViewLayoutId(), this, false);
        ViewGroup viewGroup = viewTd instanceof ViewGroup ? (ViewGroup) viewTd : null;
        this.LLILZLL = viewGroup;
        if (viewGroup != null) {
            addView(viewGroup);
            View.OnClickListener aCListenerS150S0100000_15 = new ACListenerS150S0100000_15(this, 73);
            if (C1848410yCV.LIZ) {
                aCListenerS150S0100000_15 = new f(aCListenerS150S0100000_15);
            }
            View.OnClickListener aVar = new a(aCListenerS150S0100000_15);
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
            ViewGroup viewGroup5 = this.LLILZLL;
            if (viewGroup5 != null) {
                viewGroup5.setBackgroundColor(R.attr.eot);
            }
            this.LLJJ = (ViewStub) findViewById(R.id.jfl);
            this.LLJJI = (ViewStub) findViewById(R.id.am9);
            if (!LinkCoreModelKt.currentUserIsAnchor()) {
                this.LLILZIL = (ViewGroup) findViewById(R.id.mah);
                ViewGroup viewGroup6 = this.LLILZLL;
                ViewGroup viewGroup7 = viewGroup6 != null ? (ViewGroup) viewGroup6.findViewById(R.id.i7q) : null;
                this.LLJILJIL = viewGroup7;
                this.LLJ = viewGroup7 != null ? (ViewGroup) viewGroup7.findViewById(R.id.mah) : null;
                ViewGroup viewGroup8 = this.LLJILJIL;
                this.LLJI = viewGroup8 != null ? viewGroup8.findViewById(R.id.mai) : null;
                C20441214yg.LIZIZ("emptyMask#intViewForGuest", "intViewForGuest");
                LJIILL();
            }
            if (C925150aBN.LJJIL(false, false, 3) || C925150aBN.LJJIIZI() || C925150aBN.LJJIIZI()) {
                LJIILIIL(true);
            } else {
                LJII(true);
            }
            if (C922570a7D.LIZ(this.LLILLJJLI)) {
                if (C500260Jjc.LJIIZILJ(this.LLILLJJLI)) {
                    LJI();
                } else {
                    LJIILIIL(false);
                }
            }
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.CQ2(MultiLiveUIChangeEvent.class, this, new AwS594S0100000_15(this, 357));
                dataChannel.BQ2(this.LLILLL, IsViewerLimitedStatusChannel.class, new AwS594S0100000_15(this, 358));
            }
            LJIILLIIL();
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        this.LLJJIJI = (dataChannel2 == null || (interfaceC665370Q7z4 = (InterfaceC665370Q7z) dataChannel2.gg0(C956790b0P.class)) == null) ? null : (IThemeAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z4, IThemeAbility.class, null);
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            DataChannel dataChannel3 = this.LLILLJJLI;
            this.LLJJIJIL = (dataChannel3 == null || (interfaceC665370Q7z3 = (InterfaceC665370Q7z) dataChannel3.gg0(C956790b0P.class)) == null) ? null : (IGuidenceAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z3, IGuidenceAbility.class, null);
        } else {
            DataChannel dataChannel4 = this.LLILLJJLI;
            this.LLJLLL = (dataChannel4 == null || (interfaceC665370Q7z2 = (InterfaceC665370Q7z) dataChannel4.gg0(C956790b0P.class)) == null) ? null : (IApplyGuideAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z2, IApplyGuideAbility.class, null);
            DataChannel dataChannel5 = this.LLILLJJLI;
            this.LLLF = (dataChannel5 == null || (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel5.gg0(C956790b0P.class)) == null) ? null : (IGuestInviteAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IGuestInviteAbility.class, null);
        }
        IThemeAbility iThemeAbility = this.LLJJIJI;
        if (iThemeAbility != null && (multiGuestThemeViewModelMG02 = iThemeAbility.MG0()) != null) {
            multiGuestThemeViewModelMG02.vQ2(new C2217371BqR() { // from class: X.0aPs
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C938810aXP) obj).LL;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C938810aXP) obj).LL = (Integer) obj2;
                }
            }, null, this, new AwS594S0100000_15(this, 354));
        }
        IThemeAbility iThemeAbility2 = this.LLJJIJI;
        if (iThemeAbility2 != null && (multiGuestThemeViewModelMG0 = iThemeAbility2.MG0()) != null) {
            multiGuestThemeViewModelMG0.vQ2(new C2217371BqR() { // from class: X.0aPu
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C938810aXP) obj).LLILLJJLI;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C938810aXP) obj).LLILLJJLI = (Integer) obj2;
                }
            }, null, this, new AwS594S0100000_15(this, 355));
        }
        DataChannel dataChannel6 = this.LLILLJJLI;
        if (dataChannel6 != null) {
            dataChannel6.CQ2(MultiGuestAndAudienceRoleChannel.class, this, new AwS594S0100000_15(this, 356));
        }
        if (C917900Zzg.LIZ()) {
            LiveIconView liveIconView = this.LLIZLLLIL;
            if (liveIconView != null) {
                liveIconView.setIconAttr(R.attr.e_0);
            }
            LiveIconView liveIconView2 = this.LLIZLLLIL;
            if (liveIconView2 != null) {
                layoutParams = liveIconView2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = (int) C497740JfY.LIZIZ(20.0f);
                    layoutParams.height = (int) C497740JfY.LIZIZ(20.0f);
                }
            } else {
                layoutParams = null;
            }
            LiveIconView liveIconView3 = this.LLIZLLLIL;
            if (liveIconView3 != null) {
                C786410Ut5.w6(liveIconView3, layoutParams);
            }
            C16F5 c16f5 = this.LLIZ;
            ViewGroup.LayoutParams layoutParams2 = c16f5 != null ? c16f5.getLayoutParams() : null;
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(3.0f);
            }
            C16F5 c16f52 = this.LLIZ;
            if (c16f52 != null) {
                C786410Ut5.g6(c16f52, marginLayoutParams);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLLFFI.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            Lifecycle.State currentState = this.LLLFFI.getCurrentState();
            Lifecycle.State state = Lifecycle.State.DESTROYED;
            if (currentState != state) {
                this.LLLFFI.setCurrentState(state);
            }
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        Iterator<Function0<Unit>> it2 = this.LLLFF.iterator();
        while (it2.hasNext()) {
            it2.next().invoke();
        }
        ((ArrayList) this.LLLFF).clear();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LLLFFI;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.LLILLL;
    }

    public final DataChannel getMDataChannel() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC937630aVV
    public InterfaceC937840aVq getWindow() {
        return this.LL;
    }

    private final void setGuidenceInfo(C933460aOm c933460aOm) {
        this.LLJJIJIIJIL = c933460aOm;
        this.LLJLIL = false;
    }

    @Override // X.InterfaceC937640aVW
    public final void LIZ(AwS559S0100000_15 awS559S0100000_15) {
        ((ArrayList) this.LLLFF).add(awS559S0100000_15);
    }

    @Override // X.InterfaceC937630aVV
    public final void LIZJ(C933460aOm c933460aOm) {
        String idStr;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C934120aPq.class.getSimpleName());
        sbLIZ.append("_showGuidenceStyle user:");
        User user = c933460aOm.LIZ;
        if (user != null) {
            idStr = user.getIdStr();
        } else {
            idStr = null;
        }
        sbLIZ.append(idStr);
        C20441214yg.LIZIZ("live_guidence", C2188811AlT.LIZIZ(sbLIZ));
        setGuidenceInfo(c933460aOm);
        LJIILLIIL();
    }

    @Override // X.InterfaceC937640aVW
    public final InterfaceC943500aey LJ(C943450aet c943450aet) {
        View viewLJLLLL;
        Object objInvoke = null;
        if (this.LLJJIII == null) {
            ViewStub viewStub = this.LLJJI;
            if (viewStub != null) {
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            } else {
                viewLJLLLL = null;
            }
            this.LLJJIII = viewLJLLLL;
        }
        View originEmptyLayoutView = getOriginEmptyLayoutView();
        View view = this.LLJJIII;
        AwS451S0200000_15 awS451S0200000_15 = new AwS451S0200000_15(this, c943450aet, 3);
        if (originEmptyLayoutView != null && view != null) {
            objInvoke = awS451S0200000_15.invoke(originEmptyLayoutView, view);
        }
        return (InterfaceC943500aey) objInvoke;
    }

    public final void LJII(boolean z) {
        Drawable drawableLJIIIIZZ;
        MultiGuestThemeViewModel multiGuestThemeViewModelMG0;
        C938810aXP state;
        Integer num;
        if (C922570a7D.LIZ(this.LLILLJJLI)) {
            C1AZW.LIZ.getClass();
            C1AZW.LIZ("EmptyMask", "[enableEmptyView] isInViewerLimit", null, null);
            return;
        }
        LJIIL(this.LLJ, new AwS133S0110000_15(z, this, 3));
        if (this.LLILZLL != null) {
            LiveIconView liveIconView = this.LLIZLLLIL;
            if (liveIconView != null) {
                liveIconView.setBackgroundResource(0);
                IThemeAbility iThemeAbility = this.LLJJIJI;
                if ((iThemeAbility != null && (multiGuestThemeViewModelMG0 = iThemeAbility.MG0()) != null && (state = multiGuestThemeViewModelMG0.getState()) != null && (num = state.LLILLJJLI) != null && (drawableLJIIIIZZ = LJIIIIZZ(0.9f, num.intValue())) != null) || (drawableLJIIIIZZ = LJIIIIZZ(1.0f, getDrawableId())) != null) {
                    liveIconView.setImageDrawable(drawableLJIIIIZZ);
                }
            }
            C16F5 c16f5 = this.LLIZ;
            if (c16f5 != null) {
                c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.c9i, c16f5.getContext()));
            }
        }
    }

    public final void LJIIIZ(View view) {
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
            this.LLJJJ = viewGroup;
            if (view != null) {
                c1324720kZq = (C1324720kZq) view.findViewById(R.id.pn1);
            } else {
                c1324720kZq = null;
            }
            this.LLJJJIL = c1324720kZq;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.jfk);
            } else {
                viewFindViewById = null;
            }
            this.LLJL = viewFindViewById;
            C923190a8D.LIZJ("show");
            if (view != null) {
                viewGroup2 = (ViewGroup) view.findViewById(R.id.wof);
            } else {
                viewGroup2 = null;
            }
            this.LLJJJJ = viewGroup2;
            if (view != null) {
                c1324720kZq2 = (C1324720kZq) view.findViewById(R.id.woc);
            } else {
                c1324720kZq2 = null;
            }
            this.LLJJJJJIL = c1324720kZq2;
            if (view != null) {
                c1324720kZq3 = (C1324720kZq) view.findViewById(R.id.wod);
            } else {
                c1324720kZq3 = null;
            }
            this.LLJJJJLIIL = c1324720kZq3;
            if (view != null) {
                c1324720kZq4 = (C1324720kZq) view.findViewById(R.id.woe);
            } else {
                c1324720kZq4 = null;
            }
            this.LLJJL = c1324720kZq4;
            if (view != null && (textView = (TextView) view.findViewById(R.id.wog)) != null) {
                textView.setText(C497740JfY.LJIJI(2131856558));
            }
            ViewGroup viewGroup3 = this.LLJJJJ;
            if (viewGroup3 != null) {
                C786410Ut5.K7(viewGroup3, new ACListenerS150S0100000_15(this, 76));
            }
            if (this.LLJJLIIIJLLLLLLLZ) {
                ViewGroup viewGroup4 = this.LLJJJJ;
                if (viewGroup4 != null) {
                    C786410Ut5.LJLZ(0, viewGroup4);
                }
                C1324720kZq c1324720kZq5 = this.LLJJJIL;
                if (c1324720kZq5 != null) {
                    C786410Ut5.LLJJIII(c1324720kZq5, 8);
                }
                View view2 = this.LLJL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
            } else {
                ViewGroup viewGroup5 = this.LLJJJJ;
                if (viewGroup5 != null) {
                    C786410Ut5.LJLZ(8, viewGroup5);
                }
                C1324720kZq c1324720kZq6 = this.LLJJJIL;
                if (c1324720kZq6 != null) {
                    C786410Ut5.LLJJIII(c1324720kZq6, 0);
                }
                View view3 = this.LLJL;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(0, view3);
                }
            }
            C930480aJy c930480aJy = C930480aJy.LIZ;
            C933460aOm c933460aOm = this.LLJJIJIIJIL;
            if (c933460aOm != null && (user = c933460aOm.LIZ) != null) {
                lValueOf = Long.valueOf(user.getId());
            }
            C930480aJy.LJJIJLIJ(c930480aJy, lValueOf, this.LLILLJJLI, getWindow().LJJIIJ().getLayoutParams().width, getWindow().LJJIIJ().getLayoutParams().height, this.LLJJJIL, false, null, 192);
            C1324720kZq c1324720kZq7 = this.LLJJJIL;
            if (c1324720kZq7 != null) {
                C786410Ut5.e8(c1324720kZq7, new ACListenerS150S0100000_15(this, 74));
            }
            View view4 = this.LLJL;
            if (view4 != null) {
                C786410Ut5.I7(new ACListenerS150S0100000_15(this, 75), view4);
            }
        }
    }

    public final void LJIILIIL(boolean z) {
        long followStatus;
        Room room;
        User owner;
        FollowInfo followInfo;
        LJIIL(this.LLJ, null);
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

    public final void LJIILJJIL(Drawable drawable) {
        Drawable drawableLJIIJ;
        if (drawable != null) {
            setBackground(drawable);
            if (C939550aYb.LIZLLL()) {
                ViewGroup viewGroup = this.LLILZLL;
                if (viewGroup != null) {
                    if (C917900Zzg.LIZ()) {
                        drawableLJIIJ = getNormalBgDrawable();
                    } else {
                        drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.f5u);
                    }
                    viewGroup.setBackground(drawableLJIIJ);
                    return;
                }
                return;
            }
            ViewGroup viewGroup2 = this.LLILZLL;
            if (viewGroup2 == null) {
                return;
            }
            viewGroup2.setBackground(null);
            return;
        }
        getWindow().LJJIIJ().setBackground(null);
        setBackground(null);
        if (C939550aYb.LIZLLL()) {
            ViewGroup viewGroup3 = this.LLILZLL;
            if (viewGroup3 == null) {
                return;
            }
            viewGroup3.setBackground(C497740JfY.LJIIJ(R.drawable.f5t));
            return;
        }
        ViewGroup viewGroup4 = this.LLILZLL;
        if (viewGroup4 == null) {
            return;
        }
        viewGroup4.setBackground(C497740JfY.LJIIJ(R.drawable.f5v));
    }

    @Override // X.InterfaceC937630aVV
    public void setGuestInviteGuideUI(List<? extends ImageModel> list) {
        GuestInviteViewModel viewModel;
        C937550aVN c937550aVN;
        Animator animatorLIZ;
        C476100Ilk c476100Ilk;
        ViewStub viewStub;
        this.LLL = false;
        Animator animator = this.LLJZ;
        if (animator != null) {
            animator.cancel();
        }
        View viewLJLLLL = null;
        this.LLJZ = null;
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
                this.LLJILJILJ = view.findViewById(R.id.dwi);
                this.LLJILLL = new C476100Ilk((FrameLayout) view.findViewById(R.id.i36), new C476110Ill(false, 0.0f, 0.0f, 0.0f, 15));
                if (list != null && (c476100Ilk = this.LLJILLL) != null) {
                    c476100Ilk.LIZJ(list);
                }
                IGuestInviteAbility iGuestInviteAbility = this.LLLF;
                if (iGuestInviteAbility != null && (viewModel = iGuestInviteAbility.getViewModel()) != null && (c937550aVN = (C937550aVN) viewModel.LLILZIL.getValue()) != null && (animatorLIZ = c937550aVN.LIZ(this.LLJILJILJ, this.LLIZLLLIL, this.LLIZ)) != null) {
                    this.LLL = true;
                    animatorLIZ.start();
                    this.LLJZ = animatorLIZ;
                }
            }
        }
    }

    public void setWindow(InterfaceC937840aVq interfaceC937840aVq) {
        this.LL = interfaceC937840aVq;
    }

    public static final Drawable LJIIIIZZ(float f, int i) {
        Drawable drawableLJIIJ = C497740JfY.LJIIJ(i);
        if (drawableLJIIJ != null) {
            drawableLJIIJ.setAlpha((int) (f * 255));
            return drawableLJIIJ;
        }
        return null;
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
        throw new UnsupportedOperationException("Method not decompiled: X.C934120aPq.LIZIZ(boolean, boolean):void");
    }

    public final void LJIIJ(ImageModel imageModel, List<ImageModel> list) {
        if (list != null) {
            if (!this.LLJLIL && C500260Jjc.LJJJJIZL(this.LLJJJJ)) {
                this.LLJLIL = true;
                if (list.size() >= 3) {
                    C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ((ImageModel) ListProtector.get(list, 0));
                    c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
                    Boolean bool = Boolean.TRUE;
                    c1324610kZfLJIIIZ.LJIILIIL = bool;
                    c1324610kZfLJIIIZ.LJIIL = getAvatarImageLoadListener();
                    c1324610kZfLJIIIZ.LJJI(this.LLJJJJJIL);
                    C1324610kZf c1324610kZfLJIIIZ2 = C1819620xS4.LIZ().LJIIIZ((ImageModel) ListProtector.get(list, 1));
                    c1324610kZfLJIIIZ2.LJIIIZ = R.drawable.el_;
                    c1324610kZfLJIIIZ2.LJIILIIL = bool;
                    c1324610kZfLJIIIZ2.LJIIL = getAvatarImageLoadListener();
                    c1324610kZfLJIIIZ2.LJJI(this.LLJJJJLIIL);
                    C1324610kZf c1324610kZfLJIIIZ3 = C1819620xS4.LIZ().LJIIIZ((ImageModel) ListProtector.get(list, 2));
                    c1324610kZfLJIIIZ3.LJIIIZ = R.drawable.el_;
                    c1324610kZfLJIIIZ3.LJIILIIL = bool;
                    c1324610kZfLJIIIZ3.LJIIL = getAvatarImageLoadListener();
                    c1324610kZfLJIIIZ3.LJJI(this.LLJJL);
                    return;
                }
                return;
            }
            return;
        }
        C1324720kZq c1324720kZq = this.LLJJJIL;
        if (c1324720kZq != null && !this.LLJLIL && C500260Jjc.LJJJJIZL(c1324720kZq)) {
            this.LLJLIL = true;
            if (imageModel == null) {
                this.LLJLIL = false;
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
                c1324610kZfLJIIIZ4.LJJI(c1324720kZq);
                return;
            }
            C0JSS.LJIIIIZZ(c1324720kZq, imageModel, c1324720kZq.getWidth(), c1324720kZq.getHeight(), R.drawable.el_, getAvatarImageLoadListener());
        }
    }

    public final void LJIIL(View view, Function0<Unit> function0) {
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

    public C934120aPq(InterfaceC937840aVq interfaceC937840aVq, DataChannel dataChannel, WindowMaskAssem windowMaskAssem, Context context) {
        super(context);
        this.LL = interfaceC937840aVq;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = windowMaskAssem;
        this.LLJLILLLLZIIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 291));
        this.LLLFF = new ArrayList();
        this.LLLFFI = new LifecycleRegistry(this);
        this.LLLFZ = C452501pT.LIZIZ(new AwS550S0100000_6(context, 15));
    }
}
