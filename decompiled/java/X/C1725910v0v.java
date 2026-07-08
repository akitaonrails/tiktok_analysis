package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.hybrid.prefetch.PipoPrefetchApi;
import com.ss.android.ugc.aweme.pipo.hybrid.prefetch.PipoPrefetchConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0v0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.hybrid.prefetch.handler.PipoPrefetchHandler$initPrefetchTaskDispatcher$1$runPrefetch$job$1", f = "PipoPrefetchHandler.kt", l = {}, m = "invokeSuspend")
public final class C1725910v0v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1725880v0s LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Uri LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ PipoPrefetchApi LLILZLL;
    public final /* synthetic */ PipoPrefetchConfig LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1725910v0v(C1725880v0s c1725880v0s, String str, Uri uri, String str2, String str3, PipoPrefetchApi pipoPrefetchApi, PipoPrefetchConfig pipoPrefetchConfig, Function0<Unit> function0, InterfaceC1364105Vn<? super C1725910v0v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1725880v0s;
        this.LLILLJJLI = str;
        this.LLILLL = uri;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = pipoPrefetchApi;
        this.LLIZ = pipoPrefetchConfig;
        this.LLIZLLLIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1725910v0v(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("PipoPrefetchHandler@f84d.initPrefetchTaskDispatcher$1$runPrefetch$job$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LL.LIZLLL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ.version);
            Function0<Unit> function0 = this.LLIZLLLIL;
            if (function0 != null) {
                function0.invoke();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LL.LIZJ.LIZLLL("prefetch_api", th, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PipoPrefetchHandler@f84d.initPrefetchTaskDispatcher$1$runPrefetch$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
