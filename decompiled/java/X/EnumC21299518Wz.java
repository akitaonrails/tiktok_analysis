package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18Wz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21299518Wz {
    public static final EnumC21299518Wz COLLAPSED;
    public static final EnumC21299518Wz DRAGGING;
    public static final EnumC21299518Wz EXPANDED;
    public static final EnumC21299518Wz HIDDEN;
    public static final /* synthetic */ EnumC21299518Wz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21299518Wz PRE_HIDING;
    public static final EnumC21299518Wz SETTLING;

    public static InterfaceC2044707zh<EnumC21299518Wz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21299518Wz enumC21299518Wz = new EnumC21299518Wz("EXPANDED", 0);
        EXPANDED = enumC21299518Wz;
        EnumC21299518Wz enumC21299518Wz2 = new EnumC21299518Wz("COLLAPSED", 1);
        COLLAPSED = enumC21299518Wz2;
        EnumC21299518Wz enumC21299518Wz3 = new EnumC21299518Wz("PRE_HIDING", 2);
        PRE_HIDING = enumC21299518Wz3;
        EnumC21299518Wz enumC21299518Wz4 = new EnumC21299518Wz("HIDDEN", 3);
        HIDDEN = enumC21299518Wz4;
        EnumC21299518Wz enumC21299518Wz5 = new EnumC21299518Wz("DRAGGING", 4);
        DRAGGING = enumC21299518Wz5;
        EnumC21299518Wz enumC21299518Wz6 = new EnumC21299518Wz("SETTLING", 5);
        SETTLING = enumC21299518Wz6;
        EnumC21299518Wz[] enumC21299518WzArr = {enumC21299518Wz, enumC21299518Wz2, enumC21299518Wz3, enumC21299518Wz4, enumC21299518Wz5, enumC21299518Wz6};
        LL = enumC21299518WzArr;
        LLILLJJLI = new C2254308sP(enumC21299518WzArr);
    }

    public static EnumC21299518Wz[] values() {
        return (EnumC21299518Wz[]) LL.clone();
    }

    public static EnumC21299518Wz valueOf(String str) {
        return (EnumC21299518Wz) C08FF.LIZ(EnumC21299518Wz.class, str);
    }

    public EnumC21299518Wz(String str, int i) {
    }
}
