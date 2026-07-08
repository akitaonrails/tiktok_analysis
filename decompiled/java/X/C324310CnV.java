package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.ui.anim.AdjustableFooterUtilKt$delayScrollToPositionWhenHeightReady$1", f = "AdjustableFooterUtil.kt", l = {}, m = "invokeSuspend")
public final class C324310CnV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RecyclerView LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZ;
    public final /* synthetic */ Function0<Integer> LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C324310CnV(RecyclerView recyclerView, LifecycleOwner lifecycleOwner, long j, Function1<? super Integer, Unit> function1, Function0<Integer> function0, int i, long j2, InterfaceC1364105Vn<? super C324310CnV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = recyclerView;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = j;
        this.LLILZ = function1;
        this.LLILZIL = function0;
        this.LLILZLL = i;
        this.LLIZ = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324310CnV(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdjustableFooterUtilKt@6ea4.delayScrollToPositionWhenHeightReady$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final RecyclerView recyclerView = this.LL;
        final LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        final long j = this.LLILLL;
        final Function1<Integer, Unit> function1 = this.LLILZ;
        final Function0<Integer> function0 = this.LLILZIL;
        final int i = this.LLILZLL;
        final long j2 = this.LLIZ;
        recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0CnU
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                view.removeOnLayoutChangeListener(this);
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C324290CnT(j, function1, function0, i, recyclerView, j2, null), 3);
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdjustableFooterUtilKt@6ea4.delayScrollToPositionWhenHeightReady$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
