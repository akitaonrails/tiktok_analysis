package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782720wUY {
    public static final EnumC1782720wUY CHANGE_LAST_READ_TIME;
    public static final EnumC1782720wUY CHANGE_UNREAD_COUNT;
    public static final EnumC1782720wUY CHANGE_UNREAD_COUNT_DECREASE;
    public static final EnumC1782720wUY CHANGE_WALL_TIME;
    public static final /* synthetic */ EnumC1782720wUY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1782720wUY NO_CHANGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1782720wUY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782720wUY enumC1782720wUY = new EnumC1782720wUY("NO_CHANGE", 0, 0);
        NO_CHANGE = enumC1782720wUY;
        EnumC1782720wUY enumC1782720wUY2 = new EnumC1782720wUY("CHANGE_WALL_TIME", 1, 1);
        CHANGE_WALL_TIME = enumC1782720wUY2;
        EnumC1782720wUY enumC1782720wUY3 = new EnumC1782720wUY("CHANGE_UNREAD_COUNT", 2, 2);
        CHANGE_UNREAD_COUNT = enumC1782720wUY3;
        EnumC1782720wUY enumC1782720wUY4 = new EnumC1782720wUY("CHANGE_LAST_READ_TIME", 3, 4);
        CHANGE_LAST_READ_TIME = enumC1782720wUY4;
        EnumC1782720wUY enumC1782720wUY5 = new EnumC1782720wUY("CHANGE_UNREAD_COUNT_DECREASE", 4, 8);
        CHANGE_UNREAD_COUNT_DECREASE = enumC1782720wUY5;
        EnumC1782720wUY[] enumC1782720wUYArr = {enumC1782720wUY, enumC1782720wUY2, enumC1782720wUY3, enumC1782720wUY4, enumC1782720wUY5};
        LLILLJJLI = enumC1782720wUYArr;
        LLILLL = new C2254308sP(enumC1782720wUYArr);
    }

    public static EnumC1782720wUY[] values() {
        return (EnumC1782720wUY[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1782720wUY valueOf(String str) {
        return (EnumC1782720wUY) C08FF.LIZ(EnumC1782720wUY.class, str);
    }

    public EnumC1782720wUY(String str, int i, int i2) {
        this.LL = i2;
    }
}
