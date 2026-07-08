package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vlW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1754800vlW {
    public static final EnumC1754800vlW DRAG;
    public static final EnumC1754800vlW FLING;
    public static final /* synthetic */ EnumC1754800vlW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1754800vlW STOP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1754800vlW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1754800vlW enumC1754800vlW = new EnumC1754800vlW("STOP", 0, 1);
        STOP = enumC1754800vlW;
        EnumC1754800vlW enumC1754800vlW2 = new EnumC1754800vlW("DRAG", 1, 2);
        DRAG = enumC1754800vlW2;
        EnumC1754800vlW enumC1754800vlW3 = new EnumC1754800vlW("FLING", 2, 3);
        FLING = enumC1754800vlW3;
        EnumC1754800vlW[] enumC1754800vlWArr = {enumC1754800vlW, enumC1754800vlW2, enumC1754800vlW3};
        LLILLJJLI = enumC1754800vlWArr;
        LLILLL = new C2254308sP(enumC1754800vlWArr);
    }

    public static EnumC1754800vlW[] values() {
        return (EnumC1754800vlW[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1754800vlW valueOf(String str) {
        return (EnumC1754800vlW) C08FF.LIZ(EnumC1754800vlW.class, str);
    }

    public EnumC1754800vlW(String str, int i, int i2) {
        this.LL = i2;
    }
}
