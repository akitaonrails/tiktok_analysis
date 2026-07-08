package X;

import Y.ARunnableS28S0201000_22;
import Y.AsS49S0100000_22;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.gamora.editor.mixediting.ui.MixEditingMaterialRecyclerView$linearLayoutManager$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0mwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415640mwU extends RecyclerView {
    public static final int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
    public static final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(55));
    public static final int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public final C20635915oz LL;
    public boolean LLILLJJLI;
    public final MixEditingMaterialRecyclerView$linearLayoutManager$1 LLILLL;
    public final C1440450naV LLILZ;
    public InterfaceC1415670mwX LLILZIL;
    public Function1<? super Integer, Unit> LLILZLL;
    public final C0ZDN LLIZ;
    public float LLIZLLLIL;

    private final int getItemInnerWidth() {
        return C295860Bii.LIZ() ? LLJI : LLJ;
    }

    public final boolean getForbidScroll() {
        return this.LLILLJJLI;
    }

    public final void LIZLLL(int i) {
        int itemInnerWidth = ((i - getItemInnerWidth()) / 2) - LLJIJIL;
        C426750GoL.LJIIL(this, Integer.valueOf(itemInnerWidth), null, Integer.valueOf(itemInnerWidth), null, 26);
    }

    public final void setForbidScroll(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setOnItemVisibilityChangeListener(Function1<? super Integer, Unit> function1) {
        this.LLILZLL = function1;
    }

    public final void setScrollListener(InterfaceC1415670mwX interfaceC1415670mwX) {
        this.LLILZIL = interfaceC1415670mwX;
    }

    public final void setSpeedRatio(float f) {
        this.LLIZLLLIL = f;
    }

    public C1415640mwU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void LIZJ(C1415640mwU c1415640mwU, int i) {
        AFwS210S0000000_22 aFwS210S0000000_22 = AFwS210S0000000_22.get$arr$(496);
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("snapScrollToPosition position = ");
        sbLIZ.append(i);
        C201955140j.LIZLLL(c1398350mUb, "MixEditingMaterialRecyclerView", C2188811AlT.LIZIZ(sbLIZ));
        c1415640mwU.scrollToPosition(i);
        HandlerHook.viewPost(c1415640mwU, new ARunnableS28S0201000_22(c1415640mwU, aFwS210S0000000_22, i, 5));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i, int i2) {
        return super.fling((int) (i * this.LLIZLLLIL), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.0mwV, X.19sR] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager, com.ss.android.ugc.gamora.editor.mixediting.ui.MixEditingMaterialRecyclerView$linearLayoutManager$1] */
    public C1415640mwU(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C20635915oz c20635915oz = new C20635915oz();
        this.LL = c20635915oz;
        ?? r2 = new LinearLayoutManager(context) { // from class: com.ss.android.ugc.gamora.editor.mixediting.ui.MixEditingMaterialRecyclerView$linearLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollHorizontally() {
                return !this.getForbidScroll();
            }
        };
        this.LLILLL = r2;
        this.LLILZ = new C1440450naV(context);
        int iLIZLLL = C418440Gaw.LIZLLL(context);
        this.LLIZLLLIL = 1.0f;
        int iLIZIZ = C814420VxA.LIZIZ(((iLIZLLL - getItemInnerWidth()) / 2.0f) - LLJIJIL);
        iLIZIZ = iLIZIZ < 0 ? 0 : iLIZIZ;
        setLayoutManager(r2);
        c20635915oz.LIZIZ(this);
        this.LLIZ = new C0ZDN(context);
        C426750GoL.LJIIL(this, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ), null, 26);
        addOnScrollListener(new AsS49S0100000_22(this, 5));
        final AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(this, 428);
        final ?? r1 = new InterfaceC21676519sR() { // from class: X.0mwV
            @Override // X.InterfaceC21676519sR
            public final void m3(View view) {
            }

            @Override // X.InterfaceC21676519sR
            public final void g5(View view) {
                awS601S0100000_22.invoke(Integer.valueOf(this.getChildAdapterPosition(view)));
            }
        };
        addOnChildAttachStateChangeListener(r1);
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0mwW
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                if (!(view instanceof RecyclerView)) {
                    return;
                }
                ((RecyclerView) view).removeOnChildAttachStateChangeListener(r1);
                this.removeOnAttachStateChangeListener(this);
            }
        });
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
