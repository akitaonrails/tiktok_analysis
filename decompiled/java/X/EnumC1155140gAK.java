package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gAK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1155140gAK {
    public static final /* synthetic */ EnumC1155140gAK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1155140gAK LOAD_AWEME_DETAIL;
    public final String LL = "load_aweme_detail";

    public static InterfaceC2044707zh<EnumC1155140gAK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1155140gAK enumC1155140gAK = new EnumC1155140gAK();
        LOAD_AWEME_DETAIL = enumC1155140gAK;
        EnumC1155140gAK[] enumC1155140gAKArr = {enumC1155140gAK};
        LLILLJJLI = enumC1155140gAKArr;
        LLILLL = new C2254308sP(enumC1155140gAKArr);
    }

    public static EnumC1155140gAK[] values() {
        return (EnumC1155140gAK[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1155140gAK valueOf(String str) {
        return (EnumC1155140gAK) C08FF.LIZ(EnumC1155140gAK.class, str);
    }
}
