package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.model.StoryBulletListResponse;
import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import com.ss.android.ugc.aweme.story.model.StoryInteractionListInfo;
import com.ss.android.ugc.aweme.story.model.StoryInteractionListResponse;
import com.ss.android.ugc.aweme.story.model.StoryViewerListResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C330670Cxl implements InterfaceC330680Cxm {
    public final C01GW LL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1988));

    public final ConcurrentHashMap<String, InterfaceC330680Cxm> LJLZ() {
        return (ConcurrentHashMap) this.LL.getValue();
    }

    @Override // X.InterfaceC330680Cxm
    public final C330530CxX getCache() {
        C330530CxX c330530CxX = C330530CxX.LIZJ;
        return C330530CxX.LIZJ;
    }

    public final InterfaceC330680Cxm LLJLILLLLZIIL(Aweme aweme) {
        C330770Cxv.LIZ.getClass();
        int i = C330730Cxr.LIZ[C330770Cxv.LIZ(aweme).ordinal()];
        if (i != 1) {
            if (i != 2) {
                InterfaceC330680Cxm interfaceC330680Cxm = LJLZ().get("post_like_list_type");
                if (interfaceC330680Cxm == null) {
                    InterfaceC330680Cxm interfaceC330680Cxm2 = new InterfaceC330680Cxm() { // from class: X.0Cxc
                        @Override // X.InterfaceC330680Cxm
                        public final boolean LLLZL(Aweme aweme2) {
                            return true;
                        }

                        @Override // X.InterfaceC330680Cxm
                        public final C330530CxX getCache() {
                            C330530CxX c330530CxX = C330530CxX.LIZJ;
                            return C330530CxX.LIZJ;
                        }

                        @Override // X.InterfaceC330680Cxm
                        public final boolean e(Aweme aweme2) {
                            return C330590Cxd.LIZ(this, aweme2);
                        }

                        @Override // X.InterfaceC330680Cxm
                        public final void LLLLLZL(Aweme aweme2, InterfaceC330550CxZ interfaceC330550CxZ, List list) {
                            if (!interfaceC330550CxZ.getHasMore() && interfaceC330550CxZ.isShowLikeListLimit()) {
                                C844470XAv.LIZ.getClass();
                                ((ArrayList) list).add(new C359901aX(C844470XAv.LIZ().getString(2131833940)));
                            }
                        }

                        @Override // X.InterfaceC330680Cxm
                        public final InterfaceC330550CxZ LLLZ(String str, Aweme aweme2, long j, long j2, List<StoryInsertUser> list, Function1<? super InterfaceC330550CxZ, Unit> function1, boolean z) {
                            InterfaceC330550CxZ interfaceC330550CxZ;
                            long diggCount;
                            AwemeStatistics statistics;
                            Object objLIZ = C1179604jS.LIZIZ.LIZ(j, j2, aweme2, null);
                            if (!(objLIZ instanceof InterfaceC330550CxZ) || (interfaceC330550CxZ = (InterfaceC330550CxZ) objLIZ) == null) {
                                return null;
                            }
                            if (aweme2 != null && (statistics = aweme2.getStatistics()) != null) {
                                diggCount = statistics.getDiggCount();
                            } else {
                                diggCount = 0;
                            }
                            interfaceC330550CxZ.setTotal(diggCount);
                            if (j == 0) {
                                C330530CxX c330530CxX = C330530CxX.LIZJ;
                                C330530CxX c330530CxX2 = C330530CxX.LIZJ;
                                if (c330530CxX2 != null) {
                                    c330530CxX2.LIZJ(interfaceC330550CxZ, str);
                                }
                            }
                            if (function1 != null) {
                                function1.invoke(interfaceC330550CxZ);
                            }
                            return interfaceC330550CxZ;
                        }

                        @Override // X.InterfaceC330680Cxm
                        public final InterfaceC330550CxZ O(String str, Aweme aweme2, long j, long j2, List<StoryInsertUser> list, Function1<? super InterfaceC330550CxZ, Unit> function1, boolean z) {
                            return LLLZ(str, aweme2, j, j2, list, function1, z);
                        }
                    };
                    LJLZ().put("post_like_list_type", interfaceC330680Cxm2);
                    return interfaceC330680Cxm2;
                }
                return interfaceC330680Cxm;
            }
            InterfaceC330680Cxm interfaceC330680Cxm3 = LJLZ().get("post_viewer_list_type");
            if (interfaceC330680Cxm3 != null) {
                return interfaceC330680Cxm3;
            }
            InterfaceC330680Cxm interfaceC330680Cxm4 = new InterfaceC330680Cxm() { // from class: X.0Cxe
                public final C01GW LL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1982));

                @Override // X.InterfaceC330680Cxm
                public final boolean LLLZL(Aweme aweme2) {
                    return false;
                }

                @Override // X.InterfaceC330680Cxm
                public final C330530CxX getCache() {
                    C330530CxX c330530CxX = C330530CxX.LIZJ;
                    return C330530CxX.LIZJ;
                }

                @Override // X.InterfaceC330680Cxm
                public final boolean e(Aweme aweme2) {
                    return C330590Cxd.LIZ(this, aweme2);
                }

                @Override // X.InterfaceC330680Cxm
                public final void LLLLLZL(Aweme aweme2, InterfaceC330550CxZ interfaceC330550CxZ, List list) {
                    int i2;
                    if (interfaceC330550CxZ.getHasMore()) {
                        return;
                    }
                    ArrayList arrayList = (ArrayList) list;
                    if (!arrayList.isEmpty()) {
                        if (((Boolean) this.LL.getValue()).booleanValue()) {
                            i2 = 2131837202;
                        } else {
                            i2 = 2131858178;
                        }
                        C844470XAv.LIZ.getClass();
                        arrayList.add(new C359901aX(C844470XAv.LIZ().getString(i2)));
                    }
                }

                @Override // X.InterfaceC330680Cxm
                public final InterfaceC330550CxZ LLLZ(String str, Aweme aweme2, long j, long j2, List<StoryInsertUser> list, Function1<? super InterfaceC330550CxZ, Unit> function1, boolean z) {
                    InterfaceC330550CxZ interfaceC330550CxZ;
                    long playCount;
                    AwemeStatistics statistics;
                    C330780Cxw c330780Cxw = C330780Cxw.LIZIZ;
                    Boolean bool = Boolean.FALSE;
                    Object objLIZ = c330780Cxw.LIZ(aweme2, j, j2, z, null, bool, bool);
                    if (!(objLIZ instanceof InterfaceC330550CxZ) || (interfaceC330550CxZ = (InterfaceC330550CxZ) objLIZ) == null) {
                        return null;
                    }
                    if (aweme2 != null && (statistics = aweme2.getStatistics()) != null) {
                        playCount = statistics.getPlayCount();
                    } else {
                        playCount = 0;
                    }
                    interfaceC330550CxZ.setTotal(playCount);
                    if (j == 0) {
                        C330530CxX c330530CxX = C330530CxX.LIZJ;
                        C330530CxX c330530CxX2 = C330530CxX.LIZJ;
                        if (c330530CxX2 != null) {
                            c330530CxX2.LIZJ(interfaceC330550CxZ, str);
                        }
                    }
                    if (function1 != null) {
                        function1.invoke(interfaceC330550CxZ);
                    }
                    return interfaceC330550CxZ;
                }

                @Override // X.InterfaceC330680Cxm
                public final InterfaceC330550CxZ O(String str, Aweme aweme2, long j, long j2, List<StoryInsertUser> list, Function1<? super InterfaceC330550CxZ, Unit> function1, boolean z) {
                    return LLLZ(str, aweme2, j, j2, list, function1, z);
                }
            };
            LJLZ().put("post_viewer_list_type", interfaceC330680Cxm4);
            return interfaceC330680Cxm4;
        }
        InterfaceC330680Cxm interfaceC330680Cxm5 = LJLZ().get("story_viewer_list_type");
        if (interfaceC330680Cxm5 != null) {
            return interfaceC330680Cxm5;
        }
        InterfaceC330680Cxm interfaceC330680Cxm6 = new InterfaceC330680Cxm() { // from class: X.0Cxb
            @Override // X.InterfaceC330680Cxm
            public final boolean LLLZL(Aweme aweme2) {
                return false;
            }

            @Override // X.InterfaceC330680Cxm
            public final C330530CxX getCache() {
                C330530CxX c330530CxX = C330530CxX.LIZJ;
                return C330530CxX.LIZJ;
            }

            @Override // X.InterfaceC330680Cxm
            public final boolean e(Aweme aweme2) {
                return C330590Cxd.LIZ(this, aweme2);
            }

            @Override // X.InterfaceC330680Cxm
            public final void LLLLLZL(Aweme aweme2, InterfaceC330550CxZ interfaceC330550CxZ, List list) {
                if (interfaceC330550CxZ.getHasMore() || Intrinsics.LJFF(interfaceC330550CxZ.isFullViewer(), Boolean.TRUE) || C718060SEq.LIZ(aweme2, Integer.valueOf(interfaceC330550CxZ.getExpiryPeriod()))) {
                    return;
                }
                C844470XAv.LIZ.getClass();
                ((ArrayList) list).add(new C359901aX(C786410Ut5.j4(C844470XAv.LIZ().getString(2131858241), Arrays.copyOf(new Object[]{String.valueOf(interfaceC330550CxZ.getExpiryPeriod())}, 1))));
            }

            @Override // X.InterfaceC330680Cxm
            public final InterfaceC330550CxZ LLLZ(String str, Aweme aweme2, long j, long j2, List<StoryInsertUser> list, Function1<? super InterfaceC330550CxZ, Unit> function1, boolean z) {
                boolean zLJI = MethodIDManager.LJI(202237);
                StoryViewerListResponse storyViewerListResponse = StoryApi.LIZIZ.fetchStoryViewerList(str, j, 50, C08JS.LIZLLL(list)).execute().LIZIZ;
                StoryViewerListResponse storyViewerListResponse2 = storyViewerListResponse;
                if (C730150SkX.LIZJ(aweme2)) {
                    storyViewerListResponse2.interactionUserList = C13BV.INSTANCE;
                }
                if (j == 0) {
                    C330530CxX c330530CxX = C330530CxX.LIZJ;
                    C330530CxX c330530CxX2 = C330530CxX.LIZJ;
                    if (c330530CxX2 != null) {
                        c330530CxX2.LIZJ(storyViewerListResponse2, str);
                    }
                }
                if (function1 != null) {
                    function1.invoke(storyViewerListResponse2);
                }
                StoryViewerListResponse storyViewerListResponse3 = storyViewerListResponse;
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return storyViewerListResponse3;
            }

            @Override // X.InterfaceC330680Cxm
            public final InterfaceC330550CxZ O(String str, Aweme aweme2, long j, long j2, List<StoryInsertUser> list, Function1<? super InterfaceC330550CxZ, Unit> function1, boolean z) {
                StoryViewerListResponse storyViewerListResponse;
                List<StoryInteractionListInfo> list2;
                StoryInteractionListResponse storyInteractionListResponse = StoryApi.LIZIZ.fetchStoryViewerListAndBullet(str, j, 50, C08JS.LIZLLL(list), C1697810uHb.LJIIJJI(2, 1).toString()).execute().LIZIZ;
                if (aweme2 != null && C730150SkX.LIZJ(aweme2) && (list2 = storyInteractionListResponse.interactionUserList) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<StoryInteractionListInfo> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        it2.next().interactionList = C13BV.INSTANCE;
                        arrayList.add(Unit.LIZ);
                    }
                }
                StoryInteractionListInfo storyInteractionListInfoLJ = storyInteractionListResponse.LJ(1);
                StoryBulletListResponse storyBulletListResponse = null;
                if (storyInteractionListInfoLJ == null) {
                    storyViewerListResponse = null;
                } else {
                    storyViewerListResponse = new StoryViewerListResponse(storyInteractionListResponse.total, storyInteractionListInfoLJ.hasMore, storyInteractionListInfoLJ.nextCursor, storyInteractionListInfoLJ.interactionList, storyInteractionListResponse.storyAnalytics, Boolean.FALSE, storyInteractionListInfoLJ.expiryPeriod, storyInteractionListResponse.viewersCount, StoryViewerListResponse.class.getName());
                }
                StoryInteractionListInfo storyInteractionListInfoLJ2 = storyInteractionListResponse.LJ(2);
                if (storyInteractionListInfoLJ2 != null) {
                    storyBulletListResponse = new StoryBulletListResponse(storyInteractionListResponse.total, storyInteractionListInfoLJ2.hasMore, storyInteractionListInfoLJ2.nextCursor, storyInteractionListInfoLJ2.interactionList, 0L, StoryBulletListResponse.class.getName());
                }
                if (storyViewerListResponse != null) {
                    C330530CxX c330530CxX = C330530CxX.LIZJ;
                    C330530CxX c330530CxX2 = C330530CxX.LIZJ;
                    if (c330530CxX2 != null) {
                        c330530CxX2.LIZJ(storyViewerListResponse, str);
                    }
                }
                if (storyBulletListResponse != null) {
                    C330530CxX c330530CxX3 = C330530CxX.LIZJ;
                    C330530CxX c330530CxX4 = C330530CxX.LIZJ;
                    if (c330530CxX4 != null) {
                        c330530CxX4.LIZLLL(str, storyBulletListResponse);
                    }
                }
                if (storyViewerListResponse != null && function1 != null) {
                    function1.invoke(storyViewerListResponse);
                }
                return storyViewerListResponse;
            }
        };
        LJLZ().put("story_viewer_list_type", interfaceC330680Cxm6);
        return interfaceC330680Cxm6;
    }

    @Override // X.InterfaceC330680Cxm
    public final boolean LLLZL(Aweme aweme) {
        return LLJLILLLLZIIL(aweme).LLLZL(aweme);
    }

    @Override // X.InterfaceC330680Cxm
    public final boolean e(Aweme aweme) {
        return C330590Cxd.LIZ(this, aweme);
    }

    @Override // X.InterfaceC330680Cxm
    public final void LLLLLZL(Aweme aweme, InterfaceC330550CxZ interfaceC330550CxZ, List list) {
        LLJLILLLLZIIL(aweme).LLLLLZL(aweme, interfaceC330550CxZ, list);
    }

    @Override // X.InterfaceC330680Cxm
    public final InterfaceC330550CxZ LLLZ(String str, Aweme aweme, long j, long j2, List<StoryInsertUser> list, Function1<? super InterfaceC330550CxZ, Unit> function1, boolean z) {
        return LLJLILLLLZIIL(aweme).LLLZ(str, aweme, j, j2, list, function1, z);
    }

    @Override // X.InterfaceC330680Cxm
    public final InterfaceC330550CxZ O(String str, Aweme aweme, long j, long j2, List<StoryInsertUser> list, Function1<? super InterfaceC330550CxZ, Unit> function1, boolean z) {
        return LLJLILLLLZIIL(aweme).O(str, aweme, j2, j, list, function1, z);
    }
}
