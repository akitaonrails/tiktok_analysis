package X;

import Y.AComparatorS28S0000000_9;
import Y.AComparatorS508S0100000_9;
import com.ss.android.ugc.aweme.cache.FollowingFeedCacheService;
import com.ss.android.ugc.aweme.cache.FollowingHvrStrategyExp;
import com.ss.android.ugc.aweme.cache.FollowingPreloadConfigModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ViS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805300ViS {
    public static final C805300ViS LIZ = new C805300ViS();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C607650NsR());

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final synchronized void LIZ(FollowFeedList followFeedList) {
        InterfaceC804960Vhu interfaceC804960Vhu;
        List<C0VLN> listLIZLLL;
        String aid;
        FollowFeedList followFeedList2;
        int i = ((FollowingPreloadConfigModel) C805310ViT.LIZIZ.getValue()).cacheSizeLimit;
        FollowFeedList followFeedList3 = new FollowFeedList();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(followFeedList.getItems());
        ArrayList<FollowFeed> arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            FollowFeed followFeed = (FollowFeed) obj;
            if (followFeed.getFeedType() != 65298 && followFeed.getAweme() != null && followFeed.getAweme().getAwemeType() != 101 && !followFeed.getAweme().isAd()) {
                arrayList.add(obj);
            }
        }
        followFeedList3.setItems(arrayList);
        if (i < 0) {
            C2349909Ir.LIZ.LIZLLL(followFeedList3);
        } else {
            ArrayList arrayList2 = new ArrayList();
            FollowingFeedCacheService.FollowingCache followingCacheLIZ = FollowingFeedCacheService.LIZ();
            if (followingCacheLIZ != null && (followFeedList2 = followingCacheLIZ.data) != null) {
                arrayList2.addAll(followFeedList2.getItems());
            }
            for (FollowFeed followFeed2 : arrayList) {
                if (followFeed2.getAweme() != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Aweme aweme = ((FollowFeed) it2.next()).getAweme();
                            String aid2 = null;
                            if (aweme != null) {
                                aid = aweme.getAid();
                            } else {
                                aid = null;
                            }
                            Aweme aweme2 = followFeed2.getAweme();
                            if (aweme2 != null) {
                                aid2 = aweme2.getAid();
                            }
                            if (Intrinsics.LJFF(aid, aid2)) {
                                break;
                            }
                        } else {
                            arrayList2.add(followFeed2);
                            break;
                        }
                    }
                }
            }
            if (((FollowingHvrStrategyExp.FollowingHvrStrategyConfigModel) FollowingHvrStrategyExp.LIZIZ.getValue()).enableLocalCache) {
                C804900Vho.LIZ.getClass();
                if (!C804900Vho.LIZLLL() || (interfaceC804960Vhu = (InterfaceC804960Vhu) C804900Vho.LIZJ.getValue()) == null || (listLIZLLL = interfaceC804960Vhu.LIZLLL(C804900Vho.LIZ())) == null) {
                    listLIZLLL = C13BV.INSTANCE;
                }
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLIZLLL, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (C0VLN c0vln : listLIZLLL) {
                    Pair pair = new Pair(c0vln.LIZJ, Long.valueOf(c0vln.LIZ));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                if (arrayList2.size() > 1) {
                    C08XD.LJJ(arrayList2, new AComparatorS508S0100000_9(linkedHashMap, 0));
                }
            } else if (arrayList2.size() > 1) {
                C08XD.LJJ(arrayList2, new AComparatorS28S0000000_9(5));
            }
            int size = arrayList2.size();
            List<FollowFeed> listSubList = arrayList2;
            if (size > i) {
                listSubList = arrayList2.subList(0, i);
            }
            followFeedList3.setItems(listSubList);
            C2349909Ir.LIZ.LIZLLL(followFeedList3);
        }
        C804950Vht c804950Vht = C804950Vht.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c804950Vht.getClass();
        C804950Vht.LIZIZ(jCurrentTimeMillis);
    }
}
