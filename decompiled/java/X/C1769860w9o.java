package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.image.AutoSizeImage;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomCommonImageOptimizeModel;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomCommonOptimizeConfigBean;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomImagePriorityConfigBean;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomSparkLruInjectConfig;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomSparkReportConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.PerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeGlobalBean;
import com.ss.android.ugc.aweme.ecommerce.pad.IEcMallPadService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomPigeonSparkInterceptorService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomSearchSparkChannelInterceptorService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomSparkChannelInterceptorService;
import com.ss.android.ugc.aweme.ecommerce.settings.EcMixMallRuntimeCardJSOptSetting;
import com.ss.android.ugc.aweme.ecommerce.ui.EcomFlattenUIImage;
import com.ss.android.ugc.aweme.ecommerce.ui.EcomUIImage;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import j27.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0w9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769860w9o extends AbstractC1547260qMm {
    public static final C1769860w9o LL = new C1769860w9o();
    public static final Map<String, String> LLILLJJLI = new LinkedHashMap();
    public static final C603820NmG<String, Boolean> LLILLL = new C603820NmG<>(64);
    public static final List<InterfaceC1769890w9r> LLILZ;
    public static final List<InterfaceC1769890w9r> LLILZIL;
    public static final List<InterfaceC1769890w9r> LLILZLL;

    static {
        C876150YYr c876150YYrLIZ;
        ArrayList arrayList = new ArrayList();
        IEcomPigeonSparkInterceptorService iEcomPigeonSparkInterceptorService = (IEcomPigeonSparkInterceptorService) PluggableExtentionKt.pluggableSpi$default(IEcomPigeonSparkInterceptorService.class, false, false, false, 14, null);
        if (iEcomPigeonSparkInterceptorService != null && (c876150YYrLIZ = iEcomPigeonSparkInterceptorService.LIZ()) != null) {
            arrayList.add(c876150YYrLIZ);
        }
        LLILZ = C13LP.LLIIII(arrayList);
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(new C1956207lQ(), new InterfaceC1769890w9r() { // from class: X.0vV0
            @Override // X.InterfaceC1769890w9r
            public final boolean LIZIZ(String str) {
                return true;
            }

            @Override // X.InterfaceC1769890w9r
            public final void LIZ(SparkContext sparkContext, String str, String str2) {
                AnonymousClass0317 anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin;
                String name = null;
                try {
                    String str3 = sparkContext.LJJJ().get("jato_boost_ms");
                    if (str3 != null) {
                        Long lValueOf = Long.valueOf(CastLongProtector.parseLong(str3));
                        if (lValueOf != null) {
                            long jLongValue = lValueOf.longValue();
                            if (C034S.LIZ()) {
                                C1120604Zw.LIZ.LIZ();
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                boolean z = false;
                                anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = PerformanceOptDependencyService.createIPerformanceOptDependencyServicebyMonsterPlugin(false);
                                if (anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null) {
                                    z = true;
                                }
                                String name2 = IPerformanceOptDependencyService.class.getName();
                                if (anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null) {
                                    name = anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin.getClass().getName();
                                }
                                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                            } else {
                                C1120604Zw.LIZ.LIZ();
                                anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPerformanceOptDependencyService.class);
                            }
                            ((IPerformanceOptDependencyService) anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin).jatoBoost(jLongValue);
                        }
                    }
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }, new InterfaceC1769890w9r() { // from class: X.0pkB
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(205));

            @Override // X.InterfaceC1769890w9r
            public final boolean LIZIZ(String str) {
                return ((Map) this.LIZ.getValue()).keySet().contains(str);
            }

            @Override // X.InterfaceC1769890w9r
            public final void LIZ(SparkContext sparkContext, String str, String str2) {
                EcomSparkLruInjectConfig.EcomSparkLruInjectModel ecomSparkLruInjectModel;
                String string;
                if (!C1523320pkA.LL.matchInterceptRules(str) && (ecomSparkLruInjectModel = (EcomSparkLruInjectConfig.EcomSparkLruInjectModel) ((Map) this.LIZ.getValue()).get(str2)) != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (EcomSparkLruInjectConfig.EcomSparkLruInjectCache ecomSparkLruInjectCache : ecomSparkLruInjectModel.cache) {
                        if (!C770702zh.LIZIZ(ecomSparkLruInjectCache.subChannel) || a0.LJJIIZI(str, ecomSparkLruInjectCache.subChannel, false)) {
                            C212391189t c212391189t = C212391189t.LIZ;
                            String str3 = ecomSparkLruInjectCache.scene;
                            String str4 = ecomSparkLruInjectCache.key;
                            if (str4 != null && !Intrinsics.LJFF(str4, "user_id")) {
                                Object objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1946007jm.LJ(str), str4);
                                if ((objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && (objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = sparkContext.extraRuntimeInfo.get((Object) str4)) == null) || (string = objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.toString()) == null) {
                                    c212391189t.getClass();
                                    string = C212391189t.LIZLLL;
                                }
                            } else {
                                c212391189t.getClass();
                                string = C212391189t.LIZLLL;
                            }
                            c212391189t.getClass();
                            String strLIZ = C212391189t.LIZ(str3, string);
                            if (strLIZ != null) {
                                linkedHashMap.put(ecomSparkLruInjectCache.scene, strLIZ);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("scene: ");
                                sbLIZ.append(ecomSparkLruInjectCache.scene);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("key: ");
                                sbLIZ2.append(ecomSparkLruInjectCache.key);
                                linkedHashMap2.put(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        sparkContext.LJJJJZ(new C1151910g57(linkedHashMap, 5));
                    }
                    sparkContext.LJJLIIIJ(linkedHashMap2, "lru_with_template_data");
                }
            }
        }, new InterfaceC1769890w9r() { // from class: X.0kcW
            public boolean LIZ = true;

            @Override // X.InterfaceC1769890w9r
            public final boolean LIZIZ(String str) {
                return true;
            }

            @Override // X.InterfaceC1769890w9r
            public final void LIZ(SparkContext sparkContext, String str, final String str2) {
                final boolean z;
                final boolean z2;
                final boolean z3;
                EcomCommonOptimizeConfigBean ecomCommonOptimizeConfigBean;
                C1537510q73 c1537510q73 = sparkContext.extraRuntimeInfo;
                C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
                Map<String, Object> mapLIZIZ = C1326430kcb.LIZ().LIZIZ(sparkContext.containerId);
                EcomCommonImageOptimizeModel ecomCommonImageOptimizeModel = C1323240kXS.LIZ;
                EcomCommonOptimizeConfigBean ecomCommonOptimizeConfigBean2 = ecomCommonImageOptimizeModel.useGecImageElement;
                if ((ecomCommonOptimizeConfigBean2 != null && ecomCommonOptimizeConfigBean2.LIZ(str2)) || c1537510q73.get((Object) "use_gec_image") != null || ((LinkedHashMap) mapLIZIZ).get("use_gec_image") != null) {
                    z = true;
                } else {
                    z = false;
                }
                EcomCommonOptimizeConfigBean ecomCommonOptimizeConfigBean3 = ecomCommonImageOptimizeModel.elementCreateAsync;
                if ((ecomCommonOptimizeConfigBean3 != null && ecomCommonOptimizeConfigBean3.LIZ(str2)) || c1537510q73.get((Object) "ec_element_create_async") != null || ((LinkedHashMap) mapLIZIZ).get("ec_element_create_async") != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z && !z2) {
                    return;
                }
                EcomCommonOptimizeConfigBean ecomCommonOptimizeConfigBean4 = ecomCommonImageOptimizeModel.networkRecoveryRetry;
                if (ecomCommonOptimizeConfigBean4 != null && ecomCommonOptimizeConfigBean4.LIZ(str2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                final boolean z4 = !ecomCommonImageOptimizeModel.flattenDisable;
                sparkContext.LJJJLZIJ(1, "enable_lynx_builder_opt");
                sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0juE
                    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                        C1537910q7h c1537910q7h;
                        if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            boolean z5 = z;
                            final boolean z6 = z2;
                            C1326380kcW c1326380kcW = this;
                            final boolean z7 = z4;
                            final String str3 = str2;
                            final boolean z8 = z3;
                            if (z5) {
                                arrayList2.add(new C1311670kEn(str3, z7, z6, z8) { // from class: X.0kXQ
                                    public final String LJFF;
                                    public final boolean LJI;
                                    public final EnumC1331380kka LJII;
                                    public final /* synthetic */ boolean LJIIIIZZ;

                                    @Override // X.C1311670kEn
                                    public final ShadowNode LJ() {
                                        return new AutoSizeImage();
                                    }

                                    @Override // X.C1311670kEn
                                    public final LynxFlattenUI LIZIZ(s sVar) {
                                        String str4;
                                        String str5 = this.LJFF;
                                        if (sVar != null) {
                                            str4 = sVar.LLJJIII;
                                        } else {
                                            str4 = null;
                                        }
                                        return new EcomFlattenUIImage(sVar, str5, str4, this.LJIIIIZZ, this.LJI, this.LJII);
                                    }

                                    @Override // X.C1311670kEn
                                    public final LynxUI<?> LJFF(s sVar) {
                                        String str4;
                                        String str5 = this.LJFF;
                                        if (sVar != null) {
                                            str4 = sVar.LLJJIII;
                                        } else {
                                            str4 = null;
                                        }
                                        return new EcomUIImage(sVar, str5, str4, this.LJI, this.LJII);
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        EnumC1331380kka enumC1331380kka;
                                        super("image", z7, z6, false);
                                        this.LJIIIIZZ = z8;
                                        boolean z9 = false;
                                        EcomSparkReportConfig.EcomSparkReportConfigData ecomSparkReportConfigData = EcomSparkReportConfig.LIZ;
                                        String str4 = (String) ((LinkedHashMap) EcomSparkReportConfig.LIZIZ).get(str3);
                                        this.LJFF = str4;
                                        EcomImageAdaptSizeGlobalBean ecomImageAdaptSizeGlobalBean = C20156813tu.LIZ;
                                        EcomCommonOptimizeConfigBean ecomCommonOptimizeConfigBean5 = C20156813tu.LIZ.imageElementLoadOpt;
                                        if (ecomCommonOptimizeConfigBean5 != null && ecomCommonOptimizeConfigBean5.LIZ(str4)) {
                                            z9 = true;
                                        }
                                        this.LJI = z9;
                                        EcomImagePriorityConfigBean ecomImagePriorityConfigBean = C1323230kXR.LIZ;
                                        EcomCommonOptimizeConfigBean ecomCommonOptimizeConfigBean6 = C1323230kXR.LIZ.pagePriorityHigh;
                                        if (ecomCommonOptimizeConfigBean6 != null) {
                                            ecomCommonOptimizeConfigBean6.LIZ(str4);
                                            enumC1331380kka = EnumC1331380kka.HIGH;
                                        } else {
                                            enumC1331380kka = null;
                                        }
                                        this.LJII = enumC1331380kka;
                                    }
                                });
                            }
                            if (z6) {
                                c1326380kcW.getClass();
                                arrayList2.addAll(C1697810uHb.LJIIJJI(new C1339200kxC(155), new C1339200kxC(156), new C1339200kxC(157), new C1339200kxC(158), new C1339200kxC(159), new C1339200kxC(160), new C1339200kxC(153), new C1339200kxC(154)));
                            }
                            c1537910q7h.LJII(arrayList2);
                        }
                    }
                });
                if (this.LIZ && (ecomCommonOptimizeConfigBean = ecomCommonImageOptimizeModel.bitmapRgb565) != null && ecomCommonOptimizeConfigBean.enable) {
                    final AbstractC1326410kcZ abstractC1326410kcZ = AbstractC1326410kcZ.LIZJ;
                    AbstractC1326410kcZ.LIZJ = new AbstractC1326410kcZ() { // from class: X.0kcX
                        @Override // X.AbstractC1326410kcZ
                        public final Bitmap.Config LIZ(String str3, int i, int i2, int i3, int i4, boolean z5, C1330000kiM c1330000kiM) {
                            AbstractC1326410kcZ abstractC1326410kcZ2;
                            if (str3 != null && str3.length() != 0) {
                                Uri uri = UriProtector.parse(str3);
                                if (uri != null && C1326230kcH.LJIILL(uri.getHost())) {
                                    EcomCommonOptimizeConfigBean ecomCommonOptimizeConfigBean5 = C1323240kXS.LIZ.bitmapRgb565;
                                    if (ecomCommonOptimizeConfigBean5 != null && ecomCommonOptimizeConfigBean5.LIZ(C1334150kp3.LJI(uri))) {
                                        abstractC1326410kcZ2 = AbstractC1326410kcZ.LIZIZ;
                                    } else {
                                        abstractC1326410kcZ2 = AbstractC1326410kcZ.LIZ;
                                    }
                                    return abstractC1326410kcZ2.LIZ(str3, i, i2, i3, i4, z5, c1330000kiM);
                                }
                                return abstractC1326410kcZ.LIZ(str3, i, i2, i3, i4, z5, c1330000kiM);
                            }
                            return abstractC1326410kcZ.LIZ(str3, i, i2, i3, i4, z5, c1330000kiM);
                        }
                    };
                    C1328520kfy.LJII = true;
                    C1328730kgJ.LJIL = true;
                    this.LIZ = false;
                }
            }
        }, new InterfaceC1769890w9r() { // from class: X.0w9t
            @Override // X.InterfaceC1769890w9r
            public final boolean LIZIZ(String str) {
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
            @Override // X.InterfaceC1769890w9r
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.bytedance.hybrid.spark.SparkContext r3, java.lang.String r4, java.lang.String r5) {
                /*
                    r2 = this;
                    com.ss.android.ugc.aweme.ecommerce.ab.EcomSparkOptimizeModel r0 = X.C1769920w9u.LIZ
                    com.ss.android.ugc.aweme.ecommerce.ab.EcomCommonOptimizeConfigBean r0 = r0.cacheScreenSize
                    if (r0 == 0) goto L16
                    boolean r0 = r0.LIZ(r5)
                    r1 = 1
                    if (r0 != r1) goto L16
                Ld:
                    X.0ecY r0 = new X.0ecY
                    r0.<init>()
                    r3.LJJJJZ(r0)
                    return
                L16:
                    r1 = 0
                    goto Ld
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1769910w9t.LIZ(com.bytedance.hybrid.spark.SparkContext, java.lang.String, java.lang.String):void");
            }
        });
        Set services = ServiceManager.get().getServices(IEcomSparkChannelInterceptorService.class);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = services.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((IEcomSparkChannelInterceptorService) it2.next()).LIZ(), arrayList2);
        }
        listLJIILJJIL.addAll(arrayList2);
        Set services2 = ServiceManager.get().getServices(IEcomSearchSparkChannelInterceptorService.class);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = services2.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((IEcomSearchSparkChannelInterceptorService) it3.next()).LIZ(), arrayList3);
        }
        listLJIILJJIL.addAll(arrayList3);
        if (C1769900w9s.LIZ().enable || C1769870w9p.LIZ().enable) {
            listLJIILJJIL.add(new InterfaceC1769890w9r() { // from class: X.0w9v
                @Override // X.InterfaceC1769890w9r
                public final boolean LIZIZ(String str) {
                    EcomCommonOptimizeConfigBean ecomCommonOptimizeConfigBean = C1769900w9s.LIZ().channels;
                    if (ecomCommonOptimizeConfigBean != null && ecomCommonOptimizeConfigBean.LIZ(str)) {
                        return true;
                    }
                    List<String> list = C1769900w9s.LIZ().mainThreadChannels;
                    if (list != null && list.contains(str)) {
                        return true;
                    }
                    return false;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
                @Override // X.InterfaceC1769890w9r
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(com.bytedance.hybrid.spark.SparkContext r4, java.lang.String r5, final java.lang.String r6) {
                    /*
                        r3 = this;
                        java.lang.String r0 = r4.LJIJI()
                        android.net.Uri r0 = X.C1943307jL.LIZJ(r0)
                        if (r0 == 0) goto L13
                        X.0erm r1 = X.C1105230erp.LIZ(r0)
                    Le:
                        X.0erm r0 = X.EnumC1105200erm.LYNX
                        if (r1 == r0) goto L15
                        return
                    L13:
                        r1 = 0
                        goto Le
                    L15:
                        X.0pxS r0 = r4.hybridParams
                        if (r0 == 0) goto L47
                        com.bytedance.lynx.hybrid.param.HybridSchemaParam r0 = r0.LIZJ()
                        if (r0 == 0) goto L47
                        boolean r0 = r0.getEnableAirStrictMode()
                        r2 = 1
                        if (r0 != r2) goto L47
                    L26:
                        X.0wA0 r0 = new X.0wA0
                        r0.<init>()
                        r4.LJJJJZI(r0)
                        X.01GW r0 = X.C2190461Ao8.LIZLLL
                        java.lang.Object r0 = r0.getValue()
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                        if (r0 != 0) goto L46
                        java.lang.Class<X.0q6Q> r1 = X.AbstractC1537120q6Q.class
                        X.0w9y r0 = new X.0w9y
                        r0.<init>()
                        r4.LJJ(r1, r0)
                    L46:
                        return
                    L47:
                        r2 = 0
                        goto L26
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1769930w9v.LIZ(com.bytedance.hybrid.spark.SparkContext, java.lang.String, java.lang.String):void");
                }
            });
        }
        if (C1610406Sg.LIZ().enable) {
            listLJIILJJIL.add(C1610306Sf.LIZ);
        }
        if (C1770030wA5.LIZ()) {
            listLJIILJJIL.add(new C1769940w9w());
        }
        if (C0NWT.LIZ()) {
            listLJIILJJIL.add(new C0NWU());
        }
        listLJIILJJIL.add(new InterfaceC1769890w9r() { // from class: X.0w9m
            @Override // X.InterfaceC1769890w9r
            public final boolean LIZIZ(String str) {
                return Intrinsics.LJFF("tiktok_ug_bfcm", str);
            }

            @Override // X.InterfaceC1769890w9r
            public final void LIZ(SparkContext sparkContext, final String str, String str2) {
                sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0w9l
                    @Override // X.InterfaceC1554220qY0
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJII() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIIIZZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIJ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILIIL(SparkPopup sparkPopup, View view) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILJJIL(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILL(SparkPopup sparkPopup, int i) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILLIIL() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIZILJ(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIJ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final boolean LJIJI(SparkPopup sparkPopup) {
                        return false;
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final boolean LJIJJ(SparkPopup sparkPopup) {
                        return false;
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIJJLI(SparkPopup sparkPopup, float f) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIL(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJI(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIFFI(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJII() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
                        return false;
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIZI() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void onViewAttachedToWindow() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void onViewDetachedFromWindow() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIJ(SparkPopup sparkPopup) {
                        EventBus.LIZLLL().LJIILL(new C1768860w8C(str));
                    }
                });
                sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0w9k
                    @Override // X.InterfaceC2217701Bqy
                    public final Context LIZJ(Context context) {
                        return context;
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJIILLIIL(boolean z) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJIL(Activity activity, Context context) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIII(SparkActivity sparkActivity, boolean z) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIJIIJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJ(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJJ(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJZI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIIJJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                        return false;
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLJLI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLL(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void finish() {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void onActivityResult(int i, int i2, Intent intent) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void onRestoreInstanceState(Bundle bundle) {
                    }

                    @Override // X.InterfaceC1163130gND
                    public final void release() {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJLL(SparkActivity sparkActivity) {
                        EventBus.LIZLLL().LJIILL(new C1768860w8C(str));
                    }
                });
            }
        });
        IEcMallPadService iEcMallPadService = (IEcMallPadService) PluggableExtentionKt.pluggableSpi$default(IEcMallPadService.class, false, false, false, 14, null);
        if (iEcMallPadService != null && iEcMallPadService.LIZ()) {
            listLJIILJJIL.add(new C21393018no());
        }
        String str = EcMixMallRuntimeCardJSOptSetting.LIZIZ.enableJsConcurChannel;
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            listLJIILJJIL.add(new InterfaceC1769890w9r() { // from class: X.0qK1
                @Override // X.InterfaceC1769890w9r
                public final boolean LIZIZ(String str2) {
                    String str3 = EcMixMallRuntimeCardJSOptSetting.LIZIZ.enableJsConcurChannel;
                    if (str3 == null) {
                        str3 = "";
                    }
                    return Intrinsics.LJFF(str3, str2);
                }

                @Override // X.InterfaceC1769890w9r
                public final void LIZ(SparkContext sparkContext, String str2, String str3) {
                    HybridSchemaParam hybridSchemaParamLIZJ;
                    HybridSchemaParam hybridSchemaParamLIZJ2;
                    Iterator<String> it4 = EcMixMallRuntimeCardJSOptSetting.LIZIZ.enableJsConcurList.iterator();
                    boolean z = false;
                    while (it4.hasNext()) {
                        if (a0.LJJIIZI(str2, it4.next(), false)) {
                            z = true;
                        }
                    }
                    if (z) {
                        sparkContext.LJJJLZIJ(1, "enable_js_group_thread");
                        EcMixMallRuntimeCardJSOptSetting.EcMixMallRuntimeOptModel ecMixMallRuntimeOptModel = EcMixMallRuntimeCardJSOptSetting.LIZIZ;
                        String str4 = ecMixMallRuntimeOptModel.jsGroupName;
                        String str5 = "";
                        if (str4 == null) {
                            str4 = "";
                        }
                        sparkContext.LJJJZ("group", str4);
                        InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
                        if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ2 = interfaceC1531560pxS.LIZJ()) != null) {
                            hybridSchemaParamLIZJ2.setEnableJsGroupThread(true);
                        }
                        InterfaceC1531560pxS interfaceC1531560pxS2 = sparkContext.hybridParams;
                        if (interfaceC1531560pxS2 != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS2.LIZJ()) != null) {
                            String str6 = ecMixMallRuntimeOptModel.jsGroupName;
                            if (str6 != null) {
                                str5 = str6;
                            }
                            hybridSchemaParamLIZJ.setGroup(str5);
                        }
                    }
                }
            });
        }
        List<InterfaceC1769890w9r> listLLIIII = C13LP.LLIIII(listLJIILJJIL);
        LLILZIL = listLLIIII;
        LLILZLL = C13LP.LJLIL(listLLIIII, LLILZ);
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        Uri uriLJ;
        if (str != null) {
            uriLJ = C1946007jm.LJ(str);
        } else {
            uriLJ = null;
        }
        if (LIZ(uriLJ, true, false) != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        return matchInterceptRules(url);
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final void handleSparkContext(SparkContext sparkContext, String str) {
        super.handleSparkContext(sparkContext, str);
        String str2 = (String) ((LinkedHashMap) LLILLJJLI).get(C1947207jy.LIZJ(str));
        if (str2 == null) {
            return;
        }
        for (InterfaceC1769890w9r interfaceC1769890w9r : (ArrayList) LLILZLL) {
            if (interfaceC1769890w9r.LIZIZ(str2)) {
                interfaceC1769890w9r.LIZ(sparkContext, str, str2);
            }
        }
    }

    public static String LIZ(Uri uri, boolean z, boolean z2) {
        String strLIZIZ;
        String str = null;
        if (uri == null || (strLIZIZ = C1947207jy.LIZIZ(z2, uri)) == null) {
            return null;
        }
        String str2 = (String) ((LinkedHashMap) LLILLJJLI).get(strLIZIZ);
        if (str2 == null) {
            if (!z || Intrinsics.LJFF(LLILLL.LIZJ(strLIZIZ), Boolean.TRUE)) {
                return null;
            }
            String[] strArr = C1769880w9q.LIZ;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str3 = strArr[i];
                if (a0.LJJIIZI(strLIZIZ, str3, false)) {
                    str = str3;
                    if (str3 != null) {
                        LLILLJJLI.put(strLIZIZ, str3);
                        return str;
                    }
                } else {
                    i++;
                }
            }
            LLILLL.LIZLLL(strLIZIZ, Boolean.TRUE);
            return str;
        }
        return str2;
    }
}
