package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17sE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21165617sE {
    public static final EnumC21165617sE HIGHLIGHT_TO_LIVE;
    public static final /* synthetic */ EnumC21165617sE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21165617sE PAUSE_HIGHLIGHT;
    public static final EnumC21165617sE RESUME_HIGHLIGHT;
    public static final EnumC21165617sE SHOW_LIVE_GUIDE;
    public static final EnumC21165617sE START_HIGHLIGHT_GUIDE;

    public static InterfaceC2044707zh<EnumC21165617sE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21165617sE enumC21165617sE = new EnumC21165617sE("START_HIGHLIGHT_GUIDE", 0);
        START_HIGHLIGHT_GUIDE = enumC21165617sE;
        EnumC21165617sE enumC21165617sE2 = new EnumC21165617sE("SHOW_LIVE_GUIDE", 1);
        SHOW_LIVE_GUIDE = enumC21165617sE2;
        EnumC21165617sE enumC21165617sE3 = new EnumC21165617sE("HIGHLIGHT_TO_LIVE", 2);
        HIGHLIGHT_TO_LIVE = enumC21165617sE3;
        EnumC21165617sE enumC21165617sE4 = new EnumC21165617sE("PAUSE_HIGHLIGHT", 3);
        PAUSE_HIGHLIGHT = enumC21165617sE4;
        EnumC21165617sE enumC21165617sE5 = new EnumC21165617sE("RESUME_HIGHLIGHT", 4);
        RESUME_HIGHLIGHT = enumC21165617sE5;
        EnumC21165617sE[] enumC21165617sEArr = {enumC21165617sE, enumC21165617sE2, enumC21165617sE3, enumC21165617sE4, enumC21165617sE5};
        LL = enumC21165617sEArr;
        LLILLJJLI = new C2254308sP(enumC21165617sEArr);
    }

    public static EnumC21165617sE[] values() {
        return (EnumC21165617sE[]) LL.clone();
    }

    public static EnumC21165617sE valueOf(String str) {
        return (EnumC21165617sE) C08FF.LIZ(EnumC21165617sE.class, str);
    }

    public EnumC21165617sE(String str, int i) {
    }
}
