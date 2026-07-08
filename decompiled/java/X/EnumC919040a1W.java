package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC919040a1W {
    public static final /* synthetic */ EnumC919040a1W[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC919040a1W NORMAL;
    public static final EnumC919040a1W SSC;

    public static InterfaceC2044707zh<EnumC919040a1W> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC919040a1W enumC919040a1W = new EnumC919040a1W("NORMAL", 0);
        NORMAL = enumC919040a1W;
        EnumC919040a1W enumC919040a1W2 = new EnumC919040a1W("SSC", 1);
        SSC = enumC919040a1W2;
        EnumC919040a1W[] enumC919040a1WArr = {enumC919040a1W, enumC919040a1W2};
        LL = enumC919040a1WArr;
        LLILLJJLI = new C2254308sP(enumC919040a1WArr);
    }

    public static EnumC919040a1W[] values() {
        return (EnumC919040a1W[]) LL.clone();
    }

    public static EnumC919040a1W valueOf(String str) {
        return (EnumC919040a1W) C08FF.LIZ(EnumC919040a1W.class, str);
    }

    public EnumC919040a1W(String str, int i) {
    }
}
