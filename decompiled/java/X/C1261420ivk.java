package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ivk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell$onViewAttachedToWindow$1", f = "AbsRecUserCell.kt", l = {209}, m = "invokeSuspend")
public final class C1261420ivk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ C01S9<Unit> LLILLL;
    public final /* synthetic */ IUserCardListAbility LLILZ;
    public final /* synthetic */ AbsRecUserCell<ITEM> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261420ivk(LifecycleOwner lifecycleOwner, C01S9<Unit> c01s9, IUserCardListAbility iUserCardListAbility, AbsRecUserCell<ITEM> absRecUserCell, InterfaceC1364105Vn<? super C1261420ivk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = c01s9;
        this.LLILZ = iUserCardListAbility;
        this.LLILZIL = absRecUserCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1261420ivk(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsRecUserCell@596c.onViewAttachedToWindow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            LifecycleOwner lifecycleOwner = this.LLILLJJLI;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C1261410ivj c1261410ivj = new C1261410ivj(this.LLILLL, this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c1261410ivj, this) == objLJFF) {
                C1C7U.LIZIZ("AbsRecUserCell@596c.onViewAttachedToWindow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsRecUserCell@596c.onViewAttachedToWindow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
