package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xIG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1813540xIG {
    public static final EnumC1813540xIG FRIENDS;
    public static final /* synthetic */ EnumC1813540xIG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1813540xIG ONLY_YOU;
    public static final EnumC1813540xIG PUBLIC;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1813540xIG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1813540xIG enumC1813540xIG = new EnumC1813540xIG("PUBLIC", 0, 0);
        PUBLIC = enumC1813540xIG;
        EnumC1813540xIG enumC1813540xIG2 = new EnumC1813540xIG("FRIENDS", 1, 2);
        FRIENDS = enumC1813540xIG2;
        EnumC1813540xIG enumC1813540xIG3 = new EnumC1813540xIG("ONLY_YOU", 2, 1);
        ONLY_YOU = enumC1813540xIG3;
        EnumC1813540xIG[] enumC1813540xIGArr = {enumC1813540xIG, enumC1813540xIG2, enumC1813540xIG3};
        LLILLJJLI = enumC1813540xIGArr;
        LLILLL = new C2254308sP(enumC1813540xIGArr);
    }

    public static EnumC1813540xIG[] values() {
        return (EnumC1813540xIG[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1813540xIG valueOf(String str) {
        return (EnumC1813540xIG) C08FF.LIZ(EnumC1813540xIG.class, str);
    }

    public EnumC1813540xIG(String str, int i, int i2) {
        this.LL = i2;
    }
}
