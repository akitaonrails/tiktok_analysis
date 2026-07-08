package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d61, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1037150d61 {
    public static final EnumC1037150d61 INVISIBLE;
    public static final /* synthetic */ EnumC1037150d61[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1037150d61 SLIDING;
    public static final EnumC1037150d61 UNKNOWN;
    public static final EnumC1037150d61 VISIBLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1037150d61> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1037150d61 enumC1037150d61 = new EnumC1037150d61("UNKNOWN", 0, -1);
        UNKNOWN = enumC1037150d61;
        EnumC1037150d61 enumC1037150d612 = new EnumC1037150d61("INVISIBLE", 1, 0);
        INVISIBLE = enumC1037150d612;
        EnumC1037150d61 enumC1037150d613 = new EnumC1037150d61("VISIBLE", 2, 1);
        VISIBLE = enumC1037150d613;
        EnumC1037150d61 enumC1037150d614 = new EnumC1037150d61("SLIDING", 3, 2);
        SLIDING = enumC1037150d614;
        EnumC1037150d61[] enumC1037150d61Arr = {enumC1037150d61, enumC1037150d612, enumC1037150d613, enumC1037150d614};
        LLILLJJLI = enumC1037150d61Arr;
        LLILLL = new C2254308sP(enumC1037150d61Arr);
    }

    public static EnumC1037150d61[] values() {
        return (EnumC1037150d61[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1037150d61 valueOf(String str) {
        return (EnumC1037150d61) C08FF.LIZ(EnumC1037150d61.class, str);
    }

    public EnumC1037150d61(String str, int i, int i2) {
        this.LL = i2;
    }
}
