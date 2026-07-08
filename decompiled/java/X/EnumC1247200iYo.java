package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1247200iYo {
    public static final EnumC1247200iYo FANS;
    public static final EnumC1247200iYo FOLLOWING;
    public static final /* synthetic */ EnumC1247200iYo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1247200iYo OTHER_FANS;
    public static final EnumC1247200iYo OTHER_FOLLOWING;
    public static final EnumC1247200iYo SCHOOL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1247200iYo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1247200iYo enumC1247200iYo = new EnumC1247200iYo("FANS", 0, "fans");
        FANS = enumC1247200iYo;
        EnumC1247200iYo enumC1247200iYo2 = new EnumC1247200iYo("OTHER_FANS", 1, "other_fans");
        OTHER_FANS = enumC1247200iYo2;
        EnumC1247200iYo enumC1247200iYo3 = new EnumC1247200iYo("FOLLOWING", 2, "following_list");
        FOLLOWING = enumC1247200iYo3;
        EnumC1247200iYo enumC1247200iYo4 = new EnumC1247200iYo("OTHER_FOLLOWING", 3, "other_following");
        OTHER_FOLLOWING = enumC1247200iYo4;
        EnumC1247200iYo enumC1247200iYo5 = new EnumC1247200iYo("SCHOOL", 4, "school");
        SCHOOL = enumC1247200iYo5;
        EnumC1247200iYo[] enumC1247200iYoArr = {enumC1247200iYo, enumC1247200iYo2, enumC1247200iYo3, enumC1247200iYo4, enumC1247200iYo5};
        LLILLJJLI = enumC1247200iYoArr;
        LLILLL = new C2254308sP(enumC1247200iYoArr);
    }

    public static EnumC1247200iYo[] values() {
        return (EnumC1247200iYo[]) LLILLJJLI.clone();
    }

    public final String getMobString() {
        return this.LL;
    }

    public static EnumC1247200iYo valueOf(String str) {
        return (EnumC1247200iYo) C08FF.LIZ(EnumC1247200iYo.class, str);
    }

    public EnumC1247200iYo(String str, int i, String str2) {
        this.LL = str2;
    }
}
