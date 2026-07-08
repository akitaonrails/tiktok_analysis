package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.SplashBgInflate;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.commercialize.topview.TopViewAwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cvf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1030730cvf implements InterfaceC1018310cbd {
    public final /* synthetic */ Context LIZ;

    public C1030730cvf(Context context) {
        this.LIZ = context;
    }

    public static final boolean LIZ(C2212201Bi6 c2212201Bi6, boolean z) {
        int endTime;
        TopViewAwemeRawAd topViewAwemeRawAdLIZIZ;
        AwemeSplashInfo splashInfo;
        String strValueOf = String.valueOf(c2212201Bi6.LLLFFI);
        if (c2212201Bi6.LLJIJIL == 2) {
            strValueOf = String.valueOf(c2212201Bi6.LLJI);
        }
        C1018150cbN c1018150cbNLIZJ = C1018150cbN.LIZJ();
        c1018150cbNLIZJ.getClass();
        boolean z2 = false;
        if (!TextUtils.isEmpty(strValueOf)) {
            Npth.addTags(C2097908Jt.LIZJ(new Pair("topview_pick_ad_id", strValueOf)));
            Npth.addTag("ad_topview", String.valueOf(0));
        }
        C1031100cwG.LIZ().LJIIIIZZ();
        if (C1018150cbN.LJI()) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: filter by low device");
        } else {
            InterfaceC1018210cbT interfaceC1018210cbTLJ = C1018150cbN.LJ(strValueOf);
            if (interfaceC1018210cbTLJ == null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("show_failed_reason", "2");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
                C20684815ws.LJIJ("topview_show_failed", jSONObject);
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme null");
            } else {
                AwemeSplashInfo awemeSplashInfoLJJJI = C1017070cZd.LJJJI(interfaceC1018210cbTLJ);
                if (awemeSplashInfoLJJJI != null) {
                    endTime = awemeSplashInfoLJJJI.getEndTime();
                } else {
                    endTime = 0;
                }
                if (endTime < System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                    TroubleshootingLogDelegate troubleshootingLogDelegate = TroubleshootingLogDelegate.INSTANCE;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TopView not show reason: aweme past data");
                    sbLIZ.append(strValueOf);
                    troubleshootingLogDelegate.awesomeSplashLog(C2188811AlT.LIZIZ(sbLIZ));
                    C1018150cbN.LJIIJJI(interfaceC1018210cbTLJ.LIZIZ(), EnumC1030740cvg.EXPIRED);
                    C1018230cbV.LIZIZ(interfaceC1018210cbTLJ, "5", false);
                    C1018150cbN.LJIIL(interfaceC1018210cbTLJ, false, z);
                } else if (!C1031100cwG.LIZ().LJIJJLI(interfaceC1018210cbTLJ)) {
                    TroubleshootingLogDelegate troubleshootingLogDelegate2 = TroubleshootingLogDelegate.INSTANCE;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("TopView not show reason: aweme not vaild");
                    sbLIZ2.append(strValueOf);
                    troubleshootingLogDelegate2.awesomeSplashLog(C2188811AlT.LIZIZ(sbLIZ2));
                    C1018150cbN.LJIIIZ(interfaceC1018210cbTLJ);
                    C1018150cbN.LJIIL(interfaceC1018210cbTLJ, false, z);
                } else if (C1035180d2q.LIZ) {
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: open from push");
                    C1018150cbN.LJIIJJI(interfaceC1018210cbTLJ.LIZIZ(), EnumC1030740cvg.NOT_RIGHT_SCENE);
                    C1018150cbN.LJIIL(interfaceC1018210cbTLJ, false, z);
                    C1018230cbV.LIZIZ(interfaceC1018210cbTLJ, "2", false);
                } else if (!C1030680cva.LJ && C1017070cZd.LLJ(interfaceC1018210cbTLJ)) {
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: disable hot start");
                    C1018150cbN.LJIIJJI(interfaceC1018210cbTLJ.LIZIZ(), EnumC1030740cvg.DISABLE_HOT_START);
                    C1018150cbN.LJIIL(interfaceC1018210cbTLJ, false, z);
                    C1018230cbV.LIZIZ(interfaceC1018210cbTLJ, "7", false);
                } else if (C1030680cva.LJ && !C1030680cva.LJFF) {
                    ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LJIIIZ().isEnabled();
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: not from launcher");
                    C1018150cbN.LJIIJJI(interfaceC1018210cbTLJ.LIZIZ(), EnumC1030740cvg.NOT_RIGHT_SCENE);
                    C1018150cbN.LJIIL(interfaceC1018210cbTLJ, false, z);
                    C1018230cbV.LIZIZ(interfaceC1018210cbTLJ, "2", false);
                } else if (!C1030680cva.LJIIIZ) {
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: main activity not on feed");
                    C1018150cbN.LJIIJJI(interfaceC1018210cbTLJ.LIZIZ(), EnumC1030740cvg.NOT_RIGHT_SCENE);
                    C1018150cbN.LJIIL(interfaceC1018210cbTLJ, false, z);
                    C1018230cbV.LIZIZ(interfaceC1018210cbTLJ, "2", false);
                } else if (!C1030680cva.LJ && !C1031100cwG.LIZ().LJJIJ()) {
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: main activity not on top");
                    C1018150cbN.LJIIJJI(interfaceC1018210cbTLJ.LIZIZ(), EnumC1030740cvg.NOT_RIGHT_SCENE);
                    C1018150cbN.LJIIL(interfaceC1018210cbTLJ, false, z);
                    C1018230cbV.LIZIZ(interfaceC1018210cbTLJ, "2", false);
                } else {
                    AwemeSplashInfo awemeSplashInfoLJJJI2 = C1017070cZd.LJJJI(interfaceC1018210cbTLJ);
                    if (awemeSplashInfoLJJJI2 == null) {
                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme splash info null");
                        C1018150cbN.LJIIIZ(interfaceC1018210cbTLJ);
                        C1018150cbN.LJIIL(interfaceC1018210cbTLJ, false, z);
                    } else if (awemeSplashInfoLJJJI2.isInvalidAd()) {
                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme data invalid");
                        C1018150cbN.LJIIJJI(interfaceC1018210cbTLJ.LIZIZ(), EnumC1030740cvg.INVALID_AWEME);
                        C1018150cbN.LJIIL(interfaceC1018210cbTLJ, false, z);
                        C1018230cbV.LIZIZ(interfaceC1018210cbTLJ, "4", false);
                    } else if (!((Boolean) C1018150cbN.LJFF(interfaceC1018210cbTLJ).first).booleanValue()) {
                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: data not available");
                        C1018150cbN.LJIIL(interfaceC1018210cbTLJ, false, z);
                    } else if (awemeSplashInfoLJJJI2.getHotShowType() == 1 && C1030680cva.LJIIJ) {
                        C1018150cbN.LJIIJJI(interfaceC1018210cbTLJ.LIZIZ(), EnumC1030740cvg.NOT_RIGHT_SCENE);
                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: not right scene because comment/share/dislike panel is showing");
                        C1018150cbN.LJIIL(interfaceC1018210cbTLJ, false, z);
                        C1018230cbV.LIZIZ(interfaceC1018210cbTLJ, "2", false);
                    } else {
                        C1018150cbN.LJIIL(interfaceC1018210cbTLJ, true, z);
                        c1018150cbNLIZJ.LIZLLL(strValueOf);
                        if (z) {
                            C1030680cva.LJIIJJI = strValueOf;
                            C1030790cvl.LIZ.getClass();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("removeCacheData: ");
                            sbLIZ3.append(strValueOf);
                            C2188811AlT.LIZIZ(sbLIZ3);
                            if (strValueOf != null && strValueOf.length() != 0) {
                                ArrayList arrayListLIZ = C1030790cvl.LIZ(false);
                                if (arrayListLIZ != null && !arrayListLIZ.isEmpty()) {
                                    Iterator it2 = arrayListLIZ.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            C1030780cvk c1030780cvk = (C1030780cvk) it2.next();
                                            if (Intrinsics.LJFF(c1030780cvk.LIZ, strValueOf)) {
                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                sbLIZ4.append("removeCacheData: ");
                                                sbLIZ4.append(strValueOf);
                                                sbLIZ4.append(", remove ");
                                                sbLIZ4.append(c1030780cvk);
                                                C2188811AlT.LIZIZ(sbLIZ4);
                                                arrayListLIZ.remove(c1030780cvk);
                                                StringBuffer stringBuffer = new StringBuffer();
                                                if (arrayListLIZ.isEmpty()) {
                                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                    sbLIZ5.append("removeCacheData: ");
                                                    sbLIZ5.append(strValueOf);
                                                    sbLIZ5.append(", bsDataList is empty after remove");
                                                    C2188811AlT.LIZIZ(sbLIZ5);
                                                } else {
                                                    Iterator it3 = arrayListLIZ.iterator();
                                                    while (it3.hasNext()) {
                                                        stringBuffer.append(((C1030780cvk) it3.next()).toString());
                                                        stringBuffer.append(",");
                                                    }
                                                }
                                                Keva.getRepo("top_view_brand_safety_cache_sp").storeString("top_view_brand_safety_show_info", stringBuffer.toString());
                                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                sbLIZ6.append("removeCacheData: ");
                                                sbLIZ6.append(strValueOf);
                                                sbLIZ6.append(", save ");
                                                sbLIZ6.append((Object) stringBuffer);
                                                C2188811AlT.LIZIZ(sbLIZ6);
                                            }
                                        } else {
                                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                            sbLIZ7.append("removeCacheData: ");
                                            sbLIZ7.append(strValueOf);
                                            sbLIZ7.append(", shownAweme is null");
                                            C2188811AlT.LIZIZ(sbLIZ7);
                                            break;
                                        }
                                    }
                                } else {
                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                    sbLIZ8.append("removeCacheData: ");
                                    sbLIZ8.append(strValueOf);
                                    sbLIZ8.append(", bsDataList.isNullOrEmpty");
                                    C2188811AlT.LIZIZ(sbLIZ8);
                                }
                            }
                            C1030680cva.LJI = strValueOf;
                            C799900VZk.LIZ.getClass();
                            C799890VZj c799890VZj = new C799890VZj();
                            SplashBgInflate splashBgInflateLIZ = ((ISplashAdService) ServiceManager.get().getService(ISplashAdService.class)).LIZ();
                            Objects.requireNonNull(splashBgInflateLIZ);
                            c799890VZj.LIZ(splashBgInflateLIZ);
                            c799890VZj.LIZIZ();
                            TopViewAwemeRawAd topViewAwemeRawAdLJIJJLI = C1017070cZd.LJIJJLI(interfaceC1018210cbTLJ);
                            if (topViewAwemeRawAdLJIJJLI != null && (splashInfo = topViewAwemeRawAdLJIJJLI.getSplashInfo()) != null && splashInfo.isDisableHotStartShow()) {
                                C1030680cva.LJII = topViewAwemeRawAdLJIJJLI.getAdId();
                            }
                        }
                        String string = null;
                        C1018230cbV.LIZIZ(interfaceC1018210cbTLJ, null, true);
                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView data ready");
                        z2 = true;
                        if (z) {
                            C1030680cva.LJIIIIZZ = c2212201Bi6.LLJILJIL;
                            Npth.addTag("ad_topview", String.valueOf(1));
                            ISplashAdService iSplashAdService = (ISplashAdService) ServiceManager.get().getService(ISplashAdService.class);
                            InterfaceC1018210cbT interfaceC1018210cbT = C1018150cbN.LIZJ().LIZ;
                            if (iSplashAdService != null && interfaceC1018210cbT != null && (topViewAwemeRawAdLIZIZ = interfaceC1018210cbT.LIZIZ()) != null) {
                                if (topViewAwemeRawAdLIZIZ.getAdId() != null) {
                                    string = topViewAwemeRawAdLIZIZ.getAdId().toString();
                                }
                                iSplashAdService.LJJIZ().LJ(string, topViewAwemeRawAdLIZIZ.getCreativeIdStr());
                                return true;
                            }
                        }
                        return z2;
                    }
                }
            }
        }
        Npth.removeTag("ad_topview");
        return z2;
    }
}
