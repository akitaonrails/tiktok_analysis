package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC313670CRh {
    public static final /* synthetic */ EnumC313670CRh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC313670CRh PRELOAD_PUBLISH_LANDING;
    public static final EnumC313670CRh PRELOAD_STORY_BOOT;
    public static final EnumC313670CRh USER_INTERACTION;

    public static InterfaceC2044707zh<EnumC313670CRh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC313670CRh enumC313670CRh = new EnumC313670CRh("USER_INTERACTION", 0);
        USER_INTERACTION = enumC313670CRh;
        EnumC313670CRh enumC313670CRh2 = new EnumC313670CRh("PRELOAD_STORY_BOOT", 1);
        PRELOAD_STORY_BOOT = enumC313670CRh2;
        EnumC313670CRh enumC313670CRh3 = new EnumC313670CRh("PRELOAD_PUBLISH_LANDING", 2);
        PRELOAD_PUBLISH_LANDING = enumC313670CRh3;
        EnumC313670CRh[] enumC313670CRhArr = {enumC313670CRh, enumC313670CRh2, enumC313670CRh3};
        LL = enumC313670CRhArr;
        LLILLJJLI = new C2254308sP(enumC313670CRhArr);
    }

    public static EnumC313670CRh[] values() {
        return (EnumC313670CRh[]) LL.clone();
    }

    public static EnumC313670CRh valueOf(String str) {
        return (EnumC313670CRh) C08FF.LIZ(EnumC313670CRh.class, str);
    }

    public EnumC313670CRh(String str, int i) {
    }
}
