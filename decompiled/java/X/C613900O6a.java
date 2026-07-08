package X;

import com.ss.android.ugc.aweme.base.util.FriendsStoryCacheData;
import com.ss.android.ugc.aweme.base.util.InboxCacheItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.item.StoryCacheData;
import com.ss.android.ugc.aweme.item.StoryCacheExtra;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS75S0210000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613900O6a extends C09AY implements Function0<C1600190rk9> {
    public C613900O6a() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0rk9] */
    @Override // kotlin.jvm.functions.Function0
    public final C1600190rk9 invoke() {
        return new InterfaceC1595170rc3() { // from class: X.0rk9
            public final C01GW LIZ = C452501pT.LIZIZ(new C1600370rkR());
            public final C1600200rkA LIZIZ = new C1600200rkA();

            @Override // X.InterfaceC1595170rc3
            public final List<Aweme> LIZ() {
                CopyOnWriteArrayList<Aweme> copyOnWriteArrayList;
                C1596130rdb.LIZ.getClass();
                C1596120rda c1596120rdaLJFF = C1596130rdb.LJFF(0);
                return (c1596120rdaLJFF == null || (copyOnWriteArrayList = c1596120rdaLJFF.LIZ) == null || copyOnWriteArrayList.isEmpty()) ? C13BV.INSTANCE : C13LP.LLIIII(copyOnWriteArrayList);
            }

            @Override // X.InterfaceC1595170rc3
            public final Pair<InterfaceC1455405mq<InterfaceC1891350zJl>, Integer> LIZIZ() {
                C1600210rkB c1600210rkB = (C1600210rkB) this.LIZ.getValue();
                InterfaceC1455405mq<InterfaceC1891350zJl> interfaceC1455405mq = c1600210rkB.LJFF;
                int i = c1600210rkB.LJI;
                c1600210rkB.LJFF = null;
                c1600210rkB.LJI = 0;
                return new Pair<>(interfaceC1455405mq, Integer.valueOf(i));
            }

            @Override // X.InterfaceC1595170rc3
            public final void LJ() {
                C1600200rkA c1600200rkA = this.LIZIZ;
                c1600200rkA.getClass();
                if (!C596340NaC.LIZJ()) {
                    C596340NaC.LIZLLL("InboxSkylightStoryDataCenter#cancelAllCacheLoading", false);
                    return;
                }
                C596340NaC.LIZLLL("InboxSkylightStoryDataCenter#cancelAllCacheLoading", true);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cancelAllCacheLoading, curStatus: ");
                sbLIZ.append(c1600200rkA.LIZ);
                C1720106oR.LJI("SkylightStoryDataCenter", C2188811AlT.LIZIZ(sbLIZ));
                C1600310rkL c1600310rkL = c1600200rkA.LIZ;
                if (c1600310rkL.LIZ < 100) {
                    c1600310rkL.LIZ = 101;
                }
                C1600200rkA.LIZIZ(c1600200rkA, false, 3);
            }

            @Override // X.InterfaceC1595170rc3
            public final Pair<List<InterfaceC1891350zJl>, Integer> LJFF() {
                C1600210rkB c1600210rkB = (C1600210rkB) this.LIZ.getValue();
                c1600210rkB.getClass();
                if (!Intrinsics.LJFF(C1600210rkB.LIZIZ(), c1600210rkB.LIZJ)) {
                    c1600210rkB.LIZ();
                    return new Pair<>(null, -1);
                }
                FriendsStoryCacheData friendsStoryCacheData = c1600210rkB.LIZLLL;
                c1600210rkB.LIZ();
                return new Pair<>(friendsStoryCacheData != null ? friendsStoryCacheData.powerItems : null, Integer.valueOf(c1600210rkB.LJII));
            }

            @Override // X.InterfaceC1595170rc3
            public final boolean LJI() {
                C1600200rkA c1600200rkA = this.LIZIZ;
                return c1600200rkA.LIZLLL() || c1600200rkA.LIZ.LIZ();
            }

            @Override // X.InterfaceC1595170rc3
            public final void LJII() {
                C1600210rkB c1600210rkB = (C1600210rkB) this.LIZ.getValue();
                if (c1600210rkB.LIZIZ) {
                    return;
                }
                c1600210rkB.LIZIZ = true;
                c1600210rkB.LIZJ = C1600210rkB.LIZIZ();
                c1600210rkB.LJ = C23250099c.LIZLLL(c1600210rkB.LIZ, null, null, new C05AA(c1600210rkB, null, new AwS603S0100000_24(c1600210rkB, 506)), 3);
            }

            @Override // X.InterfaceC1595170rc3
            public final void LJIIJ() {
                C1600210rkB c1600210rkB = (C1600210rkB) this.LIZ.getValue();
                c1600210rkB.getClass();
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("abort to init cache, hasInit: ");
                sbLIZ.append(c1600210rkB.LIZIZ);
                C1720106oR.LJI("FriendsSkylightStoryDataCenter", C2188811AlT.LIZIZ(sbLIZ));
                c1600210rkB.LIZIZ = true;
                AnonymousClass0956 anonymousClass0956 = c1600210rkB.LJ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c1600210rkB.LJ = null;
                c1600210rkB.LIZLLL = null;
                InterfaceC1455405mq<InterfaceC1891350zJl> interfaceC1455405mq = c1600210rkB.LJFF;
                c1600210rkB.LJFF = null;
                c1600210rkB.LJI = 0;
                if (interfaceC1455405mq != null) {
                    C23250099c.LIZLLL(c1600210rkB.LIZ, null, null, new C05AC(interfaceC1455405mq, null), 3);
                }
            }

            @Override // X.InterfaceC1595170rc3
            public final void resetDataCenterStatus() {
                this.LIZIZ.LIZ.LIZ = 0;
            }

            @Override // X.InterfaceC1595170rc3
            public final void LIZJ(String str) {
                C1600200rkA c1600200rkA = this.LIZIZ;
                if (c1600200rkA.LIZ.LIZIZ(1)) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("start to init inbox skylight cache from ");
                    sbLIZ.append(str);
                    C1720106oR.LJI("SkylightStoryDataCenter", C2188811AlT.LIZIZ(sbLIZ));
                    c1600200rkA.LJIIIIZZ = C1600200rkA.LJ();
                    if (C703302op.LIZ(c1600200rkA.LJIIIIZZ)) {
                        C1720106oR.LIZ("SkylightStoryDataCenter", "cache owner is invalid");
                    }
                    C23250099c.LIZLLL(c1600200rkA.LIZJ, null, null, new C325201Ny(c1600200rkA, null, new C1600180rk8(c1600200rkA)), 3);
                }
            }

            @Override // X.InterfaceC1595170rc3
            public final void LJIIIIZZ(List<? extends InterfaceC1891350zJl> list) {
                boolean z;
                User author;
                String uid;
                UserAllStoryMetadata userAllStoryMetadataLJIJI;
                UserAllStoryMetadata allStoryMetadata;
                String uid2;
                C1600200rkA c1600200rkA = this.LIZIZ;
                c1600200rkA.getClass();
                int i = 0;
                if (((ArrayList) list).isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i2 = C2187451AjH.LIZ;
                    C1720106oR.LJI("SkylightStoryDataCenter", "saveInboxCacheData, abort because cacheItemList is empty");
                    return;
                }
                String strLJ = C1600200rkA.LJ();
                if (strLJ != null && strLJ.length() != 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) C13LP.LJJJLL(list);
                    if (interfaceC1891350zJl instanceof StoryInboxItem) {
                        StoryInboxItem storyInboxItem = (StoryInboxItem) interfaceC1891350zJl;
                        if (storyInboxItem.isMe()) {
                            User author2 = storyInboxItem.getStoryCollection().getAuthor();
                            if (author2 != null) {
                                uid2 = author2.getUid();
                            } else {
                                uid2 = null;
                            }
                            if (!Intrinsics.LJFF(uid2, strLJ)) {
                                int i3 = C2187451AjH.LIZ;
                                C1720106oR.LJI("SkylightStoryDataCenter", "saveInboxCacheData, abort because user changed");
                                return;
                            }
                        }
                    }
                    long jIntValue = ((Number) C100300Zl.LIZ.getValue()).intValue();
                    if (jIntValue > 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - c1600200rkA.LJIIJ;
                        if (c1600200rkA.LJIIJ > 0 && 0 <= jCurrentTimeMillis && jCurrentTimeMillis <= jIntValue) {
                            return;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    int iIntValue = ((Number) AnonymousClass0754.LIZ.getValue()).intValue();
                    if (iIntValue > 0) {
                        for (InterfaceC1891350zJl interfaceC1891350zJl2 : (ArrayList) list) {
                            if (C1600360rkQ.LIZ().enableStoryDiskCache && (interfaceC1891350zJl2 instanceof StoryInboxItem)) {
                                i++;
                                arrayList.add(new InboxCacheItem("story", (StoryInboxItem) interfaceC1891350zJl2, null));
                            } else if (C1600360rkQ.LIZ().enableLiveDiskCache && (interfaceC1891350zJl2 instanceof C1598180rgu)) {
                                i++;
                                arrayList.add(new InboxCacheItem("live", null, (C1598180rgu) interfaceC1891350zJl2));
                            }
                            if (i >= iIntValue) {
                                break;
                            }
                        }
                    } else {
                        long jLIZ = C0BV5.LIZ();
                        for (InterfaceC1891350zJl interfaceC1891350zJl3 : (ArrayList) list) {
                            if (C1600360rkQ.LIZ().enableStoryDiskCache && (interfaceC1891350zJl3 instanceof StoryInboxItem)) {
                                i++;
                                arrayList.add(new InboxCacheItem("story", (StoryInboxItem) interfaceC1891350zJl3, null));
                            } else if (C1600360rkQ.LIZ().enableLiveDiskCache && (interfaceC1891350zJl3 instanceof C1598180rgu)) {
                                arrayList.add(new InboxCacheItem("live", null, (C1598180rgu) interfaceC1891350zJl3));
                            }
                            if (i >= jLIZ) {
                                break;
                            }
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        StoryInboxItem storyInboxItem2 = ((InboxCacheItem) it2.next()).storyItem;
                        if (storyInboxItem2 != null && (author = storyInboxItem2.getStoryCollection().getAuthor()) != null && (uid = author.getUid()) != null && (userAllStoryMetadataLJIJI = C1605650rsx.LIZIZ.LJIJI(EnumC1615506Uf.STORY, uid)) != null) {
                            User author3 = storyInboxItem2.getStoryCollection().getAuthor();
                            if (author3 != null) {
                                allStoryMetadata = author3.getAllStoryMetadata();
                            } else {
                                allStoryMetadata = null;
                            }
                            if (!Intrinsics.LJFF(userAllStoryMetadataLJIJI, allStoryMetadata)) {
                                int i4 = C2187451AjH.LIZ;
                                User author4 = storyInboxItem2.getStoryCollection().getAuthor();
                                if (author4 != null) {
                                    author4.setAllStoryMetadata(userAllStoryMetadataLJIJI);
                                }
                            }
                        }
                    }
                    C23250099c.LIZLLL(c1600200rkA.LIZJ, null, null, new C1600220rkC(new StoryCacheExtra(System.currentTimeMillis(), strLJ, 0), arrayList, c1600200rkA, null), 3);
                    return;
                }
                int i5 = C2187451AjH.LIZ;
                C1720106oR.LJI("SkylightStoryDataCenter", "saveInboxCacheData, abort because currentUid is empty");
            }

            @Override // X.InterfaceC1595170rc3
            public final void LJIIIZ(List<? extends InterfaceC1891350zJl> list) {
                C1600210rkB c1600210rkB = (C1600210rkB) this.LIZ.getValue();
                InterfaceC1455405mq<InterfaceC1891350zJl> interfaceC1455405mq = c1600210rkB.LJFF;
                c1600210rkB.LJFF = null;
                c1600210rkB.LJI = 0;
                if (interfaceC1455405mq != null) {
                    C23250099c.LIZLLL(c1600210rkB.LIZ, null, null, new C05AC(interfaceC1455405mq, null), 3);
                }
                if (list != null && !list.isEmpty()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strLIZIZ = C1600210rkB.LIZIZ();
                    if (strLIZIZ == null) {
                        strLIZIZ = "";
                    }
                    C23250099c.LIZLLL(c1600210rkB.LIZ, null, null, new C1344605Oa(c1600210rkB, list, new C1600380rkS(jCurrentTimeMillis, strLIZIZ), null), 3);
                }
            }

            @Override // X.InterfaceC1595170rc3
            public final void LJIIJJI(StoryGetFeedByPageResponse storyGetFeedByPageResponse) {
                C1600200rkA c1600200rkA = this.LIZIZ;
                if (c1600200rkA.LIZ.LIZIZ(5)) {
                    c1600200rkA.LIZ();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strLJ = C1600200rkA.LJ();
                    if (strLJ == null) {
                        strLJ = "";
                    }
                    c1600200rkA.LJII = new StoryCacheData.ResponseCache(storyGetFeedByPageResponse, new StoryCacheExtra(jCurrentTimeMillis, strLJ, 2));
                }
            }

            @Override // X.InterfaceC1595170rc3
            public final StoryCacheData LIZLLL(boolean z, C1598830rhx c1598830rhx) {
                boolean z2;
                String str;
                StoryCacheExtra extra;
                boolean z3;
                C1600200rkA c1600200rkA = this.LIZIZ;
                c1600200rkA.getClass();
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getInboxCacheFromMemory, diskCallback: ");
                sbLIZ.append(z);
                sbLIZ.append(", curStatus: ");
                sbLIZ.append(c1600200rkA.LIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                boolean z4 = false;
                if (c1600200rkA.LIZ.LIZ <= 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                StoryCacheData.PowerItemCache powerItemCache = null;
                if (z2) {
                    if (z) {
                        if (c1600200rkA.LIZ.LIZ == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c1600200rkA.LIZ.LIZIZ(10);
                        if (z3) {
                            c1600200rkA.LJIIIIZZ = C1600200rkA.LJ();
                            if (C596340NaC.LIZIZ().pagedReadPageCount > 0) {
                                z4 = true;
                                c1600200rkA.LIZIZ = c1598830rhx;
                            }
                            C23250099c.LIZLLL(c1600200rkA.LIZJ, null, null, new C325201Ny(c1600200rkA, null, new AwS75S0210000_24(c1600200rkA, c1598830rhx, z4, 4)), 3);
                        } else {
                            c1600200rkA.LIZIZ = c1598830rhx;
                        }
                        ArrayList arrayList = new ArrayList();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        String strLJ = C1600200rkA.LJ();
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        powerItemCache = new StoryCacheData.PowerItemCache(arrayList, true, new StoryCacheExtra(jCurrentTimeMillis, strLJ, 1), false, false, false);
                    } else {
                        c1600200rkA.LIZ.LIZIZ(101);
                        return null;
                    }
                } else {
                    C1600310rkL c1600310rkL = c1600200rkA.LIZ;
                    if (c1600310rkL.LIZ >= 2 && c1600310rkL.LIZ <= 6) {
                        if (c1600200rkA.LJII == null) {
                            C1720106oR.LJI("SkylightStoryDataCenter", "cacheData is null");
                        }
                        StoryCacheData storyCacheData = c1600200rkA.LJII;
                        if (storyCacheData != null && (extra = storyCacheData.getExtra()) != null) {
                            str = extra.uid;
                        } else {
                            str = null;
                        }
                        if (!Intrinsics.LJFF(str, C1600200rkA.LJ())) {
                            C1720106oR.LJI("SkylightStoryDataCenter", "OwnerChange when get cache");
                            C1600200rkA.LIZIZ(c1600200rkA, true, 2);
                            return null;
                        }
                        if (z && c1600200rkA.LJI != null) {
                            c1600200rkA.LIZIZ = c1598830rhx;
                            c1600200rkA.LIZ.LIZIZ(100);
                            c1600200rkA.LJIILIIL();
                            return c1600200rkA.LJII;
                        }
                        c1600200rkA.LIZ.LIZIZ(100);
                        C11JF c11jf = c1600200rkA.LIZLLL;
                        if (c11jf != null) {
                            c11jf.dispose();
                        }
                        StoryCacheData storyCacheData2 = c1600200rkA.LJII;
                        C1600200rkA.LIZIZ(c1600200rkA, false, 3);
                        return storyCacheData2;
                    }
                }
                return powerItemCache;
            }
        };
    }
}
