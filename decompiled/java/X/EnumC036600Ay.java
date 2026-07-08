package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC036600Ay {
    public static final /* synthetic */ EnumC036600Ay[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC036600Ay SEARCH_MANAGE_PERSONALIZED;

    public static InterfaceC2044707zh<EnumC036600Ay> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC036600Ay enumC036600Ay = new EnumC036600Ay();
        SEARCH_MANAGE_PERSONALIZED = enumC036600Ay;
        EnumC036600Ay[] enumC036600AyArr = {enumC036600Ay};
        LL = enumC036600AyArr;
        LLILLJJLI = new C2254308sP(enumC036600AyArr);
    }

    public static EnumC036600Ay[] values() {
        return (EnumC036600Ay[]) LL.clone();
    }

    public static EnumC036600Ay valueOf(String str) {
        return (EnumC036600Ay) C08FF.LIZ(EnumC036600Ay.class, str);
    }
}
