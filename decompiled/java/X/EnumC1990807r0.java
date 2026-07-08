package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07r0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1990807r0 {
    public static final /* synthetic */ EnumC1990807r0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1990807r0 RECORD_CORE_ABILITY;
    public static final EnumC1990807r0 RECORD_UI;
    public static final EnumC1990807r0 RECORD_UI_MIRROR;

    public static InterfaceC2044707zh<EnumC1990807r0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1990807r0 enumC1990807r0 = new EnumC1990807r0("RECORD_CORE_ABILITY", 0);
        RECORD_CORE_ABILITY = enumC1990807r0;
        EnumC1990807r0 enumC1990807r02 = new EnumC1990807r0("RECORD_UI", 1);
        RECORD_UI = enumC1990807r02;
        EnumC1990807r0 enumC1990807r03 = new EnumC1990807r0("RECORD_UI_MIRROR", 2);
        RECORD_UI_MIRROR = enumC1990807r03;
        EnumC1990807r0[] enumC1990807r0Arr = {enumC1990807r0, enumC1990807r02, enumC1990807r03};
        LL = enumC1990807r0Arr;
        LLILLJJLI = new C2254308sP(enumC1990807r0Arr);
    }

    public static EnumC1990807r0[] values() {
        return (EnumC1990807r0[]) LL.clone();
    }

    public static EnumC1990807r0 valueOf(String str) {
        return (EnumC1990807r0) C08FF.LIZ(EnumC1990807r0.class, str);
    }

    public EnumC1990807r0(String str, int i) {
    }
}
