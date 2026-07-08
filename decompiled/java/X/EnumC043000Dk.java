package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Dk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC043000Dk {
    public static final EnumC043000Dk DELETE_DRAFT;
    public static final EnumC043000Dk LEAVE_DRAFT;
    public static final /* synthetic */ EnumC043000Dk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC043000Dk POST_DRAFT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC043000Dk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC043000Dk enumC043000Dk = new EnumC043000Dk("POST_DRAFT", 0, "post_draft");
        POST_DRAFT = enumC043000Dk;
        EnumC043000Dk enumC043000Dk2 = new EnumC043000Dk("DELETE_DRAFT", 1, "delete_draft");
        DELETE_DRAFT = enumC043000Dk2;
        EnumC043000Dk enumC043000Dk3 = new EnumC043000Dk("LEAVE_DRAFT", 2, "leave_draft");
        LEAVE_DRAFT = enumC043000Dk3;
        EnumC043000Dk[] enumC043000DkArr = {enumC043000Dk, enumC043000Dk2, enumC043000Dk3};
        LLILLJJLI = enumC043000DkArr;
        LLILLL = new C2254308sP(enumC043000DkArr);
    }

    public static EnumC043000Dk[] values() {
        return (EnumC043000Dk[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC043000Dk valueOf(String str) {
        return (EnumC043000Dk) C08FF.LIZ(EnumC043000Dk.class, str);
    }

    public EnumC043000Dk(String str, int i, String str2) {
        this.LL = str2;
    }
}
