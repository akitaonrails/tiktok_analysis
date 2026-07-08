package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1615580s8y {
    public static final EnumC1615580s8y FIXED_WIDTH;
    public static final EnumC1615580s8y HUG_CONTENT;
    public static final /* synthetic */ EnumC1615580s8y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1615580s8y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1615580s8y enumC1615580s8y = new EnumC1615580s8y("HUG_CONTENT", 0);
        HUG_CONTENT = enumC1615580s8y;
        EnumC1615580s8y enumC1615580s8y2 = new EnumC1615580s8y("FIXED_WIDTH", 1);
        FIXED_WIDTH = enumC1615580s8y2;
        EnumC1615580s8y[] enumC1615580s8yArr = {enumC1615580s8y, enumC1615580s8y2};
        LL = enumC1615580s8yArr;
        LLILLJJLI = new C2254308sP(enumC1615580s8yArr);
    }

    public static EnumC1615580s8y[] values() {
        return (EnumC1615580s8y[]) LL.clone();
    }

    public static EnumC1615580s8y valueOf(String str) {
        return (EnumC1615580s8y) C08FF.LIZ(EnumC1615580s8y.class, str);
    }

    public EnumC1615580s8y(String str, int i) {
    }
}
