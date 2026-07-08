package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.api.MultiApiManager;
import com.ss.android.ugc.aweme.inbox.followerv2.FollowerViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0zZU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.followerv2.FollowerViewModel$requestNotice$3", f = "FollowerViewModel.kt", l = {234}, m = "invokeSuspend")
public final class C1901100zZU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FollowerViewModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ EnumC1900750zYv LLJ;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1901100zZU(FollowerViewModel followerViewModel, int i, long j, long j2, long j3, long j4, String str, EnumC1900750zYv enumC1900750zYv, List<InterfaceC1891350zJl> list, InterfaceC1364105Vn<? super C1901100zZU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = followerViewModel;
        this.LLILLL = i;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = j3;
        this.LLIZ = j4;
        this.LLIZLLLIL = str;
        this.LLJ = enumC1900750zYv;
        this.LLJI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1901100zZU(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object c098200Yq;
        Exception exc;
        Object objLIZJ = obj;
        C1C7U.LIZ("FollowerViewModel@1b87.requestNotice$3");
        boolean zLJI = MethodIDManager.LJI(202381);
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    if (zLJI) {
                        MethodIDManager.LJ();
                        throw illegalStateException;
                    }
                    throw illegalStateException;
                }
                C155000ia.LIZIZ(objLIZJ);
            } else {
                C155000ia.LIZIZ(objLIZJ);
                FollowerViewModel followerViewModel = this.LLILLJJLI;
                int i2 = this.LLILLL;
                long j = this.LLILZ;
                long j2 = this.LLILZIL;
                long j3 = this.LLILZLL;
                long j4 = this.LLIZ;
                String str = this.LLIZLLLIL;
                MultiApiManager.API apiLIZ = MultiApiManager.LIZ();
                boolean z = followerViewModel.LL;
                int i3 = followerViewModel.LLJILLL;
                C1901090zZT.LIZ.getClass();
                C11NZ<FollowPageResponse> c11nzLIZ = apiLIZ.LIZ(z, i2, 20, j, j2, j3, i3, C1901090zZT.LIZ(), j4, str);
                this.LL = 1;
                objLIZJ = C11UD.LIZJ(c11nzLIZ, this);
                if (objLIZJ == objLJFF) {
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    C1C7U.LIZIZ("FollowerViewModel@1b87.requestNotice$3");
                    return objLJFF;
                }
            }
            c098200Yq = (FollowPageResponse) objLIZJ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        FollowerViewModel followerViewModel2 = this.LLILLJJLI;
        EnumC1900750zYv enumC1900750zYv = this.LLJ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            followerViewModel2.yQ2((FollowPageResponse) c098200Yq, enumC1900750zYv);
        }
        FollowerViewModel followerViewModel3 = this.LLILLJJLI;
        EnumC1900750zYv enumC1900750zYv2 = this.LLJ;
        List<InterfaceC1891350zJl> list = this.LLJI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1901070zZR c1901070zZR = C1901070zZR.LJI;
            FollowPageResponse followPageResponse = new FollowPageResponse(0, false, 0L, 0L, 0L, 0L, null, 0L, null, 0, "");
            followPageResponse.status_code = C2252408s6.LJ(thM5exceptionOrNullimpl);
            followPageResponse.error_code = C2252408s6.LIZIZ(thM5exceptionOrNullimpl);
            followPageResponse.status_msg = C2252408s6.LJFF(thM5exceptionOrNullimpl);
            followPageResponse.extra = C2252408s6.LIZLLL(thM5exceptionOrNullimpl);
            c1901070zZR.LJII(followPageResponse);
            int i4 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("FollowerRefactor", "FollowerViewModel, requestNotice error", thM5exceptionOrNullimpl);
            if (thM5exceptionOrNullimpl instanceof Exception) {
                exc = (Exception) thM5exceptionOrNullimpl;
            } else {
                exc = null;
            }
            followerViewModel3.vQ2(enumC1900750zYv2, null, list, exc);
        }
        Unit unit = Unit.LIZ;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        C1C7U.LIZIZ("FollowerViewModel@1b87.requestNotice$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
