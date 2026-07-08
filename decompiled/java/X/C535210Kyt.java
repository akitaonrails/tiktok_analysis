package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import java.util.List;

/* JADX INFO: renamed from: X.0Kyt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535210Kyt implements InterfaceC534890KyN {
    public final C533720KwU<Keva> LIZ;

    @Override // X.InterfaceC534890KyN
    public final int LIZ() {
        return 1;
    }

    public C535210Kyt(C533720KwU<Keva> c533720KwU) {
        this.LIZ = c533720KwU;
    }

    @Override // X.InterfaceC534890KyN
    public final C11NZ<List<C535020Kya>> LIZIZ(C534900KyO c534900KyO) {
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        if (!C535390KzB.LIZ()) {
            IAITheaterFeatureService.LIZ.getClass();
            IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
            if (iAITheaterFeatureServiceLIZ == null || (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) == null || !interfaceC558600LvWLIZIZ.isFeatureEnabled()) {
                IAIPortraitFeatureService.LIZ.getClass();
                IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
                if (iAIPortraitFeatureServiceLIZ == null || !iAIPortraitFeatureServiceLIZ.isFeatureEnabled()) {
                    C201955140j.LJIJJ(C552700Lm0.LIZIZ, "AiSelfCDS", "AiSelf not enabled");
                    return C11IR.LL;
                }
            }
        }
        return C538760LBa.LIZIZ(C11NZ.LJIJJLI(new C581220Mqu(this, c534900KyO, 5)), "AiSelfCDS", "fetchAiContentList");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(boolean r15, X.InterfaceC1364105Vn<? super java.lang.Boolean> r16) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C535210Kyt.LIZJ(boolean, X.05Vn):java.lang.Object");
    }
}
