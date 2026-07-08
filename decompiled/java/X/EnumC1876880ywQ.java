package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ywQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1876880ywQ {
    public static final C1876890ywR Companion;
    public static final /* synthetic */ EnumC1876880ywQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1876880ywQ PUT;
    public static final EnumC1876880ywQ USED;
    public static final Map<String, EnumC1876880ywQ> byToken;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1876880ywQ> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ywR] */
    static {
        EnumC1876880ywQ enumC1876880ywQ = new EnumC1876880ywQ("PUT", 0, "PUT");
        PUT = enumC1876880ywQ;
        EnumC1876880ywQ enumC1876880ywQ2 = new EnumC1876880ywQ("USED", 1, "USED");
        USED = enumC1876880ywQ2;
        EnumC1876880ywQ[] enumC1876880ywQArr = {enumC1876880ywQ, enumC1876880ywQ2};
        LLILLJJLI = enumC1876880ywQArr;
        LLILLL = new C2254308sP(enumC1876880ywQArr);
        Companion = new Object() { // from class: X.0ywR
        };
        InterfaceC2044707zh<EnumC1876880ywQ> entries = getEntries();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1876880ywQ enumC1876880ywQ3 : entries) {
            linkedHashMap.put(enumC1876880ywQ3.LL, enumC1876880ywQ3);
        }
        byToken = linkedHashMap;
    }

    public static EnumC1876880ywQ[] values() {
        return (EnumC1876880ywQ[]) LLILLJJLI.clone();
    }

    public final String getOperators() {
        return this.LL;
    }

    public static EnumC1876880ywQ valueOf(String str) {
        return (EnumC1876880ywQ) C08FF.LIZ(EnumC1876880ywQ.class, str);
    }

    public EnumC1876880ywQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
