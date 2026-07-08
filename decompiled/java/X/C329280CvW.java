package X;

import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerDetailVM;
import kotlin.Unit;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0CvW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerDetailVM$queryBatchAweme$1$2$1", f = "TakoInnerDetailVM.kt", l = {}, m = "invokeSuspend")
public final class C329280CvW extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super BatchDetailList>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TakoInnerDetailVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329280CvW(TakoInnerDetailVM takoInnerDetailVM, InterfaceC1364105Vn<? super C329280CvW> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = takoInnerDetailVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoInnerDetailVM@c568.queryBatchAweme$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.setState(new AwS583S0100000_4((Throwable) this.LL, 141));
        this.LLILLJJLI.getClass();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoInnerDetailVM@c568.queryBatchAweme$1$2$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super BatchDetailList> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C329280CvW c329280CvW = new C329280CvW(this.LLILLJJLI, interfaceC1364105Vn);
        c329280CvW.LL = th;
        return c329280CvW.invokeSuspend(Unit.LIZ);
    }
}
