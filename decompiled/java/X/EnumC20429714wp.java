package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14wp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20429714wp {
    public static final EnumC20429714wp INTERACTION;
    public static final /* synthetic */ EnumC20429714wp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20429714wp MULTI_GUEST_FUN_KIT;
    public static final EnumC20429714wp MULTI_GUEST_ICON;

    public static InterfaceC2044707zh<EnumC20429714wp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20429714wp enumC20429714wp = new EnumC20429714wp("MULTI_GUEST_ICON", 0);
        MULTI_GUEST_ICON = enumC20429714wp;
        EnumC20429714wp enumC20429714wp2 = new EnumC20429714wp("MULTI_GUEST_FUN_KIT", 1);
        MULTI_GUEST_FUN_KIT = enumC20429714wp2;
        EnumC20429714wp enumC20429714wp3 = new EnumC20429714wp("INTERACTION", 2);
        INTERACTION = enumC20429714wp3;
        EnumC20429714wp[] enumC20429714wpArr = {enumC20429714wp, enumC20429714wp2, enumC20429714wp3};
        LL = enumC20429714wpArr;
        LLILLJJLI = new C2254308sP(enumC20429714wpArr);
    }

    public static EnumC20429714wp[] values() {
        return (EnumC20429714wp[]) LL.clone();
    }

    public static EnumC20429714wp valueOf(String str) {
        return (EnumC20429714wp) C08FF.LIZ(EnumC20429714wp.class, str);
    }

    public EnumC20429714wp(String str, int i) {
    }
}
