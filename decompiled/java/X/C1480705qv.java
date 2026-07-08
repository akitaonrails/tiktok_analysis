package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05qv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.AutoBatchUserProfileFetcher$dispatchError$2", f = "AutoBatchUserProfileFetcher.kt", l = {}, m = "invokeSuspend")
public final class C1480705qv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<InterfaceC1480505qt> LL;
    public final /* synthetic */ Throwable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1480705qv(List<? extends InterfaceC1480505qt> list, Throwable th, InterfaceC1364105Vn<? super C1480705qv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1480705qv(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoBatchUserProfileFetcher@4743.dispatchError$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<InterfaceC1480505qt> list = this.LL;
        Throwable th = this.LLILLJJLI;
        Iterator<InterfaceC1480505qt> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoBatchUserProfileFetcher@4743.dispatchError$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
