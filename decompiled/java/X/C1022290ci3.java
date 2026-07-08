package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService;
import com.ss.android.ugc.aweme.commercialize.measurement.mrc.IMRCManager;
import com.ss.android.ugc.aweme.commercialize.measurement.mrc.MRCManager;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ci3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022290ci3 implements InterfaceC1022320ci6 {
    public static final C1022290ci3 LIZ = new C1022290ci3();
    public static InterfaceC1022300ci4 LIZIZ;
    public static boolean LIZJ;

    public static IMRCManager LJIILIIL() {
        Object objLIZ = C04TD.LIZ(IMRCManager.class, false);
        if (objLIZ != null) {
            return (IMRCManager) objLIZ;
        }
        if (C04TD.LLLIILIL == null) {
            synchronized (IMRCManager.class) {
                if (C04TD.LLLIILIL == null) {
                    C04TD.LLLIILIL = new MRCManager();
                }
            }
        }
        return C04TD.LLLIILIL;
    }

    public static final void LJIILL(String str) {
        LJIILIIL().LIZIZ(LJIL(str));
    }

    public static final void LJIJ(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            LJIILIIL().LIZ(str);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC1022310ci5 LJIL(String str) {
        switch (str.hashCode()) {
            case -1271119582:
                if (str.equals("homepage_follow")) {
                    return EnumC1022310ci5.FOLLOWING_FEED;
                }
                break;
            case -460940408:
                if (str.equals("homepage_popular")) {
                    return EnumC1022310ci5.POPULAR_FEED;
                }
                break;
            case 998835423:
                if (str.equals("general_search")) {
                    return EnumC1022310ci5.SEARCH;
                }
                break;
            case 1691937916:
                if (str.equals("homepage_hot")) {
                    return EnumC1022310ci5.RECOMMEND_FEED;
                }
                break;
        }
        return EnumC1022310ci5.DEFAULT;
    }

    @Override // X.InterfaceC1022320ci6
    public final void init(AbstractC1017400caA abstractC1017400caA) {
        LIZIZ = (InterfaceC1022300ci4) abstractC1017400caA.LIZ;
    }

    public static final void LJFF(Context context, Aweme aweme) {
        if (aweme != null && context != null) {
            if (!AwemeExtKt.isAdTraffic(aweme) && !AwemeExtKt.isPseudoAd(aweme)) {
                return;
            }
            InterfaceC1022300ci4 interfaceC1022300ci4 = LIZIZ;
            if (interfaceC1022300ci4 != null) {
                interfaceC1022300ci4.LJIIIIZZ(context, aweme);
            }
            if (!((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).isECADVideo(aweme)) {
                return;
            }
            ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).reportAdVideoLog(aweme, false, 3, ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).generateTrackId(aweme));
        }
    }

    public static final void LJIIIIZZ(Context context, Aweme aweme) {
        if (aweme != null && context != null) {
            if (!AwemeExtKt.isAdTraffic(aweme) && !AwemeExtKt.isPseudoAd(aweme)) {
                return;
            }
            InterfaceC1022300ci4 interfaceC1022300ci4 = LIZIZ;
            if (interfaceC1022300ci4 != null) {
                interfaceC1022300ci4.LJIIIZ(context, aweme);
            }
            if (!((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).isECADVideo(aweme)) {
                return;
            }
            ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).reportAdVideoLog(aweme, false, 1, ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).generateTrackId(aweme));
        }
    }

    public static final void LJIIJ(Context context, Aweme aweme) {
        InterfaceC1022300ci4 interfaceC1022300ci4;
        if (aweme != null && context != null && AwemeExtKt.isAdTraffic(aweme) && (interfaceC1022300ci4 = LIZIZ) != null) {
            interfaceC1022300ci4.LJJIIJ();
        }
    }

    public static final void LJIIJJI(Context context, Aweme aweme) {
        InterfaceC1022300ci4 interfaceC1022300ci4;
        if (aweme != null && context != null) {
            if ((!AwemeExtKt.isAdTraffic(aweme) && !AwemeExtKt.isPseudoAd(aweme)) || (interfaceC1022300ci4 = LIZIZ) == null) {
                return;
            }
            interfaceC1022300ci4.LJIILIIL(context, aweme);
        }
    }

    public static final void LJIILJJIL(Context context, Aweme aweme) {
        InterfaceC1022300ci4 interfaceC1022300ci4;
        if (context != null && AwemeExtKt.isAdTraffic(aweme) && (interfaceC1022300ci4 = LIZIZ) != null) {
            interfaceC1022300ci4.LJIJJ();
        }
    }

    public static final void LJIILLIIL(Context context, String str) {
        InterfaceC1022300ci4 interfaceC1022300ci4 = LIZIZ;
        if (interfaceC1022300ci4 != null) {
            interfaceC1022300ci4.LJIIJJI(context, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r6, java.lang.String r7, Y.AObjectS362S0100000_19 r8) {
        /*
            r5 = 1
            if (r6 == 0) goto L50
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r6)
            if (r0 != r5) goto L50
            r0 = 1
        La:
            java.lang.String r3 = "setPageOffset "
            r4 = 0
            if (r0 == 0) goto L52
            boolean r0 = X.C1017070cZd.LL(r6)
            if (r0 == 0) goto L1b
            boolean r0 = X.C1017070cZd.LJIIJ(r6)
            if (r0 == 0) goto L28
        L1b:
            X.C1026350cob.LJ(r7)
            java.lang.String r1 = "draw_ad"
            java.lang.String r0 = "slide"
            boolean r0 = X.C1017070cZd.LLJJIJIL(r6, r1, r0)
            if (r0 == 0) goto L52
        L28:
            float r0 = X.C07D6.LIZ()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L52
            float r1 = X.C07D6.LIZ()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r8.invoke(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            float r0 = X.C07D6.LIZ()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            return
        L50:
            r0 = 0
            goto La
        L52:
            if (r6 == 0) goto L81
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            if (r0 == 0) goto L81
            com.ss.android.ugc.aweme.feed.model.ad.LeftSlideConfig r0 = r0.getLeftSlideConfig()
            if (r0 == 0) goto L81
            java.lang.Float r2 = r0.getDistanceThreshold()
            if (r2 == 0) goto L81
            float r1 = (float) r5
            float r0 = r2.floatValue()
            float r1 = r1 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r8.invoke(r0)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r2)
            X.C2188811AlT.LIZIZ(r0)
            return
        L81:
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            r8.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1022290ci3.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, Y.AObjectS362S0100000_19):void");
    }

    public static final boolean LIZLLL(Context context, Aweme aweme, int i) {
        InterfaceC1022300ci4 interfaceC1022300ci4;
        if (aweme == null || context == null || ((!AwemeExtKt.isAdTraffic(aweme) && !AwemeExtKt.isPseudoAd(aweme)) || (interfaceC1022300ci4 = LIZIZ) == null)) {
            return false;
        }
        return interfaceC1022300ci4.LJFF(context, aweme, i);
    }

    @InterfaceC1294060jmO
    public static final boolean LJ(Context context, Aweme aweme, int i) {
        InterfaceC1022300ci4 interfaceC1022300ci4;
        if ((!AwemeExtKt.isAdTraffic(aweme) && !AwemeExtKt.isPseudoAd(aweme)) || (interfaceC1022300ci4 = LIZIZ) == null) {
            return false;
        }
        return interfaceC1022300ci4.LJJIFFI(context, aweme, i);
    }

    public static final void LJI(Context context, Aweme aweme, boolean z) {
        InterfaceC1022300ci4 interfaceC1022300ci4;
        if (aweme != null && context != null) {
            if ((!AwemeExtKt.isAdTraffic(aweme) && !AwemeExtKt.isPseudoAd(aweme)) || (interfaceC1022300ci4 = LIZIZ) == null) {
                return;
            }
            interfaceC1022300ci4.LJIIJ(context, aweme, z);
        }
    }

    public static final void LJII(Aweme aweme, Context context, EnumC1035330d35 enumC1035330d35) {
        InterfaceC1022300ci4 interfaceC1022300ci4;
        if (context != null && AwemeExtKt.isMonetizationTraffic(aweme) && (interfaceC1022300ci4 = LIZIZ) != null) {
            interfaceC1022300ci4.LJIL(aweme, context, enumC1035330d35);
        }
    }

    public static final boolean LJIIL(Aweme aweme, C19EG c19eg, float f) {
        InterfaceC1022300ci4 interfaceC1022300ci4;
        if (aweme != null && c19eg != null && AwemeExtKt.isAdTraffic(aweme) && (interfaceC1022300ci4 = LIZIZ) != null) {
            return interfaceC1022300ci4.LJIILJJIL(aweme, c19eg, f);
        }
        return false;
    }

    public static final void LJIJJ(Aweme aweme, Context context, boolean z, boolean z2) {
        InterfaceC1022300ci4 interfaceC1022300ci4;
        LIZJ = false;
        if (aweme != null && context != null) {
            if ((!AwemeExtKt.isAdTraffic(aweme) && !AwemeExtKt.isPseudoAd(aweme)) || (interfaceC1022300ci4 = LIZIZ) == null) {
                return;
            }
            interfaceC1022300ci4.LJII(aweme, context, z, z2);
        }
    }

    public static final void LJIJJLI(int i, int i2, Context context, Aweme aweme) {
        if (aweme != null && context != null) {
            if ((AwemeExtKt.isAdTraffic(aweme) || C1017070cZd.LJIIL(aweme)) && !C1017070cZd.LLIIL(aweme)) {
                InterfaceC1022300ci4 interfaceC1022300ci4 = LIZIZ;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            LIZJ = true;
                            if (interfaceC1022300ci4 != null) {
                                interfaceC1022300ci4.LJIIL(context, aweme);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (LIZJ) {
                        LIZJ = false;
                        return;
                    } else {
                        if (interfaceC1022300ci4 == null) {
                            return;
                        }
                        interfaceC1022300ci4.LJ(context, aweme, i2);
                        return;
                    }
                }
                if (LIZJ) {
                    LIZJ = false;
                } else {
                    if (interfaceC1022300ci4 == null) {
                        return;
                    }
                    interfaceC1022300ci4.LJIJI(context, aweme, i2);
                }
            }
        }
    }

    public static final void LJIIIZ(Aweme aweme, Context context, String str, C581980Ms8 c581980Ms8, int i) {
        InterfaceC1022300ci4 interfaceC1022300ci4;
        if (context != null) {
            if ((!AwemeExtKt.isAdTraffic(aweme) && !C1017070cZd.LJIIL(aweme)) || (interfaceC1022300ci4 = LIZIZ) == null) {
                return;
            }
            interfaceC1022300ci4.LJI(aweme, context, str, c581980Ms8, i);
        }
    }

    public static final void LJIIZILJ(Aweme aweme, Context context, long j, int i, String str) {
        if (context != null) {
            if (!AwemeExtKt.isAdTraffic(aweme) && !C1017070cZd.LJIIL(aweme)) {
                return;
            }
            InterfaceC1022300ci4 interfaceC1022300ci4 = LIZIZ;
            if (interfaceC1022300ci4 != null) {
                interfaceC1022300ci4.LJJ(i, j, context, aweme);
            }
            LJIILIIL().LIZJ("over", aweme, LJIL(str));
        }
    }

    public static final void LIZJ(Aweme aweme, Context context, Aweme aweme2, String str, C581980Ms8 c581980Ms8, int i, String str2) {
        InterfaceC1022300ci4 interfaceC1022300ci4;
        if (aweme != null && context != null && (interfaceC1022300ci4 = LIZIZ) != null) {
            interfaceC1022300ci4.LJJI(aweme, context, aweme2, str, c581980Ms8, i, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.0bsD] */
    public static final void LJIJI(Aweme aweme, Context context, String str, View view, String str2, final C0RAL c0ral, final C0RLY c0rly) {
        if (str2 != null && !a0.LJJJIL(str2) && aweme != null && context != null) {
            LJIILIIL().LIZLLL(aweme, context, LJIL(str), view, str2, new InterfaceC1029110ct3() { // from class: X.0bsD
                @Override // X.InterfaceC1029110ct3
                public final String LIZ() {
                    String strInvoke = c0rly.invoke();
                    return strInvoke == null ? "" : strInvoke;
                }

                @Override // X.InterfaceC1029110ct3
                public final boolean isPlaying() {
                    Boolean boolInvoke = c0ral.invoke();
                    if (boolInvoke != null) {
                        return boolInvoke.booleanValue();
                    }
                    return false;
                }
            });
            if (AwemeExtKt.isAdTraffic(aweme)) {
                ((IMeasurementService) ServiceManager.get().getService(IMeasurementService.class)).LIZ();
                C586770Mzr.LIZJ(str2);
            }
        }
    }
}
