package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper$goWithMovie$1", f = "ReplaceMusicWithMovieHelper.kt", l = {132}, m = "invokeSuspend")
public final class C1421805hQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ReplaceMusicWithMovieHelper LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1421805hQ(ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper, String str, String str2, long j, InterfaceC1364105Vn<? super C1421805hQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = replaceMusicWithMovieHelper;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1421805hQ c1421805hQ = new C1421805hQ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1421805hQ.LLILLJJLI = obj;
        return c1421805hQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("ReplaceMusicWithMovieHelper@8c47.goWithMovie$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper = this.LLILLL;
            C1DFH c1dfh = C0PEM.LIZ;
            Object obj2 = null;
            replaceMusicWithMovieHelper.LLJJJ = C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C1421905hR(replaceMusicWithMovieHelper, null), 2);
            try {
                c098200Yq = DetailApi.LIZ(0, 0, this.LLILZ, "");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj2 = c098200Yq;
            }
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1422105hT c1422105hT = new C1422105hT(this.LLILLL, (Aweme) obj2, this.LLILZIL, this.LLILZLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1422105hT) == objLJFF) {
                C1C7U.LIZIZ("ReplaceMusicWithMovieHelper@8c47.goWithMovie$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReplaceMusicWithMovieHelper@8c47.goWithMovie$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
