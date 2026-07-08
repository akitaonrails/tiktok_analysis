package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC559620LxA {
    public static final EnumC559620LxA CLICK;
    public static final /* synthetic */ EnumC559620LxA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC559620LxA LONG_PRESS;

    public static InterfaceC2044707zh<EnumC559620LxA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC559620LxA enumC559620LxA = new EnumC559620LxA("CLICK", 0);
        CLICK = enumC559620LxA;
        EnumC559620LxA enumC559620LxA2 = new EnumC559620LxA("LONG_PRESS", 1);
        LONG_PRESS = enumC559620LxA2;
        EnumC559620LxA[] enumC559620LxAArr = {enumC559620LxA, enumC559620LxA2};
        LL = enumC559620LxAArr;
        LLILLJJLI = new C2254308sP(enumC559620LxAArr);
    }

    public static EnumC559620LxA[] values() {
        return (EnumC559620LxA[]) LL.clone();
    }

    public static EnumC559620LxA valueOf(String str) {
        return (EnumC559620LxA) C08FF.LIZ(EnumC559620LxA.class, str);
    }

    public EnumC559620LxA(String str, int i) {
    }
}
