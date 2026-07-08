package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993320bxK {
    public static final EnumC993320bxK CONTEXT_LOST;
    public static final /* synthetic */ EnumC993320bxK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993320bxK PROGRAMMATIC;
    public static final EnumC993320bxK UNKNOWN;
    public static final EnumC993320bxK USER;

    public static InterfaceC2044707zh<EnumC993320bxK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993320bxK enumC993320bxK = new EnumC993320bxK("PROGRAMMATIC", 0);
        PROGRAMMATIC = enumC993320bxK;
        EnumC993320bxK enumC993320bxK2 = new EnumC993320bxK("CONTEXT_LOST", 1);
        CONTEXT_LOST = enumC993320bxK2;
        EnumC993320bxK enumC993320bxK3 = new EnumC993320bxK("USER", 2);
        USER = enumC993320bxK3;
        EnumC993320bxK enumC993320bxK4 = new EnumC993320bxK("UNKNOWN", 3);
        UNKNOWN = enumC993320bxK4;
        EnumC993320bxK[] enumC993320bxKArr = {enumC993320bxK, enumC993320bxK2, enumC993320bxK3, enumC993320bxK4};
        LL = enumC993320bxKArr;
        LLILLJJLI = new C2254308sP(enumC993320bxKArr);
    }

    public static EnumC993320bxK[] values() {
        return (EnumC993320bxK[]) LL.clone();
    }

    public static EnumC993320bxK valueOf(String str) {
        return (EnumC993320bxK) C08FF.LIZ(EnumC993320bxK.class, str);
    }

    public EnumC993320bxK(String str, int i) {
    }
}
