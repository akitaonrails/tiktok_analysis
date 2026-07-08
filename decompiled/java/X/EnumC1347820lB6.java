package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lB6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1347820lB6 {
    public static final EnumC1347820lB6 HIDE;
    public static final EnumC1347820lB6 INIT;
    public static final /* synthetic */ EnumC1347820lB6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1347820lB6 SHOW;

    public static InterfaceC2044707zh<EnumC1347820lB6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1347820lB6 enumC1347820lB6 = new EnumC1347820lB6("INIT", 0);
        INIT = enumC1347820lB6;
        EnumC1347820lB6 enumC1347820lB62 = new EnumC1347820lB6("SHOW", 1);
        SHOW = enumC1347820lB62;
        EnumC1347820lB6 enumC1347820lB63 = new EnumC1347820lB6("HIDE", 2);
        HIDE = enumC1347820lB63;
        EnumC1347820lB6[] enumC1347820lB6Arr = {enumC1347820lB6, enumC1347820lB62, enumC1347820lB63};
        LL = enumC1347820lB6Arr;
        LLILLJJLI = new C2254308sP(enumC1347820lB6Arr);
    }

    public static EnumC1347820lB6[] values() {
        return (EnumC1347820lB6[]) LL.clone();
    }

    public static EnumC1347820lB6 valueOf(String str) {
        return (EnumC1347820lB6) C08FF.LIZ(EnumC1347820lB6.class, str);
    }

    public EnumC1347820lB6(String str, int i) {
    }
}
