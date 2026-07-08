package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14wm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20429414wm {
    public static final EnumC20429414wm DETAIL;
    public static final EnumC20429414wm FAVORITE_LIST;
    public static final EnumC20429414wm GO_LIVE_ANCHOR_LIST;
    public static final /* synthetic */ EnumC20429414wm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20429414wm POLYMERIZATION;

    public static InterfaceC2044707zh<EnumC20429414wm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20429414wm enumC20429414wm = new EnumC20429414wm("DETAIL", 0);
        DETAIL = enumC20429414wm;
        EnumC20429414wm enumC20429414wm2 = new EnumC20429414wm("POLYMERIZATION", 1);
        POLYMERIZATION = enumC20429414wm2;
        EnumC20429414wm enumC20429414wm3 = new EnumC20429414wm("FAVORITE_LIST", 2);
        FAVORITE_LIST = enumC20429414wm3;
        EnumC20429414wm enumC20429414wm4 = new EnumC20429414wm("GO_LIVE_ANCHOR_LIST", 3);
        GO_LIVE_ANCHOR_LIST = enumC20429414wm4;
        EnumC20429414wm[] enumC20429414wmArr = {enumC20429414wm, enumC20429414wm2, enumC20429414wm3, enumC20429414wm4};
        LL = enumC20429414wmArr;
        LLILLJJLI = new C2254308sP(enumC20429414wmArr);
    }

    public static EnumC20429414wm[] values() {
        return (EnumC20429414wm[]) LL.clone();
    }

    public static EnumC20429414wm valueOf(String str) {
        return (EnumC20429414wm) C08FF.LIZ(EnumC20429414wm.class, str);
    }

    public EnumC20429414wm(String str, int i) {
    }
}
