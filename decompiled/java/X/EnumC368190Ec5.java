package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ec5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC368190Ec5 {
    public static final EnumC368190Ec5 LEFT;
    public static final /* synthetic */ EnumC368190Ec5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC368190Ec5 RIGHT;

    public static InterfaceC2044707zh<EnumC368190Ec5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC368190Ec5 enumC368190Ec5 = new EnumC368190Ec5("LEFT", 0);
        LEFT = enumC368190Ec5;
        EnumC368190Ec5 enumC368190Ec52 = new EnumC368190Ec5("RIGHT", 1);
        RIGHT = enumC368190Ec52;
        EnumC368190Ec5[] enumC368190Ec5Arr = {enumC368190Ec5, enumC368190Ec52};
        LL = enumC368190Ec5Arr;
        LLILLJJLI = new C2254308sP(enumC368190Ec5Arr);
    }

    public static EnumC368190Ec5[] values() {
        return (EnumC368190Ec5[]) LL.clone();
    }

    public static EnumC368190Ec5 valueOf(String str) {
        return (EnumC368190Ec5) C08FF.LIZ(EnumC368190Ec5.class, str);
    }

    public EnumC368190Ec5(String str, int i) {
    }
}
