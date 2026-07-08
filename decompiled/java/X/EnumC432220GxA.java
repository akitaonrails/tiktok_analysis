package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC432220GxA {
    public static final EnumC432220GxA INLINE;
    public static final /* synthetic */ EnumC432220GxA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC432220GxA PAIR;
    public static final EnumC432220GxA SELF;

    public static InterfaceC2044707zh<EnumC432220GxA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC432220GxA enumC432220GxA = new EnumC432220GxA("SELF", 0);
        SELF = enumC432220GxA;
        EnumC432220GxA enumC432220GxA2 = new EnumC432220GxA("PAIR", 1);
        PAIR = enumC432220GxA2;
        EnumC432220GxA enumC432220GxA3 = new EnumC432220GxA("INLINE", 2);
        INLINE = enumC432220GxA3;
        EnumC432220GxA[] enumC432220GxAArr = {enumC432220GxA, enumC432220GxA2, enumC432220GxA3};
        LL = enumC432220GxAArr;
        LLILLJJLI = new C2254308sP(enumC432220GxAArr);
    }

    public static EnumC432220GxA[] values() {
        return (EnumC432220GxA[]) LL.clone();
    }

    public static EnumC432220GxA valueOf(String str) {
        return (EnumC432220GxA) C08FF.LIZ(EnumC432220GxA.class, str);
    }

    public EnumC432220GxA(String str, int i) {
    }
}
