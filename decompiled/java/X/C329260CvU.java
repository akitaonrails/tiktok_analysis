package X;

import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0CvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerDetailVM$queryBatchAweme$2$1", f = "TakoInnerDetailVM.kt", l = {}, m = "invokeSuspend")
public final class C329260CvU extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super BatchDetailList>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C329260CvU(Function1<? super Throwable, Unit> function1, InterfaceC1364105Vn<? super C329260CvU> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoInnerDetailVM@c568.queryBatchAweme$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        Function1<Throwable, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke((Throwable) obj2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoInnerDetailVM@c568.queryBatchAweme$2$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super BatchDetailList> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C329260CvU c329260CvU = new C329260CvU(this.LLILLJJLI, interfaceC1364105Vn);
        c329260CvU.LL = th;
        return c329260CvU.invokeSuspend(Unit.LIZ);
    }
}
