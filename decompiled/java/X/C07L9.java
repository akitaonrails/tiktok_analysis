package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07L9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07L9 {
    public static final Map<String, Boolean> LIZ;
    public static final Map<String, Boolean> LIZIZ;
    public static final Map<String, Boolean> LIZJ;
    public static final C01GW LIZLLL;

    static {
        EnumC645610PTz enumC645610PTz = EnumC645610PTz.VIDEO_IN_MIX_FEED;
        String sceneName = enumC645610PTz.getSceneName();
        Boolean bool = Boolean.TRUE;
        EnumC645610PTz enumC645610PTz2 = EnumC645610PTz.LIVE_IN_MIX_FEED;
        EnumC645610PTz enumC645610PTz3 = EnumC645610PTz.LIVE_FEED;
        EnumC645610PTz enumC645610PTz4 = EnumC645610PTz.PRODUCT_IN_PRODUCT_CARD;
        EnumC645610PTz enumC645610PTz5 = EnumC645610PTz.VIDEO_IN_PRODUCT_CARD;
        EnumC645610PTz enumC645610PTz6 = EnumC645610PTz.LIVE_IN_PRODUCT_CARD;
        LIZ = C2097608Jq.LJIIJ(new Pair(sceneName, bool), new Pair(enumC645610PTz2.getSceneName(), bool), new Pair(enumC645610PTz3.getSceneName(), bool), new Pair(enumC645610PTz4.getSceneName(), bool), new Pair(enumC645610PTz5.getSceneName(), bool), new Pair(enumC645610PTz6.getSceneName(), bool));
        String sceneName2 = enumC645610PTz.getSceneName();
        Boolean bool2 = Boolean.FALSE;
        LIZIZ = C2097608Jq.LJIIJ(new Pair(sceneName2, bool2), new Pair(enumC645610PTz2.getSceneName(), bool2), new Pair(enumC645610PTz3.getSceneName(), bool2), new Pair(enumC645610PTz4.getSceneName(), bool2), new Pair(enumC645610PTz5.getSceneName(), bool2), new Pair(enumC645610PTz6.getSceneName(), bool2));
        LIZJ = C2097608Jq.LJIIJ(new Pair(enumC645610PTz.getSceneName(), bool), new Pair(enumC645610PTz2.getSceneName(), bool), new Pair(enumC645610PTz3.getSceneName(), bool), new Pair(enumC645610PTz4.getSceneName(), bool2), new Pair(enumC645610PTz5.getSceneName(), bool2), new Pair(enumC645610PTz6.getSceneName(), bool2));
        LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1213));
    }
}
