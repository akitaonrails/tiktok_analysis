package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0rzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609910rzp {
    public static final List<String> LIZ;
    public static final List<String> LIZIZ;
    public static final List<String> LIZJ;
    public static final List<String> LIZLLL;
    public static final List<String> LJ;

    static {
        EnumC1609900rzo enumC1609900rzo = EnumC1609900rzo.FOLLOW_FEED;
        EnumC1609900rzo enumC1609900rzo2 = EnumC1609900rzo.TAB_FRIENDS;
        LIZ = C1697810uHb.LJIIJJI(EnumC1609900rzo.FANS.getValue(), EnumC1609900rzo.OTHER_FANS.getValue(), enumC1609900rzo.getValue(), EnumC1609900rzo.OTHER_FOLLOWING.getValue(), EnumC1609900rzo.SUGGESTED_LIST.getValue(), EnumC1609900rzo.PUSH_SETTINGS.getValue(), EnumC1609900rzo.FIND_FRIENDS.getValue(), enumC1609900rzo2.getValue());
        LIZIZ = C1697810uHb.LJIIJJI(EnumC1609900rzo.PERSONAL_PUBLIC_TAB.getValue(), EnumC1609900rzo.PERSONAL_FAVORITE_TAB.getValue(), EnumC1609900rzo.PERSONAL_PRIVATE_TAB.getValue(), EnumC1609900rzo.PERSONAL_REPOSTED_TAB.getValue(), EnumC1609900rzo.PERSONAL_MUSIC_TAB.getValue(), EnumC1609900rzo.PERSONAL_EFFECT_TAB.getValue(), EnumC1609900rzo.PERSONAL_CAMEO_TAB.getValue(), EnumC1609900rzo.PERSONAL_COLLECTION_VIDEOS_TAB.getValue(), EnumC1609900rzo.OTHERS_PUBLIC_TAB.getValue(), EnumC1609900rzo.OTHERS_FAVORITE_TAB.getValue(), EnumC1609900rzo.OTHERS_PRIVATE_TAB.getValue(), EnumC1609900rzo.OTHERS_MUSIC_TAB.getValue(), EnumC1609900rzo.OTHERS_EFFECT_TAB.getValue(), EnumC1609900rzo.OTHERS_COLLECTION_VIDEOS_TAB.getValue(), EnumC1609900rzo.OTHERS_CAMEO_TAB.getValue());
        EnumC1609900rzo enumC1609900rzo3 = EnumC1609900rzo.RECOMMEND_FEED;
        LIZJ = Collections.singletonList(enumC1609900rzo3.getValue());
        LIZLLL = Collections.singletonList(enumC1609900rzo3.getValue());
        LJ = C1697810uHb.LJIIJJI(enumC1609900rzo.getValue(), enumC1609900rzo3.getValue(), enumC1609900rzo2.getValue());
    }
}
