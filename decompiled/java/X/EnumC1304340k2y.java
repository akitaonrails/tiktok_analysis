package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1304340k2y {
    public static final EnumC1304340k2y FirstOnScreenCanvasFrame;
    public static final /* synthetic */ EnumC1304340k2y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1304340k2y OnMemoryWarning;
    public static final EnumC1304340k2y OnNetworkChange;
    public static final EnumC1304340k2y OnNetworkWeakChange;
    public static final EnumC1304340k2y OnOrientation;

    public static InterfaceC2044707zh<EnumC1304340k2y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1304340k2y enumC1304340k2y = new EnumC1304340k2y("OnOrientation", 0);
        OnOrientation = enumC1304340k2y;
        EnumC1304340k2y enumC1304340k2y2 = new EnumC1304340k2y("OnNetworkChange", 1);
        OnNetworkChange = enumC1304340k2y2;
        EnumC1304340k2y enumC1304340k2y3 = new EnumC1304340k2y("OnNetworkWeakChange", 2);
        OnNetworkWeakChange = enumC1304340k2y3;
        EnumC1304340k2y enumC1304340k2y4 = new EnumC1304340k2y("OnMemoryWarning", 3);
        OnMemoryWarning = enumC1304340k2y4;
        EnumC1304340k2y enumC1304340k2y5 = new EnumC1304340k2y("FirstOnScreenCanvasFrame", 4);
        FirstOnScreenCanvasFrame = enumC1304340k2y5;
        EnumC1304340k2y[] enumC1304340k2yArr = {enumC1304340k2y, enumC1304340k2y2, enumC1304340k2y3, enumC1304340k2y4, enumC1304340k2y5};
        LL = enumC1304340k2yArr;
        LLILLJJLI = new C2254308sP(enumC1304340k2yArr);
    }

    public static EnumC1304340k2y[] values() {
        return (EnumC1304340k2y[]) LL.clone();
    }

    public static EnumC1304340k2y valueOf(String str) {
        return (EnumC1304340k2y) C08FF.LIZ(EnumC1304340k2y.class, str);
    }

    public EnumC1304340k2y(String str, int i) {
    }
}
