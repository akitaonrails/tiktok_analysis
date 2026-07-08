package X;

import Y.ARunnableS72S0200000_3;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS341S0000000_19;

/* JADX INFO: renamed from: X.0ibS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248840ibS {
    public static final C1248840ibS LIZ = new C1248840ibS();
    public static final ExecutorService LIZIZ = C786410Ut5.i4(new ThreadFactory() { // from class: X.0iiD
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            BPEAThread bPEAThread = new BPEAThread(runnable);
            ThreadMethodProxy.setName(bPEAThread, "report_collect_thread");
            return bPEAThread;
        }
    });

    public static void LIZJ(ProfileComponents profileComponents, String str, boolean z, boolean z2) {
        List<EventParams> list;
        if (profileComponents != null && (list = profileComponents.eventParams) != null) {
            for (EventParams eventParams : list) {
                if (eventParams != null) {
                    Integer num = eventParams.type;
                    int type = C09YG.TYPE_INFO_COLLECT.getType();
                    if (num != null && num.intValue() == type) {
                        n nVar = eventParams.bizParams;
                        C1248840ibS c1248840ibS = LIZ;
                        C1248360iag c1248360iag = new C1248360iag(profileComponents, str, z, z2);
                        c1248840ibS.getClass();
                        LIZIZ.submit(new ARunnableS72S0200000_3(nVar, c1248360iag, 35));
                    }
                }
            }
        }
    }

    public static void LIZ(C1248840ibS c1248840ibS, int i, List list, InterfaceC1631620sYq interfaceC1631620sYq, int i2) {
        boolean z;
        Integer num;
        String str;
        n nVar;
        String string;
        if ((i2 & 8) != 0) {
            interfaceC1631620sYq = AFwS341S0000000_19.get$arr$(6);
        }
        c1248840ibS.getClass();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                EventParams eventParams = (EventParams) it2.next();
                if (eventParams != null) {
                    Integer num2 = eventParams.type;
                    if (num2 != null && num2.intValue() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Object objLIZJ = null;
                    if (z && i != C09YG.TYPE_DETAIL.getType()) {
                        Integer numValueOf = Integer.valueOf(i);
                        if (eventParams != null) {
                            str = eventParams.event;
                            nVar = eventParams.bizParams;
                        } else {
                            str = null;
                            nVar = null;
                        }
                        Map map = (Map) interfaceC1631620sYq.invoke(numValueOf, str, nVar);
                        n nVar2 = eventParams.bizParams;
                        if (nVar2 != null && (string = nVar2.toString()) != null) {
                            objLIZJ = (Map) C08JS.LIZ(string, new LinkedHashMap().getClass());
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (objLIZJ != null) {
                            linkedHashMap.putAll(objLIZJ);
                        }
                        if (map != null) {
                            linkedHashMap.putAll(map);
                        }
                        C1251280ifO.LIZ(eventParams.event, linkedHashMap);
                    } else if (eventParams != null && (num = eventParams.type) != null && num.intValue() == i && i == C09YG.TYPE_DETAIL.getType()) {
                        C1249240ic6 c1249240ic6 = C1249240ic6.LIZ;
                        n nVar3 = eventParams.bizParams;
                        if (nVar3 != null) {
                            objLIZJ = C2399609ak.LIZJ(nVar3, Scene.SCENE_SERVICE);
                        }
                        c1249240ic6.getClass();
                        if (objLIZJ != null) {
                            C1249240ic6.LIZIZ.add((String) objLIZJ);
                        }
                    }
                }
            }
        }
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("uid", str2);
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
        C0XQ7.LJ();
        c2344009Gk.LJIIIIZZ("login_user_id", C0XQ7.LIZ.LJIIJ().getCurUserId());
        if (z) {
            str5 = "personal_homepage";
        } else {
            str5 = "others_homepage";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str5);
        c2344009Gk.LJIIIIZZ("container_name", str3);
        if (C123100dR.LIZ(str4)) {
            c2344009Gk.LJFF("log_id", str4);
        }
        C20684815ws.LJIILLIIL("profile_necessary_component_not_appear", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3, ProfileComponents profileComponents, C1252480ihK c1252480ihK, int i, Function2 function2) {
        String str4;
        List<EventParams> list;
        EventParams next;
        n nVar = null;
        if (profileComponents != null && (list = profileComponents.eventParams) != null) {
            Iterator<EventParams> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    EventParams eventParams = next;
                    if (eventParams != null) {
                        Integer num = eventParams.type;
                        int type = C09YG.TYPE_INFO_CLICK.getType();
                        if (num != null && num.intValue() == type) {
                            break;
                        }
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EventParams eventParams2 = next;
            if (eventParams2 != null) {
                nVar = eventParams2.bizParams;
            }
        }
        try {
            Map map = (Map) C08JS.LIZ(String.valueOf(nVar), new LinkedHashMap().getClass());
            if (map != null && (str4 = (String) map.get(Scene.SCENE_SERVICE)) != null) {
                C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                String str5 = (String) map.get("component_field");
                if (str5 == null && (profileComponents == null || (str5 = profileComponents.componentId) == null)) {
                    str5 = "";
                }
                Map map2 = (Map) function2.invoke(Integer.valueOf(C09YG.TYPE_INFO_CLICK.getType()), "profile_info_click");
                c1253930ijf.getClass();
                C1253930ijf.LJJII(str, str3, str2, str4, str5, map2, c1252480ihK, i);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
