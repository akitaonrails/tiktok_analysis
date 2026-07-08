package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility;
import com.ss.android.ugc.aweme.services.audio.VoiceCloneSpeakerInfo;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneReadTextEffectBean;
import com.zhiliaoapp.musically.R;
import irm.AkS18S0000000_29;
import irm.AkS95S0100000_29;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS67S2100000_29;
import wh6.AbS686S0100000_2;

/* JADX INFO: renamed from: X.114K, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C114K extends AbstractC1664490tPr<C114V, C114M> implements InterfaceC19407610wM {
    public ViewGroup LLJJJIL;
    public C194329111b LLJJJJ;
    public C11VM LLJJJJJIL;
    public final C12YR LLJJJJLIIL = new C12YR(this, 1);
    public final C19775212Ys LLJJL = new C19775212Ys(this, 7);
    public final C114S LLJJLIIIJLLLLLLLZ = new C18ZN() { // from class: X.114S
        @Override // X.C18ZN
        public final void onAppForeground() {
        }

        @Override // X.C18ZN
        public final void onAppBackground() {
            C11VM c11vm = this.LL.LLJJJJJIL;
            if (c11vm == null) {
                c11vm = null;
            }
            c11vm.LJI();
        }
    };

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        C194329111b c194329111b = this.LLJJJJ;
        if (c194329111b != null) {
            int visibility = c194329111b.getVisibility();
            c194329111b.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c194329111b);
            C194329111b c194329111b2 = this.LLJJJJ;
            if (c194329111b2 == null) {
                c194329111b2 = null;
            }
            c194329111b2.setPlayViewVisible(8);
            C194329111b c194329111b3 = this.LLJJJJ;
            if (c194329111b3 == null) {
                c194329111b3 = null;
            }
            View contentView = c194329111b3.getContentView();
            if (contentView != null && (viewTreeObserver2 = contentView.getViewTreeObserver()) != null) {
                C12YR c12yr = this.LLJJJJLIIL;
                viewTreeObserver2.removeOnPreDrawListener(c12yr);
                C2187701Ajg.LIZIZ(viewTreeObserver2, c12yr, ViewTreeObserver.OnPreDrawListener.class);
            }
            C194329111b c194329111b4 = this.LLJJJJ;
            if (c194329111b4 == null) {
                c194329111b4 = null;
            }
            View contentView2 = c194329111b4.getContentView();
            if (contentView2 != null && (viewTreeObserver = contentView2.getViewTreeObserver()) != null) {
                C12YR c12yr2 = this.LLJJJJLIIL;
                viewTreeObserver.addOnPreDrawListener(c12yr2);
                C2187701Ajg.LIZ(viewTreeObserver, c12yr2, ViewTreeObserver.OnPreDrawListener.class);
            }
            C194329111b c194329111b5 = this.LLJJJJ;
            (c194329111b5 != null ? c194329111b5 : null).LIZ();
        }
        C1447800nmM.LIZIZ(this).LLLIILIL(this, this.LLJJL);
        ActivityStack.addAppBackGroundListener(this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // X.InterfaceC19407610wM
    public final void LLJLLIL() {
        LLLLIL().LJIIJJI.invoke(Boolean.FALSE);
        C0CNO.LIZLLL(0L, new AwS573S0100000_29(this, 683));
    }

    @Override // X.InterfaceC19407610wM
    public final void LLJLLL() {
        LLLLIL().LIZIZ.invoke(Boolean.FALSE);
    }

    @Override // X.InterfaceC19407610wM
    public final void LLLFF() {
        LLLLIL().LIZIZ.invoke(Boolean.TRUE);
    }

    @Override // X.InterfaceC19407610wM
    public final void LLLFZ() {
        LLLLIL().LJIILJJIL.invoke();
        C194329111b c194329111b = this.LLJJJJ;
        if (c194329111b == null) {
            c194329111b = null;
        }
        int visibility = c194329111b.getVisibility();
        c194329111b.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c194329111b);
        C11VM c11vm = this.LLJJJJJIL;
        if (c11vm == null) {
            c11vm = null;
        }
        int visibility2 = c11vm.getVisibility();
        c11vm.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, c11vm);
        C11VM c11vm2 = this.LLJJJJJIL;
        if (c11vm2 == null) {
            c11vm2 = null;
        }
        c11vm2.setInstantClonePanelAbility(new InstantClonePanelAbility() { // from class: X.114L
            @Override // com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility
            public final void jumpToEditPage() {
            }

            @Override // com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility
            public final boolean useVoiceClick(VoiceCloneSpeakerInfo voiceCloneSpeakerInfo) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility
            public final void closePanel() {
                C11VM c11vm3 = this.LIZ.LLJJJJJIL;
                if (c11vm3 == null) {
                    c11vm3 = null;
                }
                c11vm3.LJI();
                C11VM c11vm4 = this.LIZ.LLJJJJJIL;
                if (c11vm4 == null) {
                    c11vm4 = null;
                }
                int visibility3 = c11vm4.getVisibility();
                c11vm4.setVisibility(8);
                C1602160rnK.LIZIZ(visibility3, 8, c11vm4);
                C194329111b c194329111b2 = this.LIZ.LLJJJJ;
                C194329111b c194329111b3 = c194329111b2 != null ? c194329111b2 : null;
                int visibility4 = c194329111b3.getVisibility();
                c194329111b3.setVisibility(0);
                C1602160rnK.LIZIZ(visibility4, 0, c194329111b3);
                this.LIZ.LLLLIL().LJIILL.invoke();
                this.LIZ.LLLLIL().LJIIL.invoke(Boolean.FALSE);
            }

            @Override // com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility
            public final void pauseVideo() {
                this.LIZ.LLLLIL().LJIIL.invoke(Boolean.TRUE);
            }

            @Override // com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility
            public final void updateInstantCloneTTSPanel() {
                this.LIZ.LLLLIL().LJIIJJI.invoke(Boolean.TRUE);
            }

            @Override // com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility
            public final void voiceDeleted() {
                InstantClonePanelAbility.DefaultImpls.voiceDeleted(this);
            }

            @Override // com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility
            public final void voiceSaved(VoiceCloneSpeakerInfo voiceCloneSpeakerInfo) {
                InstantClonePanelAbility.DefaultImpls.voiceSaved(this, voiceCloneSpeakerInfo);
            }
        });
        C11VM c11vm3 = this.LLJJJJJIL;
        if (c11vm3 == null) {
            c11vm3 = null;
        }
        c11vm3.getClass();
        C01TT.LIZLLL(new AwS67S2100000_29(c11vm3, "half_screen", "voice_panel", 1));
        C11VM c11vm4 = this.LLJJJJJIL;
        if (c11vm4 == null) {
            c11vm4 = null;
        }
        c11vm4.setAuditionFilePath(LLLLIL().LJIILIIL.invoke());
        C11VM c11vm5 = this.LLJJJJJIL;
        C11VM.LJIIIIZZ(c11vm5 != null ? c11vm5 : null);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C11VM c11vm = this.LLJJJJJIL;
        if (c11vm == null) {
            c11vm = null;
        }
        c11vm.LJFF();
        C194329111b c194329111b = this.LLJJJJ;
        if (c194329111b == null) {
            c194329111b = null;
        }
        C2296808zG.LIZJ(c194329111b.LLJJL, null);
    }

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        C1447800nmM.LIZIZ(this).LLLLLLLZIL(this.LLJJL);
        ActivityStack.removeAppBackGroundListener(this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C11VM c11vm = this.LLJJJJJIL;
        if (c11vm == null) {
            c11vm = null;
        }
        c11vm.LJI();
    }

    @Override // X.InterfaceC19407610wM
    public final boolean LLJLILLLLZIIL(String str) {
        return LLLLIL().LJ.invoke(str).booleanValue();
    }

    @Override // X.InterfaceC19407610wM
    public final void LLJZIJLIL(VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean) {
        C194329111b c194329111b = this.LLJJJJ;
        RelativeLayout relativeLayout = null;
        if (c194329111b == null) {
            c194329111b = null;
        }
        View view = c194329111b.LLJJIJIL;
        if (view != null) {
            if (c194329111b.LLJJJJJIL) {
                c194329111b.LIZ();
            } else {
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
        C194329111b c194329111b2 = this.LLJJJJ;
        if (c194329111b2 == null) {
            c194329111b2 = null;
        }
        RelativeLayout relativeLayout2 = c194329111b2.LLJJJJ;
        if (relativeLayout2 == null) {
            relativeLayout2 = null;
        }
        C786410Ut5.I7(new AbS686S0100000_2(c194329111b2, 12), relativeLayout2);
        RelativeLayout relativeLayout3 = c194329111b2.LLJJJIL;
        if (relativeLayout3 != null) {
            relativeLayout = relativeLayout3;
        }
        C786410Ut5.I7(new AbS686S0100000_2(c194329111b2, 13), relativeLayout);
    }

    @Override // X.InterfaceC19407610wM
    public final void LLLF(ReadTextEffectBean readTextEffectBean) {
        LLLLIL().LJFF.invoke(readTextEffectBean);
    }

    @Override // X.InterfaceC19407610wM
    public final void LLLFFI(ReadTextEffectBean readTextEffectBean) {
        LLLLIL().LJII.invoke(readTextEffectBean);
    }

    @Override // X.InterfaceC19407610wM
    public final void LLLI(ReadTextEffectBean readTextEffectBean) {
        LLLLIL().LJIIJ.invoke(readTextEffectBean);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        super.onActivityCreated(bundle);
        this.LLJJJJ = (C194329111b) requireViewById(R.id.yx9);
        this.LLJJJJJIL = (C11VM) requireViewById(R.id.ktq);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.114N
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C114V) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 388));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.114P
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C114V) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 389));
        C194329111b c194329111b = this.LLJJJJ;
        C194329111b c194329111b2 = null;
        if (c194329111b == null) {
            c194329111b = null;
        }
        c194329111b.setOnCheckBoxChangeListener(new C12YG(this, 3));
        C194329111b c194329111b3 = this.LLJJJJ;
        if (c194329111b3 == null) {
            c194329111b3 = null;
        }
        c194329111b3.setOnParentLayoutListener(new AkS95S0100000_29(this, 55));
        C11VM c11vm = this.LLJJJJJIL;
        if (c11vm == null) {
            c11vm = null;
        }
        c11vm.setOnParentLayoutListener(new AkS18S0000000_29(4));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.114Q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C114V) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 390));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.114T
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C114V) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 384));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.114O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C114V) obj).LJ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 385));
        C194329111b c194329111b4 = this.LLJJJJ;
        if (c194329111b4 == null) {
            c194329111b4 = null;
        }
        c194329111b4.setTTSPanelBeanOpt(this);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C114V) obj).LJFF;
            }
        }, new AwS608S0100000_29(this, 386));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C114V) obj).LJI;
            }
        }, new AwS608S0100000_29(this, 387));
        C194329111b c194329111b5 = this.LLJJJJ;
        if (c194329111b5 == null) {
            c194329111b5 = null;
        }
        C11Y7.LLLLLZL.getClass();
        c194329111b5.setContentLayoutHeight(C366700EZg.LIZ(C11Y7.LLLLZIL));
        C194329111b c194329111b6 = this.LLJJJJ;
        if (c194329111b6 == null) {
            c194329111b6 = null;
        }
        View contentView = c194329111b6.getContentView();
        if (contentView != null && (viewTreeObserver2 = contentView.getViewTreeObserver()) != null) {
            C12YR c12yr = this.LLJJJJLIIL;
            viewTreeObserver2.removeOnPreDrawListener(c12yr);
            C2187701Ajg.LIZIZ(viewTreeObserver2, c12yr, ViewTreeObserver.OnPreDrawListener.class);
        }
        C194329111b c194329111b7 = this.LLJJJJ;
        if (c194329111b7 != null) {
            c194329111b2 = c194329111b7;
        }
        View contentView2 = c194329111b2.getContentView();
        if (contentView2 != null && (viewTreeObserver = contentView2.getViewTreeObserver()) != null) {
            C12YR c12yr2 = this.LLJJJJLIIL;
            viewTreeObserver.addOnPreDrawListener(c12yr2);
            C2187701Ajg.LIZ(viewTreeObserver, c12yr2, ViewTreeObserver.OnPreDrawListener.class);
        }
    }

    @Override // X.InterfaceC19407610wM
    public final void LLJLL(int i, boolean z, ArrayList arrayList) {
        C194329111b c194329111b = this.LLJJJJ;
        if (c194329111b == null) {
            c194329111b = null;
        }
        if (i != c194329111b.getCurrentItemIndex()) {
            return;
        }
        LLLLIL().LJI.invoke(arrayList);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ep8, viewGroup, false);
        this.LLJJJIL = viewGroup2;
        return viewGroup2;
    }
}
