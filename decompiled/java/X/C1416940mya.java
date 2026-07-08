package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.AutoCutPreFetchPugcTemplateComponent$onCreate$1", f = "AutoCutPreFetchPugcTemplateComponent.kt", l = {}, m = "invokeSuspend")
public final class C1416940mya extends C09AX implements Function2<C096H, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1416930myZ LLILLJJLI;
    public final /* synthetic */ Pair<Integer, C0MJ9> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1416940mya(C1416930myZ c1416930myZ, Pair<Integer, ? extends C0MJ9> pair, InterfaceC1364105Vn<? super C1416940mya> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1416930myZ;
        this.LLILLL = pair;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1416940mya c1416940mya = new C1416940mya(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1416940mya.LL = obj;
        return c1416940mya;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutPreFetchPugcTemplateComponent@d2b0.onCreate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C096H c096h = (C096H) this.LL;
        if (c096h instanceof C23149095f) {
            this.LLILLJJLI.W1(this.LLILLL, ((C23149095f) c096h).LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutPreFetchPugcTemplateComponent@d2b0.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C096H c096h, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c096h, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
