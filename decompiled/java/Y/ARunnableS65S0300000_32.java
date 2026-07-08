package Y;

import X.AbstractC1572300r1A;
import X.AbstractC21321718cJ;
import X.AbstractC21333318eB;
import X.AbstractC21466418ze;
import X.C01GW;
import X.C054G;
import X.C098200Yq;
import X.C0DMM;
import X.C0H0C;
import X.C0H1U;
import X.C0S4U;
import X.C1168270gVV;
import X.C1168400gVi;
import X.C1325860kbg;
import X.C1337880kv4;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LP;
import X.C1447810nmN;
import X.C1488750oqP;
import X.C1572310r1B;
import X.C1740600vOc;
import X.C1741480vQ2;
import X.C1758200vr0;
import X.C1759030vsL;
import X.C1768380w7Q;
import X.C1774720wHe;
import X.C188G;
import X.C188H;
import X.C189200o6;
import X.C189S;
import X.C18PM;
import X.C18PU;
import X.C1942607jE;
import X.C196S;
import X.C19EG;
import X.C1AF0;
import X.C1ATJ;
import X.C1C7U;
import X.C20302914cN;
import X.C2097608Jq;
import X.C2126308Ur;
import X.C21278818Pa;
import X.C21278918Pb;
import X.C21279318Pf;
import X.C21322018cM;
import X.C21322218cO;
import X.C21323018cW;
import X.C21323318cZ;
import X.C21326518d5;
import X.C21326618d6;
import X.C21326718d7;
import X.C21353118hN;
import X.C21353418hQ;
import X.C21353918hV;
import X.C21354518hb;
import X.C21406418py;
import X.C21406618q0;
import X.C21466518zf;
import X.C21466618zg;
import X.C21468018zu;
import X.C21496019Ao;
import X.C21497819Bg;
import X.C2195221Avo;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C424610Gkt;
import X.C428570GrH;
import X.EnumC1569640qws;
import X.EnumC21279418Pg;
import X.EnumC587500N2m;
import X.InterfaceC1593630rZZ;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.amg.minigameruntime.common.platform_misc.JSBridgePublicJSMessageWrap;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.worker.JsWorker;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.BcmStandardTrackData;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionSticker;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.series.innerfeed.lynxcard.DramaDetailLynxCardContainerAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tiktok.myna.preload.MynaTemplatePreloadInfo;
import com.tiktok.myna.render.render.MynaElement;
import com.tiktok.myna.render.render.MynaTemplateMeta;
import com.tiktok.myna.render.render.MynaTemplateProtocol;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS41S2100000_18;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS53S1000000_2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS65S0300000_32 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 16:
                run$16(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            ((Runnable) this.l0).run();
            Object obj = ((AtomicReference) this.l1).get();
            if (obj != null) {
                ((C1ATJ) this.l2).LJFF.remove(obj);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Object obj2 = ((AtomicReference) this.l1).get();
            if (obj2 != null) {
                ((C1ATJ) this.l2).LJFF.remove(obj2);
            }
            throw th;
        }
    }

    public final void LIZ$1() {
        C19EG activity;
        ECLiveVideoReplayFragment eCLiveVideoReplayFragment = (ECLiveVideoReplayFragment) this.l0;
        C21354518hb c21354518hb = eCLiveVideoReplayFragment.LLJJIJIL;
        C21354518hb c21354518hb2 = (C21354518hb) this.l1;
        if (c21354518hb != c21354518hb2) {
            return;
        }
        AbstractC1572300r1A abstractC1572300r1A = (AbstractC1572300r1A) this.l2;
        if (abstractC1572300r1A instanceof C1572310r1B) {
            FrameLayout frameLayout = eCLiveVideoReplayFragment.LLILZ;
            if (frameLayout != null) {
                C0H1U.LIZIZ(frameLayout);
            }
            eCLiveVideoReplayFragment.LJ();
            return;
        }
        if (abstractC1572300r1A instanceof C188G) {
            C188G c188g = (C188G) abstractC1572300r1A;
            eCLiveVideoReplayFragment.LLJLLL = c188g.LJFF;
            C21353418hQ c21353418hQ = c21354518hb2.LIZ;
            eCLiveVideoReplayFragment.LLJZ = c21353418hQ.LJIIJJI;
            if (c21353418hQ.LIZLLL != EnumC1569640qws.INVALID) {
                ECLiveVideoReplayFragment eCLiveVideoReplayFragment2 = (ECLiveVideoReplayFragment) this.l0;
                C1488750oqP c1488750oqP = c21353418hQ.LIZIZ;
                C21354518hb c21354518hb3 = (C21354518hb) this.l1;
                eCLiveVideoReplayFragment2.WR(c188g, c1488750oqP, c21354518hb3, c21354518hb3.LIZ.LIZLLL == EnumC1569640qws.NORMAL);
                return;
            }
            if (c21354518hb == c21354518hb2) {
                AwS433S0200000_32 awS433S0200000_32 = eCLiveVideoReplayFragment.LLJJJ;
                if (awS433S0200000_32 != null) {
                    awS433S0200000_32.invoke();
                }
                eCLiveVideoReplayFragment.LLJJJ = null;
                eCLiveVideoReplayFragment.LLJJIJIL = null;
            }
            C21353118hN c21353118hN = C21353118hN.LL;
            C21354518hb c21354518hb4 = (C21354518hb) this.l1;
            c21353118hN.getClass();
            C23250099c.LIZLLL(C21353118hN.LLILLJJLI, null, null, new C21353918hV(c21354518hb4, null), 3);
            ECLiveVideoReplayFragment eCLiveVideoReplayFragment3 = (ECLiveVideoReplayFragment) this.l0;
            eCLiveVideoReplayFragment3.LLJJJJJIL = false;
            eCLiveVideoReplayFragment3.LLJZ = -1;
            ((ECLiveVideoReplayFragment) this.l0).WR((C188G) ((AbstractC1572300r1A) this.l2), null, null, false);
            return;
        }
        if (abstractC1572300r1A instanceof C188H) {
            eCLiveVideoReplayFragment.LLJLLL = ((C188H) abstractC1572300r1A).LIZLLL;
            eCLiveVideoReplayFragment.LLJZ = c21354518hb2.LIZ.LJIIJJI;
            eCLiveVideoReplayFragment.dS(false);
            String str = ((C188H) ((AbstractC1572300r1A) this.l2)).LIZ;
            if (str != null && (activity = ((ECLiveVideoReplayFragment) this.l0).getActivity()) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
            }
            ECLiveVideoReplayFragment.gS((ECLiveVideoReplayFragment) this.l0, Integer.valueOf(((C188H) ((AbstractC1572300r1A) this.l2)).LIZIZ), ((C188H) ((AbstractC1572300r1A) this.l2)).LIZJ, null, 4);
            ((ECLiveVideoReplayFragment) this.l0).kS();
            ECLiveVideoReplayFragment eCLiveVideoReplayFragment4 = (ECLiveVideoReplayFragment) this.l0;
            if (eCLiveVideoReplayFragment4.LLJJIJIL == ((C21354518hb) this.l1)) {
                AwS433S0200000_32 awS433S0200000_322 = eCLiveVideoReplayFragment4.LLJJJ;
                if (awS433S0200000_322 != null) {
                    awS433S0200000_322.invoke();
                }
                eCLiveVideoReplayFragment4.LLJJJ = null;
                eCLiveVideoReplayFragment4.LLJJIJIL = null;
            }
            C21353118hN c21353118hN2 = C21353118hN.LL;
            C21354518hb c21354518hb5 = (C21354518hb) this.l1;
            c21353118hN2.getClass();
            C23250099c.LIZLLL(C21353118hN.LLILLJJLI, null, null, new C21353918hV(c21354518hb5, null), 3);
            ((ECLiveVideoReplayFragment) this.l0).LLJJJJJIL = false;
        }
    }

    public final void LIZ$2() {
        BcmParams bcmParams;
        HomeTabAbility homeTabAbilityLIZ;
        List<EcUgProduct> list;
        EcUgProduct ecUgProduct;
        BcmStandardTrackData bcmStandardTrackData;
        Map<String, ? extends Object> mapLIZ;
        C21278918Pb c21278918Pb = C21278918Pb.LIZ;
        Context context = (Context) this.l0;
        Aweme aweme = (Aweme) this.l1;
        c21278918Pb.getClass();
        Fragment fragmentTK0 = null;
        C21278918Pb.LIZJ(context, aweme, null, false);
        VSACardsResponse.VSACardData vSACardData = ((C21279318Pf) this.l2).LJFF;
        if (vSACardData == null || (list = vSACardData.productList) == null || (ecUgProduct = (EcUgProduct) C13LP.LJJJLL(list)) == null || (bcmStandardTrackData = ecUgProduct.bcmStandardTrack) == null || (mapLIZ = C1768380w7Q.LIZ(bcmStandardTrackData)) == null) {
            bcmParams = null;
        } else {
            bcmParams = new BcmParams();
            bcmParams.merge(mapLIZ);
        }
        C1741480vQ2 c1741480vQ2 = C1741480vQ2.LIZ;
        C18PU c18pu = C18PU.SHOP_TAB_ICON;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ((Context) this.l0);
        c1741480vQ2.getClass();
        if (c19egLIZIZ != null) {
            try {
                MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ);
                if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                    Fragment fragmentH62 = homeTabAbilityLIZ.h62();
                    if (fragmentH62 != null && !(fragmentH62 instanceof InterfaceC1593630rZZ)) {
                        fragmentTK0 = fragmentH62;
                    } else if (homeTabAbilityLIZ != null) {
                        fragmentTK0 = homeTabAbilityLIZ.tK0();
                    }
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C1740600vOc c1740600vOcLIZ = C1741480vQ2.LIZ(c18pu, fragmentTK0, 0, bcmParams);
        C18PM c18pm = C18PM.LIZ;
        C21279318Pf c21279318Pf = (C21279318Pf) this.l2;
        C18PM.LJFF(c18pm, c21279318Pf.LJFF, c21279318Pf.LJI, c21279318Pf.LJII, EnumC21279418Pg.SHOP_TAB_ICON, false, c1740600vOcLIZ, 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$3() {
        C21278918Pb c21278918Pb = C21278918Pb.LIZ;
        Context context = (Context) this.l0;
        Aweme aweme = (Aweme) ((C259800zU) this.l1).element;
        c21278918Pb.getClass();
        boolean z = false;
        C21278918Pb.LIZJ(context, aweme, null, false);
        C01GW c01gw = C21278818Pa.LIZ;
        C21279318Pf c21279318PfLJ = C21278818Pa.LJ((Aweme) ((C259800zU) this.l1).element);
        if (c21279318PfLJ != null) {
            C18PM c18pm = C18PM.LIZ;
            VSACardsResponse.VSACardData vSACardData = c21279318PfLJ.LJFF;
            Map<String, String> map = c21279318PfLJ.LJI;
            Map<String, Map<String, String>> map2 = c21279318PfLJ.LJII;
            EnumC21279418Pg enumC21279418Pg = (EnumC21279418Pg) this.l2;
            Integer num = c21279318PfLJ.LIZLLL.adType;
            int value = EnumC587500N2m.COMMERCIALIZE_PRODUCT_CARD.getValue();
            if (num != null && num.intValue() == value) {
                z = true;
            }
            C18PM.LJFF(c18pm, vSACardData, map, map2, enumC21279418Pg, z, null, 64);
        }
    }

    public final void LIZ$4() {
        C21497819Bg c21497819BgLJJI = ((C21496019Ao) this.l2).LIZ.LJJI();
        ((ArrayList) c21497819BgLJJI.LIZ).remove((C1447810nmN) this.l0);
        C21496019Ao c21496019Ao = (C21496019Ao) this.l2;
        c21496019Ao.LIZJ.LLLIL(c21496019Ao.LJ.mScene);
        C21496019Ao c21496019Ao2 = (C21496019Ao) this.l2;
        c21496019Ao2.LIZ.LJIIZILJ(c21496019Ao2.LJI, c21496019Ao2.LJFF.mScene, false);
        ((Runnable) this.l1).run();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[PHI: r2
      0x004b: PHI (r2v5 android.view.View) = (r2v3 android.view.View), (r2v7 X.18nL) binds: [B:14:0x0049, B:10:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$5() {
        /*
            r10 = this;
            java.lang.Object r2 = r10.l0
            X.18nL r2 = (X.C21390118nL) r2
            java.lang.Object r1 = r10.l1
            X.18nB r1 = (X.InterfaceC21389118nB) r1
            r9 = 0
            if (r1 == 0) goto L11
            X.18nB r0 = r2.getRenderNodeDriver()
            if (r0 != r1) goto L14
        L11:
            r2.setRenderNodeDriver(r9)
        L14:
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.setScaleX(r1)
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r2)
            r2.setScaleY(r1)
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r2)
            r0 = 0
            r2.setTranslationX(r0)
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r2)
            r2.setTranslationY(r0)
            X.C786410Ut5.S5(r2, r1)
            java.lang.Object r3 = r10.l2
            android.view.View r3 = (android.view.View) r3
            kotlin.Pair r0 = X.C21389218nC.LIZIZ(r3)
            if (r0 == 0) goto L44
            java.lang.Object r2 = r0.getSecond()
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L4b
        L44:
            boolean r0 = r3 instanceof X.C21390118nL
            if (r0 == 0) goto L7a
            r2 = r3
        L49:
            if (r2 == 0) goto L53
        L4b:
            r1 = 2131392437(0x7f0a77b5, float:1.8405502E38)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.setTag(r1, r0)
        L53:
            java.lang.Class<com.ss.android.ugc.aweme.IDetailFeedSafService> r4 = com.ss.android.ugc.aweme.IDetailFeedSafService.class
            r5 = 0
            r8 = 14
            r6 = r5
            r7 = r5
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.IDetailFeedSafService r0 = (com.ss.android.ugc.aweme.IDetailFeedSafService) r0
            if (r0 == 0) goto L79
            androidx.fragment.app.Fragment r0 = r0.LIZ(r3)
            if (r0 == 0) goto L79
            X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r9)
            java.lang.Class<com.ss.android.ugc.aweme.feed.collection.collection.ability.IStorySafCompatAbility> r0 = com.ss.android.ugc.aweme.feed.collection.collection.ability.IStorySafCompatAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r9)
            com.ss.android.ugc.aweme.feed.collection.collection.ability.IStorySafCompatAbility r0 = (com.ss.android.ugc.aweme.feed.collection.collection.ability.IStorySafCompatAbility) r0
            if (r0 == 0) goto L79
            r0.j12()
        L79:
            return
        L7a:
            r0 = 2131389271(0x7f0a6b57, float:1.839908E38)
            android.view.View r2 = r3.findViewById(r0)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS65S0300000_32.LIZ$5():void");
    }

    public final void LIZ$6() {
        int i;
        String str;
        MynaTemplateProtocol mynaTemplateProtocol;
        String str2;
        MynaTemplateMeta meta;
        C21322218cO c21322218cO = C21322218cO.LIZ;
        C21326718d7 c21326718d7 = (C21326718d7) this.l0;
        MynaTemplatePreloadInfo mynaTemplatePreloadInfo = (MynaTemplatePreloadInfo) this.l1;
        AbstractC21321718cJ abstractC21321718cJ = (AbstractC21321718cJ) this.l2;
        c21322218cO.getClass();
        try {
            if (!C21322218cO.LJFF(c21326718d7.LIZIZ) || (i = mynaTemplatePreloadInfo.num) <= 0) {
                return;
            }
            if (i > 6) {
                i = 6;
            }
            String str3 = mynaTemplatePreloadInfo.url;
            String strLIZ = mynaTemplatePreloadInfo.name;
            if ((strLIZ == null || strLIZ.length() == 0) && (str = mynaTemplatePreloadInfo.url) != null) {
                strLIZ = C1942607jE.LIZ(str);
            }
            if (str3 == null || str3.length() == 0 || strLIZ == null || strLIZ.length() == 0) {
                C1168400gVi.LIZIZ(new AwS41S2100000_18(c21326718d7, str3, strLIZ, 9));
                return;
            }
            C21322018cM c21322018cM = C21322218cO.LJI;
            c21322018cM.getClass();
            c21322218cO.getClass();
            C21323018cW c21323018cW = c21322018cM.LIZ.get(str3);
            C1168400gVi.LIZ(new AwS146S1100000_32(str3, c21323018cW, 15));
            if (c21323018cW == null || (mynaTemplateProtocol = c21323018cW.LIZ) == null) {
                return;
            }
            int i2 = 0;
            do {
                C1168270gVV c1168270gVV = C1168270gVV.LIZ;
                MynaElement uiInfo = mynaTemplateProtocol.getUiInfo();
                if (uiInfo == null || (meta = uiInfo.getMeta()) == null || (str2 = meta.version) == null) {
                    str2 = "";
                }
                String str4 = strLIZ;
                String str5 = str3;
                String str6 = str2;
                C1774720wHe c1774720wHe = new C1774720wHe(str5, str4, str6, Long.valueOf(c21323018cW.LIZLLL), c21323018cW.LJI, c21323018cW.LJII, c21323018cW.LJIIIIZZ, c21323018cW.LJIIJJI, c21323018cW.LJIIL, 1536);
                c1168270gVV.getClass();
                C21326518d5 c21326518d5LIZ = C21326618d6.LIZ(c21326718d7, mynaTemplateProtocol, c1774720wHe);
                C1759030vsL c1759030vsL = C21322218cO.LJII;
                C21323318cZ c21323318cZ = new C21323318cZ(c21323018cW, c21326518d5LIZ);
                synchronized (c1759030vsL) {
                    C1758200vr0 c1758200vr0 = c1759030vsL.LIZ.get(str5);
                    if (c1758200vr0 == null) {
                        c1758200vr0 = new C1758200vr0();
                        c1759030vsL.LIZ.put(str5, c1758200vr0);
                    }
                    c1758200vr0.LIZ.add(c21323318cZ);
                }
                C1168400gVi.LIZ(new AwS53S1000000_2(str5, 31));
                if (abstractC21321718cJ != null) {
                    String str7 = mynaTemplatePreloadInfo.name;
                    if (str7 == null) {
                        str7 = "";
                    }
                    abstractC21321718cJ.LIZIZ(0, str7, mynaTemplatePreloadInfo.url, "success");
                }
                i2++;
                str3 = str5;
                strLIZ = str4;
            } while (i2 < i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1325860kbg.LIZIZ(th, null, C2097608Jq.LJ());
        }
    }

    public static final void run$0(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        JsWorker jsWorker = (JsWorker) aRunnableS65S0300000_32.l0;
        Number number = (Number) aRunnableS65S0300000_32.l1;
        JavaOnlyMap javaOnlyMap = (JavaOnlyMap) aRunnableS65S0300000_32.l2;
        C1C7U.LIZ("JSBPlatformMisc@2226.postJSMsgWithBuffers$1L");
        JSBridgePublicJSMessageWrap jSBridgePublicJSMessageWrap = (JSBridgePublicJSMessageWrap) jsWorker.getJavaScriptFunction(JSBridgePublicJSMessageWrap.class);
        if (jSBridgePublicJSMessageWrap != null) {
            jSBridgePublicJSMessageWrap.invokeHandler(number, javaOnlyMap);
        }
        C1C7U.LIZIZ("JSBPlatformMisc@2226.postJSMsgWithBuffers$1L");
    }

    public static final void run$1(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        ViewGroup viewGroup = (ViewGroup) aRunnableS65S0300000_32.l0;
        View view = (View) aRunnableS65S0300000_32.l1;
        C21466618zg c21466618zg = (C21466618zg) aRunnableS65S0300000_32.l2;
        viewGroup.endViewTransition(view);
        c21466618zg.LIZJ.LIZ.LIZJ(c21466618zg);
    }

    public static final void run$10(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.getVSADataForShopTabClick$lambda$55$lambda$54$$inlined$runOnWorkerThread$1");
        try {
            aRunnableS65S0300000_32.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.getVSADataForShopTabClick$lambda$55$lambda$54$$inlined$runOnWorkerThread$1");
    }

    public static final void run$11(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.onVSAAdClick$$inlined$runOnWorkerThread$1");
        try {
            aRunnableS65S0300000_32.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.onVSAAdClick$$inlined$runOnWorkerThread$1");
    }

    public static final void run$12(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("DramaDetailLynxCardContainerAssem@9c67.onViewHolderSelected$runnable$1");
        try {
            if (((View) aRunnableS65S0300000_32.l1).getParent() != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("show_type", "draw");
                C189S c189s = (C189S) aRunnableS65S0300000_32.l2;
                if (c189s != null) {
                    c189s.LIZIZ("on_card_appear", jSONObject);
                }
            }
            ((DramaDetailLynxCardContainerAssem) aRunnableS65S0300000_32.l0).LLJJJJJIL = null;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DramaDetailLynxCardContainerAssem@9c67.onViewHolderSelected$runnable$1");
    }

    public static final void run$13(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("PopDestroyOperation@d1bc.execute$1");
        try {
            aRunnableS65S0300000_32.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PopDestroyOperation@d1bc.execute$1");
    }

    public static final void run$14(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("StorySafTransitionsV2Kt@9708.doRenderNodeScalePushAnimator$2$1");
        try {
            aRunnableS65S0300000_32.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StorySafTransitionsV2Kt@9708.doRenderNodeScalePushAnimator$2$1");
    }

    public static final void run$15(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("BaseMynaViewManager@671.setTranslateForAnimationFill$1");
        try {
            AbstractC21333318eB abstractC21333318eB = (AbstractC21333318eB) aRunnableS65S0300000_32.l0;
            abstractC21333318eB.LJLILLLLZI(abstractC21333318eB.LJJIIZ((C1337880kv4) aRunnableS65S0300000_32.l1), ((AbstractC21333318eB) aRunnableS65S0300000_32.l0).LJJIIZI((C1337880kv4) aRunnableS65S0300000_32.l2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseMynaViewManager@671.setTranslateForAnimationFill$1");
    }

    public static final void run$16(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("MynaPreloadUtil@d8bb.preCreateContainer$2");
        try {
            aRunnableS65S0300000_32.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MynaPreloadUtil@d8bb.preCreateContainer$2");
    }

    public static final void run$2(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        C21468018zu c21468018zu = (C21468018zu) aRunnableS65S0300000_32.l0;
        C21468018zu c21468018zu2 = (C21468018zu) aRunnableS65S0300000_32.l1;
        C21466518zf c21466518zf = (C21466518zf) aRunnableS65S0300000_32.l2;
        C20302914cN.LIZ(c21468018zu.LIZJ, c21468018zu2.LIZJ, c21466518zf.LJIILJJIL, c21466518zf.LJIILIIL);
    }

    public static final void run$3(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        ((AbstractC21466418ze) aRunnableS65S0300000_32.l0).getBoundsOnScreen((View) aRunnableS65S0300000_32.l1, (Rect) aRunnableS65S0300000_32.l2);
    }

    public static final void run$4(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("ImeServiceImpl@ce5f.initInputViewOkTextView$1");
        try {
            if (((C21406418py) aRunnableS65S0300000_32.l0).LLILZIL) {
                C21406618q0 c21406618q0 = (C21406618q0) aRunnableS65S0300000_32.l1;
                Activity activity = (Activity) aRunnableS65S0300000_32.l2;
                c21406618q0.getClass();
                MiniGameFragment miniGameFragmentLIZIZ = C2195221Avo.LIZIZ();
                if (miniGameFragmentLIZIZ != null) {
                    activity.runOnUiThread(new ARunnableS121S0100000_21(miniGameFragmentLIZIZ, 6));
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImeServiceImpl@ce5f.initInputViewOkTextView$1");
    }

    public static final void run$5(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("LivePitayaTaskManager@b112.scheduleTask$1$wrapper$1");
        try {
            aRunnableS65S0300000_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePitayaTaskManager@b112.scheduleTask$1$wrapper$1");
    }

    public static final void run$6(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("ECLiveVideoReplayFragment@4d09.bindPreloadCache$1$1");
        try {
            aRunnableS65S0300000_32.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECLiveVideoReplayFragment@4d09.bindPreloadCache$1$1");
    }

    public static final void run$7(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("ImageThumbnailContainer@3c20.touchHelper$1$clearView$2");
        try {
            if (((RecyclerView) aRunnableS65S0300000_32.l0).getParent() != null) {
                ((C196S) aRunnableS65S0300000_32.l1).LLILZ.LLLLJI((RecyclerView.ViewHolder) aRunnableS65S0300000_32.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageThumbnailContainer@3c20.touchHelper$1$clearView$2");
    }

    public static final void run$8(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        boolean zLIZ;
        C1C7U.LIZ("ImageThumbnailContainer@3c20.touchHelperForDelete$1$clearView$3");
        try {
            if (((RecyclerView) aRunnableS65S0300000_32.l0).getParent() != null) {
                ((C196S) aRunnableS65S0300000_32.l1).LLILZ.LLLLJI((RecyclerView.ViewHolder) aRunnableS65S0300000_32.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageThumbnailContainer@3c20.touchHelperForDelete$1$clearView$3");
    }

    public static final void run$9(ARunnableS65S0300000_32 aRunnableS65S0300000_32) {
        boolean zLIZ;
        List<PromotionSticker> list;
        C1C7U.LIZ("CommentPanelViewHolder@45.updatePromote$5");
        try {
            C054G c054gLIZ = C2296808zG.LIZ(C2126308Ur.LJFF);
            C0H0C c0h0c = (C0H0C) aRunnableS65S0300000_32.l0;
            PromotionInfo promotionInfo = ((AnchorProductInfoModel) aRunnableS65S0300000_32.l1).extraData.promotionInfo;
            if (promotionInfo != null) {
                list = promotionInfo.promotionStickers;
            } else {
                list = null;
            }
            C428570GrH.LIZ(c054gLIZ, c0h0c, list, 24, Integer.valueOf(((C424610Gkt) aRunnableS65S0300000_32.l2).getWidth()), false, 80);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentPanelViewHolder@45.updatePromote$5");
    }

    public ARunnableS65S0300000_32(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
