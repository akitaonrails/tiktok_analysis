package X;

import android.os.SystemClock;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.review.EcAnchorReviewsPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19Lt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21525119Lt extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        switch (this.$t) {
            case 0:
                LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 1:
                LJL$1(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            default:
                super.LJL(interfaceC1541990qEH, str, c1542120qEU);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (2 - this.$t != 0) {
            super.LJLIIIL(interfaceC1541990qEH);
        } else {
            LJLIIIL$0(this, interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLLJ(SparkContext sparkContext, C1548490qOl c1548490qOl) {
        switch (this.$t) {
            case 1:
                LJLLJ$0(this, sparkContext, c1548490qOl);
                break;
            case 2:
            default:
                super.LJLLJ(sparkContext, c1548490qOl);
                break;
            case 3:
                LJLLJ$1(this, sparkContext, c1548490qOl);
                break;
        }
    }

    public C21525119Lt(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$0(C21525119Lt c21525119Lt, InterfaceC1541990qEH interfaceC1541990qEH) {
        EnumC1067640dtC type;
        C21394618o4 c21394618o4LIZ = C21395018o8.LIZ();
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ = ((SparkContext) c21525119Lt.l0).LJIJJ();
        String strLJIJI = ((SparkContext) c21525119Lt.l0).LJIJI();
        InterfaceC1531560pxS interfaceC1531560pxS = ((SparkContext) c21525119Lt.l0).hybridParams;
        if (interfaceC1531560pxS != null) {
            type = interfaceC1531560pxS.getType();
        } else {
            type = null;
        }
        c21394618o4LIZ.LIZJ(interfaceC1541990qEHLJIJJ, strLJIJI, type, 2);
    }

    public static final void LJLLJ$0(C21525119Lt c21525119Lt, SparkContext sparkContext, C1548490qOl c1548490qOl) {
        if (c1548490qOl.LIZIZ == 4) {
            C21196317xB.LIZ.getClass();
            JSONObject jSONObject = C21196317xB.LJIIJ;
            if (jSONObject != null) {
                C1739460vMm c1739460vMm = (C1739460vMm) c21525119Lt.l0;
                long j = JSONObjectProtectorUtils.getLong(jSONObject, "start_click_time");
                if (j != c1739460vMm.LLILLJJLI) {
                    c1739460vMm.LLILLJJLI = j;
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1548490qOl.LIZ;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.U0(C2097908Jt.LIZJ(new Pair("shopping_list_datas", jSONObject)));
                    }
                    C1537720q7O c1537720q7O = c1548490qOl.LIZJ;
                    if (c1537720q7O != null) {
                        c1537720q7O.U0(C2097908Jt.LIZJ(new Pair("shopping_list_datas", jSONObject)));
                    }
                }
            }
        }
    }

    public static final void LJLLJ$1(C21525119Lt c21525119Lt, SparkContext sparkContext, C1548490qOl c1548490qOl) {
        String idStr;
        C21208817zC c21208817zC;
        C1097680efe c1097680efe;
        if (((C21208517z9) c21525119Lt.l0).LLIZLLLIL != null && !C1542210qEd.LIZIZ(Integer.valueOf(c1548490qOl.LIZIZ)) && !C1542210qEd.LIZ(Integer.valueOf(c1548490qOl.LIZIZ)) && (c21208817zC = ((C21208517z9) c21525119Lt.l0).LLJ) != null && (c1097680efe = c21208817zC.LLILLL) != null) {
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LJIILL(c1097680efe.LIZ);
        }
        EnumC21192817wc enumC21192817wc = EnumC21192817wc.SHOP_BAG_LIST_OPENED;
        Room room = ((C21208517z9) c21525119Lt.l0).LLILZ;
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        C21196417xC.LIZ(enumC21192817wc, idStr, null, null, null, ((C21208517z9) c21525119Lt.l0).LLJLLL, Integer.valueOf(c1548490qOl.LIZIZ), Integer.valueOf(!((C21208517z9) c21525119Lt.l0).LLJL ? 1 : 0), 28);
    }

    public static final void LJL$0(C21525119Lt c21525119Lt, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        AwemeRawAd awemeRawAd;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        String name;
        Aweme aweme = ((EcAnchorReviewsPanelFragment) c21525119Lt.l0).LLILZ;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = false;
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    z = true;
                }
                String name2 = IAdDependencyService.class.getName();
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
            }
            AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).onAdEvent("draw_ad", "othershow_fail", awemeRawAd);
            abstractC1056160dagOnAdEvent.LIZ.put("refer", "comment_panel_review_tab_loading_fail");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hybrid_");
            sbLIZ.append(c1542120qEU.LIZ);
            abstractC1056160dagOnAdEvent.LIZIZ.put("fail_reason", C2188811AlT.LIZIZ(sbLIZ));
            abstractC1056160dagOnAdEvent.LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJL$1(X.C21525119Lt r4, X.InterfaceC1541990qEH r5, java.lang.String r6, X.C1542120qEU r7) {
        /*
            boolean r0 = X.C21197617xO.LIZJ
            if (r0 == 0) goto L4b
            if (r7 == 0) goto L57
            java.lang.Integer r0 = r7.LIZ
            if (r0 == 0) goto L57
            int r1 = r0.intValue()
            r0 = 204(0xcc, float:2.86E-43)
            if (r1 != r0) goto L50
            r0 = 1010(0x3f2, float:1.415E-42)
        L14:
            X.0wNz r5 = X.EnumC1778650wNz.SHOP_BAG_LIST
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r7 == 0) goto L4e
            java.lang.String r3 = r7.LIZIZ
        L1e:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r1 = X.C21197617xO.LIZIZ
            if (r1 != 0) goto L29
            java.lang.String r1 = ""
        L29:
            java.lang.String r0 = "room_id"
            r2.put(r0, r1)
            if (r7 == 0) goto L4c
            java.lang.Integer r0 = r7.LIZ
            if (r0 == 0) goto L4c
            int r0 = r0.intValue()
        L38:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "sub_error_code"
            r2.put(r0, r1)
            java.lang.String r0 = "url"
            r2.put(r0, r6)
            java.lang.String r0 = "rd_tiktokec_shop_bag_list_exception"
            X.C05D4.LIZIZ(r0, r5, r4, r3, r2)
        L4b:
            return
        L4c:
            r0 = -1
            goto L38
        L4e:
            r3 = 0
            goto L1e
        L50:
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 < r0) goto L57
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L14
        L57:
            r0 = 1001(0x3e9, float:1.403E-42)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21525119Lt.LJL$1(X.19Lt, X.0qEH, java.lang.String, X.0qEU):void");
    }
}
