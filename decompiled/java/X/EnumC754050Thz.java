package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Thz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC754050Thz {
    public static final /* synthetic */ EnumC754050Thz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC754050Thz PRIMARY;
    public static final EnumC754050Thz SECONDARY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC754050Thz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC754050Thz enumC754050Thz = new EnumC754050Thz("PRIMARY", 0, 1);
        PRIMARY = enumC754050Thz;
        EnumC754050Thz enumC754050Thz2 = new EnumC754050Thz("SECONDARY", 1, 2);
        SECONDARY = enumC754050Thz2;
        EnumC754050Thz[] enumC754050ThzArr = {enumC754050Thz, enumC754050Thz2};
        LLILLJJLI = enumC754050ThzArr;
        LLILLL = new C2254308sP(enumC754050ThzArr);
    }

    public static EnumC754050Thz[] values() {
        return (EnumC754050Thz[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC754050Thz valueOf(String str) {
        return (EnumC754050Thz) C08FF.LIZ(EnumC754050Thz.class, str);
    }

    public EnumC754050Thz(String str, int i, int i2) {
        this.LL = i2;
    }
}
