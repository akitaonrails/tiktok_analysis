package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05eJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.ReplaceDownloadHelper$queryAweme$1", f = "ReplaceDownloadHelper.kt", l = {}, m = "invokeSuspend")
public final class C1402505eJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<Aweme, Unit> LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1402505eJ(String str, Function1<? super Aweme, Unit> function1, Function1<? super String, Unit> function12, InterfaceC1364105Vn<? super C1402505eJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = function1;
        this.LLILZ = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1402505eJ c1402505eJ = new C1402505eJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1402505eJ.LL = obj;
        return c1402505eJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("ReplaceDownloadHelper@3470.queryAweme$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C201955140j.LJIILL(C201962140q.LIZIZ, "MusicStripV2", "start query");
        try {
            c098200Yq = DetailApi.LIZ(0, 0, this.LLILLJJLI, "");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Function1<Aweme, Unit> function1 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C201955140j.LJIILL(C201962140q.LIZIZ, "MusicStripV2", "query success");
            if (function1 != null) {
                function1.invoke((Aweme) c098200Yq);
            }
        }
        Function1<String, Unit> function12 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null && function12 != null) {
            function12.invoke(thM5exceptionOrNullimpl.getMessage());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReplaceDownloadHelper@3470.queryAweme$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
