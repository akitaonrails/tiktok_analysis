package X;

import Y.ARunnableS116S0100000_16;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.challenge.model.MixCardStruct;
import com.ss.android.ugc.aweme.challenge.model.RoomStructV2;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.115z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194457115z extends AbstractC1255880imo<Aweme, ChallengeAwemeList> {
    public static final HashMap<String, String> LLIZ = new HashMap<>();
    public String LL;
    public int LLILLJJLI;
    public List<Aweme> LLILZ;
    public String LLILLL = "challenge_video";
    public final AnonymousClass1160 LLILZIL = new Object() { // from class: X.1160
    };
    public long LLILZLL = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        ArrayList arrayList = new ArrayList();
        if (!C086I.LIZIZ(this.LLILZ)) {
            arrayList.addAll(this.LLILZ);
        }
        T t = this.mData;
        List<Aweme> list = t == 0 ? null : ((ChallengeAwemeList) t).items;
        if (!C086I.LIZIZ(list)) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isDataEmpty() {
        T t = this.mData;
        return (t == 0 || !((ChallengeAwemeList) t).isHasMore()) && C086I.LIZIZ(getItems());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((ChallengeAwemeList) t).isHasMore();
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 4) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1255880imo
    public final boolean deleteItem(Aweme aweme) {
        return C729980SkG.LIZIZ(getItems(), aweme, this.mNotifyListeners);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList] */
    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        List<Aweme> arrayList;
        boolean z;
        Aweme aweme;
        String rawdata;
        ?? r10 = (ChallengeAwemeList) obj;
        if (r10 != 0 && this.mListQueryType == 1) {
            LogPbBean logPbBean = r10.logPb;
            if (logPbBean == null) {
                this.LL = "";
            } else {
                this.LL = logPbBean.getImprId();
            }
        }
        C584850Mwl.LIZ.LJI(r10.getRequestId(), r10.logPb);
        List<MixCardStruct> list = r10.mixList;
        if (list != null && !list.isEmpty()) {
            List<MixCardStruct> list2 = r10.mixList;
            ArrayList<MixCardStruct> arrayList2 = new ArrayList();
            for (MixCardStruct mixCardStruct : list2) {
                if (mixCardStruct.getType() == 1) {
                    arrayList2.add(mixCardStruct);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (MixCardStruct mixCardStruct2 : arrayList2) {
                if (mixCardStruct2.isLive()) {
                    aweme = new Aweme();
                    aweme.setAwemeType(101);
                    RoomStructV2 roomInfo = mixCardStruct2.getRoomInfo();
                    Long lValueOf = null;
                    if (roomInfo != null) {
                        rawdata = roomInfo.getRawdata();
                    } else {
                        rawdata = null;
                    }
                    AwemeExtKt.setNewLiveRoomDataStr(aweme, rawdata);
                    StringBuilder sb = new StringBuilder("");
                    LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
                    if (newLiveRoomDataExt != null) {
                        lValueOf = Long.valueOf(newLiveRoomDataExt.id);
                    }
                    sb.append(lValueOf);
                    aweme.setAid(sb.toString());
                    aweme.setRequestId(r10.getRequestId());
                } else {
                    aweme = mixCardStruct2.getAweme();
                }
                arrayList3.add(aweme);
            }
            arrayList = new ArrayList<>(arrayList3);
        } else {
            arrayList = r10.items;
        }
        r10.items = arrayList;
        if (C086I.LIZIZ(arrayList) && !r10.isHasMore()) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!z) {
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Aweme awemeLLILLL = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL((Aweme) ListProtector.get(arrayList, i));
                    awemeLLILLL.setIsTop(((Aweme) ListProtector.get(arrayList, i)).getIsTop());
                    if (awemeLLILLL.getAid() != null) {
                        LLIZ.put(awemeLLILLL.getAid(), this.LL);
                    }
                    IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(awemeLLILLL.getAid());
                    sbLIZ.append(this.LLILLJJLI + LivePreCreateNextRoomPlayer.ENABLE);
                    iRequestIdService.LIZIZ(i, C2188811AlT.LIZIZ(sbLIZ), r10.getRequestId());
                    ListProtector.set(arrayList, i, awemeLLILLL);
                }
            }
            int i2 = this.mListQueryType;
            if (i2 != 1) {
                if (i2 == 4) {
                    if (arrayList != null) {
                        if (C086I.LIZIZ(((ChallengeAwemeList) this.mData).items)) {
                            ((ChallengeAwemeList) this.mData).items = arrayList;
                        } else {
                            C188700o1.LIZ(((ChallengeAwemeList) this.mData).items, arrayList, new Function2() { // from class: X.00rB
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return Boolean.valueOf(TextUtils.equals(((Aweme) obj2).getAid(), ((Aweme) obj3).getAid()));
                                }
                            });
                        }
                    }
                    ChallengeAwemeList challengeAwemeList = (ChallengeAwemeList) this.mData;
                    challengeAwemeList.cursor = r10.cursor;
                    challengeAwemeList.hasMore = r10.hasMore & challengeAwemeList.hasMore;
                    return;
                }
                return;
            }
            this.mData = r10;
            return;
        }
        T t = this.mData;
        if (t != 0) {
            ((ChallengeAwemeList) t).hasMore = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((ChallengeAwemeList) this.mData).cursor;
        }
        LJIIJ(str, j, ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue(), this.LL, false);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        if (objArr.length >= 6) {
            LJIIJ((String) objArr[1], 0L, ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue(), null, ((Boolean) objArr[5]).booleanValue());
        } else {
            LJIIJ((String) objArr[1], 0L, ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue(), null, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList] */
    @Override // X.AbstractC1255880imo
    public final void setItems(List<Aweme> list) {
        if (this.mData == 0) {
            this.mData = new ChallengeAwemeList();
        }
        T t = this.mData;
        ((ChallengeAwemeList) t).hasMore = 1;
        ((ChallengeAwemeList) t).items = list;
    }

    public final void LJIIJ(final String str, final long j, final int i, final boolean z, final String str2, boolean z2) {
        this.LLILLJJLI = i;
        if (!z2) {
            AnonymousClass1126 anonymousClass1126 = AnonymousClass1126.LIZ;
            String str3 = this.LLILLL;
            anonymousClass1126.getClass();
            AnonymousClass1126.LIZ(i, str, str3, str2, z, j);
            if (j == 0) {
                C19371010qS.LIZIZ(-1L, "cd_hit_cache");
            }
        }
        getClass();
        getClass();
        getClass();
        getClass();
        getClass();
        getClass();
        getClass();
        getClass();
        getClass();
        C1BVK.LIZIZ().LIZ(this.mHandler, new Callable() { // from class: X.1161
            public final /* synthetic */ int LLILLL = 20;
            public final /* synthetic */ String LLIZ = null;

            @Override // java.util.concurrent.Callable
            public final Object call() throws ExecutionException, InterruptedException {
                C1C7U.LIZ("ChallengeAwemeModel@c899.fetchList$1");
                getClass();
                this.LLIZLLLIL.LLILZLL = SystemClock.elapsedRealtime();
                String str4 = str;
                long j2 = j;
                int i2 = this.LLILLL;
                int i3 = i;
                boolean z3 = z;
                String str5 = this.LLIZLLLIL.LLILLL;
                String str6 = str2;
                String str7 = this.LLIZ;
                String str8 = AnonymousClass1162.LIZ;
                boolean zLJI = MethodIDManager.LJI(202209);
                boolean zLJIIZILJ = ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIZILJ(str4);
                String str9 = i3 == 2 ? zLJIIZILJ ? AnonymousClass1162.LJFF : AnonymousClass1162.LIZJ : zLJIIZILJ ? AnonymousClass1162.LJI : AnonymousClass1162.LIZLLL;
                HashMap map = new HashMap();
                if (z3) {
                    map.put("hashtag_name", str4);
                    map.put("query_type", String.valueOf(1));
                } else {
                    map.put("ch_id", str4);
                    map.put("query_type", String.valueOf(0));
                }
                if (str6 != null) {
                    map.put("search_id", str6);
                }
                map.put("cursor", String.valueOf(j2));
                map.put("count", String.valueOf(i2));
                map.put("type", String.valueOf(5));
                map.put("source", String.valueOf(str5));
                if (!TextUtils.isEmpty(str7)) {
                    map.put("top_item_id", str7);
                }
                ChallengeAwemeList challengeAwemeList = AnonymousClass1162.LJII.LJFF(str9, map).get();
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS116S0100000_16(challengeAwemeList, 256));
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                C1C7U.LIZIZ("ChallengeAwemeModel@c899.fetchList$1");
                return challengeAwemeList;
            }
        }, 0);
    }
}
