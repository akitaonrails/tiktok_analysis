package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eIJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083210eIJ {
    public static final EnumC1083210eIJ DEFAULT;
    public static final /* synthetic */ EnumC1083210eIJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1083210eIJ RANKING_MIDDAY_SPRINT_COUNTDOWN;
    public static final EnumC1083210eIJ RANKING_MIDDAY_SPRINT_START;
    public static final EnumC1083210eIJ RANKING_SETTLEMENT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1083210eIJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1083210eIJ enumC1083210eIJ = new EnumC1083210eIJ(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1083210eIJ;
        EnumC1083210eIJ enumC1083210eIJ2 = new EnumC1083210eIJ("RANKING_SETTLEMENT", 1, 1);
        RANKING_SETTLEMENT = enumC1083210eIJ2;
        EnumC1083210eIJ enumC1083210eIJ3 = new EnumC1083210eIJ("RANKING_MIDDAY_SPRINT_START", 2, 2);
        RANKING_MIDDAY_SPRINT_START = enumC1083210eIJ3;
        EnumC1083210eIJ enumC1083210eIJ4 = new EnumC1083210eIJ("RANKING_MIDDAY_SPRINT_COUNTDOWN", 3, 3);
        RANKING_MIDDAY_SPRINT_COUNTDOWN = enumC1083210eIJ4;
        EnumC1083210eIJ[] enumC1083210eIJArr = {enumC1083210eIJ, enumC1083210eIJ2, enumC1083210eIJ3, enumC1083210eIJ4};
        LLILLJJLI = enumC1083210eIJArr;
        LLILLL = new C2254308sP(enumC1083210eIJArr);
    }

    public static EnumC1083210eIJ[] values() {
        return (EnumC1083210eIJ[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1083210eIJ valueOf(String str) {
        return (EnumC1083210eIJ) C08FF.LIZ(EnumC1083210eIJ.class, str);
    }

    public EnumC1083210eIJ(String str, int i, int i2) {
        this.LL = i2;
    }
}
