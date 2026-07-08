package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992070bvJ {
    public static final /* synthetic */ EnumC992070bvJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992070bvJ TO_BOTTOM;
    public static final EnumC992070bvJ TO_LEFT;
    public static final EnumC992070bvJ TO_RIGHT;
    public static final EnumC992070bvJ TO_TOP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992070bvJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992070bvJ enumC992070bvJ = new EnumC992070bvJ("TO_LEFT", 0, 1);
        TO_LEFT = enumC992070bvJ;
        EnumC992070bvJ enumC992070bvJ2 = new EnumC992070bvJ("TO_RIGHT", 1, 2);
        TO_RIGHT = enumC992070bvJ2;
        EnumC992070bvJ enumC992070bvJ3 = new EnumC992070bvJ("TO_TOP", 2, 3);
        TO_TOP = enumC992070bvJ3;
        EnumC992070bvJ enumC992070bvJ4 = new EnumC992070bvJ("TO_BOTTOM", 3, 4);
        TO_BOTTOM = enumC992070bvJ4;
        EnumC992070bvJ[] enumC992070bvJArr = {enumC992070bvJ, enumC992070bvJ2, enumC992070bvJ3, enumC992070bvJ4};
        LLILLJJLI = enumC992070bvJArr;
        LLILLL = new C2254308sP(enumC992070bvJArr);
    }

    public static EnumC992070bvJ[] values() {
        return (EnumC992070bvJ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992070bvJ valueOf(String str) {
        return (EnumC992070bvJ) C08FF.LIZ(EnumC992070bvJ.class, str);
    }

    public EnumC992070bvJ(String str, int i, int i2) {
        this.LL = i2;
    }
}
