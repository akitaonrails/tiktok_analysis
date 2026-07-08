package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429140GsC {
    public static final EnumC429140GsC FORMAT;
    public static final /* synthetic */ EnumC429140GsC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429140GsC NORMAL;

    public static InterfaceC2044707zh<EnumC429140GsC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429140GsC enumC429140GsC = new EnumC429140GsC("FORMAT", 0);
        FORMAT = enumC429140GsC;
        EnumC429140GsC enumC429140GsC2 = new EnumC429140GsC("NORMAL", 1);
        NORMAL = enumC429140GsC2;
        EnumC429140GsC[] enumC429140GsCArr = {enumC429140GsC, enumC429140GsC2};
        LL = enumC429140GsCArr;
        LLILLJJLI = new C2254308sP(enumC429140GsCArr);
    }

    public static EnumC429140GsC[] values() {
        return (EnumC429140GsC[]) LL.clone();
    }

    public static EnumC429140GsC valueOf(String str) {
        return (EnumC429140GsC) C08FF.LIZ(EnumC429140GsC.class, str);
    }

    public EnumC429140GsC(String str, int i) {
    }
}
