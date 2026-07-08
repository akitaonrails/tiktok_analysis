package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1531250pwx {
    public static final EnumC1531250pwx Fetching;
    public static final /* synthetic */ EnumC1531250pwx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1531250pwx Ready;
    public static final EnumC1531250pwx Terminate;
    public static final EnumC1531250pwx Unusable;

    public static InterfaceC2044707zh<EnumC1531250pwx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1531250pwx enumC1531250pwx = new EnumC1531250pwx("Unusable", 0);
        Unusable = enumC1531250pwx;
        EnumC1531250pwx enumC1531250pwx2 = new EnumC1531250pwx("Fetching", 1);
        Fetching = enumC1531250pwx2;
        EnumC1531250pwx enumC1531250pwx3 = new EnumC1531250pwx("Ready", 2);
        Ready = enumC1531250pwx3;
        EnumC1531250pwx enumC1531250pwx4 = new EnumC1531250pwx("Terminate", 3);
        Terminate = enumC1531250pwx4;
        EnumC1531250pwx[] enumC1531250pwxArr = {enumC1531250pwx, enumC1531250pwx2, enumC1531250pwx3, enumC1531250pwx4};
        LL = enumC1531250pwxArr;
        LLILLJJLI = new C2254308sP(enumC1531250pwxArr);
    }

    public static EnumC1531250pwx[] values() {
        return (EnumC1531250pwx[]) LL.clone();
    }

    public static EnumC1531250pwx valueOf(String str) {
        return (EnumC1531250pwx) C08FF.LIZ(EnumC1531250pwx.class, str);
    }

    public EnumC1531250pwx(String str, int i) {
    }
}
