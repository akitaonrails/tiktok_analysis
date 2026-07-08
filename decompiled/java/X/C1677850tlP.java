package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tlP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677850tlP extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ C259800zU<C1677830tlN<T, V>> LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ InterfaceC1677860tlQ<T, V> LLILLL;
    public final /* synthetic */ C1677580tky<T, V> LLILZ;
    public final /* synthetic */ Function1<C1677830tlN<T, V>, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1677850tlP(C259800zU<C1677830tlN<T, V>> c259800zU, float f, InterfaceC1677860tlQ<T, V> interfaceC1677860tlQ, C1677580tky<T, V> c1677580tky, Function1<? super C1677830tlN<T, V>, Unit> function1) {
        super(1);
        this.LL = c259800zU;
        this.LLILLJJLI = f;
        this.LLILLL = interfaceC1677860tlQ;
        this.LLILZ = c1677580tky;
        this.LLILZIL = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        C1677810tlL.LJI((C1677830tlN) this.LL.element, l.longValue(), this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
        return Unit.LIZ;
    }
}
