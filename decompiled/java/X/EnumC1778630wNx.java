package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778630wNx {
    public static final EnumC1778630wNx FAIL;
    public static final EnumC1778630wNx INITIAL;
    public static final /* synthetic */ EnumC1778630wNx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778630wNx SUCCESS;

    public static InterfaceC2044707zh<EnumC1778630wNx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778630wNx enumC1778630wNx = new EnumC1778630wNx("INITIAL", 0);
        INITIAL = enumC1778630wNx;
        EnumC1778630wNx enumC1778630wNx2 = new EnumC1778630wNx("SUCCESS", 1);
        SUCCESS = enumC1778630wNx2;
        EnumC1778630wNx enumC1778630wNx3 = new EnumC1778630wNx("FAIL", 2);
        FAIL = enumC1778630wNx3;
        EnumC1778630wNx[] enumC1778630wNxArr = {enumC1778630wNx, enumC1778630wNx2, enumC1778630wNx3};
        LL = enumC1778630wNxArr;
        LLILLJJLI = new C2254308sP(enumC1778630wNxArr);
    }

    public static EnumC1778630wNx[] values() {
        return (EnumC1778630wNx[]) LL.clone();
    }

    public static EnumC1778630wNx valueOf(String str) {
        return (EnumC1778630wNx) C08FF.LIZ(EnumC1778630wNx.class, str);
    }

    public EnumC1778630wNx(String str, int i) {
    }
}
