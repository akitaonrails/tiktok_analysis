package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZrR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC912790ZrR {
    public static final EnumC912790ZrR FROM_END;
    public static final EnumC912790ZrR FROM_START;
    public static final /* synthetic */ EnumC912790ZrR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC912790ZrR MIDDLE;

    public static InterfaceC2044707zh<EnumC912790ZrR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC912790ZrR enumC912790ZrR = new EnumC912790ZrR("FROM_START", 0);
        FROM_START = enumC912790ZrR;
        EnumC912790ZrR enumC912790ZrR2 = new EnumC912790ZrR("MIDDLE", 1);
        MIDDLE = enumC912790ZrR2;
        EnumC912790ZrR enumC912790ZrR3 = new EnumC912790ZrR("FROM_END", 2);
        FROM_END = enumC912790ZrR3;
        EnumC912790ZrR[] enumC912790ZrRArr = {enumC912790ZrR, enumC912790ZrR2, enumC912790ZrR3};
        LL = enumC912790ZrRArr;
        LLILLJJLI = new C2254308sP(enumC912790ZrRArr);
    }

    public static EnumC912790ZrR[] values() {
        return (EnumC912790ZrR[]) LL.clone();
    }

    public static EnumC912790ZrR valueOf(String str) {
        return (EnumC912790ZrR) C08FF.LIZ(EnumC912790ZrR.class, str);
    }

    public EnumC912790ZrR(String str, int i) {
    }
}
