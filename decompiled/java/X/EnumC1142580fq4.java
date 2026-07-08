package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1142580fq4 {
    public static final EnumC1142580fq4 ANCHOR_LIVE;
    public static final EnumC1142580fq4 AUDIENCE_LIVE;
    public static final EnumC1142580fq4 GO_LIVE;
    public static final /* synthetic */ EnumC1142580fq4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1142580fq4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1142580fq4 enumC1142580fq4 = new EnumC1142580fq4("GO_LIVE", 0);
        GO_LIVE = enumC1142580fq4;
        EnumC1142580fq4 enumC1142580fq42 = new EnumC1142580fq4("ANCHOR_LIVE", 1);
        ANCHOR_LIVE = enumC1142580fq42;
        EnumC1142580fq4 enumC1142580fq43 = new EnumC1142580fq4("AUDIENCE_LIVE", 2);
        AUDIENCE_LIVE = enumC1142580fq43;
        EnumC1142580fq4[] enumC1142580fq4Arr = {enumC1142580fq4, enumC1142580fq42, enumC1142580fq43};
        LL = enumC1142580fq4Arr;
        LLILLJJLI = new C2254308sP(enumC1142580fq4Arr);
    }

    public static EnumC1142580fq4[] values() {
        return (EnumC1142580fq4[]) LL.clone();
    }

    public static EnumC1142580fq4 valueOf(String str) {
        return (EnumC1142580fq4) C08FF.LIZ(EnumC1142580fq4.class, str);
    }

    public EnumC1142580fq4(String str, int i) {
    }
}
