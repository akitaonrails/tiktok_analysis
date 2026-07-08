package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07q8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1985407q8 {
    public static final /* synthetic */ EnumC1985407q8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1985407q8 STAGE_CONSTRUCT;
    public static final EnumC1985407q8 STAGE_ON_CREATE;

    public static InterfaceC2044707zh<EnumC1985407q8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1985407q8 enumC1985407q8 = new EnumC1985407q8("STAGE_CONSTRUCT", 0);
        STAGE_CONSTRUCT = enumC1985407q8;
        EnumC1985407q8 enumC1985407q82 = new EnumC1985407q8("STAGE_ON_CREATE", 1);
        STAGE_ON_CREATE = enumC1985407q82;
        EnumC1985407q8[] enumC1985407q8Arr = {enumC1985407q8, enumC1985407q82};
        LL = enumC1985407q8Arr;
        LLILLJJLI = new C2254308sP(enumC1985407q8Arr);
    }

    public static EnumC1985407q8[] values() {
        return (EnumC1985407q8[]) LL.clone();
    }

    public static EnumC1985407q8 valueOf(String str) {
        return (EnumC1985407q8) C08FF.LIZ(EnumC1985407q8.class, str);
    }

    public EnumC1985407q8(String str, int i) {
    }
}
