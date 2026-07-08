package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993220bxA {
    public static final EnumC993220bxA AUTHORIZED;
    public static final EnumC993220bxA DENIED;
    public static final /* synthetic */ EnumC993220bxA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993220bxA NOT_DETERMINED;

    public static InterfaceC2044707zh<EnumC993220bxA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993220bxA enumC993220bxA = new EnumC993220bxA("AUTHORIZED", 0);
        AUTHORIZED = enumC993220bxA;
        EnumC993220bxA enumC993220bxA2 = new EnumC993220bxA("DENIED", 1);
        DENIED = enumC993220bxA2;
        EnumC993220bxA enumC993220bxA3 = new EnumC993220bxA("NOT_DETERMINED", 2);
        NOT_DETERMINED = enumC993220bxA3;
        EnumC993220bxA[] enumC993220bxAArr = {enumC993220bxA, enumC993220bxA2, enumC993220bxA3};
        LL = enumC993220bxAArr;
        LLILLJJLI = new C2254308sP(enumC993220bxAArr);
    }

    public static EnumC993220bxA[] values() {
        return (EnumC993220bxA[]) LL.clone();
    }

    public static EnumC993220bxA valueOf(String str) {
        return (EnumC993220bxA) C08FF.LIZ(EnumC993220bxA.class, str);
    }

    public EnumC993220bxA(String str, int i) {
    }
}
