package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0x9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.log.monitor.PcsMonitor", f = "PcsMonitor.kt", l = {83, 92}, m = "monitorPcsApi")
public final class C1808290x9n<T> extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Function1 LLILZ;
    public C1808300x9o LLILZIL;
    public boolean LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C1808280x9m LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1808290x9n(C1808280x9m c1808280x9m, InterfaceC1364105Vn<? super C1808290x9n> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c1808280x9m;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PcsMonitor@2ed9.monitorPcsApi$6");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLIZLLLIL.LIZLLL(null, null, null, null, null, this);
        C1C7U.LIZIZ("PcsMonitor@2ed9.monitorPcsApi$6");
        return objLIZLLL;
    }
}
