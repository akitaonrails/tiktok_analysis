package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aGk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC928480aGk {
    public static final EnumC928480aGk BUBBLE_ABOVE_MULTI;
    public static final EnumC928480aGk BUBBLE_ABOVE_SHARE;
    public static final EnumC928480aGk GUEST_PANEL;
    public static final /* synthetic */ EnumC928480aGk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC928480aGk SHARE_PANEL;

    public static InterfaceC2044707zh<EnumC928480aGk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC928480aGk enumC928480aGk = new EnumC928480aGk("GUEST_PANEL", 0);
        GUEST_PANEL = enumC928480aGk;
        EnumC928480aGk enumC928480aGk2 = new EnumC928480aGk("SHARE_PANEL", 1);
        SHARE_PANEL = enumC928480aGk2;
        EnumC928480aGk enumC928480aGk3 = new EnumC928480aGk("BUBBLE_ABOVE_MULTI", 2);
        BUBBLE_ABOVE_MULTI = enumC928480aGk3;
        EnumC928480aGk enumC928480aGk4 = new EnumC928480aGk("BUBBLE_ABOVE_SHARE", 3);
        BUBBLE_ABOVE_SHARE = enumC928480aGk4;
        EnumC928480aGk[] enumC928480aGkArr = {enumC928480aGk, enumC928480aGk2, enumC928480aGk3, enumC928480aGk4};
        LL = enumC928480aGkArr;
        LLILLJJLI = new C2254308sP(enumC928480aGkArr);
    }

    public static EnumC928480aGk[] values() {
        return (EnumC928480aGk[]) LL.clone();
    }

    public static EnumC928480aGk valueOf(String str) {
        return (EnumC928480aGk) C08FF.LIZ(EnumC928480aGk.class, str);
    }

    public EnumC928480aGk(String str, int i) {
    }
}
