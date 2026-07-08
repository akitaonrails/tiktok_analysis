package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bSo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC974400bSo {
    public static final EnumC974400bSo FE_COMBO_UPDATE;
    public static final EnumC974400bSo FE_DOWNLOAD_AVATAR;
    public static final EnumC974400bSo FE_GAME_READY;
    public static final /* synthetic */ EnumC974400bSo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC974400bSo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC974400bSo enumC974400bSo = new EnumC974400bSo("FE_GAME_READY", 0, "game_ready");
        FE_GAME_READY = enumC974400bSo;
        EnumC974400bSo enumC974400bSo2 = new EnumC974400bSo("FE_COMBO_UPDATE", 1, "combo_update");
        FE_COMBO_UPDATE = enumC974400bSo2;
        EnumC974400bSo enumC974400bSo3 = new EnumC974400bSo("FE_DOWNLOAD_AVATAR", 2, "download_avatar");
        FE_DOWNLOAD_AVATAR = enumC974400bSo3;
        EnumC974400bSo[] enumC974400bSoArr = {enumC974400bSo, enumC974400bSo2, enumC974400bSo3};
        LLILLJJLI = enumC974400bSoArr;
        LLILLL = new C2254308sP(enumC974400bSoArr);
    }

    public static EnumC974400bSo[] values() {
        return (EnumC974400bSo[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC974400bSo valueOf(String str) {
        return (EnumC974400bSo) C08FF.LIZ(EnumC974400bSo.class, str);
    }

    public EnumC974400bSo(String str, int i, String str2) {
        this.LL = str2;
    }
}
