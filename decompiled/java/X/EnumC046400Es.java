package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Es, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC046400Es {
    public static final /* synthetic */ EnumC046400Es[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC046400Es SMB_CHALLENGE_GUIDE;
    public static final EnumC046400Es SMB_CHALLENGE_HOME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC046400Es> getEntries() {
        return LLILLL;
    }

    static {
        EnumC046400Es enumC046400Es = new EnumC046400Es("SMB_CHALLENGE_GUIDE", 0, "smb_challenge_guide");
        SMB_CHALLENGE_GUIDE = enumC046400Es;
        EnumC046400Es enumC046400Es2 = new EnumC046400Es("SMB_CHALLENGE_HOME", 1, "smb_challenge_home");
        SMB_CHALLENGE_HOME = enumC046400Es2;
        EnumC046400Es[] enumC046400EsArr = {enumC046400Es, enumC046400Es2};
        LLILLJJLI = enumC046400EsArr;
        LLILLL = new C2254308sP(enumC046400EsArr);
    }

    public static EnumC046400Es[] values() {
        return (EnumC046400Es[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC046400Es valueOf(String str) {
        return (EnumC046400Es) C08FF.LIZ(EnumC046400Es.class, str);
    }

    public EnumC046400Es(String str, int i, String str2) {
        this.LL = str2;
    }
}
