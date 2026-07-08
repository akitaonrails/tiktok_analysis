package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.ab.Meta;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.item.StoryCacheData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rhg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598660rhg {
    public static WeakReference<InterfaceC1598970riB> LIZIZ;
    public static boolean LJFF;
    public static volatile boolean LJI;
    public static Function1<? super List<? extends InterfaceC1891350zJl>, Unit> LJII;
    public static final C1598660rhg LIZ = new C1598660rhg();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(648));
    public static final C1598730rhn LIZLLL = new C1598730rhn();
    public static final C1599560rj8 LJ = new C1599560rj8();

    public static SkylightDataResponse LIZLLL() {
        SkylightDataResponse skylightDataResponseLJIIIIZZ;
        List<SkylightData> dataList;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("SkylightController", "start preloadVH");
        if (C1599110riP.LIZ().LJFF()) {
            skylightDataResponseLJIIIIZZ = C1599110riP.LIZ().LJIIIIZZ();
        } else {
            C1720106oR.LJI("SkylightController", "can not use muf cache");
            skylightDataResponseLJIIIIZZ = null;
        }
        C1599080riM c1599080riM = C1599070riL.LIZ;
        if (c1599080riM != null) {
            c1599080riM.LJIILIIL = (skylightDataResponseLJIIIIZZ == null || (dataList = skylightDataResponseLJIIIIZZ.getDataList()) == null) ? 0 : dataList.size();
        }
        return skylightDataResponseLJIIIIZZ;
    }

    public static InterfaceC1598970riB LJFF() {
        WeakReference<InterfaceC1598970riB> weakReference = LIZIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static C1600450rkZ LJI() {
        InterfaceC1598970riB interfaceC1598970riB;
        WeakReference<InterfaceC1598970riB> weakReference = LIZIZ;
        if (weakReference == null || (interfaceC1598970riB = weakReference.get()) == null) {
            return null;
        }
        C1600450rkZ c1600450rkZLLZZJLIL = interfaceC1598970riB.LLZZJLIL();
        if (c1600450rkZLLZZJLIL instanceof C1600450rkZ) {
            return c1600450rkZLLZZJLIL;
        }
        return null;
    }

    public static void LIZ() {
        LifecycleOwner lifecycleOwner;
        C1600450rkZ c1600450rkZLJI = LJI();
        if (c1600450rkZLJI == null) {
            return;
        }
        Object context = c1600450rkZLJI.getContext();
        if (!(context instanceof LifecycleOwner) || (lifecycleOwner = (LifecycleOwner) context) == null) {
            return;
        }
        SkylightListViewModel skylightListViewModelLJII = LJII(lifecycleOwner);
        if (Intrinsics.LJFF(skylightListViewModelLJII.LLJJIJI, c1600450rkZLJI)) {
            return;
        }
        skylightListViewModelLJII.setListState(c1600450rkZLJI.getState());
        if (((Meta) C1599610rjD.LIZIZ.getValue()).fixed) {
            skylightListViewModelLJII.LLJJIJI = c1600450rkZLJI;
        } else {
            skylightListViewModelLJII.LLJJIJI = c1600450rkZLJI;
        }
        c1600450rkZLJI.LJIIL(skylightListViewModelLJII.getConfig());
    }

    public static StoryCacheData LIZJ(StoryCacheData storyCacheData) {
        User author;
        StoryInboxItem storyInboxItem;
        if (storyCacheData instanceof StoryCacheData.PowerItemCache) {
            StoryCacheData.PowerItemCache powerItemCache = (StoryCacheData.PowerItemCache) storyCacheData;
            if (!powerItemCache.getPowerItems().isEmpty()) {
                Object objLJJJLL = C13LP.LJJJLL(powerItemCache.getPowerItems());
                if (!(objLJJJLL instanceof StoryInboxItem) || (storyInboxItem = (StoryInboxItem) objLJJJLL) == null || !storyInboxItem.isMe()) {
                    C1598160rgs.LIZ.getClass();
                    StoryInboxItem storyInboxItemLIZLLL = C1598160rgs.LIZLLL();
                    if (storyInboxItemLIZLLL != null) {
                        Aweme storyCollection = storyInboxItemLIZLLL.getStoryCollection();
                        if (storyCollection != null && (author = storyCollection.getAuthor()) != null) {
                            author.setStoryStatus(-56831);
                        }
                        return powerItemCache.copy(C13LP.LJLIL(powerItemCache.getPowerItems(), Collections.singletonList(storyInboxItemLIZLLL)), powerItemCache.waitingForDiskCache, powerItemCache.extra, powerItemCache.isPagedRead, powerItemCache.isIncrementalAppend, powerItemCache.isLastChunk);
                    }
                }
            }
        }
        return storyCacheData;
    }

    public static SkylightListViewModel LJII(LifecycleOwner lifecycleOwner) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(649);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkylightListViewModel.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(747);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(lifecycleOwner);
        if (lifecycleOwner instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) lifecycleOwner;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        return (SkylightListViewModel) new C736950SvV(c19719912DlLIZ, aFwS213S0000000_24, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS264S0000000_24, null, null, null).getValue();
    }

    public static int LJIIIIZZ(StoryCacheData storyCacheData) {
        if (storyCacheData instanceof StoryCacheData.ResponseCache) {
            List<Aweme> awemes = ((StoryCacheData.ResponseCache) storyCacheData).getResponseData().getAwemes();
            if (awemes != null) {
                return awemes.size();
            }
            return 0;
        }
        if (storyCacheData instanceof StoryCacheData.MixRankResponseCache) {
            return ((StoryCacheData.MixRankResponseCache) storyCacheData).getResponseData().getSkylightItems().size();
        }
        if (storyCacheData instanceof StoryCacheData.PowerItemCache) {
            return ((StoryCacheData.PowerItemCache) storyCacheData).getPowerItems().size();
        }
        if (storyCacheData != null) {
            throw new C1954807lC();
        }
        return 0;
    }

    public static C1598650rhf LIZIZ(final Context context, Fragment fragment) {
        boolean zLJII;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("SkylightController", "createViewHolderIfNeed");
        if (C1599410rit.LIZ()) {
            boolean zLJFF = C1599110riP.LIZ().LJFF();
            boolean zLJI = C614770O9j.LIZIZ.LIZ().LJI();
            C1598160rgs.LIZ.getClass();
            boolean zLIZ = C1598160rgs.LIZ();
            if (!zLJFF && !zLJI && !zLIZ) {
                zLJII = true;
            } else {
                zLJII = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createSkylightContainer, hasMuf: ");
            sbLIZ.append(zLJFF);
            sbLIZ.append(", hasStory: ");
            sbLIZ.append(zLJI);
            sbLIZ.append(", hasCreate: ");
            sbLIZ.append(zLIZ);
            C1720106oR.LJI("InboxSkylightPreload", C2188811AlT.LIZIZ(sbLIZ));
        } else if (C1599180riW.LIZ()) {
            zLJII = C1599110riP.LIZ().LJII();
        } else {
            zLJII = true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("createSkylightContainer, isEmpty: ");
        sbLIZ2.append(zLJII);
        C1720106oR.LJI("InboxSkylightPreload", C2188811AlT.LIZIZ(sbLIZ2));
        ViewGroup c1600450rkZ = new C1600450rkZ(context, null, 0);
        if (C882650Yjv.LJ()) {
            ViewGroup viewGroup = new FrameLayout(context) { // from class: X.0bzN
            };
            viewGroup.setClipChildren(true);
            viewGroup.addView(c1600450rkZ, new ViewGroup.LayoutParams(-1, -2));
            c1600450rkZ = viewGroup;
        }
        C1598650rhf c1598650rhf = new C1598650rhf(c1600450rkZ, fragment, zLJII);
        c1598650rhf.setIsRecyclable(false);
        LIZIZ = new WeakReference<>(c1598650rhf);
        return c1598650rhf;
    }

    public static InterfaceC1598970riB LJ(Context context, Fragment fragment) {
        InterfaceC1598970riB interfaceC1598970riB;
        WeakReference<InterfaceC1598970riB> weakReference = LIZIZ;
        if (weakReference == null || (interfaceC1598970riB = weakReference.get()) == null || !C729510SjV.LJIILJJIL(interfaceC1598970riB.LJJJJJ())) {
            return LIZIZ(context, fragment);
        }
        return interfaceC1598970riB;
    }

    public static void LJIIJ(List list, Function0 function0) {
        InterfaceC1598970riB interfaceC1598970riB;
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        if (list == null) {
            return;
        }
        C1600450rkZ c1600450rkZLJI = LJI();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start show, result: ");
        sbLIZ.append(list.size());
        sbLIZ.append(", list: ");
        sbLIZ.append(c1600450rkZLJI);
        C1720106oR.LJI("InboxSkylightPreload", C2188811AlT.LIZIZ(sbLIZ));
        if (!list.isEmpty()) {
            if (C0BV8.LIZ() && C0BV7.LIZ() && c1600450rkZLJI != null && (state2 = c1600450rkZLJI.getState()) != null) {
                state2.LIZLLL = C0Q4Y.BUFFER;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("add data(");
            sbLIZ2.append(list.size());
            sbLIZ2.append(") to list: ");
            sbLIZ2.append(c1600450rkZLJI);
            sbLIZ2.append(" directly");
            C1720106oR.LJI("InboxSkylightPreload", C2188811AlT.LIZIZ(sbLIZ2));
            if (c1600450rkZLJI != null && (state = c1600450rkZLJI.getState()) != null) {
                state.LJIILL(list, null);
            }
            if (function0 != null) {
                function0.invoke();
            }
            C1598730rhn c1598730rhn = LIZLLL;
            c1598730rhn.getClass();
            c1598730rhn.LJFF = System.currentTimeMillis();
            if (c1600450rkZLJI != null) {
                c1600450rkZLJI.LJJIFFI();
            }
            Function1<? super List<? extends InterfaceC1891350zJl>, Unit> function1 = LJII;
            if (function1 != null) {
                function1.invoke(list);
                return;
            }
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("abort show, list: ");
        sbLIZ3.append(c1600450rkZLJI);
        C1720106oR.LJI("InboxSkylightPreload", C2188811AlT.LIZIZ(sbLIZ3));
        WeakReference<InterfaceC1598970riB> weakReference = LIZIZ;
        if (weakReference == null || (interfaceC1598970riB = weakReference.get()) == null) {
            return;
        }
        interfaceC1598970riB.LLLIIII(true);
    }

    public static void LJIIL(Function0 function0, boolean z) {
        List<InterfaceC1891350zJl> listLJIILIIL = C1599110riP.LIZ().LJIILIIL();
        if (z) {
            C1599070riL.LIZIZ(LJFF);
            C1599070riL.LIZJ();
        }
        if (!LJFF) {
            LJIIJ(listLJIILIIL, function0);
        }
    }

    public static void LJIIIZ(Fragment fragment, Context context, SkylightDataResponse skylightDataResponse, StoryCacheData.PowerItemCache powerItemCache, Function0 function0) {
        C1600450rkZ c1600450rkZLJI;
        C20600815jK<InterfaceC1891350zJl> state;
        Object context2;
        LifecycleOwner lifecycleOwner;
        int i;
        StoryCacheData.PowerItemCache powerItemCache2;
        SkylightDataResponse skylightDataResponse2 = skylightDataResponse;
        if (LJI) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handlePagedDiskCache: ignored after request ready, isIncremental=");
            sbLIZ.append(powerItemCache.isIncrementalAppend());
            C1720106oR.LJI("InboxSkylightPreload", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        List<InterfaceC1891350zJl> powerItems = powerItemCache.getPowerItems();
        C614770O9j.LIZIZ.LJ().LJ(3, powerItems);
        if (!powerItemCache.isIncrementalAppend()) {
            C1599080riM c1599080riM = C1599070riL.LIZ;
            if (c1599080riM != null) {
                c1599080riM.LJIIL = LJIIIIZZ(powerItemCache);
            }
            int i3 = -1;
            if (!C1599180riW.LIZ()) {
                i = -1;
            } else if (C1599110riP.LIZ().LJIIIIZZ() != null) {
                i = 1;
            } else if (C1599110riP.LIZ().LJFF()) {
                i = 2;
            } else if (C1599110riP.LIZ().LJI()) {
                i = -2;
            } else {
                i = 0;
            }
            if (C1618440sDa.LIZIZ.LJJIIZI().canShowStoryCell()) {
                if (!powerItemCache.getPowerItems().isEmpty()) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
            }
            C1599080riM c1599080riM2 = C1599070riL.LIZ;
            if (c1599080riM2 != null) {
                c1599080riM2.LJI = 0;
                c1599080riM2.LJIIIIZZ = i;
                c1599080riM2.LJII = i3;
            }
            C1599110riP.LIZ().LIZJ();
            StoryCacheData storyCacheDataLIZJ = LIZJ(powerItemCache);
            if (!(storyCacheDataLIZJ instanceof StoryCacheData.PowerItemCache) || (powerItemCache2 = (StoryCacheData.PowerItemCache) storyCacheDataLIZJ) == null) {
                powerItemCache2 = powerItemCache;
            }
            if (powerItemCache2.getPowerItems().isEmpty()) {
                int i4 = C2187451AjH.LIZ;
                C1720106oR.LJI("InboxSkylightPreload", "handlePagedDiskCache: first chunk empty");
                return;
            }
            WeakReference<InterfaceC1598970riB> weakReference = LIZIZ;
            if (weakReference == null || weakReference.get() == null) {
                LIZIZ(context, fragment);
            }
            LIZ();
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handlePagedDiskCache: first chunk, isRequestDataReady: ");
            sbLIZ2.append(LJFF);
            C1720106oR.LJI("InboxSkylightPreload", C2188811AlT.LIZIZ(sbLIZ2));
            C1599070riL.LIZIZ(LJFF);
            if (!LJFF) {
                LJIIJ(powerItemCache2.getPowerItems(), function0);
                C1599080riM c1599080riM3 = C1599070riL.LIZ;
                if (c1599080riM3 != null) {
                    c1599080riM3.LJIILJJIL = powerItemCache2.getPowerItems().size();
                }
            }
            C1599070riL.LIZJ();
        } else {
            int i6 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("handlePagedDiskCache: incremental chunk, size=");
            sbLIZ3.append(powerItems.size());
            sbLIZ3.append(", ignored=");
            sbLIZ3.append(LJI);
            C1720106oR.LJI("InboxSkylightPreload", C2188811AlT.LIZIZ(sbLIZ3));
            LIZ();
            if (!LJI && (!powerItems.isEmpty()) && (c1600450rkZLJI = LJI()) != null && (state = c1600450rkZLJI.getState()) != null) {
                state.LIZLLL(powerItems, null);
            }
        }
        if (powerItemCache.isLastChunk() && !LJI && !C1599090riN.LIZ() && C1599110riP.LIZ().LJFF()) {
            C1720106oR.LJI("InboxSkylightPreload", "handlePagedDiskCache: last chunk, processing MUF");
            C1600450rkZ c1600450rkZLJI2 = LJI();
            if (c1600450rkZLJI2 != null) {
                context2 = c1600450rkZLJI2.getContext();
            } else {
                context2 = null;
            }
            if ((context2 instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context2) != null) {
                SkylightListViewModel skylightListViewModelLJII = LJII(lifecycleOwner);
                SkylightDataResponse skylightDataResponseLIZLLL = LIZLLL();
                if (skylightDataResponseLIZLLL != null) {
                    skylightDataResponse2 = skylightDataResponseLIZLLL;
                }
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C1569800qx8(skylightListViewModelLJII, new InboxHorizontalTopListCombinePod(null, null, null, 0L, false, skylightDataResponse2, null, null, null, null, false, null, powerItemCache.getExtra().timestamp, false, 0, 0, null, false, null, null, 1044447, null), null), 3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[PHI: r7 r8 r9
      0x0088: PHI (r7v5 char) = (r7v1 char), (r7v1 char), (r7v1 char), (r7v6 char), (r7v6 char) binds: [B:82:0x01a4, B:79:0x0195, B:58:0x012c, B:46:0x00d5, B:22:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0088: PHI (r8v6 com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod) = 
      (r8v1 com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod)
      (r8v1 com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod)
      (r8v1 com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod)
      (r8v7 com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod)
      (r8v7 com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod)
     binds: [B:82:0x01a4, B:79:0x0195, B:58:0x012c, B:46:0x00d5, B:22:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0088: PHI (r9v6 X.09mX) = (r9v1 X.09mX), (r9v1 X.09mX), (r9v1 X.09mX), (r9v7 X.09mX), (r9v7 X.09mX) binds: [B:82:0x01a4, B:79:0x0195, B:58:0x012c, B:46:0x00d5, B:22:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b0 A[PHI: r7 r8 r9
      0x01b0: PHI (r7v3 char) = (r7v1 char), (r7v1 char), (r7v1 char), (r7v1 char), (r7v1 char), (r7v6 char), (r7v6 char), (r7v6 char) binds: [B:84:0x01a8, B:82:0x01a4, B:54:0x011f, B:56:0x0125, B:58:0x012c, B:42:0x00c8, B:44:0x00ce, B:46:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x01b0: PHI (r8v4 com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod) = 
      (r8v1 com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod)
      (r8v1 com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod)
      (r8v1 com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod)
      (r8v1 com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod)
      (r8v1 com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod)
      (r8v7 com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod)
      (r8v7 com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod)
      (r8v7 com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod)
     binds: [B:84:0x01a8, B:82:0x01a4, B:54:0x011f, B:56:0x0125, B:58:0x012c, B:42:0x00c8, B:44:0x00ce, B:46:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x01b0: PHI (r9v4 X.09mX) = (r9v1 X.09mX), (r9v1 X.09mX), (r9v1 X.09mX), (r9v1 X.09mX), (r9v1 X.09mX), (r9v7 X.09mX), (r9v7 X.09mX), (r9v7 X.09mX) binds: [B:84:0x01a8, B:82:0x01a4, B:54:0x011f, B:56:0x0125, B:58:0x012c, B:42:0x00c8, B:44:0x00ce, B:46:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(androidx.fragment.app.Fragment r41, android.content.Context r42, com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse r43, com.ss.android.ugc.aweme.item.StoryCacheData r44, kotlin.jvm.functions.Function0 r45, boolean r46) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598660rhg.LJIIJJI(androidx.fragment.app.Fragment, android.content.Context, com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse, com.ss.android.ugc.aweme.item.StoryCacheData, kotlin.jvm.functions.Function0, boolean):void");
    }
}
