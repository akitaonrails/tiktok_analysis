package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC745000TKg {
    public static final EnumC745000TKg DISPLAY;
    public static final /* synthetic */ EnumC745000TKg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC745000TKg NO_INTERACT;
    public static final EnumC745000TKg USER_INTERACT;

    public static InterfaceC2044707zh<EnumC745000TKg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC745000TKg enumC745000TKg = new EnumC745000TKg("DISPLAY", 0);
        DISPLAY = enumC745000TKg;
        EnumC745000TKg enumC745000TKg2 = new EnumC745000TKg("NO_INTERACT", 1);
        NO_INTERACT = enumC745000TKg2;
        EnumC745000TKg enumC745000TKg3 = new EnumC745000TKg("USER_INTERACT", 2);
        USER_INTERACT = enumC745000TKg3;
        EnumC745000TKg[] enumC745000TKgArr = {enumC745000TKg, enumC745000TKg2, enumC745000TKg3};
        LL = enumC745000TKgArr;
        LLILLJJLI = new C2254308sP(enumC745000TKgArr);
    }

    public static EnumC745000TKg[] values() {
        return (EnumC745000TKg[]) LL.clone();
    }

    public static EnumC745000TKg valueOf(String str) {
        return (EnumC745000TKg) C08FF.LIZ(EnumC745000TKg.class, str);
    }

    public EnumC745000TKg(String str, int i) {
    }
}
