package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O7P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.digg.request.VideoDiggRepository$operator$1$diggAweme$1$2$1", f = "VideoDiggRepository.kt", l = {}, m = "invokeSuspend")
public final class C0O7P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0O7A<C0O3G> LL;
    public final /* synthetic */ C0O99 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ InterfaceC1631620sYq<String, Integer, Boolean, Unit> LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ Function2<String, Exception, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0O7P(C0O7A<C0O3G> c0o7a, C0O99 c0o99, String str, int i, InterfaceC1631620sYq<? super String, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq, Map<String, String> map, String str2, long j, Function2<? super String, ? super Exception, Unit> function2, InterfaceC1364105Vn<? super C0O7P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0o7a;
        this.LLILLJJLI = c0o99;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = interfaceC1631620sYq;
        this.LLILZLL = map;
        this.LLIZ = str2;
        this.LLIZLLLIL = j;
        this.LLJ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O7P(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O7P.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
