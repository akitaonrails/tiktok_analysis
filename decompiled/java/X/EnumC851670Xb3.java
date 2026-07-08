package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xb3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC851670Xb3 {
    public static final EnumC851670Xb3 Error;
    public static final /* synthetic */ EnumC851670Xb3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC851670Xb3 None;
    public static final EnumC851670Xb3 Success;

    public static InterfaceC2044707zh<EnumC851670Xb3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC851670Xb3 enumC851670Xb3 = new EnumC851670Xb3("Error", 0);
        Error = enumC851670Xb3;
        EnumC851670Xb3 enumC851670Xb32 = new EnumC851670Xb3("Success", 1);
        Success = enumC851670Xb32;
        EnumC851670Xb3 enumC851670Xb33 = new EnumC851670Xb3("None", 2);
        None = enumC851670Xb33;
        EnumC851670Xb3[] enumC851670Xb3Arr = {enumC851670Xb3, enumC851670Xb32, enumC851670Xb33};
        LL = enumC851670Xb3Arr;
        LLILLJJLI = new C2254308sP(enumC851670Xb3Arr);
    }

    public static EnumC851670Xb3[] values() {
        return (EnumC851670Xb3[]) LL.clone();
    }

    public static EnumC851670Xb3 valueOf(String str) {
        return (EnumC851670Xb3) C08FF.LIZ(EnumC851670Xb3.class, str);
    }

    public EnumC851670Xb3(String str, int i) {
    }
}
