package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.photo.text.RecyclerLayoutObserver$observerRecyclerViewLayoutChanged$1", f = "RecyclerLayoutObserver.kt", l = {38}, m = "invokeSuspend")
public final class C412301iz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C412401j0 LL;
    public Function0 LLILLJJLI;
    public RecyclerView LLILLL;
    public int LLILZ;
    public final /* synthetic */ RecyclerView LLILZIL;
    public final /* synthetic */ C412401j0 LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C412301iz(RecyclerView recyclerView, C412401j0 c412401j0, Function0<Unit> function0, InterfaceC1364105Vn<? super C412301iz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = recyclerView;
        this.LLILZLL = c412401j0;
        this.LLIZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C412301iz(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RecyclerView recyclerView;
        C412401j0 c412401j0;
        Function0<Unit> function0;
        C1C7U.LIZ("RecyclerLayoutObserver@4df1.observerRecyclerViewLayoutChanged$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                recyclerView = this.LLILLL;
                function0 = this.LLILLJJLI;
                c412401j0 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            recyclerView = this.LLILZIL;
            if (recyclerView != null) {
                c412401j0 = this.LLILZLL;
                function0 = this.LLIZ;
                HashMap map = new HashMap();
                int childCount = recyclerView.getChildCount();
                boolean z = false;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != null) {
                        float y = recyclerView.getChildViewHolder(childAt).itemView.getY();
                        if (((HashMap) c412401j0.LIZ).containsKey(C2286608xc.LJ(i2))) {
                            if (!Intrinsics.LIZLLL((Float) ((HashMap) c412401j0.LIZ).get(C2286608xc.LJ(i2)), y)) {
                                z = true;
                            }
                        }
                        map.put(C2286608xc.LJ(i2), C2286608xc.LIZLLL(y));
                    }
                }
                c412401j0.LIZ = map;
                if (z) {
                    this.LL = c412401j0;
                    this.LLILLJJLI = function0;
                    this.LLILLL = recyclerView;
                    this.LLILZ = 1;
                    if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                        C1C7U.LIZIZ("RecyclerLayoutObserver@4df1.observerRecyclerViewLayoutChanged$1");
                        return objLJFF;
                    }
                } else {
                    c412401j0.LIZIZ = false;
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C412201iy(function0, null), 3);
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RecyclerLayoutObserver@4df1.observerRecyclerViewLayoutChanged$1");
            return unit;
        }
        if (!c412401j0.LIZIZ) {
            c412401j0.LIZIZ = true;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C412301iz(recyclerView, c412401j0, function0, null), 3);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecyclerLayoutObserver@4df1.observerRecyclerViewLayoutChanged$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
