package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1008530cLr {
    public static final EnumC1008530cLr ALL;
    public static final C1008540cLs Companion;
    public static final EnumC1008530cLr FIRSTSHOW;
    public static final /* synthetic */ EnumC1008530cLr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1008530cLr RESHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1008530cLr> getEntries() {
        return LLILLL;
    }

    public static final boolean isMeetAppearPhase(AnoleComponentAppearModel anoleComponentAppearModel, int i) {
        Companion.getClass();
        return C1008540cLs.LIZ(anoleComponentAppearModel, i);
    }

    static {
        EnumC1008530cLr enumC1008530cLr = new EnumC1008530cLr("ALL", 0, "all");
        ALL = enumC1008530cLr;
        EnumC1008530cLr enumC1008530cLr2 = new EnumC1008530cLr("FIRSTSHOW", 1, "rit_firstshow");
        FIRSTSHOW = enumC1008530cLr2;
        EnumC1008530cLr enumC1008530cLr3 = new EnumC1008530cLr("RESHOW", 2, "rit_reshow");
        RESHOW = enumC1008530cLr3;
        EnumC1008530cLr[] enumC1008530cLrArr = {enumC1008530cLr, enumC1008530cLr2, enumC1008530cLr3};
        LLILLJJLI = enumC1008530cLrArr;
        LLILLL = new C2254308sP(enumC1008530cLrArr);
        Companion = new C1008540cLs();
    }

    public static EnumC1008530cLr[] values() {
        return (EnumC1008530cLr[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1008530cLr valueOf(String str) {
        return (EnumC1008530cLr) C08FF.LIZ(EnumC1008530cLr.class, str);
    }

    public EnumC1008530cLr(String str, int i, String str2) {
        this.LL = str2;
    }
}
