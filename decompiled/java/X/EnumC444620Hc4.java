package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC444620Hc4 {
    public static final EnumC444620Hc4 FIXED;
    public static final EnumC444620Hc4 HUG;
    public static final EnumC444620Hc4 ILLUSTRATION;
    public static final /* synthetic */ EnumC444620Hc4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC444620Hc4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC444620Hc4 enumC444620Hc4 = new EnumC444620Hc4("HUG", 0);
        HUG = enumC444620Hc4;
        EnumC444620Hc4 enumC444620Hc42 = new EnumC444620Hc4("FIXED", 1);
        FIXED = enumC444620Hc42;
        EnumC444620Hc4 enumC444620Hc43 = new EnumC444620Hc4("ILLUSTRATION", 2);
        ILLUSTRATION = enumC444620Hc43;
        EnumC444620Hc4[] enumC444620Hc4Arr = {enumC444620Hc4, enumC444620Hc42, enumC444620Hc43};
        LL = enumC444620Hc4Arr;
        LLILLJJLI = new C2254308sP(enumC444620Hc4Arr);
    }

    public static EnumC444620Hc4[] values() {
        return (EnumC444620Hc4[]) LL.clone();
    }

    public static EnumC444620Hc4 valueOf(String str) {
        return (EnumC444620Hc4) C08FF.LIZ(EnumC444620Hc4.class, str);
    }

    public EnumC444620Hc4(String str, int i) {
    }
}
