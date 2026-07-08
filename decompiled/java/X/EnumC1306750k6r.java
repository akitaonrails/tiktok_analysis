package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1306750k6r {
    public static final C1306740k6q Companion;
    public static final /* synthetic */ EnumC1306750k6r[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1306750k6r LYRAX;
    public static final EnumC1306750k6r LYRAX_TEST;
    public static final EnumC1306750k6r MULTI_MEDIA;
    public static final EnumC1306750k6r STARSHIP_CLIENT;

    @InterfaceC1294060jmO
    public static final EnumC1306750k6r TTLH_CLIENT;
    public static final Map<String, EnumC1306750k6r> valueMap;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1306750k6r> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0k6q] */
    static {
        EnumC1306750k6r enumC1306750k6r = new EnumC1306750k6r("STARSHIP_CLIENT", 0, "starship_client");
        STARSHIP_CLIENT = enumC1306750k6r;
        EnumC1306750k6r enumC1306750k6r2 = new EnumC1306750k6r("MULTI_MEDIA", 1, "multi_media");
        MULTI_MEDIA = enumC1306750k6r2;
        EnumC1306750k6r enumC1306750k6r3 = new EnumC1306750k6r("LYRAX", 2, "lyrax");
        LYRAX = enumC1306750k6r3;
        EnumC1306750k6r enumC1306750k6r4 = new EnumC1306750k6r("LYRAX_TEST", 3, "lyrax_test");
        LYRAX_TEST = enumC1306750k6r4;
        EnumC1306750k6r enumC1306750k6r5 = new EnumC1306750k6r("TTLH_CLIENT", 4, "ttlh_client");
        TTLH_CLIENT = enumC1306750k6r5;
        EnumC1306750k6r[] enumC1306750k6rArr = {enumC1306750k6r, enumC1306750k6r2, enumC1306750k6r3, enumC1306750k6r4, enumC1306750k6r5};
        LLILLJJLI = enumC1306750k6rArr;
        LLILLL = new C2254308sP(enumC1306750k6rArr);
        Companion = new Object() { // from class: X.0k6q
        };
        EnumC1306750k6r[] enumC1306750k6rArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1306750k6rArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1306750k6r enumC1306750k6r6 : enumC1306750k6rArrValues) {
            linkedHashMap.put(enumC1306750k6r6.LL, enumC1306750k6r6);
        }
        valueMap = linkedHashMap;
    }

    public static EnumC1306750k6r[] values() {
        return (EnumC1306750k6r[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1306750k6r valueOf(String str) {
        return (EnumC1306750k6r) C08FF.LIZ(EnumC1306750k6r.class, str);
    }

    public EnumC1306750k6r(String str, int i, String str2) {
        this.LL = str2;
    }
}
