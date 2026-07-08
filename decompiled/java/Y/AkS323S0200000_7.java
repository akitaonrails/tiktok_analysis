package Y;

import X.C0ISJ;
import X.C0ITM;
import X.C0ITQ;
import X.C0ITR;
import X.C0KZK;
import X.C0KZP;
import X.C118300cf;
import X.C11NZ;
import X.C2188811AlT;
import X.C466790ISf;
import X.C512240K7a;
import X.C517301zv;
import X.C842240X2g;
import X.InterfaceC1487280oo2;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Pair;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.impl.revenue.enigma.EnigmaService;
import com.bytedance.android.livesdk.livesetting.privilege.LiveEnigmaToggleTimeoutSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.setting.LoadMoreRetrySetting;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public class AkS323S0200000_7 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return apply$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return apply$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return apply$11(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS323S0200000_7 akS323S0200000_7, Object obj) {
        Throwable th = (Throwable) obj;
        if (!(th instanceof C0KZK)) {
            EnigmaService enigmaService = (EnigmaService) akS323S0200000_7.l0;
            C11NZ c11nz = (C11NZ) akS323S0200000_7.l1;
            C0KZP c0kzp = new C0KZP((EnigmaService) akS323S0200000_7.l0);
            enigmaService.getClass();
            return c11nz.LJJLIIIJLJLI(new AkS7S0101100_7(c0kzp, 0)).LJJL(new C517301zv(th, 2)).LJLJI(((long) LiveEnigmaToggleTimeoutSetting.INSTANCE.getValue()) / ((long) 3), TimeUnit.SECONDS).LJJL(new C517301zv(th, 3)).LJJJ(new C517301zv(th, 4), false);
        }
        return C11NZ.LJJIJLIJ(th);
    }

    public static final Object apply$1(AkS323S0200000_7 akS323S0200000_7, Object obj) {
        C118300cf c118300cf = (C118300cf) akS323S0200000_7.l0;
        int i = c118300cf.element;
        if (i >= 0) {
            long[] jArr = (long[]) akS323S0200000_7.l1;
            if (i < jArr.length) {
                int i2 = i + 1;
                c118300cf.element = i2;
                return C11NZ.LJJJJZ(obj).LJJI(jArr[i2 - 1], TimeUnit.MILLISECONDS);
            }
        }
        return C11NZ.LJJIJLIJ(new Throwable("retry reaches maximum"));
    }

    public static final Object apply$10(AkS323S0200000_7 akS323S0200000_7, Object obj) {
        boolean z;
        EmoteModel emoteModel = (EmoteModel) akS323S0200000_7.l0;
        emoteModel.emoteResource = new BitmapDrawable((Resources) akS323S0200000_7.l1, (Bitmap) obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has bitmap = ");
        if (emoteModel.emoteResource != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" --- ");
        sbLIZ.append(emoteModel.emoteId);
        sbLIZ.append(" = ");
        sbLIZ.append((String) ListProtector.get(C842240X2g.LIZ(emoteModel.image), 0));
        Logger.i("sticker_lyp", C2188811AlT.LIZIZ(sbLIZ));
        return emoteModel;
    }

    public static final Object apply$11(AkS323S0200000_7 akS323S0200000_7, Object obj) {
        EmoteModel emoteModel = (EmoteModel) akS323S0200000_7.l0;
        emoteModel.emoteResource = new BitmapDrawable((Resources) akS323S0200000_7.l1, (Bitmap) obj);
        return emoteModel;
    }

    public static final Object apply$2(AkS323S0200000_7 akS323S0200000_7, Object obj) {
        return ((C11NZ) obj).LJJJ(new AkS323S0200000_7((C118300cf) akS323S0200000_7.l0, (long[]) akS323S0200000_7.l1, 1), false);
    }

    public static final Object apply$3(AkS323S0200000_7 akS323S0200000_7, Object obj) {
        Throwable th = (Throwable) obj;
        if ((th instanceof TimeoutException) || C512240K7a.LIZ(th) == -199) {
            int iIncrementAndGet = ((C0ISJ) akS323S0200000_7.l0).LLLLJI.incrementAndGet();
            LoadMoreRetrySetting loadMoreRetrySetting = LoadMoreRetrySetting.INSTANCE;
            if (iIncrementAndGet <= loadMoreRetrySetting.retryCount() && TTNetInit.getEffectiveConnectionType() >= loadMoreRetrySetting.minNetworkQuality()) {
                if (loadMoreRetrySetting.expandParams()) {
                    ((HashMap) akS323S0200000_7.l1).put("retry_count", String.valueOf(((C0ISJ) akS323S0200000_7.l0).LLLLJI.get()));
                    ((HashMap) akS323S0200000_7.l1).put("network_quality", String.valueOf(TTNetInit.getEffectiveConnectionType()));
                }
                return C11NZ.LJLJJLL(((long) ((C0ISJ) akS323S0200000_7.l0).LLLLJI.get()) * loadMoreRetrySetting.retryInterval(), TimeUnit.MILLISECONDS);
            }
        }
        return C11NZ.LJJIJLIJ(th);
    }

    public static final Object apply$4(AkS323S0200000_7 akS323S0200000_7, Object obj) {
        return ((C11NZ) obj).LJJJ(new AkS323S0200000_7((C0ISJ) akS323S0200000_7.l0, (HashMap) akS323S0200000_7.l1, 3), false);
    }

    public static final Object apply$5(AkS323S0200000_7 akS323S0200000_7, Object obj) {
        C118300cf c118300cf = (C118300cf) akS323S0200000_7.l0;
        int i = c118300cf.element;
        if (i < 1) {
            c118300cf.element = i + 1;
            return C11NZ.LJJJJZ((C11NZ) akS323S0200000_7.l1).LJJI(500L, TimeUnit.MILLISECONDS);
        }
        return (C11NZ) akS323S0200000_7.l1;
    }

    public static final Object apply$6(AkS323S0200000_7 akS323S0200000_7, Object obj) {
        BaseListResponse<FeedItem, FeedExtra> baseListResponse = (BaseListResponse) obj;
        ((C0ITQ) akS323S0200000_7.l0).LJI(baseListResponse);
        if (baseListResponse.data != null && (!r0.isEmpty())) {
            C0ITQ c0itq = (C0ITQ) akS323S0200000_7.l0;
            if (c0itq.LIZ) {
                c0itq.LIZ = false;
            }
        }
        ArrayList arrayList = new ArrayList();
        List<FeedItem> list = baseListResponse.data;
        if (list != null) {
            arrayList.addAll(list);
        }
        return new C0ITM(Pair.create(arrayList, baseListResponse.extra), baseListResponse.LIZIZ, baseListResponse.LIZJ, baseListResponse.LIZLLL, "draw", ((C466790ISf) akS323S0200000_7.l1).LIZ);
    }

    public static final Object apply$7(AkS323S0200000_7 akS323S0200000_7, Object obj) {
        BaseListResponse<FeedItem, FeedExtra> baseListResponse = (BaseListResponse) obj;
        ((C0ITQ) akS323S0200000_7.l0).LJI(baseListResponse);
        if (baseListResponse.data != null && (!r0.isEmpty())) {
            C0ITQ c0itq = (C0ITQ) akS323S0200000_7.l0;
            if (c0itq.LIZIZ) {
                c0itq.LIZIZ = false;
            }
        }
        ArrayList arrayList = new ArrayList();
        List<FeedItem> list = baseListResponse.data;
        if (list != null) {
            arrayList.addAll(list);
        }
        return new C0ITM(Pair.create(arrayList, baseListResponse.extra), baseListResponse.LIZIZ, baseListResponse.LIZJ, baseListResponse.LIZLLL, "draw", ((C466790ISf) akS323S0200000_7.l1).LIZ);
    }

    public static final Object apply$8(AkS323S0200000_7 akS323S0200000_7, Object obj) {
        BaseListResponse<FeedItem, FeedExtra> baseListResponse = (BaseListResponse) obj;
        ((C0ITR) akS323S0200000_7.l0).LJI(baseListResponse);
        if (baseListResponse.data != null && (!r0.isEmpty())) {
            C0ITR c0itr = (C0ITR) akS323S0200000_7.l0;
            if (c0itr.LIZ) {
                c0itr.LIZ = false;
            }
        }
        ArrayList arrayList = new ArrayList();
        List<FeedItem> list = baseListResponse.data;
        if (list != null) {
            arrayList.addAll(list);
        }
        return new C0ITM(Pair.create(arrayList, baseListResponse.extra), baseListResponse.LIZIZ, baseListResponse.LIZJ, baseListResponse.LIZLLL, "draw", ((C466790ISf) akS323S0200000_7.l1).LIZ);
    }

    public static final Object apply$9(AkS323S0200000_7 akS323S0200000_7, Object obj) {
        BaseListResponse<FeedItem, FeedExtra> baseListResponse = (BaseListResponse) obj;
        ((C0ITR) akS323S0200000_7.l0).LJI(baseListResponse);
        if (baseListResponse.data != null && (!r0.isEmpty())) {
            C0ITR c0itr = (C0ITR) akS323S0200000_7.l0;
            if (c0itr.LIZ) {
                c0itr.LIZ = false;
            }
        }
        ArrayList arrayList = new ArrayList();
        List<FeedItem> list = baseListResponse.data;
        if (list != null) {
            arrayList.addAll(list);
        }
        return new C0ITM(Pair.create(arrayList, baseListResponse.extra), baseListResponse.LIZIZ, baseListResponse.LIZJ, baseListResponse.LIZLLL, "draw", ((C466790ISf) akS323S0200000_7.l1).LIZ);
    }

    public AkS323S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public AkS323S0200000_7(EmoteModel emoteModel, EmoteModel emoteModel2, Resources resources, int i) {
        this.$t = i;
        this.l0 = emoteModel;
        this.l1 = resources;
    }

    public AkS323S0200000_7(String str, C118300cf c118300cf, long[] jArr, C118300cf c118300cf2, int i) {
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = jArr;
    }
}
