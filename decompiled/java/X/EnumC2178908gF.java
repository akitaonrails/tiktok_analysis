package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08gF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2178908gF {
    public static final EnumC2178908gF CLICK;
    public static final EnumC2178908gF CLOSE;
    public static final /* synthetic */ EnumC2178908gF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2178908gF SHOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2178908gF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2178908gF enumC2178908gF = new EnumC2178908gF("CLICK", 0, 0);
        CLICK = enumC2178908gF;
        EnumC2178908gF enumC2178908gF2 = new EnumC2178908gF("CLOSE", 1, 1);
        CLOSE = enumC2178908gF2;
        EnumC2178908gF enumC2178908gF3 = new EnumC2178908gF("SHOW", 2, 2);
        SHOW = enumC2178908gF3;
        EnumC2178908gF[] enumC2178908gFArr = {enumC2178908gF, enumC2178908gF2, enumC2178908gF3};
        LLILLJJLI = enumC2178908gFArr;
        LLILLL = new C2254308sP(enumC2178908gFArr);
    }

    public static EnumC2178908gF[] values() {
        return (EnumC2178908gF[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC2178908gF valueOf(String str) {
        return (EnumC2178908gF) C08FF.LIZ(EnumC2178908gF.class, str);
    }

    public EnumC2178908gF(String str, int i, int i2) {
        this.LL = i2;
    }
}
