package X;

import androidx.fragment.app.Fragment;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.jsb.JSBVideoDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detail.jsb.SyncDataWithInnerFeedMethodIDL$handle$1", f = "SyncDataWithInnerFeedMethodIDL.kt", l = {44}, m = "invokeSuspend")
public final class C324420Cng extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C338500DOu LL;
    public C0DP5 LLILLJJLI;
    public CompletionBlock LLILLL;
    public JSBVideoDetailShareVM LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C338500DOu LLILZLL;
    public final /* synthetic */ C0DP5 LLIZ;
    public final /* synthetic */ C19EG LLIZLLLIL;
    public final /* synthetic */ Fragment LLJ;
    public final /* synthetic */ CompletionBlock<InterfaceC338540DOy> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324420Cng(C338500DOu c338500DOu, C0DP5 c0dp5, C19EG c19eg, Fragment fragment, CompletionBlock<InterfaceC338540DOy> completionBlock, InterfaceC1364105Vn<? super C324420Cng> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c338500DOu;
        this.LLIZ = c0dp5;
        this.LLIZLLLIL = c19eg;
        this.LLJ = fragment;
        this.LLJI = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324420Cng(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C338500DOu c338500DOu;
        C0DP5 c0dp5;
        CompletionBlock<InterfaceC338540DOy> completionBlock;
        JSBVideoDetailShareVM jSBVideoDetailShareVMLIZJ;
        Object c098200Yq2;
        int iIntValue;
        Object objLJI = obj;
        C1C7U.LIZ("SyncDataWithInnerFeedMethodIDL@7fcc.handle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    jSBVideoDetailShareVMLIZJ = this.LLILZ;
                    completionBlock = this.LLILLL;
                    c0dp5 = this.LLILLJJLI;
                    c338500DOu = this.LL;
                    try {
                        C155000ia.LIZIZ(objLJI);
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq2 = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJI);
                c338500DOu = this.LLILZLL;
                c0dp5 = this.LLIZ;
                C19EG c19eg = this.LLIZLLLIL;
                Fragment fragment = this.LLJ;
                completionBlock = this.LLJI;
                AbstractC1604130rqV abstractC1604130rqV = c338500DOu.LLILLL;
                String name = c338500DOu.getName();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("idl handle: param uniqueKey-");
                sbLIZ.append(c0dp5.getUniqueKey());
                sbLIZ.append(" hasMore-");
                sbLIZ.append(c0dp5.getHasMore());
                abstractC1604130rqV.LJFF(name, C2188811AlT.LIZIZ(sbLIZ));
                jSBVideoDetailShareVMLIZJ = C338500DOu.LIZJ(fragment, c19eg, c0dp5.getUniqueKey());
                try {
                    C1DFB c1dfb = C0PEM.LIZJ;
                    C324410Cnf c324410Cnf = new C324410Cnf(c0dp5, null);
                    this.LL = c338500DOu;
                    this.LLILLJJLI = c0dp5;
                    this.LLILLL = completionBlock;
                    this.LLILZ = jSBVideoDetailShareVMLIZJ;
                    this.LLILZIL = 1;
                    objLJI = C23250099c.LJI(this, c1dfb, c324410Cnf);
                    if (objLJI == objLJFF) {
                        C1C7U.LIZIZ("SyncDataWithInnerFeedMethodIDL@7fcc.handle$1");
                        return objLJFF;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
            }
            c098200Yq2 = (List) objLJI;
            C189200o6.m2constructorimpl(c098200Yq2);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            if (thM5exceptionOrNullimpl != null) {
                c338500DOu.LIZLLL(completionBlock, thM5exceptionOrNullimpl);
            } else {
                if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                    obj2 = c098200Yq2;
                }
                List<? extends Aweme> list = (List) obj2;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                Number mode = c0dp5.getMode();
                if (mode != null) {
                    iIntValue = mode.intValue();
                } else {
                    iIntValue = 0;
                }
                c338500DOu.LJ(list, jSBVideoDetailShareVMLIZJ, c0dp5, completionBlock, iIntValue);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl2 != null) {
            this.LLILZLL.LIZLLL(this.LLJI, thM5exceptionOrNullimpl2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SyncDataWithInnerFeedMethodIDL@7fcc.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
