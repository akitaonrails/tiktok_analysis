package X;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt$cleanCacheForRecord$cleanCacheTime$1$job2$1", f = "RecordConditionCheck.kt", l = {}, m = "invokeSuspend")
public final class C344920Dfe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends Long>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C259800zU<AtomicLong> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C344920Dfe(InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C344920Dfe c344920Dfe = new C344920Dfe(interfaceC1364105Vn, this.LLILLL, this.LLILLJJLI);
        c344920Dfe.LL = obj;
        return c344920Dfe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        return C23250099c.LIZIZ((InterfaceC497601wk) this.LL, null, null, new C345020Dfo(this.LLILLL.element, this.LLILLJJLI, null), 3);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
