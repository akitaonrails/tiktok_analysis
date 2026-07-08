package X;

import Y.ARunnableS6S2000000_17;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePromoteSchemaPreloadListSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePromoteSchemaPreloadSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.jvm.internal.AFwS290S0000000_7;
import kotlin.jvm.internal.AFwS326S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0eyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109510eyj {
    public static String LIZ;
    public static boolean LIZIZ;

    static {
        new C0UWA(0L);
    }

    public static void LIZIZ() {
        if (!LivePromoteSchemaPreloadSetting.INSTANCE.getSettingValue().enable || LIZIZ) {
            return;
        }
        C01KE.LIZ(C817503Hh.LL, new C466000IPe(null));
        LIZIZ = true;
    }

    public static void LIZ(String str) {
        final String str2;
        if (Intrinsics.LJFF(str, "live_promote_anchor_page_preload")) {
            str2 = "promote_anchor";
        } else {
            str2 = "feed_card";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerDecisionWithLive sceneKey:");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        C20441214yg.LIZIZ("LivePromotePreloadStrategyManager", C2188811AlT.LIZIZ(sbLIZ));
        C1092980eY4 c1092980eY4 = new C1092980eY4();
        c1092980eY4.LIZ = C0J0P.APP;
        c1092980eY4.LIZ(new C1092780eXk(new C1932907hf()));
        ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).fR1(new InterfaceC1092860eXs() { // from class: X.0eyk
            @Override // X.InterfaceC1092860eXs
            public final void LIZ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LJ(C1092890eXv c1092890eXv) {
                Object obj;
                Object objLIZJ;
                InterfaceC805220ViK interfaceC805220ViK;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("result Strategy is ");
                C0J0M c0j0m = c1092890eXv.LIZIZ;
                Object obj2 = null;
                if (c0j0m != null) {
                    obj = c0j0m.LIZ;
                } else {
                    obj = null;
                }
                sbLIZ2.append(obj);
                C20441214yg.LIZIZ("LivePromotePreloadStrategyManager", C2188811AlT.LIZIZ(sbLIZ2));
                C0J0M c0j0m2 = c1092890eXv.LIZIZ;
                if (c0j0m2 != null) {
                    String str3 = str2;
                    Object obj3 = c0j0m2.LIZ;
                    if ((obj3 instanceof InterfaceC805220ViK) && (interfaceC805220ViK = (InterfaceC805220ViK) obj3) != null) {
                        objLIZJ = interfaceC805220ViK.LIZJ();
                    } else {
                        objLIZJ = null;
                    }
                    if (objLIZJ instanceof Boolean) {
                        obj2 = objLIZJ;
                    }
                    if (Intrinsics.LJFF(obj2, Boolean.TRUE)) {
                        C20441214yg.LIZIZ("LivePromotePreloadStrategyManager", "result Strategy is running");
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_fe_page_strategy_hit");
                        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                        c474500IjALIZ.LJJII(str3, "card_type");
                        c474500IjALIZ.LIZ();
                        if (C1109510eyj.LIZ == null) {
                            C20441214yg.LIZIZ("LivePromotePreloadStrategyManager", "destinyUrl is null");
                            return;
                        }
                        String str4 = C1109510eyj.LIZ;
                        if (str4 == null) {
                            return;
                        }
                        C1537060q6K c1537060q6K = C1529590puH.LIZ;
                        if (C1537060q6K.LJI("live_promote_url_preload") == null) {
                            C20441214yg.LIZIZ("PromotePreloadHelper", "start register preload info");
                            C1097680efe c1097680efe = new C1097680efe();
                            c1097680efe.LIZ = "live_promote_url_preload";
                            c1097680efe.LJIJJLI = C13LQ.LJJLL(LivePromoteSchemaPreloadListSetting.INSTANCE.getValue());
                            c1097680efe.LJJ = true;
                            c1097680efe.LJIJJ = AFwS326S0000000_1.get$arr$(22);
                            c1097680efe.LJIIIIZZ = AFwS290S0000000_7.get$arr$(30);
                            C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
                        }
                        if (a0.LJJJIL(str4)) {
                            C20441214yg.LIZIZ("PromotePreloadHelper", "preloadPromotePage schema is blank");
                            return;
                        }
                        if (C1537060q6K.LIZ("live_promote_url_preload", str4)) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("preloadPromotePage cache is exist, schema:");
                            sbLIZ3.append(str4);
                            C20441214yg.LIZIZ("PromotePreloadHelper", C2188811AlT.LIZIZ(sbLIZ3));
                            return;
                        }
                        if (C1109550eyn.LIZ) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("preloadPromotePage preloading, schema:");
                            sbLIZ4.append(str4);
                            C20441214yg.LIZIZ("PromotePreloadHelper", C2188811AlT.LIZIZ(sbLIZ4));
                            return;
                        }
                        C1109550eyn.LIZ = true;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("preloadPromotePage start preload, schema:");
                        sbLIZ5.append(str4);
                        C20441214yg.LIZIZ("PromotePreloadHelper", C2188811AlT.LIZIZ(sbLIZ5));
                        RunnableC1109540eym runnableC1109540eym = C1109550eyn.LIZIZ;
                        C473410IhP.LJ(runnableC1109540eym);
                        C473410IhP.LIZJ(runnableC1109540eym, ((long) (LivePromoteSchemaPreloadSetting.INSTANCE.getSettingValue().releaseDuration * 60)) * 1000);
                        C473410IhP.LIZIZ(new ARunnableS6S2000000_17(str4, str3, 1));
                    }
                }
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                String sceneKey;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("registerSceneResult scene : ");
                if (interfaceC830890Wid != null) {
                    sceneKey = interfaceC830890Wid.getSceneKey();
                } else {
                    sceneKey = null;
                }
                sbLIZ2.append(sceneKey);
                sbLIZ2.append(", stateCode: ");
                sbLIZ2.append(enumC2213771Bkd);
                C20441214yg.LIZIZ("LivePromotePreloadStrategyManager", C2188811AlT.LIZIZ(sbLIZ2));
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZLLL(String str3, C477840IoY c477840IoY) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onFailed businessName:");
                sbLIZ2.append(str3);
                sbLIZ2.append(", error:");
                sbLIZ2.append(c477840IoY.LIZIZ);
                C20441214yg.LJ("LivePromotePreloadStrategyManager", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }, c1092980eY4.LIZIZ(), new C1094570ead(), str);
    }
}
