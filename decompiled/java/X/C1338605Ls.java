package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.store.OfflineCommentKevaStore$getSnapshot$2", f = "OfflineCommentKevaStore.kt", l = {}, m = "invokeSuspend")
public final class C1338605Ls extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C05M6>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1338705Lt LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1338605Ls(C1338705Lt c1338705Lt, String str, InterfaceC1364105Vn<? super C1338605Ls> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1338705Lt;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1338605Ls c1338605Ls = new C1338605Ls(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1338605Ls.LL = obj;
        return c1338605Ls;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("OfflineCommentKevaStore@1c73.getSnapshot$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Keva kevaLJIILIIL = this.LLILLJJLI.LJIILIIL();
        C1338705Lt c1338705Lt = this.LLILLJJLI;
        String str = this.LLILLL;
        c1338705Lt.getClass();
        C05M6 c05m6 = null;
        String string = kevaLJIILIIL.getString(C1338705Lt.LJIILJJIL(str), null);
        if (string == null) {
            C1C7U.LIZIZ("OfflineCommentKevaStore@1c73.getSnapshot$2");
            return null;
        }
        try {
            c098200Yq = (C05M6) C1338705Lt.LJ.LJII(string, C05M6.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C05M6 c05m62 = (C05M6) c098200Yq;
        if (c05m62 != null) {
            this.LLILLJJLI.getClass();
            if (c05m62.LIZ != null && c05m62.LIZIZ != null) {
                c05m6 = c05m62;
            }
        }
        C1C7U.LIZIZ("OfflineCommentKevaStore@1c73.getSnapshot$2");
        return c05m6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C05M6> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
