package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cBZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1002150cBZ {
    public static final EnumC1002150cBZ AUTO;
    public static final EnumC1002150cBZ CLICK;
    public static final /* synthetic */ EnumC1002150cBZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1002150cBZ SLIDE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1002150cBZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1002150cBZ enumC1002150cBZ = new EnumC1002150cBZ("CLICK", 0, "click");
        CLICK = enumC1002150cBZ;
        EnumC1002150cBZ enumC1002150cBZ2 = new EnumC1002150cBZ("SLIDE", 1, "slide");
        SLIDE = enumC1002150cBZ2;
        EnumC1002150cBZ enumC1002150cBZ3 = new EnumC1002150cBZ("AUTO", 2, "auto");
        AUTO = enumC1002150cBZ3;
        EnumC1002150cBZ[] enumC1002150cBZArr = {enumC1002150cBZ, enumC1002150cBZ2, enumC1002150cBZ3};
        LLILLJJLI = enumC1002150cBZArr;
        LLILLL = new C2254308sP(enumC1002150cBZArr);
    }

    public static EnumC1002150cBZ[] values() {
        return (EnumC1002150cBZ[]) LLILLJJLI.clone();
    }

    public final String getMob() {
        return this.LL;
    }

    public static EnumC1002150cBZ valueOf(String str) {
        return (EnumC1002150cBZ) C08FF.LIZ(EnumC1002150cBZ.class, str);
    }

    public EnumC1002150cBZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
