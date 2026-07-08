package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zgR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1905410zgR implements C1D61 {
    public static final /* synthetic */ EnumC1905410zgR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1905410zgR ON_ATTACH;
    public static final EnumC1905410zgR ON_DETACH;
    public final String LL = name();

    public static InterfaceC2044707zh<EnumC1905410zgR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1905410zgR enumC1905410zgR = new EnumC1905410zgR("ON_ATTACH", 0);
        ON_ATTACH = enumC1905410zgR;
        EnumC1905410zgR enumC1905410zgR2 = new EnumC1905410zgR("ON_DETACH", 1);
        ON_DETACH = enumC1905410zgR2;
        EnumC1905410zgR[] enumC1905410zgRArr = {enumC1905410zgR, enumC1905410zgR2};
        LLILLJJLI = enumC1905410zgRArr;
        LLILLL = new C2254308sP(enumC1905410zgRArr);
    }

    public static EnumC1905410zgR[] values() {
        return (EnumC1905410zgR[]) LLILLJJLI.clone();
    }

    @Override // X.C1D61
    public String getStageName() {
        return this.LL;
    }

    public static EnumC1905410zgR valueOf(String str) {
        return (EnumC1905410zgR) C08FF.LIZ(EnumC1905410zgR.class, str);
    }

    public EnumC1905410zgR(String str, int i) {
    }
}
