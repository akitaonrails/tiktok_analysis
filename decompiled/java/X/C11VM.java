package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService;
import com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneAgreementFragment;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneFinishFragment;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneRecordFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS145S0110000_29;
import kotlin.jvm.internal.AwS178S1100000_29;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11VM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C11VM extends RelativeLayout {
    public View LL;
    public RelativeLayout LLILLJJLI;
    public RelativeLayout LLILLL;
    public FrameLayout LLILZ;
    public TuxIconView LLILZIL;
    public C197039127h LLILZLL;
    public C197039127h LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxIconView LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public FragmentManager LLJILJILJ;
    public C19EH LLJILLL;
    public InstantCloneAgreementFragment LLJJ;
    public InstantCloneRecordFragment LLJJI;
    public InstantCloneFinishFragment LLJJIII;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJIJI;
    public InstantClonePanelAbility LLJJIJIIJIL;
    public DialogC1389620mGW LLJJIJIL;
    public C1749280vcc LLJJJ;
    public String LLJJJIL;
    public boolean LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public AnonymousClass0956 LLJJLIIIJLLLLLLLZ;
    public AnonymousClass0956 LLJL;

    public int getFragmentContainerViewId() {
        return R.id.ktm;
    }

    private final int getScreenHeight() {
        return ((Number) this.LLJJJJLIIL.getValue()).intValue();
    }

    public final void LIZ() {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout relativeLayout = this.LLILLL;
        if (relativeLayout != null) {
            if (!relativeLayout.isLaidOut() || relativeLayout.isLayoutRequested()) {
                relativeLayout.addOnLayoutChangeListener(new C12YD(this, 6));
                return;
            }
            View view = this.LL;
            if (view == null) {
                view = null;
            }
            if (Math.abs(view.getHeight() - relativeLayout.getHeight()) <= 1) {
                ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
                if (!(layoutParams2 instanceof RelativeLayout.LayoutParams) || (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) == null) {
                    return;
                }
                layoutParams.topMargin = C0JAI.LIZLLL(getContext());
                C786410Ut5.W5(relativeLayout, layoutParams);
            }
        }
    }

    public final void LIZIZ() {
        try {
            C01TT.LIZLLL(new AwS546S0100000_2(this, 878));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final boolean LIZJ() {
        return Intrinsics.LJFF(this.LLJILJIL, "MDP") || Intrinsics.LJFF(this.LLJILJIL, "VDP") || Intrinsics.LJFF(this.LLJILJIL, "web_h5");
    }

    public final boolean LIZLLL() {
        return Intrinsics.LJFF(this.LLJILJIL, "editor_pro_sound") || Intrinsics.LJFF(this.LLJILJIL, "editor_pro_tts");
    }

    public final void LJFF() {
        InstantCloneFinishFragment instantCloneFinishFragment = this.LLJJIII;
        if (instantCloneFinishFragment != null) {
            ObjectAnimator objectAnimator = instantCloneFinishFragment.LLJIJIL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            C1295960jpS c1295960jpS = instantCloneFinishFragment.LLJILJIL;
            if (c1295960jpS != null) {
                c1295960jpS.cancelAnimation();
            }
        }
        C2296808zG.LIZJ(getCoroutineScope(), null);
    }

    public final void LJI() {
        AnonymousClass0956 anonymousClass0956;
        AnonymousClass0956 anonymousClass09562 = this.LLJJLIIIJLLLLLLLZ;
        if (anonymousClass09562 != null && anonymousClass09562.isActive() && (anonymousClass0956 = this.LLJJLIIIJLLLLLLLZ) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        getVopInstantCloneCameraService().setForbidDestroy(false);
        C05HM.LIZIZ.LJJIJIIJIL();
        if (Intrinsics.LJFF(this.LLJIJIL, "record_page")) {
            InstantCloneRecordFragment instantCloneRecordFragment = this.LLJJI;
            if (instantCloneRecordFragment != null) {
                instantCloneRecordFragment.MR();
            }
            InstantCloneRecordFragment instantCloneRecordFragment2 = this.LLJJI;
            if (instantCloneRecordFragment2 != null) {
                instantCloneRecordFragment2.NR();
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(this.LLJIJIL, "finish_page")) {
            getVopInstantCloneCameraService().stopAudition();
            InstantCloneFinishFragment instantCloneFinishFragment = this.LLJJIII;
            if (instantCloneFinishFragment != null) {
                C01TT.LIZLLL(new AwS573S0100000_29(instantCloneFinishFragment, 953));
            }
            InstantCloneFinishFragment instantCloneFinishFragment2 = this.LLJJIII;
            if (instantCloneFinishFragment2 != null) {
                C01TT.LIZLLL(new AwS573S0100000_29(instantCloneFinishFragment2, 954));
            }
        }
    }

    public final void LJIIIZ() {
        try {
            C01TT.LIZLLL(new AwS546S0100000_2(this, 879));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final InterfaceC497601wk getCoroutineScope() {
        return (InterfaceC497601wk) this.LLJJJJJIL.getValue();
    }

    public final int getPanelHeight() {
        if (Intrinsics.LJFF(this.LLJI, "full_screen")) {
            return getScreenHeight();
        }
        if (Intrinsics.LJFF(this.LLJIJIL, "agreement_detail_page")) {
            return getScreenHeight();
        }
        RelativeLayout relativeLayout = this.LLILLJJLI;
        if (relativeLayout != null) {
            return relativeLayout.getHeight();
        }
        return 0;
    }

    public final IVopInstantCloneCameraService getVopInstantCloneCameraService() {
        return (IVopInstantCloneCameraService) this.LLJJL.getValue();
    }

    public final void LJII() {
        C1397580mTM c1397580mTM = new C1397580mTM(getContext());
        c1397580mTM.LJII = false;
        c1397580mTM.LJI(getContext().getString(2131858323));
        c1397580mTM.LIZIZ(getContext().getString(2131858322));
        C985403tE.LIZ(c1397580mTM, new AwS581S0100000_2(this, 343));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJFF();
    }

    public final RelativeLayout getAgreementDetailLayout() {
        return this.LLILLL;
    }

    public final FragmentManager getFragmentManager() {
        return this.LLJILJILJ;
    }

    public final C19EH getFragmentTransaction() {
        return this.LLJILLL;
    }

    public final RelativeLayout getVopLayout() {
        return this.LLILLJJLI;
    }

    public static void LJIIIIZZ(C11VM c11vm) {
        c11vm.getClass();
        C01TT.LIZLLL(new AwS145S0110000_29(c11vm, false, 6));
    }

    public final void LJ(String str) {
        C01TT.LIZLLL(new AwS178S1100000_29(this, str, 3));
    }

    public final void setAgreementDetailLayout(RelativeLayout relativeLayout) {
        this.LLILLL = relativeLayout;
    }

    public final void setAuditionFilePath(String str) {
        this.LLJJJIL = str;
    }

    public final void setFragmentManager(FragmentManager fragmentManager) {
        this.LLJILJILJ = fragmentManager;
    }

    public final void setFragmentTransaction(C19EH c19eh) {
        this.LLJILLL = c19eh;
    }

    public final void setInstantClonePanelAbility(InstantClonePanelAbility instantClonePanelAbility) {
        this.LLJJIJIIJIL = instantClonePanelAbility;
    }

    public final void setOnParentLayoutListener(View.OnClickListener onClickListener) {
        View view = this.LL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.I7(onClickListener, view);
    }

    public final void setVopLayout(RelativeLayout relativeLayout) {
        this.LLILLJJLI = relativeLayout;
    }

    public C11VM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJI = "half_screen";
        this.LLJIJIL = "";
        this.LLJILJIL = "";
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(272));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 679));
        this.LLJJL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(730));
        setBackgroundColor(0);
        this.LL = C786410Ut5.Sd(R.layout.ep3, C786410Ut5.ne(context), this);
        this.LLILLJJLI = (RelativeLayout) findViewById(R.id.vop_layout);
        this.LLILLL = (RelativeLayout) findViewById(R.id.amd);
        this.LLILZIL = (TuxIconView) findViewById(R.id.amc);
        this.LLILZLL = (C197039127h) findViewById(R.id.amj);
        this.LLIZ = (C197039127h) findViewById(R.id.amk);
        this.LLJJJ = (C1749280vcc) findViewById(R.id.nne);
        this.LLILZ = (FrameLayout) findViewById(R.id.webview_container);
        this.LLIZLLLIL = (TuxIconView) findViewById(R.id.vop_close_half);
        this.LLJ = (TuxIconView) findViewById(R.id.vop_close_full);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = (int) C0JAI.LIZ(52.0f, context);
        C786410Ut5.a6(frameLayout, layoutParams);
        frameLayout.setId(getFragmentContainerViewId());
        RelativeLayout relativeLayout = this.LLILLJJLI;
        if (relativeLayout != null) {
            relativeLayout.addView(frameLayout);
        }
    }
}
