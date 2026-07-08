package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oBT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1463370oBT {
    public static final /* synthetic */ EnumC1463370oBT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1463370oBT MUSIC_FROM_HOT;
    public static final EnumC1463370oBT MUSIC_FROM_RECOMMEND;
    public static final EnumC1463370oBT MUSIC_FROM_RESUME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1463370oBT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1463370oBT enumC1463370oBT = new EnumC1463370oBT("MUSIC_FROM_RECOMMEND", 0, "recommend");
        MUSIC_FROM_RECOMMEND = enumC1463370oBT;
        EnumC1463370oBT enumC1463370oBT2 = new EnumC1463370oBT("MUSIC_FROM_HOT", 1, "hot");
        MUSIC_FROM_HOT = enumC1463370oBT2;
        EnumC1463370oBT enumC1463370oBT3 = new EnumC1463370oBT("MUSIC_FROM_RESUME", 2, "reuse");
        MUSIC_FROM_RESUME = enumC1463370oBT3;
        EnumC1463370oBT[] enumC1463370oBTArr = {enumC1463370oBT, enumC1463370oBT2, enumC1463370oBT3};
        LLILLJJLI = enumC1463370oBTArr;
        LLILLL = new C2254308sP(enumC1463370oBTArr);
    }

    public static EnumC1463370oBT[] values() {
        return (EnumC1463370oBT[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1463370oBT valueOf(String str) {
        return (EnumC1463370oBT) C08FF.LIZ(EnumC1463370oBT.class, str);
    }

    public EnumC1463370oBT(String str, int i, String str2) {
        this.LL = str2;
    }
}
