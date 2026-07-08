package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dmh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1063610dmh {
    public static final EnumC1063610dmh Compatible;
    public static final EnumC1063610dmh InCompatible;
    public static final /* synthetic */ EnumC1063610dmh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final boolean LL;

    public static InterfaceC2044707zh<EnumC1063610dmh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1063610dmh enumC1063610dmh = new EnumC1063610dmh("Compatible", 0, true);
        Compatible = enumC1063610dmh;
        EnumC1063610dmh enumC1063610dmh2 = new EnumC1063610dmh("InCompatible", 1, false);
        InCompatible = enumC1063610dmh2;
        EnumC1063610dmh[] enumC1063610dmhArr = {enumC1063610dmh, enumC1063610dmh2};
        LLILLJJLI = enumC1063610dmhArr;
        LLILLL = new C2254308sP(enumC1063610dmhArr);
    }

    public static EnumC1063610dmh[] values() {
        return (EnumC1063610dmh[]) LLILLJJLI.clone();
    }

    public final boolean getValue() {
        return this.LL;
    }

    public static EnumC1063610dmh valueOf(String str) {
        return (EnumC1063610dmh) C08FF.LIZ(EnumC1063610dmh.class, str);
    }

    public EnumC1063610dmh(String str, int i, boolean z) {
        this.LL = z;
    }
}
