package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NsM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC607600NsM {
    public static final EnumC607600NsM FOLLOWEE_INNER_FEED;
    public static final EnumC607600NsM HOMEPAGE_FOLLOW;
    public static final /* synthetic */ EnumC607600NsM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC607600NsM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC607600NsM enumC607600NsM = new EnumC607600NsM("HOMEPAGE_FOLLOW", 0, "homepage_follow");
        HOMEPAGE_FOLLOW = enumC607600NsM;
        EnumC607600NsM enumC607600NsM2 = new EnumC607600NsM("FOLLOWEE_INNER_FEED", 1, "followee_inner_feed");
        FOLLOWEE_INNER_FEED = enumC607600NsM2;
        EnumC607600NsM[] enumC607600NsMArr = {enumC607600NsM, enumC607600NsM2};
        LLILLJJLI = enumC607600NsMArr;
        LLILLL = new C2254308sP(enumC607600NsMArr);
    }

    public static EnumC607600NsM[] values() {
        return (EnumC607600NsM[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC607600NsM valueOf(String str) {
        return (EnumC607600NsM) C08FF.LIZ(EnumC607600NsM.class, str);
    }

    public EnumC607600NsM(String str, int i, String str2) {
        this.LL = str2;
    }
}
