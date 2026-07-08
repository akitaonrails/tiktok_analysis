package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1709190uZx {
    public static final EnumC1709190uZx CANCEL;
    public static final EnumC1709190uZx CONTINUE;
    public static final /* synthetic */ EnumC1709190uZx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1709190uZx REQUEST_PAY;

    public static InterfaceC2044707zh<EnumC1709190uZx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1709190uZx enumC1709190uZx = new EnumC1709190uZx("CONTINUE", 0);
        CONTINUE = enumC1709190uZx;
        EnumC1709190uZx enumC1709190uZx2 = new EnumC1709190uZx("REQUEST_PAY", 1);
        REQUEST_PAY = enumC1709190uZx2;
        EnumC1709190uZx enumC1709190uZx3 = new EnumC1709190uZx("CANCEL", 2);
        CANCEL = enumC1709190uZx3;
        EnumC1709190uZx[] enumC1709190uZxArr = {enumC1709190uZx, enumC1709190uZx2, enumC1709190uZx3};
        LL = enumC1709190uZxArr;
        LLILLJJLI = new C2254308sP(enumC1709190uZxArr);
    }

    public static EnumC1709190uZx[] values() {
        return (EnumC1709190uZx[]) LL.clone();
    }

    public static EnumC1709190uZx valueOf(String str) {
        return (EnumC1709190uZx) C08FF.LIZ(EnumC1709190uZx.class, str);
    }

    public EnumC1709190uZx(String str, int i) {
    }
}
