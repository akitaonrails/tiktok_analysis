package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07sM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1999207sM {
    public static final /* synthetic */ EnumC1999207sM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1999207sM VH_PRELOAD;
    public final String LL = "vh_preload";

    public static InterfaceC2044707zh<EnumC1999207sM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1999207sM enumC1999207sM = new EnumC1999207sM();
        VH_PRELOAD = enumC1999207sM;
        EnumC1999207sM[] enumC1999207sMArr = {enumC1999207sM};
        LLILLJJLI = enumC1999207sMArr;
        LLILLL = new C2254308sP(enumC1999207sMArr);
    }

    public static EnumC1999207sM[] values() {
        return (EnumC1999207sM[]) LLILLJJLI.clone();
    }

    public final String getFlagName() {
        return this.LL;
    }

    public static EnumC1999207sM valueOf(String str) {
        return (EnumC1999207sM) C08FF.LIZ(EnumC1999207sM.class, str);
    }
}
