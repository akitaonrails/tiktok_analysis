package X;

import Y.ARunnableS107S0100000_7;
import Y.ARunnableS13S0100100_7;
import Y.ARunnableS14S0201000_7;
import Y.ARunnableS6S0301000_7;
import Y.AfS0S1200100_7;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.bl.enterroomboost.EnterRoomUpdateManager;
import com.bytedance.android.livesdk.live.data.DrawRoomListModel;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.feed.TopLiveGuaranteeDataExpSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutRoomFeedEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiTopLiveRecommendFeedEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FeedRequestParamsSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FollowFeedDrawLoopSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDedupOptExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveStatusMonitorUnRegister;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.setting.LiveDrawListBackupSetting;
import com.bytedance.android.livesdk.setting.LiveRoomInsertScrollState;
import com.bytedance.android.livesdk.setting.LoadMoreRetrySetting;
import com.bytedance.android.livesdk.setting.SkylightBackupDataSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveStatusCheckService;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.util.LiveOptDedupRoomExp;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS11S1310000_7;
import kotlin.jvm.internal.AwS125S0110000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import webcast.api.feed.SpecialCard;

/* JADX INFO: renamed from: X.0ISJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ISJ extends C0IOL implements C0IRI {
    public boolean LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;
    public C0IRR LLJ;
    public int LLJI;
    public DrawRoomListModel LLJIJIL;
    public volatile Map<String, String> LLJJ;
    public volatile boolean LLJJI;
    public volatile boolean LLJJIII;
    public volatile boolean LLJJIJI;
    public volatile Set<Long> LLJJIJIIJIL;
    public volatile Set<Long> LLJJIJIL;
    public final HashMap<Long, String> LLJJJ;
    public final HashMap<Long, String> LLJJJIL;
    public Pair<String, String> LLJJJJ;
    public int LLJJJJJIL;
    public final HashSet<Long> LLJJJJLIIL;
    public final HashMap<String, HashSet<Long>> LLJJL;
    public FeedExtra LLJJLIIIJLLLLLLLZ;
    public FeedExtra LLJL;
    public final Room LLJLIL;
    public final long LLJLILLLLZIIL;
    public final long LLJLL;
    public String LLJLLIL;
    public String LLJLLL;
    public String LLJZ;
    public boolean LLJZIJLIL;
    public final C11NJ LLL;
    public int LLLF;
    public long LLLFF;
    public boolean LLLFFI;
    public String LLLFZ;
    public String LLLI;
    public final String LLLII;
    public final String LLLIIII;
    public final String LLLIIIIL;
    public EnterRoomConfig.DrawParams LLLIIIL;
    public final boolean LLLIIL;
    public long LLLIILIL;
    public int LLLIL;
    public final EnterRoomConfig.ECWrapData LLLILZ;
    public List<FeedItem> LLLILZJ;
    public int LLLILZLLLI;
    public C11JF LLLIZZ;
    public final AtomicBoolean LLLJ;
    public boolean LLLJIL;
    public final String LLLJL;
    public final String LLLL;
    public final String LLLLII;
    public String LLLLIIIILLL;
    public int LLLLIIL;
    public long LLLLIILL;
    public String LLLLIILLL;
    public final long LLLLIL;
    public final boolean LLLLILI;
    public volatile boolean LLLLJ;
    public final AtomicInteger LLLLJI;
    public final int LLLLL;
    public final C01GW LLLLLIL;
    public final C01GW LLLLLILLIL;
    public final C01GW LLLLLJIL;
    public final C01GW LLLLLJLJLL;
    public Function0<Boolean> LLLLLL;
    public AwS551S0100000_7 LLLLLLIL;
    public boolean LLLLLLJ;
    public Function1<? super Integer, Unit> LLLLLLL;
    public final C0ISM LLLLLLLLL;
    public final String LLLLLLLLLL;
    public final String LLLLLLLZIL;
    public String LLLLLLZ;
    public int LLLLLLZZ;
    public int LLLLLZ;
    public int LLILZIL = 1;
    public final ArrayList<Room> LLJILJIL = new ArrayList<>();
    public final ArrayList<EnterRoomConfig> LLJILJILJ = new ArrayList<>();
    public volatile int LLJILLL = -1;

    @Override // X.C0IOL
    public final String LJJI() {
        return "DrawRoomListProvider";
    }

    @Override // X.C0IOL
    public final void LJJIIZ() {
        LJJL(this, 0, "push_entrance_simple", false, null, false, null, 0, 224);
    }

    @Override // X.C0IRI
    public final int LIZLLL() {
        List<FeedItem> list = this.LLLILZJ;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.C0IRI
    public final int LJII() {
        int i;
        List<FeedItem> list = this.LLLILZJ;
        if (list == null || list.isEmpty() || (i = this.LLLILZLLLI) < 0) {
            return -1;
        }
        List<FeedItem> list2 = this.LLLILZJ;
        return i + (list2 != null ? list2.size() : 0);
    }

    @Override // X.C0IOL
    public final void LJIILIIL() {
        ArrayList arrayList = new ArrayList();
        for (Room room : this.LLJILJIL) {
            if (!this.LLJJJJLIIL.contains(Long.valueOf(room.getId())) && this.LLJLILLLLZIIL != room.getId()) {
                arrayList.add(room);
                arrayList.size();
            }
        }
        if (!arrayList.isEmpty()) {
            if (this.LLLFF < 0) {
                this.LLLFF = SystemClock.uptimeMillis();
            }
            C0ISO c0iso = C0ISO.INNER_FEED;
            long j = this.LLLFF;
            if (TopLiveGuaranteeDataExpSetting.INSTANCE.getConfig().enable) {
                Map<C0ISO, kotlin.Pair<Long, List<Room>>> map = C0ISN.LIZ;
                kotlin.Pair pair = (kotlin.Pair) ((LinkedHashMap) map).get(c0iso);
                if ((pair != null ? ((Number) pair.getFirst()).longValue() : -1L) < j) {
                    map.put(c0iso, new kotlin.Pair<>(Long.valueOf(j), arrayList));
                }
            }
        }
    }

    @Override // X.C0IOL
    public final int LJIIZILJ() {
        Room room = this.LLJLIL;
        if (room != null && this.LLJILJIL.contains(room)) {
            return this.LLJILJIL.indexOf(room);
        }
        return 0;
    }

    @Override // X.C0IOL
    public final boolean LJJIFFI() {
        FeedExtra feedExtra = this.LLJJLIIIJLLLLLLLZ;
        boolean z = false;
        if (feedExtra != null && !feedExtra.hasMore) {
            z = true;
        }
        return !z;
    }

    @Override // X.C0IOL
    public final void LJJIJL() {
        LinkedHashSet linkedHashSet;
        int iLJIIJ = C1697810uHb.LJIIJ(this.LLJILJIL);
        int i = this.LLLLIIL;
        if (iLJIIJ < i || i < 0 || iLJIIJ < 0) {
            linkedHashSet = null;
        } else {
            try {
                linkedHashSet = new LinkedHashSet();
                int i2 = this.LLLLIIL;
                if (i2 <= iLJIIJ) {
                    while (true) {
                        Room room = this.LLJILJIL.get(i2);
                        if (!room.isVariantCard()) {
                            linkedHashSet.add(room);
                        }
                        if (i2 == iLJIIJ) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                linkedHashSet = null;
            }
        }
        if (linkedHashSet != null) {
            if (LiveStatusMonitorUnRegister.INSTANCE.unregister()) {
                ILiveStatusCheckService iLiveStatusCheckService = (ILiveStatusCheckService) C1161920gLG.LIZJ(ILiveStatusCheckService.class);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(linkedHashSet, 10));
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    User owner = ((Room) it2.next()).getOwner();
                    arrayList.add(String.valueOf(owner != null ? owner.getId() : 0L));
                }
                Set setLLIIIZ = C13LP.LLIIIZ(arrayList);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(linkedHashSet, 10));
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Long.valueOf(((Room) it3.next()).getId()));
                }
                iLiveStatusCheckService.oj1(6, setLLIIIZ, C13LP.LLIIIZ(arrayList2));
            }
            this.LLILZLL = false;
            this.LLLLLZ = 0;
        }
        this.LLJJJJLIIL.clear();
        this.LLJJL.clear();
        this.LLJILJILJ.clear();
        this.LLJILJIL.clear();
        this.LLL.LJ();
        this.LLJZIJLIL = false;
        this.LLLLLLJ = false;
        this.LLLLLLL = null;
        LJJLIIIJLJLI(null);
        C0ISQ c0isqLJJJJLI = LJJJJLI();
        ((CopyOnWriteArrayList) c0isqLJJJJLI.LJ.getValue()).clear();
        c0isqLJJJJLI.LIZLLL = 0;
        C11JF c11jf = c0isqLJJJJLI.LIZIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C0ISZ c0iszLJJJJJL = LJJJJJL();
        AnonymousClass0956 anonymousClass0956 = c0iszLJJJJJL.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c0iszLJJJJJL.LIZLLL = null;
    }

    public final C0ISZ LJJJJJL() {
        return (C0ISZ) this.LLLLLJIL.getValue();
    }

    public final boolean LJJJJL() {
        return ((Boolean) this.LLLLLJLJLL.getValue()).booleanValue();
    }

    public final C0ISQ LJJJJLI() {
        return (C0ISQ) this.LLLLLILLIL.getValue();
    }

    public final EnterRoomConfig LJJJJLL() {
        if (this.LLJILJILJ.size() <= 0) {
            return null;
        }
        return LIZIZ(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJJJZ() {
        /*
            r8 = this;
            java.lang.String r1 = r8.LLJLLL
            java.lang.String r3 = "_loadmore"
            r0 = 0
            boolean r0 = kotlin.text.u.LJIIZILJ(r1, r3, r0)
            if (r0 == 0) goto L1a
            X.0IKl r0 = X.C464770IKl.LIZ
            java.lang.String r1 = r8.LLLII
            java.lang.String r0 = r8.LLLIIII
            boolean r0 = X.C464770IKl.LIZ(r1, r0)
            if (r0 == 0) goto L1a
            java.lang.String r0 = r8.LLJLLL
            return r0
        L1a:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r8.LLJLLL
            r2.append(r0)
            boolean r0 = r8.LLLJIL
            if (r0 == 0) goto L31
            java.lang.String r3 = "_no_more"
        L29:
            r2.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            return r0
        L31:
            com.bytedance.android.live.base.model.feed.FeedExtra r0 = r8.LLJJLIIIJLLLLLLLZ
            r6 = 0
            if (r0 == 0) goto L64
            long r4 = r0.maxTime
        L39:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r4 = "mg_random_match_inner_nomore"
            java.lang.String r1 = "vertical_base_draw_no_more"
            if (r0 != 0) goto L6a
            java.lang.String r0 = r8.LLJLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto La8
            java.lang.String r0 = r8.LLJLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 != 0) goto La8
            boolean r0 = r8.LLJJIJI
            if (r0 != 0) goto La5
            boolean r0 = com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiTopLiveLoadMoreOptSetting.isEnable()
            if (r0 == 0) goto L67
            boolean r0 = r8.LLLLILI
            if (r0 == 0) goto L67
            com.bytedance.android.live.base.model.feed.FeedExtra r0 = r8.LLJJLIIIJLLLLLLLZ
            if (r0 != 0) goto L67
            goto L29
        L64:
            r4 = 0
            goto L39
        L67:
            java.lang.String r3 = "_refresh"
            goto L29
        L6a:
            java.lang.String r0 = r8.LLJLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto La8
            java.lang.String r0 = r8.LLJLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 != 0) goto La8
            boolean r0 = r8.LLJJIJI
            if (r0 != 0) goto La5
            boolean r0 = com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiTopLiveRecommendFeedEnableSetting.isEnable()
            if (r0 == 0) goto L29
            boolean r0 = r8.LLLLILI
            if (r0 == 0) goto L29
            com.bytedance.android.live.base.model.feed.FeedExtra r0 = r8.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L97
            boolean r1 = r0.hasMore
            r0 = 1
            if (r1 != r0) goto L97
            boolean r0 = r8.LJJLIIJ()
            if (r0 == 0) goto L29
        L97:
            X.0IKl r0 = X.C464770IKl.LIZ
            boolean r0 = r0.LJ()
            if (r0 == 0) goto L29
            boolean r0 = X.C464770IKl.LJI()
            if (r0 == 0) goto L29
        La5:
            java.lang.String r3 = "_nomore"
            goto L29
        La8:
            java.lang.String r3 = ""
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ISJ.LJJJJZ():java.lang.String");
    }

    public final boolean LJJLIIJ() {
        String str;
        FeedExtra feedExtra;
        FeedExtra feedExtra2 = this.LLJJLIIIJLLLLLLLZ;
        if (feedExtra2 == null || (str = feedExtra2.unreadExtra) == null || !a0.LJJIIZI(str, "_nomore", false) || (feedExtra = this.LLJJLIIIJLLLLLLLZ) == null || !feedExtra.hasMore) {
            return false;
        }
        C464770IKl c464770IKl = C464770IKl.LIZ;
        return C464770IKl.LJI();
    }

    @Override // X.C0IOG
    public final int size() {
        FeedExtra feedExtra = this.LLJJLIIIJLLLLLLLZ;
        if (feedExtra != null && !feedExtra.hasMore && this.LLJILJIL.size() > 0) {
            FollowFeedDrawLoopSetting followFeedDrawLoopSetting = FollowFeedDrawLoopSetting.INSTANCE;
            if (C500260Jjc.LJJJI(Boolean.valueOf(followFeedDrawLoopSetting.getValue().isEnable())) && this.LLJILJIL.size() >= followFeedDrawLoopSetting.getValue().getThreshold()) {
                C0ISY c0isy = LiveFeedDraw.Companion;
                String str = this.LLLII;
                String str2 = this.LLLIIII;
                c0isy.getClass();
                if (C0ISY.LIZLLL(str, str2).isFollow) {
                    return Integer.MAX_VALUE;
                }
            }
        }
        return this.LLJILJILJ.size();
    }

    @Override // X.C0IOL
    public final void LJJIJ() {
        if (LJJJJL()) {
            C0ISQ c0isqLJJJJLI = LJJJJLI();
            c0isqLJJJJLI.LIZJ = true;
            C11JF c11jf = c0isqLJJJJLI.LIZIZ;
            if (c11jf != null) {
                c11jf.dispose();
            }
        }
    }

    @Override // X.C0IOL
    public final void LJJIJIIJI() {
        if (LJJJJL()) {
            C0ISQ c0isqLJJJJLI = LJJJJLI();
            c0isqLJJJJLI.LIZJ = false;
            c0isqLJJJJLI.LIZIZ();
        }
    }

    @Override // X.C0IOL
    public final String LJIJI() {
        return this.LLLLIIIILLL;
    }

    @Override // X.C0IOL
    public final int LJIJJLI() {
        return this.LLJJJJJIL;
    }

    @Override // X.C0IOL
    public final List<Room> LJJ() {
        return this.LLJILJIL;
    }

    @Override // X.C0IOL
    public final boolean LJJIIJ() {
        return this.LLJZIJLIL;
    }

    @Override // X.C0IRI
    public final boolean isLoadMore() {
        return this.LLJZIJLIL;
    }

    public static final String LJJJJI(String str) {
        if (!TextUtils.isEmpty(str) && a0.LJJIIZI(str, "/webcast/feed/", false)) {
            if ((((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse()) && !a0.LJJIIZI(str, "&debug=true", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("&debug=true");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return str;
        }
        return str;
    }

    public static boolean LJJJJZI(User user) {
        long jLongValue;
        if (user == null) {
            return false;
        }
        FollowInfo followInfo = user.getFollowInfo();
        if (followInfo != null) {
            jLongValue = followInfo.getFollowStatus();
        } else {
            Long l = user.followStatus;
            if (l == null) {
                return false;
            }
            jLongValue = l.longValue();
        }
        if (jLongValue != 2) {
            return false;
        }
        return true;
    }

    @Override // X.C0IRI
    public final void LIZ(int i) {
        this.LLILZIL = i;
        if (LJJJJL()) {
            if (i == 2) {
                C20441214yg.LIZIZ("DrawRoomListProvider", "onOrientationChanged: landscape pause");
                C0ISQ c0isqLJJJJLI = LJJJJLI();
                c0isqLJJJJLI.LIZJ = true;
                C11JF c11jf = c0isqLJJJJLI.LIZIZ;
                if (c11jf != null) {
                    c11jf.dispose();
                    return;
                }
                return;
            }
            C20441214yg.LIZIZ("DrawRoomListProvider", "onOrientationChanged: portrait resume");
            C0ISQ c0isqLJJJJLI2 = LJJJJLI();
            c0isqLJJJJLI2.LIZJ = false;
            c0isqLJJJJLI2.LIZIZ();
        }
    }

    @Override // X.C0IOG
    public final EnterRoomConfig LIZIZ(int i) {
        int size;
        if (this.LLJILJILJ.size() <= 0) {
            size = -1;
        } else {
            size = i % this.LLJILJILJ.size();
        }
        if (this.LLJILJILJ.size() >= size) {
            return (EnterRoomConfig) ListProtector.get(this.LLJILJILJ, size);
        }
        if (this.LLJILJIL.size() >= size) {
            return C464330IIt.LIZJ(true, (Room) ListProtector.get(this.LLJILJIL, size));
        }
        return (EnterRoomConfig) ListProtector.get(this.LLJILJILJ, size);
    }

    @Override // X.C0IRI
    public final void LIZJ(int i) {
        boolean z;
        List<FeedItem> list;
        Long lValueOf;
        FeedExtra feedExtra = this.LLJL;
        if (feedExtra != null) {
            this.LLJJLIIIJLLLLLLLZ = feedExtra;
        }
        C11JF c11jf = this.LLLIZZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJZIJLIL = false;
        this.LLLJ.set(true);
        if (i >= 0 && i < this.LLJILJIL.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z && (list = this.LLLILZJ) != null && !((ArrayList) list).isEmpty()) {
            long id = ((Room) ListProtector.get(this.LLJILJIL, i)).getId();
            List<FeedItem> list2 = this.LLLILZJ;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator it2 = ((ArrayList) list2).iterator();
                while (it2.hasNext()) {
                    Room room = ((FeedItem) it2.next()).getRoom();
                    if (room != null) {
                        lValueOf = Long.valueOf(room.getId());
                    } else {
                        lValueOf = null;
                    }
                    arrayList.add(lValueOf);
                }
                ArrayList<Long> arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    Long l = (Long) obj;
                    if (l == null || l.longValue() != id) {
                        arrayList2.add(obj);
                    }
                }
                for (Long l2 : arrayList2) {
                    if (l2 != null) {
                        LJJLIIIJJIZ(l2.longValue(), false);
                    }
                }
            }
            LJIILJJIL();
            this.LLLILZJ = null;
            this.LLLILZLLLI = -1;
            return;
        }
        this.LLLILZJ = null;
        this.LLLILZLLLI = -1;
    }

    @Override // X.C0IRI
    public final void LJFF(int i) {
        String strLJJJJZ;
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            strLJJJJZ = LJJJJZ();
        } else {
            strLJJJJZ = "landscape_loadmore";
        }
        LJJJZ(i, LJII(), strLJJJJZ);
    }

    @Override // X.C0IRI
    public final void LJI(int i) {
        String strLJJJJZ;
        C0IIO.LIZIZ = true;
        this.LLLILZJ = new ArrayList();
        this.LLLILZLLLI = i;
        FeedExtra feedExtra = this.LLJJLIIIJLLLLLLLZ;
        this.LLJL = feedExtra;
        if (feedExtra != null) {
            feedExtra.hasMore = true;
        }
        this.LLLJ.set(true);
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            strLJJJJZ = LJJJJZ();
        } else {
            strLJJJJZ = "landscape_refresh";
        }
        LJJJZ(i, this.LLLILZLLLI, strLJJJJZ);
    }

    @Override // X.C0IOG
    public final int LJIIIIZZ(EnterRoomConfig enterRoomConfig) {
        Object objLJIJ = C0IOL.LJIJ(enterRoomConfig);
        if (objLJIJ == null) {
            objLJIJ = -1L;
        }
        int size = this.LLJILJILJ.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(this.LLJILJILJ, i);
            if (Intrinsics.LJFF(C0IOL.LJIJ((EnterRoomConfig) obj), objLJIJ) && obj != null) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.C0IOL, X.C0IOG
    public final void LJIIJ(Room room) {
        if (room != null) {
            int size = this.LLJILJIL.size();
            for (int i = 0; i < size; i++) {
                if (((Room) ListProtector.get(this.LLJILJIL, i)).getId() == room.getId()) {
                    ListProtector.set(this.LLJILJIL, i, room);
                    return;
                }
            }
        }
    }

    @Override // X.C0IOL, X.C0IOG
    public final Room LJIIJJI(int i) {
        int size;
        if (this.LLJILJIL.size() > 0 && (size = i % this.LLJILJIL.size()) >= 0 && size < this.LLJILJIL.size()) {
            return (Room) ListProtector.get(this.LLJILJIL, size);
        }
        return null;
    }

    @Override // X.C0IOL
    public final void LJIIL(C0ISF<Room> c0isf) {
        LJJJJIZL(c0isf, false);
    }

    @Override // X.C0IOL
    public final List<Long> LJIILL(int i) {
        if (i < this.LLJILJILJ.size() - 1) {
            ArrayList<EnterRoomConfig> arrayList = this.LLJILJILJ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator<EnterRoomConfig> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(it2.next().mRoomsData.roomId));
            }
            return arrayList2.subList(i + 1, this.LLJILJILJ.size());
        }
        return null;
    }

    @Override // X.C0IOL
    public final String LJIL(long j) {
        String str = this.LLJJJIL.get(Long.valueOf(j));
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.C0IOL
    public final void LJJIIJZLJL(int i) {
        LJJL(this, i, null, false, null, false, null, 0, 224);
    }

    @Override // X.C0IOL
    public final void LJJIJIIJIL(int i) {
        if (i == 0) {
            C20441214yg.LIZIZ("DrawRoomListProvider", "on scroll idle, do remove");
            if (!this.LLJZIJLIL) {
                LJJJJJL().LIZIZ(Integer.valueOf(i), new C0ISW(this));
            }
        }
    }

    @Override // X.C0IOL
    public final void LJJIL(long j) {
        if (!C086I.LIZIZ(this.LLJILJIL) && !C086I.LIZIZ(this.LLJILJILJ)) {
            C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS13S0100100_7(this, j, 12));
        }
    }

    public final void LJJJJ(EnterRoomConfig enterRoomConfig) {
        HashMap<Long, String> map;
        if ((!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() && !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse()) || (map = enterRoomConfig.mRoomsData.debugInfos) == null) {
            return;
        }
        for (Map.Entry<Long, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.LLJJJ.put(entry.getKey(), entry.getValue());
                HashMap<Long, String> map2 = this.LLJJJIL;
                Long key = entry.getKey();
                String str = enterRoomConfig.mRoomsData.oceanReqInfo;
                if (str == null) {
                    str = "";
                }
                map2.put(key, str);
            }
        }
    }

    public final void LJJJJJ(int i) {
        Function1<? super Integer, Unit> function1 = this.LLLLLLL;
        if (function1 == null) {
            return;
        }
        this.LLLLLLL = null;
        function1.invoke(Integer.valueOf(i));
    }

    public final void LJJJLIIL(EnterRoomConfig enterRoomConfig) {
        long jLongValue;
        SpecialCard specialCard;
        Long lLJIILIIL;
        ArrayList<EnterRoomConfig> arrayList = enterRoomConfig.mLogData.frontRoomConfig;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < size; i++) {
            EnterRoomConfig enterRoomConfig2 = (EnterRoomConfig) ListProtector.get(arrayList, i);
            LJJLIIIJJI(enterRoomConfig2);
            LJJLIIIJILLIZJL(enterRoomConfig2);
            LJJLIIIJ(enterRoomConfig2, C2097608Jq.LJ());
            if (!C0IOV.LIZ(Long.valueOf(enterRoomConfig2.mRoomsData.roomId), this.LLJILJIL)) {
                arrayList3.add(enterRoomConfig2);
                Room room = new Room();
                room.setId(enterRoomConfig2.mRoomsData.roomId);
                room.setIdStr(String.valueOf(room.getId()));
                room.isFromRecommendCard = !TextUtils.isEmpty(enterRoomConfig2.mRoomsData.enterFromMergeRecommend);
                User user = new User();
                String str = enterRoomConfig2.mRoomsData.userId;
                if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                user.setId(jLongValue);
                user.setIdStr(String.valueOf(user.getId()));
                room.setOwner(user);
                EnterRoomConfig.SpecialCardWrapper specialCardWrapper = enterRoomConfig2.mRoomsData.specialCard;
                if (specialCardWrapper != null) {
                    specialCard = specialCardWrapper.toSpecialCard();
                } else {
                    specialCard = null;
                }
                room.specialCard = specialCard;
                room.pullStreamData = enterRoomConfig2.mStreamData.pullStreamData;
                if (C500260Jjc.LJJIJIIJI(enterRoomConfig2.mRoomsData.bgUrls) && room.bgUrls == null) {
                    room.bgUrls = enterRoomConfig2.mRoomsData.bgUrls;
                }
                if (C500260Jjc.LJJIJIIJI(enterRoomConfig2.mRoomsData.gaussianBgUrls) && room.gaussianBgUrls == null) {
                    room.gaussianBgUrls = enterRoomConfig2.mRoomsData.gaussianBgUrls;
                }
                room.defaultQualitySdkKey = enterRoomConfig2.mStreamData.pullDefaultResolution;
                EnterRoomConfig.ConfigRoomExtraInfo configRoomExtraInfo = enterRoomConfig2.mRoomsData.configRoomExtraInfo;
                if (configRoomExtraInfo != null) {
                    configRoomExtraInfo.appendToRoom(room);
                }
                this.LLJJJJLIIL.add(Long.valueOf(room.getId()));
                arrayList2.add(room);
            }
        }
        this.LLJILJIL.addAll(0, arrayList2);
        this.LLJILJILJ.addAll(0, arrayList3);
    }

    public final void LJJLIIIJILLIZJL(EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig != null && Intrinsics.LJFF(this.LLLLII, "feed_room") && HangoutRoomFeedEnableSetting.INSTANCE.isEnable()) {
            enterRoomConfig.mRoomsData.hangoutEnterSource = this.LLLLII;
        }
    }

    public final void LJJLIIIJJI(EnterRoomConfig enterRoomConfig) {
        boolean z = this.LLLFFI;
        if (z && enterRoomConfig != null) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.fromNewStyle = z;
            roomsData.fromDrawerStyle = this.LLLFZ;
            roomsData.enterFromLiveSource = this.LLLI;
            EnterRoomConfig.DrawParams drawParams = this.LLLIIIL;
            enterRoomConfig.drawParams = drawParams;
            roomsData.feedUrl = this.LLJLLIL;
            if (drawParams.openLiveFromGameDrawer) {
                roomsData.windowMode = "small_picture";
                return;
            }
            if (drawParams.openLiveFromSkylightDrawer) {
                roomsData.windowMode = "full_screen";
            } else if (drawParams.openLiveFromDrawer) {
                roomsData.windowMode = "small_picture";
            } else {
                roomsData.windowMode = "full_screen";
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJL(java.lang.String r2) {
        /*
            r1 = this;
            boolean r0 = r1.LLLLLLJ
            if (r0 == 0) goto L17
            boolean r0 = r1.LLJZIJLIL
            if (r0 != 0) goto L17
            r0 = 0
            r1.LLLLLLJ = r0
            int r0 = r2.hashCode()
            switch(r0) {
                case -2122402948: goto L36;
                case -489204400: goto L2c;
                case 2008570627: goto L22;
                case 2110084883: goto L18;
                default: goto L12;
            }
        L12:
            r0 = 99
        L14:
            r1.LJJJJJ(r0)
        L17:
            return
        L18:
            java.lang.String r0 = "no_more"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L12
            r0 = 4
            goto L14
        L22:
            java.lang.String r0 = "observable_null"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L12
            r0 = 6
            goto L14
        L2c:
            java.lang.String r0 = "enter_room_id_invalid"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L12
            r0 = 3
            goto L14
        L36:
            java.lang.String r0 = "exit_exp"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L12
            r0 = 5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ISJ.LJJLIIIJL(java.lang.String):void");
    }

    public final void LJJLIIIJLJLI(AwS551S0100000_7 awS551S0100000_7) {
        boolean z;
        if (this.LLLLLL != null) {
            C0ISQ c0isqLJJJJLI = LJJJJLI();
            ((CopyOnWriteArrayList) c0isqLJJJJLI.LJ.getValue()).remove(this.LLLLLLLLL);
        }
        this.LLLLLL = awS551S0100000_7;
        if (awS551S0100000_7 != null && LJJJJL()) {
            C0ISQ c0isqLJJJJLI2 = LJJJJLI();
            ((CopyOnWriteArrayList) c0isqLJJJJLI2.LJ.getValue()).add(this.LLLLLLLLL);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init/set_feed_expired_handler registered=");
        if (awS551S0100000_7 != null && LJJJJL()) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJJJLZIJ(ArrayList arrayList, EnterRoomConfig enterRoomConfig) {
        LiveOptDedupRoomExp liveOptDedupRoomExp = LiveOptDedupRoomExp.INSTANCE;
        if (liveOptDedupRoomExp.enable()) {
            if (liveOptDedupRoomExp.enable() && arrayList != null && !arrayList.isEmpty()) {
                try {
                    long j = enterRoomConfig.mRoomsData.roomId;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        EnterRoomConfig enterRoomConfig2 = (EnterRoomConfig) C13LP.LJJJLZIJ(i, arrayList);
                        if (enterRoomConfig2 != null && enterRoomConfig2.mRoomsData.roomId == j) {
                            return false;
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            EnterRoomConfig enterRoomConfig3 = (EnterRoomConfig) it2.next();
            if (enterRoomConfig.mRoomsData.roomId == enterRoomConfig3.mRoomsData.roomId && TextUtils.equals(enterRoomConfig.mLogData.requestId, enterRoomConfig3.mLogData.requestId)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C0IRI
    public final boolean LJIIIZ(int i, int i2) {
        int iLJII = LJII();
        if (iLJII > 0 && iLJII >= i2 && iLJII - i2 <= i) {
            return true;
        }
        return false;
    }

    @Override // X.C0IOL
    public final String LJIILLIIL(int i, long j) {
        if (i == 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LogId:");
            sbLIZ.append(this.LLLLLLZ);
            sbLIZ.append(". hasMore = ");
            sbLIZ.append(LJJIFFI());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        String str = this.LLJJJ.get(Long.valueOf(j));
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.C0IOL
    public final C0IOO LJJII(int i, Room room) {
        Integer numValueOf;
        Room next;
        Integer numValueOf2;
        if (i >= 0 && i <= this.LLJILJIL.size() && i <= this.LLJILJILJ.size() && i >= this.LLLLLLZZ + 2) {
            Iterator<Room> it2 = this.LLJILJIL.iterator();
            while (true) {
                numValueOf = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getId() == room.getId()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next != null) {
                C20441214yg.LJIIIZ("DrawRoomListProvider", "insert blocked 1");
                return new C0IOO() { // from class: X.0IOP
                };
            }
            Iterator<EnterRoomConfig> it3 = this.LLJILJILJ.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                EnterRoomConfig next2 = it3.next();
                if (next2.mRoomsData.roomId == room.getId()) {
                    if (next2 != null) {
                        C20441214yg.LJIIIZ("DrawRoomListProvider", "insert blocked 2");
                        return new C0IOO() { // from class: X.0IOP
                        };
                    }
                }
            }
            List<Integer> config = LiveRoomInsertScrollState.INSTANCE.getConfig();
            C0IRR c0irr = this.LLJ;
            if (c0irr != null) {
                numValueOf2 = Integer.valueOf(c0irr.LIZ());
            } else {
                numValueOf2 = null;
            }
            if (C13LP.LJJJJ(numValueOf2, config)) {
                C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS14S0201000_7(i, room, this, 3));
                return new C0IOO() { // from class: X.0IOR
                };
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("insert blocked 3 ");
            C0IRR c0irr2 = this.LLJ;
            if (c0irr2 != null) {
                numValueOf = Integer.valueOf(c0irr2.LIZ());
            }
            sbLIZ.append(numValueOf);
            C20441214yg.LJIIIZ("DrawRoomListProvider", C2188811AlT.LIZIZ(sbLIZ));
            return new C0IOO() { // from class: X.0IOQ
            };
        }
        return C465430IMz.LIZ;
    }

    @Override // X.C0IOL
    public final int LJJIII(Room room, EnterRoomConfig enterRoomConfig) {
        LJJLIIIJJIZ(room.getId(), false);
        int iIntValue = ((Number) C500260Jjc.LJI(this.LLJILJIL, new AwS586S0100000_7(this, 427)).getSecond()).intValue();
        if (iIntValue >= 0 && iIntValue < this.LLJILJIL.size()) {
            int i = iIntValue + 1;
            ListProtector.add(this.LLJILJIL, i, room);
            ListProtector.add(this.LLJILJILJ, i, enterRoomConfig);
            C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS107S0100000_7(this, 199));
            return i;
        }
        return -1;
    }

    @Override // X.C0IOL
    public final boolean LJJIJLIJ(long j, boolean z) {
        int i;
        if (!C086I.LIZIZ(this.LLJILJIL) && !C086I.LIZIZ(this.LLJILJILJ)) {
            Iterator<Room> it2 = this.LLJILJIL.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().getId() == j) {
                    if (i2 >= 0 && (i = i2 + 1) < this.LLJILJIL.size() && i < this.LLJILJILJ.size()) {
                        if (z) {
                            Room room = (Room) ListProtector.get(this.LLJILJIL, i);
                            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) ListProtector.get(this.LLJILJILJ, i);
                            if (!room.isVariantCard() || !enterRoomConfig.isVariantCard()) {
                                return false;
                            }
                            C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS6S0301000_7(i, this, room, enterRoomConfig, 1));
                            return true;
                        }
                        try {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("remove the next variant card synchronously ");
                            sbLIZ.append(i);
                            C20441214yg.LJIIIZ("DrawRoomListProvider", C2188811AlT.LIZIZ(sbLIZ));
                            Room room2 = this.LLJILJIL.get(i);
                            EnterRoomConfig enterRoomConfig2 = this.LLJILJILJ.get(i);
                            if (!room2.isVariantCard() || !enterRoomConfig2.isVariantCard()) {
                                return false;
                            }
                            this.LLJILJIL.remove(room2);
                            this.LLJILJILJ.remove(enterRoomConfig2);
                            this.LLJJJ.remove(Long.valueOf(room2.getId()));
                            LJIILJJIL();
                            return true;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJFF("DrawRoomListProvider", "remove the next variant card synchronously error", e);
                            return false;
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    public final void LJJJIL(FeedItem feedItem, FeedExtra feedExtra) {
        String str;
        if ((((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse()) && !TextUtils.isEmpty(feedItem.debugInfo)) {
            this.LLJJJ.put(Long.valueOf(feedItem.getRoom().getId()), feedItem.debugInfo);
            HashMap<Long, String> map = this.LLJJJIL;
            Long lValueOf = Long.valueOf(feedItem.getRoom().getId());
            if (feedExtra == null || (str = feedExtra.oceanReqInfo) == null) {
                str = "";
            }
            map.put(lValueOf, str);
        }
    }

    public final void LJJJJIZL(C0ISF<Room> c0isf, boolean z) {
        if (!C086I.LIZIZ(this.LLJILJIL) && !C086I.LIZIZ(this.LLJILJILJ)) {
            Iterator<Room> it2 = this.LLJILJIL.iterator();
            Iterator<EnterRoomConfig> it3 = this.LLJILJILJ.iterator();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            boolean z2 = false;
            while (it2.hasNext() && it3.hasNext()) {
                Room next = it2.next();
                it3.next();
                if (c0isf.LIZ(next)) {
                    int iIndexOf = this.LLJILJIL.indexOf(next);
                    linkedHashSet.add(String.valueOf(next.getId()));
                    it2.remove();
                    it3.remove();
                    this.LLJJJ.remove(Long.valueOf(next.getId()));
                    List<FeedItem> list = this.LLLILZJ;
                    if (list != null) {
                        int i = this.LLLILZLLLI;
                        if (iIndexOf <= i && i > 0) {
                            this.LLLILZLLLI = i - 1;
                        }
                        ArrayList arrayList = (ArrayList) list;
                        Iterator it4 = arrayList.iterator();
                        int i2 = 0;
                        while (true) {
                            if (it4.hasNext()) {
                                Room room = ((FeedItem) it4.next()).getRoom();
                                if (room != null && room.getId() == next.getId()) {
                                    break;
                                } else {
                                    i2++;
                                }
                            } else {
                                i2 = -1;
                                break;
                            }
                        }
                        if (!arrayList.isEmpty() && i2 >= 0 && i2 < arrayList.size()) {
                            ListProtector.remove(list, i2);
                        }
                    }
                    z2 = true;
                }
            }
            if (z2 && !z) {
                LJIILJJIL();
            }
            if (!linkedHashSet.isEmpty()) {
                EnterRoomUpdateManager enterRoomUpdateManager = EnterRoomUpdateManager.LIZ;
                int i3 = this.LLLLL;
                enterRoomUpdateManager.getClass();
                EnterRoomUpdateManager.LIZJ(linkedHashSet, i3);
            }
        }
    }

    public final void LJJLIIIJ(EnterRoomConfig enterRoomConfig, Map<String, String> map) {
        if (enterRoomConfig == null) {
            return;
        }
        HashMap<String, String> map2 = new HashMap<>();
        map2.putAll(this.LLLILZ.ecCommonExtraParam);
        map2.putAll(map);
        EnterRoomConfig.ECWrapData eCWrapData = new EnterRoomConfig.ECWrapData(0, 0, "", new HashMap(), false, 0, 0, null, null, null, "{}");
        eCWrapData.isFromECContext = this.LLLILZ.isFromECContext;
        eCWrapData.ecCommonExtraParam = map2;
        eCWrapData.ecRecommendInfo = enterRoomConfig.mECData.ecRecommendInfo;
        map2.remove("source_module");
        String str = this.LLLLLLLZIL;
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_inner_flow");
            map2.put("source_module", C2188811AlT.LIZIZ(sbLIZ));
        }
        enterRoomConfig.mECData = eCWrapData;
    }

    public final void LJJLIIIJJIZ(long j, boolean z) {
        int size = this.LLJILJIL.size();
        for (int i = 0; i < size; i++) {
            if (((Room) ListProtector.get(this.LLJILJIL, i)).getId() == j) {
                if (this.LLJILJILJ.size() > i) {
                    ListProtector.remove(this.LLJILJILJ, i);
                }
                if (this.LLJILJIL.size() > i) {
                    ListProtector.remove(this.LLJILJIL, i);
                }
                EnterRoomUpdateManager enterRoomUpdateManager = EnterRoomUpdateManager.LIZ;
                int i2 = this.LLLLL;
                Set setLJ = C093Y.LJ(String.valueOf(j));
                enterRoomUpdateManager.getClass();
                EnterRoomUpdateManager.LIZJ(setLJ, i2);
                this.LLJJJ.remove(Long.valueOf(j));
                List<FeedItem> list = this.LLLILZJ;
                if (list != null) {
                    int i3 = this.LLLILZLLLI;
                    int i4 = -1;
                    if (i <= i3 && i3 > 0) {
                        this.LLLILZLLLI = i3 - 1;
                    }
                    ArrayList arrayList = (ArrayList) list;
                    Iterator it2 = arrayList.iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Room room = ((FeedItem) it2.next()).getRoom();
                        if (room != null && room.getId() == j) {
                            i4 = i5;
                            break;
                        }
                        i5++;
                    }
                    if (!arrayList.isEmpty() && i4 >= 0 && i4 < arrayList.size()) {
                        ListProtector.remove(list, i4);
                    }
                }
                C20441214yg.LJIIIZ("removeAndSwipeItem", "remove");
                if (z) {
                    LJIILJJIL();
                    return;
                }
                return;
            }
        }
    }

    public final void LJJLIIIJLLLLLLLZ(EnterRoomConfig enterRoomConfig, String str) {
        EnterRoomConfig.RoomsData roomsData;
        if (!TextUtils.isEmpty(str)) {
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            if (roomsData2 != null) {
                roomsData2.unreadExtra = str;
            }
            if (((str != null && a0.LJJIIZI(str, "follow_live_empty_loadmore", false)) || (C464770IKl.LIZ.LJ() && this.LLLLILI && LiveSdkMultiTopLiveRecommendFeedEnableSetting.isEnable() && str != null && u.LJIIZILJ(str, "_nomore", false) && C464770IKl.LJI())) && (roomsData = enterRoomConfig.mRoomsData) != null) {
                roomsData.enterFromMerge = C464770IKl.LIZLLL;
                roomsData.enterMethod = C464770IKl.LJ;
            }
        }
    }

    public final boolean LJJLJ(String str, Function1<? super Integer, Unit> function1) {
        boolean z;
        boolean z2;
        String str2;
        String strSubstring;
        C11NZ<C470590Icr<Object>> c11nzCollectUnreadRequest;
        long id;
        boolean z3;
        boolean z4;
        String reqFrom = LiveInnerFlowHotRefreshSetting.getReqFrom(LJJJJLI().LIZ);
        if (reqFrom != null && reqFrom.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerInnerFlowHotRefresh skip, reqFrom empty, trigger = ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("DrawRoomListProvider", C2188811AlT.LIZIZ(sbLIZ));
            function1.invoke(1);
            return false;
        }
        String reqFrom2 = LiveInnerFlowHotRefreshSetting.getReqFrom(LJJJJLI().LIZ);
        if (reqFrom2 != null && reqFrom2.length() != 0) {
            C0IRR c0irr = this.LLJ;
            if (c0irr != null && c0irr.LIZ() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            String reqFrom3 = LiveInnerFlowHotRefreshSetting.getReqFrom(LJJJJLI().LIZ);
            if (reqFrom3 != null && reqFrom3.length() != 0 && z3 && !this.LLJZIJLIL && !this.LLLLLLJ) {
                z2 = true;
            } else {
                z2 = false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("decision/provider_can_trigger reqFromEmpty=");
            String reqFrom4 = LiveInnerFlowHotRefreshSetting.getReqFrom(LJJJJLI().LIZ);
            if (reqFrom4 != null && reqFrom4.length() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            sbLIZ2.append(z4);
            sbLIZ2.append(" scrollIdle=");
            sbLIZ2.append(z3);
            sbLIZ2.append(" loadMoreRunning=");
            sbLIZ2.append(this.LLJZIJLIL);
            sbLIZ2.append(" hotRefreshRunning=");
            sbLIZ2.append(this.LLLLLLJ);
            sbLIZ2.append(" result=");
            sbLIZ2.append(z2);
            C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            z2 = false;
        }
        if (!z2) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("triggerInnerFlowHotRefresh skip, provider busy, trigger = ");
            sbLIZ3.append(str);
            C20441214yg.LIZIZ("DrawRoomListProvider", C2188811AlT.LIZIZ(sbLIZ3));
            function1.invoke(2);
            return false;
        }
        this.LLLLLLJ = true;
        this.LLLLLLL = function1;
        boolean zLJFF = Intrinsics.LJFF(str, "FEED_TIMEOUT");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = this.LLJILJIL.size();
        for (int i = this.LLJI + 1; i < size; i++) {
            Room room = (Room) ListProtector.get(this.LLJILJIL, i);
            if (room.getId() != this.LLLLIILL && !this.LLJJJJLIIL.contains(Long.valueOf(room.getId())) && !room.isShow) {
                Long lValueOf = Long.valueOf(room.getId());
                User owner = room.getOwner();
                if (owner != null) {
                    id = owner.getId();
                } else {
                    id = 0;
                }
                linkedHashMap.put(lValueOf, Long.valueOf(id));
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(linkedHashMap.keySet());
        AwS408S0200000_7 awS408S0200000_7 = new AwS408S0200000_7(this, linkedHashSet, 61);
        if (LiveInnerFlowHotRefreshSetting.getHotRefreshUnreadMode() == 2) {
            LJJL(this, this.LLLLLLZZ, reqFrom, true, awS408S0200000_7, zLJFF, linkedHashMap, linkedHashMap.size(), 8);
            return true;
        }
        AwS11S1310000_7 awS11S1310000_7 = new AwS11S1310000_7(this, linkedHashSet, reqFrom, awS408S0200000_7, zLJFF, 1);
        AwS125S0110000_7 awS125S0110000_7 = new AwS125S0110000_7(this, zLJFF, 4);
        if (!LiveDedupOptExp.INSTANCE.disableUnread() && !linkedHashSet.isEmpty()) {
            if (this.LLJIJIL == null) {
                this.LLJIJIL = new DrawRoomListModel();
            }
            String str3 = this.LLIZLLLIL;
            if (str3 == null || str3.length() == 0 ? (str2 = (String) C13LP.LJJJLIIL(this.LLJJL.keySet())) == null || (strSubstring = str2.substring(0, a0.LJJJJI(str2, "_", 0, 6))) == null : (strSubstring = this.LLIZLLLIL) == null) {
                strSubstring = "";
            }
            DrawRoomListModel drawRoomListModel = this.LLJIJIL;
            if (drawRoomListModel != null && (c11nzCollectUnreadRequest = drawRoomListModel.collectUnreadRequest(this.LLJLILLLLZIIL, this.LLJLL, strSubstring, new ArrayList(linkedHashSet))) != null) {
                this.LLL.LIZ(c11nzCollectUnreadRequest.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C515801zg(linkedHashSet, awS11S1310000_7, 33), new C516201zk(awS125S0110000_7, 204)));
                return true;
            }
            awS11S1310000_7.invoke();
            return true;
        }
        awS11S1310000_7.invoke();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0493  */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0ISM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0ISJ(com.bytedance.android.livesdkapi.session.EnterRoomConfig r33, java.lang.String r34, java.lang.String r35) {
        /*
            Method dump skipped, instruction units count: 2299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ISJ.<init>(com.bytedance.android.livesdkapi.session.EnterRoomConfig, java.lang.String, java.lang.String):void");
    }

    @Override // X.C0IOL
    public final void LJJIJIL(C0ITP c0itp, int i, boolean z) {
        if (c0itp != null) {
            if (z) {
                this.LLJJLIIIJLLLLLLLZ = c0itp.LIZIZ;
            }
            LJJLIIIIJ(this, c0itp.LIZ, c0itp.LIZIZ, "", i, false, true, false, false, 320);
            EnterRoomUpdateManager enterRoomUpdateManager = EnterRoomUpdateManager.LIZ;
            int i2 = this.LLLLL;
            enterRoomUpdateManager.getClass();
            EnterRoomUpdateManager.LIZIZ(i2);
            LJIILJJIL();
            List<FeedItem> list = c0itp.LIZ;
            if (list != null && !list.isEmpty()) {
                LJJIIZI("", true);
            } else {
                LJJIIZI("supply_fail", false);
            }
        }
    }

    public final void LJJJZ(int i, final int i2, final String str) {
        C0ISS c0iss;
        String str2;
        final HashMap map = new HashMap();
        map.put("room_count_before_request", Integer.valueOf((this.LLJILJIL.size() - i) - 1));
        map.put("request_scene", "DrawRoomListProvider");
        map.put("is_landscape", Boolean.TRUE);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = 0;
        if (this.LLJLILLLLZIIL <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("landscapeRefresh enterRoomId ");
            sbLIZ.append(this.LLJLILLLLZIIL);
            sbLIZ.append(" return");
            C20441214yg.LIZIZ("DrawRoomListProvider", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        FeedExtra feedExtra = this.LLJJLIIIJLLLLLLLZ;
        if (feedExtra != null && !feedExtra.hasMore) {
            C20441214yg.LIZIZ("DrawRoomListProvider", "landscapeRefresh not hasMore return");
            return;
        }
        if (this.LLJIJIL == null) {
            this.LLJIJIL = new DrawRoomListModel();
        }
        if (this.LLJZIJLIL) {
            C20441214yg.LIZIZ("DrawRoomListProvider", "landscapeRefresh isLoadMoreRunning return");
            return;
        }
        String strLJJJJI = LJJJJI(this.LLJLLIL);
        this.LLJLLIL = strLJJJJI;
        if (i > 0) {
            String strLIZJ = C0IO2.LIZJ(strLJJJJI, "bubble_room_id");
            this.LLJLLIL = strLIZJ;
            this.LLJLLIL = C0IO2.LIZJ(strLIZJ, "bubble_owner_id");
        }
        boolean zLiveStrategyIsHttpDnsNotReady = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).liveStrategyIsHttpDnsNotReady(0);
        HashMap map2 = new HashMap();
        map2.put("enable_http_dns", String.valueOf(zLiveStrategyIsHttpDnsNotReady));
        if (!TextUtils.isEmpty(this.LLLL) && (str2 = this.LLLL) != null) {
            map2.put("related_live_tag", str2);
        }
        C0IKB.LIZ(this.LLJILJIL, this.LLJILJILJ, this.LLJJJJJIL, map2);
        map2.put("feed_index", String.valueOf(i));
        String str3 = C0IRZ.LIZ;
        map2.put("need_req_feed_third_ver", String.valueOf(FeedRequestParamsSetting.INSTANCE.reqFeedV3(str)));
        map2.put("req_session", C0IRZ.LIZ);
        DrawRoomListModel drawRoomListModel = this.LLJIJIL;
        if (drawRoomListModel != null) {
            FeedExtra feedExtra2 = this.LLJJLIIIJLLLLLLLZ;
            if (feedExtra2 != null) {
                j = feedExtra2.maxTime;
            }
            String str4 = this.LLJZ;
            long j2 = this.LLJLILLLLZIIL;
            long j3 = this.LLJLL;
            String str5 = this.LLJLLIL;
            if (this.LLLIIL) {
                c0iss = new C0ISS(Integer.valueOf(this.LLLIL), Long.valueOf(this.LLLIILIL));
            } else {
                c0iss = null;
            }
            C11NZ<C0ITM<Pair<List<FeedItem>, FeedExtra>>> roomList = drawRoomListModel.getRoomList(j, str, str4, j2, j3, str5, c0iss, LJJJJLL(), null, false, map2);
            if (roomList != null) {
                this.LLJZIJLIL = true;
                InterfaceC420801kM interfaceC420801kMLJJLL = roomList.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0ISI
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x010a A[LOOP:1: B:44:0x0104->B:46:0x010a, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
                    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x01d0  */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x01d3  */
                    /* JADX WARN: Removed duplicated region for block: B:69:0x01dd  */
                    /* JADX WARN: Removed duplicated region for block: B:72:0x0206  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x0211  */
                    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
                    /* JADX WARN: Type inference failed for: r13v2, types: [X.13BV] */
                    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Iterable, java.util.List] */
                    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
                    @Override // X.C09JN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void accept(java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 535
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0ISI.accept(java.lang.Object):void");
                    }
                }, new AfS0S1200100_7((Object) this, (C0ISJ) map, (HashMap<String, Object>) jElapsedRealtime, (long) str, (String) 5));
                this.LLLIZZ = (C11JF) interfaceC420801kMLJJLL;
                this.LLL.LIZ(interfaceC420801kMLJJLL);
            }
        }
    }

    public final void LJJLI(int i, long j, String str) {
        String str2;
        this.LLJJJJLIIL.add(Long.valueOf(j));
        this.LLJI = i;
        this.LLLLIILL = j;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.LLLLIILLL = str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Room ");
        sbLIZ.append(j);
        sbLIZ.append(" is showing.");
        C20441214yg.LIZIZ("DrawRoomListProvider", C2188811AlT.LIZIZ(sbLIZ));
        C0ISZ c0iszLJJJJJL = LJJJJJL();
        if (str == null) {
            str = "";
        }
        c0iszLJJJJJL.getClass();
        if (!LiveDrawListBackupSetting.INSTANCE.enable(c0iszLJJJJJL.LIZ) && !LoadMoreRetrySetting.INSTANCE.useBackupData()) {
            return;
        }
        for (Object obj : (ArrayList) c0iszLJJJJJL.LJI) {
            if (((Room) obj).getId() == j) {
                if (obj == null) {
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onRoomShow: ");
                sbLIZ2.append(j);
                C20441214yg.LIZIZ("BackupDataManager", C2188811AlT.LIZIZ(sbLIZ2));
                ((ArrayList) c0iszLJJJJJL.LJFF).add(Long.valueOf(j));
                ((ArrayList) c0iszLJJJJJL.LJI).remove(obj);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_api_status");
                c474500IjALIZ.LJJII(c0iszLJJJJJL.LIZ, "entry_type");
                c474500IjALIZ.LJJII(Long.valueOf(j), "item_ids");
                c474500IjALIZ.LJJII("backup_read", Scene.SCENE_SERVICE);
                c474500IjALIZ.LIZ();
                if (c0iszLJJJJJL.LJIIIIZZ != EnumC466740ISa.LL) {
                    return;
                }
                int iFilterStrategy = SkylightBackupDataSetting.INSTANCE.filterStrategy();
                if (iFilterStrategy != 1) {
                    if (iFilterStrategy != 2) {
                        return;
                    }
                    C0IT6 c0it6 = C0IT6.LIZ;
                    String str3 = c0iszLJJJJJL.LIZ;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) C0IT6.LJI;
                    Object linkedHashSet = linkedHashMap.get(str3);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap.put(str3, linkedHashSet);
                    }
                    ((Set) linkedHashSet).add(str);
                    return;
                }
                C0IT6 c0it62 = C0IT6.LIZ;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) C0IT6.LJI;
                Object linkedHashSet2 = linkedHashMap2.get("global");
                if (linkedHashSet2 == null) {
                    linkedHashSet2 = new LinkedHashSet();
                    linkedHashMap2.put("global", linkedHashSet2);
                }
                ((Set) linkedHashSet2).add(str);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0470  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJL(final X.C0ISJ r34, int r35, final java.lang.String r36, boolean r37, final kotlin.jvm.functions.Function0 r38, boolean r39, java.util.Map r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ISJ.LJJL(X.0ISJ, int, java.lang.String, boolean, kotlin.jvm.functions.Function0, boolean, java.util.Map, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a2 A[PHI: r38
      0x01a2: PHI (r38v7 boolean) = (r38v5 boolean), (r38v5 boolean), (r38v5 boolean), (r38v5 boolean), (r38v2 boolean) binds: [B:171:0x034f, B:125:0x0200, B:120:0x01f3, B:114:0x01cf, B:105:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0323 A[LOOP:7: B:164:0x031d->B:166:0x0323, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03e2 A[LOOP:3: B:206:0x03dc->B:208:0x03e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06d2  */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJLIIIIJ(X.C0ISJ r33, java.util.List r34, com.bytedance.android.live.base.model.feed.FeedExtra r35, java.lang.String r36, int r37, boolean r38, boolean r39, boolean r40, boolean r41, int r42) {
        /*
            Method dump skipped, instruction units count: 2095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ISJ.LJJLIIIIJ(X.0ISJ, java.util.List, com.bytedance.android.live.base.model.feed.FeedExtra, java.lang.String, int, boolean, boolean, boolean, boolean, int):void");
    }
}
