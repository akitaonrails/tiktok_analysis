package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993940byK {
    public static final EnumC993940byK ALL;
    public static final /* synthetic */ EnumC993940byK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993940byK ONLY_WIFI;
    public final int LL;

    public static InterfaceC2044707zh<EnumC993940byK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993940byK enumC993940byK = new EnumC993940byK("ONLY_WIFI", 0, 0);
        ONLY_WIFI = enumC993940byK;
        EnumC993940byK enumC993940byK2 = new EnumC993940byK("ALL", 1, 1);
        ALL = enumC993940byK2;
        EnumC993940byK[] enumC993940byKArr = {enumC993940byK, enumC993940byK2};
        LLILLJJLI = enumC993940byKArr;
        LLILLL = new C2254308sP(enumC993940byKArr);
    }

    public static EnumC993940byK[] values() {
        return (EnumC993940byK[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC993940byK valueOf(String str) {
        return (EnumC993940byK) C08FF.LIZ(EnumC993940byK.class, str);
    }

    public EnumC993940byK(String str, int i, int i2) {
        this.LL = i2;
    }
}
