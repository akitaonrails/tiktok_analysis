package X;

import android.util.SparseArray;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui.SearchLiveWithVideoItemViewHolder$autoplayAbility$2$1;
import com.ss.android.ugc.aweme.search.pages.result.pov.SearchNestedLocatorAbilityImp;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0R47, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R47 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onViewAttachedToWindow$2(C0R47 c0r47, View view) {
    }

    public static final void onViewDetachedFromWindow$0(C0R47 c0r47, View view) {
    }

    public static final void onViewDetachedFromWindow$1(C0R47 c0r47, View view) {
    }

    public static final void onViewDetachedFromWindow$3(C0R47 c0r47, View view) {
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

    public static final void onViewAttachedToWindow$0(C0R47 c0r47, View view) {
        ((View) c0r47.l0).removeOnAttachStateChangeListener(c0r47);
        ((SearchNestedLocatorAbilityImp) c0r47.l1).LIZLLL(view, (Function1) c0r47.l2);
    }

    public static final void onViewAttachedToWindow$1(C0R47 c0r47, View view) {
        ((View) c0r47.l0).removeOnAttachStateChangeListener(c0r47);
        Taco tacoLIZ = C0PCE.LIZ((View) c0r47.l1, false);
        if (tacoLIZ != null) {
            if (((SparseArray) tacoLIZ.LLIZLLLIL.getValue()).get(((InterfaceC648310Pbp) c0r47.l2).y1()) == null) {
                InterfaceC648720PcU interfaceC648720PcUN5 = ((InterfaceC648310Pbp) c0r47.l2).n5();
                int iY1 = ((InterfaceC648310Pbp) c0r47.l2).y1();
                interfaceC648720PcUN5.LIZIZ(tacoLIZ.LIZJ());
                ((SparseArray) tacoLIZ.LLIZLLLIL.getValue()).put(iY1, interfaceC648720PcUN5);
            }
        }
    }

    public static final void onViewAttachedToWindow$3(C0R47 c0r47, View view) {
        ((View) c0r47.l0).removeOnAttachStateChangeListener(c0r47);
        C1554960qZC.LIZ(C1558360qeg.LJ((View) c0r47.l1, "CompatibleAgentStore"), (C652630Pin) c0r47.l2, C652630Pin.class, "source_default_key");
    }

    public static final void onViewAttachedToWindow$4(C0R47 c0r47, View view) {
        if (((InterfaceC665370Q7z) c0r47.l0) == null) {
            c0r47.l0 = C1558360qeg.LJ((View) c0r47.l1, null);
        }
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) c0r47.l0;
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, (SearchLiveWithVideoItemViewHolder$autoplayAbility$2$1) ((ViewOnAttachStateChangeListenerC655110Pmn) c0r47.l2).LLLL.getValue(), SearchServiceCenter$AutoPlayAbility.class, null, null);
        }
    }

    public static final void onViewDetachedFromWindow$2(C0R47 c0r47, View view) {
        ((View) c0r47.l0).removeOnAttachStateChangeListener(c0r47);
        ((C661850Pxf) c0r47.l1).getSurfaceHolder().s5((C661870Pxh) c0r47.l2);
    }

    public static final void onViewDetachedFromWindow$4(C0R47 c0r47, View view) {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) c0r47.l0;
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, SearchServiceCenter$AutoPlayAbility.class, null);
        }
    }

    public C0R47(View view, ViewOnAttachStateChangeListenerC655110Pmn viewOnAttachStateChangeListenerC655110Pmn, int i) {
        this.$t = i;
        this.l1 = view;
        this.l2 = viewOnAttachStateChangeListenerC655110Pmn;
    }

    public C0R47(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
