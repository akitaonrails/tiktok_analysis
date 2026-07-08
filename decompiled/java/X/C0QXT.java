package X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QXT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QXT implements Serializable {
    public static final C0QZT Companion;
    public static final /* synthetic */ C0QXT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final Map<String, C0QXT> MAP;
    public static final C0QXT PRODUCT_CARD;
    public static final C0QXT STORE_CARD;
    public static final C0QXT TALENT_CARD;
    public final String LL;

    public static InterfaceC2044707zh<C0QXT> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0QZT] */
    static {
        C0QXT c0qxt = new C0QXT("PRODUCT_CARD", 0, "product_card");
        PRODUCT_CARD = c0qxt;
        C0QXT c0qxt2 = new C0QXT("TALENT_CARD", 1, "talent_card");
        TALENT_CARD = c0qxt2;
        C0QXT c0qxt3 = new C0QXT("STORE_CARD", 2, "store_card");
        STORE_CARD = c0qxt3;
        C0QXT[] c0qxtArr = {c0qxt, c0qxt2, c0qxt3};
        LLILLJJLI = c0qxtArr;
        LLILLL = new C2254308sP(c0qxtArr);
        Companion = new Object() { // from class: X.0QZT
        };
        C0QXT[] c0qxtArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(c0qxtArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (C0QXT c0qxt4 : c0qxtArrValues) {
            linkedHashMap.put(c0qxt4.LL, c0qxt4);
        }
        MAP = linkedHashMap;
    }

    public static C0QXT[] values() {
        return (C0QXT[]) LLILLJJLI.clone();
    }

    public final String getCardName() {
        return this.LL;
    }

    public static C0QXT valueOf(String str) {
        return (C0QXT) C08FF.LIZ(C0QXT.class, str);
    }

    public C0QXT(String str, int i, String str2) {
        this.LL = str2;
    }
}
