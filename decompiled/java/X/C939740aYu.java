package X;

import Y.ARunnableS115S0100000_15;
import Y.AUListenerS264S0100000_15;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multilive.model.HostDisplayResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicTicketIconUrlSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestHostTagUiOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestRevertSearchFeedUiOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFeedNoGuestMaskFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestIconResourceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCardOverdrawOptSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS164S1100000_15;
import kotlin.jvm.internal.AwS17S0001000_2;
import kotlin.jvm.internal.AwS21S0000100_2;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939740aYu extends C939800aZ0 {
    public static final /* synthetic */ int LLLLJI = 0;
    public final String LLJILLL;
    public InterfaceC937900aVw LLJJ;
    public final Function0<String> LLJJI;
    public final boolean LLJJIII;
    public LinkPlayerInfo LLJJIJI;
    public EnumC918990a1R LLJJIJIIJIL;
    public int LLJJIJIL;
    public C1324720kZq LLJJJ;
    public C1324720kZq LLJJJIL;
    public C1324720kZq LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public ViewStub LLJJJJLIIL;
    public ConstraintLayout LLJJL;
    public C1324720kZq LLJJLIIIJLLLLLLLZ;
    public C16F5 LLJL;
    public C16F5 LLJLIL;
    public C16F5 LLJLILLLLZIIL;
    public ConstraintLayout LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public ViewGroup LLJZ;
    public View LLJZIJLIL;
    public C19R6 LLL;
    public View LLLF;
    public C20743416Fc LLLFF;
    public LiveIconView LLLFFI;
    public View LLLFZ;
    public C416040GTa LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public View LLLIIIIL;
    public String LLLIIIL;
    public boolean LLLIIL;
    public C1105630esT LLLIILIL;
    public C1105630esT LLLIL;
    public C1126540fQC LLLILZ;
    public View LLLILZJ;
    public View LLLILZLLLI;
    public FrameLayout LLLIZZ;
    public ValueAnimator LLLJ;
    public ValueAnimator LLLJIL;
    public String LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C2252321DDq LLLLIIL;
    public final C2252321DDq LLLLIILL;
    public final C2252321DDq LLLLIILLL;
    public String LLLLIL;
    public Long LLLLILI;
    public C939750aYv LLLLJ;

    @Override // X.C939800aZ0, X.AbstractC940410aZz
    public final int LIZIZ() {
        return !LiveCardOverdrawOptSetting.INSTANCE.enableOverdrawOptForMultiGuest() ? R.layout.hdw : R.layout.hdx;
    }

    @Override // X.AbstractC940410aZz
    public final void LIZLLL() {
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            HandlerHook.viewPost(viewGroup, new ARunnableS115S0100000_15(this, 195));
        }
    }

    @Override // X.AbstractC940410aZz
    public final void LJ() {
        C939750aYv c939750aYv = this.LLLLJ;
        if (c939750aYv != null) {
            c939750aYv.LJIIIIZZ();
        }
    }

    @Override // X.C939800aZ0, X.AbstractC940410aZz
    public final void LJI() {
        C939750aYv c939750aYv;
        C941290abP c941290abP = (C941290abP) this.LLLLII.getValue();
        if (c941290abP != null) {
            c941290abP.LJI();
        }
        DataChannelGlobal.LLILZ.IQ2(C930900aKe.class);
        if (C936720aU2.LIZIZ() && (c939750aYv = this.LLLLJ) != null) {
            c939750aYv.LJIIIIZZ();
        }
        super.LJI();
    }

    public final void LJIILIIL() {
        ViewGroup viewGroup;
        if (LiveSdkMultiGuestRevertSearchFeedUiOptSetting.INSTANCE.isEnable() || this.LLIZLLLIL != EnumC940090aZT.SEARCH || (viewGroup = this.LLILLJJLI) == null) {
            return;
        }
        float width = viewGroup.getWidth() / 390.0f;
        int iLIZ = (int) (C439101nJ.LIZ(14) * width);
        int iLIZ2 = (int) (C439101nJ.LIZ(10) * width);
        int iLIZ3 = (int) (C439101nJ.LIZ(4) * width);
        LiveIconView liveIconView = this.LLLFFI;
        if (liveIconView != null) {
            C500260Jjc.LJLL(iLIZ2, iLIZ2, liveIconView);
        }
        C19R6 c19r6 = this.LLL;
        if (c19r6 != null) {
            C426750GoL.LJIIIZ(c19r6, Integer.valueOf(iLIZ3), Integer.valueOf(iLIZ3), Integer.valueOf(iLIZ3), Integer.valueOf(iLIZ3), false, 16);
        }
        C19R6 c19r62 = this.LLL;
        if (c19r62 != null) {
            C500260Jjc.LJJZ(iLIZ, c19r62);
        }
        View view = this.LLLF;
        if (view != null) {
            C426750GoL.LJIIIZ(view, Integer.valueOf(iLIZ3), Integer.valueOf(iLIZ3), Integer.valueOf(iLIZ3), Integer.valueOf(iLIZ3), false, 16);
        }
        View view2 = this.LLLF;
        if (view2 != null) {
            C500260Jjc.LJJZ(iLIZ, view2);
        }
        C20743416Fc c20743416Fc = this.LLLFF;
        if (c20743416Fc != null) {
            c20743416Fc.setAutoSizeTextTypeWithDefaults(0);
        }
        C20743416Fc c20743416Fc2 = this.LLLFF;
        if (c20743416Fc2 != null) {
            c20743416Fc2.setTextSize(width * 11.0f);
        }
    }

    public final void LJIJJ() {
        ConstraintLayout constraintLayout;
        View viewFindViewById;
        C19MB c19mb = new C19MB();
        ConstraintLayout constraintLayout2 = this.LLJLL;
        ViewParent parent = constraintLayout2 != null ? constraintLayout2.getParent() : null;
        if (!(parent instanceof ConstraintLayout) || (constraintLayout = (ConstraintLayout) parent) == null) {
            return;
        }
        c19mb.LJII(constraintLayout);
        ConstraintLayout constraintLayout3 = this.LLJLL;
        if (constraintLayout3 != null) {
            int id = constraintLayout3.getId();
            c19mb.LJIIIZ(id, 6, 0, 6, (int) C497740JfY.LIZIZ(4.0f));
            c19mb.LJI(id, 3);
            c19mb.LJIIIZ(id, 7, 0, 7, (int) C497740JfY.LIZIZ(4.0f));
            c19mb.LJIIIZ(id, 4, 0, 4, (int) C497740JfY.LIZIZ(4.0f));
            c19mb.LJJIIJZLJL(id, 4, (int) C497740JfY.LIZIZ(4.0f));
            c19mb.LJJIIJZLJL(id, 3, 0);
            c19mb.LJJIIJZLJL(id, 6, (int) C497740JfY.LIZIZ(4.0f));
            c19mb.LJJIIJZLJL(id, 7, (int) C497740JfY.LIZIZ(4.0f));
            c19mb.LJJIII(id, 1);
            c19mb.LJJII(0.0f, id);
            c19mb.LJI(R.id.op6, 6);
            c19mb.LJIIIZ(R.id.op6, 3, 0, 3, 0);
            ViewGroup viewGroup = this.LL;
            if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.op6)) != null) {
                C786410Ut5.ed(viewFindViewById, (int) C497740JfY.LIZIZ(1.0f));
            }
            c19mb.LIZIZ(constraintLayout);
            LJJIIJ(0.0f, 0);
        }
    }

    public final void LJIL() throws Throwable {
        C19R6 c19r6;
        String str;
        C20743416Fc c20743416Fc;
        HostDisplayResponse.DisplayInfo displayInfo;
        String str2;
        String str3;
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            C12ES.LJIILL(0, viewGroup);
        }
        C500260Jjc.LLFFF(this.LLJZIJLIL);
        if (this.LLLII && this.LLLIIII) {
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        HostDisplayResponse.DisplayInfo displayInfo2 = (HostDisplayResponse.DisplayInfo) dataChannelGlobal.gg0(C930900aKe.class);
        int i = R.drawable.e0j;
        if (displayInfo2 == null || (str3 = displayInfo2.hostIconBackgroundUrl) == null) {
            Drawable drawableLJIIJ = C497740JfY.LJIIJ(LiveSdkMultiGuestHostTagUiOptSetting.INSTANCE.isOpt() ? R.drawable.e0j : R.drawable.dut);
            if (drawableLJIIJ != null && (c19r6 = this.LLL) != null) {
                c19r6.setImageDrawable(drawableLJIIJ);
            }
        } else {
            C1324610kZf url = C1819620xS4.LIZ().setUrl(str3);
            url.LJIIIZ = LiveSdkMultiGuestHostTagUiOptSetting.INSTANCE.isOpt() ? R.drawable.e0j : R.drawable.dut;
            url.LJIIL = new C987140bnM(this, 8);
            url.LJJI(this.LLL);
        }
        HostDisplayResponse.DisplayInfo displayInfo3 = (HostDisplayResponse.DisplayInfo) dataChannelGlobal.gg0(C930900aKe.class);
        if (displayInfo3 == null || (str2 = displayInfo3.hostIconUrl) == null) {
            LiveIconView liveIconView = this.LLLFFI;
            if (liveIconView != null) {
                liveIconView.setIconTintAttr(R.attr.c9i);
            }
            LiveIconView liveIconView2 = this.LLLFFI;
            if (liveIconView2 != null) {
                liveIconView2.setIconAttr(R.attr.e7l);
            }
        } else {
            int iLJFF = C497740JfY.LJFF(android.R.color.transparent);
            LiveIconView liveIconView3 = this.LLLFFI;
            if (liveIconView3 != null) {
                liveIconView3.setIconTint(iLJFF);
            }
            C1324610kZf url2 = C1819620xS4.LIZ().setUrl(str2);
            if (!LiveSdkMultiGuestHostTagUiOptSetting.INSTANCE.isOpt()) {
                i = R.drawable.dut;
            }
            url2.LJIIIZ = i;
            url2.LJIIL = new C987140bnM(this, 9);
            url2.LJJI(this.LLLFFI);
        }
        if ((dataChannelGlobal.gg0(C930900aKe.class) == null || (displayInfo = (HostDisplayResponse.DisplayInfo) dataChannelGlobal.gg0(C930900aKe.class)) == null || displayInfo.hostType <= 1) ? false : true) {
            View view = this.LLLF;
            if (view != null) {
                ViewGroup viewGroup2 = this.LLILLJJLI;
                view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), (int) C12ES.LIZJ(6.0f, viewGroup2 != null ? viewGroup2.getContext() : null), view.getPaddingBottom());
            }
            LiveIconView liveIconView4 = this.LLLFFI;
            if (liveIconView4 != null) {
                C12ES.LJIILL(0, liveIconView4);
            }
            LJIILIIL();
        } else if (LiveSdkMultiGuestHostTagUiOptSetting.INSTANCE.isOpt()) {
            View view2 = this.LLLF;
            if (view2 != null) {
                ViewGroup viewGroup3 = this.LLILLJJLI;
                view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), (int) C12ES.LIZJ(4.0f, viewGroup3 != null ? viewGroup3.getContext() : null), view2.getPaddingBottom());
            }
            LiveIconView liveIconView5 = this.LLLFFI;
            if (liveIconView5 != null) {
                C439101nJ.LJI(liveIconView5);
            }
        } else {
            View view3 = this.LLLF;
            if (view3 != null) {
                ViewGroup viewGroup4 = this.LLILLJJLI;
                view3.setPaddingRelative(view3.getPaddingStart(), view3.getPaddingTop(), (int) C12ES.LIZJ(6.0f, viewGroup4 != null ? viewGroup4.getContext() : null), view3.getPaddingBottom());
            }
            LiveIconView liveIconView6 = this.LLLFFI;
            if (liveIconView6 != null) {
                C12ES.LJIILL(0, liveIconView6);
            }
            LJIILIIL();
        }
        HostDisplayResponse.DisplayInfo displayInfo4 = (HostDisplayResponse.DisplayInfo) dataChannelGlobal.gg0(C930900aKe.class);
        if (displayInfo4 == null || (str = displayInfo4.hostColor) == null || (c20743416Fc = this.LLLFF) == null) {
            return;
        }
        c20743416Fc.setTextColor(ColorProtector.parseColor(str));
    }

    public final void LJJI() {
        if (this.LLLLJ == null && C936720aU2.LIZIZ()) {
            this.LLLLJ = new C939750aYv(this.LLJJIJIL, this.LLJJ, this.LLJILLL);
        }
    }

    @Override // X.C939800aZ0
    public final void LJIIIIZZ() {
        ViewGroup viewGroup;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        super.LJIIIIZZ();
        InterfaceC937900aVw interfaceC937900aVw = this.LLJJ;
        if (Intrinsics.LJFF((interfaceC937900aVw == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVw.LJJJJZ()) == null) ? null : interfaceC937820aVoLJJJJZ.getLayoutBusinessType(), EnumC918990a1R.FLOAT.getBusinessType())) {
            ViewGroup viewGroup2 = this.LLJZ;
            if (viewGroup2 != null) {
                ViewGroup viewGroup3 = this.LLJZ;
                viewGroup2.setBackground(new ColorDrawable(C497740JfY.LIZLLL(R.attr.c99, viewGroup3 != null ? viewGroup3.getContext() : null)));
            }
        } else if (C939550aYb.LIZLLL()) {
            ViewGroup viewGroup4 = this.LLJZ;
            if (viewGroup4 != null) {
                viewGroup4.setBackground(C497740JfY.LJIIJ(R.drawable.f5t));
            }
        } else {
            ViewGroup viewGroup5 = this.LLJZ;
            if (viewGroup5 != null) {
                viewGroup5.setBackground(C497740JfY.LJIIJ(R.drawable.f5v));
            }
        }
        ViewGroup viewGroup6 = this.LL;
        if (viewGroup6 != null) {
            C12ES.LJIILL(0, viewGroup6);
        }
        if (MultiGuestFeedNoGuestMaskFixSetting.INSTANCE.enable() || (viewGroup = this.LLJZ) == null) {
            return;
        }
        C12ES.LJIILL(0, viewGroup);
    }

    @Override // X.C939800aZ0
    public final void LJIIIZ() {
        ViewGroup viewGroup;
        super.LJIIIZ();
        ViewGroup viewGroup2 = this.LL;
        if (viewGroup2 != null) {
            C12ES.LJIILL(0, viewGroup2);
        }
        if (MultiGuestFeedNoGuestMaskFixSetting.INSTANCE.enable() || (viewGroup = this.LLJZ) == null) {
            return;
        }
        C12ES.LJIILL(0, viewGroup);
    }

    @Override // X.C939800aZ0, X.AbstractC940410aZz
    public final String LIZ() {
        return this.LLJILLL;
    }

    @Override // X.C939800aZ0
    public final InterfaceC937900aVw LJIIJ() {
        return this.LLJJ;
    }

    @Override // X.C939800aZ0, X.AbstractC940410aZz
    public final void LIZJ(ViewGroup viewGroup) {
        C1324720kZq c1324720kZq;
        C1324720kZq c1324720kZq2;
        C1324720kZq c1324720kZq3;
        FrameLayout frameLayout;
        ViewStub viewStub;
        ViewGroup viewGroup2;
        View viewFindViewById;
        ViewGroup viewGroup3;
        View viewFindViewById2;
        C19R6 c19r6;
        LiveIconView liveIconView;
        C20743416Fc c20743416Fc;
        View viewFindViewById3;
        View viewFindViewById4;
        C16F5 c16f5;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        C1324720kZq c1324720kZq4;
        C16F5 c16f52;
        C16F5 c16f53;
        super.LIZJ(viewGroup);
        ConstraintLayout constraintLayout3 = null;
        if (viewGroup != null) {
            c1324720kZq = (C1324720kZq) viewGroup.findViewById(R.id.lo6);
        } else {
            c1324720kZq = null;
        }
        this.LLJJJ = c1324720kZq;
        if (viewGroup != null) {
            c1324720kZq2 = (C1324720kZq) viewGroup.findViewById(R.id.lo5);
        } else {
            c1324720kZq2 = null;
        }
        this.LLJJJIL = c1324720kZq2;
        if (viewGroup != null) {
            c1324720kZq3 = (C1324720kZq) viewGroup.findViewById(R.id.pnc);
        } else {
            c1324720kZq3 = null;
        }
        this.LLJJJJ = c1324720kZq3;
        if (viewGroup != null) {
            frameLayout = (FrameLayout) viewGroup.findViewById(R.id.bam);
        } else {
            frameLayout = null;
        }
        this.LLJJJJJIL = frameLayout;
        if (frameLayout != null) {
            C439101nJ.LJI(frameLayout);
        }
        if (!LiveCardOverdrawOptSetting.INSTANCE.enableOverdrawOptForMultiGuest()) {
            if (viewGroup != null) {
                constraintLayout2 = (ConstraintLayout) viewGroup.findViewById(R.id.hue);
            } else {
                constraintLayout2 = null;
            }
            this.LLJJL = constraintLayout2;
            if (constraintLayout2 != null) {
                C439101nJ.LJI(constraintLayout2);
            }
            if (viewGroup != null) {
                c1324720kZq4 = (C1324720kZq) viewGroup.findViewById(R.id.huf);
            } else {
                c1324720kZq4 = null;
            }
            this.LLJJLIIIJLLLLLLLZ = c1324720kZq4;
            if (viewGroup != null) {
                c16f52 = (C16F5) viewGroup.findViewById(R.id.hug);
            } else {
                c16f52 = null;
            }
            this.LLJL = c16f52;
            if (viewGroup != null) {
                c16f53 = (C16F5) viewGroup.findViewById(R.id.huh);
            } else {
                c16f53 = null;
            }
            this.LLJLIL = c16f53;
        } else {
            if (viewGroup != null) {
                viewStub = (ViewStub) viewGroup.findViewById(R.id.q3w);
            } else {
                viewStub = null;
            }
            this.LLJJJJLIIL = viewStub;
        }
        if (viewGroup != null) {
            viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.naq);
        } else {
            viewGroup2 = null;
        }
        this.LLJ = viewGroup2;
        if (viewGroup != null) {
            viewFindViewById = viewGroup.findViewById(R.id.la3);
        } else {
            viewFindViewById = null;
        }
        this.LLJI = viewFindViewById;
        ViewGroup viewGroup4 = this.LLJ;
        if (viewGroup4 != null) {
            C439101nJ.LJI(viewGroup4);
        }
        View view = this.LLJI;
        if (view != null) {
            C439101nJ.LJI(view);
        }
        if (viewGroup != null) {
            viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.i7r);
        } else {
            viewGroup3 = null;
        }
        this.LLJZ = viewGroup3;
        if (viewGroup3 != null) {
            C439101nJ.LJI(viewGroup3);
        }
        if (viewGroup != null) {
            viewFindViewById2 = viewGroup.findViewById(R.id.pmy);
        } else {
            viewFindViewById2 = null;
        }
        this.LLJZIJLIL = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C439101nJ.LJI(viewFindViewById2);
        }
        if (viewGroup != null) {
            c19r6 = (C19R6) viewGroup.findViewById(R.id.js2);
        } else {
            c19r6 = null;
        }
        this.LLL = c19r6;
        if (viewGroup != null) {
            liveIconView = (LiveIconView) viewGroup.findViewById(R.id.js4);
        } else {
            liveIconView = null;
        }
        this.LLLFFI = liveIconView;
        if (viewGroup != null) {
            c20743416Fc = (C20743416Fc) viewGroup.findViewById(R.id.js6);
        } else {
            c20743416Fc = null;
        }
        this.LLLFF = c20743416Fc;
        if (viewGroup != null) {
            viewFindViewById3 = viewGroup.findViewById(R.id.js5);
        } else {
            viewFindViewById3 = null;
        }
        this.LLLF = viewFindViewById3;
        if (viewGroup != null) {
            viewFindViewById4 = viewGroup.findViewById(R.id.hvg);
        } else {
            viewFindViewById4 = null;
        }
        this.LLLFZ = viewFindViewById4;
        if (viewGroup != null) {
            c16f5 = (C16F5) viewGroup.findViewById(R.id.p94);
        } else {
            c16f5 = null;
        }
        this.LLJLILLLLZIIL = c16f5;
        if (viewGroup != null) {
            constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.p55);
        } else {
            constraintLayout = null;
        }
        this.LLJLL = constraintLayout;
        if (viewGroup != null) {
            constraintLayout3 = (ConstraintLayout) viewGroup.findViewById(R.id.p55);
        }
        this.LLJLL = constraintLayout3;
        if (viewGroup != null) {
            try {
                LJIJ(viewGroup);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initTicketView error: ");
                sbLIZ.append(th.getMessage());
                C20441214yg.LJ("MultiGuestV3FeedMaskWindow", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (C497740JfY.LJJ()) {
            ViewGroup viewGroup5 = this.LLILLJJLI;
            if (viewGroup5 != null) {
                viewGroup5.setLayoutDirection(1);
            }
            ViewGroup viewGroup6 = this.LLILLJJLI;
            if (viewGroup6 != null) {
                viewGroup6.setTextDirection(4);
            }
            C20743416Fc c20743416Fc2 = this.LLLFF;
            if (c20743416Fc2 != null) {
                c20743416Fc2.setLayoutDirection(1);
            }
            C20743416Fc c20743416Fc3 = this.LLLFF;
            if (c20743416Fc3 != null) {
                c20743416Fc3.setTextDirection(4);
            }
            C16F5 c16f54 = this.LLJLILLLLZIIL;
            if (c16f54 != null) {
                c16f54.setLayoutDirection(1);
            }
            C16F5 c16f55 = this.LLJLILLLLZIIL;
            if (c16f55 != null) {
                c16f55.setTextDirection(4);
            }
        }
        LJJI();
    }

    @Override // X.C939800aZ0
    public final void LJIIJJI(InterfaceC937900aVw interfaceC937900aVw) {
        this.LLJJ = interfaceC937900aVw;
    }

    public final View LJIIZILJ(Context context) {
        View view = this.LLLIIIIL;
        if (view == null) {
            view = new View(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            C786410Ut5.W5(view, layoutParams);
            C786410Ut5.LJLLLLLL(8, view);
        }
        this.LLLIIIIL = view;
        return view;
    }

    public final void LJIJ(View view) {
        C1105630esT c1105630esT = (C1105630esT) view.findViewById(R.id.pn8);
        c1105630esT.setOptState(false);
        this.LLLIILIL = c1105630esT;
        C1105630esT c1105630esT2 = (C1105630esT) view.findViewById(R.id.pn9);
        c1105630esT2.setOptState(false);
        this.LLLIL = c1105630esT2;
        this.LLLILZ = (C1126540fQC) view.findViewById(R.id.pn_);
        this.LLLILZJ = view.findViewById(R.id.mgt);
        this.LLLILZLLLI = view.findViewById(R.id.mgu);
        this.LLLIZZ = (FrameLayout) view.findViewById(R.id.ht5);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTicketUIByPlayingStyle, source=");
        sbLIZ.append("onAttachedToWindow");
        C20441214yg.LJIIIZ("MultiGuestV3FeedMaskWindow", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJJLIIIJILLIZJL(new AwS164S1100000_15(this, 12));
    }

    public final void LJIJJLI(int i) {
        Context context;
        C939750aYv c939750aYv;
        this.LLJJIJIL = i;
        LJJI();
        C939750aYv c939750aYv2 = this.LLLLJ;
        if (c939750aYv2 != null) {
            c939750aYv2.LL = i;
        }
        ViewGroup viewGroup = this.LL;
        Context context2 = null;
        if (viewGroup != null && (context = viewGroup.getContext()) != null && (c939750aYv = this.LLLLJ) != null) {
            c939750aYv.LIZIZ(LJIIZILJ(context), viewGroup);
        }
        View view = this.LLLFZ;
        if (view != null) {
            context2 = view.getContext();
        }
        if (C936720aU2.LIZIZ() && context2 != null) {
            C936720aU2.LIZLLL(this.LLLFZ, C20736316Cj.LIZIZ(R.attr.fxy, context2), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), this.LLJJIJIL);
        }
    }

    public final void LJJ(boolean z) {
        Context context;
        C416040GTa c416040GTa;
        ViewGroup viewGroup = this.LL;
        Boolean boolValueOf = null;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        LJJI();
        if (C936720aU2.LIZIZ()) {
            C939750aYv c939750aYv = this.LLLLJ;
            if (c939750aYv != null) {
                boolValueOf = Boolean.valueOf(c939750aYv.LJI());
            }
            if (C500260Jjc.LJJIFFI(boolValueOf) && context != null) {
                C939750aYv c939750aYv2 = this.LLLLJ;
                if (c939750aYv2 != null) {
                    c939750aYv2.LIZLLL(LJIIZILJ(context), z);
                }
                C416040GTa c416040GTa2 = this.LLLI;
                if (c416040GTa2 != null) {
                    C439101nJ.LJI(c416040GTa2);
                }
                View view = this.LLLFZ;
                if (view != null) {
                    C439101nJ.LJI(view);
                    return;
                }
                return;
            }
        }
        String str = C939550aYb.LIZJ;
        if (str != null && CastIntegerProtector.parseInt(str) == 1 && (c416040GTa = this.LLLI) != null) {
            if (z) {
                if (c416040GTa == null) {
                    return;
                }
                C12ES.LJIILL(0, c416040GTa);
                return;
            } else {
                if (c416040GTa == null) {
                    return;
                }
                C439101nJ.LJI(c416040GTa);
                return;
            }
        }
        if (z) {
            View view2 = this.LLLFZ;
            if (view2 == null) {
                return;
            }
            C12ES.LJIILL(0, view2);
            return;
        }
        View view3 = this.LLLFZ;
        if (view3 == null) {
            return;
        }
        C439101nJ.LJI(view3);
    }

    public final void LJJIFFI(String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.LLLJL;
        }
        if (str != null) {
            if (!TextUtils.isEmpty(str) && Intrinsics.LJFF(str, this.LLLIIIL) && this.LLLIIL) {
                C20441214yg.LIZIZ("MultiGuestV3FeedMaskWindow", "same url and loaded successfully, so return");
                return;
            }
            this.LLLIIIL = str;
            C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
            url.LJJ = Boolean.FALSE;
            if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                url.LJIIJJI = (Drawable) this.LLLLIIIILLL.getValue();
            } else {
                url.LJIIIZ = R.drawable.emi;
            }
            url.LJIIL = new C987140bnM(this, 10);
            url.LJJI(this.LLLILZ);
            return;
        }
        if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
            C1126540fQC c1126540fQC = this.LLLILZ;
            if (c1126540fQC == null) {
                return;
            }
            c1126540fQC.setImageDrawable((Drawable) this.LLLLIIIILLL.getValue());
            return;
        }
        C1126540fQC c1126540fQC2 = this.LLLILZ;
        if (c1126540fQC2 == null) {
            return;
        }
        c1126540fQC2.setActualImageResource(R.drawable.emi);
    }

    public final void LJJIIZ(String str) {
        Drawable background;
        View view;
        if (!Intrinsics.LJFF(str, "mg_default_without_bg") && !Intrinsics.LJFF(str, "mg_default_new_without_bg")) {
            Integer iconBgColorByName = LinkMicTicketIconUrlSetting.INSTANCE.getIconBgColorByName(str);
            if (iconBgColorByName != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateTicketUIByPlayingStyle , updateColor bgColor:");
                sbLIZ.append(iconBgColorByName);
                C20441214yg.LJIIIZ("MultiGuestV3FeedMaskWindow", C2188811AlT.LIZIZ(sbLIZ));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColors(new int[]{iconBgColorByName.intValue(), iconBgColorByName.intValue()});
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(57.0f));
                View view2 = this.LLLILZLLLI;
                if (view2 != null) {
                    view2.setBackground(gradientDrawable);
                    return;
                }
                return;
            }
            return;
        }
        Drawable drawableLIZ = C0UDZ.LIZ(R.drawable.e3i);
        View view3 = this.LLLILZLLLI;
        if (view3 != null) {
            background = view3.getBackground();
        } else {
            background = null;
        }
        if (Intrinsics.LJFF(drawableLIZ, background) || (view = this.LLLILZLLLI) == null) {
            return;
        }
        view.setBackgroundResource(R.drawable.e3j);
    }

    public final void LJJIIZI(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTicketVisible,  visible=");
        sbLIZ.append(z);
        sbLIZ.append(", interactId=");
        sbLIZ.append(this.LLJILLL);
        C20441214yg.LJIIIZ("FanTicketContLog", C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            this.LLLLIL = null;
        }
        View view = this.LLLILZJ;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void changeOnlineUserState(int r8) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939740aYu.changeOnlineUserState(int):void");
    }

    public static final void LJJIIJZLJL(int i, View view) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
            }
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public final void LJIILJJIL(float f, C16F5 c16f5) {
        View viewFindViewById;
        if (LiveSdkMultiGuestRevertSearchFeedUiOptSetting.INSTANCE.isEnable()) {
            return;
        }
        if (this.LLIZLLLIL == EnumC940090aZT.SEARCH) {
            if (this.LLILLJJLI != null) {
                float width = r0.getWidth() / 390.0f;
                if (c16f5 != null) {
                    c16f5.setTextSize(f * width);
                }
                ViewGroup viewGroup = this.LLILLJJLI;
                if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.p96)) != null) {
                    C500260Jjc.LJJZ((int) (C439101nJ.LIZ(18) * width), viewFindViewById);
                    return;
                }
                return;
            }
            return;
        }
        if (c16f5 == null) {
            return;
        }
        c16f5.setTextSize(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[PHI: r5
      0x0072: PHI (r5v1 android.view.View) = (r5v0 android.view.View), (r5v4 android.view.View) binds: [B:14:0x0027, B:23:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(long r7, boolean r9) {
        /*
            r6 = this;
            if (r9 == 0) goto L8
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r6.LLLLILI = r0
        L8:
            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarFeatureSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarFeatureSetting.INSTANCE
            boolean r0 = r0.hasSeeAbility()
            if (r0 != 0) goto L11
            return
        L11:
            android.view.ViewGroup r0 = r6.LL
            if (r0 == 0) goto L7c
            r3 = 2131382086(0x7f0a4f46, float:1.8384507E38)
            android.view.View r5 = r0.findViewById(r3)
            if (r5 == 0) goto L7c
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r4 = 0
            if (r0 <= 0) goto L7d
            boolean r0 = r5 instanceof android.view.ViewStub
            if (r0 == 0) goto L72
            android.view.ViewStub r5 = (android.view.ViewStub) r5
            X.C786410Ut5.LJLLLL(r5)
            android.view.ViewGroup r0 = r6.LL
            r5 = 0
            if (r0 == 0) goto L37
            android.view.View r5 = r0.findViewById(r3)
        L37:
            android.view.ViewGroup r1 = r6.LL
            if (r1 == 0) goto L70
            r0 = 2131382087(0x7f0a4f47, float:1.838451E38)
            android.view.View r3 = r1.findViewById(r0)
            com.bytedance.android.live.design.view.icon.LiveIconView r3 = (com.bytedance.android.live.design.view.icon.LiveIconView) r3
            if (r3 == 0) goto L70
            r0 = 2130973948(0x7f0414fc, float:1.7556705E38)
            r3.setIcon(r0)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setShape(r4)
            android.content.Context r1 = r3.getContext()
            r0 = 2131107311(0x7f061def, float:1.7827198E38)
            int r0 = X.C20736316Cj.LIZIZ(r0, r1)
            r2.setColor(r0)
            r0 = 1077936128(0x40400000, float:3.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r0 = (int) r0
            float r0 = (float) r0
            r2.setCornerRadius(r0)
            r3.setBackground(r2)
        L70:
            if (r5 == 0) goto L75
        L72:
            X.C12ES.LJIILL(r4, r5)
        L75:
            android.widget.FrameLayout r0 = r6.LLJJJJJIL
            if (r0 == 0) goto L7c
            X.C439101nJ.LJI(r0)
        L7c:
            return
        L7d:
            boolean r0 = r5 instanceof android.view.ViewStub
            if (r0 != 0) goto L84
            X.C439101nJ.LJI(r5)
        L84:
            boolean r0 = r6.LLJLLIL
            if (r0 != 0) goto L94
            boolean r0 = r6.LLJLLL
            if (r0 != 0) goto L94
            android.widget.FrameLayout r0 = r6.LLJJJJJIL
            if (r0 == 0) goto L7c
            X.C439101nJ.LJI(r0)
            return
        L94:
            android.widget.FrameLayout r0 = r6.LLJJJJJIL
            if (r0 == 0) goto L7c
            X.C12ES.LJIILL(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939740aYu.LJIILL(long, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(int r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939740aYu.LJJII(int, boolean):void");
    }

    public final void LJJIIJ(float f, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.LLLILZJ;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = ((int) C497740JfY.LIZIZ(f)) + i;
            View view2 = this.LLLILZJ;
            if (view2 != null) {
                C786410Ut5.W5(view2, marginLayoutParams);
            }
        }
    }

    public final void LJIILLIIL(int i, EnumC918990a1R enumC918990a1R, boolean z) {
        User user;
        ImageModel avatarThumb;
        ImageModel imageModel;
        boolean zLJI = MethodIDManager.LJI(71831);
        if (z) {
            LinkPlayerInfo linkPlayerInfo = this.LLJJIJI;
            if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null && (avatarThumb = user.getAvatarThumb()) != null) {
                LinkPlayerInfo linkPlayerInfo2 = this.LLJJIJI;
                if (linkPlayerInfo2 != null) {
                    imageModel = linkPlayerInfo2.blurredAvatar;
                } else {
                    imageModel = null;
                }
                LJIJI(avatarThumb, imageModel, enumC918990a1R);
            } else if (!this.LLJJIII && (enumC918990a1R == EnumC918990a1R.FLOAT_FIX || enumC918990a1R == EnumC918990a1R.GRID_FIX)) {
                C20441214yg.LIZ("show empty view.");
                if (i != 3) {
                    LJIIIIZZ();
                } else {
                    LJIIIZ();
                }
            }
        } else {
            C1324720kZq c1324720kZq = this.LLJJJIL;
            if (c1324720kZq != null) {
                C439101nJ.LJI(c1324720kZq);
            }
            FrameLayout frameLayout = this.LLJJJJJIL;
            if (frameLayout != null) {
                C439101nJ.LJI(frameLayout);
            }
            ViewGroup viewGroup = this.LLJZ;
            if (viewGroup != null) {
                C439101nJ.LJI(viewGroup);
            }
        }
        this.LLJLLIL = z;
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0229 A[PHI: r7
      0x0229: PHI (r7v7 X.0aVq) = (r7v6 X.0aVq), (r7v9 X.0aVq), (r7v9 X.0aVq) binds: [B:130:0x0228, B:33:0x005a, B:35:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0237 A[PHI: r8
      0x0237: PHI (r8v6 int) = (r8v4 int), (r8v8 int) binds: [B:134:0x0231, B:38:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066 A[PHI: r7 r8
      0x0066: PHI (r7v8 X.0aVq) = (r7v7 X.0aVq), (r7v9 X.0aVq) binds: [B:134:0x0231, B:36:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r8v8 int) = (r8v4 int), (r8v9 int) binds: [B:134:0x0231, B:36:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(com.bytedance.android.live.base.model.ImageModel r15, com.bytedance.android.live.base.model.ImageModel r16, X.EnumC918990a1R r17) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939740aYu.LJIJI(com.bytedance.android.live.base.model.ImageModel, com.bytedance.android.live.base.model.ImageModel, X.0a1R):void");
    }

    public final void LJJIJ(boolean z, int i, InterfaceC937900aVw interfaceC937900aVw) {
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        if (this.LLJJIII) {
            if (z) {
                LJIL();
                return;
            }
            EnumC918990a1R enumC918990a1R = this.LLJJIJIIJIL;
            if (enumC918990a1R != EnumC918990a1R.GRID_FIX && enumC918990a1R != EnumC918990a1R.FLOAT_FIX && ((enumC918990a1R != EnumC918990a1R.GRID_FLOAT || (i <= 1 && (interfaceC937900aVw == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVw.LJJJJZ()) == null || (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) == null || allLayoutWindows.size() < 2))) && this.LLJJIJIIJIL != EnumC918990a1R.ZOOM_GRID_ANCHOR)) {
                C500260Jjc.LJIILIIL(this.LLJZIJLIL);
            } else {
                LJIL();
            }
        }
    }

    public final void LJJIII(int i, int i2, long j, String str) {
        CharSequence text;
        int height;
        final int measuredWidth;
        final int measuredWidth2;
        View view;
        C1813460xI8.LIZIZ(this.LLLLIILL, new AwS17S0001000_2(i2, 15));
        C1813460xI8.LIZIZ(this.LLLLIIL, new AwS21S0000100_2(j, 2));
        final String upperCase = C1850730yGF.LJFF(j).toUpperCase(Locale.ROOT);
        if (i == 2) {
            upperCase = C497740JfY.LJIJJ(2131852938, upperCase);
        }
        C1105630esT c1105630esT = this.LLLIILIL;
        Object parent = null;
        if (c1105630esT != null) {
            text = c1105630esT.getText();
        } else {
            text = null;
        }
        if (Intrinsics.LJFF(upperCase, String.valueOf(text))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("countStr == mOnlineTicket.text.toString(),  countStr=");
            sbLIZ.append(upperCase);
            sbLIZ.append(", source=");
            sbLIZ.append(str);
            sbLIZ.append(", interactId=");
            sbLIZ.append(this.LLJILLL);
            C20441214yg.LJIIIZ("FanTicketContLog", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateTicketCountWithAnimation,  countStr=");
        sbLIZ2.append(upperCase);
        sbLIZ2.append(", source=");
        sbLIZ2.append(str);
        sbLIZ2.append(", interactId=");
        sbLIZ2.append(this.LLJILLL);
        C20441214yg.LJIIIZ("FanTicketContLog", C2188811AlT.LIZIZ(sbLIZ2));
        C1105630esT c1105630esT2 = this.LLLIILIL;
        if (c1105630esT2 != null) {
            parent = c1105630esT2.getParent();
        }
        if ((parent instanceof View) && (view = (View) parent) != null) {
            height = view.getHeight();
        } else {
            C1105630esT c1105630esT3 = this.LLLIILIL;
            if (c1105630esT3 != null) {
                height = c1105630esT3.getHeight();
            } else {
                height = 0;
            }
        }
        float f = height;
        C1105630esT c1105630esT4 = this.LLLIILIL;
        if (c1105630esT4 != null) {
            C786410Ut5.rd(c1105630esT4, 0.0f);
        }
        C1105630esT c1105630esT5 = this.LLLIILIL;
        if (c1105630esT5 != null) {
            measuredWidth = c1105630esT5.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (-1.0f) * f);
        this.LLLJ = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator = this.LLLJ;
        if (valueAnimator != null) {
            valueAnimator.setDuration(250L);
        }
        ValueAnimator valueAnimator2 = this.LLLJ;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS264S0100000_15(this, 14));
        }
        ValueAnimator valueAnimator3 = this.LLLJ;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
        C1105630esT c1105630esT6 = this.LLLIL;
        if (c1105630esT6 != null) {
            C786410Ut5.LLLF(c1105630esT6, 0);
        }
        C1105630esT c1105630esT7 = this.LLLIL;
        if (c1105630esT7 != null) {
            c1105630esT7.setText(upperCase);
        }
        C1105630esT c1105630esT8 = this.LLLIL;
        if (c1105630esT8 != null) {
            c1105630esT8.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        C1105630esT c1105630esT9 = this.LLLIL;
        if (c1105630esT9 != null) {
            measuredWidth2 = c1105630esT9.getMeasuredWidth();
        } else {
            measuredWidth2 = 0;
        }
        if (measuredWidth2 >= measuredWidth) {
            measuredWidth = measuredWidth2;
        }
        if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow()) {
            LJJIIJZLJL(measuredWidth, this.LLLIILIL);
        }
        C1105630esT c1105630esT10 = this.LLLIL;
        if (c1105630esT10 != null) {
            C786410Ut5.rd(c1105630esT10, f);
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f, 0.0f);
        this.LLLJIL = valueAnimatorOfFloat2;
        if (valueAnimatorOfFloat2 != null) {
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator4 = this.LLLJIL;
        if (valueAnimator4 != null) {
            valueAnimator4.setDuration(250L);
        }
        ValueAnimator valueAnimator5 = this.LLLJIL;
        if (valueAnimator5 != null) {
            valueAnimator5.addUpdateListener(new AUListenerS264S0100000_15(this, 15));
        }
        ValueAnimator valueAnimator6 = this.LLLJIL;
        if (valueAnimator6 != null) {
            valueAnimator6.addListener(new C464420IJc() { // from class: X.0aZ7
                @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("animatorScrollIn onAnimationEnd,  countStr=");
                    sbLIZ3.append(upperCase);
                    C20441214yg.LJIIIZ("FanTicketContLog", C2188811AlT.LIZIZ(sbLIZ3));
                    C1105630esT c1105630esT11 = this.LLLIL;
                    if (c1105630esT11 != null) {
                        C786410Ut5.LLLF(c1105630esT11, 8);
                    }
                    C1105630esT c1105630esT12 = this.LLLIILIL;
                    if (c1105630esT12 != null) {
                        C786410Ut5.rd(c1105630esT12, 0.0f);
                    }
                    C1105630esT c1105630esT13 = this.LLLIILIL;
                    if (c1105630esT13 != null) {
                        c1105630esT13.setText(upperCase);
                    }
                    if (!MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow()) {
                        C939740aYu.LJJIIJZLJL(measuredWidth, this.LLLIILIL);
                    } else {
                        C939740aYu.LJJIIJZLJL(measuredWidth2, this.LLLIILIL);
                    }
                    View view2 = this.LLLILZLLLI;
                    if (view2 != null) {
                        C939740aYu.LJJIIJZLJL(-2, view2);
                    }
                    View view3 = this.LLLILZJ;
                    if (view3 != null) {
                        C939740aYu.LJJIIJZLJL(-2, view3);
                    }
                }
            });
        }
        ValueAnimator valueAnimator7 = this.LLLJIL;
        if (valueAnimator7 != null) {
            valueAnimator7.start();
        }
    }

    public C939740aYu(String str, InterfaceC937900aVw interfaceC937900aVw, C923370a8V c923370a8V, boolean z, EnumC940090aZT enumC940090aZT) {
        super(null, interfaceC937900aVw, enumC940090aZT);
        this.LLJILLL = str;
        this.LLJJ = interfaceC937900aVw;
        this.LLJJI = c923370a8V;
        this.LLJJIII = z;
        this.LLLL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1089));
        this.LLLLII = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1092));
        this.LLLLIIIILLL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1090));
        this.LLLLIIL = C1BNE.LIZ(0L);
        this.LLLLIILL = C1BNE.LIZ(0);
        this.LLLLIILLL = C1BNE.LIZ("");
    }
}
