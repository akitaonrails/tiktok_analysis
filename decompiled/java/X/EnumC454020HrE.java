package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HrE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC454020HrE {
    public static final /* synthetic */ EnumC454020HrE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC454020HrE MEMORY_COMMENT_AND_DM;
    public static final EnumC454020HrE ONLY_COMMENT;
    public static final EnumC454020HrE PIN_EMOJI;
    public final int LL;

    public static InterfaceC2044707zh<EnumC454020HrE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC454020HrE enumC454020HrE = new EnumC454020HrE("PIN_EMOJI", 0, 0);
        PIN_EMOJI = enumC454020HrE;
        EnumC454020HrE enumC454020HrE2 = new EnumC454020HrE("ONLY_COMMENT", 1, 1);
        ONLY_COMMENT = enumC454020HrE2;
        EnumC454020HrE enumC454020HrE3 = new EnumC454020HrE("MEMORY_COMMENT_AND_DM", 2, 2);
        MEMORY_COMMENT_AND_DM = enumC454020HrE3;
        EnumC454020HrE[] enumC454020HrEArr = {enumC454020HrE, enumC454020HrE2, enumC454020HrE3};
        LLILLJJLI = enumC454020HrEArr;
        LLILLL = new C2254308sP(enumC454020HrEArr);
    }

    public static EnumC454020HrE[] values() {
        return (EnumC454020HrE[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC454020HrE valueOf(String str) {
        return (EnumC454020HrE) C08FF.LIZ(EnumC454020HrE.class, str);
    }

    public EnumC454020HrE(String str, int i, int i2) {
        this.LL = i2;
    }
}
