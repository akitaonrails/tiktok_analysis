package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1000550c8z implements InterfaceC593520NPq<String> {
    public static final /* synthetic */ EnumC1000550c8z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1000550c8z TOP_BOTTOM_CARD;
    public static final EnumC1000550c8z TOP_CARD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1000550c8z> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1000550c8z enumC1000550c8z = new EnumC1000550c8z("TOP_BOTTOM_CARD", 0, "top_bottom_card");
        TOP_BOTTOM_CARD = enumC1000550c8z;
        EnumC1000550c8z enumC1000550c8z2 = new EnumC1000550c8z("TOP_CARD", 1, "top_card");
        TOP_CARD = enumC1000550c8z2;
        EnumC1000550c8z[] enumC1000550c8zArr = {enumC1000550c8z, enumC1000550c8z2};
        LLILLJJLI = enumC1000550c8zArr;
        LLILLL = new C2254308sP(enumC1000550c8zArr);
    }

    public static EnumC1000550c8z[] values() {
        return (EnumC1000550c8z[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC593520NPq
    public String getParamValue() {
        return this.LL;
    }

    public static EnumC1000550c8z valueOf(String str) {
        return (EnumC1000550c8z) C08FF.LIZ(EnumC1000550c8z.class, str);
    }

    public EnumC1000550c8z(String str, int i, String str2) {
        this.LL = str2;
    }
}
