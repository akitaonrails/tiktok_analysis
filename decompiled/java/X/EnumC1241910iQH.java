package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iQH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1241910iQH {
    public static final EnumC1241910iQH ALL;
    public static final EnumC1241910iQH COMMENTS;
    public static final EnumC1241910iQH CONTACT;
    public static final /* synthetic */ EnumC1241910iQH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1241910iQH MENTIONS;
    public static final EnumC1241910iQH MESSAGE;
    public static final EnumC1241910iQH OTHERS;

    public static InterfaceC2044707zh<EnumC1241910iQH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1241910iQH enumC1241910iQH = new EnumC1241910iQH("ALL", 0);
        ALL = enumC1241910iQH;
        EnumC1241910iQH enumC1241910iQH2 = new EnumC1241910iQH("CONTACT", 1);
        CONTACT = enumC1241910iQH2;
        EnumC1241910iQH enumC1241910iQH3 = new EnumC1241910iQH("MESSAGE", 2);
        MESSAGE = enumC1241910iQH3;
        EnumC1241910iQH enumC1241910iQH4 = new EnumC1241910iQH("COMMENTS", 3);
        COMMENTS = enumC1241910iQH4;
        EnumC1241910iQH enumC1241910iQH5 = new EnumC1241910iQH("MENTIONS", 4);
        MENTIONS = enumC1241910iQH5;
        EnumC1241910iQH enumC1241910iQH6 = new EnumC1241910iQH("OTHERS", 5);
        OTHERS = enumC1241910iQH6;
        EnumC1241910iQH[] enumC1241910iQHArr = {enumC1241910iQH, enumC1241910iQH2, enumC1241910iQH3, enumC1241910iQH4, enumC1241910iQH5, enumC1241910iQH6};
        LL = enumC1241910iQHArr;
        LLILLJJLI = new C2254308sP(enumC1241910iQHArr);
    }

    public static EnumC1241910iQH[] values() {
        return (EnumC1241910iQH[]) LL.clone();
    }

    public static EnumC1241910iQH valueOf(String str) {
        return (EnumC1241910iQH) C08FF.LIZ(EnumC1241910iQH.class, str);
    }

    public EnumC1241910iQH(String str, int i) {
    }
}
