package Y;

import X.AbstractC202127146z;
import X.AbstractC2225271C7p;
import X.C09ZS;
import X.C0VSJ;
import X.C146T;
import X.C1909907dx;
import X.C19719512Dh;
import X.C1BJL;
import X.C1C7R;
import X.C1C7U;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2189931AnH;
import X.C2194231AuD;
import X.C2201221BDc;
import X.C2202711BIv;
import X.C2204701BQm;
import X.C2204721BQo;
import X.C2206521BXm;
import X.C2225431C8f;
import X.C2238191Civ;
import X.C2247231CxV;
import X.C2247241CxW;
import X.C736460Sui;
import X.C844470XAv;
import X.EnumC2206581BXs;
import X.EnumC2225211C7j;
import android.text.TextUtils;
import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.bytedance.ies.web.jsbridge2.WebViewBridge;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.EventParam;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.OutreachBannerData;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes35.dex */
public class ARunnableS38S1100000_34 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() throws JSONException {
        String strLJII;
        IMiniGameRuntimeAPI iMiniGameRuntimeAPINT;
        MiniGameFragment miniGameFragment;
        IMiniGameRuntimeAPI iMiniGameRuntimeAPINT2;
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF("local_test", C844470XAv.LJIILL) && (miniGameFragment = ((C2194231AuD) this.l1).LIZ.get()) != null && (iMiniGameRuntimeAPINT2 = miniGameFragment.nT()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("debug_log_");
            C09ZS.LIZ.getClass();
            sbLIZ.append("native_runtime_server/game/scripts/ttmg-core.js.zip");
            iMiniGameRuntimeAPINT2.executeJSScript("globalThis.__CLIENT_ENV__ = { logEnable: true }", C2188811AlT.LIZIZ(sbLIZ));
        }
        MiniGameFragment miniGameFragment2 = ((C2194231AuD) this.l1).LIZ.get();
        if (miniGameFragment2 != null && (iMiniGameRuntimeAPINT = miniGameFragment2.nT()) != null) {
            String str = this.s0;
            C09ZS.LIZ.getClass();
            iMiniGameRuntimeAPINT.executeJSScript(str, "native_runtime_server/game/scripts/ttmg-core.js.zip");
        }
        MiniGameFragment miniGameFragment3 = ((C2194231AuD) this.l1).LIZ.get();
        if (miniGameFragment3 != null) {
            MiniGameFragment miniGameFragment4 = ((C2194231AuD) this.l1).LIZ.get();
            if (miniGameFragment4 != null) {
                SchemaParserData schemaParserData = miniGameFragment4.LLJJL;
                strLJII = schemaParserData != null ? schemaParserData.LJII() : "__GAME__";
            } else {
                strLJII = "";
            }
            miniGameFragment3.GT(strLJII);
        }
    }

    public final void LIZ$1() {
        EventParam next;
        C2238191Civ c2238191Civ = C2238191Civ.LIZ;
        String str = ((OutreachBannerData) this.l1).key;
        c2238191Civ.getClass();
        C2238191Civ.LJ(0, str);
        C2238191Civ.LIZLLL(null, ((OutreachBannerData) this.l1).key);
        List<EventParam> list = ((OutreachBannerData) this.l1).eventParams;
        if (list != null) {
            Iterator<EventParam> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                EventParam eventParam = next;
                Integer num = eventParam.type;
                if (num != null && num.intValue() == 4 && C736460Sui.LIZIZ(eventParam.event)) {
                    break;
                }
            }
            EventParam eventParam2 = next;
            if (eventParam2 != null) {
                String str2 = this.s0;
                Map<String, String> map = eventParam2.bizParams;
                if (C19719512Dh.LJII(map) && map != null) {
                    map.put("enter_from", "personal_homepage");
                    map.put("outreach_click_type", str2);
                }
                C20684815ws.LJIILLIIL(eventParam2.event, eventParam2.bizParams);
            }
        }
    }

    public static final void run$0(ARunnableS38S1100000_34 aRunnableS38S1100000_34) {
        boolean zLIZ;
        C1C7U.LIZ("WebViewBridge@36f0.invokeCallback$1");
        try {
            if (!((WebViewBridge) aRunnableS38S1100000_34.l1).LJFF) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invoking Jsb using evaluateJavascript: ");
                sbLIZ.append(aRunnableS38S1100000_34.s0);
                C2188811AlT.LIZIZ(sbLIZ);
                ((WebViewBridge) aRunnableS38S1100000_34.l1).LJIIL.evaluateJavascript(aRunnableS38S1100000_34.s0, null);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WebViewBridge@36f0.invokeCallback$1");
    }

    public static final void run$1(ARunnableS38S1100000_34 aRunnableS38S1100000_34) {
        C2206521BXm c2206521BXm = (C2206521BXm) aRunnableS38S1100000_34.l1;
        String str = aRunnableS38S1100000_34.s0;
        c2206521BXm.getClass();
        C1C7U.LIZ("EngineServiceImpl@b46d.invoke$1L");
        c2206521BXm.LIZLLL(str, EnumC2206581BXs.BACKGROUND);
        C1C7U.LIZIZ("EngineServiceImpl@b46d.invoke$1L");
    }

    public static final void run$10(ARunnableS38S1100000_34 aRunnableS38S1100000_34) {
        File[] fileArrListFiles;
        String str = aRunnableS38S1100000_34.s0;
        AbstractC2225271C7p abstractC2225271C7p = (AbstractC2225271C7p) aRunnableS38S1100000_34.l1;
        C1C7U.LIZ("BaseAttribution$init$8@bef0.onCallback$1L");
        File parentFile = new C0VSJ(str).getParentFile();
        if (parentFile != null && (fileArrListFiles = parentFile.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                C1C7R.LIZ.getClass();
                ArrayList arrayListLIZ = C1C7R.LIZ(file);
                String strLIZIZ = abstractC2225271C7p.LIZ;
                AbstractC202127146z abstractC202127146z = abstractC2225271C7p.LIZIZ;
                if (abstractC202127146z != null) {
                    strLIZIZ = abstractC202127146z.LIZIZ(strLIZIZ);
                }
                if (abstractC2225271C7p.LJIIIZ) {
                    C2225431C8f.LIZ(arrayListLIZ, 0, strLIZIZ, EnumC2225211C7j.NativeStack, true);
                }
                if (C146T.LIZIZ.LJ == null) {
                    file.delete();
                }
            }
        }
        C1C7U.LIZIZ("BaseAttribution$init$8@bef0.onCallback$1L");
    }

    public static final void run$11(ARunnableS38S1100000_34 aRunnableS38S1100000_34) {
        String str = aRunnableS38S1100000_34.s0;
        ArrayList arrayList = (ArrayList) aRunnableS38S1100000_34.l1;
        C1C7U.LIZ("CustomAttribution@7147.reportCpu$1L");
        C1C7R.LIZ.getClass();
        C2225431C8f.LIZ(C1C7R.LIZIZ(str, arrayList), arrayList.size(), "cpu_sched_event", EnumC2225211C7j.Custom, false);
        C1C7U.LIZIZ("CustomAttribution@7147.reportCpu$1L");
    }

    public static final void run$12(ARunnableS38S1100000_34 aRunnableS38S1100000_34) {
        String str = aRunnableS38S1100000_34.s0;
        C2202711BIv c2202711BIv = (C2202711BIv) aRunnableS38S1100000_34.l1;
        C1C7U.LIZ("LoginButton@e48b.checkToolTipSettings$1L");
        c2202711BIv.getActivity().runOnUiThread(new ARunnableS103S0200000_34(c2202711BIv, C1BJL.LJI(str), 53));
        C1C7U.LIZIZ("LoginButton@e48b.checkToolTipSettings$1L");
    }

    public static final void run$2(ARunnableS38S1100000_34 aRunnableS38S1100000_34) {
        boolean zLIZ;
        C1C7U.LIZ("PermissionConfigRepository@e3b5.doPostForWhiteList$1$onSucceed$1");
        try {
            C2204701BQm.LIZLLL(aRunnableS38S1100000_34.s0, "from_network", ((C2204721BQo) aRunnableS38S1100000_34.l1).LIZJ.LJ);
            C2204721BQo c2204721BQo = (C2204721BQo) aRunnableS38S1100000_34.l1;
            c2204721BQo.LIZJ.LIZJ(false, aRunnableS38S1100000_34.s0, c2204721BQo.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PermissionConfigRepository@e3b5.doPostForWhiteList$1$onSucceed$1");
    }

    public static final void run$3(ARunnableS38S1100000_34 aRunnableS38S1100000_34) {
        boolean zLIZ;
        C2189931AnH c2189931AnHLIZ;
        HashMap<String, Object> map;
        C1C7U.LIZ("NavigationModule@c665.navigateTo$1");
        try {
            new HashMap();
            ReadableMap readableMap = (ReadableMap) aRunnableS38S1100000_34.l1;
            if (readableMap != null) {
                readableMap.asHashMap();
            }
            C2201221BDc c2201221BDc = C2201221BDc.LIZIZ;
            String str = aRunnableS38S1100000_34.s0;
            c2201221BDc.getClass();
            if (!TextUtils.isEmpty(str) && (c2189931AnHLIZ = c2201221BDc.LIZ()) != null && (map = c2189931AnHLIZ.LIZ) != null) {
                Object obj = map.get(str);
                if (obj instanceof String) {
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NavigationModule@c665.navigateTo$1");
    }

    public static final void run$4(ARunnableS38S1100000_34 aRunnableS38S1100000_34) {
        boolean zLIZ;
        C2189931AnH c2189931AnHLIZ;
        HashMap<String, Object> map;
        C1C7U.LIZ("NavigationModule@c665.replace$1");
        try {
            new HashMap();
            ReadableMap readableMap = (ReadableMap) aRunnableS38S1100000_34.l1;
            if (readableMap != null) {
                readableMap.asHashMap();
            }
            C2201221BDc c2201221BDc = C2201221BDc.LIZIZ;
            String str = aRunnableS38S1100000_34.s0;
            c2201221BDc.getClass();
            if (!TextUtils.isEmpty(str) && (c2189931AnHLIZ = c2201221BDc.LIZ()) != null && (map = c2189931AnHLIZ.LIZ) != null) {
                Object obj = map.get(str);
                if (obj instanceof String) {
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NavigationModule@c665.replace$1");
    }

    public static final void run$5(ARunnableS38S1100000_34 aRunnableS38S1100000_34) {
        boolean zLIZ;
        C1C7U.LIZ("MiniGameFragment$LaunchResultListenerImpl@cf51.onSuccess$1$onLoadCoreJSFinish$1");
        try {
            aRunnableS38S1100000_34.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniGameFragment$LaunchResultListenerImpl@cf51.onSuccess$1$onLoadCoreJSFinish$1");
    }

    public static final void run$6(ARunnableS38S1100000_34 aRunnableS38S1100000_34) throws IOException {
        C2247231CxV c2247231CxV = (C2247231CxV) aRunnableS38S1100000_34.l1;
        String str = aRunnableS38S1100000_34.s0;
        C1C7U.LIZ("BDASplashOSVideoController@9464.play$1L");
        C2247241CxW c2247241CxW = c2247231CxV.LLILLJJLI;
        c2247241CxW.LIZIZ.setDataSource(str);
        c2247241CxW.LIZ = 1;
        c2247241CxW.LIZIZ.setVideoScalingMode(2);
        C2247241CxW c2247241CxW2 = c2247231CxV.LLILLJJLI;
        c2247241CxW2.LIZ = 3;
        c2247241CxW2.LIZIZ.prepareAsync();
        C1C7U.LIZIZ("BDASplashOSVideoController@9464.play$1L");
    }

    public static final void run$7(ARunnableS38S1100000_34 aRunnableS38S1100000_34) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileOutreachBannerTracker@e3d7.recordClick$1");
        try {
            aRunnableS38S1100000_34.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileOutreachBannerTracker@e3d7.recordClick$1");
    }

    public static final void run$8(ARunnableS38S1100000_34 aRunnableS38S1100000_34) {
        String str = aRunnableS38S1100000_34.s0;
        AbstractC2225271C7p abstractC2225271C7p = (AbstractC2225271C7p) aRunnableS38S1100000_34.l1;
        C1C7U.LIZ("BaseAttribution$init$4@bef4.onThreadCallback$1L");
        C1C7R.LIZ.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        if (str.length() > 0) {
            HashMap map = new HashMap();
            int i2 = 0;
            int i3 = 0;
            for (String str2 : a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6)) {
                int i4 = i2 + 1;
                char[] cArr = new char[i];
                cArr[0] = ':';
                List listLJJLIIIJ = a0.LJJLIIIJ(str2, cArr, false, 0, 6);
                if (listLJJLIIIJ.size() == 2) {
                    try {
                        String string = a0.LJLIIIL(C1C7R.LIZLLL((String) listLJJLIIIJ.get(0))).toString();
                        int i5 = CastIntegerProtector.parseInt((String) listLJJLIIIJ.get(i));
                        if (i2 != 0) {
                            if (i2 == i) {
                                string = "main_thread_cpu_duration";
                                try {
                                    map.put("other_thread_cpu_duration", new C1909907dx("other_thread_cpu_duration", i3 - i5));
                                } catch (Throwable th) {
                                    th = th;
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        } else {
                            string = "process_cpu_duration";
                            i3 = i5;
                        }
                        if (map.containsKey(string)) {
                            ((C1909907dx) map.get(string)).LIZIZ += (double) i5;
                        } else {
                            map.put(string, new C1909907dx(string, i5));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                i2 = i4;
                i = 1;
            }
            Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        C1C7R.LIZ.getClass();
        ArrayList arrayListLIZIZ = C1C7R.LIZIZ("thread_info_v1", arrayList);
        String strLIZIZ = abstractC2225271C7p.LIZ;
        AbstractC202127146z abstractC202127146z = abstractC2225271C7p.LIZIZ;
        if (abstractC202127146z != null) {
            strLIZIZ = abstractC202127146z.LIZIZ(strLIZIZ);
        }
        if (abstractC2225271C7p.LJIIIZ) {
            C2225431C8f.LIZ(arrayListLIZIZ, arrayList.size(), strLIZIZ, EnumC2225211C7j.Custom, false);
        }
        C1C7U.LIZIZ("BaseAttribution$init$4@bef4.onThreadCallback$1L");
    }

    public static final void run$9(ARunnableS38S1100000_34 aRunnableS38S1100000_34) {
        File[] fileArrListFiles;
        String str = aRunnableS38S1100000_34.s0;
        AbstractC2225271C7p abstractC2225271C7p = (AbstractC2225271C7p) aRunnableS38S1100000_34.l1;
        C1C7U.LIZ("BaseAttribution$init$7@bef1.onCallback$1L");
        File parentFile = new C0VSJ(str).getParentFile();
        if (parentFile != null && (fileArrListFiles = parentFile.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                C1C7R.LIZ.getClass();
                ArrayList arrayListLIZ = C1C7R.LIZ(file);
                String strLIZIZ = abstractC2225271C7p.LIZ;
                AbstractC202127146z abstractC202127146z = abstractC2225271C7p.LIZIZ;
                if (abstractC202127146z != null) {
                    strLIZIZ = abstractC202127146z.LIZIZ(strLIZIZ);
                }
                if (abstractC2225271C7p.LJIIIZ) {
                    C2225431C8f.LIZ(arrayListLIZ, 0, strLIZIZ, EnumC2225211C7j.JavaBackStack, true);
                }
                if (C146T.LIZIZ.LJ == null) {
                    file.delete();
                }
            }
        }
        C1C7U.LIZIZ("BaseAttribution$init$7@bef1.onCallback$1L");
    }

    public ARunnableS38S1100000_34(ArrayList arrayList, int i) {
        this.$t = i;
        this.s0 = "tiktok_cpu_sched_futex_wait_java_stack";
        this.l1 = arrayList;
    }

    public ARunnableS38S1100000_34(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
