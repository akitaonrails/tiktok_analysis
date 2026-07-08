package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m7W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1384040m7W {
    public static final EnumC1384040m7W APPEND;
    public static final /* synthetic */ EnumC1384040m7W[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1384040m7W NONE;
    public static final EnumC1384040m7W RESET;

    public static InterfaceC2044707zh<EnumC1384040m7W> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1384040m7W enumC1384040m7W = new EnumC1384040m7W("NONE", 0);
        NONE = enumC1384040m7W;
        EnumC1384040m7W enumC1384040m7W2 = new EnumC1384040m7W("APPEND", 1);
        APPEND = enumC1384040m7W2;
        EnumC1384040m7W enumC1384040m7W3 = new EnumC1384040m7W("RESET", 2);
        RESET = enumC1384040m7W3;
        EnumC1384040m7W[] enumC1384040m7WArr = {enumC1384040m7W, enumC1384040m7W2, enumC1384040m7W3};
        LL = enumC1384040m7WArr;
        LLILLJJLI = new C2254308sP(enumC1384040m7WArr);
    }

    public static EnumC1384040m7W[] values() {
        return (EnumC1384040m7W[]) LL.clone();
    }

    public static EnumC1384040m7W valueOf(String str) {
        return (EnumC1384040m7W) C08FF.LIZ(EnumC1384040m7W.class, str);
    }

    public EnumC1384040m7W(String str, int i) {
    }
}
