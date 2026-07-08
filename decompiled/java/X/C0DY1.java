package X;

import j27.s;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DY1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.awemepool.SearchAwemePoolUltraProMax$createDualStreamModel$2$build$1$2$2$loadMore$2$1", f = "SearchAwemePoolUltraProMax.kt", l = {669, 675, 680, 704}, m = "invokeSuspend")
public final class C0DY1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Function1 LL;
    public s LLILLJJLI;
    public C0DQP LLILLL;
    public Object LLILZ;
    public C054000Hq LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C0DQP LLJ;
    public final /* synthetic */ C0PHX LLJI;
    public final /* synthetic */ Function1<Object, Unit> LLJIJIL;
    public final /* synthetic */ s LLJILJIL;
    public final /* synthetic */ Map<String, String> LLJILJILJ;
    public final /* synthetic */ C054000Hq LLJILLL;
    public final /* synthetic */ Function1<Exception, Unit> LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0DY1(C0DQP c0dqp, C0PHX c0phx, Function1<Object, Unit> function1, s sVar, Map<String, String> map, C054000Hq c054000Hq, Function1<? super Exception, Unit> function12, InterfaceC1364105Vn<? super C0DY1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = c0dqp;
        this.LLJI = c0phx;
        this.LLJIJIL = function1;
        this.LLJILJIL = sVar;
        this.LLJILJILJ = map;
        this.LLJILLL = c054000Hq;
        this.LLJJ = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0DY1 c0dy1 = new C0DY1(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
        c0dy1.LLIZLLLIL = obj;
        return c0dy1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x0069, TryCatch #1 {all -> 0x0069, blocks: (B:18:0x0051, B:19:0x0054, B:22:0x005a, B:23:0x005e, B:24:0x0068, B:13:0x0041, B:15:0x0045), top: B:73:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[Catch: all -> 0x0069, TryCatch #1 {all -> 0x0069, blocks: (B:18:0x0051, B:19:0x0054, B:22:0x005a, B:23:0x005e, B:24:0x0068, B:13:0x0041, B:15:0x0045), top: B:73:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DY1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
