package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0298008i {
    public static final EnumC0298008i FULLSCREEN;
    public static final /* synthetic */ EnumC0298008i[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0298008i SEVEN_TENTHS;

    public static InterfaceC2044707zh<EnumC0298008i> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0298008i enumC0298008i = new EnumC0298008i("SEVEN_TENTHS", 0);
        SEVEN_TENTHS = enumC0298008i;
        EnumC0298008i enumC0298008i2 = new EnumC0298008i("FULLSCREEN", 1);
        FULLSCREEN = enumC0298008i2;
        EnumC0298008i[] enumC0298008iArr = {enumC0298008i, enumC0298008i2};
        LL = enumC0298008iArr;
        LLILLJJLI = new C2254308sP(enumC0298008iArr);
    }

    public static EnumC0298008i[] values() {
        return (EnumC0298008i[]) LL.clone();
    }

    public static EnumC0298008i valueOf(String str) {
        return (EnumC0298008i) C08FF.LIZ(EnumC0298008i.class, str);
    }

    public EnumC0298008i(String str, int i) {
    }
}
