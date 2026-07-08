package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0uZ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708620uZ2 extends C09AY implements Function2<String, Map<String, ? extends String>, Pair<? extends String, ? extends Map<String, ? extends String>>> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708620uZ2(String str) {
        super(2);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Pair<? extends String, ? extends Map<String, ? extends String>> invoke(String str, Map<String, ? extends String> map) {
        String strLJJIII = str;
        Map<String, ? extends String> map2 = map;
        if (u.LJJIIJZLJL(strLJJIII, "tiktokls_", false)) {
            strLJJIII = u.LJJIII(strLJJIII, "tiktokls_", "fp_sdk_cashier_", false);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = this.LL;
        linkedHashMap.putAll(map2);
        Object obj = ((LinkedHashMap) C1708610uZ1.LIZIZ).get(str2);
        if (obj != null) {
            linkedHashMap.put("universal_cashier_type", obj);
        }
        linkedHashMap.remove("EVENT_ORIGIN_FEATURE");
        return new Pair<>(strLJJIII, linkedHashMap);
    }
}
