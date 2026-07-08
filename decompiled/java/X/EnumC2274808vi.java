package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08vi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2274808vi {
    public static final /* synthetic */ EnumC2274808vi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2274808vi NONE;
    public static final EnumC2274808vi PANEL_PIC;

    public static InterfaceC2044707zh<EnumC2274808vi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2274808vi enumC2274808vi = new EnumC2274808vi("NONE", 0);
        NONE = enumC2274808vi;
        EnumC2274808vi enumC2274808vi2 = new EnumC2274808vi("PANEL_PIC", 1);
        PANEL_PIC = enumC2274808vi2;
        EnumC2274808vi[] enumC2274808viArr = {enumC2274808vi, enumC2274808vi2};
        LL = enumC2274808viArr;
        LLILLJJLI = new C2254308sP(enumC2274808viArr);
    }

    public static EnumC2274808vi[] values() {
        return (EnumC2274808vi[]) LL.clone();
    }

    public static EnumC2274808vi valueOf(String str) {
        return (EnumC2274808vi) C08FF.LIZ(EnumC2274808vi.class, str);
    }

    public EnumC2274808vi(String str, int i) {
    }
}
