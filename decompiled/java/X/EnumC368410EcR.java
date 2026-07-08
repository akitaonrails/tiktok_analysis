package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EcR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC368410EcR {
    public static final EnumC368410EcR LEFT;
    public static final /* synthetic */ EnumC368410EcR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC368410EcR RIGHT;

    public static InterfaceC2044707zh<EnumC368410EcR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC368410EcR enumC368410EcR = new EnumC368410EcR("LEFT", 0);
        LEFT = enumC368410EcR;
        EnumC368410EcR enumC368410EcR2 = new EnumC368410EcR("RIGHT", 1);
        RIGHT = enumC368410EcR2;
        EnumC368410EcR[] enumC368410EcRArr = {enumC368410EcR, enumC368410EcR2};
        LL = enumC368410EcRArr;
        LLILLJJLI = new C2254308sP(enumC368410EcRArr);
    }

    public static EnumC368410EcR[] values() {
        return (EnumC368410EcR[]) LL.clone();
    }

    public static EnumC368410EcR valueOf(String str) {
        return (EnumC368410EcR) C08FF.LIZ(EnumC368410EcR.class, str);
    }

    public EnumC368410EcR(String str, int i) {
    }
}
