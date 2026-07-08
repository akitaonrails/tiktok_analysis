package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC388580FLk {
    public static final EnumC388580FLk CLOSE;
    public static final /* synthetic */ EnumC388580FLk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC388580FLk NONE;
    public static final EnumC388580FLk ONLY_EDITOR;
    public static final EnumC388580FLk ONLY_PANEL;
    public static final EnumC388580FLk PANEL_EDITOR;

    public static InterfaceC2044707zh<EnumC388580FLk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC388580FLk enumC388580FLk = new EnumC388580FLk("NONE", 0);
        NONE = enumC388580FLk;
        EnumC388580FLk enumC388580FLk2 = new EnumC388580FLk("CLOSE", 1);
        CLOSE = enumC388580FLk2;
        EnumC388580FLk enumC388580FLk3 = new EnumC388580FLk("PANEL_EDITOR", 2);
        PANEL_EDITOR = enumC388580FLk3;
        EnumC388580FLk enumC388580FLk4 = new EnumC388580FLk("ONLY_EDITOR", 3);
        ONLY_EDITOR = enumC388580FLk4;
        EnumC388580FLk enumC388580FLk5 = new EnumC388580FLk("ONLY_PANEL", 4);
        ONLY_PANEL = enumC388580FLk5;
        EnumC388580FLk[] enumC388580FLkArr = {enumC388580FLk, enumC388580FLk2, enumC388580FLk3, enumC388580FLk4, enumC388580FLk5};
        LL = enumC388580FLkArr;
        LLILLJJLI = new C2254308sP(enumC388580FLkArr);
    }

    public static EnumC388580FLk[] values() {
        return (EnumC388580FLk[]) LL.clone();
    }

    public static EnumC388580FLk valueOf(String str) {
        return (EnumC388580FLk) C08FF.LIZ(EnumC388580FLk.class, str);
    }

    public EnumC388580FLk(String str, int i) {
    }
}
