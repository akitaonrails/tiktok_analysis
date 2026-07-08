package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Oai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC622140Oai {
    public static final /* synthetic */ EnumC622140Oai[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC622140Oai PUBLISH_USER;
    public static final EnumC622140Oai USER_ID;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC622140Oai> getEntries() {
        return LLILZ;
    }

    static {
        EnumC622140Oai enumC622140Oai = new EnumC622140Oai("USER_ID", 0, "user_id", "TEXT PRIMARY KEY");
        USER_ID = enumC622140Oai;
        EnumC622140Oai enumC622140Oai2 = new EnumC622140Oai("PUBLISH_USER", 1, "publish_user", "TEXT");
        PUBLISH_USER = enumC622140Oai2;
        EnumC622140Oai[] enumC622140OaiArr = {enumC622140Oai, enumC622140Oai2};
        LLILLL = enumC622140OaiArr;
        LLILZ = new C2254308sP(enumC622140OaiArr);
    }

    public static EnumC622140Oai[] values() {
        return (EnumC622140Oai[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static EnumC622140Oai valueOf(String str) {
        return (EnumC622140Oai) C08FF.LIZ(EnumC622140Oai.class, str);
    }

    public EnumC622140Oai(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
