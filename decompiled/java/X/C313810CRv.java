package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.middle.preload.SearchIntentionPredictor;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0CRv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.middle.preload.SugInputTracker$processTextChanged$1", f = "SugInputTracker.kt", l = {}, m = "invokeSuspend")
public final class C313810CRv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C313810CRv(InterfaceC1364105Vn<? super C313810CRv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313810CRv(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("SugInputTracker@89a0.processTextChanged$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strValueOf = String.valueOf(C0QNZ.LJI);
        if (!SearchIntentionPredictor.LIZJ) {
            String str2 = "{\"rules\":[{\"t\":\"cap\",\"q\":\"capcut\"},{\"t\":\"tik\",\"q\":\"tiktok\"}]}";
            try {
                String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "search_intent_rules", "{\"rules\":[{\"t\":\"cap\",\"q\":\"capcut\"},{\"t\":\"tik\",\"q\":\"tiktok\"}]}", true);
                if (strLJJ != null) {
                    str2 = strLJJ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            try {
                SearchIntentionPredictor.LIZ = ((SearchIntentionPredictor.Config) new Gson().LJII(str2, SearchIntentionPredictor.Config.class)).predictionRules;
                ((LinkedHashMap) SearchIntentionPredictor.LIZIZ).clear();
                for (SearchIntentionPredictor.PredictionRule predictionRule : SearchIntentionPredictor.LIZ) {
                    SearchIntentionPredictor.LIZIZ.put(predictionRule.triggerWord.toLowerCase(Locale.ROOT), predictionRule);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            SearchIntentionPredictor.LIZJ = true;
        }
        SearchIntentionPredictor.PredictionRule predictionRule2 = (SearchIntentionPredictor.PredictionRule) ((LinkedHashMap) SearchIntentionPredictor.LIZIZ).get(a0.LJLIIIL(strValueOf).toString().toLowerCase(Locale.ROOT));
        if (predictionRule2 != null && (str = predictionRule2.targetQuery) != null) {
            C0QNZ.LIZ(str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SugInputTracker@89a0.processTextChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C313810CRv(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
