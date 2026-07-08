package X;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.nimblecard.tako.component.lynx.NimbleLynxAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.lynx.TakoLynxAssem;
import kotlin.jvm.internal.AwS576S0100000_32;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19LX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LX implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$7(C19LX c19lx, View view) {
    }

    public static final void onViewAttachedToWindow$8(C19LX c19lx, View view) {
    }

    public static final void onViewDetachedFromWindow$3(C19LX c19lx, View view) {
    }

    public static final void onViewDetachedFromWindow$4(C19LX c19lx, View view) {
    }

    public static final void onViewDetachedFromWindow$5(C19LX c19lx, View view) {
    }

    public static final void onViewDetachedFromWindow$6(C19LX c19lx, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
                break;
            case 5:
                onViewAttachedToWindow$5(this, view);
                break;
            case 6:
                onViewAttachedToWindow$6(this, view);
                break;
            case 7:
                onViewAttachedToWindow$7(this, view);
                break;
            case 8:
                onViewAttachedToWindow$8(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                break;
            case 6:
                onViewDetachedFromWindow$6(this, view);
                break;
            case 7:
                onViewDetachedFromWindow$7(this, view);
                break;
            case 8:
                onViewDetachedFromWindow$8(this, view);
                break;
        }
    }

    public C19LX(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(C19LX c19lx, View view) {
        C21331318dr c21331318dr = (C21331318dr) c19lx.l0;
        if (!c21331318dr.j && c21331318dr.LLIIJLIL()) {
            ((C21331318dr) c19lx.l0).LL.LJIIJ.LJI = true;
            C21331318dr c21331318dr2 = (C21331318dr) c19lx.l0;
            c21331318dr2.LJIILJJIL(c21331318dr2.LIZJ(), new C21329718db());
            C21331318dr c21331318dr3 = (C21331318dr) c19lx.l0;
            C21331518dt c21331518dt = c21331318dr3.o;
            if (c21331518dt == null) {
                C1325860kbg.LIZIZ(null, new AwS576S0100000_32(c21331318dr3, 455), C2097608Jq.LJ());
            } else {
                c21331518dt.LIZIZ(c21331318dr3.i);
            }
        }
    }

    public static final void onViewAttachedToWindow$1(C19LX c19lx, View view) {
        C21331818dw c21331818dw = (C21331818dw) c19lx.l0;
        c21331818dw.LJ = true;
        c21331818dw.LJFF();
    }

    public static final void onViewAttachedToWindow$2(C19LX c19lx, View view) {
        ((C21509119Fp) c19lx.l0).LL.setCurrentState(Lifecycle.State.RESUMED);
    }

    public static final void onViewAttachedToWindow$3(C19LX c19lx, View view) {
        C1537720q7O c1537720q7O = ((NimbleLynxAssem) c19lx.l0).LLJJJJ;
        if (c1537720q7O != null) {
            c1537720q7O.LIZ("cardShow", new JSONObject());
        }
    }

    public static final void onViewAttachedToWindow$4(C19LX c19lx, View view) {
        C1537720q7O c1537720q7O = ((NimbleLynxAssem) c19lx.l0).LLJJJJ;
        if (c1537720q7O != null) {
            c1537720q7O.LIZ("resetState", new JSONObject());
        }
    }

    public static final void onViewAttachedToWindow$5(C19LX c19lx, View view) {
        C1537720q7O c1537720q7O = ((TakoLynxAssem) c19lx.l0).LLJJJJ;
        if (c1537720q7O != null) {
            c1537720q7O.LIZ("cardShow", new JSONObject());
        }
    }

    public static final void onViewAttachedToWindow$6(C19LX c19lx, View view) {
        C1537720q7O c1537720q7O = ((TakoLynxAssem) c19lx.l0).LLJJJJ;
        if (c1537720q7O != null) {
            c1537720q7O.LIZ("resetState", new JSONObject());
        }
    }

    public static final void onViewDetachedFromWindow$0(C19LX c19lx, View view) {
        C21331318dr c21331318dr = (C21331318dr) c19lx.l0;
        C21331518dt c21331518dt = c21331318dr.o;
        if (c21331518dt != null) {
            c21331518dt.LIZLLL(c21331318dr.i);
        }
    }

    public static final void onViewDetachedFromWindow$1(C19LX c19lx, View view) {
        C21331818dw c21331818dw = (C21331818dw) c19lx.l0;
        c21331818dw.LJ = false;
        if (c21331818dw.LJI) {
            ((C21331518dt) c21331818dw.LJIIIIZZ.getValue()).LIZLLL(((C21331818dw) c19lx.l0).LJIIIZ);
            ((C21331818dw) c19lx.l0).LJI = false;
        }
    }

    public static final void onViewDetachedFromWindow$2(C19LX c19lx, View view) {
        ((C21509119Fp) c19lx.l0).LL.setCurrentState(Lifecycle.State.DESTROYED);
    }

    public static final void onViewDetachedFromWindow$7(C19LX c19lx, View view) {
        ((C21368618js) c19lx.l0).LJ();
    }

    public static final void onViewDetachedFromWindow$8(C19LX c19lx, View view) {
        C19K2 c19k2 = (C19K2) c19lx.l0;
        if (c19k2.LJ) {
            c19k2.LIZJ();
        }
    }
}
