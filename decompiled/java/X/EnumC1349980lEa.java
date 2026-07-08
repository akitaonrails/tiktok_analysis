package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lEa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1349980lEa {
    public static final EnumC1349980lEa FULL_SHOW_END;
    public static final EnumC1349980lEa HIDE_END;
    public static final EnumC1349980lEa HIDE_START;
    public static final /* synthetic */ EnumC1349980lEa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1349980lEa SHOW_CANCEL;
    public static final EnumC1349980lEa SHOW_END;
    public static final EnumC1349980lEa SHOW_START;

    public static InterfaceC2044707zh<EnumC1349980lEa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1349980lEa enumC1349980lEa = new EnumC1349980lEa("SHOW_START", 0);
        SHOW_START = enumC1349980lEa;
        EnumC1349980lEa enumC1349980lEa2 = new EnumC1349980lEa("SHOW_END", 1);
        SHOW_END = enumC1349980lEa2;
        EnumC1349980lEa enumC1349980lEa3 = new EnumC1349980lEa("SHOW_CANCEL", 2);
        SHOW_CANCEL = enumC1349980lEa3;
        EnumC1349980lEa enumC1349980lEa4 = new EnumC1349980lEa("HIDE_START", 3);
        HIDE_START = enumC1349980lEa4;
        EnumC1349980lEa enumC1349980lEa5 = new EnumC1349980lEa("HIDE_END", 4);
        HIDE_END = enumC1349980lEa5;
        EnumC1349980lEa enumC1349980lEa6 = new EnumC1349980lEa("FULL_SHOW_END", 5);
        FULL_SHOW_END = enumC1349980lEa6;
        EnumC1349980lEa[] enumC1349980lEaArr = {enumC1349980lEa, enumC1349980lEa2, enumC1349980lEa3, enumC1349980lEa4, enumC1349980lEa5, enumC1349980lEa6};
        LL = enumC1349980lEaArr;
        LLILLJJLI = new C2254308sP(enumC1349980lEaArr);
    }

    public static EnumC1349980lEa[] values() {
        return (EnumC1349980lEa[]) LL.clone();
    }

    public static EnumC1349980lEa valueOf(String str) {
        return (EnumC1349980lEa) C08FF.LIZ(EnumC1349980lEa.class, str);
    }

    public EnumC1349980lEa(String str, int i) {
    }
}
