package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC699470Rc9 {
    public static final EnumC699470Rc9 AVAILABLE;
    public static final /* synthetic */ EnumC699470Rc9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC699470Rc9 UNAVAILABLE;

    public static InterfaceC2044707zh<EnumC699470Rc9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC699470Rc9 enumC699470Rc9 = new EnumC699470Rc9("AVAILABLE", 0);
        AVAILABLE = enumC699470Rc9;
        EnumC699470Rc9 enumC699470Rc92 = new EnumC699470Rc9("UNAVAILABLE", 1);
        UNAVAILABLE = enumC699470Rc92;
        EnumC699470Rc9[] enumC699470Rc9Arr = {enumC699470Rc9, enumC699470Rc92};
        LL = enumC699470Rc9Arr;
        LLILLJJLI = new C2254308sP(enumC699470Rc9Arr);
    }

    public static EnumC699470Rc9[] values() {
        return (EnumC699470Rc9[]) LL.clone();
    }

    public static EnumC699470Rc9 valueOf(String str) {
        return (EnumC699470Rc9) C08FF.LIZ(EnumC699470Rc9.class, str);
    }

    public EnumC699470Rc9(String str, int i) {
    }
}
