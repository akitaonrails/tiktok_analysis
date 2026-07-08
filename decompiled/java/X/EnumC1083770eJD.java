package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eJD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083770eJD {
    public static final EnumC1083770eJD CENTER;
    public static final /* synthetic */ EnumC1083770eJD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1083770eJD TOP;

    public static InterfaceC2044707zh<EnumC1083770eJD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1083770eJD enumC1083770eJD = new EnumC1083770eJD("TOP", 0);
        TOP = enumC1083770eJD;
        EnumC1083770eJD enumC1083770eJD2 = new EnumC1083770eJD("CENTER", 1);
        CENTER = enumC1083770eJD2;
        EnumC1083770eJD[] enumC1083770eJDArr = {enumC1083770eJD, enumC1083770eJD2};
        LL = enumC1083770eJDArr;
        LLILLJJLI = new C2254308sP(enumC1083770eJDArr);
    }

    public static EnumC1083770eJD[] values() {
        return (EnumC1083770eJD[]) LL.clone();
    }

    public static EnumC1083770eJD valueOf(String str) {
        return (EnumC1083770eJD) C08FF.LIZ(EnumC1083770eJD.class, str);
    }

    public EnumC1083770eJD(String str, int i) {
    }
}
