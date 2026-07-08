package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ue3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC777090Ue3 {
    public static final EnumC777090Ue3 First2Min;
    public static final EnumC777090Ue3 FirstComment;
    public static final /* synthetic */ EnumC777090Ue3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC777090Ue3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC777090Ue3 enumC777090Ue3 = new EnumC777090Ue3("First2Min", 0, "first_2min");
        First2Min = enumC777090Ue3;
        EnumC777090Ue3 enumC777090Ue32 = new EnumC777090Ue3("FirstComment", 1, "first_comment");
        FirstComment = enumC777090Ue32;
        EnumC777090Ue3[] enumC777090Ue3Arr = {enumC777090Ue3, enumC777090Ue32};
        LLILLJJLI = enumC777090Ue3Arr;
        LLILLL = new C2254308sP(enumC777090Ue3Arr);
    }

    public static EnumC777090Ue3[] values() {
        return (EnumC777090Ue3[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC777090Ue3 valueOf(String str) {
        return (EnumC777090Ue3) C08FF.LIZ(EnumC777090Ue3.class, str);
    }

    public EnumC777090Ue3(String str, int i, String str2) {
        this.LL = str2;
    }
}
