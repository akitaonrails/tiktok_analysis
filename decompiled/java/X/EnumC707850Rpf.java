package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rpf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC707850Rpf implements Serializable {
    public static final EnumC707850Rpf CONTAINER_PRIORITY_AVOID;
    public static final EnumC707850Rpf DISPERSION_AVOID;
    public static final EnumC707850Rpf DISPLAY;
    public static final EnumC707850Rpf ENABLE_AVOID;
    public static final EnumC707850Rpf ENABLE_REQUEST_AVOID;
    public static final EnumC707850Rpf EXIT_AVOID;
    public static final EnumC707850Rpf FREQUENCY_AVOID;
    public static final EnumC707850Rpf GLOBAL_ENABLE_AVOID;
    public static final EnumC707850Rpf GLOBAL_FINAL_FILTER;
    public static final EnumC707850Rpf GLOBAL_PRIORITY_AVOID;
    public static final EnumC707850Rpf INIT;
    public static final /* synthetic */ EnumC707850Rpf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC707850Rpf OCCUPIED_SLOT;
    public static final EnumC707850Rpf STANDARD_PRIORITY_AVOID;
    public final int LL;

    public static InterfaceC2044707zh<EnumC707850Rpf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC707850Rpf enumC707850Rpf = new EnumC707850Rpf("INIT", 0, 0);
        INIT = enumC707850Rpf;
        EnumC707850Rpf enumC707850Rpf2 = new EnumC707850Rpf("ENABLE_REQUEST_AVOID", 1, 1);
        ENABLE_REQUEST_AVOID = enumC707850Rpf2;
        EnumC707850Rpf enumC707850Rpf3 = new EnumC707850Rpf("FREQUENCY_AVOID", 2, 2);
        FREQUENCY_AVOID = enumC707850Rpf3;
        EnumC707850Rpf enumC707850Rpf4 = new EnumC707850Rpf("EXIT_AVOID", 3, 3);
        EXIT_AVOID = enumC707850Rpf4;
        EnumC707850Rpf enumC707850Rpf5 = new EnumC707850Rpf("DISPERSION_AVOID", 4, 4);
        DISPERSION_AVOID = enumC707850Rpf5;
        EnumC707850Rpf enumC707850Rpf6 = new EnumC707850Rpf("ENABLE_AVOID", 5, 5);
        ENABLE_AVOID = enumC707850Rpf6;
        EnumC707850Rpf enumC707850Rpf7 = new EnumC707850Rpf("STANDARD_PRIORITY_AVOID", 6, 101);
        STANDARD_PRIORITY_AVOID = enumC707850Rpf7;
        EnumC707850Rpf enumC707850Rpf8 = new EnumC707850Rpf("CONTAINER_PRIORITY_AVOID", 7, 201);
        CONTAINER_PRIORITY_AVOID = enumC707850Rpf8;
        EnumC707850Rpf enumC707850Rpf9 = new EnumC707850Rpf("GLOBAL_ENABLE_AVOID", 8, 301);
        GLOBAL_ENABLE_AVOID = enumC707850Rpf9;
        EnumC707850Rpf enumC707850Rpf10 = new EnumC707850Rpf("GLOBAL_PRIORITY_AVOID", 9, 302);
        GLOBAL_PRIORITY_AVOID = enumC707850Rpf10;
        EnumC707850Rpf enumC707850Rpf11 = new EnumC707850Rpf("GLOBAL_FINAL_FILTER", 10, 303);
        GLOBAL_FINAL_FILTER = enumC707850Rpf11;
        EnumC707850Rpf enumC707850Rpf12 = new EnumC707850Rpf("OCCUPIED_SLOT", 11, 1000000);
        OCCUPIED_SLOT = enumC707850Rpf12;
        EnumC707850Rpf enumC707850Rpf13 = new EnumC707850Rpf("DISPLAY", 12, Integer.MAX_VALUE);
        DISPLAY = enumC707850Rpf13;
        EnumC707850Rpf[] enumC707850RpfArr = {enumC707850Rpf, enumC707850Rpf2, enumC707850Rpf3, enumC707850Rpf4, enumC707850Rpf5, enumC707850Rpf6, enumC707850Rpf7, enumC707850Rpf8, enumC707850Rpf9, enumC707850Rpf10, enumC707850Rpf11, enumC707850Rpf12, enumC707850Rpf13};
        LLILLJJLI = enumC707850RpfArr;
        LLILLL = new C2254308sP(enumC707850RpfArr);
    }

    public static EnumC707850Rpf[] values() {
        return (EnumC707850Rpf[]) LLILLJJLI.clone();
    }

    public final int getLevel() {
        return this.LL;
    }

    public static EnumC707850Rpf valueOf(String str) {
        return (EnumC707850Rpf) C08FF.LIZ(EnumC707850Rpf.class, str);
    }

    public EnumC707850Rpf(String str, int i, int i2) {
        this.LL = i2;
    }
}
