package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC035200Ak {
    public static final /* synthetic */ EnumC035200Ak[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC035200Ak NO_NEED_CORRECT;
    public static final EnumC035200Ak STRONG_CORRECT;
    public static final EnumC035200Ak WEAK_CORRECT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC035200Ak> getEntries() {
        return LLILLL;
    }

    static {
        EnumC035200Ak enumC035200Ak = new EnumC035200Ak("NO_NEED_CORRECT", 0, 0);
        NO_NEED_CORRECT = enumC035200Ak;
        EnumC035200Ak enumC035200Ak2 = new EnumC035200Ak("WEAK_CORRECT", 1, 1);
        WEAK_CORRECT = enumC035200Ak2;
        EnumC035200Ak enumC035200Ak3 = new EnumC035200Ak("STRONG_CORRECT", 2, 2);
        STRONG_CORRECT = enumC035200Ak3;
        EnumC035200Ak[] enumC035200AkArr = {enumC035200Ak, enumC035200Ak2, enumC035200Ak3};
        LLILLJJLI = enumC035200AkArr;
        LLILLL = new C2254308sP(enumC035200AkArr);
    }

    public static EnumC035200Ak[] values() {
        return (EnumC035200Ak[]) LLILLJJLI.clone();
    }

    public final int getLevel() {
        return this.LL;
    }

    public static EnumC035200Ak valueOf(String str) {
        return (EnumC035200Ak) C08FF.LIZ(EnumC035200Ak.class, str);
    }

    public EnumC035200Ak(String str, int i, int i2) {
        this.LL = i2;
    }
}
