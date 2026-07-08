package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Se9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC726190Se9 {
    public static final EnumC726190Se9 HIDE;
    public static final /* synthetic */ EnumC726190Se9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC726190Se9 SHOW_FULL_ENTRANCE;
    public static final EnumC726190Se9 SHOW_ICON_ONLY;

    public static InterfaceC2044707zh<EnumC726190Se9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC726190Se9 enumC726190Se9 = new EnumC726190Se9("SHOW_ICON_ONLY", 0);
        SHOW_ICON_ONLY = enumC726190Se9;
        EnumC726190Se9 enumC726190Se92 = new EnumC726190Se9("SHOW_FULL_ENTRANCE", 1);
        SHOW_FULL_ENTRANCE = enumC726190Se92;
        EnumC726190Se9 enumC726190Se93 = new EnumC726190Se9("HIDE", 2);
        HIDE = enumC726190Se93;
        EnumC726190Se9[] enumC726190Se9Arr = {enumC726190Se9, enumC726190Se92, enumC726190Se93};
        LL = enumC726190Se9Arr;
        LLILLJJLI = new C2254308sP(enumC726190Se9Arr);
    }

    public static EnumC726190Se9[] values() {
        return (EnumC726190Se9[]) LL.clone();
    }

    public static EnumC726190Se9 valueOf(String str) {
        return (EnumC726190Se9) C08FF.LIZ(EnumC726190Se9.class, str);
    }

    public EnumC726190Se9(String str, int i) {
    }
}
