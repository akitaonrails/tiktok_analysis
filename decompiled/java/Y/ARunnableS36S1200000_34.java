package Y;

import X.AbstractC202127146z;
import X.AbstractC2204751BQr;
import X.AbstractC2225271C7p;
import X.C1304490k3D;
import X.C1304500k3E;
import X.C1699620uKW;
import X.C19719512Dh;
import X.C1B2T;
import X.C1B2U;
import X.C1B2Y;
import X.C1B8K;
import X.C1BRG;
import X.C1BWL;
import X.C1C7R;
import X.C1C7U;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2195221Avo;
import X.C2197141Ayu;
import X.C2198411B2h;
import X.C2199711B7h;
import X.C2204761BQs;
import X.C2204811BQx;
import X.C2225431C8f;
import X.C259800zU;
import X.C736460Sui;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC2225211C7j;
import X.EnumC636920OyY;
import X.InterfaceC2200001B8k;
import Y.ARunnableS112S0100000_12;
import android.app.Activity;
import android.app.Application;
import android.graphics.Rect;
import android.text.TextUtils;
import com.bytedance.amg.minigameruntime.api.GameDirectoryConfig;
import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.bytedance.amg.minigameruntime.api.IClientLogger;
import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.bytedance.amg.minigameruntime.api.JsEngineType;
import com.bytedance.hybrid.web.extension.seclink.config.SeclinkPetConfigSettings;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings;
import com.ss.android.ugc.aweme.minis.viewmodel.NativeGameViewModel;
import com.ss.android.ugc.aweme.minis.viewmodel.SingleLiveEvent;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.EventParam;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.OutreachBannerData;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class ARunnableS36S1200000_34 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C2204761BQs c2204761BQsLIZIZ;
        if (((AbstractC2204751BQr) this.l2).LJFF) {
            return;
        }
        try {
            c2204761BQsLIZIZ = ((AbstractC2204751BQr) this.l2).LIZIZ(new JSONObject(this.s0));
            if (c2204761BQsLIZIZ != null) {
                ((CopyOnWriteArrayList) c2204761BQsLIZIZ.LJIIL).add((TimeLineEvent) this.l1);
                if (c2204761BQsLIZIZ != null && c2204761BQsLIZIZ.LIZ == 1 && !TextUtils.isEmpty(c2204761BQsLIZIZ.LIZLLL) && !TextUtils.isEmpty(c2204761BQsLIZIZ.LJ)) {
                    ((AbstractC2204751BQr) this.l2).LJI(c2204761BQsLIZIZ);
                    return;
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            c2204761BQsLIZIZ = null;
        }
        Objects.toString(c2204761BQsLIZIZ);
        if (c2204761BQsLIZIZ != null) {
            C2204811BQx c2204811BQx = new C2204811BQx();
            c2204811BQx.LIZJ(this.s0, "value");
            c2204811BQx.LIZJ("call_invalid_1", "reason");
            c2204811BQx.LIZ("label_abstract_bridge_reject", c2204761BQsLIZIZ.LJIIL);
            AbstractC2204751BQr abstractC2204751BQr = (AbstractC2204751BQr) this.l2;
            abstractC2204751BQr.LIZ(3, abstractC2204751BQr.LJFF(), c2204761BQsLIZIZ.LIZLLL, "call_invalid_1", c2204761BQsLIZIZ.LJIIL);
            ((AbstractC2204751BQr) this.l2).LIZJ(C1699620uKW.LIZ(new C1BRG(c2204761BQsLIZIZ.LIZ, "Failed to parse invocation.")), c2204761BQsLIZIZ);
            ((AbstractC2204751BQr) this.l2).LJIIJJI(c2204761BQsLIZIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.1Ayu] */
    public final void LIZ$1() {
        C1304490k3D c1304490k3D;
        if (Intrinsics.LJFF(this.s0, "start")) {
            MiniGameFragment miniGameFragment = (MiniGameFragment) this.l1;
            C1304490k3D c1304490k3D2 = miniGameFragment.LLLLLLLLLL;
            if (c1304490k3D2 != null) {
                c1304490k3D2.LJ();
            }
            miniGameFragment.LLLLLLLLLL = null;
            final MiniGameFragment miniGameFragment2 = (MiniGameFragment) this.l1;
            miniGameFragment2.qT();
            if (miniGameFragment2.nT() == null) {
                Application applicationLIZ = C1BWL.LIZ();
                Activity activityHS = miniGameFragment2.hS() != null ? miniGameFragment2.hS() : null;
                Activity activityHS2 = miniGameFragment2.hS();
                if (applicationLIZ != null && activityHS != null && activityHS2 != null && (c1304490k3D = miniGameFragment2.LLLLLLLLLL) != null) {
                    miniGameFragment2.LLLFZ = true;
                    final WeakReference weakReference = new WeakReference(miniGameFragment2);
                    miniGameFragment2.N = new IClientAdapterService() { // from class: X.1Ayu
                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final long getFileSizeLimit() {
                            return 104857600L;
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final long getReadSizeLimit() {
                            return 104857600L;
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final String getAppLanguage() {
                            I18nManagerServiceApi i18nManagerServiceApiLIZ;
                            I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
                            if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
                                C844470XAv.LIZ.getClass();
                                String strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(C844470XAv.LIZ());
                                if (strLJIILJJIL != null) {
                                    return strLJIILJJIL;
                                }
                            }
                            return C786410Ut5.t2(Locale.getDefault());
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final IClientLogger getAppLogger() {
                            return miniGameFragment2.f386O;
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final GameDirectoryConfig getGameArchDirectoryConfig() {
                            miniGameFragment2.getClass();
                            return new GameDirectoryConfig(C09Z0.LIZLLL(), -1);
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final GameDirectoryConfig getGameSetupDirectoryConfig() {
                            miniGameFragment2.getClass();
                            return new GameDirectoryConfig(C09Z0.LIZIZ(), -1);
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final GameDirectoryConfig getPluginDirectoryConfig() {
                            miniGameFragment2.getClass();
                            return new GameDirectoryConfig(C09Z0.LJII(), -1);
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final Rect getSafeArea() {
                            Rect rect = new Rect();
                            Activity activityHS3 = miniGameFragment2.hS();
                            if (activityHS3 == null) {
                                return rect;
                            }
                            C2197181Ayy c2197181Ayy = C20246814Kc.LIZ(activityHS3).LIZLLL;
                            c2197181Ayy.getClass();
                            return new Rect(0, c2197181Ayy.LIZIZ, c2197181Ayy.LIZ, c2197181Ayy.LIZJ);
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final int getStatusBarHeight() {
                            Activity activityHS3 = miniGameFragment2.hS();
                            if (activityHS3 != null) {
                                return C20246814Kc.LIZ(activityHS3).LIZJ;
                            }
                            return 0;
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final GameDirectoryConfig getTempDirectoryConfig() {
                            miniGameFragment2.getClass();
                            return new GameDirectoryConfig(C09Z0.LJIIIIZZ(), -1);
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final GameDirectoryConfig getUserDirectoryConfig() {
                            miniGameFragment2.getClass();
                            return new GameDirectoryConfig(C09Z0.LJIIIZ(), -1);
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final boolean isRemoteDebugMode() {
                            SchemaParserData schemaParserData = miniGameFragment2.LLJJL;
                            return schemaParserData == null || !schemaParserData.LJIIJJI();
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final boolean checkHttpUrlValidity(String str) {
                            List<String> list;
                            NativeGameViewModel nativeGameViewModel;
                            SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
                            NetworkResponse<MinisMetaResp> value;
                            MinisMetaResp minisMetaResp;
                            MiniGameFragment miniGameFragment3 = weakReference.get();
                            if (miniGameFragment3 != null && (nativeGameViewModel = miniGameFragment3.LLLLLLLLL) != null && (singleLiveEvent = nativeGameViewModel.LLILLJJLI) != null && (value = singleLiveEvent.getValue()) != null && (minisMetaResp = value.data) != null) {
                                list = minisMetaResp.allowedDomains;
                            } else {
                                list = null;
                            }
                            return C1842210y2V.LIZ(str, list);
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final void emitRemoteJSCallBack(Number number, String str) throws JSONException {
                            C204579153h c204579153h = miniGameFragment2.LLLZIL;
                            if (c204579153h != null) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("method", "invokeHandler");
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("callbackId", number);
                                jSONObject2.put("data", str);
                                jSONObject.put("payload", jSONObject2);
                                c204579153h.LJJJJ(C786410Ut5.J3(jSONObject));
                            }
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final void emitRemoteJSEvent(String str, String str2) throws JSONException {
                            C204579153h c204579153h = miniGameFragment2.LLLZIL;
                            if (c204579153h != null) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("method", "subscribeHandler");
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("event", str);
                                jSONObject2.put("data", str2);
                                jSONObject.put("payload", jSONObject2);
                                c204579153h.LJJJJ(C786410Ut5.J3(jSONObject));
                            }
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                        public final void sendRemoteObject(String str, long j, String str2, String str3) throws JSONException {
                            C204579153h c204579153h = miniGameFragment2.LLLZIL;
                            if (c204579153h != null) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("method", "subscribeHandler");
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("event", "remoteCanvasEvent");
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("clazz", str);
                                jSONObject3.put("objectId", j);
                                jSONObject3.put("type", str2);
                                jSONObject3.put("message", str3);
                                jSONObject2.put("data", jSONObject3);
                                jSONObject.put("payload", jSONObject2);
                                c204579153h.LJJJJ(C786410Ut5.J3(jSONObject));
                            }
                        }
                    };
                    C844470XAv.LIZ.getClass();
                    c1304490k3D.LIZIZ(new C1304500k3E(applicationLIZ, activityHS2, C844470XAv.LJFF(), Intrinsics.LJFF("local_test", C844470XAv.LJIILL), MinisTtmgConfigSettings.LIZ().androidJsEngineType == 0 ? JsEngineType.V8 : JsEngineType.QUICKJS, MinisTtmgConfigSettings.LIZ().amg));
                    miniGameFragment2.P = c1304490k3D.getRuntimeCallback();
                    C2195221Avo.LJIIIZ(miniGameFragment2.nT());
                    C2197141Ayu c2197141Ayu = miniGameFragment2.N;
                    if (c2197141Ayu != null) {
                        c1304490k3D.LIZJ(c2197141Ayu, new IMiniGameRuntimeAPI.LaunchResultListener() { // from class: X.1AuB
                            @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI.LaunchResultListener
                            public final void onFirstOnScreenCanvasFrame() {
                                Activity activityHS3 = miniGameFragment2.hS();
                                if (activityHS3 != null) {
                                    activityHS3.runOnUiThread(new ARunnableS112S0100000_12(miniGameFragment2, 494));
                                }
                            }

                            @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI.LaunchResultListener
                            public final void onSuccess() {
                                String str;
                                MiniGameFragment.jT(miniGameFragment2);
                                miniGameFragment2.getClass();
                                miniGameFragment2.OT();
                                miniGameFragment2.IT();
                                try {
                                    str = (String) C23250099c.LJ(C23271099x.INSTANCE, new C2192201Aqw(miniGameFragment2, null));
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    System.out.println(Unit.LIZ);
                                    str = "";
                                }
                                IMiniGameRuntimeAPI iMiniGameRuntimeAPINT = miniGameFragment2.nT();
                                if (iMiniGameRuntimeAPINT != null) {
                                    String str2 = str != null ? str : "";
                                    C09ZS.LIZ.getClass();
                                    iMiniGameRuntimeAPINT.executeJSScript(str2, "native_runtime_server/game/scripts/ttmg-core.js.zip");
                                }
                                C0WXP c0wxp = miniGameFragment2.s;
                                if (c0wxp != null) {
                                    c0wxp.LIZ();
                                }
                            }

                            @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI.LaunchResultListener
                            public final void onFailed(Exception exc) {
                                miniGameFragment2.getClass();
                            }
                        });
                    }
                }
            }
            miniGameFragment2.hT();
        }
        ((CountDownLatch) ((C259800zU) this.l2).element).countDown();
    }

    public final void LIZ$2() {
        EventParam next;
        List<EventParam> list = ((OutreachBannerData) this.l1).eventParams;
        if (list != null) {
            Iterator<EventParam> it2 = list.iterator();
            while (true) {
                next = null;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
                EventParam eventParam = next;
                Integer num = eventParam.type;
                if (num != null && num.intValue() == 5 && C736460Sui.LIZIZ(eventParam.event)) {
                    break;
                }
            }
            EventParam eventParam2 = next;
            if (eventParam2 != null) {
                EnumC636920OyY enumC636920OyY = (EnumC636920OyY) this.l2;
                String str = this.s0;
                Map<String, String> map = eventParam2.bizParams;
                if (C19719512Dh.LJII(map) && map != null) {
                    map.put("enter_from", "personal_homepage");
                    map.put("outreach_block_strategy_type", enumC636920OyY.getType());
                    map.put("outreach_block_strategy_detail", str);
                }
                C20684815ws.LJIILLIIL(eventParam2.event, eventParam2.bizParams);
            }
        }
    }

    public final void LIZ$3() {
        try {
            C1B2Y c1b2y = ((C2198411B2h) this.l2).LIZ;
            if (c1b2y.LIZ == null || !this.s0.equals(c1b2y.LJ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSuccess url is not same with current，task url: ");
                sbLIZ.append(this.s0);
                sbLIZ.append(" urlFromOverride : ");
                sbLIZ.append(((C2198411B2h) this.l2).LIZ.LJ);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            if (!SeclinkPetConfigSettings.LIZ().enable) {
                C1B2Y c1b2y2 = ((C2198411B2h) this.l2).LIZ;
                C786410Ut5.ue(c1b2y2.LIZ, C1B2T.LIZIZ(-1, this.s0, c1b2y2.LIZIZ));
                return;
            }
            C1B2Y c1b2y3 = ((C2198411B2h) this.l2).LIZ;
            C786410Ut5.ue(c1b2y3.LIZ, C1B2T.LIZ(((C1B2U) this.l1).LIZIZ, this.s0, c1b2y3.LIZIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$4() {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS36S1200000_34.LIZ$4():void");
    }

    public static final void run$0(ARunnableS36S1200000_34 aRunnableS36S1200000_34) {
        boolean zLIZ;
        C1C7U.LIZ("AbstractBridge@7380.invokeMethod$2");
        try {
            aRunnableS36S1200000_34.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbstractBridge@7380.invokeMethod$2");
    }

    public static final void run$1(ARunnableS36S1200000_34 aRunnableS36S1200000_34) {
        boolean zLIZ;
        C1C7U.LIZ("MiniGameFragment@6eb9.initHttpServer$1$onReceiveCWD$1");
        try {
            aRunnableS36S1200000_34.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniGameFragment@6eb9.initHttpServer$1$onReceiveCWD$1");
    }

    public static final void run$2(ARunnableS36S1200000_34 aRunnableS36S1200000_34) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileOutreachBannerTracker@e3d7.recordBlockShow$1");
        try {
            aRunnableS36S1200000_34.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileOutreachBannerTracker@e3d7.recordBlockShow$1");
    }

    public static final void run$3(ARunnableS36S1200000_34 aRunnableS36S1200000_34) {
        boolean zLIZ;
        List<InetAddress> list;
        C1C7U.LIZ("DownloadDnsManager@9b19.resolveDns$1");
        try {
            InterfaceC2200001B8k interfaceC2200001B8k = (InterfaceC2200001B8k) aRunnableS36S1200000_34.l1;
            if (interfaceC2200001B8k != null) {
                String str = aRunnableS36S1200000_34.s0;
                C1B8K c1b8k = (C1B8K) aRunnableS36S1200000_34.l2;
                if (c1b8k == null) {
                    list = null;
                } else {
                    list = c1b8k.LIZ;
                }
                ((C2199711B7h) interfaceC2200001B8k).LJJII(str, list);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DownloadDnsManager@9b19.resolveDns$1");
    }

    public static final void run$4(ARunnableS36S1200000_34 aRunnableS36S1200000_34) {
        AbstractC2225271C7p abstractC2225271C7p = (AbstractC2225271C7p) aRunnableS36S1200000_34.l1;
        String str = aRunnableS36S1200000_34.s0;
        ArrayList arrayList = (ArrayList) aRunnableS36S1200000_34.l2;
        C1C7U.LIZ("BaseAttribution@cf9d.onMetricAll$1L");
        if (abstractC2225271C7p.LJIIIZ) {
            C1C7R.LIZ.getClass();
            ArrayList arrayListLIZIZ = C1C7R.LIZIZ(str, arrayList);
            String strLIZIZ = abstractC2225271C7p.LIZ;
            AbstractC202127146z abstractC202127146z = abstractC2225271C7p.LIZIZ;
            if (abstractC202127146z != null) {
                strLIZIZ = abstractC202127146z.LIZIZ(strLIZIZ);
            }
            C2225431C8f.LIZ(arrayListLIZIZ, arrayList.size(), strLIZIZ, EnumC2225211C7j.Custom, false);
            abstractC2225271C7p.LJIIIIZZ();
        }
        C1C7U.LIZIZ("BaseAttribution@cf9d.onMetricAll$1L");
    }

    public static final void run$5(ARunnableS36S1200000_34 aRunnableS36S1200000_34) {
        boolean zLIZ;
        C1C7U.LIZ("AsyncSecStrategy@144a.<field>$1$onSuccess$1");
        try {
            aRunnableS36S1200000_34.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AsyncSecStrategy@144a.<field>$1$onSuccess$1");
    }

    public static final void run$6(ARunnableS36S1200000_34 aRunnableS36S1200000_34) {
        boolean zLIZ;
        C1C7U.LIZ("DownloadNotificationService@f064.handleIntent$1");
        try {
            aRunnableS36S1200000_34.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DownloadNotificationService@f064.handleIntent$1");
    }

    public ARunnableS36S1200000_34(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.l1 = obj2;
    }
}
