package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0imQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1255640imQ {
    public static final EnumC1255640imQ CANCEL;
    public static final EnumC1255640imQ CLICK;
    public static final /* synthetic */ EnumC1255640imQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1255640imQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1255640imQ enumC1255640imQ = new EnumC1255640imQ("CLICK", 0);
        CLICK = enumC1255640imQ;
        EnumC1255640imQ enumC1255640imQ2 = new EnumC1255640imQ("CANCEL", 1);
        CANCEL = enumC1255640imQ2;
        EnumC1255640imQ[] enumC1255640imQArr = {enumC1255640imQ, enumC1255640imQ2};
        LL = enumC1255640imQArr;
        LLILLJJLI = new C2254308sP(enumC1255640imQArr);
    }

    public static EnumC1255640imQ[] values() {
        return (EnumC1255640imQ[]) LL.clone();
    }

    public static EnumC1255640imQ valueOf(String str) {
        return (EnumC1255640imQ) C08FF.LIZ(EnumC1255640imQ.class, str);
    }

    public EnumC1255640imQ(String str, int i) {
    }
}
