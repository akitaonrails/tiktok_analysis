package X;

import Y.AfS193S0100000_24;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.base.util.InboxCacheItem;
import com.ss.android.ugc.aweme.experiment.InboxSkylightStoryCacheConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge;
import com.ss.android.ugc.aweme.item.StoryCacheData;
import com.ss.android.ugc.aweme.item.StoryCacheExtra;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS268S0300000_24;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rkA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600200rkA {
    public InterfaceC1600170rk7 LIZIZ;
    public C11JF LIZLLL;
    public C05O0 LJ;
    public AnonymousClass0956 LJFF;
    public InterfaceC1455405mq<InterfaceC1891350zJl> LJI;
    public volatile StoryCacheData LJII;
    public volatile String LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public volatile long LJIIJ;
    public final C1600310rkL LIZ = new C1600310rkL();
    public final C054G LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));

    public final void LJIILIIL() {
        StoryCacheData.PowerItemCache powerItemCache;
        InterfaceC1455405mq<InterfaceC1891350zJl> interfaceC1455405mq = this.LJI;
        if (interfaceC1455405mq == null) {
            return;
        }
        StoryCacheData storyCacheData = this.LJII;
        if (!(storyCacheData instanceof StoryCacheData.PowerItemCache) || (powerItemCache = (StoryCacheData.PowerItemCache) storyCacheData) == null) {
            return;
        }
        if (powerItemCache.isLastChunk()) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("SkylightStoryDataCenter", "startRemainingPagedRead: already last chunk, skip");
            return;
        }
        int i2 = C596340NaC.LIZIZ().pagedReadPageCount;
        if (i2 <= 0) {
            return;
        }
        StoryCacheExtra extra = powerItemCache.getExtra();
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startRemainingPagedRead: startOffset=");
        sbLIZ.append(powerItemCache.getPowerItems().size());
        sbLIZ.append(", totalCount=");
        sbLIZ.append(interfaceC1455405mq.LIZJ());
        C1720106oR.LJI("SkylightStoryDataCenter", C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF = C23250099c.LIZLLL(this.LIZJ, null, null, new C1600140rk4(powerItemCache, interfaceC1455405mq, this, extra, i2, null), 3);
    }

    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJFF = null;
        InterfaceC1455405mq<InterfaceC1891350zJl> interfaceC1455405mq = this.LJI;
        this.LJI = null;
        if (interfaceC1455405mq != null) {
            C23250099c.LIZLLL(this.LIZJ, null, null, new C05AD(interfaceC1455405mq, null), 3);
        }
    }

    public final void LJIIIZ() {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Keva repo = Keva.getRepo("inbox_skylight_story_cache");
        try {
            c098200Yq = (StoryCacheExtra) C293501Bt.LIZ().LJII(repo.getString("cache_key_inbox_list_extra_data", ""), StoryCacheExtra.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1599100riO.LIZ.set("OTHER");
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("SkylightStoryDataCenter", "read extra data error", thM5exceptionOrNullimpl);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        StoryCacheExtra storyCacheExtra = (StoryCacheExtra) c098200Yq;
        if (storyCacheExtra == null) {
            AtomicReference<String> atomicReference = C1599100riO.LIZ;
            while (!atomicReference.compareAndSet("", "EMPTY") && atomicReference.get() == "") {
            }
            int i2 = C2187451AjH.LIZ;
            return;
        }
        if (!Intrinsics.LJFF(storyCacheExtra.uid, LJ())) {
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LJI("SkylightStoryDataCenter", "cache owner is not match");
            LIZIZ(this, true, 2);
            return;
        }
        long j = storyCacheExtra.timestamp;
        long j2 = ((InboxSkylightStoryCacheConfig) C1599440riw.LIZIZ.getValue()).cacheExpireTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        boolean z = false;
        if (0 > jCurrentTimeMillis || jCurrentTimeMillis > j2) {
            C1599100riO.LIZ.set("EXPIRE");
            int i4 = C2187451AjH.LIZ;
            C1720106oR.LJI("SkylightStoryDataCenter", "cache is not fresh");
            LIZIZ(this, false, 3);
            return;
        }
        try {
            c098200Yq2 = repo.getString("cache_key_inbox_list_data", "");
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl2 != null) {
            C1599100riO.LIZ.set("OTHER");
            int i5 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("SkylightStoryDataCenter", "read list data error", thM5exceptionOrNullimpl2);
        }
        String str = (String) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
        if (str == null) {
            return;
        }
        if ((this.LJII instanceof StoryCacheData.ResponseCache) || this.LIZ.LIZ()) {
            int i6 = C2187451AjH.LIZ;
            C1720106oR.LJI("SkylightStoryDataCenter", "api finished, abort cache");
            return;
        }
        try {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
            if (0 <= jCurrentTimeMillis2 && jCurrentTimeMillis2 < 900001) {
                z = true;
            }
            List<InterfaceC1891350zJl> listLIZJ = LIZJ(str, z);
            C1599100riO.LIZIZ.set(j);
            this.LJII = new StoryCacheData.PowerItemCache(listLIZJ, false, storyCacheExtra.copy(storyCacheExtra.timestamp, storyCacheExtra.uid, 1), false, false, false);
            int i7 = C2187451AjH.LIZ;
            ((StoryCacheData.PowerItemCache) this.LJII).getPowerItems().size();
            c098200Yq3 = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        Throwable thM5exceptionOrNullimpl3 = C189200o6.m5exceptionOrNullimpl(c098200Yq3);
        if (thM5exceptionOrNullimpl3 != null) {
            C1599100riO.LIZ.set("DESERIALIZATION_FAIL");
            int i8 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("SkylightStoryDataCenter", "initLocalCachedData error", thM5exceptionOrNullimpl3);
        }
    }

    public final void LJIIL() {
        Object c098200Yq;
        if (this.LIZ.LIZ()) {
            return;
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            int i = C2187451AjH.LIZ;
            return;
        }
        if (((Boolean) C139300g3.LIZ.getValue()).booleanValue() && C1906580ziK.LJI()) {
            return;
        }
        int type = EnumC1582650rHr.INBOX_UPDATE_PRELOAD.getType();
        try {
            Map<String, String> mapLJ = C2097608Jq.LJ();
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            ISkylightOutBridge iSkylightOutBridge = (ISkylightOutBridge) ServiceManager.get().getService(ISkylightOutBridge.class);
            if (!C1600360rkQ.LIZ().requestExceptLive && !iSkylightOutBridge.LJIIIIZZ()) {
                arrayList.add(2);
                mapLJ = iSkylightOutBridge.LJI();
            }
            if (C1439905kL.LIZ()) {
                arrayList.add(4);
            }
            c098200Yq = C614770O9j.LIZIZ.LJ().LJIIIZ(EnumC1596540reG.INBOX_TAB.getValue(), arrayList, Long.valueOf(C1599090riN.LIZ() ? C1599090riN.LIZIZ().preloadPageCount : C0BV5.LIZ()), null, null, C1256440ini.LIZ() ? 1 : 0, C1599090riN.LIZ() ? 1 : 2, type, mapLJ, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1597470rfl.LIZ("notification_page", thM5exceptionOrNullimpl, C2097608Jq.LJIIIIZZ(new Pair("checkpoint", "SkylightStoryDataCenter#requestInboxMixRankSkylight"), new Pair("pull_type", String.valueOf(type)), new Pair("api_path", "skylight/feed")));
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C11NZ c11nz = (C11NZ) c098200Yq;
        if (c11nz == null) {
            c11nz = C11IR.LL;
        }
        this.LIZLLL = (C11JF) c11nz.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS193S0100000_24(this, 30), new AfS193S0100000_24(this, 31));
    }

    public static String LJ() {
        String uid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser != null) {
            uid = curUser.getUid();
            if (uid == null || uid.length() == 0) {
            }
            return uid;
        }
        uid = null;
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZ("SkylightStoryDataCenter", "current uid is invalid");
        return uid;
    }

    public final boolean LIZLLL() {
        StoryCacheExtra extra;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("existValidCache, cacheData is null: ");
        sbLIZ.append(this.LJII == null);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LJII == null) {
            return false;
        }
        StoryCacheData storyCacheData = this.LJII;
        boolean z = !Intrinsics.LJFF((storyCacheData == null || (extra = storyCacheData.getExtra()) == null) ? null : extra.uid, LJ());
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("existValidCache, ownerChanged: ");
        sbLIZ2.append(z);
        C2188811AlT.LIZIZ(sbLIZ2);
        return !z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1600290rkJ
            if (r0 == 0) goto L6b
            r5 = r7
            X.0rkJ r5 = (X.C1600290rkJ) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L4d
            if (r0 != r2) goto L71
            X.C155000ia.LIZIZ(r1)
        L23:
            com.ss.android.ugc.aweme.item.StoryCacheData r0 = r6.LJII
            if (r0 != 0) goto L4a
            X.05mq<X.0zJl> r0 = r6.LJI
            if (r0 != 0) goto L4a
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r1 = "SkylightStoryDataCenter"
            java.lang.String r0 = "initDiskCachedData: layered miss, fallback to legacy keva"
            X.C1720106oR.LJI(r1, r0)
            r6.LJIIIZ()
            com.ss.android.ugc.aweme.item.StoryCacheData r0 = r6.LJII
            if (r0 == 0) goto L3e
            r4 = 1
            r6.LJIIIZ = r2
        L3e:
            X.054G r3 = r6.LIZJ
            X.0NTt r2 = new X.0NTt
            r1 = 0
            r2.<init>(r4, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
        L4a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4d:
            X.C155000ia.LIZIZ(r1)
            boolean r1 = X.C596340NaC.LIZJ()
            java.lang.String r0 = "InboxSkylightStoryDataCenter#initDiskCachedData"
            if (r1 == 0) goto L64
            X.C596340NaC.LIZLLL(r0, r2)
            r5.LLILLL = r2
            java.lang.Object r0 = r6.LJI(r5)
            if (r0 != r3) goto L23
            return r3
        L64:
            X.C596340NaC.LIZLLL(r0, r4)
            r6.LJIIIZ()
            goto L4a
        L6b:
            X.0rkJ r5 = new X.0rkJ
            r5.<init>(r6, r7)
            goto L12
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600200rkA.LJFF(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C1600260rkG
            if (r0 == 0) goto L2c
            r7 = r10
            X.0rkG r7 = (X.C1600260rkG) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r3 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            java.lang.String r5 = "SkylightStoryDataCenter"
            r8 = 2
            r4 = 1
            if (r0 == 0) goto L32
            if (r0 == r4) goto L77
            if (r0 == r8) goto L77
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.0rkG r7 = new X.0rkG
            r7.<init>(r9, r10)
            goto L12
        L32:
            X.C155000ia.LIZIZ(r3)
            X.0O9j r0 = X.C614770O9j.LIZIZ
            X.0Nxb r1 = r0.LJII()
            r0 = 3
            X.05IL r3 = r1.LIZJ(r0)
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "initLayeredDiskCache: layeredDiskCache="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1720106oR.LJI(r5, r0)
            long r1 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.experiment.SkylightFullSceneDiskCacheConfig r0 = X.C596340NaC.LIZIZ()
            int r0 = r0.pagedReadPageCount
            if (r0 <= 0) goto L6c
            r7.LL = r1
            r7.LLILZ = r4
            java.lang.Object r0 = r9.LJIIIIZZ(r3, r0, r7)
            if (r0 != r6) goto L7c
            return r6
        L6c:
            r7.LL = r1
            r7.LLILZ = r8
            java.lang.Object r0 = r9.LJII(r3, r7)
            if (r0 != r6) goto L7c
            return r6
        L77:
            long r1 = r7.LL
            X.C155000ia.LIZIZ(r3)
        L7c:
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r6 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "initLayeredDiskCache: cost="
            r6.append(r0)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r6.append(r3)
            java.lang.String r0 = "ms"
            r6.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r6)
            X.C1720106oR.LJI(r5, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600200rkA.LJI(X.05Vn):java.lang.Object");
    }

    public final String LJIIJJI(List<InboxCacheItem> list) throws IOException {
        TypeAdapter typeAdapterLJIIJ;
        TypeAdapter typeAdapterLJIIJ2;
        C1598180rgu c1598180rgu;
        List<Aweme> stories;
        UserStory userStoryCopy;
        List<Aweme> stories2;
        ArrayList arrayList;
        UserStoryCurrentInfo userStoryCurrentInfoCopy;
        UserStoryCurrentInfo userStoryCurrentInfoCopy2;
        UserStoryCurrentInfo maxViewedInfo;
        Aweme awemeM199clone;
        UserStoryCurrentInfo maxViewedInfo2;
        Aweme aweme;
        UserStoryCurrentInfo currentInfo;
        Aweme awemeM199clone2;
        UserStoryCurrentInfo currentInfo2;
        Aweme aweme2;
        List<Aweme> stories3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringWriter stringWriter = new StringWriter();
        C09DL c09dl = new C09DL(stringWriter);
        c09dl.LLILZLL = true;
        c09dl.LLJ = false;
        c09dl.LIZIZ();
        boolean z = C1600360rkQ.LIZ().enableLiveDiskCache;
        boolean z2 = C1600360rkQ.LIZ().enableStoryDiskCache;
        if (z2) {
            typeAdapterLJIIJ = C293501Bt.LIZ().LJIIJ(StoryInboxItem.class);
        } else {
            typeAdapterLJIIJ = null;
        }
        if (z) {
            typeAdapterLJIIJ2 = C293501Bt.LIZ().LJIIJ(C1598180rgu.class);
        } else {
            typeAdapterLJIIJ2 = null;
        }
        AwS621S0100000_7 awS621S0100000_7 = new AwS621S0100000_7(c09dl, 94);
        for (InboxCacheItem inboxCacheItem : list) {
            if (z2 && Intrinsics.LJFF(inboxCacheItem.type, "story")) {
                StoryInboxItem storyInboxItemCopy = inboxCacheItem.storyItem;
                if (storyInboxItemCopy != null) {
                    UserStory userStory = storyInboxItemCopy.getStoryCollection().getUserStory();
                    if (userStory != null && (stories = userStory.getStories()) != null && !stories.isEmpty()) {
                        if (storyInboxItemCopy.getStoryCollection().getAuthor() != null) {
                            Aweme awemeM199clone3 = storyInboxItemCopy.getStoryCollection().m199clone();
                            UserStory userStory2 = awemeM199clone3.getUserStory();
                            if (userStory2 != null) {
                                UserStory userStory3 = storyInboxItemCopy.getStoryCollection().getUserStory();
                                if (userStory3 != null && (stories3 = userStory3.getStories()) != null) {
                                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(stories3, 10));
                                    Iterator<Aweme> it2 = stories3.iterator();
                                    while (it2.hasNext()) {
                                        Aweme awemeM199clone4 = it2.next().m199clone();
                                        awemeM199clone4.setAuthor(null);
                                        arrayList2.add(awemeM199clone4);
                                    }
                                    arrayList = new ArrayList(arrayList2);
                                } else {
                                    arrayList = new ArrayList();
                                }
                                UserStory userStory4 = awemeM199clone3.getUserStory();
                                if (userStory4 != null && (currentInfo = userStory4.getCurrentInfo()) != null) {
                                    UserStory userStory5 = awemeM199clone3.getUserStory();
                                    if (userStory5 != null && (currentInfo2 = userStory5.getCurrentInfo()) != null && (aweme2 = currentInfo2.currentStory) != null && (awemeM199clone2 = aweme2.m199clone()) != null) {
                                        awemeM199clone2.setAuthor(null);
                                    } else {
                                        awemeM199clone2 = null;
                                    }
                                    userStoryCurrentInfoCopy = currentInfo.copy(currentInfo.currentIndex, awemeM199clone2, currentInfo.dispatchCode);
                                } else {
                                    userStoryCurrentInfoCopy = null;
                                }
                                UserStory userStory6 = awemeM199clone3.getUserStory();
                                if (userStory6 != null && (maxViewedInfo = userStory6.getMaxViewedInfo()) != null) {
                                    UserStory userStory7 = awemeM199clone3.getUserStory();
                                    if (userStory7 != null && (maxViewedInfo2 = userStory7.getMaxViewedInfo()) != null && (aweme = maxViewedInfo2.currentStory) != null && (awemeM199clone = aweme.m199clone()) != null) {
                                        awemeM199clone.setAuthor(null);
                                    } else {
                                        awemeM199clone = null;
                                    }
                                    userStoryCurrentInfoCopy2 = maxViewedInfo.copy(maxViewedInfo.currentIndex, awemeM199clone, maxViewedInfo.dispatchCode);
                                } else {
                                    userStoryCurrentInfoCopy2 = null;
                                }
                                userStoryCopy = userStory2.copy(arrayList, userStory2.totalCount, userStory2.currentPosition, userStory2.allViewed, userStory2.minCursor, userStory2.maxCursor, userStory2.hasMoreAfter, userStory2.hasMoreBefore, userStory2.lastStoryCreatedAt, userStory2.isPostStyle, userStory2.metaDataList, userStory2.userFilterStoryInfo, userStory2.isStoryGuideCard, userStory2.highlightSkylightUser, userStory2.originTotalCount, userStoryCurrentInfoCopy, userStory2.fakeSelfStoryCollection, userStory2.fakeAwemeShell, userStoryCurrentInfoCopy2, userStory2.firstUnViewedStoryIdx, userStory2.shouldStartFromUnViewedStoryIdx, userStory2.totalVV, userStory2.unReadStoryAids, userStory2.isFromRemote);
                            } else {
                                userStoryCopy = null;
                            }
                            awemeM199clone3.setUserStory(userStoryCopy);
                            UserStory userStory8 = awemeM199clone3.getUserStory();
                            if (userStory8 != null && (stories2 = userStory8.getStories()) != null) {
                                Iterator<Aweme> it3 = stories2.iterator();
                                while (it3.hasNext()) {
                                    it3.next().setAuthor(null);
                                }
                            }
                            storyInboxItemCopy = storyInboxItemCopy.copy(awemeM199clone3, storyInboxItemCopy.priority, storyInboxItemCopy.isMe, storyInboxItemCopy.latestStoryNoteInfo, storyInboxItemCopy.thoughtInfo, storyInboxItemCopy.concernUserAvatarChanged, storyInboxItemCopy.reRankSequence, storyInboxItemCopy.reRankType, storyInboxItemCopy.revealInfo, storyInboxItemCopy.dataFrom, storyInboxItemCopy.receiveTime);
                        }
                        if (storyInboxItemCopy != null) {
                            awS621S0100000_7.invoke(inboxCacheItem.type, new AwS268S0300000_24(c09dl, (C09DL) typeAdapterLJIIJ, (TypeAdapter<StoryInboxItem>) storyInboxItemCopy, (StoryInboxItem) 13));
                        }
                    } else {
                        int i = C2187451AjH.LIZ;
                        C1720106oR.LJI("SkylightStoryDataCenter", "skip story item because of no story");
                    }
                }
            } else if (z && Intrinsics.LJFF(inboxCacheItem.type, "live") && (c1598180rgu = inboxCacheItem.liveItem) != null) {
                awS621S0100000_7.invoke(inboxCacheItem.type, new AwS268S0300000_24(c09dl, (C09DL) typeAdapterLJIIJ2, (TypeAdapter<C1598180rgu>) c1598180rgu, (C1598180rgu) 14));
            }
        }
        c09dl.LJI();
        c09dl.flush();
        String string = stringWriter.toString();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("serialize cache cost ");
        sbLIZ.append(jCurrentTimeMillis2);
        sbLIZ.append(" ms with method ");
        sbLIZ.append("stream");
        C2188811AlT.LIZIZ(sbLIZ);
        C23250099c.LIZLLL(this.LIZJ, null, null, new C01KS(jCurrentTimeMillis2, "stream", null), 3);
        return string;
    }

    public final List<InterfaceC1891350zJl> LIZJ(String str, boolean z) {
        Object c098200Yq;
        UserStoryCurrentInfo maxViewedInfo;
        Aweme aweme;
        UserStoryCurrentInfo currentInfo;
        Aweme aweme2;
        List<Aweme> stories;
        Object c098200Yq2;
        InboxLiveNotice inboxLiveNotice;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C09CU c09cu = new C09CU(new StringReader(str));
        c09cu.LLILLJJLI = true;
        c09cu.LIZ();
        ArrayList arrayList = new ArrayList();
        Gson gsonLIZ = C293501Bt.LIZ();
        TypeAdapter typeAdapterLJIIJ = gsonLIZ.LJIIJ(StoryInboxItem.class);
        TypeAdapter typeAdapterLJIIJ2 = gsonLIZ.LJIIJ(C1598180rgu.class);
        while (c09cu.LJIIZILJ()) {
            c09cu.LIZIZ();
            String strLJJJZ = null;
            StoryInboxItem storyInboxItem = null;
            C1598180rgu c1598180rgu = null;
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (strLJJJJ != null) {
                    int iHashCode = strLJJJJ.hashCode();
                    if (iHashCode != 3575610) {
                        if (iHashCode != 1417366047) {
                            if (iHashCode == 1710122408 && strLJJJJ.equals("storyItem")) {
                                if (Intrinsics.LJFF(strLJJJZ, "live")) {
                                    c09cu.LJJZ();
                                } else {
                                    try {
                                        Object obj = typeAdapterLJIIJ.read(c09cu);
                                        StoryInboxItem storyInboxItem2 = (StoryInboxItem) obj;
                                        User author = storyInboxItem2.getStoryCollection().getAuthor();
                                        UserStory userStory = storyInboxItem2.getStoryCollection().getUserStory();
                                        if (userStory != null && (stories = userStory.getStories()) != null) {
                                            for (Aweme aweme3 : stories) {
                                                if (aweme3.getAuthor() == null) {
                                                    aweme3.setAuthor(author);
                                                }
                                            }
                                        }
                                        UserStory userStory2 = storyInboxItem2.getStoryCollection().getUserStory();
                                        if (userStory2 != null && (currentInfo = userStory2.getCurrentInfo()) != null && (aweme2 = currentInfo.currentStory) != null && aweme2.getAuthor() == null) {
                                            aweme2.setAuthor(author);
                                        }
                                        UserStory userStory3 = storyInboxItem2.getStoryCollection().getUserStory();
                                        if (userStory3 != null && (maxViewedInfo = userStory3.getMaxViewedInfo()) != null && (aweme = maxViewedInfo.currentStory) != null && aweme.getAuthor() == null) {
                                            aweme.setAuthor(author);
                                        }
                                        c098200Yq = (StoryInboxItem) obj;
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c098200Yq = new C098200Yq(th);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    }
                                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                                    if (thM5exceptionOrNullimpl != null) {
                                        int i = C2187451AjH.LIZ;
                                        C1720106oR.LIZIZ("SkylightStoryDataCenter", "deserialize storyItem error", thM5exceptionOrNullimpl);
                                    }
                                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                        c098200Yq = null;
                                    }
                                    storyInboxItem = (StoryInboxItem) c098200Yq;
                                }
                            }
                        } else if (strLJJJJ.equals("liveItem")) {
                            if (z && !Intrinsics.LJFF(strLJJJZ, "story")) {
                                try {
                                    c098200Yq2 = (C1598180rgu) typeAdapterLJIIJ2.read(c09cu);
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    c098200Yq2 = new C098200Yq(th2);
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                }
                                Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                                if (thM5exceptionOrNullimpl2 != null) {
                                    int i2 = C2187451AjH.LIZ;
                                    C1720106oR.LIZIZ("SkylightStoryDataCenter", "deserialize liveItem error", thM5exceptionOrNullimpl2);
                                }
                                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                                    c098200Yq2 = null;
                                }
                                c1598180rgu = (C1598180rgu) c098200Yq2;
                                if (c1598180rgu != null && (inboxLiveNotice = c1598180rgu.LLILLL) != null) {
                                    inboxLiveNotice.setCache(true);
                                }
                            } else {
                                c09cu.LJJZ();
                            }
                        }
                    } else if (strLJJJJ.equals("type")) {
                        strLJJJZ = c09cu.LJJJZ();
                    }
                }
                c09cu.LJJZ();
            }
            if (Intrinsics.LJFF(strLJJJZ, "story")) {
                if (storyInboxItem != null) {
                    storyInboxItem.setDataFrom(1);
                    arrayList.add(storyInboxItem);
                }
            } else if (Intrinsics.LJFF(strLJJJZ, "live") && z && c1598180rgu != null) {
                arrayList.add(c1598180rgu);
            }
            c09cu.LJII();
        }
        c09cu.LJI();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deserialize cache cost ");
        sbLIZ.append(jCurrentTimeMillis2);
        sbLIZ.append(" ms with method ");
        sbLIZ.append("stream");
        C2188811AlT.LIZIZ(sbLIZ);
        C23250099c.LIZLLL(this.LIZJ, null, null, new C01KR(jCurrentTimeMillis2, "stream", null), 3);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C05IL r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C1600280rkI
            if (r0 == 0) goto L21
            r6 = r14
            X.0rkI r6 = (X.C1600280rkI) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L27
            goto L3f
        L21:
            X.0rkI r6 = new X.0rkI
            r6.<init>(r12, r14)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r5)
            if (r13 == 0) goto L3d
            r6.LLILLL = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r13.LIZIZ(r6)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L42
            return r1
        L3d:
            r5 = r4
            goto L44
        L3f:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L48
        L42:
            X.0Nxl r5 = (X.C610950Nxl) r5     // Catch: java.lang.Throwable -> L48
        L44:
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L48
            goto L54
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r5 = new X.00Yq
            r5.<init>(r0)
            X.C189200o6.m2constructorimpl(r5)
        L54:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r5)
            if (r2 == 0) goto L63
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r1 = "SkylightStoryDataCenter"
            java.lang.String r0 = "initLayeredDiskCache: read disk cache error"
            X.C1720106oR.LIZIZ(r1, r0, r2)
        L63:
            boolean r0 = X.C189200o6.m7isFailureimpl(r5)
            if (r0 != 0) goto L6a
            r4 = r5
        L6a:
            X.0Nxl r4 = (X.C610950Nxl) r4
            if (r4 == 0) goto L89
            com.ss.android.ugc.aweme.item.StoryCacheData$PowerItemCache r5 = new com.ss.android.ugc.aweme.item.StoryCacheData$PowerItemCache
            java.util.List<VO> r6 = r4.LIZIZ
            com.ss.android.ugc.aweme.item.StoryCacheExtra r8 = new com.ss.android.ugc.aweme.item.StoryCacheExtra
            com.ss.android.ugc.aweme.dc.core.SnapshotMeta r2 = r4.LIZ
            long r0 = r2.updateAt
            java.lang.String r2 = r2.userId
            r8.<init>(r0, r2, r3)
            r7 = 0
            r9 = r7
            r10 = r7
            r11 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.LJII = r5
        L86:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L89:
            r1 = 3
            r0 = 0
            LIZIZ(r12, r0, r1)
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600200rkA.LJII(X.05IL, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C1600200rkA r6, boolean r7, int r8) {
        /*
            r0 = r8 & 1
            r4 = 0
            if (r0 == 0) goto L6
            r7 = 0
        L6:
            r0 = r8 & 2
            if (r0 == 0) goto L76
            r6.getClass()
            r1 = 1
            if (r7 != 0) goto L26
            boolean r0 = X.C596340NaC.LIZJ()
            if (r0 == 0) goto L1a
            boolean r0 = r6.LJIIIZ
            if (r0 == 0) goto L76
        L1a:
            X.01GW r0 = X.C139400g4.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
        L26:
            r6.LIZ()
            r5 = 0
            r6.LJII = r5
            r6.LIZIZ = r5
            X.11JF r0 = r6.LIZLLL
            if (r0 == 0) goto L35
            r0.dispose()
        L35:
            if (r1 == 0) goto L47
            java.lang.String r0 = "inbox_skylight_story_cache"
            com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r0 = "cache_key_inbox_list_data"
            r1.erase(r0)
            java.lang.String r0 = "cache_key_inbox_list_extra_data"
            r1.erase(r0)
        L47:
            r1 = 0
            if (r7 == 0) goto L59
            r6.LJIIJ = r1
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r3 = X.C1599100riO.LIZ
            java.lang.String r0 = ""
            r3.set(r0)
            java.util.concurrent.atomic.AtomicLong r0 = X.C1599100riO.LIZIZ
            r0.set(r1)
        L59:
            r6.LJIIIZ = r4
            X.05O0 r3 = r6.LJ
            if (r3 == 0) goto L75
            X.0956 r0 = r3.LJI
            if (r0 == 0) goto L66
            r0.LIZIZ(r5)
        L66:
            r3.LJI = r5
            X.11JF r0 = r3.LJII
            if (r0 == 0) goto L6f
            r0.dispose()
        L6f:
            r3.LJII = r5
            r3.LJ = r1
            r3.LJFF = r1
        L75:
            return
        L76:
            r1 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600200rkA.LIZIZ(X.0rkA, boolean, int):void");
    }

    public static void LJIIJ(int i, long j, boolean z) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        try {
            jSONObject.put("is_success", i2);
            jSONObject.put("cost_ms", j);
            C189200o6.m2constructorimpl(jSONObject.put("tt_inbox_skylight_disk_cache_size", i));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C20684815ws.LJIJ("inbox_cache_save", jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C05IL r19, int r20, X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600200rkA.LJIIIIZZ(X.05IL, int, X.05Vn):java.lang.Object");
    }
}
