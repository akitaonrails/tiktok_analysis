package X;

import Y.ACListenerS167S0100000_33;
import Y.ARunnableS74S0200000_5;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AwS577S0100000_33;
import mf.a;
import wh6.AbS712S0100000_33;

/* JADX INFO: renamed from: X.1Ad0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183561Ad0 extends ConstraintLayout {
    public InterfaceC2183581Ad2 LL;
    public View LLILLJJLI;
    public LinearLayout LLILLL;
    public C21373018ka LLILZ;
    public TuxTextView LLILZIL;
    public LinearLayout LLILZLL;
    public TuxTextView LLIZ;
    public TuxIconView LLIZLLLIL;
    public LinearLayout LLJ;
    public TuxTextView LLJI;
    public C11FU LLJIJIL;
    public LinearLayout LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxIconView LLJILLL;
    public View LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public int LLJLLL;
    public final C419910GdJ LLJZ;
    public final C419910GdJ LLJZIJLIL;

    public C2183561Ad0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, 12);
    }

    private final View getActionBarEditBackground() {
        return (View) this.LLJL.getValue();
    }

    private final LinearLayout getCommentContainer() {
        return (LinearLayout) this.LLJJIJIIJIL.getValue();
    }

    private final TuxTextView getCommentCountTextView() {
        return (TuxTextView) this.LLJJIJIL.getValue();
    }

    private final View getCommentHotzoneContainer() {
        return (View) this.LLJLILLLLZIIL.getValue();
    }

    private final TuxIconView getCommentIconView() {
        return (TuxIconView) this.LLJJJ.getValue();
    }

    private final C21373018ka getDiggAnimationView() {
        return (C21373018ka) this.LLJJIII.getValue();
    }

    private final LinearLayout getDiggContainer() {
        return (LinearLayout) this.LLJJI.getValue();
    }

    private final TuxTextView getDiggCountTextView() {
        return (TuxTextView) this.LLJJIJI.getValue();
    }

    private final View getDiggHotzoneContainer() {
        return (View) this.LLJLIL.getValue();
    }

    private final LinearLayout getFavoriteContainer() {
        return (LinearLayout) this.LLJJJIL.getValue();
    }

    private final TuxTextView getFavoriteCountTextView() {
        return (TuxTextView) this.LLJJJJ.getValue();
    }

    private final View getFavoriteHotzoneContainer() {
        return (View) this.LLJLL.getValue();
    }

    private final C11FU getFavoriteImageView() {
        return (C11FU) this.LLJJJJJIL.getValue();
    }

    private final LinearLayout getShareContainer() {
        return (LinearLayout) this.LLJJJJLIIL.getValue();
    }

    private final TuxTextView getShareCountTextView() {
        return (TuxTextView) this.LLJJL.getValue();
    }

    private final View getShareHotzoneContainer() {
        return (View) this.LLJLLIL.getValue();
    }

    private final TuxIconView getShareIconView() {
        return (TuxIconView) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final View getActionBarSeparatorFromXml() {
        View view = this.LLILLJJLI;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.a1q);
        this.LLILLJJLI = viewFindViewById;
        return viewFindViewById;
    }

    public final LinearLayout getPostModeActionBarCommentContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rjj);
            this.LLILZLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getPostModeActionBarCommentImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rjl);
            this.LLIZLLLIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getPostModeActionBarCommentTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rjm);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C21373018ka getPostModeActionBarDiggAnimationViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rjo);
            this.LLILZ = (C21373018ka) callbackFindViewById;
        }
        return (C21373018ka) callbackFindViewById;
    }

    public final LinearLayout getPostModeActionBarDiggContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rjp);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getPostModeActionBarDiggTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rjr);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final View getPostModeActionBarEditBackgroundFromXml() {
        View view = this.LLJJ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.rjs);
        this.LLJJ = viewFindViewById;
        return viewFindViewById;
    }

    public final LinearLayout getPostModeActionBarFavoriteContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rju);
            this.LLJ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C11FU getPostModeActionBarFavoriteImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rjw);
            this.LLJIJIL = (C11FU) callbackFindViewById;
        }
        return (C11FU) callbackFindViewById;
    }

    public final TuxTextView getPostModeActionBarFavoriteTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rjx);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getPostModeActionBarShareContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rjy);
            this.LLJILJIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getPostModeActionBarShareImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rk0);
            this.LLJILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getPostModeActionBarShareTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rk1);
            this.LLJILJILJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void h0() {
        if (((Boolean) C259140ADo.LIZ.getValue()).booleanValue()) {
            getActionBarEditBackground().setBackgroundResource(R.drawable.cwd);
        }
        if (C277310Att.LIZ()) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            getDiggAnimationView().setIconSize(iLIZIZ);
            TuxIconView commentIconView = getCommentIconView();
            ViewGroup.LayoutParams layoutParams = commentIconView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iLIZIZ, iLIZIZ);
            }
            layoutParams.width = iLIZIZ;
            layoutParams.height = iLIZIZ;
            C786410Ut5.W5(commentIconView, layoutParams);
            commentIconView.setIconWidth(iLIZIZ);
            commentIconView.setIconHeight(iLIZIZ);
            this.LLJLLL = iLIZIZ;
            C419910GdJ c419910GdJ = this.LLJZ;
            c419910GdJ.LIZIZ = iLIZIZ;
            c419910GdJ.LIZJ = iLIZIZ;
            C419910GdJ c419910GdJ2 = this.LLJZIJLIL;
            c419910GdJ2.LIZIZ = iLIZIZ;
            c419910GdJ2.LIZJ = iLIZIZ;
            C11FU favoriteImageView = getFavoriteImageView();
            ViewGroup.LayoutParams layoutParams2 = favoriteImageView.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(iLIZIZ, iLIZIZ);
            }
            layoutParams2.width = iLIZIZ;
            layoutParams2.height = iLIZIZ;
            C786410Ut5.W5(favoriteImageView, layoutParams2);
            TuxIconView shareIconView = getShareIconView();
            ViewGroup.LayoutParams layoutParams3 = shareIconView.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(iLIZIZ, iLIZIZ);
            }
            layoutParams3.width = iLIZIZ;
            layoutParams3.height = iLIZIZ;
            C786410Ut5.W5(shareIconView, layoutParams3);
            shareIconView.setIconWidth(iLIZIZ);
            shareIconView.setIconHeight(iLIZIZ);
            for (TuxTextView tuxTextView : C13LQ.LJIIJJI(new TuxTextView[]{getDiggCountTextView(), getCommentCountTextView(), getFavoriteCountTextView(), getShareCountTextView()})) {
                tuxTextView.setMaxLines(1);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView.setIncludeFontPadding(false);
                tuxTextView.setMinTextSize(11.0f);
                e0(tuxTextView);
            }
        }
    }

    public final void i0() {
        getDiggAnimationView().LIZ();
    }

    public final void l0() {
        getFavoriteImageView().LIZLLL();
    }

    public final InterfaceC2183581Ad2 getActionsListener() {
        return this.LL;
    }

    public final void e0(TuxTextView tuxTextView) {
        if (!C277310Att.LIZ()) {
            return;
        }
        HandlerHook.viewPost(tuxTextView, new ARunnableS74S0200000_5(tuxTextView, this, 15));
    }

    public final void j0(boolean z) {
        int i;
        TuxTextView diggCountTextView = getDiggCountTextView();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLZLL(diggCountTextView, i);
    }

    public final void n0(boolean z) {
        TuxIconDrawable tuxIconDrawableLIZ;
        C11FU favoriteImageView = getFavoriteImageView();
        if (z) {
            tuxIconDrawableLIZ = this.LLJZIJLIL.LIZ(getContext());
        } else {
            tuxIconDrawableLIZ = this.LLJZ.LIZ(getContext());
        }
        favoriteImageView.setImageDrawable(tuxIconDrawableLIZ);
    }

    public final void setActionBarSeparatorFromXml(View view) {
        this.LLILLJJLI = view;
    }

    public final void setActionsListener(InterfaceC2183581Ad2 interfaceC2183581Ad2) {
        this.LL = interfaceC2183581Ad2;
    }

    public final void setCommentText(String str) {
        getCommentCountTextView().setText(str);
        e0(getCommentCountTextView());
    }

    public final void setCountsVisible$post_mode_release(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        j0(z);
        C786410Ut5.LLLLZLL(getCommentCountTextView(), i);
        C786410Ut5.LLLLZLL(getFavoriteCountTextView(), i);
        C786410Ut5.LLLLZLL(getShareCountTextView(), i);
    }

    public final void setDiggAnimationViewSelected(boolean z) {
        getDiggAnimationView().setSelected(z);
    }

    public final void setDiggText(String str) {
        getDiggCountTextView().setText(str);
        e0(getDiggCountTextView());
    }

    public final void setFavoriteText(String str) {
        getFavoriteCountTextView().setText(str);
        e0(getFavoriteCountTextView());
    }

    public final void setPostModeActionBarCommentContainerFromXml(LinearLayout linearLayout) {
        this.LLILZLL = linearLayout;
    }

    public final void setPostModeActionBarCommentImageFromXml(TuxIconView tuxIconView) {
        this.LLIZLLLIL = tuxIconView;
    }

    public final void setPostModeActionBarCommentTextFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setPostModeActionBarDiggAnimationViewFromXml(C21373018ka c21373018ka) {
        this.LLILZ = c21373018ka;
    }

    public final void setPostModeActionBarDiggContainerFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setPostModeActionBarDiggTextFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setPostModeActionBarEditBackgroundFromXml(View view) {
        this.LLJJ = view;
    }

    public final void setPostModeActionBarFavoriteContainerFromXml(LinearLayout linearLayout) {
        this.LLJ = linearLayout;
    }

    public final void setPostModeActionBarFavoriteImageFromXml(C11FU c11fu) {
        this.LLJIJIL = c11fu;
    }

    public final void setPostModeActionBarFavoriteTextFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public final void setPostModeActionBarShareContainerFromXml(LinearLayout linearLayout) {
        this.LLJILJIL = linearLayout;
    }

    public final void setPostModeActionBarShareImageFromXml(TuxIconView tuxIconView) {
        this.LLJILLL = tuxIconView;
    }

    public final void setPostModeActionBarShareTextFromXml(TuxTextView tuxTextView) {
        this.LLJILJILJ = tuxTextView;
    }

    public final void setShareText(String str) {
        getShareCountTextView().setText(str);
        e0(getShareCountTextView());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2183561Ad0(Context context, AttributeSet attributeSet, InterfaceC2183581Ad2 interfaceC2183581Ad2, int i) {
        int i2;
        int i3;
        View.OnClickListener fVar;
        View favoriteHotzoneContainer;
        View shareHotzoneContainer;
        View commentHotzoneContainer;
        View diggHotzoneContainer;
        int i4;
        InterfaceC2183581Ad2 interfaceC2183581Ad22 = interfaceC2183581Ad2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        interfaceC2183581Ad22 = (i & 8) != 0 ? null : interfaceC2183581Ad22;
        super(context, attributeSet, 0);
        this.LL = interfaceC2183581Ad22;
        this.LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4088));
        this.LLJJIII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4087));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4089));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4083));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4084));
        this.LLJJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4086));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4091));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4092));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4094));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4095));
        this.LLJJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, SpeechEngineDefines.TTS_WORK_MODE_BOTH));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4081));
        this.LLJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4082));
        this.LLJLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4090));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4085));
        this.LLJLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4093));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4080));
        AbS712S0100000_33 abS712S0100000_33 = new AbS712S0100000_33(this, 16);
        ACListenerS167S0100000_33 aCListenerS167S0100000_33 = new ACListenerS167S0100000_33(this, 94);
        ACListenerS167S0100000_33 aCListenerS167S0100000_332 = new ACListenerS167S0100000_33(this, 95);
        this.LLJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_3pt_bookmark;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
        int i5 = this.LLJLLL;
        c419910GdJ.LIZIZ = i5;
        c419910GdJ.LIZJ = i5;
        this.LLJZ = c419910GdJ;
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_3pt_bookmark_fill;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.ny);
        int i6 = this.LLJLLL;
        c419910GdJ2.LIZIZ = i6;
        c419910GdJ2.LIZJ = i6;
        this.LLJZIJLIL = c419910GdJ2;
        C11FV c11fv = new C11FV() { // from class: X.1Ad1
            @Override // X.C11FV
            public final void LIZ() {
            }

            @Override // X.C11FV
            public final void onStateChange(int i7) {
                InterfaceC2183581Ad2 actionsListener;
                if (i7 == 1 && (actionsListener = this.LIZ.getActionsListener()) != null) {
                    actionsListener.LJII();
                }
            }
        };
        ACListenerS167S0100000_33 aCListenerS167S0100000_333 = new ACListenerS167S0100000_33(this, 96);
        if (C277310Att.LIZ()) {
            i2 = R.layout.e_l;
        } else {
            i2 = R.layout.e_k;
        }
        C21146717pB.LIZIZ(context, i2, this, true);
        if (getLayoutParams() == null) {
            if (C277310Att.LIZ()) {
                i4 = 50;
            } else {
                i4 = 49;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i4)));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        } else {
            getLayoutParams().width = -1;
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (C277310Att.LIZ()) {
                i3 = 50;
            } else {
                i3 = 49;
            }
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i3));
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
        setBackgroundColor(numLIZJ != null ? numLIZJ.intValue() : -1);
        if (C277310Att.LIZ() && (diggHotzoneContainer = getDiggHotzoneContainer()) != null) {
            C786410Ut5.I7(abS712S0100000_33, diggHotzoneContainer);
        }
        C786410Ut5.R7(getDiggContainer(), abS712S0100000_33);
        C21373018ka diggAnimationView = getDiggAnimationView();
        if (C1848410yCV.LIZ) {
            fVar = new f(abS712S0100000_33);
        } else {
            fVar = abS712S0100000_33;
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(diggAnimationView);
        }
        diggAnimationView.setOnClickListener(aVar);
        C786410Ut5.h9(getDiggCountTextView(), abS712S0100000_33);
        if (C277310Att.LIZ() && (commentHotzoneContainer = getCommentHotzoneContainer()) != null) {
            C786410Ut5.I7(aCListenerS167S0100000_33, commentHotzoneContainer);
        }
        C786410Ut5.R7(getCommentContainer(), aCListenerS167S0100000_33);
        C786410Ut5.h9(getCommentCountTextView(), aCListenerS167S0100000_33);
        C786410Ut5.a9(getCommentIconView(), aCListenerS167S0100000_33);
        if (!((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIIZILJ()) {
            C786410Ut5.LJZL(8, getFavoriteContainer());
            View favoriteHotzoneContainer2 = getFavoriteHotzoneContainer();
            if (favoriteHotzoneContainer2 != null) {
                C786410Ut5.LJLLLLLL(8, favoriteHotzoneContainer2);
            }
        } else {
            if (C277310Att.LIZ() && (favoriteHotzoneContainer = getFavoriteHotzoneContainer()) != null) {
                C786410Ut5.I7(aCListenerS167S0100000_332, favoriteHotzoneContainer);
            }
            C786410Ut5.R7(getFavoriteContainer(), aCListenerS167S0100000_332);
            C786410Ut5.h9(getFavoriteCountTextView(), aCListenerS167S0100000_332);
            C786410Ut5.da(getFavoriteImageView(), aCListenerS167S0100000_332);
            getFavoriteImageView().setOnStateChangeListener(c11fv);
        }
        if (C277310Att.LIZ() && (shareHotzoneContainer = getShareHotzoneContainer()) != null) {
            C786410Ut5.I7(aCListenerS167S0100000_333, shareHotzoneContainer);
        }
        C786410Ut5.R7(getShareContainer(), aCListenerS167S0100000_333);
        C786410Ut5.h9(getShareCountTextView(), aCListenerS167S0100000_333);
        C786410Ut5.a9(getShareIconView(), aCListenerS167S0100000_333);
        Iterator it2 = C13LQ.LJIIJJI(new TuxIconView[]{getCommentIconView(), getShareIconView()}).iterator();
        while (it2.hasNext()) {
            ((TuxIconView) it2.next()).setTintColorRes(R.attr.a1h);
        }
        Iterator it3 = C13LQ.LJIIJJI(new TuxTextView[]{getDiggCountTextView(), getCommentCountTextView(), getFavoriteCountTextView(), getShareCountTextView()}).iterator();
        while (it3.hasNext()) {
            ((TuxTextView) it3.next()).setTextColorRes(R.attr.a1h);
        }
        this.LLJZ.LJ = Integer.valueOf(R.attr.a1h);
    }
}
