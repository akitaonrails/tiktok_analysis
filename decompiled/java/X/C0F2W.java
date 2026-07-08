package X;

import Y.ACListenerS140S0100000_5;
import Y.ARunnableS74S0200000_5;
import Y.ARunnableS8S0210000_5;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import avg.f;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS123S0110000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import mf.a;

/* JADX INFO: renamed from: X.0F2W, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F2W extends AbstractC2255721DQs<InterfaceC361310EEn> implements InterfaceC361310EEn, InterfaceC379610EuV {
    public static final C383540F2a LLJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final C372830EjZ LLILLL;
    public boolean LLILZ;
    public Boolean LLILZIL;
    public C0F2X LLILZLL;
    public boolean LLIZ;
    public boolean LLJ;
    public boolean LLJI;
    public final Handler LLIZLLLIL = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 907));
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), C0EGY.class, null);
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 908));
    public final C0EIE LLJILLL = C0EIE.ANIM_MOVE;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0F2a] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0F2W.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJ = new Object() { // from class: X.0F2a
        };
        LLJJIII = 8;
    }

    @Override // X.InterfaceC361310EEn, X.C0EIO
    public boolean LLILLIZIL(List<String> list, C0ELJ c0elj) {
        return false;
    }

    @Override // X.InterfaceC361310EEn, X.C0EIO
    public boolean LLJJ() {
        return false;
    }

    @Override // X.InterfaceC361310EEn, X.C0EIO
    public boolean LLJLILLLLZIIL(C0E5A c0e5a, List<String> list) {
        return false;
    }

    @Override // X.InterfaceC361310EEn, X.C0EIO
    public boolean LLLIILIL() {
        return false;
    }

    @Override // X.InterfaceC361310EEn, X.C0EIO
    public boolean LLLZZIL(List<String> list) {
        return false;
    }

    public InterfaceC361310EEn W1() {
        return this;
    }

    @Override // X.InterfaceC361310EEn
    public void hg() {
    }

    private final boolean G2() {
        return C351230Dpp.LJ(null) && !C363750ENx.LIZIZ("animation_guide");
    }

    private final InterfaceC1737690vJv o2() {
        return (InterfaceC1737690vJv) this.LLJILJILJ.getValue();
    }

    private final void w2() {
        ViewGroup viewGroup;
        if (this.LLILZLL != null) {
            return;
        }
        C0F2X c0f2x = new C0F2X(this.LLILLJJLI.requireSceneContext());
        c0f2x.setId(R.id.f7j);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0f2x);
        c0f2x.setLayoutParams(layoutParams);
        View.OnClickListener aCListenerS140S0100000_5 = new ACListenerS140S0100000_5(this, 103);
        if (C1848410yCV.LIZ) {
            aCListenerS140S0100000_5 = new f(aCListenerS140S0100000_5);
        }
        a aVar = new a(aCListenerS140S0100000_5);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0f2x);
        }
        c0f2x.setOnClickListener(aVar);
        c0f2x.setStepCallBack(new InterfaceC383550F2b() { // from class: X.0F2Y
            @Override // X.InterfaceC383550F2b
            public final void LIZ(C0F2Z c0f2z) {
                if (c0f2z == C0F2Z.GUIDE_CUT) {
                    C0F2X c0f2x2 = this.LIZ.LLILZLL;
                    if (c0f2x2 != null) {
                        c0f2x2.LLILLL = C0F2Z.EMPTY;
                        C786410Ut5.LLLLZLL(c0f2x2.LLILZIL, 8);
                        c0f2x2.invalidate();
                    }
                    this.LIZ.LLIZLLLIL.removeCallbacksAndMessages(null);
                    InterfaceC359940E9g interfaceC359940E9gAZ0 = this.LIZ.X1().AZ0();
                    if (interfaceC359940E9gAZ0 != null) {
                        interfaceC359940E9gAZ0.LJIIIZ("bottom_item_root_edit");
                    }
                    this.LIZ.H2();
                    C0EFE c0efe = C0EFE.LIZ;
                    VideoPublishEditModel videoPublishEditModelBb2 = this.LIZ.bb2();
                    C0E48 c0e48Z1 = this.LIZ.Z1();
                    EnumC362430EIv enumC362430EIv = EnumC362430EIv.CLICK_EDIT;
                    c0efe.getClass();
                    C0EFE.LIZ(videoPublishEditModelBb2, c0e48Z1, enumC362430EIv);
                    return;
                }
                if (c0f2z == C0F2Z.GUIDE_ANIMATION) {
                    C0EFE c0efe2 = C0EFE.LIZ;
                    VideoPublishEditModel videoPublishEditModelBb22 = this.LIZ.bb2();
                    C0E48 c0e48Z12 = this.LIZ.Z1();
                    EnumC362430EIv enumC362430EIv2 = EnumC362430EIv.CLICK_ANIMATION;
                    c0efe2.getClass();
                    C0EFE.LIZ(videoPublishEditModelBb22, c0e48Z12, enumC362430EIv2);
                    this.LIZ.fn1(false);
                    return;
                }
                this.LIZ.fn1(false);
            }
        });
        this.LLILZLL = c0f2x;
        View view = this.LLILLJJLI.mView;
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        viewGroup.addView(c0f2x);
    }

    @Override // X.InterfaceC361310EEn
    public boolean L5() {
        return this.LLILZLL != null;
    }

    public final C0EGY X1() {
        return (C0EGY) this.LLJILJIL.getValue(this, LLJJI[0]);
    }

    public final C0E48 Z1() {
        return (C0E48) this.LLJIJIL.getValue();
    }

    public final VideoPublishEditModel bb2() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    @Override // X.InterfaceC361310EEn
    public void ir1() {
        RecyclerView recyclerViewLLII;
        C1447800nmM.LIZIZ(this.LLILLJJLI).LLLIILIL(this, o2());
        C0EFE c0efe = C0EFE.LIZ;
        VideoPublishEditModel videoPublishEditModelBb2 = bb2();
        C0E48 c0e48Z1 = Z1();
        EnumC362430EIv enumC362430EIv = EnumC362430EIv.CLICK_START;
        c0efe.getClass();
        C0EFE.LIZ(videoPublishEditModelBb2, c0e48Z1, enumC362430EIv);
        InterfaceC359940E9g interfaceC359940E9gAZ0 = X1().AZ0();
        if (interfaceC359940E9gAZ0 != null) {
            recyclerViewLLII = interfaceC359940E9gAZ0.LLII();
            if (recyclerViewLLII != null) {
                recyclerViewLLII.scrollToPosition(0);
            }
        } else {
            recyclerViewLLII = null;
        }
        w2();
        if (recyclerViewLLII != null) {
            C786410Ut5.LJLIIL(200L, this.LLIZLLLIL, new ARunnableS74S0200000_5(this, recyclerViewLLII, 35));
        }
    }

    public final void H2() {
        RecyclerView recyclerViewLLII;
        InterfaceC359940E9g interfaceC359940E9gAZ0 = X1().AZ0();
        if (interfaceC359940E9gAZ0 != null) {
            interfaceC359940E9gAZ0.LJIIIZ("bottom_item_root_edit");
        }
        InterfaceC359940E9g interfaceC359940E9gAZ02 = X1().AZ0();
        if (interfaceC359940E9gAZ02 == null || (recyclerViewLLII = interfaceC359940E9gAZ02.LLII()) == null) {
            return;
        }
        HandlerHook.viewPostDelay(recyclerViewLLII, new ARunnableS74S0200000_5(this, recyclerViewLLII, 34), 400L);
    }

    @Override // X.InterfaceC361310EEn, X.C0EIO
    public boolean LLLLLLL() {
        return !G2();
    }

    @Override // X.InterfaceC361310EEn
    /* JADX INFO: renamed from: if */
    public boolean mo24if() {
        boolean zG2 = G2();
        this.LLILZIL = Boolean.valueOf(zG2);
        return zG2;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C363750ENx.LIZIZ("animation_guide");
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLIZLLLIL.removeCallbacksAndMessages(null);
        C0F2X c0f2x = this.LLILZLL;
        if (c0f2x != null) {
            int visibility = c0f2x.getVisibility();
            c0f2x.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c0f2x);
            c0f2x.LLILLL = null;
        }
        this.LLILZLL = null;
    }

    @Override // X.InterfaceC361310EEn
    public boolean Dl() {
        return this.LLJI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC361310EEn, X.C0EIO
    public C0EIE getType() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC361310EEn
    public void fn1(boolean z) {
        if (this.LLILZLL != null && !this.LLIZ) {
            C1447800nmM.LIZIZ(this.LLILLJJLI).LLLLLLLZIL(o2());
            T2(false, 0L, new AwS123S0110000_5(this, z, 7));
            C363750ENx.LJ("animation_guide");
            this.LLIZ = true;
            this.LLILZ = true;
        }
    }

    public final void c3(View view, View view2) {
        C786410Ut5.T4(view, 0.0f);
        view.animate().setInterpolator(new LinearInterpolator()).setDuration(150L).alpha(1.0f).setStartDelay(500L).withEndAction(new ARunnableS74S0200000_5(view2, this, 37)).start();
    }

    public C0F2W(C1DRG c1drg, C19A3 c19a3, C372830EjZ c372830EjZ) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = c372830EjZ;
    }

    private final void T2(boolean z, long j, Function0<Unit> function0) {
        float f;
        C0F2X c0f2x = this.LLILZLL;
        if (c0f2x != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = c0f2x.animate();
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            viewPropertyAnimatorAnimate.alpha(f).setInterpolator(new LinearInterpolator()).setStartDelay(j).setDuration(150L).withEndAction(new ARunnableS8S0210000_5(c0f2x, function0, z, 3)).start();
        }
    }
}
