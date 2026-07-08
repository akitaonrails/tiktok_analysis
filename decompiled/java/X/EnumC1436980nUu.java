package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1436980nUu {
    public static final EnumC1436980nUu CLIENT;
    public static final /* synthetic */ EnumC1436980nUu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1436980nUu SERVER;
    public static final EnumC1436980nUu UPLOAD_SDK;
    public static final EnumC1436980nUu USER;
    public static final EnumC1436980nUu VESDK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1436980nUu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1436980nUu enumC1436980nUu = new EnumC1436980nUu("UPLOAD_SDK", 0, "upload_sdk");
        UPLOAD_SDK = enumC1436980nUu;
        EnumC1436980nUu enumC1436980nUu2 = new EnumC1436980nUu("VESDK", 1, "vesdk");
        VESDK = enumC1436980nUu2;
        EnumC1436980nUu enumC1436980nUu3 = new EnumC1436980nUu("SERVER", 2, "server");
        SERVER = enumC1436980nUu3;
        EnumC1436980nUu enumC1436980nUu4 = new EnumC1436980nUu("CLIENT", 3, "client");
        CLIENT = enumC1436980nUu4;
        EnumC1436980nUu enumC1436980nUu5 = new EnumC1436980nUu("USER", 4, "user");
        USER = enumC1436980nUu5;
        EnumC1436980nUu[] enumC1436980nUuArr = {enumC1436980nUu, enumC1436980nUu2, enumC1436980nUu3, enumC1436980nUu4, enumC1436980nUu5};
        LLILLJJLI = enumC1436980nUuArr;
        LLILLL = new C2254308sP(enumC1436980nUuArr);
    }

    public static EnumC1436980nUu[] values() {
        return (EnumC1436980nUu[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static EnumC1436980nUu valueOf(String str) {
        return (EnumC1436980nUu) C08FF.LIZ(EnumC1436980nUu.class, str);
    }

    public EnumC1436980nUu(String str, int i, String str2) {
        this.LL = str2;
    }
}
