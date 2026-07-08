package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HlY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC450500HlY {
    public static final EnumC450500HlY ERROR;
    public static final EnumC450500HlY FILE;
    public static final /* synthetic */ EnumC450500HlY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC450500HlY LOADING;
    public static final EnumC450500HlY NETWORK;

    public static InterfaceC2044707zh<EnumC450500HlY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC450500HlY enumC450500HlY = new EnumC450500HlY("ERROR", 0);
        ERROR = enumC450500HlY;
        EnumC450500HlY enumC450500HlY2 = new EnumC450500HlY("FILE", 1);
        FILE = enumC450500HlY2;
        EnumC450500HlY enumC450500HlY3 = new EnumC450500HlY("NETWORK", 2);
        NETWORK = enumC450500HlY3;
        EnumC450500HlY enumC450500HlY4 = new EnumC450500HlY("LOADING", 3);
        LOADING = enumC450500HlY4;
        EnumC450500HlY[] enumC450500HlYArr = {enumC450500HlY, enumC450500HlY2, enumC450500HlY3, enumC450500HlY4};
        LL = enumC450500HlYArr;
        LLILLJJLI = new C2254308sP(enumC450500HlYArr);
    }

    public static EnumC450500HlY[] values() {
        return (EnumC450500HlY[]) LL.clone();
    }

    public static EnumC450500HlY valueOf(String str) {
        return (EnumC450500HlY) C08FF.LIZ(EnumC450500HlY.class, str);
    }

    public EnumC450500HlY(String str, int i) {
    }
}
