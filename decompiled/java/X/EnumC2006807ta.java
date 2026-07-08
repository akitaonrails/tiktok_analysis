package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07ta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2006807ta {
    public static final EnumC2006807ta DRAMA_TAB_PRELOAD;
    public static final EnumC2006807ta INNER_FEED_SHARE_PLAYER;
    public static final /* synthetic */ EnumC2006807ta[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2006807ta NONE;

    public static InterfaceC2044707zh<EnumC2006807ta> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2006807ta enumC2006807ta = new EnumC2006807ta("NONE", 0);
        NONE = enumC2006807ta;
        EnumC2006807ta enumC2006807ta2 = new EnumC2006807ta("INNER_FEED_SHARE_PLAYER", 1);
        INNER_FEED_SHARE_PLAYER = enumC2006807ta2;
        EnumC2006807ta enumC2006807ta3 = new EnumC2006807ta("DRAMA_TAB_PRELOAD", 2);
        DRAMA_TAB_PRELOAD = enumC2006807ta3;
        EnumC2006807ta[] enumC2006807taArr = {enumC2006807ta, enumC2006807ta2, enumC2006807ta3};
        LL = enumC2006807taArr;
        LLILLJJLI = new C2254308sP(enumC2006807taArr);
    }

    public static EnumC2006807ta[] values() {
        return (EnumC2006807ta[]) LL.clone();
    }

    public static EnumC2006807ta valueOf(String str) {
        return (EnumC2006807ta) C08FF.LIZ(EnumC2006807ta.class, str);
    }

    public EnumC2006807ta(String str, int i) {
    }
}
