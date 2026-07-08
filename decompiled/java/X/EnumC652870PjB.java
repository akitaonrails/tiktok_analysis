package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PjB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC652870PjB {
    public static final /* synthetic */ EnumC652870PjB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC652870PjB LOADING;
    public static final EnumC652870PjB SCROLL_TO_OPEN;

    public static InterfaceC2044707zh<EnumC652870PjB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC652870PjB enumC652870PjB = new EnumC652870PjB("LOADING", 0);
        LOADING = enumC652870PjB;
        EnumC652870PjB enumC652870PjB2 = new EnumC652870PjB("SCROLL_TO_OPEN", 1);
        SCROLL_TO_OPEN = enumC652870PjB2;
        EnumC652870PjB[] enumC652870PjBArr = {enumC652870PjB, enumC652870PjB2};
        LL = enumC652870PjBArr;
        LLILLJJLI = new C2254308sP(enumC652870PjBArr);
    }

    public static EnumC652870PjB[] values() {
        return (EnumC652870PjB[]) LL.clone();
    }

    public static EnumC652870PjB valueOf(String str) {
        return (EnumC652870PjB) C08FF.LIZ(EnumC652870PjB.class, str);
    }

    public EnumC652870PjB(String str, int i) {
    }
}
