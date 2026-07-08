package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154640g9W {
    public static final EnumC1154640g9W CDN;
    public static final /* synthetic */ EnumC1154640g9W[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154640g9W LOCAL;

    public static InterfaceC2044707zh<EnumC1154640g9W> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154640g9W enumC1154640g9W = new EnumC1154640g9W("LOCAL", 0);
        LOCAL = enumC1154640g9W;
        EnumC1154640g9W enumC1154640g9W2 = new EnumC1154640g9W("CDN", 1);
        CDN = enumC1154640g9W2;
        EnumC1154640g9W[] enumC1154640g9WArr = {enumC1154640g9W, enumC1154640g9W2};
        LL = enumC1154640g9WArr;
        LLILLJJLI = new C2254308sP(enumC1154640g9WArr);
    }

    public static EnumC1154640g9W[] values() {
        return (EnumC1154640g9W[]) LL.clone();
    }

    public static EnumC1154640g9W valueOf(String str) {
        return (EnumC1154640g9W) C08FF.LIZ(EnumC1154640g9W.class, str);
    }

    public EnumC1154640g9W(String str, int i) {
    }
}
