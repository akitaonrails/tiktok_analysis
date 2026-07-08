package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1012120cRe {
    public static final C1011980cRQ Companion;
    public static final /* synthetic */ EnumC1012120cRe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1012120cRe OFF;
    public static final EnumC1012120cRe ON;
    public static final Map<Integer, EnumC1012120cRe> stateValueMap;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1012120cRe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1012120cRe enumC1012120cRe = new EnumC1012120cRe("OFF", 0, 0);
        OFF = enumC1012120cRe;
        EnumC1012120cRe enumC1012120cRe2 = new EnumC1012120cRe("ON", 1, 1);
        ON = enumC1012120cRe2;
        EnumC1012120cRe[] enumC1012120cReArr = {enumC1012120cRe, enumC1012120cRe2};
        LLILLJJLI = enumC1012120cReArr;
        LLILLL = new C2254308sP(enumC1012120cReArr);
        Companion = new C1011980cRQ();
        EnumC1012120cRe[] enumC1012120cReArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1012120cReArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1012120cRe enumC1012120cRe3 : enumC1012120cReArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC1012120cRe3.LL), enumC1012120cRe3);
        }
        stateValueMap = linkedHashMap;
    }

    public static EnumC1012120cRe[] values() {
        return (EnumC1012120cRe[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1012120cRe valueOf(String str) {
        return (EnumC1012120cRe) C08FF.LIZ(EnumC1012120cRe.class, str);
    }

    public EnumC1012120cRe(String str, int i, int i2) {
        this.LL = i2;
    }
}
