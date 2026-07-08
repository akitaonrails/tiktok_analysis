package X;

import Y.ATListenerS461S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS678S0100000_29;

/* JADX INFO: renamed from: X.12Sq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19759412Sq extends AbstractC1664490tPr<C12SL, C19757912Sb> {
    public final VideoPublishEditModel LLJJJIL;
    public final InterfaceC1455860nzM LLJJJJ;
    public final InterfaceC1461660o8i LLJJJJJIL;
    public C19759912Sv LLJJJJLIIL;
    public boolean LLJJL;
    public C19759612Ss LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public LinearLayout LLJLIL;
    public boolean LLJLILLLLZIIL;
    public View LLJLL;
    public EnumC1087350eOz LLJLLIL = EnumC1087350eOz.IDLE;
    public boolean LLJLLL;
    public C0HZQ LLJZ;
    public TuxTextView LLJZIJLIL;
    public boolean LLL;

    public final void LLLLLJLJLL() {
        TuxIconView tuxIconView = this.LLJL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C19759612Ss c19759612Ss = this.LLJJLIIIJLLLLLLLZ;
        C786410Ut5.LLLLLLZZ(tuxIconView, ((c19759612Ss != null ? c19759612Ss : null).getStack().isEmpty() || this.LLJJL) ? 8 : 0);
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        C19759612Ss c19759612Ss = this.LLJJLIIIJLLLLLLLZ;
        if (c19759612Ss == null) {
            c19759612Ss = null;
        }
        c19759612Ss.LLILZLL = this.LLJJJJ.g().getValue() != null ? r0.getDuration() : 0L;
        LLLLLLIL();
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
    }

    public final void LLLLLLIL() {
        this.LLJLIL = (LinearLayout) requireViewById(R.id.bab);
        this.LLJZ = (C0HZQ) requireViewById(R.id.bac);
        this.LLJZIJLIL = (TuxTextView) requireViewById(R.id.bad);
        LinearLayout linearLayout = this.LLJLIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 19), linearLayout);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12SP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12SL) obj).LIZ;
            }
        }, new AwS608S0100000_29(this, 174));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12Sz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12SL) obj).LJI;
            }
        }, new AwS608S0100000_29(this, 175));
        VideoPublishEditModel videoPublishEditModel = this.LLJJJIL;
        if (C1403850mdT.LJIIJJI(videoPublishEditModel)) {
            LinearLayout linearLayout2 = this.LLJLIL;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            C786410Ut5.LJZL(0, linearLayout2);
        } else {
            LinearLayout linearLayout3 = this.LLJLIL;
            if (linearLayout3 == null) {
                linearLayout3 = null;
            }
            C786410Ut5.LJZL(8, linearLayout3);
        }
        if (videoPublishEditModel.isDuet() || C1428520nHG.LJJL(videoPublishEditModel) || videoPublishEditModel.isPhotoMvMode() || videoPublishEditModel.getEditMusicSyncMode() || videoPublishEditModel.getStitchParams() != null || videoPublishEditModel.isStickPointMode() || videoPublishEditModel.isCurrentAutoCutMode() || videoPublishEditModel.isMuted()) {
            LinearLayout linearLayout4 = this.LLJLIL;
            C786410Ut5.LJZL(8, linearLayout4 != null ? linearLayout4 : null);
        }
    }

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        this.LLJLLL = true;
        if (this.LLJJL) {
            LLLLLLJ(-1, "on_pause", false);
        }
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        this.LLJLLL = false;
    }

    public final void LLLLLL(boolean z) {
        float f;
        C0HZQ c0hzq = this.LLJZ;
        TuxTextView tuxTextView = null;
        if (c0hzq == null) {
            c0hzq = null;
        }
        c0hzq.setEnabled(z);
        TuxTextView tuxTextView2 = this.LLJZIJLIL;
        if (tuxTextView2 != null) {
            tuxTextView = tuxTextView2;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.66f;
        }
        C786410Ut5.B5(tuxTextView, f);
    }

    public final void LLLLLLLLL(String str) {
        long jLLL;
        if (this.LLJLLIL != EnumC1087350eOz.IDLE) {
            return;
        }
        C0HZQ c0hzq = this.LLJZ;
        View view = null;
        if (c0hzq == null) {
            c0hzq = null;
        }
        this.LLL = c0hzq.isEnabled();
        LLLLLL(false);
        this.LLJJL = true;
        C19759612Ss c19759612Ss = this.LLJJLIIIJLLLLLLLZ;
        if (c19759612Ss == null) {
            c19759612Ss = null;
        }
        InterfaceC1452170ntP value = this.LLJJJJ.g().getValue();
        if (value != null) {
            jLLL = value.LLL();
        } else {
            jLLL = 0;
        }
        C384240F4s c384240F4s = c19759612Ss.LLILLL;
        if (c384240F4s == null) {
            c384240F4s = null;
        }
        c384240F4s.setStartRecordTime(jLLL);
        LLLLIL().LIZIZ.invoke(null, str);
        C19759912Sv c19759912Sv = this.LLJJJJLIIL;
        if (c19759912Sv == null) {
            c19759912Sv = null;
        }
        c19759912Sv.setBgColorDrawable(null);
        C19759912Sv c19759912Sv2 = this.LLJJJJLIIL;
        if (c19759912Sv2 == null) {
            c19759912Sv2 = null;
        }
        C12T0 c12t0 = c19759912Sv2.LLILLJJLI;
        if (c12t0 != null) {
            c12t0.LIZIZ();
        }
        C19759912Sv c19759912Sv3 = this.LLJJJJLIIL;
        if (c19759912Sv3 == null) {
            c19759912Sv3 = null;
        }
        c19759912Sv3.setStopTintColorRes(R.attr.a04);
        C19759912Sv c19759912Sv4 = this.LLJJJJLIIL;
        if (c19759912Sv4 == null) {
            c19759912Sv4 = null;
        }
        c19759912Sv4.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        C19759612Ss c19759612Ss2 = this.LLJJLIIIJLLLLLLLZ;
        if (c19759612Ss2 == null) {
            c19759612Ss2 = null;
        }
        c19759612Ss2.setRecording(true);
        View view2 = this.LLJLL;
        if (view2 != null) {
            view = view2;
        }
        C786410Ut5.LJLLLLLL(0, view);
        LLLLLJLJLL();
    }

    public final void LLLLLJIL(int i, boolean z) {
        View viewRequireViewById = requireViewById(R.id.syd);
        C19759612Ss c19759612Ss = this.LLJJLIIIJLLLLLLLZ;
        C19759912Sv c19759912Sv = null;
        if (c19759612Ss == null) {
            c19759612Ss = null;
        }
        int iLIZJ = c19759612Ss.LIZJ(i);
        if (-1 == iLIZJ) {
            C19759912Sv c19759912Sv2 = this.LLJJJJLIIL;
            if (c19759912Sv2 == null) {
                c19759912Sv2 = null;
            }
            if (c19759912Sv2.isEnabled()) {
                return;
            }
            C19759912Sv c19759912Sv3 = this.LLJJJJLIIL;
            if (c19759912Sv3 != null) {
                c19759912Sv = c19759912Sv3;
            }
            c19759912Sv.getClass();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19759912Sv);
            c19759912Sv.setAlpha(1.0f);
            c19759912Sv.setEnabled(true);
            C786410Ut5.T4(viewRequireViewById, 1.0f);
            return;
        }
        if (!this.LLJJL) {
            C19759912Sv c19759912Sv4 = this.LLJJJJLIIL;
            if (c19759912Sv4 == null) {
                c19759912Sv4 = null;
            }
            if (!c19759912Sv4.isEnabled()) {
                return;
            }
            C19759912Sv c19759912Sv5 = this.LLJJJJLIIL;
            if (c19759912Sv5 != null) {
                c19759912Sv = c19759912Sv5;
            }
            c19759912Sv.getClass();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19759912Sv);
            c19759912Sv.setAlpha(0.5f);
            c19759912Sv.setEnabled(false);
            C786410Ut5.T4(viewRequireViewById, 0.5f);
            return;
        }
        if (!z) {
            LLLLLLJ(iLIZJ, "", false);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bn);
        c384050F3z.LJIIIIZZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        c384050F3z.LJIIIZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        view.setBackground(c384050F3z.LIZ(requireSceneContext()));
        this.LLJJLIIIJLLLLLLLZ = (C19759612Ss) requireViewById(R.id.baq);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12T2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12SL) obj).LIZLLL;
            }
        }, new AwS584S0100000_5(this, 46));
        C19759612Ss c19759612Ss = this.LLJJLIIIJLLLLLLLZ;
        C19759912Sv c19759912Sv = null;
        if (c19759612Ss == null) {
            c19759612Ss = null;
        }
        AwS678S0100000_29 awS678S0100000_29 = new AwS678S0100000_29(this, 3);
        AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this, 177);
        c19759612Ss.LLJ = awS678S0100000_29;
        c19759612Ss.LLJI = awS608S0100000_29;
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12T4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12SL) obj).LJII;
            }
        }, new AwS608S0100000_29(this, 178));
        TuxIconView tuxIconView = (TuxIconView) requireViewById(R.id.sy8);
        this.LLJL = tuxIconView;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 20), tuxIconView);
        LLLLLJLJLL();
        this.LLJLL = requireViewById(R.id.fut);
        C19759912Sv c19759912Sv2 = (C19759912Sv) requireViewById(R.id.vz9);
        this.LLJJJJLIIL = c19759912Sv2;
        if (c19759912Sv2 == null) {
            c19759912Sv2 = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 21), c19759912Sv2);
        C19759912Sv c19759912Sv3 = this.LLJJJJLIIL;
        if (c19759912Sv3 == null) {
            c19759912Sv3 = null;
        }
        c19759912Sv3.setOnLongClickListener(new C12YH(this, 1));
        C19759912Sv c19759912Sv4 = this.LLJJJJLIIL;
        if (c19759912Sv4 == null) {
            c19759912Sv4 = null;
        }
        c19759912Sv4.setOnTouchListener(new ATListenerS461S0100000_29(this, 7));
        C786410Ut5.I7(new AkS95S0100000_29(this, 22), requireViewById(R.id.zj1));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12SW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12SL) obj).LJIIIIZZ;
            }
        }, new AwS608S0100000_29(this, 176));
        C19759912Sv c19759912Sv5 = this.LLJJJJLIIL;
        if (c19759912Sv5 == null) {
            c19759912Sv5 = null;
        }
        c19759912Sv5.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        C19759912Sv c19759912Sv6 = this.LLJJJJLIIL;
        if (c19759912Sv6 != null) {
            c19759912Sv = c19759912Sv6;
        }
        c19759912Sv.setRecordingTintRes(R.raw.icon_mic_fill);
        LLLLLLIL();
        LLLLIL().LJIIL.invoke();
    }

    public C19759412Sq(VideoPublishEditModel videoPublishEditModel, InterfaceC1455860nzM interfaceC1455860nzM, InterfaceC1461660o8i interfaceC1461660o8i) {
        this.LLJJJIL = videoPublishEditModel;
        this.LLJJJJ = interfaceC1455860nzM;
        this.LLJJJJJIL = interfaceC1461660o8i;
    }

    public final void LLLLLLJ(int i, String str, boolean z) {
        int iIntValue;
        View view = null;
        if (this.LLJJL) {
            C19759912Sv c19759912Sv = this.LLJJJJLIIL;
            if (c19759912Sv == null) {
                c19759912Sv = null;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, requireSceneContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c19759912Sv.setBgColorRes(iIntValue);
            C19759912Sv c19759912Sv2 = this.LLJJJJLIIL;
            if (c19759912Sv2 == null) {
                c19759912Sv2 = null;
            }
            C12T0 c12t0 = c19759912Sv2.LLILLJJLI;
            if (c12t0 != null) {
                c12t0.LIZJ();
            }
            C19759912Sv c19759912Sv3 = this.LLJJJJLIIL;
            if (c19759912Sv3 == null) {
                c19759912Sv3 = null;
            }
            c19759912Sv3.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        }
        LLLLLL(this.LLL);
        this.LLJJL = false;
        LLLLIL().LIZJ.invoke(Boolean.valueOf(z), Integer.valueOf(i), null, str);
        LLLLIL().LJIIJ.invoke();
        C19759612Ss c19759612Ss = this.LLJJLIIIJLLLLLLLZ;
        if (c19759612Ss == null) {
            c19759612Ss = null;
        }
        c19759612Ss.setRecording(false);
        LLLLLJLJLL();
        View view2 = this.LLJLL;
        if (view2 != null) {
            view = view2;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.epe, viewGroup, false);
    }
}
