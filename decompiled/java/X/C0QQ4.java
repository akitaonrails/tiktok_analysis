package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QQ4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QQ4 {
    public static final C0QQ3 Companion;
    public static final /* synthetic */ C0QQ4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0QQ4 MALL_PAGE;
    public static final Map<String, C0QQ4> MAP;
    public static final C0QQ4 MIDDLE_PAGE;
    public final String LL;

    public static InterfaceC2044707zh<C0QQ4> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0QQ3] */
    static {
        C0QQ4 c0qq4 = new C0QQ4("MIDDLE_PAGE", 0, "middle_page");
        MIDDLE_PAGE = c0qq4;
        C0QQ4 c0qq42 = new C0QQ4("MALL_PAGE", 1, "mall_page");
        MALL_PAGE = c0qq42;
        C0QQ4[] c0qq4Arr = {c0qq4, c0qq42};
        LLILLJJLI = c0qq4Arr;
        LLILLL = new C2254308sP(c0qq4Arr);
        Companion = new Object() { // from class: X.0QQ3
        };
        C0QQ4[] c0qq4ArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(c0qq4ArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (C0QQ4 c0qq43 : c0qq4ArrValues) {
            linkedHashMap.put(c0qq43.LL, c0qq43);
        }
        MAP = linkedHashMap;
    }

    public static C0QQ4[] values() {
        return (C0QQ4[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static C0QQ4 valueOf(String str) {
        return (C0QQ4) C08FF.LIZ(C0QQ4.class, str);
    }

    public C0QQ4(String str, int i, String str2) {
        this.LL = str2;
    }
}
