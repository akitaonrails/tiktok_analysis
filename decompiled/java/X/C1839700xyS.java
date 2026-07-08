package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839700xyS extends C09AY implements Function0<Map<String, Locale>> {
    public C1839700xyS() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, Locale> invoke() {
        Currency currency;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C089E c089e = new C089E(Locale.getAvailableLocales());
        while (c089e.hasNext()) {
            Locale locale = (Locale) c089e.next();
            try {
                currency = Currency.getInstance(locale);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                currency = null;
            }
            if (currency != null) {
                linkedHashMap.put(currency.getSymbol(locale), locale);
            }
        }
        return linkedHashMap;
    }
}
