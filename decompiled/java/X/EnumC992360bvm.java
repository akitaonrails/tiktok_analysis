package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992360bvm {
    public static final /* synthetic */ EnumC992360bvm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992360bvm NONE;
    public static final EnumC992360bvm STANDARD;

    public static InterfaceC2044707zh<EnumC992360bvm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992360bvm enumC992360bvm = new EnumC992360bvm("NONE", 0);
        NONE = enumC992360bvm;
        EnumC992360bvm enumC992360bvm2 = new EnumC992360bvm("STANDARD", 1);
        STANDARD = enumC992360bvm2;
        EnumC992360bvm[] enumC992360bvmArr = {enumC992360bvm, enumC992360bvm2};
        LL = enumC992360bvmArr;
        LLILLJJLI = new C2254308sP(enumC992360bvmArr);
    }

    public static EnumC992360bvm[] values() {
        return (EnumC992360bvm[]) LL.clone();
    }

    public static EnumC992360bvm valueOf(String str) {
        return (EnumC992360bvm) C08FF.LIZ(EnumC992360bvm.class, str);
    }

    public EnumC992360bvm(String str, int i) {
    }
}
