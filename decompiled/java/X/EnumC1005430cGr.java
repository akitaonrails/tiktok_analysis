package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1005430cGr {
    public static final EnumC1005430cGr ENTER_FROM;
    public static final /* synthetic */ EnumC1005430cGr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1005430cGr REFER;

    public static InterfaceC2044707zh<EnumC1005430cGr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1005430cGr enumC1005430cGr = new EnumC1005430cGr("ENTER_FROM", 0);
        ENTER_FROM = enumC1005430cGr;
        EnumC1005430cGr enumC1005430cGr2 = new EnumC1005430cGr("REFER", 1);
        REFER = enumC1005430cGr2;
        EnumC1005430cGr[] enumC1005430cGrArr = {enumC1005430cGr, enumC1005430cGr2};
        LL = enumC1005430cGrArr;
        LLILLJJLI = new C2254308sP(enumC1005430cGrArr);
    }

    public static EnumC1005430cGr[] values() {
        return (EnumC1005430cGr[]) LL.clone();
    }

    public static EnumC1005430cGr valueOf(String str) {
        return (EnumC1005430cGr) C08FF.LIZ(EnumC1005430cGr.class, str);
    }

    public EnumC1005430cGr(String str, int i) {
    }
}
