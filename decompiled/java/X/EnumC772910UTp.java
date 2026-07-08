package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UTp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC772910UTp {
    public static final EnumC772910UTp ENTER_BROADCAST_ROOM;
    public static final /* synthetic */ EnumC772910UTp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC772910UTp LYNX_PAGE_SHOW;
    public final C1ET4 LL;

    public static InterfaceC2044707zh<EnumC772910UTp> getEntries() {
        return LLILLL;
    }

    static {
        C1ET4 c1et4 = C1ET4.DY_TAB_LIVING_LOAD;
        EnumC772910UTp enumC772910UTp = new EnumC772910UTp("ENTER_BROADCAST_ROOM", 0, c1et4);
        ENTER_BROADCAST_ROOM = enumC772910UTp;
        EnumC772910UTp enumC772910UTp2 = new EnumC772910UTp("LYNX_PAGE_SHOW", 1, c1et4);
        LYNX_PAGE_SHOW = enumC772910UTp2;
        EnumC772910UTp[] enumC772910UTpArr = {enumC772910UTp, enumC772910UTp2};
        LLILLJJLI = enumC772910UTpArr;
        LLILLL = new C2254308sP(enumC772910UTpArr);
    }

    public static EnumC772910UTp[] values() {
        return (EnumC772910UTp[]) LLILLJJLI.clone();
    }

    public final C1ET4 getTargetScene() {
        return this.LL;
    }

    public static EnumC772910UTp valueOf(String str) {
        return (EnumC772910UTp) C08FF.LIZ(EnumC772910UTp.class, str);
    }

    public EnumC772910UTp(String str, int i, C1ET4 c1et4) {
        this.LL = c1et4;
    }
}
