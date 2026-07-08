package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.router.UploadActionInterceptor;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.router.UploadActionInterceptor$buildExtraParams$2$hashtagFetchJobs$2$1", f = "UploadActionInterceptor.kt", l = {541}, m = "invokeSuspend")
public final class C566490MJr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ UploadActionInterceptor LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C566490MJr(UploadActionInterceptor uploadActionInterceptor, String str, InterfaceC1364105Vn<? super C566490MJr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = uploadActionInterceptor;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C566490MJr(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadActionInterceptor@7bd5.buildExtraParams$2$hashtagFetchJobs$2$1");
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
            final UploadActionInterceptor uploadActionInterceptor = this.LLILLJJLI;
            final String str = this.LLILLL;
            this.LL = 1;
            uploadActionInterceptor.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            try {
                final long jNanoTime = System.nanoTime();
                C0CHQ.LIZ().getChallengeService().LIZIZ(str, new C092O(jNanoTime, str, c23260099m) { // from class: X.0MJq
                    public final /* synthetic */ long LIZIZ;
                    public final /* synthetic */ InterfaceC1364105Vn<String> LIZJ;

                    {
                        this.LIZJ = c23260099m;
                    }

                    @Override // X.C092O
                    public final void accept(Object obj2) {
                        String str2;
                        AVChallenge aVChallenge = (AVChallenge) obj2;
                        this.LIZ.getClass();
                        System.nanoTime();
                        if (aVChallenge != null && (str2 = aVChallenge.challengeName) != null) {
                            InterfaceC1364105Vn<String> interfaceC1364105Vn = this.LIZJ;
                            C189200o6.m2constructorimpl(str2);
                            interfaceC1364105Vn.resumeWith(str2);
                        }
                    }
                });
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LJI(e);
                C189200o6.m2constructorimpl(null);
                c23260099m.resumeWith(null);
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UploadActionInterceptor@7bd5.buildExtraParams$2$hashtagFetchJobs$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("UploadActionInterceptor@7bd5.buildExtraParams$2$hashtagFetchJobs$2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
