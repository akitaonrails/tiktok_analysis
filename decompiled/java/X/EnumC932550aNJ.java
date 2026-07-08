package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aNJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC932550aNJ {
    public static final /* synthetic */ EnumC932550aNJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC932550aNJ V1;
    public static final EnumC932550aNJ V2;
    public static final EnumC932550aNJ V3;
    public static final EnumC932550aNJ V4;

    public static InterfaceC2044707zh<EnumC932550aNJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC932550aNJ enumC932550aNJ = new EnumC932550aNJ("V1", 0);
        V1 = enumC932550aNJ;
        EnumC932550aNJ enumC932550aNJ2 = new EnumC932550aNJ("V2", 1);
        V2 = enumC932550aNJ2;
        EnumC932550aNJ enumC932550aNJ3 = new EnumC932550aNJ("V3", 2);
        V3 = enumC932550aNJ3;
        EnumC932550aNJ enumC932550aNJ4 = new EnumC932550aNJ("V4", 3);
        V4 = enumC932550aNJ4;
        EnumC932550aNJ[] enumC932550aNJArr = {enumC932550aNJ, enumC932550aNJ2, enumC932550aNJ3, enumC932550aNJ4};
        LL = enumC932550aNJArr;
        LLILLJJLI = new C2254308sP(enumC932550aNJArr);
    }

    public static EnumC932550aNJ[] values() {
        return (EnumC932550aNJ[]) LL.clone();
    }

    public static EnumC932550aNJ valueOf(String str) {
        return (EnumC932550aNJ) C08FF.LIZ(EnumC932550aNJ.class, str);
    }

    public EnumC932550aNJ(String str, int i) {
    }
}
