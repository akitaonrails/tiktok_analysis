package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.business.common.dc.SkylightCacheCleanupScheduler;
import com.ss.android.ugc.aweme.dc.core.ListIndexSnapshot;
import com.ss.android.ugc.aweme.dc.core.PORef;
import com.ss.android.ugc.aweme.dc.core.SnapshotEntry;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NxJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C610670NxJ implements InterfaceC610850Nxb {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(11));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(12));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(10));

    public static void LIZLLL() {
        Object c098200Yq;
        try {
            SkylightCacheCleanupScheduler.LIZ.LIZIZ();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("SkylightLayeredDiskCacheService", "ensureCleanupInstalled failed", thM5exceptionOrNullimpl);
        }
    }

    public static C610680NxK LJ(int i) {
        Object obj;
        Object obj2 = null;
        if (!C596340NaC.LIZIZ().isEnabled) {
            return null;
        }
        LIZLLL();
        try {
            C610680NxK c610680NxK = new C610680NxK();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skylight_list_index_");
            sbLIZ.append(i);
            c610680NxK.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
            c610680NxK.LIZ = new C610710NxN(0);
            C614770O9j c614770O9j = C614770O9j.LIZIZ;
            c610680NxK.LIZIZ = C1697810uHb.LJIIJJI(c614770O9j.LJFF(), c614770O9j.LIZLLL());
            C189200o6.m2constructorimpl(c610680NxK);
            obj = c610680NxK;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl != null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("SkylightLayeredDiskCacheService", "layeredDiskCacheBuilder failed", thM5exceptionOrNullimpl);
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (C610680NxK) obj2;
    }

    public static Pair LJFF(final int i) {
        Object objLJFF;
        Object objLJIIIZ;
        if (i == 3) {
            ISkylightOutBridge iSkylightOutBridge = (ISkylightOutBridge) PluggableExtentionKt.pluggableSpi$default(ISkylightOutBridge.class, false, false, false, 14, null);
            Object obj = null;
            if (iSkylightOutBridge != null) {
                objLJFF = iSkylightOutBridge.LJFF();
            } else {
                objLJFF = null;
            }
            if (!(objLJFF instanceof InterfaceC610960Nxm)) {
                objLJFF = null;
            }
            if (iSkylightOutBridge != null) {
                objLJIIIZ = iSkylightOutBridge.LJIIIZ();
            } else {
                objLJIIIZ = null;
            }
            if (objLJIIIZ instanceof InterfaceC610820NxY) {
                obj = objLJIIIZ;
            }
            if (objLJFF != null && obj != null) {
                return new Pair(objLJFF, obj);
            }
        }
        return new Pair(new InterfaceC610960Nxm() { // from class: X.0Nxa
            public List<FollowingInterestUser> LIZ;

            @Override // X.InterfaceC610960Nxm
            public final Unit onStop() {
                this.LIZ = null;
                return Unit.LIZ;
            }

            @Override // X.InterfaceC610960Nxm
            public final Object LIZ(ListIndexSnapshot listIndexSnapshot) {
                List<SnapshotEntry> listLIZ = C614770O9j.LIZIZ.LJII().LIZ(listIndexSnapshot);
                Iterator<SnapshotEntry> it2 = listLIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(C610770NxT.LIZ(it2.next().voType), C610740NxQ.LIZJ)) {
                        this.LIZ = new ArrayList();
                        break;
                    }
                }
                int size = listIndexSnapshot.entries.size() - listLIZ.size();
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onStart: filtered count = ");
                sbLIZ.append(size);
                C1720106oR.LJI("FeedSkylightCacheVOWrapper", C2188811AlT.LIZIZ(sbLIZ));
                return listLIZ;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC610960Nxm
            public final Object LIZIZ(SnapshotEntry snapshotEntry, List list) {
                List<FollowingInterestUser> list2;
                C610660NxI c610660NxI;
                C610500Nx2 c610500Nx2;
                Object c098200Yq;
                int iIntValue;
                int iIntValue2;
                int iIntValue3;
                int size;
                List<User> list3;
                String str;
                Integer numLJIIJJI;
                String str2;
                Integer numLJIIJJI2;
                String str3;
                Integer numLJIIJJI3;
                Aweme aweme;
                AbstractC610790NxV abstractC610790NxVLIZ = C610770NxT.LIZ(snapshotEntry.voType);
                if (Intrinsics.LJFF(abstractC610790NxVLIZ, C610800NxW.LIZJ)) {
                    C610660NxI c610660NxI2 = (C610660NxI) C13LP.LJJJLL(list);
                    if (c610660NxI2 == null) {
                        return null;
                    }
                    T t = c610660NxI2.LIZIZ;
                    if (!(t instanceof Aweme) || (aweme = (Aweme) t) == null) {
                        return null;
                    }
                    return new C1596360rdy(((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(aweme.getAuthor().getUid()), aweme);
                }
                if (!Intrinsics.LJFF(abstractC610790NxVLIZ, C610740NxQ.LIZJ) || (list2 = this.LIZ) == null || (c610660NxI = (C610660NxI) C13LP.LJJJLL(list)) == null) {
                    return null;
                }
                T t2 = c610660NxI.LIZIZ;
                if (!(t2 instanceof C610500Nx2) || (c610500Nx2 = (C610500Nx2) t2) == null) {
                    return null;
                }
                try {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    String str4 = c610500Nx2.LIZ.roomData;
                    c1227904rF.getClass();
                    c098200Yq = (SlimRoom) C1227904rF.LIZIZ(str4, SlimRoom.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                SlimRoom slimRoom = (SlimRoom) c098200Yq;
                if (slimRoom == null) {
                    return null;
                }
                Map<String, String> map = snapshotEntry.states;
                boolean z = false;
                if (map != null && (str3 = map.get("position")) != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str3)) != null) {
                    iIntValue = numLJIIJJI3.intValue();
                } else {
                    iIntValue = 0;
                }
                Map<String, String> map2 = snapshotEntry.states;
                if (map2 != null && (str2 = map2.get("interest_user_type")) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str2)) != null) {
                    iIntValue2 = numLJIIJJI2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                Map<String, String> map3 = snapshotEntry.states;
                if (map3 != null && (str = map3.get("relation_type")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
                    iIntValue3 = numLJIIJJI.intValue();
                } else {
                    iIntValue3 = 0;
                }
                com.ss.android.ugc.aweme.profile.model.User user = c610500Nx2.LIZ;
                LogPbBean logPbBean = new LogPbBean();
                logPbBean.setImprId(c610500Nx2.LIZ.getRequestId());
                FollowingInterestUser followingInterestUser = new FollowingInterestUser(user, false, logPbBean, iIntValue2, null);
                followingInterestUser.setRelationType(iIntValue3);
                followingInterestUser.setSlimRoom(slimRoom);
                ((ArrayList) list2).add(followingInterestUser);
                SlimRoom.LinkMic linkMic = slimRoom.getLinkMic();
                if (linkMic != null && (list3 = linkMic.followedList) != null) {
                    size = list3.size();
                } else {
                    size = 0;
                }
                if (size >= 2) {
                    z = true;
                }
                InterfaceC1595940rdI interfaceC1595940rdILIZJ = C1596310rdt.LIZJ(followingInterestUser, z, list2, iIntValue);
                interfaceC1595940rdILIZJ.LJIJ(true);
                return interfaceC1595940rdILIZJ;
            }
        }, new InterfaceC610820NxY(i) { // from class: X.0NxR
            public final int LIZ;

            {
                this.LIZ = i;
            }

            @Override // X.InterfaceC610820NxY
            public final C610780NxU LIZ(List list) {
                boolean z;
                String curUserId;
                StoryInboxItem storyInboxItem;
                SnapshotEntry snapshotEntry;
                int iLIZ = C596340NaC.LIZ(this.LIZ);
                if (iLIZ <= 0 || list.isEmpty()) {
                    return null;
                }
                boolean z2 = C596340NaC.LIZIZ().storyCacheEnable;
                if (C596340NaC.LIZIZ().liveCacheEnable && this.LIZ != 0) {
                    z = true;
                } else {
                    z = false;
                }
                ArrayList<InterfaceC1891350zJl> arrayList = new ArrayList(iLIZ);
                for (Object obj2 : list) {
                    if (arrayList.size() >= iLIZ) {
                        break;
                    }
                    if (z2 && (obj2 instanceof InterfaceC714040Rze)) {
                        arrayList.add(obj2);
                    } else if (z && (obj2 instanceof InterfaceC1595940rdI)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC1891350zJl interfaceC1891350zJl : arrayList) {
                    if (interfaceC1891350zJl instanceof InterfaceC1595940rdI) {
                        InterfaceC1595940rdI interfaceC1595940rdI = (InterfaceC1595940rdI) interfaceC1891350zJl;
                        if (C596340NaC.LIZIZ().liveCacheEnable) {
                            snapshotEntry = new SnapshotEntry(Collections.singletonList(new PORef(interfaceC1595940rdI.LLIILZL().getUser().getUid(), C610510Nx3.LIZJ.LIZ)), C610740NxQ.LIZJ.LIZ, C2097608Jq.LJIIIIZZ(new Pair("position", String.valueOf(interfaceC1595940rdI.LJJLIIIJLJLI())), new Pair("interest_user_type", String.valueOf(interfaceC1595940rdI.LLIILZL().getInterestUserType())), new Pair("relation_type", String.valueOf(interfaceC1595940rdI.LLIILZL().getRelationType()))));
                            arrayList2.add(snapshotEntry);
                        }
                    } else if (interfaceC1891350zJl instanceof InterfaceC714040Rze) {
                        InterfaceC714040Rze interfaceC714040Rze = (InterfaceC714040Rze) interfaceC1891350zJl;
                        if (C596340NaC.LIZIZ().storyCacheEnable) {
                            String authorUid = AwemeExtKt.getAuthorUid(interfaceC714040Rze.getStoryCollection());
                            if (authorUid.length() != 0) {
                                snapshotEntry = new SnapshotEntry(Collections.singletonList(new PORef(authorUid, C610530Nx5.LIZJ.LIZ)), C610800NxW.LIZJ.LIZ, null);
                                arrayList2.add(snapshotEntry);
                            }
                        }
                    }
                }
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("provide: count limit = ");
                sbLIZ.append(iLIZ);
                sbLIZ.append(", candidates size = ");
                sbLIZ.append(arrayList.size());
                sbLIZ.append(", entries size = ");
                sbLIZ.append(arrayList2.size());
                C1720106oR.LJI("FeedSkylightSnapshotEntryProvider", C2188811AlT.LIZIZ(sbLIZ));
                if (arrayList2.isEmpty()) {
                    return null;
                }
                Object objLJJJLL = C13LP.LJJJLL(arrayList);
                if ((objLJJJLL instanceof StoryInboxItem) && (storyInboxItem = (StoryInboxItem) objLJJJLL) != null && storyInboxItem.isMe()) {
                    curUserId = AwemeExtKt.getAuthorUid(storyInboxItem.getStoryCollection());
                } else {
                    curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                }
                return new C610780NxU(curUserId, arrayList2);
            }
        });
    }

    @Override // X.InterfaceC610850Nxb
    public final List<SnapshotEntry> LIZ(ListIndexSnapshot listIndexSnapshot) {
        long jCurrentTimeMillis = System.currentTimeMillis() - listIndexSnapshot.meta.updateAt;
        long jMax = Math.max(C596340NaC.LIZIZ().liveCacheDuration, C596340NaC.LIZIZ().storyCacheDuration);
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        if (jCurrentTimeMillis > jMax * j) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("inspectSnapshotValidity: filter all entries after ");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append(" mills");
            C1720106oR.LJI("SkylightLayeredDiskCacheService", C2188811AlT.LIZIZ(sbLIZ));
            return C13BV.INSTANCE;
        }
        if (jCurrentTimeMillis > C596340NaC.LIZIZ().liveCacheDuration * j) {
            List<SnapshotEntry> list = listIndexSnapshot.entries;
            ArrayList arrayList = new ArrayList();
            for (SnapshotEntry snapshotEntry : list) {
                if (!Intrinsics.LJFF(C610770NxT.LIZ(snapshotEntry.voType), C610740NxQ.LIZJ)) {
                    arrayList.add(snapshotEntry);
                }
            }
            return arrayList;
        }
        return listIndexSnapshot.entries;
    }

    @Override // X.InterfaceC610850Nxb
    public final C05IL LIZJ(int i) {
        C05IL c05il;
        Object c098200Yq = null;
        if (!C596340NaC.LIZIZ().isEnabled) {
            return null;
        }
        synchronized (this.LIZJ.getValue()) {
            try {
                if (((Map) this.LIZJ.getValue()).get(Integer.valueOf(i)) == null) {
                    try {
                        Pair pairLJFF = LJFF(i);
                        InterfaceC610960Nxm interfaceC610960Nxm = (InterfaceC610960Nxm) pairLJFF.getFirst();
                        InterfaceC610820NxY interfaceC610820NxY = (InterfaceC610820NxY) pairLJFF.getSecond();
                        C610680NxK c610680NxKLJ = LJ(i);
                        if (c610680NxKLJ != null) {
                            c610680NxKLJ.LJ = interfaceC610960Nxm;
                            c610680NxKLJ.LIZJ = interfaceC610820NxY;
                            C610900Nxg c610900Nxg = new C610900Nxg(c610680NxKLJ);
                            LIZLLL();
                            ((Map) this.LIZJ.getValue()).put(Integer.valueOf(i), c610900Nxg);
                            c098200Yq = Unit.LIZ;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        int i2 = C2187451AjH.LIZ;
                        C1720106oR.LIZIZ("SkylightLayeredDiskCacheService", "provideLayeredCache failed", thM5exceptionOrNullimpl);
                    }
                }
                c05il = (C05IL) ((Map) this.LIZJ.getValue()).get(Integer.valueOf(i));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return c05il;
    }

    @Override // X.InterfaceC610850Nxb
    public final void LIZIZ(int i, boolean z, List<? extends InterfaceC1891350zJl> list) {
        int iIntValue;
        boolean z2;
        if (!C596340NaC.LIZIZ().isEnabled) {
            return;
        }
        int iLIZ = C596340NaC.LIZ(i);
        synchronized (this.LIZIZ.getValue()) {
            if (!z) {
                try {
                    if (!z) {
                        Integer num = (Integer) ((Map) this.LIZIZ.getValue()).get(Integer.valueOf(i));
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        iLIZ -= iIntValue;
                    } else {
                        throw new C1954807lC();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        int size = list.size();
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeSkylightPOData, scene: ");
        sbLIZ.append(i);
        sbLIZ.append(", isRefresh: ");
        sbLIZ.append(z);
        sbLIZ.append(", leftStoreCount: ");
        sbLIZ.append(iLIZ);
        sbLIZ.append(", dataCount: ");
        sbLIZ.append(size);
        C1720106oR.LJI("SkylightLayeredDiskCacheService", C2188811AlT.LIZIZ(sbLIZ));
        if (iLIZ <= 0) {
            return;
        }
        if (C596340NaC.LIZIZ().liveCacheEnable && i != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LIZ.getValue(), null, null, new C598680Ndy(iLIZ, list, C596340NaC.LIZIZ().storyCacheEnable, z2, this, i, null), 3);
    }
}
