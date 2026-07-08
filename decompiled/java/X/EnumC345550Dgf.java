package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dgf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC345550Dgf {
    public static final /* synthetic */ EnumC345550Dgf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC345550Dgf MORE_PANEL;
    public static final EnumC345550Dgf MORE_PANEL_WITH_MORE_TIP;
    public static final EnumC345550Dgf SHARE_PANEL_ENHANCE_SHARING;
    public static final EnumC345550Dgf SHARE_PANEL_NORMAL;

    public static InterfaceC2044707zh<EnumC345550Dgf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC345550Dgf enumC345550Dgf = new EnumC345550Dgf("SHARE_PANEL_NORMAL", 0);
        SHARE_PANEL_NORMAL = enumC345550Dgf;
        EnumC345550Dgf enumC345550Dgf2 = new EnumC345550Dgf("SHARE_PANEL_ENHANCE_SHARING", 1);
        SHARE_PANEL_ENHANCE_SHARING = enumC345550Dgf2;
        EnumC345550Dgf enumC345550Dgf3 = new EnumC345550Dgf("MORE_PANEL", 2);
        MORE_PANEL = enumC345550Dgf3;
        EnumC345550Dgf enumC345550Dgf4 = new EnumC345550Dgf("MORE_PANEL_WITH_MORE_TIP", 3);
        MORE_PANEL_WITH_MORE_TIP = enumC345550Dgf4;
        EnumC345550Dgf[] enumC345550DgfArr = {enumC345550Dgf, enumC345550Dgf2, enumC345550Dgf3, enumC345550Dgf4};
        LL = enumC345550DgfArr;
        LLILLJJLI = new C2254308sP(enumC345550DgfArr);
    }

    public static EnumC345550Dgf[] values() {
        return (EnumC345550Dgf[]) LL.clone();
    }

    public static EnumC345550Dgf valueOf(String str) {
        return (EnumC345550Dgf) C08FF.LIZ(EnumC345550Dgf.class, str);
    }

    public EnumC345550Dgf(String str, int i) {
    }
}
