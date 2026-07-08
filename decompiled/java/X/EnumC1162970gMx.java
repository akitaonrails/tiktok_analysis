package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1162970gMx {
    public static final EnumC1162970gMx CLIENT_OVERRIDES_FIRST;
    public static final /* synthetic */ EnumC1162970gMx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1162970gMx SCHEMA_PARAMS_FIRST;

    public static InterfaceC2044707zh<EnumC1162970gMx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1162970gMx enumC1162970gMx = new EnumC1162970gMx("CLIENT_OVERRIDES_FIRST", 0);
        CLIENT_OVERRIDES_FIRST = enumC1162970gMx;
        EnumC1162970gMx enumC1162970gMx2 = new EnumC1162970gMx("SCHEMA_PARAMS_FIRST", 1);
        SCHEMA_PARAMS_FIRST = enumC1162970gMx2;
        EnumC1162970gMx[] enumC1162970gMxArr = {enumC1162970gMx, enumC1162970gMx2};
        LL = enumC1162970gMxArr;
        LLILLJJLI = new C2254308sP(enumC1162970gMxArr);
    }

    public static EnumC1162970gMx[] values() {
        return (EnumC1162970gMx[]) LL.clone();
    }

    public static EnumC1162970gMx valueOf(String str) {
        return (EnumC1162970gMx) C08FF.LIZ(EnumC1162970gMx.class, str);
    }

    public EnumC1162970gMx(String str, int i) {
    }
}
