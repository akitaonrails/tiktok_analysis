package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hWe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1207420hWe {
    public static final EnumC1207420hWe EarlyOpenSettings;
    public static final EnumC1207420hWe InApp;
    public static final /* synthetic */ EnumC1207420hWe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1207420hWe OpenSettings;
    public static final EnumC1207420hWe System;

    public static InterfaceC2044707zh<EnumC1207420hWe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1207420hWe enumC1207420hWe = new EnumC1207420hWe("System", 0);
        System = enumC1207420hWe;
        EnumC1207420hWe enumC1207420hWe2 = new EnumC1207420hWe("EarlyOpenSettings", 1);
        EarlyOpenSettings = enumC1207420hWe2;
        EnumC1207420hWe enumC1207420hWe3 = new EnumC1207420hWe("OpenSettings", 2);
        OpenSettings = enumC1207420hWe3;
        EnumC1207420hWe enumC1207420hWe4 = new EnumC1207420hWe("InApp", 3);
        InApp = enumC1207420hWe4;
        EnumC1207420hWe[] enumC1207420hWeArr = {enumC1207420hWe, enumC1207420hWe2, enumC1207420hWe3, enumC1207420hWe4};
        LL = enumC1207420hWeArr;
        LLILLJJLI = new C2254308sP(enumC1207420hWeArr);
    }

    public static EnumC1207420hWe[] values() {
        return (EnumC1207420hWe[]) LL.clone();
    }

    public static EnumC1207420hWe valueOf(String str) {
        return (EnumC1207420hWe) C08FF.LIZ(EnumC1207420hWe.class, str);
    }

    public EnumC1207420hWe(String str, int i) {
    }
}
