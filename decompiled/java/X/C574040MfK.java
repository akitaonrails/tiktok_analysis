package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.ISDKService;
import com.ss.android.ugc.aweme.services.SDKServiceImpl;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574040MfK {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(SDKServiceImpl sDKServiceImpl, Context context, C574030MfJ c574030MfJ, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        sDKServiceImpl.split(context, 0, c574030MfJ.LIZ, c574030MfJ.LIZIZ, c574030MfJ.LIZJ, c574030MfJ.LIZLLL, new ISDKService.SplitCallback() { // from class: X.0MfL
            @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
            public final void onFail() {
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<Pair<Integer, Integer>> interfaceC20236714Gf = c2252611DEt;
                    C098200Yq c098200Yq = new C098200Yq(new RuntimeException("split failed"));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf.resumeWith(c098200Yq);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
            public final boolean checkIsCanceled() {
                return ISDKService.SplitCallback.DefaultImpls.checkIsCanceled(this);
            }

            @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
            public final void onSuccess(int i, int i2) {
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<Pair<Integer, Integer>> interfaceC20236714Gf = c2252611DEt;
                    Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
                    C189200o6.m2constructorimpl(pair);
                    interfaceC20236714Gf.resumeWith(pair);
                }
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
