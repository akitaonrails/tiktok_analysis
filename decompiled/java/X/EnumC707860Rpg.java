package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rpg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC707860Rpg {
    public static final /* synthetic */ EnumC707860Rpg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC707860Rpg NORMAL;
    public static final EnumC707860Rpg STANDARD;

    public static InterfaceC2044707zh<EnumC707860Rpg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC707860Rpg enumC707860Rpg = new EnumC707860Rpg("NORMAL", 0);
        NORMAL = enumC707860Rpg;
        EnumC707860Rpg enumC707860Rpg2 = new EnumC707860Rpg("STANDARD", 1);
        STANDARD = enumC707860Rpg2;
        EnumC707860Rpg[] enumC707860RpgArr = {enumC707860Rpg, enumC707860Rpg2};
        LL = enumC707860RpgArr;
        LLILLJJLI = new C2254308sP(enumC707860RpgArr);
    }

    public static EnumC707860Rpg[] values() {
        return (EnumC707860Rpg[]) LL.clone();
    }

    public static EnumC707860Rpg valueOf(String str) {
        return (EnumC707860Rpg) C08FF.LIZ(EnumC707860Rpg.class, str);
    }

    public EnumC707860Rpg(String str, int i) {
    }
}
