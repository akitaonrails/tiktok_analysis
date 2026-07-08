package X;

import com.bytedance.android.livesdk.comp.impl.pcs.infra.datacenter.fetcher.Fetcher;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01a6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.infra.datacenter.fetcher.Fetcher$handleError$1", f = "Fetcher.kt", l = {58}, m = "invokeSuspend")
public final class C357201a6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Fetcher LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Throwable LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C357201a6(Fetcher fetcher, String str, Throwable th, InterfaceC1364105Vn<? super C357201a6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fetcher;
        this.LLILLL = str;
        this.LLILZ = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C357201a6(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Fetcher@eed5.handleError$1");
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
            C05YC c05yc = (C05YC) this.LLILLJJLI.LIZ.getValue();
            String str = this.LLILLL;
            C098200Yq c098200Yq = new C098200Yq(this.LLILZ);
            C189200o6.m2constructorimpl(c098200Yq);
            Pair pair = new Pair(str, C189200o6.m1boximpl(c098200Yq));
            this.LL = 1;
            if (c05yc.emit(pair, this) == objLJFF) {
                C1C7U.LIZIZ("Fetcher@eed5.handleError$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Fetcher@eed5.handleError$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
