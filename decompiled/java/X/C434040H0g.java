package X;

import android.graphics.Bitmap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarPreloadHandler$preloadSocialAvatarResponse$1$2$deferredStaticJob$1", f = "SocialAvatarPreloadHandler.kt", l = {171}, m = "invokeSuspend")
public final class C434040H0g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn, Object> {
    public int LL;
    public final /* synthetic */ C436960HBm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C434040H0g(C436960HBm c436960HBm, InterfaceC1364105Vn<? super C434040H0g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c436960HBm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C434040H0g(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarPreloadHandler@4de5.preloadSocialAvatarResponse$1$2$deferredStaticJob$1");
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
            final String str = this.LLILLJJLI.LIZ;
            this.LL = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C1331660kl2.LJIIIZ(str).LJJII(new AbstractC468201s0() { // from class: X.0H0R
                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    if (bitmap == null) {
                        InterfaceC20236714Gf interfaceC20236714Gf = c2252611DEt;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Preload bitmap is null: ");
                        sbLIZ.append(str);
                        C098200Yq c098200Yq = new C098200Yq(new C0H0S(C2188811AlT.LIZIZ(sbLIZ)));
                        C189200o6.m2constructorimpl(c098200Yq);
                        interfaceC20236714Gf.resumeWith(c098200Yq);
                        return;
                    }
                    InterfaceC20236714Gf interfaceC20236714Gf2 = c2252611DEt;
                    C189200o6.m2constructorimpl(null);
                    interfaceC20236714Gf2.resumeWith(null);
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    String message;
                    String strLIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("preloadStaticImage ");
                    sbLIZ.append(str);
                    sbLIZ.append(" fails as ");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C2188811AlT.LIZIZ(sbLIZ);
                    InterfaceC20236714Gf interfaceC20236714Gf = c2252611DEt;
                    if (th == null || (strLIZIZ = th.getMessage()) == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Preload static ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(" bitmap fails");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    C098200Yq c098200Yq = new C098200Yq(new C0H0S(strLIZIZ));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf.resumeWith(c098200Yq);
                }
            });
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarPreloadHandler@4de5.preloadSocialAvatarResponse$1$2$deferredStaticJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SocialAvatarPreloadHandler@4de5.preloadSocialAvatarResponse$1$2$deferredStaticJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
