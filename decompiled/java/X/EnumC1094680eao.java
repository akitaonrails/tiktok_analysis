package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1094680eao {
    public static final EnumC1094680eao LANDSCAPE;
    public static final /* synthetic */ EnumC1094680eao[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1094680eao PORTRAIT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1094680eao> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1094680eao enumC1094680eao = new EnumC1094680eao("PORTRAIT", 0, 0);
        PORTRAIT = enumC1094680eao;
        EnumC1094680eao enumC1094680eao2 = new EnumC1094680eao("LANDSCAPE", 1, 1);
        LANDSCAPE = enumC1094680eao2;
        EnumC1094680eao[] enumC1094680eaoArr = {enumC1094680eao, enumC1094680eao2};
        LLILLJJLI = enumC1094680eaoArr;
        LLILLL = new C2254308sP(enumC1094680eaoArr);
    }

    public static EnumC1094680eao[] values() {
        return (EnumC1094680eao[]) LLILLJJLI.clone();
    }

    public final int getLandscapeType() {
        return this.LL;
    }

    public static EnumC1094680eao valueOf(String str) {
        return (EnumC1094680eao) C08FF.LIZ(EnumC1094680eao.class, str);
    }

    public EnumC1094680eao(String str, int i, int i2) {
        this.LL = i2;
    }
}
