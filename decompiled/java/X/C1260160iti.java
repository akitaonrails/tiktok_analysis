package X;

import com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeFragment$setUpClickListener$2$2", f = "LongPressAwemeFragment.kt", l = {879}, m = "invokeSuspend")
public final class C1260160iti extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LongPressAwemeFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260160iti(LongPressAwemeFragment longPressAwemeFragment, InterfaceC1364105Vn<? super C1260160iti> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = longPressAwemeFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1260160iti(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LongPressAwemeFragment@a3a.setUpClickListener$2$2");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("LongPressAwemeFragment@a3a.setUpClickListener$2$2");
                return objLJFF;
            }
        }
        LongPressAwemeFragment longPressAwemeFragment = this.LLILLJJLI;
        String str = LongPressAwemeFragment._pnsPageId;
        longPressAwemeFragment.UR(null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LongPressAwemeFragment@a3a.setUpClickListener$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
