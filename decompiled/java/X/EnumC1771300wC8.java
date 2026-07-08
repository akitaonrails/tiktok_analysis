package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wC8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1771300wC8 {
    public static final /* synthetic */ EnumC1771300wC8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1771300wC8 PRELOAD;
    public static final EnumC1771300wC8 PRELOAD_FAIL;
    public static final EnumC1771300wC8 PRELOAD_SUCCESS;
    public static final EnumC1771300wC8 TRY_PRELOAD;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1771300wC8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1771300wC8 enumC1771300wC8 = new EnumC1771300wC8("TRY_PRELOAD", 0, 0);
        TRY_PRELOAD = enumC1771300wC8;
        EnumC1771300wC8 enumC1771300wC82 = new EnumC1771300wC8("PRELOAD", 1, 1);
        PRELOAD = enumC1771300wC82;
        EnumC1771300wC8 enumC1771300wC83 = new EnumC1771300wC8("PRELOAD_SUCCESS", 2, 2);
        PRELOAD_SUCCESS = enumC1771300wC83;
        EnumC1771300wC8 enumC1771300wC84 = new EnumC1771300wC8("PRELOAD_FAIL", 3, 3);
        PRELOAD_FAIL = enumC1771300wC84;
        EnumC1771300wC8[] enumC1771300wC8Arr = {enumC1771300wC8, enumC1771300wC82, enumC1771300wC83, enumC1771300wC84};
        LLILLJJLI = enumC1771300wC8Arr;
        LLILLL = new C2254308sP(enumC1771300wC8Arr);
    }

    public static EnumC1771300wC8[] values() {
        return (EnumC1771300wC8[]) LLILLJJLI.clone();
    }

    public final int getStage() {
        return this.LL;
    }

    public static EnumC1771300wC8 valueOf(String str) {
        return (EnumC1771300wC8) C08FF.LIZ(EnumC1771300wC8.class, str);
    }

    public EnumC1771300wC8(String str, int i, int i2) {
        this.LL = i2;
    }
}
