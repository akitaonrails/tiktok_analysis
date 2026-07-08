package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Cm7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC323450Cm7 {
    public static final /* synthetic */ EnumC323450Cm7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC323450Cm7 Next;
    public static final EnumC323450Cm7 Prev;
    public static final EnumC323450Cm7 Refresh;

    public static InterfaceC2044707zh<EnumC323450Cm7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC323450Cm7 enumC323450Cm7 = new EnumC323450Cm7("Refresh", 0);
        Refresh = enumC323450Cm7;
        EnumC323450Cm7 enumC323450Cm72 = new EnumC323450Cm7("Next", 1);
        Next = enumC323450Cm72;
        EnumC323450Cm7 enumC323450Cm73 = new EnumC323450Cm7("Prev", 2);
        Prev = enumC323450Cm73;
        EnumC323450Cm7[] enumC323450Cm7Arr = {enumC323450Cm7, enumC323450Cm72, enumC323450Cm73};
        LL = enumC323450Cm7Arr;
        LLILLJJLI = new C2254308sP(enumC323450Cm7Arr);
    }

    public static EnumC323450Cm7[] values() {
        return (EnumC323450Cm7[]) LL.clone();
    }

    public static EnumC323450Cm7 valueOf(String str) {
        return (EnumC323450Cm7) C08FF.LIZ(EnumC323450Cm7.class, str);
    }

    public EnumC323450Cm7(String str, int i) {
    }
}
