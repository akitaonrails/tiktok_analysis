package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01Iv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC311901Iv {
    public static final EnumC311901Iv BOTTOM_BUTTON;
    public static final /* synthetic */ EnumC311901Iv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC311901Iv OTHER;

    public static InterfaceC2044707zh<EnumC311901Iv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC311901Iv enumC311901Iv = new EnumC311901Iv("BOTTOM_BUTTON", 0);
        BOTTOM_BUTTON = enumC311901Iv;
        EnumC311901Iv enumC311901Iv2 = new EnumC311901Iv("OTHER", 1);
        OTHER = enumC311901Iv2;
        EnumC311901Iv[] enumC311901IvArr = {enumC311901Iv, enumC311901Iv2};
        LL = enumC311901IvArr;
        LLILLJJLI = new C2254308sP(enumC311901IvArr);
    }

    public static EnumC311901Iv[] values() {
        return (EnumC311901Iv[]) LL.clone();
    }

    public static EnumC311901Iv valueOf(String str) {
        return (EnumC311901Iv) C08FF.LIZ(EnumC311901Iv.class, str);
    }

    public EnumC311901Iv(String str, int i) {
    }
}
