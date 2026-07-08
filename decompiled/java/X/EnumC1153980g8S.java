package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153980g8S {
    public static final /* synthetic */ EnumC1153980g8S[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1153980g8S NUJ_SCENE_DEFAULT;
    public static final EnumC1153980g8S NUJ_SCENE_NEW_USER;
    public static final EnumC1153980g8S NUJ_SCENE_NEW_USER_CONFIG;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1153980g8S> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1153980g8S enumC1153980g8S = new EnumC1153980g8S("NUJ_SCENE_NEW_USER", 0, "new_user_journey");
        NUJ_SCENE_NEW_USER = enumC1153980g8S;
        EnumC1153980g8S enumC1153980g8S2 = new EnumC1153980g8S("NUJ_SCENE_NEW_USER_CONFIG", 1, "new_user_config");
        NUJ_SCENE_NEW_USER_CONFIG = enumC1153980g8S2;
        EnumC1153980g8S enumC1153980g8S3 = new EnumC1153980g8S("NUJ_SCENE_DEFAULT", 2, "default_journey");
        NUJ_SCENE_DEFAULT = enumC1153980g8S3;
        EnumC1153980g8S[] enumC1153980g8SArr = {enumC1153980g8S, enumC1153980g8S2, enumC1153980g8S3};
        LLILLJJLI = enumC1153980g8SArr;
        LLILLL = new C2254308sP(enumC1153980g8SArr);
    }

    public static EnumC1153980g8S[] values() {
        return (EnumC1153980g8S[]) LLILLJJLI.clone();
    }

    public final String getId() {
        return this.LL;
    }

    public static EnumC1153980g8S valueOf(String str) {
        return (EnumC1153980g8S) C08FF.LIZ(EnumC1153980g8S.class, str);
    }

    public EnumC1153980g8S(String str, int i, String str2) {
        this.LL = str2;
    }
}
