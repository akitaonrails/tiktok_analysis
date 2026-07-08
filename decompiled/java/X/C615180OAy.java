package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.translation.model.TranslationContent;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615180OAy {
    public static final C615180OAy LIZ = new C615180OAy();
    public static final LruCache<Long, C615190OAz> LIZIZ = new LruCache<>(50);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(393));

    public static Object LIZ(long j, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        String strLLIIZ = ((ITranslationService) ServiceManager.get().getService(ITranslationService.class)).LLIIZ();
        C615190OAz c615190OAz = LIZIZ.get(Long.valueOf(j));
        if (c615190OAz != null && c615190OAz.LIZ == j && Intrinsics.LJFF(c615190OAz.LIZIZ, strLLIIZ) && Intrinsics.LJFF(c615190OAz.LIZJ, str) && c615190OAz != null) {
            return c615190OAz;
        }
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        List listSingletonList = Collections.singletonList(new TranslationContent(str));
        LIZ.getClass();
        ListenableFuture listenableFutureLLIIJLIL = ((ITranslationService) ServiceManager.get().getService(ITranslationService.class)).LLIIJLIL(strLLIIZ, GsonProtectorUtils.toJson((Gson) LIZJ.getValue(), listSingletonList));
        final C0OB0 c0ob0 = new C0OB0(j, strLLIIZ, str);
        C11U6<Object> c11u6 = new C11U6<Object>() { // from class: X.08vS
            @Override // X.C11U6
            public final void onFailure(Throwable th) {
                InterfaceC20236714Gf<Object> interfaceC20236714Gf = c2252611DEt;
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC20236714Gf.resumeWith(c098200Yq);
            }

            @Override // X.C11U6
            public final void onSuccess(Object obj) {
                Object objInvoke = c0ob0.invoke(obj);
                if (objInvoke != null) {
                    InterfaceC20236714Gf<Object> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(objInvoke);
                    interfaceC20236714Gf.resumeWith(objInvoke);
                } else {
                    InterfaceC20236714Gf<Object> interfaceC20236714Gf2 = c2252611DEt;
                    C098200Yq c098200Yq = new C098200Yq(new C07U9("null result"));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf2.resumeWith(c098200Yq);
                }
            }
        };
        listenableFutureLLIIJLIL.LJIIJJI(new C135Q(listenableFutureLLIIJLIL, c11u6), EnumC2272608vM.LL);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
