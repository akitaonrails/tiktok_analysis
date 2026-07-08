package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1246000iWs {
    public static final EnumC1246000iWs CLICK_ITEM;
    public static final EnumC1246000iWs CLICK_MESSAGE;
    public static final EnumC1246000iWs ENTER_PROFILE;
    public static final EnumC1246000iWs FOLLOW;
    public static final /* synthetic */ EnumC1246000iWs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1246000iWs SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1246000iWs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1246000iWs enumC1246000iWs = new EnumC1246000iWs("SHOW", 0, "show");
        SHOW = enumC1246000iWs;
        EnumC1246000iWs enumC1246000iWs2 = new EnumC1246000iWs("FOLLOW", 1, "follow");
        FOLLOW = enumC1246000iWs2;
        EnumC1246000iWs enumC1246000iWs3 = new EnumC1246000iWs("ENTER_PROFILE", 2, "enter_profile");
        ENTER_PROFILE = enumC1246000iWs3;
        EnumC1246000iWs enumC1246000iWs4 = new EnumC1246000iWs("CLICK_ITEM", 3, "click_item");
        CLICK_ITEM = enumC1246000iWs4;
        EnumC1246000iWs enumC1246000iWs5 = new EnumC1246000iWs("CLICK_MESSAGE", 4, "click_message");
        CLICK_MESSAGE = enumC1246000iWs5;
        EnumC1246000iWs[] enumC1246000iWsArr = {enumC1246000iWs, enumC1246000iWs2, enumC1246000iWs3, enumC1246000iWs4, enumC1246000iWs5};
        LLILLJJLI = enumC1246000iWsArr;
        LLILLL = new C2254308sP(enumC1246000iWsArr);
    }

    public static EnumC1246000iWs[] values() {
        return (EnumC1246000iWs[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static EnumC1246000iWs valueOf(String str) {
        return (EnumC1246000iWs) C08FF.LIZ(EnumC1246000iWs.class, str);
    }

    public EnumC1246000iWs(String str, int i, String str2) {
        this.LL = str2;
    }
}
