package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779710wPh {
    public static final EnumC1779710wPh FIVE_LEVEL;
    public static final /* synthetic */ EnumC1779710wPh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 10;

    public static InterfaceC2044707zh<EnumC1779710wPh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779710wPh enumC1779710wPh = new EnumC1779710wPh();
        FIVE_LEVEL = enumC1779710wPh;
        EnumC1779710wPh[] enumC1779710wPhArr = {enumC1779710wPh};
        LLILLJJLI = enumC1779710wPhArr;
        LLILLL = new C2254308sP(enumC1779710wPhArr);
    }

    public static EnumC1779710wPh[] values() {
        return (EnumC1779710wPh[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1779710wPh valueOf(String str) {
        return (EnumC1779710wPh) C08FF.LIZ(EnumC1779710wPh.class, str);
    }
}
