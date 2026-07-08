package X;

import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Kym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535140Kym implements InterfaceC534890KyN {
    @Override // X.InterfaceC534890KyN
    public final int LIZ() {
        return 3;
    }

    @Override // X.InterfaceC534890KyN
    public final C11NZ<List<C535020Kya>> LIZIZ(final C534900KyO c534900KyO) {
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ == null) {
            return C11IR.LL;
        }
        final InterfaceC535110Kyj interfaceC535110KyjLJII = iAIPortraitFeatureServiceLIZ.LJII();
        return C538760LBa.LIZIZ(C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0Kyl
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<List<C535020Kya>> c09aj) {
                C1C7U.LIZ("AiPortraitContentDataSource@8386.fetchAiContentList$1");
                List<C535020Kya> list = c534900KyO.LIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C535020Kya> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LIZ);
                }
                HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(arrayList);
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), new C581270Mqz(CoroutineExceptionHandler.LJJLIL, (C19482611Ke) c09aj, 7), null, new C535160Kyo(this, hashSetLLIFFJFJJ, c09aj, interfaceC535110KyjLJII, null), 2);
                C1C7U.LIZIZ("AiPortraitContentDataSource@8386.fetchAiContentList$1");
            }
        }), "AiPortraitCDS", "fetchAiContentList");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x013b -> B:11:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.HashSet<java.lang.String> r34, kotlin.jvm.functions.Function0<java.lang.Boolean> r35, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super X.InterfaceC1364105Vn<? super X.C00EK>, ? extends java.lang.Object> r36, X.InterfaceC1364105Vn<? super java.util.List<X.C535020Kya>> r37) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C535140Kym.LIZJ(java.util.HashSet, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }
}
