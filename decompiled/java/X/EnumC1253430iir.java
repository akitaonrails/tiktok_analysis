package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1253430iir {
    public static final EnumC1253430iir ALL_FAIL;
    public static final EnumC1253430iir CANCEL;
    public static final EnumC1253430iir FAIL;
    public static final EnumC1253430iir HEAD_FAIL;
    public static final /* synthetic */ EnumC1253430iir[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1253430iir SUCCESS;
    public static final EnumC1253430iir TAB_FAIL;

    public static InterfaceC2044707zh<EnumC1253430iir> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1253430iir enumC1253430iir = new EnumC1253430iir("SUCCESS", 0);
        SUCCESS = enumC1253430iir;
        EnumC1253430iir enumC1253430iir2 = new EnumC1253430iir("FAIL", 1);
        FAIL = enumC1253430iir2;
        EnumC1253430iir enumC1253430iir3 = new EnumC1253430iir("CANCEL", 2);
        CANCEL = enumC1253430iir3;
        EnumC1253430iir enumC1253430iir4 = new EnumC1253430iir("HEAD_FAIL", 3);
        HEAD_FAIL = enumC1253430iir4;
        EnumC1253430iir enumC1253430iir5 = new EnumC1253430iir("TAB_FAIL", 4);
        TAB_FAIL = enumC1253430iir5;
        EnumC1253430iir enumC1253430iir6 = new EnumC1253430iir("ALL_FAIL", 5);
        ALL_FAIL = enumC1253430iir6;
        EnumC1253430iir[] enumC1253430iirArr = {enumC1253430iir, enumC1253430iir2, enumC1253430iir3, enumC1253430iir4, enumC1253430iir5, enumC1253430iir6};
        LL = enumC1253430iirArr;
        LLILLJJLI = new C2254308sP(enumC1253430iirArr);
    }

    public static EnumC1253430iir[] values() {
        return (EnumC1253430iir[]) LL.clone();
    }

    public static EnumC1253430iir valueOf(String str) {
        return (EnumC1253430iir) C08FF.LIZ(EnumC1253430iir.class, str);
    }

    public EnumC1253430iir(String str, int i) {
    }
}
