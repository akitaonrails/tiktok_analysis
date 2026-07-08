package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06gd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1671706gd {
    public static final EnumC1671706gd EVERYONE;
    public static final EnumC1671706gd FRIENDS;
    public static final /* synthetic */ EnumC1671706gd[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1671706gd NO_ONE;
    public static final EnumC1671706gd SUGGESTED_FRIENDS;
    public static final EnumC1671706gd UNKNOWN;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1671706gd> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1671706gd enumC1671706gd = new EnumC1671706gd("UNKNOWN", 0, "Unknown", -1);
        UNKNOWN = enumC1671706gd;
        EnumC1671706gd enumC1671706gd2 = new EnumC1671706gd("EVERYONE", 1, "Everyone", 0);
        EVERYONE = enumC1671706gd2;
        EnumC1671706gd enumC1671706gd3 = new EnumC1671706gd("SUGGESTED_FRIENDS", 2, "Suggested_friends", 1);
        SUGGESTED_FRIENDS = enumC1671706gd3;
        EnumC1671706gd enumC1671706gd4 = new EnumC1671706gd("FRIENDS", 3, "Friends", 2);
        FRIENDS = enumC1671706gd4;
        EnumC1671706gd enumC1671706gd5 = new EnumC1671706gd("NO_ONE", 4, "No_one", 3);
        NO_ONE = enumC1671706gd5;
        EnumC1671706gd[] enumC1671706gdArr = {enumC1671706gd, enumC1671706gd2, enumC1671706gd3, enumC1671706gd4, enumC1671706gd5};
        LLILLL = enumC1671706gdArr;
        LLILZ = new C2254308sP(enumC1671706gdArr);
    }

    public static EnumC1671706gd[] values() {
        return (EnumC1671706gd[]) LLILLL.clone();
    }

    public final int getEventTrackingInt() {
        return this.LLILLJJLI;
    }

    public final String getEventTrackingString() {
        return this.LL;
    }

    public static EnumC1671706gd valueOf(String str) {
        return (EnumC1671706gd) C08FF.LIZ(EnumC1671706gd.class, str);
    }

    public EnumC1671706gd(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
