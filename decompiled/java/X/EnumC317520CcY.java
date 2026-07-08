package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CcY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC317520CcY {
    public static final EnumC317520CcY ALL;
    public static final EnumC317520CcY FOLLOW;
    public static final EnumC317520CcY FRIEND;
    public static final /* synthetic */ EnumC317520CcY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC317520CcY RECENT;

    public static InterfaceC2044707zh<EnumC317520CcY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC317520CcY enumC317520CcY = new EnumC317520CcY("RECENT", 0);
        RECENT = enumC317520CcY;
        EnumC317520CcY enumC317520CcY2 = new EnumC317520CcY("FRIEND", 1);
        FRIEND = enumC317520CcY2;
        EnumC317520CcY enumC317520CcY3 = new EnumC317520CcY("FOLLOW", 2);
        FOLLOW = enumC317520CcY3;
        EnumC317520CcY enumC317520CcY4 = new EnumC317520CcY("ALL", 3);
        ALL = enumC317520CcY4;
        EnumC317520CcY[] enumC317520CcYArr = {enumC317520CcY, enumC317520CcY2, enumC317520CcY3, enumC317520CcY4};
        LL = enumC317520CcYArr;
        LLILLJJLI = new C2254308sP(enumC317520CcYArr);
    }

    public static EnumC317520CcY[] values() {
        return (EnumC317520CcY[]) LL.clone();
    }

    public static EnumC317520CcY valueOf(String str) {
        return (EnumC317520CcY) C08FF.LIZ(EnumC317520CcY.class, str);
    }

    public EnumC317520CcY(String str, int i) {
    }
}
