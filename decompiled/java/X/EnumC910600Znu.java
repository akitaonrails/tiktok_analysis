package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Znu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC910600Znu {
    public static final EnumC910600Znu GROUP_OWNER;
    public static final /* synthetic */ EnumC910600Znu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC910600Znu MENTION;
    public static final EnumC910600Znu MESSAGE;
    public static final EnumC910600Znu REACTION;

    public static InterfaceC2044707zh<EnumC910600Znu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC910600Znu enumC910600Znu = new EnumC910600Znu("MESSAGE", 0);
        MESSAGE = enumC910600Znu;
        EnumC910600Znu enumC910600Znu2 = new EnumC910600Znu("REACTION", 1);
        REACTION = enumC910600Znu2;
        EnumC910600Znu enumC910600Znu3 = new EnumC910600Znu("MENTION", 2);
        MENTION = enumC910600Znu3;
        EnumC910600Znu enumC910600Znu4 = new EnumC910600Znu("GROUP_OWNER", 3);
        GROUP_OWNER = enumC910600Znu4;
        EnumC910600Znu[] enumC910600ZnuArr = {enumC910600Znu, enumC910600Znu2, enumC910600Znu3, enumC910600Znu4};
        LL = enumC910600ZnuArr;
        LLILLJJLI = new C2254308sP(enumC910600ZnuArr);
    }

    public static EnumC910600Znu[] values() {
        return (EnumC910600Znu[]) LL.clone();
    }

    public final String toMobValue() {
        int i = C910610Znv.LIZ[ordinal()];
        return i != 1 ? i != 2 ? "notice_number" : "group_owner" : "mention_at";
    }

    public static EnumC910600Znu valueOf(String str) {
        return (EnumC910600Znu) C08FF.LIZ(EnumC910600Znu.class, str);
    }

    public EnumC910600Znu(String str, int i) {
    }
}
