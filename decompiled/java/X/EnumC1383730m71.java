package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m71, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1383730m71 {
    public static final EnumC1383730m71 FOLLOWING;
    public static final EnumC1383730m71 FRIENDS;
    public static final /* synthetic */ EnumC1383730m71[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1383730m71 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1383730m71> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1383730m71 enumC1383730m71 = new EnumC1383730m71("UNKNOWN", 0, 0);
        UNKNOWN = enumC1383730m71;
        EnumC1383730m71 enumC1383730m712 = new EnumC1383730m71("FOLLOWING", 1, 1);
        FOLLOWING = enumC1383730m712;
        EnumC1383730m71 enumC1383730m713 = new EnumC1383730m71("FRIENDS", 2, 2);
        FRIENDS = enumC1383730m713;
        EnumC1383730m71[] enumC1383730m71Arr = {enumC1383730m71, enumC1383730m712, enumC1383730m713};
        LLILLJJLI = enumC1383730m71Arr;
        LLILLL = new C2254308sP(enumC1383730m71Arr);
    }

    public static EnumC1383730m71[] values() {
        return (EnumC1383730m71[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1383730m71 valueOf(String str) {
        return (EnumC1383730m71) C08FF.LIZ(EnumC1383730m71.class, str);
    }

    public EnumC1383730m71(String str, int i, int i2) {
        this.LL = i2;
    }
}
