package X;

import Y.AAListenerS327S0100000_16;
import Y.AAListenerS331S0100000_20;
import Y.ATListenerS461S0100000_29;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility;
import com.ss.android.ugc.aweme.services.audio.VoiceCloneSpeakerInfo;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS67S2100000_29;

/* JADX INFO: renamed from: X.11Yq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19520211Yq extends AbstractC1664490tPr<C19519511Yj, C19519811Ym> {
    public static final /* synthetic */ int LLLFF = 0;
    public final C0E48 LLJJJIL;
    public C11VN LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public TextView LLJLIL;
    public View LLJLILLLLZIIL;
    public ViewGroup LLJLL;
    public View LLJLLIL;
    public ViewGroup LLJLLL;
    public C1295960jpS LLJZ;
    public ObjectAnimator LLJZIJLIL;
    public final C01GW LLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 716));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS573S0100000_29(this, 717));

    public final void LLLLLJIL() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.LLJZIJLIL;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LLJZIJLIL) != null) {
            objectAnimator.cancel();
        }
        TuxIconView tuxIconView = this.LLJL;
        if (tuxIconView != null) {
            C786410Ut5.Fb(tuxIconView, 0.0f);
        }
        TuxIconView tuxIconView2 = this.LLJL;
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(R.raw.icon_play_fill);
        }
    }

    public C19520211Yq(C0E48 c0e48) {
        this.LLJJJIL = c0e48;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        View viewFindViewById5;
        TextView textView;
        super.onActivityCreated(bundle);
        this.LLJJJJ = (C11VN) requireViewById(R.id.gty);
        this.LLJJJJJIL = requireViewById(R.id.vop_setting_container);
        this.LLJJL = requireViewById(R.id.vop_setting_close_icon);
        this.LLJJJJLIIL = requireViewById(R.id.vop_setting_button);
        this.LLJJLIIIJLLLLLLLZ = requireViewById(R.id.vop_setting_play_layout);
        this.LLJL = (TuxIconView) requireViewById(R.id.vop_setting_play_icon_view);
        this.LLJLIL = (TextView) requireViewById(R.id.vop_setting_play_text);
        this.LLJLILLLLZIIL = requireViewById(R.id.vop_enter_text_button);
        this.LLJLL = (ViewGroup) requireViewById(R.id.vop_settings_manage_container);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.mActivity), R.layout.ep2, this.LLJLL, true);
        this.LLJLLIL = viewTd;
        if (viewTd != null && (textView = (TextView) viewTd.findViewById(R.id.vz5)) != null) {
            textView.setText(getText(2131820779));
        }
        View view = this.LLJLLIL;
        if (view != null && (viewFindViewById5 = view.findViewById(R.id.uup)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById5);
        }
        View view2 = this.LLJLLIL;
        if (view2 != null && (viewFindViewById4 = view2.findViewById(R.id.vop_bubble_split_line_1)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById4);
        }
        View view3 = this.LLJLLIL;
        if (view3 != null && (viewFindViewById3 = view3.findViewById(R.id.vop_bubble_split_line_2)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById3);
        }
        C1295960jpS c1295960jpS = (C1295960jpS) requireViewById(R.id.ns2);
        c1295960jpS.setAnimation("creation_instantclone_playing_tux_lottie.json");
        c1295960jpS.setRepeatCount(-1);
        this.LLJZ = c1295960jpS;
        C11VN c11vn = this.LLJJJJ;
        if (c11vn != null) {
            c11vn.setInstantClonePanelAbility(new InstantClonePanelAbility() { // from class: X.11Yn
                @Override // com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility
                public final void jumpToEditPage() {
                }

                @Override // com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility
                public final void pauseVideo() {
                }

                @Override // com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility
                public final void updateInstantCloneTTSPanel() {
                }

                @Override // com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility
                public final void closePanel() {
                    C11VN c11vn2 = this.LIZ.LLJJJJ;
                    if (c11vn2 != null) {
                        c11vn2.LJI();
                    }
                    this.LIZ.LLLLIL().LIZ.invoke();
                }

                @Override // com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility
                public final void voiceDeleted() {
                    this.LIZ.LLLLIL().LJIIJJI.invoke();
                }

                @Override // com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility
                public final boolean useVoiceClick(VoiceCloneSpeakerInfo voiceCloneSpeakerInfo) {
                    C01TT.LIZJ(new AwS430S0200000_29(this.LIZ, voiceCloneSpeakerInfo, 63));
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility
                public final void voiceSaved(VoiceCloneSpeakerInfo voiceCloneSpeakerInfo) {
                    this.LIZ.LLLLIL().LJIIJ.invoke(voiceCloneSpeakerInfo);
                }
            });
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11Yx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19519511Yj) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 437));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11Yw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C19519511Yj) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 438));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11Yy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19519511Yj) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 439));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11Yp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19519511Yj) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS606S0100000_27(this, 309));
        View view4 = this.LLJJL;
        if (view4 != null) {
            C786410Ut5.I7(new AkS95S0100000_29(this, 57), view4);
        }
        View view5 = this.LLJJLIIIJLLLLLLLZ;
        if (view5 != null) {
            C786410Ut5.I7(new AkS95S0100000_29(this, 58), view5);
        }
        TextView textView2 = this.LLJLIL;
        if (textView2 != null) {
            C786410Ut5.I7(new AkS95S0100000_29(this, 59), textView2);
        }
        View view6 = this.LLJLILLLLZIIL;
        if (view6 != null) {
            C786410Ut5.I7(new AkS95S0100000_29(this, 60), view6);
        }
        View view7 = this.LLJJJJLIIL;
        if (view7 != null) {
            C786410Ut5.I7(new AkS95S0100000_29(this, 61), view7);
        }
        View view8 = this.LLJLLIL;
        if (view8 != null && (viewFindViewById2 = view8.findViewById(R.id.vz2)) != null) {
            C786410Ut5.I7(new AkS95S0100000_29(this, 62), viewFindViewById2);
        }
        View view9 = this.LLJLLIL;
        if (view9 != null && (viewFindViewById = view9.findViewById(R.id.fkh)) != null) {
            C786410Ut5.I7(new AkS95S0100000_29(this, 63), viewFindViewById);
        }
        ViewGroup viewGroup = this.LLJLLL;
        if (viewGroup != null) {
            viewGroup.setOnTouchListener(new ATListenerS461S0100000_29(this, 13));
        }
        View view10 = this.LLJJJJJIL;
        if (view10 != null) {
            view10.setOnTouchListener(new ATListenerS461S0100000_29(this, 14));
        }
        ViewGroup viewGroup2 = this.LLJLLL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
    }

    public final void LLLLLJLJLL(final Function0 function0, boolean z) {
        String str;
        if (z) {
            C11VN c11vn = this.LLJJJJ;
            if (c11vn != null && c11vn.getVisibility() == 0) {
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            ViewGroup viewGroup = this.LLJLLL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
            C11VN c11vn2 = this.LLJJJJ;
            if (c11vn2 != null) {
                int visibility = c11vn2.getVisibility();
                c11vn2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c11vn2);
            }
            C11VN c11vn3 = this.LLJJJJ;
            if (c11vn3 != null) {
                if (LLLLILI().LIZ.LIZLLL == EnumC361800EGk.TTS_PANEL) {
                    str = "editor_pro_tts";
                } else {
                    str = "editor_pro_sound";
                }
                C01TT.LIZLLL(new AwS67S2100000_29(c11vn3, "half_screen", str, 1));
            }
            C11VN c11vn4 = this.LLJJJJ;
            if (c11vn4 != null) {
                c11vn4.setAuditionFilePath(LLLLIL().LJ.invoke());
            }
            C11VN c11vn5 = this.LLJJJJ;
            if (c11vn5 != null) {
                if (c11vn5.isLaidOut() && !c11vn5.isLayoutRequested()) {
                    C11VN c11vn6 = this.LLJJJJ;
                    if (c11vn6 != null) {
                        C11VM.LJIIIIZZ(c11vn6);
                    }
                } else {
                    c11vn5.addOnLayoutChangeListener(new C12YD(this, 7));
                }
            }
            LLLLLLIL(350L, new C11Z1() { // from class: X.11Yz
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            }, this.LLJJJJ);
            return;
        }
        C11VN c11vn7 = this.LLJJJJ;
        if (c11vn7 != null && c11vn7.getVisibility() == 8) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            LLLLLLJ(300L, new C11Z1() { // from class: X.11Ys
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C11VN c11vn8 = this.LL.LLJJJJ;
                    if (c11vn8 != null) {
                        int visibility2 = c11vn8.getVisibility();
                        c11vn8.setVisibility(8);
                        C1602160rnK.LIZIZ(visibility2, 8, c11vn8);
                    }
                    ViewGroup viewGroup2 = this.LL.LLJLLL;
                    if (viewGroup2 != null) {
                        C786410Ut5.LJLZ(8, viewGroup2);
                    }
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            }, this.LLJJJJ);
        }
    }

    public final void LLLLLL(final Function0 function0, boolean z) {
        if (z) {
            View view = this.LLJJJJJIL;
            if (view != null && view.getVisibility() == 0) {
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            ViewGroup viewGroup = this.LLJLLL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
            View view2 = this.LLJJJJJIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            LLLLLLIL(300L, new C11Z1() { // from class: X.11Z0
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            }, this.LLJJJJJIL);
            return;
        }
        View view3 = this.LLJJJJJIL;
        if (view3 != null && view3.getVisibility() == 8) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            LLLLLLJ(250L, new C11Z1() { // from class: X.11Yt
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    View view4 = this.LL.LLJJJJJIL;
                    if (view4 != null) {
                        C786410Ut5.LJLLLLLL(8, view4);
                    }
                    ViewGroup viewGroup2 = this.LL.LLJLLL;
                    if (viewGroup2 != null) {
                        C786410Ut5.LJLZ(8, viewGroup2);
                    }
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            }, this.LLJJJJJIL);
        }
    }

    public final void LLLLLLIL(final long j, final C11Z1 c11z1, View view) {
        if (view != null) {
            if (view.isLaidOut() && !view.isLayoutRequested()) {
                float height = view.getHeight();
                C0E48 c0e48 = this.LLJJJIL;
                if (c0e48 != null) {
                    c0e48.S7().LIZIZ(new C0E2C(height, "voice_clone_panel", true), "panel_bounce_event", false);
                }
                C786410Ut5.ed(view, height);
                view.animate().translationYBy(-height).setDuration(j).setInterpolator(C1619980sG4.LJIILIIL()).setListener(new AAListenerS327S0100000_16(c11z1, 4));
                return;
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.11Yr
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view2.removeOnLayoutChangeListener(this);
                    float height2 = view2.getHeight();
                    C0E48 c0e482 = this.LL.LLJJJIL;
                    if (c0e482 != null) {
                        c0e482.S7().LIZIZ(new C0E2C(height2, "voice_clone_panel", true), "panel_bounce_event", false);
                    }
                    this.LL.getClass();
                    C786410Ut5.ed(view2, height2);
                    view2.animate().translationYBy(-height2).setDuration(j).setInterpolator(C1619980sG4.LJIILIIL()).setListener(new AAListenerS327S0100000_16(c11z1, 4));
                }
            });
        }
    }

    public final void LLLLLLJ(long j, C11Z1 c11z1, View view) {
        if (view == null) {
            return;
        }
        float height = view.getHeight();
        view.animate().translationYBy(height).setDuration(j).setInterpolator(C1619980sG4.LIZLLL()).setListener(new AAListenerS331S0100000_20(c11z1, 0));
        C0E48 c0e48 = this.LLJJJIL;
        if (c0e48 != null) {
            c0e48.S7().LIZIZ(new C0E2C(height, "voice_clone_panel", false), "panel_bounce_event", false);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eoq, viewGroup, false);
        this.LLJLLL = viewGroup2;
        return viewGroup2;
    }
}
