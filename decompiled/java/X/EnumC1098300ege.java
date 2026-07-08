package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ege, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1098300ege {
    public static final C1098430egr Companion;
    public static final EnumC1098300ege HYBRID;
    public static final /* synthetic */ EnumC1098300ege[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1098300ege NATIVE;
    public static final EnumC1098300ege NATIVE_DROP_DYNAMIC;
    public static final EnumC1098300ege NATIVE_WHEN_ALL_STATIC;
    public static final EnumC1098300ege NATIVE_WHEN_HIGH_LOAD;

    public static InterfaceC2044707zh<EnumC1098300ege> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0egr] */
    static {
        EnumC1098300ege enumC1098300ege = new EnumC1098300ege("HYBRID", 0);
        HYBRID = enumC1098300ege;
        EnumC1098300ege enumC1098300ege2 = new EnumC1098300ege("NATIVE_DROP_DYNAMIC", 1);
        NATIVE_DROP_DYNAMIC = enumC1098300ege2;
        EnumC1098300ege enumC1098300ege3 = new EnumC1098300ege("NATIVE_WHEN_ALL_STATIC", 2);
        NATIVE_WHEN_ALL_STATIC = enumC1098300ege3;
        EnumC1098300ege enumC1098300ege4 = new EnumC1098300ege("NATIVE", 3);
        NATIVE = enumC1098300ege4;
        EnumC1098300ege enumC1098300ege5 = new EnumC1098300ege("NATIVE_WHEN_HIGH_LOAD", 4);
        NATIVE_WHEN_HIGH_LOAD = enumC1098300ege5;
        EnumC1098300ege[] enumC1098300egeArr = {enumC1098300ege, enumC1098300ege2, enumC1098300ege3, enumC1098300ege4, enumC1098300ege5};
        LL = enumC1098300egeArr;
        LLILLJJLI = new C2254308sP(enumC1098300egeArr);
        Companion = new Object() { // from class: X.0egr
        };
    }

    public static EnumC1098300ege[] values() {
        return (EnumC1098300ege[]) LL.clone();
    }

    public static EnumC1098300ege valueOf(String str) {
        return (EnumC1098300ege) C08FF.LIZ(EnumC1098300ege.class, str);
    }

    public EnumC1098300ege(String str, int i) {
    }
}
