package Y;

import X.C0N9H;
import X.C0NIZ;
import X.C0O35;
import X.C0O38;
import X.C0RJN;
import X.C1480290ocl;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1510130pOt;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19319410i8;
import X.C1C7U;
import X.C20013313Sh;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C309390CAv;
import X.C606500Nqa;
import X.C612230Nzp;
import X.C690870R8b;
import X.C704830Rkn;
import X.InterfaceC588340N5s;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.otis.perf.monitor.message.MessageMonitorManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.cache.CacheResponse;
import com.ss.android.ugc.aweme.music.ui.IMDPMobAbility;
import com.ss.android.ugc.aweme.music.ui.MDPSquareShowMoreViewHolder;
import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeSwitchComponent;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS14S1200000_9 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    public static final void run$1(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        PlayerController.LLIIL((PlayerController) aRunnableS14S1200000_9.l1, aRunnableS14S1200000_9.s0, (C1480430ocz) aRunnableS14S1200000_9.l2);
    }

    public static final void run$14(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        MessageMonitorManager.m139lambda$semisugar$endMonitor$lambda2$0((C0N9H) aRunnableS14S1200000_9.l1, aRunnableS14S1200000_9.s0, (Set) aRunnableS14S1200000_9.l2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() throws JSONException {
        Function0<C690870R8b> function0;
        C690870R8b c690870R8bInvoke;
        C0RJN c0rjnLIZIZ;
        Map map = (Map) this.l1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!Intrinsics.LJFF(entry.getKey(), "btm")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        String strLIZIZ = C309390CAv.LIZIZ(linkedHashMap);
        Fragment fragment = null;
        JSONObject jSONObject = strLIZIZ != null ? new JSONObject(strLIZIZ) : null;
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        Object obj = ((Map) this.l1).get("btm");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String strValueOf = String.valueOf(obj);
        C704830Rkn c704830Rkn = (C704830Rkn) this.l2;
        if (c704830Rkn != null && (function0 = c704830Rkn.LIZ) != null && (c690870R8bInvoke = function0.invoke()) != null && (c0rjnLIZIZ = c690870R8bInvoke.LIZIZ()) != null) {
            fragment = c0rjnLIZIZ.LJ;
        }
        Map mapCreateReportParams$default = BtmSDK.createReportParams$default(btmSDK, strValueOf, PageFinder.via(fragment), null, 4, null);
        if (jSONObject != null) {
            jSONObject.put("btm", mapCreateReportParams$default);
        }
        C20684815ws.LJIJ(this.s0, jSONObject);
    }

    public final void LIZ$1() {
        View view;
        View view2;
        View view3 = (View) this.l1;
        if (view3 == null || view3.getParent() == null || (view = (View) this.l1) == null || !view.getGlobalVisibleRect(new Rect()) || (view2 = (View) this.l1) == null || view2.getVisibility() != 0) {
            return;
        }
        MDPSquareShowMoreViewHolder mDPSquareShowMoreViewHolder = (MDPSquareShowMoreViewHolder) this.l2;
        String str = this.s0;
        View view4 = mDPSquareShowMoreViewHolder.itemView;
        IMDPMobAbility iMDPMobAbility = view4 != null ? (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view4, null), IMDPMobAbility.class, null) : null;
        if (!Intrinsics.LJFF(mDPSquareShowMoreViewHolder.LLIZLLLIL, str) && iMDPMobAbility != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show_more_in_mdp");
            sbLIZ.append(str);
            if (!iMDPMobAbility.G92(C2188811AlT.LIZIZ(sbLIZ))) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("show_more_in_mdp");
                sbLIZ2.append(str);
                iMDPMobAbility.zb1(C2188811AlT.LIZIZ(sbLIZ2));
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("music_id", iMDPMobAbility != null ? iMDPMobAbility.KZ1() : null);
                C20684815ws.LJIILLIIL("show_more_in_mdp", c2344009Gk.LIZ);
            }
        }
        mDPSquareShowMoreViewHolder.LLIZLLLIL = str;
    }

    public final void LIZ$2() {
        List<Aweme> items;
        List<Aweme> items2;
        try {
            DataLayerAbility dataLayerAbility = (DataLayerAbility) ((OfflineModeSwitchComponent) this.l1).LLILZLL.getValue();
            if (dataLayerAbility == null || (items = dataLayerAbility.getItems()) == null || !(!items.isEmpty())) {
                return;
            }
            List list = (List) this.l2;
            OfflineModeSwitchComponent offlineModeSwitchComponent = (OfflineModeSwitchComponent) this.l1;
            String str = this.s0;
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : items) {
                Aweme aweme2 = aweme;
                if (list.contains(aweme2.getAid()) && C0NIZ.LIZIZ(aweme2)) {
                    arrayList.add(aweme);
                }
            }
            if (!arrayList.isEmpty()) {
                DataLayerAbility dataLayerAbility2 = (DataLayerAbility) offlineModeSwitchComponent.LLILZLL.getValue();
                if (dataLayerAbility2 != null) {
                    dataLayerAbility2.KO1(arrayList, C606500Nqa.LIZLLL);
                }
                C19319410i8 c19319410i8 = OfflineModeSwitchComponent.LLJLLIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onInvalidRecordsDeleted: deleted ");
                sbLIZ.append(arrayList.size());
                sbLIZ.append(" invalid videos, source: ");
                sbLIZ.append(str);
                c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                DataLayerAbility dataLayerAbility3 = (DataLayerAbility) offlineModeSwitchComponent.LLILZLL.getValue();
                if (dataLayerAbility3 != null && (items2 = dataLayerAbility3.getItems()) != null && items2.size() == 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onInvalidRecordsDeleted: all invalid videos deleted, source: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(",showEmpty");
                    sbLIZ2.append((IPageStateAbility) offlineModeSwitchComponent.LLIZ.getValue());
                    c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    IPageStateAbility iPageStateAbility = (IPageStateAbility) offlineModeSwitchComponent.LLIZ.getValue();
                    if (iPageStateAbility != null) {
                        iPageStateAbility.cD2(false);
                    }
                    IPageStateAbility iPageStateAbility2 = (IPageStateAbility) offlineModeSwitchComponent.LLIZ.getValue();
                    if (iPageStateAbility2 != null) {
                        iPageStateAbility2.A72();
                    }
                    offlineModeSwitchComponent.LLJILLL = true;
                }
                offlineModeSwitchComponent.LLJJJJJIL--;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            OfflineModeSwitchComponent.LLJLLIL.LJI("onInvalidRecordsDeleted: error", e);
        }
    }

    public final void LIZ$3() {
        Activity activity = (Activity) ((WeakReference) this.l1).get();
        if (activity == null) {
            return;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            intent.removeExtra("profile_landing_tab");
        }
        if (intent != null) {
            intent.removeExtra("profile_from_scene");
            intent.removeExtra("favorite_auto_landing_method_for_bottom_tab");
        }
        String str = this.s0;
        if (str != null && intent != null) {
            intent.putExtra("profile_from_scene", str);
        }
        VideoFavoriteAssem videoFavoriteAssem = (VideoFavoriteAssem) this.l2;
        ARunnableS14S1200000_9 aRunnableS14S1200000_9 = videoFavoriteAssem.LLLII;
        if (aRunnableS14S1200000_9 != null) {
            videoFavoriteAssem.Fp().removeCallbacks(aRunnableS14S1200000_9);
        }
        ((VideoFavoriteAssem) this.l2).LLLII = null;
    }

    public static final void run$0(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        boolean zLIZ;
        C1C7U.LIZ("FcpStandardTaskKt@256e.doET$1$execute$1$1");
        try {
            aRunnableS14S1200000_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FcpStandardTaskKt@256e.doET$1$execute$1$1");
    }

    public static final void run$10(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        boolean zLIZ;
        C1C7U.LIZ("OfflineModeSwitchComponent@329b.setUpInvalidRecordsDeleteListener$1$onInvalidRecordsDeleted$1");
        try {
            aRunnableS14S1200000_9.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OfflineModeSwitchComponent@329b.setUpInvalidRecordsDeleteListener$1$onInvalidRecordsDeleted$1");
    }

    public static final void run$11(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        ArrayList arrayList = (ArrayList) aRunnableS14S1200000_9.l1;
        String str = aRunnableS14S1200000_9.s0;
        C1510130pOt c1510130pOt = (C1510130pOt) aRunnableS14S1200000_9.l2;
        C1C7U.LIZ("SmartServiceManager@2c93.onNotifyCommonEvent$1L");
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC588340N5s) it2.next()).LIZJ(str, c1510130pOt);
        }
        C1C7U.LIZIZ("SmartServiceManager@2c93.onNotifyCommonEvent$1L");
    }

    public static final void run$12(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        boolean zLIZ;
        C1C7U.LIZ("NetworkCache@24f5.putToDiskCacheAsync$1$1");
        try {
            try {
                ((C20013313Sh) aRunnableS14S1200000_9.l1).LJI(aRunnableS14S1200000_9.s0, (CacheResponse) aRunnableS14S1200000_9.l2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20013313Sh c20013313Sh = (C20013313Sh) aRunnableS14S1200000_9.l1;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Error: putToDiskCacheAsync: ");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
                c20013313Sh.getClass();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NetworkCache@24f5.putToDiskCacheAsync$1$1");
    }

    public static final void run$13(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        boolean zLIZ;
        C1C7U.LIZ("BaseOptimisticService@8cd.realUpdate$1");
        try {
            C612230Nzp c612230NzpLJI = ((C0O38) aRunnableS14S1200000_9.l1).LJI();
            if (c612230NzpLJI != null) {
                c612230NzpLJI.LIZIZ((C0O35) aRunnableS14S1200000_9.l2, aRunnableS14S1200000_9.s0, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseOptimisticService@8cd.realUpdate$1");
    }

    public static final void run$15(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        boolean zLIZ;
        C1C7U.LIZ("VideoFavoriteAssem@4c1e.showTooltipAnimation$1$1$1");
        try {
            aRunnableS14S1200000_9.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoFavoriteAssem@4c1e.showTooltipAnimation$1$1$1");
    }

    public static final void run$2(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        boolean zLIZ;
        C1C7U.LIZ("MDPSquareShowMoreViewHolder@c0f0.<init>$1$2$1");
        try {
            aRunnableS14S1200000_9.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MDPSquareShowMoreViewHolder@c0f0.<init>$1$2$1");
    }

    public static final void run$3(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerOnCompletionHelper@5822.onCompletion$1");
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS14S1200000_9.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayCompletedFirstTime(aRunnableS14S1200000_9.s0, (C1480430ocz) aRunnableS14S1200000_9.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerOnCompletionHelper@5822.onCompletion$1");
    }

    public static final void run$4(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerOnErrorHelper@3969.onError$2");
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS14S1200000_9.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onRetryOnError((C1481290oeN) aRunnableS14S1200000_9.l2);
                ((OnUIPlayListener) aRunnableS14S1200000_9.l1).onRetryOnError(aRunnableS14S1200000_9.s0, (C1481290oeN) aRunnableS14S1200000_9.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerOnErrorHelper@3969.onError$2");
    }

    public static final void run$5(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerOnPlayingHelper@7bf7.onPlaying$1");
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS14S1200000_9.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlaying(aRunnableS14S1200000_9.s0, (C1480430ocz) aRunnableS14S1200000_9.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerOnPlayingHelper@7bf7.onPlaying$1");
    }

    public static final void run$6(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onCompletion$1");
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS14S1200000_9.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayCompletedFirstTime(aRunnableS14S1200000_9.s0, (C1480430ocz) aRunnableS14S1200000_9.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onCompletion$1");
    }

    public static final void run$7(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onMaskInfoCallback$1");
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS14S1200000_9.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onMaskInfoCallback(aRunnableS14S1200000_9.s0, (C1480290ocl) aRunnableS14S1200000_9.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onMaskInfoCallback$1");
    }

    public static final void run$8(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onError$2");
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS14S1200000_9.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onRetryOnError((C1481290oeN) aRunnableS14S1200000_9.l2);
                ((OnUIPlayListener) aRunnableS14S1200000_9.l1).onRetryOnError(aRunnableS14S1200000_9.s0, (C1481290oeN) aRunnableS14S1200000_9.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onError$2");
    }

    public static final void run$9(ARunnableS14S1200000_9 aRunnableS14S1200000_9) {
        OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS14S1200000_9.l1;
        String str = aRunnableS14S1200000_9.s0;
        List<Map<String, Object>> list = (List) aRunnableS14S1200000_9.l2;
        C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onCrosstalkHappened$1L");
        if (onUIPlayListener != null) {
            onUIPlayListener.onCrosstalkHappened(str, list);
        }
        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onCrosstalkHappened$1L");
    }

    public ARunnableS14S1200000_9(OfflineModeSwitchComponent offlineModeSwitchComponent, List list, int i) {
        this.$t = i;
        this.l1 = offlineModeSwitchComponent;
        this.l2 = list;
        this.s0 = "verify_delete";
    }

    public ARunnableS14S1200000_9(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
