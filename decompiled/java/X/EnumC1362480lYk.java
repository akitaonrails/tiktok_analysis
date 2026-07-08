package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1362480lYk {
    public static final /* synthetic */ EnumC1362480lYk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1362480lYk NONE;
    public static final EnumC1362480lYk SELECTED;
    public static final EnumC1362480lYk SHOW_ACTIVE;

    public static InterfaceC2044707zh<EnumC1362480lYk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1362480lYk enumC1362480lYk = new EnumC1362480lYk("NONE", 0);
        NONE = enumC1362480lYk;
        EnumC1362480lYk enumC1362480lYk2 = new EnumC1362480lYk("SELECTED", 1);
        SELECTED = enumC1362480lYk2;
        EnumC1362480lYk enumC1362480lYk3 = new EnumC1362480lYk("SHOW_ACTIVE", 2);
        SHOW_ACTIVE = enumC1362480lYk3;
        EnumC1362480lYk[] enumC1362480lYkArr = {enumC1362480lYk, enumC1362480lYk2, enumC1362480lYk3};
        LL = enumC1362480lYkArr;
        LLILLJJLI = new C2254308sP(enumC1362480lYkArr);
    }

    public static EnumC1362480lYk[] values() {
        return (EnumC1362480lYk[]) LL.clone();
    }

    public static EnumC1362480lYk valueOf(String str) {
        return (EnumC1362480lYk) C08FF.LIZ(EnumC1362480lYk.class, str);
    }

    public EnumC1362480lYk(String str, int i) {
    }
}
