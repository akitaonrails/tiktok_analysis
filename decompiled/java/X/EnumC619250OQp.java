package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC619250OQp {
    public static final EnumC619250OQp COMPLETE;
    public static final EnumC619250OQp FAKE_WRITE;
    public static final /* synthetic */ EnumC619250OQp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC619250OQp POST;
    public static final EnumC619250OQp QUICK_POST;
    public final String LL;

    public static InterfaceC2044707zh<EnumC619250OQp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC619250OQp enumC619250OQp = new EnumC619250OQp("POST", 0, "post");
        POST = enumC619250OQp;
        EnumC619250OQp enumC619250OQp2 = new EnumC619250OQp("QUICK_POST", 1, "quick_post");
        QUICK_POST = enumC619250OQp2;
        EnumC619250OQp enumC619250OQp3 = new EnumC619250OQp("FAKE_WRITE", 2, "didSendFakeBulletin");
        FAKE_WRITE = enumC619250OQp3;
        EnumC619250OQp enumC619250OQp4 = new EnumC619250OQp("COMPLETE", 3, "sendBulletinComplete");
        COMPLETE = enumC619250OQp4;
        EnumC619250OQp[] enumC619250OQpArr = {enumC619250OQp, enumC619250OQp2, enumC619250OQp3, enumC619250OQp4};
        LLILLJJLI = enumC619250OQpArr;
        LLILLL = new C2254308sP(enumC619250OQpArr);
    }

    public static EnumC619250OQp[] values() {
        return (EnumC619250OQp[]) LLILLJJLI.clone();
    }

    public final String getEvent() {
        return this.LL;
    }

    public static EnumC619250OQp valueOf(String str) {
        return (EnumC619250OQp) C08FF.LIZ(EnumC619250OQp.class, str);
    }

    public EnumC619250OQp(String str, int i, String str2) {
        this.LL = str2;
    }
}
