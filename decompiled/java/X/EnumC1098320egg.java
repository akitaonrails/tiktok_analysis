package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0egg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1098320egg {
    public static final EnumC1098320egg HYBRID;
    public static final /* synthetic */ EnumC1098320egg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1098320egg NATIVE;

    public static InterfaceC2044707zh<EnumC1098320egg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1098320egg enumC1098320egg = new EnumC1098320egg("HYBRID", 0);
        HYBRID = enumC1098320egg;
        EnumC1098320egg enumC1098320egg2 = new EnumC1098320egg("NATIVE", 1);
        NATIVE = enumC1098320egg2;
        EnumC1098320egg[] enumC1098320eggArr = {enumC1098320egg, enumC1098320egg2};
        LL = enumC1098320eggArr;
        LLILLJJLI = new C2254308sP(enumC1098320eggArr);
    }

    public static EnumC1098320egg[] values() {
        return (EnumC1098320egg[]) LL.clone();
    }

    public static EnumC1098320egg valueOf(String str) {
        return (EnumC1098320egg) C08FF.LIZ(EnumC1098320egg.class, str);
    }

    public EnumC1098320egg(String str, int i) {
    }
}
