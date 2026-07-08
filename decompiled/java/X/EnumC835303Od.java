package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Od, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC835303Od {
    public static final EnumC835303Od CONFIRMED;
    public static final /* synthetic */ EnumC835303Od[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC835303Od UNCONFIRMED;
    public static final EnumC835303Od UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC835303Od> getEntries() {
        return LLILLL;
    }

    static {
        EnumC835303Od enumC835303Od = new EnumC835303Od("UNKNOWN", 0, 0);
        UNKNOWN = enumC835303Od;
        EnumC835303Od enumC835303Od2 = new EnumC835303Od("UNCONFIRMED", 1, 1);
        UNCONFIRMED = enumC835303Od2;
        EnumC835303Od enumC835303Od3 = new EnumC835303Od("CONFIRMED", 2, 2);
        CONFIRMED = enumC835303Od3;
        EnumC835303Od[] enumC835303OdArr = {enumC835303Od, enumC835303Od2, enumC835303Od3};
        LLILLJJLI = enumC835303OdArr;
        LLILLL = new C2254308sP(enumC835303OdArr);
    }

    public static EnumC835303Od[] values() {
        return (EnumC835303Od[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC835303Od valueOf(String str) {
        return (EnumC835303Od) C08FF.LIZ(EnumC835303Od.class, str);
    }

    public EnumC835303Od(String str, int i, int i2) {
        this.LL = i2;
    }
}
