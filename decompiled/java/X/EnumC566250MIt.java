package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC566250MIt {
    public static final EnumC566250MIt GENERATED;
    public static final EnumC566250MIt GENERATING;
    public static final /* synthetic */ EnumC566250MIt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC566250MIt NONE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC566250MIt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC566250MIt enumC566250MIt = new EnumC566250MIt("NONE", 0, 0);
        NONE = enumC566250MIt;
        EnumC566250MIt enumC566250MIt2 = new EnumC566250MIt("GENERATING", 1, 1);
        GENERATING = enumC566250MIt2;
        EnumC566250MIt enumC566250MIt3 = new EnumC566250MIt("GENERATED", 2, 2);
        GENERATED = enumC566250MIt3;
        EnumC566250MIt[] enumC566250MItArr = {enumC566250MIt, enumC566250MIt2, enumC566250MIt3};
        LLILLJJLI = enumC566250MItArr;
        LLILLL = new C2254308sP(enumC566250MItArr);
    }

    public static EnumC566250MIt[] values() {
        return (EnumC566250MIt[]) LLILLJJLI.clone();
    }

    public final int getMobValue() {
        return this.LL;
    }

    public static EnumC566250MIt valueOf(String str) {
        return (EnumC566250MIt) C08FF.LIZ(EnumC566250MIt.class, str);
    }

    public EnumC566250MIt(String str, int i, int i2) {
        this.LL = i2;
    }
}
