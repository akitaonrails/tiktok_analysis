package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nimblecard.tako.component.lynx.NimbleLynxAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.lynx.TakoLynxAssem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19LT, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LT implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewDetachedFromWindow$0(C19LT c19lt, View view) {
    }

    public static final void onViewDetachedFromWindow$2(C19LT c19lt, View view) {
    }

    public static final void onViewDetachedFromWindow$3(C19LT c19lt, View view) {
    }

    public static final void onViewDetachedFromWindow$4(C19LT c19lt, View view) {
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
        }
    }

    public static final void onViewAttachedToWindow$0(C19LT c19lt, View view) {
        C19EC c19ec = (C19EC) c19lt.l0;
        Fragment fragment = c19ec.LIZJ;
        try {
            c19ec.LJIIIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(new RuntimeException("FragmentStateManager moveToExpectedState exception ---> "));
        }
        AbstractC21468118zv.LJIIIIZZ((ViewGroup) fragment.mView.getParent(), ((C19ED) c19lt.l1).LL).LJII();
    }

    public static final void onViewAttachedToWindow$1(C19LT c19lt, View view) {
        ((C21331818dw) c19lt.l0).LJFF();
    }

    public static final void onViewAttachedToWindow$2(C19LT c19lt, View view) {
        ((View) c19lt.l0).removeOnAttachStateChangeListener(c19lt);
        ((C212360188o) c19lt.l1).LJII = C0P72.LIZ(C946803n0.LIZ(view));
    }

    public static final void onViewAttachedToWindow$3(C19LT c19lt, View view) {
        ((View) c19lt.l0).removeOnAttachStateChangeListener(c19lt);
        C1537720q7O c1537720q7O = ((NimbleLynxAssem) c19lt.l1).LLJJJJ;
        if (c1537720q7O != null) {
            c1537720q7O.LIZ("cardShow", new JSONObject());
        }
    }

    public static final void onViewAttachedToWindow$4(C19LT c19lt, View view) {
        ((View) c19lt.l0).removeOnAttachStateChangeListener(c19lt);
        C1537720q7O c1537720q7O = ((TakoLynxAssem) c19lt.l1).LLJJJJ;
        if (c1537720q7O != null) {
            c1537720q7O.LIZ("cardShow", new JSONObject());
        }
    }

    public static final void onViewDetachedFromWindow$1(C19LT c19lt, View view) {
        C21331918dx c21331918dx;
        AbstractC21333318eB<?> abstractC21333318eB;
        List<? extends InterfaceC1547330qMt> list;
        String strLIZ = ((C21331818dw) c19lt.l0).LIZ((AbstractC21333318eB) c19lt.l1);
        if (strLIZ == null || (c21331918dx = ((C21331818dw) c19lt.l0).LIZJ.get(strLIZ)) == null || (list = (abstractC21333318eB = (AbstractC21333318eB) c19lt.l1).LLZLL) == null) {
            return;
        }
        C21331818dw c21331818dw = (C21331818dw) c19lt.l0;
        for (InterfaceC1547330qMt interfaceC1547330qMt : (ArrayList) list) {
            if (!interfaceC1547330qMt.getDisable() && interfaceC1547330qMt.getExposureLost()) {
                c21331818dw.getClass();
                String type = interfaceC1547330qMt.getType();
                if (interfaceC1547330qMt.getExposureDeduplicate()) {
                    if (interfaceC1547330qMt.getExposureLost() && c21331918dx.LIZLLL.contains(type) && !c21331918dx.LJ.contains(type)) {
                        c21331818dw.LIZLLL(interfaceC1547330qMt, abstractC21333318eB, strLIZ, 0.0f, true, 1);
                        c21331918dx.LJ.add(type);
                    }
                } else if (interfaceC1547330qMt.getExposureLost() && !Intrinsics.LJFF(((LinkedHashMap) c21331918dx.LIZ).get(type), "lost") && Intrinsics.LJFF(((LinkedHashMap) c21331918dx.LIZ).get(type), "exposure")) {
                    c21331818dw.LIZLLL(interfaceC1547330qMt, abstractC21333318eB, strLIZ, 0.0f, true, c21331918dx.LIZIZ(type));
                    c21331918dx.LIZ.put(type, "lost");
                }
            }
        }
    }

    public C19LT(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
