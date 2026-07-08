package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1742470vRd {
    public static final EnumC1742470vRd CART;
    public static final C1742500vRg Companion;
    public static final EnumC1742470vRd DEAL_RUNTIME;
    public static final /* synthetic */ EnumC1742470vRd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1742470vRd MALL;
    public static final EnumC1742470vRd PDP;
    public static final EnumC1742470vRd SHOP_SEARCH_MIX_RESULT;
    public static final EnumC1742470vRd TRENDS;
    public static final Map<String, EnumC1742470vRd> VALUE_MAP;
    public static final C01GW<Collection<String>> dealsSubpageNames$delegate;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1742470vRd> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0vRg] */
    static {
        EnumC1742470vRd enumC1742470vRd = new EnumC1742470vRd("MALL", 0, "mall");
        MALL = enumC1742470vRd;
        EnumC1742470vRd enumC1742470vRd2 = new EnumC1742470vRd("SHOP_SEARCH_MIX_RESULT", 1, "shop_search_mix_result");
        SHOP_SEARCH_MIX_RESULT = enumC1742470vRd2;
        EnumC1742470vRd enumC1742470vRd3 = new EnumC1742470vRd("PDP", 2, "product_detail");
        PDP = enumC1742470vRd3;
        EnumC1742470vRd enumC1742470vRd4 = new EnumC1742470vRd("DEAL_RUNTIME", 3, "deal_runtime");
        DEAL_RUNTIME = enumC1742470vRd4;
        EnumC1742470vRd enumC1742470vRd5 = new EnumC1742470vRd("TRENDS", 4, "trends");
        TRENDS = enumC1742470vRd5;
        EnumC1742470vRd enumC1742470vRd6 = new EnumC1742470vRd("CART", 5, "cart");
        CART = enumC1742470vRd6;
        EnumC1742470vRd[] enumC1742470vRdArr = {enumC1742470vRd, enumC1742470vRd2, enumC1742470vRd3, enumC1742470vRd4, enumC1742470vRd5, enumC1742470vRd6};
        LLILLJJLI = enumC1742470vRdArr;
        LLILLL = new C2254308sP(enumC1742470vRdArr);
        Companion = new Object() { // from class: X.0vRg
        };
        InterfaceC2044707zh<EnumC1742470vRd> entries = getEntries();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1742470vRd enumC1742470vRd7 : entries) {
            linkedHashMap.put(enumC1742470vRd7.LL, enumC1742470vRd7);
        }
        VALUE_MAP = linkedHashMap;
        dealsSubpageNames$delegate = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(63));
    }

    public static EnumC1742470vRd[] values() {
        return (EnumC1742470vRd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1742470vRd valueOf(String str) {
        return (EnumC1742470vRd) C08FF.LIZ(EnumC1742470vRd.class, str);
    }

    public EnumC1742470vRd(String str, int i, String str2) {
        this.LL = str2;
    }
}
