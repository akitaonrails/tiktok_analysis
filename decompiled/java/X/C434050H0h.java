package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarPreloadHandler$preloadSocialAvatarResponse$1$2$deferredAnimationJob$1", f = "SocialAvatarPreloadHandler.kt", l = {174}, m = "invokeSuspend")
public final class C434050H0h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn, Object> {
    public int LL;
    public final /* synthetic */ C436960HBm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C434050H0h(C436960HBm c436960HBm, InterfaceC1364105Vn<? super C434050H0h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c436960HBm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C434050H0h(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarPreloadHandler@4de5.preloadSocialAvatarResponse$1$2$deferredAnimationJob$1");
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
            ConcurrentHashMap<String, C437200HCk> concurrentHashMap = C437190HCj.LIZ;
            String str = this.LLILLJJLI.LIZIZ;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            try {
                C1322200kVm.LIZ().LJIJ(C1325710kbR.LIZIZ(str), null);
                C189200o6.m2constructorimpl(null);
                c2252611DEt.resumeWith(null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                String message = e.getMessage();
                if (message == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Preload animation bitmap ");
                    sbLIZ.append(str);
                    sbLIZ.append(" fails");
                    message = C2188811AlT.LIZIZ(sbLIZ);
                }
                C098200Yq c098200Yq = new C098200Yq(new C0H0S(message));
                C189200o6.m2constructorimpl(c098200Yq);
                c2252611DEt.resumeWith(c098200Yq);
            }
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarPreloadHandler@4de5.preloadSocialAvatarResponse$1$2$deferredAnimationJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SocialAvatarPreloadHandler@4de5.preloadSocialAvatarResponse$1$2$deferredAnimationJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
