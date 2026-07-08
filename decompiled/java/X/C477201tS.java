package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editorpro.toolbanner.list.EditorToolsIconsAdapter$setList$2$2$1", f = "EditorToolsIconsAdapter.kt", l = {238}, m = "invokeSuspend")
public final class C477201tS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C569680MVy LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C477201tS(String str, String str2, C569680MVy c569680MVy, InterfaceC1364105Vn<? super C477201tS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c569680MVy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C477201tS c477201tS = new C477201tS(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c477201tS.LLILLJJLI = obj;
        return c477201tS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1294720jnS c098200Yq;
        C1C7U.LIZ("EditorToolsIconsAdapter@aec9.setList$2$2$1");
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
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            try {
                C0VSP c0vsp = new C0VSP(str);
                try {
                    c098200Yq = C1294250jmh.LJFF(c0vsp, str2).LIZ;
                    C2107108Nh.LIZ(c0vsp, null);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(c0vsp, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(c0vsp, th);
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                c098200Yq = new C098200Yq(th4);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            C1294720jnS c1294720jnS = (C1294720jnS) c098200Yq;
            if (c1294720jnS != null) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C477301tT c477301tT = new C477301tT(this.LLILZIL, c1294720jnS, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c477301tT) == objLJFF) {
                    C1C7U.LIZIZ("EditorToolsIconsAdapter@aec9.setList$2$2$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorToolsIconsAdapter@aec9.setList$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
