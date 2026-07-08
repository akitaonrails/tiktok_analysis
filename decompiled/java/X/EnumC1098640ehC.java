package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ehC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1098640ehC {
    public static final /* synthetic */ EnumC1098640ehC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1098640ehC START;
    public static final EnumC1098640ehC STOP;

    public static InterfaceC2044707zh<EnumC1098640ehC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1098640ehC enumC1098640ehC = new EnumC1098640ehC("START", 0);
        START = enumC1098640ehC;
        EnumC1098640ehC enumC1098640ehC2 = new EnumC1098640ehC("STOP", 1);
        STOP = enumC1098640ehC2;
        EnumC1098640ehC[] enumC1098640ehCArr = {enumC1098640ehC, enumC1098640ehC2};
        LL = enumC1098640ehCArr;
        LLILLJJLI = new C2254308sP(enumC1098640ehCArr);
    }

    public static EnumC1098640ehC[] values() {
        return (EnumC1098640ehC[]) LL.clone();
    }

    public static EnumC1098640ehC valueOf(String str) {
        return (EnumC1098640ehC) C08FF.LIZ(EnumC1098640ehC.class, str);
    }

    public EnumC1098640ehC(String str, int i) {
    }
}
