package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eXS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1092600eXS {
    public static final /* synthetic */ EnumC1092600eXS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1092600eXS LYNX;
    public static final EnumC1092600eXS WEBVIEW;

    public static InterfaceC2044707zh<EnumC1092600eXS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1092600eXS enumC1092600eXS = new EnumC1092600eXS("LYNX", 0);
        LYNX = enumC1092600eXS;
        EnumC1092600eXS enumC1092600eXS2 = new EnumC1092600eXS("WEBVIEW", 1);
        WEBVIEW = enumC1092600eXS2;
        EnumC1092600eXS[] enumC1092600eXSArr = {enumC1092600eXS, enumC1092600eXS2};
        LL = enumC1092600eXSArr;
        LLILLJJLI = new C2254308sP(enumC1092600eXSArr);
    }

    public static EnumC1092600eXS[] values() {
        return (EnumC1092600eXS[]) LL.clone();
    }

    public static EnumC1092600eXS valueOf(String str) {
        return (EnumC1092600eXS) C08FF.LIZ(EnumC1092600eXS.class, str);
    }

    public EnumC1092600eXS(String str, int i) {
    }
}
