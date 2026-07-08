package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hRY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1204260hRY {
    public static final EnumC1204260hRY FULL_LOAD;
    public static final /* synthetic */ EnumC1204260hRY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1204260hRY PULL_DOWN_LOAD;
    public static final EnumC1204260hRY PULL_LOAD_MORE;

    public static InterfaceC2044707zh<EnumC1204260hRY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1204260hRY enumC1204260hRY = new EnumC1204260hRY("FULL_LOAD", 0);
        FULL_LOAD = enumC1204260hRY;
        EnumC1204260hRY enumC1204260hRY2 = new EnumC1204260hRY("PULL_DOWN_LOAD", 1);
        PULL_DOWN_LOAD = enumC1204260hRY2;
        EnumC1204260hRY enumC1204260hRY3 = new EnumC1204260hRY("PULL_LOAD_MORE", 2);
        PULL_LOAD_MORE = enumC1204260hRY3;
        EnumC1204260hRY[] enumC1204260hRYArr = {enumC1204260hRY, enumC1204260hRY2, enumC1204260hRY3};
        LL = enumC1204260hRYArr;
        LLILLJJLI = new C2254308sP(enumC1204260hRYArr);
    }

    public static EnumC1204260hRY[] values() {
        return (EnumC1204260hRY[]) LL.clone();
    }

    public static EnumC1204260hRY valueOf(String str) {
        return (EnumC1204260hRY) C08FF.LIZ(EnumC1204260hRY.class, str);
    }

    public EnumC1204260hRY(String str, int i) {
    }
}
