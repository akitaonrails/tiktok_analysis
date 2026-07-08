package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rXW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1592360rXW {
    public static final EnumC1592360rXW COMPACT;
    public static final EnumC1592360rXW FLOAT;
    public static final /* synthetic */ EnumC1592360rXW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1592360rXW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1592360rXW enumC1592360rXW = new EnumC1592360rXW("COMPACT", 0);
        COMPACT = enumC1592360rXW;
        EnumC1592360rXW enumC1592360rXW2 = new EnumC1592360rXW("FLOAT", 1);
        FLOAT = enumC1592360rXW2;
        EnumC1592360rXW[] enumC1592360rXWArr = {enumC1592360rXW, enumC1592360rXW2};
        LL = enumC1592360rXWArr;
        LLILLJJLI = new C2254308sP(enumC1592360rXWArr);
    }

    public static EnumC1592360rXW[] values() {
        return (EnumC1592360rXW[]) LL.clone();
    }

    public static EnumC1592360rXW valueOf(String str) {
        return (EnumC1592360rXW) C08FF.LIZ(EnumC1592360rXW.class, str);
    }

    public EnumC1592360rXW(String str, int i) {
    }
}
