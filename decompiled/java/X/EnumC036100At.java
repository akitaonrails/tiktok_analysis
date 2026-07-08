package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00At, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC036100At {
    public static final EnumC036100At GRAY_BOX;
    public static final /* synthetic */ EnumC036100At[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC036100At RED_TEXT_LINK;
    public final int LL;

    public static InterfaceC2044707zh<EnumC036100At> getEntries() {
        return LLILLL;
    }

    static {
        EnumC036100At enumC036100At = new EnumC036100At("GRAY_BOX", 0, 0);
        GRAY_BOX = enumC036100At;
        EnumC036100At enumC036100At2 = new EnumC036100At("RED_TEXT_LINK", 1, 1);
        RED_TEXT_LINK = enumC036100At2;
        EnumC036100At[] enumC036100AtArr = {enumC036100At, enumC036100At2};
        LLILLJJLI = enumC036100AtArr;
        LLILLL = new C2254308sP(enumC036100AtArr);
    }

    public static EnumC036100At[] values() {
        return (EnumC036100At[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC036100At valueOf(String str) {
        return (EnumC036100At) C08FF.LIZ(EnumC036100At.class, str);
    }

    public EnumC036100At(String str, int i, int i2) {
        this.LL = i2;
    }
}
