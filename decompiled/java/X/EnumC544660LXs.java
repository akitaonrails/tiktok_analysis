package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC544660LXs {
    public static final EnumC544660LXs EXCEED_LIMIT;
    public static final EnumC544660LXs LAST_TIME;
    public static final /* synthetic */ EnumC544660LXs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC544660LXs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC544660LXs enumC544660LXs = new EnumC544660LXs("LAST_TIME", 0, "last_time");
        LAST_TIME = enumC544660LXs;
        EnumC544660LXs enumC544660LXs2 = new EnumC544660LXs("EXCEED_LIMIT", 1, "exceed_limit");
        EXCEED_LIMIT = enumC544660LXs2;
        EnumC544660LXs[] enumC544660LXsArr = {enumC544660LXs, enumC544660LXs2};
        LLILLJJLI = enumC544660LXsArr;
        LLILLL = new C2254308sP(enumC544660LXsArr);
    }

    public static EnumC544660LXs[] values() {
        return (EnumC544660LXs[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC544660LXs valueOf(String str) {
        return (EnumC544660LXs) C08FF.LIZ(EnumC544660LXs.class, str);
    }

    public EnumC544660LXs(String str, int i, String str2) {
        this.LL = str2;
    }
}
