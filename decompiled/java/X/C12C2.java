package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12C2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12C2 extends AbstractC2255721DQs<C120F> implements InterfaceC379610EuV, C120F {
    public static final int LLJILJIL = 8;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final InterfaceC19714712Bl LLILLL;
    public final Function1<Boolean, Unit> LLILZ;
    public final VideoPublishEditModel LLILZIL;
    public final String LLILZLL;
    public final boolean LLIZ;
    public final int LLIZLLLIL;
    public final Function0<Unit> LLJ;
    public final C120F LLJI = this;
    public C12C3 LLJIJIL;

    @Override // X.C120F
    public void MD0() {
        InterfaceC19714712Bl interfaceC19714712Bl;
        C12C3 c12c3 = this.LLJIJIL;
        if (c12c3 != null) {
            View view = c12c3.LLJJI;
            if (view == null) {
                view = null;
            }
            if (view.getVisibility() != 8) {
                View view2 = c12c3.LLJJI;
                if (view2 == null) {
                    view2 = null;
                }
                C337180DJs.LIZ(view2);
                TuxIconView tuxIconView = c12c3.LLJJIJIIJIL;
                if (tuxIconView == null) {
                    tuxIconView = null;
                }
                if (tuxIconView.getVisibility() == 0 && (interfaceC19714712Bl = c12c3.LLJI) != null) {
                    interfaceC19714712Bl.show();
                }
                TextView textView = c12c3.LLJJJJ;
                if (textView == null) {
                    textView = null;
                }
                C337180DJs.LIZJ(textView);
                C427660Gpo c427660Gpo = c12c3.LLJJJIL;
                if (c427660Gpo == null) {
                    c427660Gpo = null;
                }
                C337180DJs.LIZ(c427660Gpo);
                TuxTextView tuxTextView = c12c3.LLJJJ;
                if (tuxTextView == null) {
                    tuxTextView = null;
                }
                C337180DJs.LIZ(tuxTextView);
                TuxIconView tuxIconView2 = c12c3.LLJJIJI;
                if (tuxIconView2 == null) {
                    tuxIconView2 = null;
                }
                tuxIconView2.setTintColor(c12c3.LLLII(R.attr.bip));
                TuxIconView tuxIconView3 = c12c3.LLJJIJIIJIL;
                if (tuxIconView3 == null) {
                    tuxIconView3 = null;
                }
                tuxIconView3.setTintColor(c12c3.LLLII(R.attr.bip));
                TuxIconView tuxIconView4 = c12c3.LLJJIJIL;
                (tuxIconView4 != null ? tuxIconView4 : null).setTintColor(c12c3.LLLII(R.attr.bip));
            }
        }
    }

    @Override // X.C120F
    public C419260GcG Ur2() {
        C419260GcG c419260GcG;
        C12C3 c12c3 = this.LLJIJIL;
        if (c12c3 == null || (c419260GcG = c12c3.LLJJJJLIIL) == null) {
            return null;
        }
        return c419260GcG;
    }

    @Override // X.C120F
    public void gh1() {
        C12C3 c12c3 = this.LLJIJIL;
        if (c12c3 != null) {
            View view = c12c3.LLJJI;
            if (view == null) {
                view = null;
            }
            if (view.getVisibility() != 0) {
                C427660Gpo c427660Gpo = c12c3.LLJJJIL;
                if (c427660Gpo == null) {
                    c427660Gpo = null;
                }
                C337180DJs.LIZJ(c427660Gpo);
                TuxTextView tuxTextView = c12c3.LLJJJ;
                if (tuxTextView == null) {
                    tuxTextView = null;
                }
                C337180DJs.LIZJ(tuxTextView);
                InterfaceC19714712Bl interfaceC19714712Bl = c12c3.LLJI;
                if (interfaceC19714712Bl != null) {
                    interfaceC19714712Bl.hide();
                }
                TextView textView = c12c3.LLJJJJ;
                if (textView == null) {
                    textView = null;
                }
                C337180DJs.LIZIZ(textView);
                Context sceneContext = c12c3.getSceneContext();
                int iLLLII = (sceneContext == null || !C960203pA.LIZIZ(sceneContext)) ? c12c3.LLLII(R.attr.e1) : c12c3.LLLII(R.attr.bip);
                TuxIconView tuxIconView = c12c3.LLJJIJI;
                if (tuxIconView == null) {
                    tuxIconView = null;
                }
                tuxIconView.setTintColor(iLLLII);
                TuxIconView tuxIconView2 = c12c3.LLJJIJIIJIL;
                if (tuxIconView2 == null) {
                    tuxIconView2 = null;
                }
                tuxIconView2.setTintColor(iLLLII);
                TuxIconView tuxIconView3 = c12c3.LLJJIJIL;
                if (tuxIconView3 == null) {
                    tuxIconView3 = null;
                }
                tuxIconView3.setTintColor(iLLLII);
                View view2 = c12c3.LLJJI;
                C337180DJs.LIZJ(view2 != null ? view2 : null);
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C12C3 c12c3 = new C12C3(this.LLILLL, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLJ, this.LLIZLLLIL);
        this.LLJIJIL = c12c3;
        this.LLILLJJLI.add(R.id.view_stub_header, c12c3, "FullPagePreviewHeaderScene");
        this.LLILLJJLI.show(c12c3);
        C12C3 c12c32 = this.LLJIJIL;
        if (c12c32 != null) {
            c12c32.LLJJL = this.LLILZ;
        }
    }

    public C120F W1() {
        return this.LLJI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12C2(C1DRG c1drg, C19A3 c19a3, InterfaceC19714712Bl interfaceC19714712Bl, Function1<? super Boolean, Unit> function1, VideoPublishEditModel videoPublishEditModel, String str, boolean z, int i, Function0<Unit> function0) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = interfaceC19714712Bl;
        this.LLILZ = function1;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = str;
        this.LLIZ = z;
        this.LLIZLLLIL = i;
        this.LLJ = function0;
    }
}
