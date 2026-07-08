package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wSp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1781650wSp implements InterfaceC1641620soy {
    public static final /* synthetic */ EnumC1781650wSp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1781650wSp NOW;
    public static final EnumC1781650wSp QR;

    public static InterfaceC2044707zh<EnumC1781650wSp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1781650wSp enumC1781650wSp = new EnumC1781650wSp("QR", 0);
        QR = enumC1781650wSp;
        EnumC1781650wSp enumC1781650wSp2 = new EnumC1781650wSp("NOW", 1);
        NOW = enumC1781650wSp2;
        EnumC1781650wSp[] enumC1781650wSpArr = {enumC1781650wSp, enumC1781650wSp2};
        LL = enumC1781650wSpArr;
        LLILLJJLI = new C2254308sP(enumC1781650wSpArr);
    }

    public static EnumC1781650wSp[] values() {
        return (EnumC1781650wSp[]) LL.clone();
    }

    public static EnumC1781650wSp valueOf(String str) {
        return (EnumC1781650wSp) C08FF.LIZ(EnumC1781650wSp.class, str);
    }

    public EnumC1781650wSp(String str, int i) {
    }
}
