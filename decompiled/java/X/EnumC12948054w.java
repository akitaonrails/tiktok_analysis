package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.054w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12948054w {
    public static final C12949054x Companion;
    public static final /* synthetic */ EnumC12948054w[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final Map<Integer, EnumC12948054w> MAP;
    public static final EnumC12948054w SENSITIVITY_EVER;
    public static final EnumC12948054w SENSITIVITY_LAST_FOURTEEN_DAYS;
    public static final EnumC12948054w SENSITIVITY_TODAY;
    public static final EnumC12948054w UNSENSITIVITY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC12948054w> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.054x] */
    static {
        EnumC12948054w enumC12948054w = new EnumC12948054w("UNSENSITIVITY", 0, 0);
        UNSENSITIVITY = enumC12948054w;
        EnumC12948054w enumC12948054w2 = new EnumC12948054w("SENSITIVITY_TODAY", 1, 1);
        SENSITIVITY_TODAY = enumC12948054w2;
        EnumC12948054w enumC12948054w3 = new EnumC12948054w("SENSITIVITY_LAST_FOURTEEN_DAYS", 2, 2);
        SENSITIVITY_LAST_FOURTEEN_DAYS = enumC12948054w3;
        EnumC12948054w enumC12948054w4 = new EnumC12948054w("SENSITIVITY_EVER", 3, 3);
        SENSITIVITY_EVER = enumC12948054w4;
        EnumC12948054w[] enumC12948054wArr = {enumC12948054w, enumC12948054w2, enumC12948054w3, enumC12948054w4};
        LLILLJJLI = enumC12948054wArr;
        LLILLL = new C2254308sP(enumC12948054wArr);
        Companion = new Object() { // from class: X.054x
        };
        EnumC12948054w[] enumC12948054wArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC12948054wArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC12948054w enumC12948054w5 : enumC12948054wArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC12948054w5.LL), enumC12948054w5);
        }
        MAP = linkedHashMap;
    }

    public static EnumC12948054w[] values() {
        return (EnumC12948054w[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC12948054w valueOf(String str) {
        return (EnumC12948054w) C08FF.LIZ(EnumC12948054w.class, str);
    }

    public EnumC12948054w(String str, int i, int i2) {
        this.LL = i2;
    }
}
