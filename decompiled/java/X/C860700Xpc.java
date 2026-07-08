package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.profile.business.ur.school.schoollist.SchoolItemCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xpc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.schoollist.SchoolItemCell$onCreateItemView$1$3", f = "SchoolItemCell.kt", l = {69}, m = "invokeSuspend")
public final class C860700Xpc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SchoolItemCell LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860700Xpc(SchoolItemCell schoolItemCell, InterfaceC1364105Vn<? super C860700Xpc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = schoolItemCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860700Xpc(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SchoolItemCell@23f8.onCreateItemView$1$3");
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
            SchoolItemCell schoolItemCell = this.LLILLJJLI;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C860710Xpd c860710Xpd = new C860710Xpd(schoolItemCell, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(schoolItemCell, state, c860710Xpd, this) == objLJFF) {
                C1C7U.LIZIZ("SchoolItemCell@23f8.onCreateItemView$1$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SchoolItemCell@23f8.onCreateItemView$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
