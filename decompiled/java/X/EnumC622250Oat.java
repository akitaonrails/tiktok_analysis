package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Oat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC622250Oat {
    public static final EnumC622250Oat DB_SCENE_FAIL;
    public static final EnumC622250Oat DB_SCENE_SUCCESS;
    public static final EnumC622250Oat DB_SCENE_UNKNOWN;
    public static final /* synthetic */ EnumC622250Oat[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC622250Oat> getEntries() {
        return LLILLL;
    }

    static {
        EnumC622250Oat enumC622250Oat = new EnumC622250Oat("DB_SCENE_UNKNOWN", 0, 0);
        DB_SCENE_UNKNOWN = enumC622250Oat;
        EnumC622250Oat enumC622250Oat2 = new EnumC622250Oat("DB_SCENE_SUCCESS", 1, 1);
        DB_SCENE_SUCCESS = enumC622250Oat2;
        EnumC622250Oat enumC622250Oat3 = new EnumC622250Oat("DB_SCENE_FAIL", 2, -1);
        DB_SCENE_FAIL = enumC622250Oat3;
        EnumC622250Oat[] enumC622250OatArr = {enumC622250Oat, enumC622250Oat2, enumC622250Oat3};
        LLILLJJLI = enumC622250OatArr;
        LLILLL = new C2254308sP(enumC622250OatArr);
    }

    public static EnumC622250Oat[] values() {
        return (EnumC622250Oat[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC622250Oat valueOf(String str) {
        return (EnumC622250Oat) C08FF.LIZ(EnumC622250Oat.class, str);
    }

    public EnumC622250Oat(String str, int i, int i2) {
        this.LL = i2;
    }
}
