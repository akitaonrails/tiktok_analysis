package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mX6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1399900mX6 {
    public static final EnumC1399900mX6 GONE;
    public static final /* synthetic */ EnumC1399900mX6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1399900mX6 VISIBLE;
    public static final EnumC1399900mX6 VISIBLE_AFTER_10S;
    public static final EnumC1399900mX6 VISIBLE_AFTER_5S;

    public static InterfaceC2044707zh<EnumC1399900mX6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1399900mX6 enumC1399900mX6 = new EnumC1399900mX6("GONE", 0);
        GONE = enumC1399900mX6;
        EnumC1399900mX6 enumC1399900mX62 = new EnumC1399900mX6("VISIBLE", 1);
        VISIBLE = enumC1399900mX62;
        EnumC1399900mX6 enumC1399900mX63 = new EnumC1399900mX6("VISIBLE_AFTER_5S", 2);
        VISIBLE_AFTER_5S = enumC1399900mX63;
        EnumC1399900mX6 enumC1399900mX64 = new EnumC1399900mX6("VISIBLE_AFTER_10S", 3);
        VISIBLE_AFTER_10S = enumC1399900mX64;
        EnumC1399900mX6[] enumC1399900mX6Arr = {enumC1399900mX6, enumC1399900mX62, enumC1399900mX63, enumC1399900mX64};
        LL = enumC1399900mX6Arr;
        LLILLJJLI = new C2254308sP(enumC1399900mX6Arr);
    }

    public static EnumC1399900mX6[] values() {
        return (EnumC1399900mX6[]) LL.clone();
    }

    public static EnumC1399900mX6 valueOf(String str) {
        return (EnumC1399900mX6) C08FF.LIZ(EnumC1399900mX6.class, str);
    }

    public EnumC1399900mX6(String str, int i) {
    }
}
