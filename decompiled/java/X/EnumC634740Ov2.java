package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ov2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC634740Ov2 {
    public static final EnumC634740Ov2 LARGE;
    public static final /* synthetic */ EnumC634740Ov2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC634740Ov2 SMALL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC634740Ov2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC634740Ov2 enumC634740Ov2 = new EnumC634740Ov2("SMALL", 0, 1);
        SMALL = enumC634740Ov2;
        EnumC634740Ov2 enumC634740Ov22 = new EnumC634740Ov2("LARGE", 1, 2);
        LARGE = enumC634740Ov22;
        EnumC634740Ov2[] enumC634740Ov2Arr = {enumC634740Ov2, enumC634740Ov22};
        LLILLJJLI = enumC634740Ov2Arr;
        LLILLL = new C2254308sP(enumC634740Ov2Arr);
    }

    public static EnumC634740Ov2[] values() {
        return (EnumC634740Ov2[]) LLILLJJLI.clone();
    }

    public final int getStyle() {
        return this.LL;
    }

    public static EnumC634740Ov2 valueOf(String str) {
        return (EnumC634740Ov2) C08FF.LIZ(EnumC634740Ov2.class, str);
    }

    public EnumC634740Ov2(String str, int i, int i2) {
        this.LL = i2;
    }
}
