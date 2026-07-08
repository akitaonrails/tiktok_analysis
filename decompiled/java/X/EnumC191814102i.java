package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.102i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC191814102i {
    public static final C191816102k Companion;
    public static final EnumC191814102i EU_EEA;
    public static final /* synthetic */ EnumC191814102i[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final Map<Integer, EnumC191814102i> MAP;
    public static final EnumC191814102i PASS;
    public static final EnumC191814102i US_FTC;
    public final int LL;

    public static InterfaceC2044707zh<EnumC191814102i> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.102k] */
    static {
        EnumC191814102i enumC191814102i = new EnumC191814102i("PASS", 0, 0);
        PASS = enumC191814102i;
        EnumC191814102i enumC191814102i2 = new EnumC191814102i("US_FTC", 1, 1);
        US_FTC = enumC191814102i2;
        EnumC191814102i enumC191814102i3 = new EnumC191814102i("EU_EEA", 2, 2);
        EU_EEA = enumC191814102i3;
        EnumC191814102i[] enumC191814102iArr = {enumC191814102i, enumC191814102i2, enumC191814102i3};
        LLILLJJLI = enumC191814102iArr;
        LLILLL = new C2254308sP(enumC191814102iArr);
        Companion = new Object() { // from class: X.102k
        };
        EnumC191814102i[] enumC191814102iArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC191814102iArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC191814102i enumC191814102i4 : enumC191814102iArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC191814102i4.LL), enumC191814102i4);
        }
        MAP = linkedHashMap;
    }

    public static EnumC191814102i[] values() {
        return (EnumC191814102i[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC191814102i valueOf(String str) {
        return (EnumC191814102i) C08FF.LIZ(EnumC191814102i.class, str);
    }

    public EnumC191814102i(String str, int i, int i2) {
        this.LL = i2;
    }
}
