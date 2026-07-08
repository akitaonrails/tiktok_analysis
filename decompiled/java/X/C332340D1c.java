package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.viewmodel.BaseSocialAvatarCreationVM$updateWithDelay$1", f = "BaseSocialAvatarCreationVM.kt", l = {429}, m = "invokeSuspend")
public final class C332340D1c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ InterfaceC332260D0u<C0HLC> LLILLL;
    public final /* synthetic */ Function1<C0HLC, C0HLC> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C332340D1c(long j, InterfaceC332260D0u<C0HLC> interfaceC332260D0u, Function1<? super C0HLC, C0HLC> function1, InterfaceC1364105Vn<? super C332340D1c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = interfaceC332260D0u;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C332340D1c(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0HLC value;
        C1C7U.LIZ("BaseSocialAvatarCreationVM@d207.updateWithDelay$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("BaseSocialAvatarCreationVM@d207.updateWithDelay$1");
                return objLJFF;
            }
        }
        InterfaceC332260D0u<C0HLC> interfaceC332260D0u = this.LLILLL;
        Function1<C0HLC, C0HLC> function1 = this.LLILZ;
        do {
            value = interfaceC332260D0u.getValue();
        } while (!interfaceC332260D0u.compareAndSet(value, function1.invoke(value)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseSocialAvatarCreationVM@d207.updateWithDelay$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
