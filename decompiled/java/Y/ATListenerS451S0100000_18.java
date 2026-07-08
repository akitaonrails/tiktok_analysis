package Y;

import X.C1161800gL4;
import X.C1170350gYr;
import X.C1191190h6T;
import X.C1195290hD5;
import X.C1197240hGE;
import X.C13LE;
import X.C1416310mxZ;
import X.C1428470nHB;
import X.C1460230o6P;
import X.C786410Ut5;
import X.InterfaceC1161620gKm;
import X.InterfaceC1163850gON;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.hybrid.spark.raven.transparent.TransparentAssem;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.WhiteNoiseAssem;
import com.ss.android.ugc.aweme.creative.model.GpsConsumingOptModel;
import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.map.assem.PoiStaticMapAssem;
import com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ATListenerS451S0100000_18 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onTouch$9(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onTouch$10(this, view, motionEvent);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return onTouch$12(this, view, motionEvent);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return onTouch$13(this, view, motionEvent);
            case 14:
                return onTouch$14(this, view, motionEvent);
            case 15:
                return onTouch$15(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS451S0100000_18(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS451S0100000_18 aTListenerS451S0100000_18, View view, MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float x = motionEventObtain.getX();
        float y = motionEventObtain.getY();
        ((TransparentAssem) aTListenerS451S0100000_18.l0).getClass();
        boolean zSk2 = false;
        motionEventObtain.setLocation(x, y + 0);
        TransparentAssem transparentAssem = (TransparentAssem) aTListenerS451S0100000_18.l0;
        transparentAssem.getClass();
        InterfaceC1161620gKm interfaceC1161620gKmLIZ = C1161800gL4.LIZ(transparentAssem);
        if (interfaceC1161620gKmLIZ != null) {
            zSk2 = interfaceC1161620gKmLIZ.sk2(view, motionEventObtain);
        }
        motionEventObtain.recycle();
        return zSk2;
    }

    public static final boolean onTouch$1(ATListenerS451S0100000_18 aTListenerS451S0100000_18, View view, MotionEvent motionEvent) {
        ((WhiteNoiseAssem) aTListenerS451S0100000_18.l0).So(false);
        if (motionEvent == null) {
            return false;
        }
        return ((GestureDetector) ((WhiteNoiseAssem) aTListenerS451S0100000_18.l0).LLLF.getValue()).onTouchEvent(motionEvent);
    }

    public static final boolean onTouch$10(ATListenerS451S0100000_18 aTListenerS451S0100000_18, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            ((C1191190h6T) aTListenerS451S0100000_18.l0).getParent().requestDisallowInterceptTouchEvent(false);
            view.performClick();
            return false;
        }
        ((C1191190h6T) aTListenerS451S0100000_18.l0).getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    public static final boolean onTouch$11(ATListenerS451S0100000_18 aTListenerS451S0100000_18, View view, MotionEvent motionEvent) {
        Map<String, Object> mapPreloadPoiRecommend;
        Boolean bool;
        String str;
        if (motionEvent.getAction() == 0) {
            MobParam mobParamLJII = C1428470nHB.LJII(((C1460230o6P) aTListenerS451S0100000_18.l0).getEditModel(), "video_post_page", "", "");
            List<MediaLocationMetaDataModel> list = C1416310mxZ.LJJLIIIJL(((C1460230o6P) aTListenerS451S0100000_18.l0).getEditModel()).mediaLocationMetaDataList;
            IPoiVideoPublishService iPoiVideoPublishService = (IPoiVideoPublishService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
            Boolean bool2 = null;
            if (iPoiVideoPublishService != null && (mapPreloadPoiRecommend = iPoiVideoPublishService.preloadPoiRecommend(mobParamLJII, list)) != null) {
                C1460230o6P c1460230o6P = (C1460230o6P) aTListenerS451S0100000_18.l0;
                GpsConsumingOptModel gpsConsumingOptModel = c1460230o6P.getEditModel().creativeModel.gpsConsumingOptModel;
                Object obj = mapPreloadPoiRecommend.get("is_hit_preload");
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                } else {
                    bool = null;
                }
                gpsConsumingOptModel.hasHitPreload = bool;
                GpsConsumingOptModel gpsConsumingOptModel2 = c1460230o6P.getEditModel().creativeModel.gpsConsumingOptModel;
                Object obj2 = mapPreloadPoiRecommend.get("scenario");
                if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
                    str = "";
                }
                gpsConsumingOptModel2.scenario = str;
                GpsConsumingOptModel gpsConsumingOptModel3 = c1460230o6P.getEditModel().creativeModel.gpsConsumingOptModel;
                Object obj3 = mapPreloadPoiRecommend.get("is_location_allow");
                if (obj3 instanceof Boolean) {
                    bool2 = (Boolean) obj3;
                }
                gpsConsumingOptModel3.locationAllowed = bool2;
            }
            ((C1460230o6P) aTListenerS451S0100000_18.l0).getEditModel().creativeModel.gpsConsumingOptModel.page = 1L;
            return false;
        }
        return false;
    }

    public static final boolean onTouch$12(ATListenerS451S0100000_18 aTListenerS451S0100000_18, View view, MotionEvent motionEvent) {
        if (!((C1197240hGE) aTListenerS451S0100000_18.l0).LLILZIL) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    C1197240hGE c1197240hGE = (C1197240hGE) aTListenerS451S0100000_18.l0;
                    if (c1197240hGE.LLIZ) {
                        c1197240hGE.LLIZ = false;
                        WeakHandler weakHandler = c1197240hGE.LLIZLLLIL;
                        if (weakHandler != null) {
                            weakHandler.removeCallbacksAndMessages(null);
                        }
                    }
                    ((C1197240hGE) aTListenerS451S0100000_18.l0).LLILZLL = Boolean.TRUE;
                }
            } else {
                C1197240hGE c1197240hGE2 = (C1197240hGE) aTListenerS451S0100000_18.l0;
                WeakHandler weakHandler2 = c1197240hGE2.LLIZLLLIL;
                if (weakHandler2 != null) {
                    C786410Ut5.LJLIIL(2000L, weakHandler2, new ARunnableS118S0100000_18(c1197240hGE2, 61));
                    return false;
                }
            }
            return false;
        }
        ((C1197240hGE) aTListenerS451S0100000_18.l0).LLILZLL = Boolean.TRUE;
        return false;
    }

    public static final boolean onTouch$13(ATListenerS451S0100000_18 aTListenerS451S0100000_18, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ((InterfaceC1163850gON) C1170350gYr.LIZIZ((MixFeedOrderCell) aTListenerS451S0100000_18.l0, C13LE.LIZ(InterfaceC1163850gON.class))).z1((MixFeedOrderCell) aTListenerS451S0100000_18.l0);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$14(ATListenerS451S0100000_18 aTListenerS451S0100000_18, View view, MotionEvent motionEvent) {
        ((PoiDetailContentHeaderBaseAssemV3) aTListenerS451S0100000_18.l0).getClass();
        PoiDetailContentHeaderBaseAssemV3.hp(motionEvent, view);
        return false;
    }

    public static final boolean onTouch$15(ATListenerS451S0100000_18 aTListenerS451S0100000_18, View view, MotionEvent motionEvent) {
        C1195290hD5 c1195290hD5 = (C1195290hD5) aTListenerS451S0100000_18.l0;
        c1195290hD5.LLIZLLLIL.LIZJ(motionEvent, c1195290hD5.LLILLL, c1195290hD5.LLILLJJLI);
        return false;
    }

    public static final boolean onTouch$2(ATListenerS451S0100000_18 aTListenerS451S0100000_18, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ((InterfaceC1163850gON) C1170350gYr.LIZIZ((MixFeedManageCell) aTListenerS451S0100000_18.l0, C13LE.LIZ(InterfaceC1163850gON.class))).z1((MixFeedManageCell) aTListenerS451S0100000_18.l0);
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$3(Y.ATListenerS451S0100000_18 r5, android.view.View r6, android.view.MotionEvent r7) {
        /*
            r4 = 1
            r3 = 0
            if (r7 == 0) goto L44
            int r0 = r7.getAction()
            if (r0 != 0) goto L33
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.poi.claim.view.PoiClaimSearchAssem r0 = (com.ss.android.ugc.aweme.poi.claim.view.PoiClaimSearchAssem) r0
            X.01GW r0 = r0.LLJILJIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimSelectRootAssemAbility r0 = (com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimSelectRootAssemAbility) r0
            if (r0 == 0) goto L1b
            r0.uJ1(r4)
        L1b:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.poi.claim.view.PoiClaimSearchAssem r0 = (com.ss.android.ugc.aweme.poi.claim.view.PoiClaimSearchAssem) r0
            X.0Q7z r2 = X.C1558520qew.LJIIL(r0)
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimListAssemAbility> r0 = com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimListAssemAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r2, r0, r1)
            com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimListAssemAbility r0 = (com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimListAssemAbility) r0
            if (r0 == 0) goto L31
            r0.nE0(r4)
        L31:
            if (r7 == 0) goto L44
        L33:
            int r0 = r7.getAction()
            if (r0 != r4) goto L44
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.poi.claim.view.PoiClaimSearchAssem r0 = (com.ss.android.ugc.aweme.poi.claim.view.PoiClaimSearchAssem) r0
            X.0I7D r0 = r0.LLJ
            if (r0 == 0) goto L44
            r0.requestFocus()
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS451S0100000_18.onTouch$3(Y.ATListenerS451S0100000_18, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$4(ATListenerS451S0100000_18 aTListenerS451S0100000_18, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        PoiCollectStatusBaseActivityAssem poiCollectStatusBaseActivityAssem = (PoiCollectStatusBaseActivityAssem) aTListenerS451S0100000_18.l0;
        if (poiCollectStatusBaseActivityAssem.LLJJIJIIJIL && poiCollectStatusBaseActivityAssem.up()) {
            if (motionEvent != null) {
                numValueOf = Integer.valueOf(motionEvent.getAction());
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        View viewYp = ((PoiCollectStatusBaseActivityAssem) aTListenerS451S0100000_18.l0).yp();
                        if (viewYp != null) {
                            C786410Ut5.T4(viewYp, 0.7f);
                            return false;
                        }
                        return false;
                    }
                    if (numValueOf.intValue() == 2) {
                        View viewYp2 = ((PoiCollectStatusBaseActivityAssem) aTListenerS451S0100000_18.l0).yp();
                        if (viewYp2 == null) {
                            return false;
                        }
                        C786410Ut5.T4(viewYp2, 0.7f);
                        return false;
                    }
                }
            } else {
                numValueOf = null;
            }
            if (numValueOf != null && numValueOf.intValue() == 1) {
                View viewYp3 = ((PoiCollectStatusBaseActivityAssem) aTListenerS451S0100000_18.l0).yp();
                if (viewYp3 == null) {
                    return false;
                }
                C786410Ut5.T4(viewYp3, 1.0f);
                return false;
            }
            View viewYp4 = ((PoiCollectStatusBaseActivityAssem) aTListenerS451S0100000_18.l0).yp();
            if (viewYp4 == null) {
                return false;
            }
            C786410Ut5.T4(viewYp4, 1.0f);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$5(ATListenerS451S0100000_18 aTListenerS451S0100000_18, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        PoiCollectStatusBaseAssem poiCollectStatusBaseAssem = (PoiCollectStatusBaseAssem) aTListenerS451S0100000_18.l0;
        if (poiCollectStatusBaseAssem.LLJJIJIIJIL && poiCollectStatusBaseAssem.up()) {
            if (motionEvent != null) {
                numValueOf = Integer.valueOf(motionEvent.getAction());
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        C786410Ut5.T4(((PoiCollectStatusBaseAssem) aTListenerS451S0100000_18.l0).zp(), 0.7f);
                        return false;
                    }
                    if (numValueOf.intValue() == 2) {
                        C786410Ut5.T4(((PoiCollectStatusBaseAssem) aTListenerS451S0100000_18.l0).zp(), 0.7f);
                        return false;
                    }
                }
            } else {
                numValueOf = null;
            }
            if (numValueOf != null && numValueOf.intValue() == 1) {
                C786410Ut5.T4(((PoiCollectStatusBaseAssem) aTListenerS451S0100000_18.l0).zp(), 1.0f);
                return false;
            }
            C786410Ut5.T4(((PoiCollectStatusBaseAssem) aTListenerS451S0100000_18.l0).zp(), 1.0f);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$6(ATListenerS451S0100000_18 aTListenerS451S0100000_18, View view, MotionEvent motionEvent) {
        ((PoiDetailContentHeaderBaseAssemV3) aTListenerS451S0100000_18.l0).getClass();
        PoiDetailContentHeaderBaseAssemV3.hp(motionEvent, view);
        return false;
    }

    public static final boolean onTouch$7(ATListenerS451S0100000_18 aTListenerS451S0100000_18, View view, MotionEvent motionEvent) {
        ((PoiDetailContentHeaderBaseAssemV3) aTListenerS451S0100000_18.l0).getClass();
        PoiDetailContentHeaderBaseAssemV3.hp(motionEvent, view);
        return false;
    }

    public static final boolean onTouch$8(ATListenerS451S0100000_18 aTListenerS451S0100000_18, View view, MotionEvent motionEvent) {
        ((PoiDetailContentHeaderBaseAssemV3) aTListenerS451S0100000_18.l0).getClass();
        PoiDetailContentHeaderBaseAssemV3.hp(motionEvent, view);
        return false;
    }

    public static final boolean onTouch$9(ATListenerS451S0100000_18 aTListenerS451S0100000_18, View view, MotionEvent motionEvent) {
        return ((GestureDetector) ((PoiStaticMapAssem) aTListenerS451S0100000_18.l0).LLJ.getValue()).onTouchEvent(motionEvent);
    }
}
