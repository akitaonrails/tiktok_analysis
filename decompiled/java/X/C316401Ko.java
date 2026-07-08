package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Ko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.vm.HistoryRecordPageVM$preloadHistoryPhotoSync$2$1$1$1$1", f = "HistoryRecordPageVM.kt", l = {}, m = "invokeSuspend")
public final class C316401Ko extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316401Ko(long j, Function0<Unit> function0, InterfaceC1364105Vn<? super C316401Ko> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316401Ko(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HistoryRecordPageVM@dcfd.preloadHistoryPhotoSync$2$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HistoryRecordPageVM@dcfd.preloadHistoryPhotoSync$2$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
