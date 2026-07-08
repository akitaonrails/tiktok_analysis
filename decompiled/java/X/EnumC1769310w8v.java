package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1769310w8v {
    public static final EnumC1769310w8v HIDDEN;
    public static final EnumC1769310w8v HIDE_ANIMATION_RUNNING;
    public static final /* synthetic */ EnumC1769310w8v[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1769310w8v SHOW_ANIMATION_RUNNING;
    public static final EnumC1769310w8v STAYING;

    public static InterfaceC2044707zh<EnumC1769310w8v> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1769310w8v enumC1769310w8v = new EnumC1769310w8v("SHOW_ANIMATION_RUNNING", 0);
        SHOW_ANIMATION_RUNNING = enumC1769310w8v;
        EnumC1769310w8v enumC1769310w8v2 = new EnumC1769310w8v("STAYING", 1);
        STAYING = enumC1769310w8v2;
        EnumC1769310w8v enumC1769310w8v3 = new EnumC1769310w8v("HIDE_ANIMATION_RUNNING", 2);
        HIDE_ANIMATION_RUNNING = enumC1769310w8v3;
        EnumC1769310w8v enumC1769310w8v4 = new EnumC1769310w8v("HIDDEN", 3);
        HIDDEN = enumC1769310w8v4;
        EnumC1769310w8v[] enumC1769310w8vArr = {enumC1769310w8v, enumC1769310w8v2, enumC1769310w8v3, enumC1769310w8v4};
        LL = enumC1769310w8vArr;
        LLILLJJLI = new C2254308sP(enumC1769310w8vArr);
    }

    public static EnumC1769310w8v[] values() {
        return (EnumC1769310w8v[]) LL.clone();
    }

    public static EnumC1769310w8v valueOf(String str) {
        return (EnumC1769310w8v) C08FF.LIZ(EnumC1769310w8v.class, str);
    }

    public EnumC1769310w8v(String str, int i) {
    }
}
