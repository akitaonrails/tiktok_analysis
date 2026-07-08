package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.SubOnlyVideo;
import com.ss.android.ugc.aweme.feed.model.SubOnlyVideoGates;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.live.SubsServiceMainActivityAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.api.sub.ImageConvertResponse;
import webcast.api.sub.SubPriceChangeConfirmRequest;

/* JADX INFO: renamed from: X.0K8K, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K8K implements C0K77 {
    public static final C0K8K LJ = C0K8O.LIZ;
    public final MutableLiveData<List<String>> LIZ = new MutableLiveData<>(C13BV.INSTANCE);
    public final ConcurrentHashMap<LifecycleOwner, C21287018Se> LIZIZ = new ConcurrentHashMap<>();
    public final AtomicLong LIZJ = new AtomicLong(1);
    public final ConcurrentHashMap<Long, C1143920fsE> LIZLLL = new ConcurrentHashMap<>();

    @Override // X.C0K77
    public final C13IQ<? extends AbstractC738140SxQ> LIZJ() {
        return C13LE.LIZ(SubsServiceMainActivityAssem.class);
    }

    @Override // X.C0K77
    public final boolean LJIIJJI() {
        Object c098200Yq;
        try {
            IHostSubscription iHostSubscriptionLJJJLIIL = LJJJLIIL();
            c098200Yq = iHostSubscriptionLJJJLIIL != null ? Boolean.valueOf(iHostSubscriptionLJJJLIIL.l21()) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return Intrinsics.LJFF(C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq, Boolean.TRUE);
    }

    @Override // X.C0K77
    public final boolean Xs() {
        Object c098200Yq;
        try {
            IHostSubscription iHostSubscriptionLJJJLIIL = LJJJLIIL();
            c098200Yq = iHostSubscriptionLJJJLIIL != null ? Boolean.valueOf(iHostSubscriptionLJJJLIIL.Xs()) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return Intrinsics.LJFF(C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq, Boolean.TRUE);
    }

    public static IHostSubscription LJJJLIIL() {
        Object c098200Yq;
        try {
            c098200Yq = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (IHostSubscription) c098200Yq;
    }

    @Override // X.C0K77
    public final boolean LIZ() {
        return ((Boolean) C04W5.LIZ.getValue()).booleanValue();
    }

    @Override // X.C0K77
    public final void LJ() {
        this.LIZ.setValue(C13BV.INSTANCE);
    }

    @Override // X.C0K77
    public final AnonymousClass0951 LJIIJ() {
        C512150K6r.LIZ.getClass();
        return C512150K6r.LIZLLL;
    }

    @Override // X.C0K77
    public final boolean LJJ() {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId() == 1233);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    @Override // X.C0K77
    public final String LJJJJI() {
        Object c098200Yq;
        try {
            c098200Yq = C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (String) (C189200o6.m7isFailureimpl(c098200Yq) ? "tiktok_live_basic_resource" : c098200Yq);
    }

    @Override // X.C0K77
    public final String getWebcastLanguage() {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            try {
                c098200Yq2 = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale();
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            c098200Yq = C2273311DyT.LIZ((Locale) c098200Yq2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = "en";
        }
        return (String) c098200Yq;
    }

    @Override // X.C0K77
    public final MutableLiveData LJIILJJIL() {
        return this.LIZ;
    }

    @Override // X.C0K77
    public final void LIZLLL(HashMap<String, Object> map) {
        Unit unit;
        try {
            C0K8M rechargeMonitor = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeMonitor();
            if (rechargeMonitor != null) {
                rechargeMonitor.LIZLLL(map);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.C0K77
    public final boolean LJII(JSONObject jSONObject) {
        Object c098200Yq;
        try {
            C389001fE.LIZ("user_subscribe_success", jSONObject, System.currentTimeMillis(), false);
            c098200Yq = Boolean.TRUE;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    @Override // X.C0K77
    public final String LJIIIIZZ(String str) {
        boolean z;
        Object c098200Yq;
        C470590Icr<ImageConvertResponse.Data> c470590Icr;
        ImageConvertResponse.Data data;
        List<ImageConvertResponse.Images> list;
        ImageConvertResponse.Images images;
        List<String> list2;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            C480460Ism.LIZ().getClass();
            C0X52<C470590Icr<ImageConvertResponse.Data>> c0x52Execute = ((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).subImageConvert(str).execute();
            if (c0x52Execute.LIZJ() && (c470590Icr = c0x52Execute.LIZIZ) != null && (data = c470590Icr.data) != null && (list = data.images) != null && (images = (ImageConvertResponse.Images) C13LP.LJJJLZIJ(0, list)) != null && (list2 = images.url) != null) {
                c098200Yq = (String) C13LP.LJJJLZIJ(0, list2);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    @Override // X.C0K77
    public final void LJIIL(AFwS193S0000000_7 aFwS193S0000000_7) {
        Unit unit;
        try {
            IHostSubscription iHostSubscriptionLJJJLIIL = LJJJLIIL();
            if (iHostSubscriptionLJJJLIIL != null) {
                iHostSubscriptionLJJJLIIL.v72(aFwS193S0000000_7);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.C0K77
    public final boolean LJIILL(Aweme aweme) {
        boolean z;
        StandardBusinessModel standardBusinessModel;
        CMPreviewInfo cmPreviewInfo;
        if (((Boolean) C261090ALb.LIZ.getValue()).booleanValue() || (aweme != null && aweme.getAwemeType() == 0)) {
            z = true;
        } else {
            z = false;
        }
        if (LJIJJ(aweme) && z) {
            if (aweme != null) {
                if (!aweme.getIsTikTokStory()) {
                    ContentModel contentModel = aweme.getContentModel();
                    if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel.getCmPreviewInfo()) != null && Intrinsics.LJFF(cmPreviewInfo.getShouldShowPreview(), Boolean.TRUE)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.C0K77
    public final void LJIIZILJ(String str) {
        Object c098200Yq;
        Uri uri;
        if (str != null) {
            try {
                c098200Yq = UriProtector.parse(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            uri = (Uri) c098200Yq;
        } else {
            uri = null;
        }
        try {
            C0K74.LIZIZ(uri, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    @Override // X.C0K77
    public final String LJIJ(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                return "unknown";
            }
            if (num.intValue() == 1) {
                return "subscribed_not_expired";
            }
            if (num.intValue() == 2) {
                return "subscribed_expired_grace_period";
            }
            if (num.intValue() == 3) {
                return "not_subscribed";
            }
            return null;
        }
        return null;
    }

    @Override // X.C0K77
    public final boolean LJIJJ(Aweme aweme) {
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        SubOnlyVideo subOnlyVideo;
        User author;
        if (aweme != null && aweme.isSubOnlyVideo() && (contentModel = aweme.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) != null && Intrinsics.LJFF(subOnlyVideo.getShouldShowPaywall(), Boolean.TRUE)) {
            if (aweme != null) {
                author = aweme.getAuthor();
            } else {
                author = null;
            }
            if (!LJJI(author)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C0K77
    public final void LJIJJLI(HashMap<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            C0K8M rechargeMonitor = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeMonitor();
            Unit unit = null;
            if (rechargeMonitor != null) {
                rechargeMonitor.LJ(null, map);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.C0K77
    public final boolean LJIL(Aweme aweme) {
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        SubOnlyVideo subOnlyVideo;
        ContentModel contentModel2;
        StandardBusinessModel standardBusinessModel2;
        CMPreviewInfo cmPreviewInfo;
        if (aweme != null && aweme.isSubOnlyVideo() && (contentModel = aweme.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) != null && Intrinsics.LJFF(subOnlyVideo.getShouldShowPaywall(), Boolean.TRUE) && (contentModel2 = aweme.getContentModel()) != null && (standardBusinessModel2 = contentModel2.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel2.getCmPreviewInfo()) != null && Intrinsics.LJFF(cmPreviewInfo.getShouldShowPreview(), Boolean.TRUE) && LJJI(aweme.getAuthor())) {
            return true;
        }
        return false;
    }

    @Override // X.C0K77
    public final boolean LJJI(User user) {
        List<String> value;
        String secUid;
        if (C296970BkV.LIZ()) {
            if (user != null && (secUid = user.getSecUid()) != null) {
                C512150K6r.LIZ.getClass();
                if (C512150K6r.LIZIZ.contains(secUid)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (user != null && (value = this.LIZ.getValue()) != null && !value.isEmpty()) {
            Iterator<String> it2 = value.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), user.getSecUid()) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
            if (i > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C0K77
    public final void LJJIFFI(AFwS193S0000000_7 aFwS193S0000000_7) {
        Unit unit;
        try {
            IHostSubscription iHostSubscriptionLJJJLIIL = LJJJLIIL();
            if (iHostSubscriptionLJJJLIIL != null) {
                iHostSubscriptionLJJJLIIL.Ca0(aFwS193S0000000_7);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.C0K77
    public final void LJJII(C512220K6y c512220K6y) {
        MutableLiveData<List<String>> mutableLiveData = this.LIZ;
        List<String> value = mutableLiveData.getValue();
        if (value == null) {
            value = C13BV.INSTANCE;
        }
        mutableLiveData.setValue(C13LP.LJLILLLLZI(c512220K6y.LJFF, value));
    }

    @Override // X.C0K77
    public final Drawable LJJIIJZLJL(String str) {
        Object c098200Yq;
        try {
            c098200Yq = C1143680frq.LIZ("tiktok_live_subscription_demand_1", str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Drawable) c098200Yq;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003c A[PHI: r2
      0x003c: PHI (r2v1 boolean) = (r2v0 boolean), (r2v4 boolean), (r2v4 boolean), (r2v4 boolean) binds: [B:23:0x0039, B:10:0x0013, B:12:0x0017, B:14:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0K77
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIIZI(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L5
            r5.getAid()
        L5:
            r3 = 1
            if (r5 == 0) goto L38
            boolean r0 = r5.getIsTikTokStory()
            if (r0 != r3) goto L38
            r2 = 1
        Lf:
            com.ss.android.ugc.aweme.feed.model.ContentModel r0 = r5.getContentModel()
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.feed.model.StandardBusinessModel r0 = r0.standardBusinessModel
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.feed.model.SubOnlyVideo r0 = r0.getSubOnlyVideo()
            if (r0 == 0) goto L3c
            java.lang.Boolean r1 = r0.getShouldShowPaywall()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        L29:
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.getAuthor()
        L2d:
            boolean r0 = r4.LJJI(r0)
            if (r2 == 0) goto L41
            if (r1 == 0) goto L41
            if (r0 == 0) goto L41
            return r3
        L38:
            r2 = 0
            if (r5 == 0) goto L3c
            goto Lf
        L3c:
            r1 = 0
            if (r5 != 0) goto L29
            r0 = 0
            goto L2d
        L41:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0K8K.LJJIIZI(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // X.C0K77
    public final void LJJIJ(long j) {
        C1143920fsE c1143920fsERemove = this.LIZLLL.remove(Long.valueOf(j));
        if (c1143920fsERemove != null) {
            c1143920fsERemove.LIZ();
        }
    }

    @Override // X.C0K77
    public final boolean LJJIJIIJIL(Aweme aweme) {
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        SubOnlyVideo subOnlyVideo;
        ContentModel contentModel2;
        StandardBusinessModel standardBusinessModel2;
        SubOnlyVideo subOnlyVideo2;
        SubOnlyVideoGates subOnlyVideoGates;
        if (aweme != null && aweme.isSubOnlyVideo() && (contentModel = aweme.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) != null && Intrinsics.LJFF(subOnlyVideo.getShouldShowPaywall(), Boolean.TRUE) && LJJI(aweme.getAuthor()) && (contentModel2 = aweme.getContentModel()) != null && (standardBusinessModel2 = contentModel2.standardBusinessModel) != null && (subOnlyVideo2 = standardBusinessModel2.getSubOnlyVideo()) != null && (subOnlyVideoGates = subOnlyVideo2.getSubOnlyVideoGates()) != null && Intrinsics.LJFF(subOnlyVideoGates.isSovUrllessEnabled(), Boolean.TRUE)) {
            Video video = aweme.getVideo();
            if (video == null || video.getPlayAddr() == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C0K77
    public final void LJJIJL(Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unsubscribeSubscriptionSuccessWithData owner=");
        sbLIZ.append(obj.getClass().getSimpleName());
        C20441214yg.LJIIIZ("SubscriptionService", C2188811AlT.LIZIZ(sbLIZ));
        DataChannelGlobal.LLILZ.zQ2(obj);
    }

    @Override // X.C0K77
    public final void LJJJ(LifecycleOwner lifecycleOwner) {
        DataChannelGlobal.LLILZ.zQ2(lifecycleOwner);
        C21287018Se c21287018SeRemove = this.LIZIZ.remove(lifecycleOwner);
        if (c21287018SeRemove != null) {
            c21287018SeRemove.LIZ();
        }
    }

    @Override // X.C0K77
    public final boolean LJJJI(String str) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C1819620xS4.LIZJ(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    @Override // X.C0K77
    public final void LJJJIL(View view) {
        C0KVZ c0kvz;
        if ((view instanceof C0KVZ) && (c0kvz = (C0KVZ) view) != null) {
            c0kvz.LIZLLL();
        }
    }

    @Override // X.C0K77
    public final void LJJJJL(String str) {
        Object c098200Yq;
        Uri uri;
        Object c098200Yq2;
        if (str != null) {
            try {
                c098200Yq = UriProtector.parse(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            uri = (Uri) c098200Yq;
        } else {
            uri = null;
        }
        try {
            c098200Yq2 = EnumC490130JJz.valueOf("MISSING_COMPULSORY_PARAM");
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        try {
            C0K74.LIZ((EnumC490130JJz) c098200Yq2, uri, null, "");
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
        }
    }

    @Override // X.C0K77
    public final boolean LJJJJLI(Aweme aweme) {
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        SubOnlyVideo subOnlyVideo;
        ContentModel contentModel2;
        StandardBusinessModel standardBusinessModel2;
        CMPreviewInfo cmPreviewInfo;
        User author;
        if (aweme != null && aweme.isSubOnlyVideo() && (contentModel = aweme.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) != null && Intrinsics.LJFF(subOnlyVideo.getShouldShowPaywall(), Boolean.TRUE) && aweme != null && (contentModel2 = aweme.getContentModel()) != null && (standardBusinessModel2 = contentModel2.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel2.getCmPreviewInfo()) != null && Intrinsics.LJFF(cmPreviewInfo.getShouldShowPreview(), Boolean.TRUE)) {
            if (aweme != null) {
                author = aweme.getAuthor();
            } else {
                author = null;
            }
            if (!LJJI(author)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C0K77
    public final boolean LJJJJLL(Aweme aweme) {
        if (!LJIJJ(aweme) || aweme == null || aweme.getAwemeType() != 150 || aweme.getIsTikTokStory()) {
            return false;
        }
        return true;
    }

    @Override // X.C0K77
    public final String LJJJJZ(String str) {
        Object obj;
        boolean z;
        Object obj2 = null;
        try {
            String strLJIIJ = C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_5", str);
            if (strLJIIJ.length() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                strLJIIJ = null;
            }
            C189200o6.m2constructorimpl(strLJIIJ);
            obj = strLJIIJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (String) obj2;
    }

    @Override // X.C0K77
    public final boolean LJJJJZI(Aweme aweme) {
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        SubOnlyVideo subOnlyVideo;
        if (aweme != null && aweme.isSubOnlyVideo() && (contentModel = aweme.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) != null && Intrinsics.LJFF(subOnlyVideo.getShouldShowPaywall(), Boolean.TRUE) && LJJI(aweme.getAuthor())) {
            return true;
        }
        return false;
    }

    @Override // X.C0K77
    public final void LJIILLIIL(int i, View view) {
        C0KVZ c0kvz;
        if ((view instanceof C0KVZ) && (c0kvz = (C0KVZ) view) != null) {
            c0kvz.LLILZIL = i;
            C500260Jjc.LJJZ(i, c0kvz);
        }
    }

    @Override // X.C0K77
    public final void LJJIII(View view, Boolean bool) {
        C0KVZ c0kvz;
        boolean zBooleanValue;
        if ((view instanceof C0KVZ) && (c0kvz = (C0KVZ) view) != null) {
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = true;
            }
            c0kvz.LLILZLL = zBooleanValue;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    @Override // X.C0K77
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJIIZ(java.lang.String r16, byte[] r17) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0K8K.LJJIIZ(java.lang.String, byte[]):java.lang.String");
    }

    @Override // X.C0K77
    public final void LJJIJIIJI(Object obj, InterfaceC1631630sYr<? super String, ? super String, ? super Boolean, ? super Map<String, String>, Unit> interfaceC1631630sYr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeSubscriptionSuccessWithData register owner=");
        sbLIZ.append(obj.getClass().getSimpleName());
        C20441214yg.LJIIIZ("SubscriptionService", C2188811AlT.LIZIZ(sbLIZ));
        DataChannelGlobal.LLILZ.CQ2(SubscribeSuccessEvent.class, obj, new AwS586S0100000_7(interfaceC1631630sYr, (InterfaceC1631630sYr<? super String, ? super String, ? super Boolean, ? super Map<String, String>, Unit>) 238));
    }

    @Override // X.C0K77
    public final void LJJIJIL(LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
        C21287018Se c21287018SeCp1 = this.LIZIZ.get(lifecycleOwner);
        if (c21287018SeCp1 == null) {
            ISubscriptionStatusService.LJIIIZ.getClass();
            c21287018SeCp1 = C0K9Q.LIZ().cp1(lifecycleOwner, lifecycleOwner);
            this.LIZIZ.put(lifecycleOwner, c21287018SeCp1);
        }
        c21287018SeCp1.LIZIZ(lifecycleOwner, new AwS586S0100000_7(function0, (Function0<Unit>) 237));
    }

    @Override // X.C0K77
    public final String LJJIJLIJ(String str, String str2) {
        Object c098200Yq;
        boolean z;
        try {
            c098200Yq = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getTTDisPlayName(str, str2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str3 = (String) c098200Yq;
        if (str3 == null) {
            str3 = "";
        }
        if (str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str3;
        }
        return str;
    }

    @Override // X.C0K77
    public final boolean ch(Fragment fragment, String str) {
        Object c098200Yq;
        try {
            IHostSubscription iHostSubscriptionLJJJLIIL = LJJJLIIL();
            if (iHostSubscriptionLJJJLIIL != null) {
                iHostSubscriptionLJJJLIIL.ch(fragment, str);
            }
            c098200Yq = Boolean.TRUE;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    @Override // X.C0K77
    public final void LIZIZ(int i, String str, HashMap<String, Object> map) {
        Unit unit;
        try {
            C0K8M rechargeMonitor = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeMonitor();
            if (rechargeMonitor != null) {
                rechargeMonitor.LIZIZ(i, str, map);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.C0K77
    public final View LJIJI(Context context, AttributeSet attributeSet, int i) {
        Object c098200Yq;
        try {
            c098200Yq = new C0KVZ(context, attributeSet, i);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (View) c098200Yq;
    }

    @Override // X.C0K77
    public final boolean LJIIIZ(Context context, String str, boolean z, Integer num) {
        Object c098200Yq;
        C760370TsB c760370TsBLIZ;
        if (context == null) {
            return false;
        }
        try {
            if (z) {
                c760370TsBLIZ = C0KYL.LIZJ(str);
            } else {
                c760370TsBLIZ = C0KYL.LIZ(str);
            }
            c760370TsBLIZ.LJIIIIZZ("bottom");
            c760370TsBLIZ.LJIJI(8, EnumC760350Ts9.DP);
            c760370TsBLIZ.LJIJJLI("bottom");
            ((HashMap) c760370TsBLIZ.LIZ).put("show_mask", "1");
            ((HashMap) c760370TsBLIZ.LIZ).put("mask_bg_color", "0000007F");
            if (num != null && num.intValue() >= 0) {
                c760370TsBLIZ.LJIIIZ((int) (num.intValue() / context.getResources().getDisplayMetrics().density), EnumC760350Ts9.DP);
            }
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZ.LIZLLL().toString(), null);
            c098200Yq = Boolean.TRUE;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    @Override // X.C0K77
    public final void LJIILIIL(Context context, String str, long j, String str2) {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            try {
                c098200Yq = (IHostSetting) C1161920gLG.LIZJ(IHostSetting.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            c098200Yq2 = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            IHostSetting iHostSetting = (IHostSetting) c098200Yq;
            if (iHostSetting != null) {
                iHostSetting.nB2(context, str, j, str2);
                c098200Yq2 = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openSubsInnerFeed failed, enterFrom=");
            sbLIZ.append("sub_privilege_page");
            C20441214yg.LJFF("SubscriptionService", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
        }
    }

    @Override // X.C0K77
    public final void LJJIIJ(int i, long j, String str, String str2) {
        Unit unit;
        try {
            C0K8M rechargeMonitor = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeMonitor();
            if (rechargeMonitor != null) {
                rechargeMonitor.LJFF(i, "", j, str, str2, true);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.C0K77
    public final boolean LJJJJ(View view, String str, InterfaceC511480K4c interfaceC511480K4c, boolean z) {
        Object c098200Yq;
        try {
            C1143680frq.LJI(view, str, interfaceC511480K4c, z);
            c098200Yq = Boolean.TRUE;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    @Override // X.C0K77
    public final boolean LJJIL(View view, String str, String str2, ImageView.ScaleType scaleType, InterfaceC511480K4c interfaceC511480K4c) {
        Object c098200Yq;
        try {
            C1143680frq.LJFF(view, str, str2, scaleType, interfaceC511480K4c);
            c098200Yq = Boolean.TRUE;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    @Override // X.C0K77
    public final void LJI(View view, List list, com.bytedance.android.live.base.model.user.User user, Function0 function0, Function1 function1, boolean z) {
        C0KVZ c0kvz;
        if ((view instanceof C0KVZ) && (c0kvz = (C0KVZ) view) != null) {
            c0kvz.LJ(false, list, user, 10, function0, function1, z);
        }
    }

    @Override // X.C0K77
    public final Fragment LJJIZ(boolean z, long j, String str, Boolean bool, AFwS237S0000000_7 aFwS237S0000000_7, SubOnlyVideoOpenParams subOnlyVideoOpenParams, Function0 function0) {
        Object c098200Yq;
        Object obj = null;
        try {
            IHostSubscription iHostSubscriptionLJJJLIIL = LJJJLIIL();
            if (iHostSubscriptionLJJJLIIL != null) {
                c098200Yq = iHostSubscriptionLJJJLIIL.wt1(z, null, j, str, "subscription_privilege_page", "privilege_page_sov_section", bool, aFwS237S0000000_7, subOnlyVideoOpenParams, function0);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Fragment fragment = (Fragment) obj;
        if (fragment == null) {
            return new Fragment();
        }
        return fragment;
    }

    @Override // X.C0K77
    public final long LJJJJIZL(View view, String str, String str2, boolean z, boolean z2, int i, final Function1<? super Animatable, Unit> function1) {
        C1322110kVd c1322110kVd;
        if (view instanceof C1322110kVd) {
            c1322110kVd = (C1322110kVd) view;
        } else {
            c1322110kVd = null;
        }
        if (c1322110kVd == null || str == null || str2 == null) {
            return 0L;
        }
        final long andIncrement = this.LIZJ.getAndIncrement();
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LIZ = c1322110kVd;
        c1143920fsE.LIZIZ = str;
        c1143920fsE.LIZJ = str2;
        c1143920fsE.LJFF = z;
        c1143920fsE.LJIIJJI = z2;
        c1143920fsE.LJI = i;
        c1143920fsE.LJ = new C1143950fsH() { // from class: X.0K8L
            @Override // X.C1143950fsH
            public final void LIZIZ(Throwable th) {
                this.LIZ.LIZLLL.remove(Long.valueOf(andIncrement));
            }

            @Override // X.C1143950fsH
            public final void LJFF(Animatable animatable) {
                this.LIZ.LIZLLL.remove(Long.valueOf(andIncrement));
                Function1<Animatable, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(animatable);
                }
            }
        };
        this.LIZLLL.put(Long.valueOf(andIncrement), c1143920fsE);
        c1143920fsE.LIZLLL();
        return andIncrement;
    }

    @Override // X.C0K77
    public final boolean LJFF(C19EG c19eg, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C0K75 c0k75) {
        Object c098200Yq;
        Object c098200Yq2;
        boolean z;
        try {
            try {
                c098200Yq = (IHostShare) C1161920gLG.LIZJ(IHostShare.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            IHostShare iHostShare = (IHostShare) c098200Yq;
            if (iHostShare == null) {
                z = false;
            } else {
                C1106200etO c1106200etO = new C1106200etO();
                C518420KUu.LIZ(c1106200etO, str, str2, str3, str4, "www.tiktok.com", str5, str6, str7, null, null, null, null, null, str8, null, 786176);
                iHostShare.shareSubscribeLink(c19eg, new C1106210etP(c1106200etO), c0k75);
                z = true;
            }
            c098200Yq2 = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = bool;
        }
        return ((Boolean) c098200Yq2).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    @Override // X.C0K77
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJJJJ(android.view.View r8, java.lang.Object r9, java.util.List r10, java.lang.Integer r11, java.lang.Integer r12, android.widget.ImageView.ScaleType r13, java.lang.Boolean r14, java.lang.Boolean r15, java.lang.Float r16, boolean r17, X.C0K42 r18) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0K8K.LJJJJJ(android.view.View, java.lang.Object, java.util.List, java.lang.Integer, java.lang.Integer, android.widget.ImageView$ScaleType, java.lang.Boolean, java.lang.Boolean, java.lang.Float, boolean, X.0K42):boolean");
    }

    @Override // X.C0K77
    public final Fragment LJJJJJL(Context context, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, Function0<Unit> function0, Function0<Unit> function02, SubPriceChangeConfirmRequest subPriceChangeConfirmRequest, String str8) {
        Object c098200Yq;
        Function0<Unit> function03 = function02;
        Function0<Unit> function04 = function0;
        try {
            if (function04 == null) {
                function04 = AFwS193S0000000_7.get$arr$(146);
            }
            if (function03 == null) {
                function03 = AFwS193S0000000_7.get$arr$(147);
            }
            c098200Yq = Live.getService().LJJIJIIJIL(context, new C0K8N(z, str, str2, str3, str4, str5, str6, str7, function04, function03), subPriceChangeConfirmRequest, str8);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Fragment) c098200Yq;
    }
}
