package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NgX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC600270NgX {
    public static final EnumC600270NgX CLICK;
    public static final EnumC600270NgX IMPRESSION;
    public static final /* synthetic */ EnumC600270NgX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC600270NgX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC600270NgX enumC600270NgX = new EnumC600270NgX("IMPRESSION", 0);
        IMPRESSION = enumC600270NgX;
        EnumC600270NgX enumC600270NgX2 = new EnumC600270NgX("CLICK", 1);
        CLICK = enumC600270NgX2;
        EnumC600270NgX[] enumC600270NgXArr = {enumC600270NgX, enumC600270NgX2};
        LL = enumC600270NgXArr;
        LLILLJJLI = new C2254308sP(enumC600270NgXArr);
    }

    public static EnumC600270NgX[] values() {
        return (EnumC600270NgX[]) LL.clone();
    }

    public static EnumC600270NgX valueOf(String str) {
        return (EnumC600270NgX) C08FF.LIZ(EnumC600270NgX.class, str);
    }

    public EnumC600270NgX(String str, int i) {
    }
}
