package X;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.push.impl.innerpush.serviceimpl.IMInnerPushServiceImpl$injectLifecycleObserverToSwitchMode$1;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0YaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876760YaQ implements InterfaceC896430ZEr {
    public C876680YaI LIZ;

    @Override // X.InterfaceC896430ZEr
    public final void LIZ() {
        C876680YaI c876680YaI = this.LIZ;
        if (c876680YaI != null) {
            c876680YaI.LJFF.LIZIZ(c876680YaI);
            C876390YZp c876390YZpLJFF = c876680YaI.LJFF.LJFF();
            if (c876390YZpLJFF != null) {
                C1475705q7 c1475705q7 = c876390YZpLJFF.LJ;
                if (c1475705q7 != null) {
                    C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIJIIJIL(c1475705q7);
                }
                C876840YaY c876840YaY = c876390YZpLJFF.LJI;
                if (c876840YaY != null) {
                    C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIIL(c876840YaY);
                }
                C876460YZw c876460YZw = c876390YZpLJFF.LJII;
                if (c876460YZw != null) {
                    C876470YZx.LIZ().LJIIL(c876460YZw);
                }
                C2296808zG.LIZJ(c876390YZpLJFF.LJIIIIZZ, null);
            }
            c876680YaI.LJ.dispose();
        }
        this.LIZ = null;
        C1908480zlO.LIZIZ.LJI(((InterfaceC1513605wE) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJJJJZ());
    }

    @Override // X.InterfaceC896430ZEr
    public final void LIZIZ() {
        C461720I8s.LIZIZ();
        this.LIZ = new C876680YaI();
        if (C2252408s6.LJI()) {
            C823050WQl.LJFF().execute(new Runnable() { // from class: X.0YaR
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("IMInnerPushServiceImpl@ba16.doWhenIMLogin$1");
                    try {
                        this.LL.getClass();
                        C876760YaQ.LJIILJJIL();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("IMInnerPushServiceImpl@ba16.doWhenIMLogin$1");
                }
            });
        } else {
            LJIILJJIL();
        }
    }

    @Override // X.InterfaceC896430ZEr
    public final void LJ() {
        C0Z9H c0z9h = C0Z9H.LL;
        c0z9h.getClass();
        C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
        if (c1908480zlO.LJIJ(1009) == null) {
            c1908480zlO.LJ(c0z9h);
            c1908480zlO.LJIILL(c0z9h, C0Z9H.LLILZ);
        }
    }

    @Override // X.InterfaceC896430ZEr
    public final void LJIIIIZZ() {
        C876680YaI c876680YaI = this.LIZ;
        if (c876680YaI == null || c876680YaI.LIZJ.LIZ != -1) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C594630NTx(c876680YaI, null), 3);
    }

    @Override // X.InterfaceC896430ZEr
    public final boolean LJIIIZ() {
        return C1908480zlO.LIZIZ.LJIIJJI();
    }

    @Override // X.InterfaceC896430ZEr
    public final boolean LJIIJJI() {
        C876680YaI c876680YaI = this.LIZ;
        if (c876680YaI != null) {
            return c876680YaI.LIZJ().LJFF;
        }
        return false;
    }

    @Override // X.InterfaceC896430ZEr
    public final boolean LJIILIIL() {
        C876680YaI c876680YaI = this.LIZ;
        if (c876680YaI != null) {
            return c876680YaI.LIZJ().LJI;
        }
        return false;
    }

    public static void LJIILJJIL() {
        InterfaceC19330810jy interfaceC19330810jyLJJJJZ = ((InterfaceC1513605wE) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJJJJZ();
        int[] iArrLIZJ = interfaceC19330810jyLJJJJZ.LIZJ();
        int length = iArrLIZJ.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                C1908480zlO.LIZIZ.LJ(interfaceC19330810jyLJJJJZ);
                break;
            }
            if (C1908480zlO.LIZIZ.LJIJ(iArrLIZJ[i]) != null) {
                break;
            } else {
                i++;
            }
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIILL();
        C0Z2P c0z2p = new InterfaceC19330810jy() { // from class: X.0Z2P
            @Override // X.InterfaceC19330810jy
            public final int[] LIZJ() {
                return new int[]{2466};
            }

            @Override // X.InterfaceC19330810jy
            public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
                return null;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
                if (C1585030rLh.LJIJI("NOTIFICATION") && C1618630sDt.LIZIZ.isShowing()) {
                    return true;
                }
                C876900Yae c876900Yae = C876900Yae.LIZ;
                if (C876900Yae.LIZ() == 1) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LJFF(InnerPushMessage innerPushMessage) {
                String bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr();
                if (bizExtraJsonStr == null || bizExtraJsonStr.length() == 0) {
                    return false;
                }
                try {
                    JSONObject jSONObject = new JSONObject(innerPushMessage.getBizExtraJsonStr());
                    String strOptString = jSONObject.optString("conv_id");
                    long jOptLong = jSONObject.optLong("msg_index");
                    C876550Ya5.LJI.getClass();
                    C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(strOptString);
                    if (c0y8tLJIL == null) {
                        return true;
                    }
                    if (c0y8tLJIL.getReadIndex() >= jOptLong) {
                        return false;
                    }
                    return true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return true;
                }
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LJI(InnerPushMessage innerPushMessage) {
                String bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr();
                if (bizExtraJsonStr == null || bizExtraJsonStr.length() == 0) {
                    return false;
                }
                C876900Yae c876900Yae = C876900Yae.LIZ;
                return !C876900Yae.LJ(false);
            }

            /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
            @Override // X.InterfaceC19330810jy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZ(int r14, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r15) {
                /*
                    Method dump skipped, instruction units count: 253
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0Z2P.LIZ(int, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):boolean");
            }
        };
        c0z2p.getClass();
        C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
        if (c1908480zlO.LJIJ(2466) == null) {
            c1908480zlO.LJ(c0z2p);
        }
        C442450HWp c442450HWp = new InterfaceC19330810jy() { // from class: X.0HWp
            @Override // X.InterfaceC19330810jy
            public final int[] LIZJ() {
                return new int[]{1019};
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
                return false;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LJFF(InnerPushMessage innerPushMessage) {
                return true;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LJI(InnerPushMessage innerPushMessage) {
                return true;
            }

            @Override // X.InterfaceC19330810jy
            public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
                return null;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LIZ(int i2, InnerPushMessage innerPushMessage) {
                Activity activityLIZIZ;
                Activity activityLIZ;
                InnerPushUITemplate uiTemplate;
                String str;
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null || innerPushMessage == null || (uiTemplate = innerPushMessage.getUiTemplate()) == null || (str = uiTemplate.rightSchemaUrl) == null) {
                    return false;
                }
                SmartRouter.buildRoute(activityLIZ, str).open();
                return true;
            }
        };
        c442450HWp.getClass();
        if (c1908480zlO.LJIJ(1019) == null) {
            c1908480zlO.LJ(c442450HWp);
        }
    }

    @Override // X.InterfaceC896430ZEr
    public final C869590Y9l LJFF(InnerPushMessage innerPushMessage) {
        Object obj;
        C879180YeK c879180YeK;
        Map<String, Object> extrasMap = innerPushMessage.getExtrasMap();
        if (extrasMap != null) {
            obj = extrasMap.get("dm");
        } else {
            obj = null;
        }
        if (!(obj instanceof C879180YeK) || (c879180YeK = (C879180YeK) obj) == null) {
            return null;
        }
        return c879180YeK.LIZLLL;
    }

    @Override // X.InterfaceC896430ZEr
    public final boolean LJII(C0Y8T c0y8t) {
        return C878690YdX.LIZLLL(c0y8t);
    }

    @Override // X.InterfaceC896430ZEr
    public final void LIZJ(int i, List list) {
        EnumC876540Ya4 enumC876540Ya4;
        C876680YaI c876680YaI = this.LIZ;
        if (c876680YaI != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C869590Y9l c869590Y9l = (C869590Y9l) obj;
                IStreakService.LJJIIZ.getClass();
                if (C06LY.LIZ().m(c869590Y9l) || C876780YaS.LIZIZ(c869590Y9l) || (c869590Y9l != null && c869590Y9l.getMsgType() == 1823)) {
                    arrayList.add(obj);
                }
            }
            C876800YaU.LIZ(c876680YaI.LIZLLL, "try_enqueue_update_msg", C1906580ziK.LJI());
            if (i != 0) {
                if (i != 3) {
                    if (i != 9) {
                        if (i != 10) {
                            enumC876540Ya4 = EnumC876540Ya4.UNKNOWN;
                        } else {
                            enumC876540Ya4 = EnumC876540Ya4.RESHOW_UNREAD_CONVERSATION;
                        }
                    } else {
                        enumC876540Ya4 = EnumC876540Ya4.REVIEW_MSG_RECEIVED_IN_BACKGROUND;
                    }
                } else {
                    enumC876540Ya4 = EnumC876540Ya4.MIX_LINK;
                }
            } else {
                enumC876540Ya4 = EnumC876540Ya4.WEB_SOCKET_MSG;
            }
            c876680YaI.LJFF(arrayList, enumC876540Ya4);
        }
    }

    @Override // X.InterfaceC896430ZEr
    public final void LJI(C869590Y9l c869590Y9l, C0YTA c0yta) {
        C876680YaI c876680YaI = this.LIZ;
        if (c876680YaI != null && c869590Y9l != null) {
            if (C876780YaS.LIZ(c869590Y9l) && !C876780YaS.LIZIZ(c869590Y9l)) {
                return;
            }
            C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZJ(c869590Y9l.getConversationId(), new C914130Ztb(c0yta, c869590Y9l, c876680YaI, 9));
        }
    }

    @Override // X.InterfaceC896430ZEr
    public final void LJIIJ(String str, Lifecycle lifecycle) {
        lifecycle.addObserver(new IMInnerPushServiceImpl$injectLifecycleObserverToSwitchMode$1(this, str));
    }

    @Override // X.InterfaceC896430ZEr
    public final void LJIIL(int i, List list) {
        EnumC876540Ya4 enumC876540Ya4;
        C876680YaI c876680YaI = this.LIZ;
        if (c876680YaI != null) {
            C876800YaU.LIZ(c876680YaI.LIZLLL, "try_enqueue_new_msg", C1906580ziK.LJI());
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C869590Y9l c869590Y9l = (C869590Y9l) obj;
                if (!C876780YaS.LIZ(c869590Y9l) || C876780YaS.LIZIZ(c869590Y9l)) {
                    arrayList.add(obj);
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (i != 9) {
                        if (i != 10) {
                            enumC876540Ya4 = EnumC876540Ya4.UNKNOWN;
                        } else {
                            enumC876540Ya4 = EnumC876540Ya4.RESHOW_UNREAD_CONVERSATION;
                        }
                    } else {
                        enumC876540Ya4 = EnumC876540Ya4.REVIEW_MSG_RECEIVED_IN_BACKGROUND;
                    }
                } else {
                    enumC876540Ya4 = EnumC876540Ya4.MIX_LINK;
                }
            } else {
                enumC876540Ya4 = EnumC876540Ya4.WEB_SOCKET_MSG;
            }
            c876680YaI.LJFF(arrayList, enumC876540Ya4);
        }
    }

    @Override // X.InterfaceC896430ZEr
    public final void LIZLLL(int i, String str, String str2, boolean z) {
        C876680YaI c876680YaI;
        C876900Yae.LIZ.LJI(i, str, str2);
        if (z && (c876680YaI = this.LIZ) != null) {
            c876680YaI.LIZJ().getClass();
            C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
            if (c1908480zlO.LJIIJJI()) {
                c1908480zlO.LIZ("DM push business call");
            }
        }
    }
}
