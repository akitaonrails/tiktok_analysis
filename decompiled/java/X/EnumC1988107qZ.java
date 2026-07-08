package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1988107qZ {
    public static final EnumC1988107qZ IMAGE;
    public static final /* synthetic */ EnumC1988107qZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "image";

    public static InterfaceC2044707zh<EnumC1988107qZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1988107qZ enumC1988107qZ = new EnumC1988107qZ();
        IMAGE = enumC1988107qZ;
        EnumC1988107qZ[] enumC1988107qZArr = {enumC1988107qZ};
        LLILLJJLI = enumC1988107qZArr;
        LLILLL = new C2254308sP(enumC1988107qZArr);
    }

    public static EnumC1988107qZ[] values() {
        return (EnumC1988107qZ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1988107qZ valueOf(String str) {
        return (EnumC1988107qZ) C08FF.LIZ(EnumC1988107qZ.class, str);
    }
}
