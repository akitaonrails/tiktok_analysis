package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC035600Ao {
    public static final EnumC035600Ao LARGE_HEADER;
    public static final /* synthetic */ EnumC035600Ao[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC035600Ao SMALL_SQUARE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC035600Ao> getEntries() {
        return LLILLL;
    }

    static {
        EnumC035600Ao enumC035600Ao = new EnumC035600Ao("SMALL_SQUARE", 0, 0);
        SMALL_SQUARE = enumC035600Ao;
        EnumC035600Ao enumC035600Ao2 = new EnumC035600Ao("LARGE_HEADER", 1, 1);
        LARGE_HEADER = enumC035600Ao2;
        EnumC035600Ao[] enumC035600AoArr = {enumC035600Ao, enumC035600Ao2};
        LLILLJJLI = enumC035600AoArr;
        LLILLL = new C2254308sP(enumC035600AoArr);
    }

    public static EnumC035600Ao[] values() {
        return (EnumC035600Ao[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC035600Ao valueOf(String str) {
        return (EnumC035600Ao) C08FF.LIZ(EnumC035600Ao.class, str);
    }

    public EnumC035600Ao(String str, int i, int i2) {
        this.LL = i2;
    }
}
