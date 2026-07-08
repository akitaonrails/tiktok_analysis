package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1993707rT {
    public static final EnumC1993707rT FORM_15S;
    public static final EnumC1993707rT FORM_60S;
    public static final /* synthetic */ EnumC1993707rT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1993707rT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1993707rT enumC1993707rT = new EnumC1993707rT("FORM_15S", 0);
        FORM_15S = enumC1993707rT;
        EnumC1993707rT enumC1993707rT2 = new EnumC1993707rT("FORM_60S", 1);
        FORM_60S = enumC1993707rT2;
        EnumC1993707rT[] enumC1993707rTArr = {enumC1993707rT, enumC1993707rT2};
        LL = enumC1993707rTArr;
        LLILLJJLI = new C2254308sP(enumC1993707rTArr);
    }

    public static EnumC1993707rT[] values() {
        return (EnumC1993707rT[]) LL.clone();
    }

    public static EnumC1993707rT valueOf(String str) {
        return (EnumC1993707rT) C08FF.LIZ(EnumC1993707rT.class, str);
    }

    public EnumC1993707rT(String str, int i) {
    }
}
