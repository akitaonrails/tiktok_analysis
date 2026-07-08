package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eUC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1090580eUC {
    public static final EnumC1090580eUC DRAGGING;
    public static final EnumC1090580eUC IDLE;
    public static final /* synthetic */ EnumC1090580eUC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1090580eUC SETTLING;

    public static InterfaceC2044707zh<EnumC1090580eUC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1090580eUC enumC1090580eUC = new EnumC1090580eUC("IDLE", 0);
        IDLE = enumC1090580eUC;
        EnumC1090580eUC enumC1090580eUC2 = new EnumC1090580eUC("DRAGGING", 1);
        DRAGGING = enumC1090580eUC2;
        EnumC1090580eUC enumC1090580eUC3 = new EnumC1090580eUC("SETTLING", 2);
        SETTLING = enumC1090580eUC3;
        EnumC1090580eUC[] enumC1090580eUCArr = {enumC1090580eUC, enumC1090580eUC2, enumC1090580eUC3};
        LL = enumC1090580eUCArr;
        LLILLJJLI = new C2254308sP(enumC1090580eUCArr);
    }

    public static EnumC1090580eUC[] values() {
        return (EnumC1090580eUC[]) LL.clone();
    }

    public static EnumC1090580eUC valueOf(String str) {
        return (EnumC1090580eUC) C08FF.LIZ(EnumC1090580eUC.class, str);
    }

    public EnumC1090580eUC(String str, int i) {
    }
}
