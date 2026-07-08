package X;

import com.ss.android.ugc.aweme.feed.model.ComponentContainerData;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.feed.platform.componentmanager.data.FcpTreeData;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS255S0300000_11;
import kotlin.jvm.internal.AwS33S2200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700080Rd8 {
    public static final Map<String, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair("fyp", "For You"), new Pair("following", "Following"), new Pair("friends", "Friends"), new Pair("nearby", "Nearby"), new Pair("stem", "Stem"), new Pair("profile", "PROFILE"), new Pair("detail", "DETAIL"), new Pair("mutual", "DETAIL_VIBE_FEED"), new Pair("reposts", "Repost"), new Pair("footnote", "DETAIL_FOOTNOTE"), new Pair("drama", "Series"));
    public static final Map<String, String> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("For You", "fyp"), new Pair("Following", "following"), new Pair("Friends", "friends"), new Pair("Nearby", "nearby"), new Pair("Stem", "stem"), new Pair("PROFILE", "profile"), new Pair("DETAIL", "detail"), new Pair("Repost", "reposts"), new Pair("NEARBY_FEED_DOUBLE_COLUMN", "detail"), new Pair("NEARBY_FEED_INNER", "detail"), new Pair("DETAIL_VIBE_FEED", "mutual"), new Pair("DETAIL_STORY", "story_detail"), new Pair("DETAIL_FOOTNOTE", "footnote"), new Pair("Series", "drama"));
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final Set<String> LJFF;
    public static final Set<String> LJI;
    public static final Map<String, Set<String>> LJII;
    public static final FcpTreeData LJIIIIZZ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C700090Rd9());
        LIZJ = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new C699050RbT());
        LIZLLL = c01gwLIZIZ2;
        C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(new C700110RdB());
        LJ = c01gwLIZIZ3;
        LJFF = C13LQ.LJLIIL(new String[]{"bottom_banner", "bottom_button", "high_tag", "low_tag", "anchor", "genre_tag", "meta_tag"});
        LJI = (Set) c01gwLIZIZ2.getValue();
        Map<String, Set<String>> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("interaction_root_container", c01gwLIZIZ2.getValue()), new Pair("left_container", c01gwLIZIZ.getValue()), new Pair("main_tag", c01gwLIZIZ3.getValue()), new Pair("bottom_button", C13LP.LLIIJI(Collections.singletonList("standardized_bottom_button"))), new Pair("high_tag", C13LP.LLIIJI(Collections.singletonList("high_tag_standardized_container"))), new Pair("meta_tag", C13LP.LLIIJI(Collections.singletonList("meta_tag_standardized_container"))), new Pair("annotation_container", C13LP.LLIIJI(Collections.singletonList("info_bar"))), new Pair("bottom_tag_container", C13LP.LLIIJI(Collections.singletonList("standardized_bottom_tag"))));
        LJII = mapLJIIIIZZ;
        LJIIIIZZ = new FcpTreeData("interaction_root_container", mapLJIIIIZZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(com.ss.android.ugc.aweme.feed.model.ComponentContainerData r3) {
        /*
            java.lang.String r0 = r3.getType()
            int r0 = r0.length()
            r1 = 1
            if (r0 != 0) goto L2c
            java.lang.String r2 = r3.getContainerKey()
            java.util.Set<java.lang.String> r0 = X.C700080Rd8.LJFF
            boolean r0 = X.C13LP.LJJJJ(r2, r0)
            if (r0 != 0) goto L67
            java.util.Set<java.lang.String> r0 = X.C700080Rd8.LJI
            boolean r0 = X.C13LP.LJJJJ(r2, r0)
            if (r0 != 0) goto L3f
            java.lang.String r0 = "interaction_root_container"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L31
            java.lang.String r0 = "m_n_global"
        L29:
            r3.setType(r0)
        L2c:
            java.lang.String r0 = r3.getType()
            return r0
        L31:
            java.lang.String r0 = "info_bar"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L42
            int r0 = r3.getShowLimitStrategy()
            if (r0 != r1) goto L67
        L3f:
            java.lang.String r0 = "m_n_area"
            goto L29
        L42:
            X.0sDa r1 = X.C1618440sDa.LIZIZ
            X.0Rnv r0 = r1.LJJIIJ()
            X.0RMZ r0 = r0.LJIL()
            java.util.Set<java.lang.String> r0 = r0.LIZ
            boolean r0 = X.C13LP.LJJJJ(r2, r0)
            if (r0 != 0) goto L67
            X.0Rnv r0 = r1.LJJIIJ()
            X.0RMZ r0 = r0.LJIL()
            java.util.Set<java.lang.String> r0 = r0.LIZIZ
            boolean r0 = X.C13LP.LJJJJ(r2, r0)
            if (r0 != 0) goto L3f
            java.lang.String r0 = "default"
            goto L29
        L67:
            java.lang.String r0 = "n_1"
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C700080Rd8.LIZIZ(com.ss.android.ugc.aweme.feed.model.ComponentContainerData):java.lang.String");
    }

    public static final C699100RbY LIZJ(C698810Rb5 c698810Rb5) {
        C699100RbY c699100RbY = new C699100RbY(null);
        c699100RbY.LJ = C13LP.LLIIJI(C13LP.LJJJJLI(c698810Rb5.LIZ));
        c699100RbY.LJFF = C13LP.LLIIJI(C13LP.LJJJJLI(c698810Rb5.LIZIZ));
        c699100RbY.LJI = C13LP.LLIIJI(C13LP.LJJJJLI(c698810Rb5.LIZJ));
        c699100RbY.LJII = C13LP.LLIIJI(C13LP.LJJJJLI(c698810Rb5.LJI));
        c699100RbY.LJIIIIZZ = C13LP.LLIIJI(C13LP.LJJJJLI(c698810Rb5.LJIIIZ));
        c699100RbY.LJIIIZ = c698810Rb5.LJIILIIL;
        return c699100RbY;
    }

    public static final void LIZ(FeedComponentPriorityData feedComponentPriorityData, String str, List list, String str2) {
        ComponentContainerData componentContainerData;
        GlobalComponentData globalComponentData;
        ComponentContainerData componentContainerData2;
        new AwS33S2200000_11(feedComponentPriorityData, (FeedComponentPriorityData) str, (String) list, (List<String>) str2, (String) 0);
        C0T6L.LIZLLL();
        Map<String, ComponentContainerData> map = feedComponentPriorityData.containerMap;
        if (map != null) {
            componentContainerData = map.get(str);
        } else {
            componentContainerData = null;
        }
        for (Object obj : list) {
            Map<String, GlobalComponentData> map2 = feedComponentPriorityData.globalComponentMap;
            if (map2 != null && (globalComponentData = map2.get(obj)) != null) {
                String matchedContainerKey = globalComponentData.getMatchedContainerKey();
                if (!Intrinsics.LJFF(matchedContainerKey, str)) {
                    Map<String, ComponentContainerData> map3 = feedComponentPriorityData.containerMap;
                    if (map3 != null) {
                        componentContainerData2 = map3.get(matchedContainerKey);
                    } else {
                        componentContainerData2 = null;
                    }
                    new AwS255S0300000_11(globalComponentData, componentContainerData2, componentContainerData, 0);
                    C0T6L.LIZLLL();
                    if (componentContainerData2 != null) {
                        componentContainerData2.dropChild(globalComponentData, str2);
                    }
                    if (componentContainerData != null) {
                        componentContainerData.adoptChild(globalComponentData, str2);
                    }
                }
            }
        }
        C0T6L.LIZLLL();
    }
}
