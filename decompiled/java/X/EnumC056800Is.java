package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Is, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC056800Is {
    public static final EnumC056800Is FAST_1;
    public static final EnumC056800Is FAST_2;
    public static final /* synthetic */ EnumC056800Is[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC056800Is NORMAL;
    public final float LL;

    public static InterfaceC2044707zh<EnumC056800Is> getEntries() {
        return LLILLL;
    }

    static {
        EnumC056800Is enumC056800Is = new EnumC056800Is(1.0f, "NORMAL", 0);
        NORMAL = enumC056800Is;
        EnumC056800Is enumC056800Is2 = new EnumC056800Is(1.666667f, "FAST_1", 1);
        FAST_1 = enumC056800Is2;
        EnumC056800Is enumC056800Is3 = new EnumC056800Is(3.333333f, "FAST_2", 2);
        FAST_2 = enumC056800Is3;
        EnumC056800Is[] enumC056800IsArr = {enumC056800Is, enumC056800Is2, enumC056800Is3};
        LLILLJJLI = enumC056800IsArr;
        LLILLL = new C2254308sP(enumC056800IsArr);
    }

    public static EnumC056800Is[] values() {
        return (EnumC056800Is[]) LLILLJJLI.clone();
    }

    public final float getSpeed() {
        return this.LL;
    }

    public static EnumC056800Is valueOf(String str) {
        return (EnumC056800Is) C08FF.LIZ(EnumC056800Is.class, str);
    }

    public EnumC056800Is(float f, String str, int i) {
        this.LL = f;
    }
}
