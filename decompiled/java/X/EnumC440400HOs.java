package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HOs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC440400HOs {
    public static final EnumC440400HOs FAIL_FAVORITE;
    public static final EnumC440400HOs FAIL_SEND;
    public static final /* synthetic */ EnumC440400HOs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC440400HOs UPDATE_VISIBILITY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC440400HOs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC440400HOs enumC440400HOs = new EnumC440400HOs("FAIL_SEND", 0, "fail_send");
        FAIL_SEND = enumC440400HOs;
        EnumC440400HOs enumC440400HOs2 = new EnumC440400HOs("UPDATE_VISIBILITY", 1, "update_visibility");
        UPDATE_VISIBILITY = enumC440400HOs2;
        EnumC440400HOs enumC440400HOs3 = new EnumC440400HOs("FAIL_FAVORITE", 2, "fail_favorite");
        FAIL_FAVORITE = enumC440400HOs3;
        EnumC440400HOs[] enumC440400HOsArr = {enumC440400HOs, enumC440400HOs2, enumC440400HOs3};
        LLILLJJLI = enumC440400HOsArr;
        LLILLL = new C2254308sP(enumC440400HOsArr);
    }

    public static EnumC440400HOs[] values() {
        return (EnumC440400HOs[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC440400HOs valueOf(String str) {
        return (EnumC440400HOs) C08FF.LIZ(EnumC440400HOs.class, str);
    }

    public EnumC440400HOs(String str, int i, String str2) {
        this.LL = str2;
    }
}
