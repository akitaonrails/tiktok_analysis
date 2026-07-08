package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zlj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC909250Zlj {
    public static final C909260Zlk Companion;
    public static final EnumC909250Zlj DELETE;
    public static final EnumC909250Zlj INSERT;
    public static final /* synthetic */ EnumC909250Zlj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC909250Zlj NULL;
    public static final EnumC909250Zlj REPLACE;
    public static final Map<String, EnumC909250Zlj> map;
    public final String LL;

    public static InterfaceC2044707zh<EnumC909250Zlj> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Zlk] */
    static {
        EnumC909250Zlj enumC909250Zlj = new EnumC909250Zlj("NULL", 0, "null");
        NULL = enumC909250Zlj;
        EnumC909250Zlj enumC909250Zlj2 = new EnumC909250Zlj("INSERT", 1, "1");
        INSERT = enumC909250Zlj2;
        EnumC909250Zlj enumC909250Zlj3 = new EnumC909250Zlj("REPLACE", 2, "2");
        REPLACE = enumC909250Zlj3;
        EnumC909250Zlj enumC909250Zlj4 = new EnumC909250Zlj("DELETE", 3, "3");
        DELETE = enumC909250Zlj4;
        EnumC909250Zlj[] enumC909250ZljArr = {enumC909250Zlj, enumC909250Zlj2, enumC909250Zlj3, enumC909250Zlj4};
        LLILLJJLI = enumC909250ZljArr;
        LLILLL = new C2254308sP(enumC909250ZljArr);
        Companion = new Object() { // from class: X.0Zlk
        };
        EnumC909250Zlj[] enumC909250ZljArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC909250ZljArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC909250Zlj enumC909250Zlj5 : enumC909250ZljArrValues) {
            linkedHashMap.put(enumC909250Zlj5.LL, enumC909250Zlj5);
        }
        map = linkedHashMap;
    }

    public static EnumC909250Zlj[] values() {
        return (EnumC909250Zlj[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC909250Zlj valueOf(String str) {
        return (EnumC909250Zlj) C08FF.LIZ(EnumC909250Zlj.class, str);
    }

    public EnumC909250Zlj(String str, int i, String str2) {
        this.LL = str2;
    }
}
