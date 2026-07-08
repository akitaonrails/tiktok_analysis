package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1841230y0v {
    public static final EnumC1841230y0v GOOGLE_PLAY;
    public static final /* synthetic */ EnumC1841230y0v[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1841230y0v WEB;

    public static InterfaceC2044707zh<EnumC1841230y0v> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1841230y0v enumC1841230y0v = new EnumC1841230y0v("WEB", 0);
        WEB = enumC1841230y0v;
        EnumC1841230y0v enumC1841230y0v2 = new EnumC1841230y0v("GOOGLE_PLAY", 1);
        GOOGLE_PLAY = enumC1841230y0v2;
        EnumC1841230y0v[] enumC1841230y0vArr = {enumC1841230y0v, enumC1841230y0v2};
        LL = enumC1841230y0vArr;
        LLILLJJLI = new C2254308sP(enumC1841230y0vArr);
    }

    public static EnumC1841230y0v[] values() {
        return (EnumC1841230y0v[]) LL.clone();
    }

    public static EnumC1841230y0v valueOf(String str) {
        return (EnumC1841230y0v) C08FF.LIZ(EnumC1841230y0v.class, str);
    }

    public EnumC1841230y0v(String str, int i) {
    }
}
