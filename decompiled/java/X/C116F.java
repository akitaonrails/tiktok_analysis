package X;

import Y.ARunnableS116S0100000_16;
import Y.AfS138S0000000_16;
import Y.AfS190S0100000_21;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.experiment.EffectDetailVideoListExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.story.api.IStoryFollowUpPublishService;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.116F, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C116F extends AbstractC1255880imo<Aweme, StickerPropAwemeList> {
    public static int LLJIJIL;
    public static Boolean LLJILJIL = Boolean.FALSE;
    public static final StickerPropApi LLJILJILJ = (StickerPropApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(StickerPropApi.class);
    public final int LL;
    public final String LLILLJJLI;
    public boolean LLIZLLLIL;
    public int LLJ;
    public boolean LLILLL = true;
    public long LLILZ = -1;
    public String LLILZIL = "";
    public String LLILZLL = "";
    public int LLIZ = -1;
    public final C11NJ LLJI = new C11NJ();

    public static String LJIIL() {
        C844470XAv.LIZ.getClass();
        int[] iArrLIZ = C422830Gi1.LIZ(C844470XAv.LIZ().getResources().getDisplayMetrics().density > 320.0f ? 201 : 200);
        if (iArrLIZ == null || iArrLIZ.length < 2) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iArrLIZ[0]);
        sbLIZ.append("_");
        sbLIZ.append(iArrLIZ[1]);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((StickerPropAwemeList) t).items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isDataEmpty() {
        T t = this.mData;
        return (t == 0 || ((StickerPropAwemeList) t).hasMore != 1) && C086I.LIZIZ(getItems());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((StickerPropAwemeList) t).hasMore == 1;
    }

    public C116F() {
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 3) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1255880imo
    public final boolean deleteItem(Aweme aweme) {
        return C729980SkG.LIZIZ(getItems(), aweme, this.mNotifyListeners);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, com.ss.android.ugc.aweme.base.api.BaseResponse, com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList] */
    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        boolean z;
        ?? r9 = (StickerPropAwemeList) obj;
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().step("tool_performance_effect_shoot_same", "Grid Videos API Response");
        if (this.LLILZ == 0) {
            C116B.LIZ(false);
        }
        if (this.LLIZLLLIL && this.LLILZ == 0 && r9 != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL);
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(this.LLILZ);
            sbLIZ.append(this.LLIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C116B c116b = C116B.LIZ;
            if (C289350BVt.LIZ() || !C0BNF.LIZ()) {
                C116B.LIZLLL.LIZLLL(strLIZIZ, new C116C(r9, System.currentTimeMillis() + ((long) C116B.LIZIZ)));
            }
        }
        this.LLIZLLLIL = false;
        if (r9 != 0 && (!C086I.LIZIZ(r9.items) || r9.hasMore == 1)) {
            z = false;
        } else {
            z = true;
        }
        this.mIsNewDataEmpty = z;
        if (!z) {
            List<Aweme> list = r9.items;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Aweme awemeLLILLL = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL((Aweme) ListProtector.get(r9.items, i));
                    awemeLLILLL.setIsTop(((Aweme) ListProtector.get(r9.items, i)).getIsTop());
                    IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(awemeLLILLL.getAid());
                    sbLIZ2.append(this.LL + 10000);
                    iRequestIdService.LIZIZ(i, C2188811AlT.LIZIZ(sbLIZ2), r9.requestId);
                    ListProtector.set(r9.items, i, awemeLLILLL);
                    LogPbBean logPbBean = r9.logPb;
                    if (logPbBean != null) {
                        C584850Mwl.LIZ.LJI(r9.requestId, logPbBean);
                    }
                }
                C1360460lVU.LIZIZ.LJJI(r9.items, EnumC1359020lTA.OTHERS, null);
            }
            int i2 = this.mListQueryType;
            if (i2 != 1) {
                if (i2 == 4) {
                    if (r9.items != null) {
                        if (C086I.LIZIZ(((StickerPropAwemeList) this.mData).items)) {
                            ((StickerPropAwemeList) this.mData).items = r9.items;
                        } else {
                            C188700o1.LIZ(((StickerPropAwemeList) this.mData).items, r9.items, new Function2() { // from class: X.00rC
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return Boolean.valueOf(TextUtils.equals(((Aweme) obj2).getAid(), ((Aweme) obj3).getAid()));
                                }
                            });
                        }
                    }
                    if (PluggableExtentionKt.pluggableSpi(IStoryFollowUpPublishService.class) != null && this.mData != 0) {
                        ((IStoryFollowUpPublishService) PluggableExtentionKt.pluggableSpi(IStoryFollowUpPublishService.class)).LIZJ(r9.requestId, ((StickerPropAwemeList) this.mData).items);
                    }
                    StickerPropAwemeList stickerPropAwemeList = (StickerPropAwemeList) this.mData;
                    stickerPropAwemeList.cursor = r9.cursor;
                    stickerPropAwemeList.hasMore = r9.hasMore & stickerPropAwemeList.hasMore;
                }
            } else {
                if (PluggableExtentionKt.pluggableSpi(IStoryFollowUpPublishService.class) != null) {
                    ((IStoryFollowUpPublishService) PluggableExtentionKt.pluggableSpi(IStoryFollowUpPublishService.class)).LIZJ(r9.requestId, r9.items);
                }
                this.mData = r9;
            }
        } else if (r9 != 0 && r9.error_code == 0) {
            this.mData = r9;
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS116S0100000_16(this, 69));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((StickerPropAwemeList) this.mData).cursor;
        }
        LJIIJ(20, ((Integer) objArr[2]).intValue(), this.LLJ, str, j);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        C01GW c01gw = EffectDetailVideoListExperiment.LIZIZ;
        if (((EffectDetailVideoListExperiment.EffectDetailVideoListExperimentConfig) c01gw.getValue()).on) {
            if (C0A13.LIZ()) {
                String str = (String) objArr[1];
                int i = ((EffectDetailVideoListExperiment.EffectDetailVideoListExperimentConfig) c01gw.getValue()).count;
                ((Integer) objArr[2]).intValue();
                LJIIJJI(i, str);
                return;
            }
            LJIIJ(((EffectDetailVideoListExperiment.EffectDetailVideoListExperimentConfig) c01gw.getValue()).count, ((Integer) objArr[2]).intValue(), this.LLJ, (String) objArr[1], 0L);
            return;
        }
        if (C0A13.LIZ()) {
            String str2 = (String) objArr[1];
            ((Integer) objArr[2]).intValue();
            LJIIJJI(20, str2);
        } else {
            LJIIJ(20, ((Integer) objArr[2]).intValue(), this.LLJ, (String) objArr[1], 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList] */
    @Override // X.AbstractC1255880imo
    public final void setItems(List<Aweme> list) {
        if (this.mData == 0) {
            this.mData = new StickerPropAwemeList();
        }
        T t = this.mData;
        ((StickerPropAwemeList) t).hasMore = 1;
        ((StickerPropAwemeList) t).items = list;
    }

    public C116F(String str, int i) {
        this.LLILLJJLI = str;
        this.LL = i;
    }

    public final void LJIIJJI(final int i, final String str) {
        if (C10EU.LJIIIIZZ()) {
            return;
        }
        C116B.LIZLLL(false);
        this.LLILZIL = str;
        this.LLILZ = 0L;
        this.LLIZ = i;
        this.LLJI.LIZ(C11NZ.LJLLILLLL(C11NZ.LJJJJI(new Callable() { // from class: X.116G
            public final /* synthetic */ long LLILLJJLI = 0;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
                /*
                    Method dump skipped, instruction units count: 316
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C116G.call():java.lang.Object");
            }
        }).LJL(C11S5.LIZ()), C11NZ.LJIJJLI(new C581230Mqv(this, str, 0)).LJL(C11S5.LIZ()).LJLJI(((Number) C286200BJq.LIZ.getValue()).longValue(), TimeUnit.MILLISECONDS).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.116J
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return 0;
            }
        }), new InterfaceC500500Jk0() { // from class: X.116K
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                return new Pair(obj, obj2);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS190S0100000_21(this, 15), new AfS138S0000000_16(10)));
    }

    public final void LJIIJ(final int i, int i2, final int i3, final String str, final long j) {
        if (C10EU.LJIIIIZZ()) {
            return;
        }
        if (j == 0) {
            C116B.LIZLLL(false);
        }
        this.LLILZIL = str;
        this.LLILZ = j;
        this.LLIZ = i;
        if (C289350BVt.LIZ() && j == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL);
            sbLIZ.append(str);
            sbLIZ.append(j);
            sbLIZ.append(i);
            StickerPropAwemeList stickerPropAwemeListLIZIZ = C116B.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (stickerPropAwemeListLIZIZ != null) {
                this.LLIZLLLIL = false;
                Message messageObtainMessage = this.mHandler.obtainMessage(0);
                messageObtainMessage.obj = stickerPropAwemeListLIZIZ;
                messageObtainMessage.sendToTarget();
                return;
            }
        }
        C1BVK.LIZIZ().LIZ(this.mHandler, new Callable() { // from class: X.116H
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
                /*
                    Method dump skipped, instruction units count: 270
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C116H.call():java.lang.Object");
            }
        }, 0);
    }
}
