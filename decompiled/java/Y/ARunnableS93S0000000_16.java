package Y;

import X.AnonymousClass1440;
import X.C1035180d2q;
import X.C1064600doI;
import X.C1064620doK;
import X.C1064640doM;
import X.C1064720doU;
import X.C1250160ida;
import X.C1520080pew;
import X.C1720106oR;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2212141Bi0;
import X.C2212381BiO;
import X.InterfaceC988630bpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hybridkit.task.WebViewWarmUpTask;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS93S0000000_16 implements Runnable {
    public final int $t;

    public static final void run$0(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        C1C7U.LIZ("NavigationSceneManager@df89.forceExecutePendingNavigationOperation$1");
        C1C7U.LIZIZ("NavigationSceneManager@df89.forceExecutePendingNavigationOperation$1");
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

    public static void LIZ$0() throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1064620doK c1064620doK = new C1064620doK(true, true);
        C1520080pew.LJFF(null, "webview_warmup", "call", "native", null, null, null, null, 241);
        if (C1064720doU.LIZIZ == null) {
            C1064720doU.LIZIZ = c1064620doK;
            if (!C1064720doU.LIZ()) {
                C1064620doK c1064620doK2 = C1064720doU.LIZIZ;
                if (c1064620doK2 == null) {
                    c1064620doK2 = null;
                }
                if (c1064620doK2.LIZ) {
                    C1064640doM.LIZ(new C1064600doI());
                } else {
                    C1064720doU.LIZLLL();
                }
            }
        }
        WebViewWarmUpTask.LL.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", System.currentTimeMillis() - jCurrentTimeMillis);
        jSONObject.put("type", "warm_up");
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            iSparkHostApi.onEventV3("webview_warm_up_duration", jSONObject);
        }
        WebViewWarmUpTask.LLILLJJLI = true;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS93S0000000_16(int r2) {
        /*
            r1 = this;
            r1.$t = r2
            switch(r2) {
                case 0: goto La;
                case 1: goto La;
                case 2: goto La;
                case 3: goto La;
                case 4: goto L5;
                case 5: goto La;
                case 6: goto La;
                case 7: goto La;
                case 8: goto La;
                case 9: goto La;
                case 10: goto La;
                case 11: goto La;
                case 12: goto La;
                case 13: goto La;
                case 14: goto La;
                case 15: goto La;
                default: goto L5;
            }
        L5:
            r0 = r1
        L6:
            r0.<init>()
            return
        La:
            r0 = r1
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS93S0000000_16.<init>(int):void");
    }

    public static final void run$1(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        C1C7U.LIZ("DetailFragmentPanel@5b0b.setUpInsightBottomView$1L");
        C1C7U.LIZIZ("DetailFragmentPanel@5b0b.setUpInsightBottomView$1L");
    }

    public static final void run$10(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        C1C7U.LIZ("CoordinatePopCountOperation@e739.executeNoAnimationOperation$2L");
        C1C7U.LIZIZ("CoordinatePopCountOperation@e739.executeNoAnimationOperation$2L");
    }

    public static final void run$11(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        C1C7U.LIZ("CoordinatePopCountOperation@e739.executeNoAnimationOperation$1$1L");
        C1C7U.LIZIZ("CoordinatePopCountOperation@e739.executeNoAnimationOperation$1$1L");
    }

    public static final void run$12(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        C1C7U.LIZ("MiloCoreThreadPool@e67b.initialize$1L");
        C1C7U.LIZIZ("MiloCoreThreadPool@e67b.initialize$1L");
    }

    public static final void run$13(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        C1C7U.LIZ("CommentInputManager@e031.onPublishSuccess$1L");
        C1C7U.LIZIZ("CommentInputManager@e031.onPublishSuccess$1L");
    }

    public static final void run$14(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        C1C7U.LIZ("CommentInputManager@e031.onPublishSuccess$2L");
        C1C7U.LIZIZ("CommentInputManager@e031.onPublishSuccess$2L");
    }

    public static final void run$15(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        boolean zLIZ;
        C1C7U.LIZ("SplashAdManagerImpl@3960.clearSplashAdData$1");
        try {
            C2212381BiO.LJII("clear splash ad data");
            JSONArray jSONArray = new JSONArray();
            C2212141Bi0 c2212141Bi0LJIIIIZZ = C2212141Bi0.LJIIIIZZ();
            c2212141Bi0LJIIIIZZ.LJIIZILJ(jSONArray.toString());
            c2212141Bi0LJIIIIZZ.LIZJ.LJI("splash_ad_first_show_data", jSONArray.toString());
            c2212141Bi0LJIIIIZZ.LIZJ();
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("SplashAdManagerImpl@3960.clearSplashAdData$1");
    }

    public static final void run$2(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        boolean zLIZ;
        C1C7U.LIZ("WebViewWarmUpTask@2a7b.run$1");
        try {
            LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WebViewWarmUpTask@2a7b.run$1");
    }

    public static final void run$3(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        C1C7U.LIZ("GetGoogleAIdTask@3c21.run$1$onStateChange$1L");
        AnonymousClass1440.LJI();
        C1C7U.LIZIZ("GetGoogleAIdTask@3c21.run$1$onStateChange$1L");
    }

    public static final void run$4(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        C1C7U.LIZ("TokenResolverInitTask@bf3e.run$1$invoke$1L");
        C1035180d2q.LIZJ.getValue();
        C1C7U.LIZIZ("TokenResolverInitTask@bf3e.run$1$invoke$1L");
    }

    public static final void run$5(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        boolean zLIZ;
        C1C7U.LIZ("ProfilePageFragment@e348.opLoadProfileUserData$1");
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1250160ida.LIZ.getClass();
            C1250160ida.LIZIZ("load_page_model_init_view", true);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("read other model finish, cost time: ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C1720106oR.LJI("ProfilePageFragment", C2188811AlT.LIZIZ(sbLIZ));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfilePageFragment@e348.opLoadProfileUserData$1");
    }

    public static final void run$6(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        C1C7U.LIZ("EffectManager@a3e3.release$2L");
        C1C7U.LIZIZ("EffectManager@a3e3.release$2L");
    }

    public static final void run$7(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        boolean zLIZ;
        InterfaceC988630bpl interfaceC988630bplLJIIZILJ;
        C1C7U.LIZ("EcUgVSAProductCardManager@cabc.hideVideoAdCTA$$inlined$runOnMainThread$1");
        try {
            IFeedAdService iFeedAdService = (IFeedAdService) ServiceManager.get().getService(IFeedAdService.class);
            if (iFeedAdService != null && (interfaceC988630bplLJIIZILJ = iFeedAdService.LJIIZILJ()) != null) {
                interfaceC988630bplLJIIZILJ.hide();
            }
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("EcUgVSAProductCardManager@cabc.hideVideoAdCTA$$inlined$runOnMainThread$1");
    }

    public static final void run$8(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        boolean zLIZ;
        InterfaceC988630bpl interfaceC988630bplLJIIZILJ;
        C1C7U.LIZ("EcUgVSAProductCardManager@cabc.showVideoAdCTA$$inlined$runOnMainThread$1");
        try {
            IFeedAdService iFeedAdService = (IFeedAdService) ServiceManager.get().getService(IFeedAdService.class);
            if (iFeedAdService != null && (interfaceC988630bplLJIIZILJ = iFeedAdService.LJIIZILJ()) != null) {
                interfaceC988630bplLJIIZILJ.show();
            }
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("EcUgVSAProductCardManager@cabc.showVideoAdCTA$$inlined$runOnMainThread$1");
    }

    public static final void run$9(ARunnableS93S0000000_16 aRunnableS93S0000000_16) {
        C1C7U.LIZ("CoordinatePopCountOperation@e739.executeNoAnimationOperation$1L");
        C1C7U.LIZIZ("CoordinatePopCountOperation@e739.executeNoAnimationOperation$1L");
    }
}
