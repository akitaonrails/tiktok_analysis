package X;

import Y.AObjectS241S0100000_8;
import Y.AObjectS303S0200000_8;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCEffectMessage;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationComponent;
import com.ss.android.vesdk.VERecorder;
import java.util.Map;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import lnn.q;
import mn3.e0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MnB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578910MnB extends AbstractC1622390sJx implements InterfaceC1623110sL7 {
    public final ShortVideoContext LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final InterfaceC1645720sva LLILZ;
    public final InterfaceC1648570t0B LLILZIL;
    public final InterfaceC1647420syK LLILZLL;
    public final q LLIZ;
    public final InterfaceC560310LyH LLIZLLLIL;
    public final InterfaceC579060MnQ LLJ;
    public final InterfaceC1650230t2r LLJI;
    public final Class<Object> LLJIJIL;
    public boolean LLJILJIL;
    public Effect LLJILJILJ;
    public AnonymousClass0956 LLJILLL;
    public Long LLJJ;
    public EnumC579010MnL LLJJI;
    public boolean LLJJIII;
    public UploadPicStickerARPresenter LLJJIJI;
    public Long LLJJIJIIJIL;
    public final AObjectS241S0100000_8 LLJJIJIL;
    public final AObjectS241S0100000_8 LLJJJ;
    public final AObjectS241S0100000_8 LLJJJIL;
    public final AObjectS241S0100000_8 LLJJJJ;
    public final C579040MnO LLJJJJJIL;
    public final C579030MnN LLJJJJLIIL;

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        CameraComponentModel cameraComponentModelPw0;
        AIGCOfflineModel aIGCOfflineModel;
        AIGCOfflineModel aIGCOfflineModel2;
        Effect effect = this.LLJILJILJ;
        boolean zLJIIIIZZ = effect != null ? C1449600npG.LJIIIIZZ(effect) : false;
        this.LLJILJILJ = null;
        ShortVideoContext shortVideoContext = this.LLILLJJLI;
        if (shortVideoContext != null) {
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            if (creativeModel != null && (aIGCOfflineModel2 = creativeModel.aigcOfflineModel) != null) {
                aIGCOfflineModel2.isOfflineAIGCEffectEnabled = false;
            }
            CreativeModel creativeModel2 = shortVideoContext.creativeModel;
            if (creativeModel2 != null && (aIGCOfflineModel = creativeModel2.aigcOfflineModel) != null) {
                aIGCOfflineModel.isAIGCEffectActive = 2;
            }
        }
        this.LLJJI = null;
        InterfaceC1648570t0B interfaceC1648570t0B = this.LLILZIL;
        if (interfaceC1648570t0B != null) {
            interfaceC1648570t0B.LH0().LIZIZ(this.LLJJIJIL);
            interfaceC1648570t0B.pU1().LIZIZ(this.LLJJJ);
            interfaceC1648570t0B.Vt0().LIZIZ(this.LLJJJIL);
            C385670FAf<C1649650t1v> c385670FAfXk1 = interfaceC1648570t0B.xk1();
            if (c385670FAfXk1 != null) {
                c385670FAfXk1.LIZIZ(this.LLJJJJ);
            }
            interfaceC1648570t0B.Iv2(null);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJILLL = null;
        InterfaceC1650230t2r interfaceC1650230t2r = this.LLJI;
        if (interfaceC1650230t2r != null && (cameraComponentModelPw0 = interfaceC1650230t2r.pw0()) != null) {
            cameraComponentModelPw0.isLoopSwitchOnByAIGC = false;
        }
        if (zLJIIIIZZ) {
            this.LLJJIJIIJIL = null;
            InterfaceC1648570t0B interfaceC1648570t0B2 = this.LLILZIL;
            if (interfaceC1648570t0B2 != null) {
                interfaceC1648570t0B2.vs2(0L);
            }
            this.LLJJ = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJIIJZLJL() {
        /*
            r5 = this;
            lnn.q r0 = r5.LLIZ
            r4 = 0
            if (r0 == 0) goto L53
            X.0sNK r0 = r0.C0()
            if (r0 == 0) goto L53
            X.0sOv r0 = r0.LJII()
            if (r0 == 0) goto L53
            androidx.lifecycle.MutableLiveData r0 = r0.LJ()
            if (r0 == 0) goto L53
            java.lang.Object r1 = r0.getValue()
            X.0noI r1 = (X.C1449000noI) r1
        L1d:
            java.lang.String r3 = ""
            if (r1 != 0) goto L63
            lnn.q r0 = r5.LLIZ
            r2 = 1
            if (r0 == 0) goto L55
            X.0sNK r1 = r0.C0()
            if (r1 == 0) goto L55
            lnn.q r0 = r5.LLIZ
            if (r0 == 0) goto L38
            X.0sNK r0 = r0.C0()
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r0.LLILIL()
        L38:
            boolean r0 = X.C1625940sPg.LJIIL(r1, r4)
            if (r0 != r2) goto L55
            lnn.q r0 = r5.LLIZ
            if (r0 == 0) goto L6e
            X.0sNK r0 = r0.C0()
            if (r0 == 0) goto L6e
            int r0 = r0.LJI()
            int r0 = r0 + 1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L53:
            r1 = r4
            goto L1d
        L55:
            lnn.q r0 = r5.LLIZ
            if (r0 == 0) goto L6e
            X.0sNK r0 = r0.C0()
            if (r0 == 0) goto L6e
            r0.LJI()
            return r3
        L63:
            boolean r0 = r1.LIZLLL
            if (r0 != 0) goto L6e
            int r0 = r1.LIZJ
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C578910MnB.LJJIIJZLJL():java.lang.String");
    }

    public final StickerInfo LJJIIZ() {
        FaceStickerBean faceStickerBeanJr;
        q qVar = this.LLIZ;
        if (qVar == null || (faceStickerBeanJr = qVar.jr()) == null) {
            return null;
        }
        String propSource = faceStickerBeanJr.getPropSource();
        String gradeKey = faceStickerBeanJr.getGradeKey();
        String recId = faceStickerBeanJr.getRecId();
        boolean zIsMobileEffect = faceStickerBeanJr.isMobileEffect();
        boolean zIsStackableEffect = faceStickerBeanJr.isStackableEffect();
        int source = faceStickerBeanJr.getSource();
        int fromSource = faceStickerBeanJr.getFromSource();
        long stickerId = faceStickerBeanJr.getStickerId();
        String resourceID = faceStickerBeanJr.getResourceID();
        String tabKey = faceStickerBeanJr.getTabKey();
        String metTemplateResourceId = faceStickerBeanJr.getMetTemplateResourceId();
        EffectLabel effectLabel = faceStickerBeanJr.getEffectLabel();
        Map<String, Object> basicEventParam = faceStickerBeanJr.getBasicEventParam();
        boolean zIsAMEMobileEffect = faceStickerBeanJr.isAMEMobileEffect();
        C1446130njf.LIZ.getClass();
        StickerInfo stickerInfo = new StickerInfo(propSource, gradeKey, recId, zIsMobileEffect, zIsStackableEffect, source, fromSource, stickerId, resourceID, tabKey, metTemplateResourceId, effectLabel, basicEventParam, zIsAMEMobileEffect, C1446130njf.LJIIJJI(faceStickerBeanJr));
        stickerInfo.setRecommendReason(faceStickerBeanJr.getRecommendReason());
        stickerInfo.setRecommendRuleTags(faceStickerBeanJr.getRecommendRuleTags());
        stickerInfo.setCachedProp(faceStickerBeanJr.getIsCachedData().booleanValue());
        stickerInfo.setImprPosition(LJJIIJZLJL());
        return stickerInfo;
    }

    public final void LJJIIZI() {
        InterfaceC1623190sLF interfaceC1623190sLFU;
        CreativeModel creativeModel;
        AIGCOfflineModel aIGCOfflineModel;
        ShortVideoContext shortVideoContext = this.LLILLJJLI;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (aIGCOfflineModel = creativeModel.aigcOfflineModel) != null) {
            aIGCOfflineModel.isOfflineAIGCEffectGenerating = true;
        }
        InterfaceC1647420syK interfaceC1647420syK = this.LLILZLL;
        if (interfaceC1647420syK != null) {
            a aVarLIZJ = interfaceC1647420syK.pi2().LIZJ();
            if (aVarLIZJ != null) {
                aVarLIZJ.eP2(false);
            }
            q qVar = this.LLIZ;
            if (qVar != null && (interfaceC1623190sLFU = qVar.U()) != null) {
                interfaceC1623190sLFU.Zf(true);
            }
            InterfaceC1648020szI interfaceC1648020szILIZJ = interfaceC1647420syK.VK0().LIZJ();
            if (interfaceC1648020szILIZJ != null) {
                interfaceC1648020szILIZJ.showBottomTab(false);
            }
            InterfaceC1630630sXF interfaceC1630630sXFLIZJ = interfaceC1647420syK.NV().LIZJ();
            if (interfaceC1630630sXFLIZJ != null) {
                interfaceC1630630sXFLIZJ.W9(false);
            }
        }
        C0LC0.LIZ("aigc_offline_effect_handler", "onHideUI");
    }

    public final void LJJJI() {
        InterfaceC2253831DJl interfaceC2253831DJlU92;
        VERecorder vERecorderLIZIZ;
        int iLJIIIIZZ;
        InterfaceC1650230t2r interfaceC1650230t2r;
        InterfaceC2253831DJl interfaceC2253831DJlU922;
        VERecorder vERecorderLIZIZ2;
        C385670FAf<InterfaceC1652470t6T> c385670FAfO80;
        InterfaceC1652470t6T interfaceC1652470t6TLIZJ;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        C1629320sV8 c1629320sV8LJJLIIIJJIZ;
        InterfaceC1648570t0B interfaceC1648570t0B = this.LLILZIL;
        if (interfaceC1648570t0B != null) {
            if (!interfaceC1648570t0B.isRecording().LIZJ().booleanValue() || interfaceC1648570t0B.Jv2().LIZJ().booleanValue()) {
                q qVar = this.LLIZ;
                if (qVar != null && (interfaceC1624480sNKC0 = qVar.C0()) != null && (c1629320sV8LJJLIIIJJIZ = interfaceC1624480sNKC0.LJJLIIIJJIZ()) != null && c1629320sV8LJJLIIIJJIZ.LJIILLIIL && C1402560mbO.LIZ() == 2) {
                    C1411890mqR c1411890mqR = C1411890mqR.LIZ;
                    Effect effectLLILIL = this.LLIZ.C0().LLILIL();
                    c1411890mqR.getClass();
                    C1411890mqR.LIZJ(effectLLILIL, "record_video");
                }
            } else {
                C1644050sst c1644050sst = new C1644050sst("aigc_generation");
                c1644050sst.LIZ = C1624200sMs.LIZIZ(this.LLJILJILJ) ? 0 : 3;
                interfaceC1648570t0B.h81(c1644050sst);
                if (C1624200sMs.LIZIZ(this.LLJILJILJ)) {
                    SettingsManager.LIZLLL().getClass();
                    if (!SettingsManager.LIZ("aigc_countdown_restore_dialog_killswitch", false)) {
                        Keva.getRepo("publish").storeBoolean("aigc_countdown_record", true);
                    }
                }
            }
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("aigc_generation_music_stop_fix_killswitch", false)) {
            InterfaceC1647420syK interfaceC1647420syK = this.LLILZLL;
            if (interfaceC1647420syK != null && (c385670FAfO80 = interfaceC1647420syK.O80()) != null && (interfaceC1652470t6TLIZJ = c385670FAfO80.LIZJ()) != null) {
                interfaceC1652470t6TLIZJ.NW(this.LLJILJILJ, false);
            }
        } else {
            InterfaceC1650230t2r interfaceC1650230t2r2 = this.LLJI;
            if (interfaceC1650230t2r2 != null && (interfaceC2253831DJlU92 = interfaceC1650230t2r2.u92()) != null && (vERecorderLIZIZ = interfaceC2253831DJlU92.LIZIZ()) != null && (iLJIIIIZZ = vERecorderLIZIZ.LJIIIIZZ()) >= 0 && (interfaceC1650230t2r = this.LLJI) != null && (interfaceC2253831DJlU922 = interfaceC1650230t2r.u92()) != null && (vERecorderLIZIZ2 = interfaceC2253831DJlU922.LIZIZ()) != null) {
                vERecorderLIZIZ2.LJIILL(iLJIIIIZZ, 1);
            }
        }
        C0LC0.LIZ("aigc_offline_effect_handler", "onStopRecording");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ() {
        /*
            r11 = this;
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r11.LLJILJILJ
            r1 = 1
            if (r0 == 0) goto Lbe
            boolean r0 = X.C1449600npG.LJIIIIZZ(r0)
            if (r0 != r1) goto Lbe
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r11.LLJILJILJ
            java.lang.String r2 = "AIGCV2VVideoInputMaxDuration"
            if (r1 == 0) goto Lbd
            X.0njf r0 = X.C1446130njf.LIZ     // Catch: java.lang.Exception -> La4
            r0.getClass()     // Catch: java.lang.Exception -> La4
            org.json.JSONObject r1 = X.C1446130njf.LJIIIZ(r1)     // Catch: java.lang.Exception -> La4
            if (r1 == 0) goto Lbd
            boolean r0 = r1.has(r2)     // Catch: java.lang.Exception -> La4
            if (r0 == 0) goto Lbd
            long r0 = r1.optLong(r2)     // Catch: java.lang.Exception -> La4
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> La4
            r9 = 0
            if (r3 == 0) goto Lbd
            long r1 = r3.longValue()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto Lbd
            long r4 = r3.longValue()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.LLILLJJLI
            if (r0 == 0) goto L71
            X.0nbh r0 = r0.LIZJ()
            if (r0 == 0) goto L71
            java.util.Iterator r8 = r0.iterator()
            r2 = 0
        L4a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r1 = r8.next()
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r1 = (com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension) r1
            int r0 = r1.getDuration()
            long r6 = (long) r0
            double r0 = r1.getSpeed()
            long r0 = com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension.calculateRealTime(r6, r0)
            long r2 = r2 + r0
            goto L4a
        L65:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L71
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.toMillis(r4)
            long r2 = r2 + r0
            goto L77
        L71:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r0.toMillis(r4)
        L77:
            java.lang.Long r0 = r11.LLJJ
            if (r0 == 0) goto L91
            long r0 = r0.longValue()
        L7f:
            long r1 = java.lang.Math.min(r2, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r11.LLJJIJIIJIL = r0
            X.0t0B r0 = r11.LLILZIL
            if (r0 == 0) goto Lbd
            r0.vs2(r1)
            return
        L91:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.LLILLJJLI
            if (r0 == 0) goto Lbd
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r0.cameraComponentModel
            long r0 = r0.mMaxDuration
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r0 == 0) goto Lbd
            long r0 = r0.longValue()
            goto L7f
        La4:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "failed parseV2VInputMaxDurationSeconds: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "aigc_offline_effect_handler"
            X.AnonymousClass0925.LIZIZ(r0, r1)
        Lbd:
            return
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C578910MnB.LJJJJ():void");
    }

    public static String LJJIJIIJI(Effect effect) {
        String strOptString;
        if (effect != null) {
            try {
                C1446130njf.LIZ.getClass();
                JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
                if (jSONObjectLJIIIZ != null) {
                    strOptString = jSONObjectLJIIIZ.optString("AIGCTaskType");
                } else {
                    strOptString = null;
                }
                if (C123100dR.LIZ(strOptString)) {
                    return strOptString;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("failed parseTaskType: ");
                sbLIZ.append(e);
                AnonymousClass0925.LIZIZ("aigc_offline_effect_handler", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return null;
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return C1624200sMs.LIZLLL(c1627370sRz.LIZ);
    }

    public final String LJJIJ(Effect effect) {
        FaceStickerBean faceStickerBeanJr;
        String unzipPath;
        boolean z;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray2;
        JSONArray jSONArrayOptJSONArray3;
        String strOptString;
        String localPath = null;
        if (effect != null && (unzipPath = effect.getUnzipPath()) != null) {
            boolean z2 = true;
            if (unzipPath.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                unzipPath = null;
            }
            if (unzipPath != null) {
                C0VSJ c0vsj = new C0VSJ(unzipPath, "aigc_arch_workflow/workflow.json");
                if (!c0vsj.exists()) {
                    return "";
                }
                try {
                    JSONObject jSONObjectOptJSONObject2 = new JSONObject(C09BH.LJI(c0vsj, Charsets.UTF_8)).optJSONObject("aigc_arch_workflow");
                    if (jSONObjectOptJSONObject2 == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("nodes")) == null) {
                        return "";
                    }
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject3 != null && Intrinsics.LJFF(jSONObjectOptJSONObject3.optString("type"), "server") && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("server_workflow")) != null && (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("nodes")) != null) {
                            int length2 = jSONArrayOptJSONArray2.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i2);
                                if (jSONObjectOptJSONObject4 != null && Intrinsics.LJFF(jSONObjectOptJSONObject4.optString("type"), "create_request") && (jSONArrayOptJSONArray3 = jSONObjectOptJSONObject4.optJSONArray("outputs")) != null) {
                                    JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray3.optJSONObject(0);
                                    if (jSONObjectOptJSONObject5 != null && (strOptString = jSONObjectOptJSONObject5.optString("name")) != null) {
                                        if (strOptString.length() <= 0) {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            localPath = strOptString;
                                        }
                                        if (localPath != null) {
                                            return localPath;
                                        }
                                    }
                                    return "";
                                }
                            }
                        }
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("parseResourceKeyFromUnzipPath failed: ");
                    sbLIZ.append(e);
                    AnonymousClass0925.LIZIZ("aigc_offline_effect_handler", C2188811AlT.LIZIZ(sbLIZ));
                }
                return "";
            }
        }
        q qVar = this.LLIZ;
        if (qVar != null && (faceStickerBeanJr = qVar.jr()) != null) {
            localPath = faceStickerBeanJr.getLocalPath();
        }
        if (localPath == null) {
            return "";
        }
        return localPath;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x017b, code lost:
    
        r2 = r2.optJSONObject(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0180, code lost:
    
        if (r2 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0182, code lost:
    
        r5 = r2.optString("name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0188, code lost:
    
        if (r5 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018e, code lost:
    
        if (r5.length() <= 0) goto L114;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019c A[EDGE_INSN: B:364:0x019c->B:114:0x019c BREAK  A[LOOP:3: B:86:0x0138->B:111:0x0195]] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x023a A[Catch: Exception -> 0x025d, TRY_LEAVE, TryCatch #0 {Exception -> 0x025d, blocks: (B:148:0x0216, B:150:0x021c, B:152:0x0227, B:154:0x0233, B:157:0x023a, B:160:0x0247), top: B:336:0x0216 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel LJJIJIIJIL(com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCEffectMessage r37) {
        /*
            Method dump skipped, instruction units count: 1398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C578910MnB.LJJIJIIJIL(com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCEffectMessage):com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel");
    }

    public final void LJJIJLIJ(C0MZV c0mzv) {
        CreativeModel creativeModel;
        AIGCOfflineModel aIGCOfflineModel;
        Effect effectLLILIL = this.LLJILJILJ;
        if (effectLLILIL == null) {
            q qVar = this.LLIZ;
            if (qVar != null) {
                effectLLILIL = qVar.C0().LLILIL();
            } else {
                return;
            }
        }
        if (effectLLILIL != null && C1449600npG.LJIIIIZZ(effectLLILIL)) {
            this.LLJILJILJ = effectLLILIL;
            ShortVideoContext shortVideoContext = this.LLILLJJLI;
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (aIGCOfflineModel = creativeModel.aigcOfflineModel) != null && aIGCOfflineModel.isOfflineAIGCEffectGenerating) {
                return;
            }
            LJJIIZI();
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILLL), null, null, new C560290LyF(this, c0mzv, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIL(X.EnumC579010MnL r7) {
        /*
            r6 = this;
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LLJILJILJ
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L41
            boolean r0 = X.C1449600npG.LJIIIIZZ(r0)
            if (r0 != r5) goto L41
            r4 = 0
            r6.LLJJI = r4
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r6.LLILLJJLI
            if (r1 == 0) goto L2d
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r1.creativeModel
            if (r0 == 0) goto L20
            com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel r0 = r0.aigcOfflineModel
            if (r0 == 0) goto L20
            boolean r0 = r0.isOfflineAIGCEffectGenerating
            if (r0 != r5) goto L20
            return r5
        L20:
            X.0nbh r0 = r1.LIZJ()
            if (r0 == 0) goto L2d
            int r3 = r0.size()
            if (r3 >= 0) goto L2e
            return r2
        L2d:
            r3 = 0
        L2e:
            r6.LJJIIZI()
            androidx.lifecycle.LifecycleOwner r0 = r6.LLILLL
            androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
            X.0LyG r1 = new X.0LyG
            r1.<init>(r6, r3, r7, r4)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r4, r4, r1, r0)
            return r5
        L41:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C578910MnB.LJJIL(X.0MnL):boolean");
    }

    public final void LJJIZ(C1627370sRz c1627370sRz) {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("aigc_effect_reset_refactor_killswitch", true)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILLL), null, null, new C578930MnD(this, c1627370sRz, null), 3);
            return;
        }
        q qVar = this.LLIZ;
        if (qVar != null) {
            C1624010sMZ.LIZ(qVar);
        }
        LJJJIL(c1627370sRz.LIZ);
    }

    public final void LJJJ(boolean z) {
        InterfaceC1623190sLF interfaceC1623190sLFU;
        CreativeModel creativeModel;
        AIGCOfflineModel aIGCOfflineModel;
        CreativeModel creativeModel2;
        AIGCOfflineModel aIGCOfflineModel2;
        CreativeModel creativeModel3;
        AIGCOfflineModel aIGCOfflineModel3;
        ShortVideoContext shortVideoContext = this.LLILLJJLI;
        if (shortVideoContext != null && (creativeModel3 = shortVideoContext.creativeModel) != null && (aIGCOfflineModel3 = creativeModel3.aigcOfflineModel) != null) {
            aIGCOfflineModel3.isOfflineAIGCEffectGenerating = false;
        }
        TimeSpeedModelExtension timeSpeedModelExtension = null;
        this.LLJJI = null;
        InterfaceC1648570t0B interfaceC1648570t0B = this.LLILZIL;
        if (interfaceC1648570t0B != null) {
            interfaceC1648570t0B.Ek2();
            if (interfaceC1648570t0B.isRecording().LIZJ().booleanValue() && !interfaceC1648570t0B.Jv2().LIZJ().booleanValue()) {
                C1644050sst c1644050sst = new C1644050sst("aigc_generation");
                c1644050sst.LIZ = 3;
                interfaceC1648570t0B.h81(c1644050sst);
            }
            if (z) {
                if (Intrinsics.LJFF(interfaceC1648570t0B.ec().LIZJ(), Boolean.TRUE)) {
                    interfaceC1648570t0B.xP1(true, true, true);
                    interfaceC1648570t0B.Ax(new C1644050sst("delete last fragment"));
                    ShortVideoContext shortVideoContext2 = this.LLILLJJLI;
                    if (shortVideoContext2 != null) {
                        C1441190nbh c1441190nbhLIZIZ = shortVideoContext2.cameraComponentModel.LIZIZ();
                        if (!c1441190nbhLIZIZ.isEmpty()) {
                            timeSpeedModelExtension = c1441190nbhLIZIZ.get(c1441190nbhLIZIZ.size() - 1);
                        }
                        shortVideoContext2.LJJJLIIL(timeSpeedModelExtension);
                    }
                    ShortVideoContext shortVideoContext3 = this.LLILLJJLI;
                    if (shortVideoContext3 != null && (creativeModel2 = shortVideoContext3.creativeModel) != null && (aIGCOfflineModel2 = creativeModel2.aigcOfflineModel) != null) {
                        creativeModel2.aigcOfflineModel = AIGCOfflineModel.LIZ(aIGCOfflineModel2, false, false, false, null, null, null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, -1, 260095);
                    }
                    SettingsManager.LIZLLL().getClass();
                    if (!SettingsManager.LIZ("aigc_countdown_restore_dialog_killswitch", false)) {
                        Keva.getRepo("publish").storeBoolean("aigc_countdown_record", false);
                    }
                }
                LJJJJ();
            }
        } else if (z) {
            LJJJJ();
        }
        ShortVideoContext shortVideoContext4 = this.LLILLJJLI;
        if (shortVideoContext4 != null && (creativeModel = shortVideoContext4.creativeModel) != null && (aIGCOfflineModel = creativeModel.aigcOfflineModel) != null) {
            creativeModel.aigcOfflineModel = AIGCOfflineModel.LIZ(aIGCOfflineModel, false, false, false, null, null, null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, -1, 253951);
        }
        C1409940mnI.LJFF();
        InterfaceC1647420syK interfaceC1647420syK = this.LLILZLL;
        if (interfaceC1647420syK != null) {
            a aVarLIZJ = interfaceC1647420syK.pi2().LIZJ();
            if (aVarLIZJ != null) {
                aVarLIZJ.eP2(true);
            }
            InterfaceC1648020szI interfaceC1648020szILIZJ = interfaceC1647420syK.VK0().LIZJ();
            if (interfaceC1648020szILIZJ != null) {
                interfaceC1648020szILIZJ.setTabSwitchEnabled(true);
            }
            q qVar = this.LLIZ;
            if (qVar != null && (interfaceC1623190sLFU = qVar.U()) != null) {
                interfaceC1623190sLFU.Zf(false);
            }
            InterfaceC1648020szI interfaceC1648020szILIZJ2 = interfaceC1647420syK.VK0().LIZJ();
            if (interfaceC1648020szILIZJ2 != null) {
                interfaceC1648020szILIZJ2.showBottomTab(true);
            }
            InterfaceC1630630sXF interfaceC1630630sXFLIZJ = interfaceC1647420syK.NV().LIZJ();
            if (interfaceC1630630sXFLIZJ != null) {
                interfaceC1630630sXFLIZJ.W9(true);
            }
            InterfaceC1652470t6T interfaceC1652470t6TLIZJ = interfaceC1647420syK.O80().LIZJ();
            if (interfaceC1652470t6TLIZJ != null) {
                interfaceC1652470t6TLIZJ.oo0(this.LLJILJILJ, false);
            }
        }
        C0LC0.LIZ("aigc_offline_effect_handler", "onRestoreUI");
    }

    public final void LJJJIL(Effect effect) {
        q qVar = this.LLIZ;
        if (qVar == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("FROM_AIGC_RESET_FLOW", true);
        C1624010sMZ.LJIIJ(qVar, C1622820sKe.LIZIZ(effect, -1, EnumC1448980noG.MANUAL_SET, null, bundle, null, null, 0, false, null, null, 1012));
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        q qVar;
        LiveEvent<C0MZV> liveEventC00;
        q qVar2;
        C385670FAf<InterfaceC579050MnP> c385670FAfNm2;
        InterfaceC1623190sLF interfaceC1623190sLFU;
        C385670FAf<InterfaceC1630630sXF> c385670FAfNV;
        InterfaceC1630630sXF interfaceC1630630sXFLIZJ;
        C385670FAf<C1649650t1v> c385670FAfXk1;
        C385670FAf<C1649650t1v> c385670FAfXk12;
        Long lValueOf;
        CameraComponentModel cameraComponentModelPw0;
        int i;
        AIGCOfflineModel aIGCOfflineModel;
        String name;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        String propSource;
        AIGCOfflineModel aIGCOfflineModel2;
        AIGCOfflineModel aIGCOfflineModel3;
        ShortVideoContext shortVideoContext;
        CreativeModel creativeModel;
        if (c1627370sRz.LIZJ == EnumC1448980noG.RECOVER) {
            LJJIZ(c1627370sRz);
        }
        this.LLJILJILJ = c1627370sRz.LIZ;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("aigc_reset_offline_model_killswitch", true) && (shortVideoContext = this.LLILLJJLI) != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            creativeModel.aigcOfflineModel = new AIGCOfflineModel(false, false, false, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0, null, null, 0, null, false, null, false, false, null, false, 0, null, null, 0, -1, 262143, null);
        }
        ShortVideoContext shortVideoContext2 = this.LLILLJJLI;
        if (shortVideoContext2 != null) {
            CreativeModel creativeModel2 = shortVideoContext2.creativeModel;
            if (creativeModel2 != null && (aIGCOfflineModel3 = creativeModel2.aigcOfflineModel) != null) {
                i = 1;
                aIGCOfflineModel3.isOfflineAIGCEffectEnabled = true;
            } else {
                i = 1;
                if (shortVideoContext2 != null) {
                }
            }
            CreativeModel creativeModel3 = shortVideoContext2.creativeModel;
            if (creativeModel3 != null && (aIGCOfflineModel2 = creativeModel3.aigcOfflineModel) != null) {
                aIGCOfflineModel2.isAIGCEffectActive = i;
            }
            CreativeModel creativeModel4 = shortVideoContext2.creativeModel;
            if (creativeModel4 != null && (aIGCOfflineModel = creativeModel4.aigcOfflineModel) != null) {
                StickerInfo stickerInfoLJJIIZ = LJJIIZ();
                CreativeModel creativeModel5 = this.LLILLJJLI.creativeModel;
                boolean zLIZIZ = C1624200sMs.LIZIZ(this.LLJILJILJ);
                String strLJJIJ = LJJIJ(this.LLJILJILJ);
                String effectId = c1627370sRz.LIZ.getEffectId();
                String resourceId = c1627370sRz.LIZ.getResourceId();
                String strLJJIJIIJI = LJJIJIIJI(this.LLJILJILJ);
                C1446130njf c1446130njf = C1446130njf.LIZ;
                Effect effect = this.LLJILJILJ;
                c1446130njf.getClass();
                String strLJIIJ = C1446130njf.LJIIJ(effect, "AIGCSubType");
                if (strLJIIJ == null) {
                    strLJIIJ = "";
                }
                if (stickerInfoLJJIIZ == null || (propSource = stickerInfoLJJIIZ.getPropSource()) == null || (name = C579100MnU.LIZ(propSource, true)) == null) {
                    q qVar3 = this.LLIZ;
                    if (qVar3 == null || (interfaceC1624480sNKC0 = qVar3.C0()) == null) {
                        name = "";
                    } else {
                        name = C1623660sM0.LIZ(interfaceC1624480sNKC0).getName();
                    }
                }
                creativeModel5.aigcOfflineModel = AIGCOfflineModel.LIZ(aIGCOfflineModel, false, false, false, null, null, strLJJIJIIJI, null, 0, 0, null, null, name, effectId, resourceId, strLJIIJ, null, zLIZIZ, false, null, false, strLJJIJ, -138706977, 228351);
            }
        }
        InterfaceC1650230t2r interfaceC1650230t2r = this.LLJI;
        if (interfaceC1650230t2r != null && (cameraComponentModelPw0 = interfaceC1650230t2r.pw0()) != null) {
            cameraComponentModelPw0.isLoopSwitchOnByAIGC = true;
        }
        final boolean zLJIIIIZZ = C1449600npG.LJIIIIZZ(c1627370sRz.LIZ);
        if (zLJIIIIZZ) {
            if (this.LLJJ == null) {
                ShortVideoContext shortVideoContext3 = this.LLILLJJLI;
                if (shortVideoContext3 != null) {
                    lValueOf = Long.valueOf(shortVideoContext3.cameraComponentModel.mMaxDuration);
                } else {
                    lValueOf = null;
                }
                this.LLJJ = lValueOf;
            }
            LJJJJ();
            if (!this.LLJJIII) {
                InterfaceC579700MoS interfaceC579700MoS = new InterfaceC579700MoS() { // from class: X.0MnF
                    @Override // X.InterfaceC579700MoS
                    public final boolean LIZ(C0LZD c0lzd) {
                        C385670FAf<Boolean> c385670FAfIsRecording;
                        Effect effect2 = this.LIZ.LLJILJILJ;
                        if (effect2 == null || !C1449600npG.LJIIIIZZ(effect2)) {
                            return false;
                        }
                        InterfaceC1648570t0B interfaceC1648570t0B = this.LIZ.LLILZIL;
                        if (interfaceC1648570t0B != null && (c385670FAfIsRecording = interfaceC1648570t0B.isRecording()) != null && Intrinsics.LJFF(c385670FAfIsRecording.LIZJ(), Boolean.TRUE) && !this.LIZ.LLILZIL.Jv2().LIZJ().booleanValue()) {
                            C578910MnB c578910MnB = this.LIZ;
                            c578910MnB.LLJJI = EnumC579010MnL.LLILLJJLI;
                            InterfaceC1648570t0B interfaceC1648570t0B2 = c578910MnB.LLILZIL;
                            C1644050sst c1644050sst = new C1644050sst("v2v_go_next");
                            c1644050sst.LIZ = 4;
                            interfaceC1648570t0B2.h81(c1644050sst);
                            return true;
                        }
                        return this.LIZ.LJJIL(EnumC579010MnL.LLILLJJLI);
                    }
                };
                InterfaceC1648570t0B interfaceC1648570t0B = this.LLILZIL;
                if (interfaceC1648570t0B != null) {
                    interfaceC1648570t0B.kZ1(C579080MnS.class, interfaceC579700MoS);
                }
                InterfaceC1648570t0B interfaceC1648570t0B2 = this.LLILZIL;
                if (interfaceC1648570t0B2 != null) {
                    interfaceC1648570t0B2.kZ1(C0LF1.class, interfaceC579700MoS);
                }
                this.LLJJIII = true;
            }
            InterfaceC1648570t0B interfaceC1648570t0B3 = this.LLILZIL;
            if (interfaceC1648570t0B3 != null && (c385670FAfXk12 = interfaceC1648570t0B3.xk1()) != null) {
                c385670FAfXk12.LIZIZ(this.LLJJJJ);
            }
            InterfaceC1648570t0B interfaceC1648570t0B4 = this.LLILZIL;
            if (interfaceC1648570t0B4 != null && (c385670FAfXk1 = interfaceC1648570t0B4.xk1()) != null) {
                c385670FAfXk1.LJ(this.LLILLL, this.LLJJJJ);
            }
        }
        final InterfaceC1648570t0B interfaceC1648570t0B5 = this.LLILZIL;
        if (interfaceC1648570t0B5 != null) {
            interfaceC1648570t0B5.LH0().LIZIZ(this.LLJJIJIL);
            if (!zLJIIIIZZ) {
                interfaceC1648570t0B5.LH0().LJII(this.LLILLL, Lifecycle.State.RESUMED, this.LLJJIJIL);
            }
            interfaceC1648570t0B5.pU1().LIZIZ(this.LLJJJ);
            LiveEvent<C1644050sst> liveEventPU1 = interfaceC1648570t0B5.pU1();
            LifecycleOwner lifecycleOwner = this.LLILLL;
            Lifecycle.State state = Lifecycle.State.STARTED;
            liveEventPU1.LJII(lifecycleOwner, state, this.LLJJJ);
            interfaceC1648570t0B5.Vt0().LIZIZ(this.LLJJJIL);
            interfaceC1648570t0B5.Vt0().LJII(this.LLILLL, state, this.LLJJJIL);
            interfaceC1648570t0B5.Iv2(new InterfaceC579090MnT() { // from class: X.0MnE
                @Override // X.InterfaceC579090MnT
                public final void LIZ(AwS426S0200000_25 awS426S0200000_25) {
                    LiveData<Effect> liveDataRa0;
                    Effect value;
                    q qVar4;
                    InterfaceC1624480sNK interfaceC1624480sNKC02;
                    Effect value2;
                    LiveData<Effect> liveDataRa02;
                    if (Intrinsics.LJFF(interfaceC1648570t0B5.ec().LIZJ(), Boolean.TRUE) && !zLJIIIIZZ) {
                        interfaceC1648570t0B5.xP1(true, true, false);
                    } else {
                        q qVar5 = this.LLIZ;
                        if (qVar5 != null && (liveDataRa0 = qVar5.Ra0()) != null && (value = liveDataRa0.getValue()) != null && !value.isDownloaded()) {
                            SettingsManager.LIZLLL().getClass();
                            if (!SettingsManager.LIZ("aigc_effect_switch_record_killswitch", false) && (qVar4 = this.LLIZ) != null && (interfaceC1624480sNKC02 = qVar4.C0()) != null) {
                                q qVar6 = this.LLIZ;
                                if (qVar6 != null && (liveDataRa02 = qVar6.Ra0()) != null) {
                                    value2 = liveDataRa02.getValue();
                                } else {
                                    value2 = null;
                                }
                                interfaceC1624480sNKC02.LIZLLL(value2, false);
                            }
                        }
                    }
                    awS426S0200000_25.invoke();
                }
            });
        }
        InterfaceC1647420syK interfaceC1647420syK = this.LLILZLL;
        if (interfaceC1647420syK != null && (c385670FAfNV = interfaceC1647420syK.NV()) != null && (interfaceC1630630sXFLIZJ = c385670FAfNV.LIZJ()) != null) {
            interfaceC1630630sXFLIZJ.a60(new InterfaceC576020MiW() { // from class: X.0MiV
                @Override // X.InterfaceC576020MiW
                public final Object LIZ(Object obj) {
                    ShortVideoContext shortVideoContext4;
                    CreativeModel creativeModel6;
                    AIGCOfflineModel aIGCOfflineModel4;
                    boolean z = false;
                    if (((Boolean) obj).booleanValue() && (shortVideoContext4 = this.LIZ.LLILLJJLI) != null && (creativeModel6 = shortVideoContext4.creativeModel) != null && (aIGCOfflineModel4 = creativeModel6.aigcOfflineModel) != null && aIGCOfflineModel4.isOfflineAIGCEffectGenerating) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            });
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJILLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILLL), null, null, new C0MJH(this, c1627370sRz, null), 3);
        q qVar4 = this.LLIZ;
        if (qVar4 != null && (interfaceC1623190sLFU = qVar4.U()) != null) {
            interfaceC1623190sLFU.LIZIZ(this.LLJJJJJIL);
            interfaceC1623190sLFU.LIZ(this.LLJJJJJIL);
        }
        InterfaceC1647420syK interfaceC1647420syK2 = this.LLILZLL;
        if (interfaceC1647420syK2 != null && (c385670FAfNm2 = interfaceC1647420syK2.nm2()) != null) {
            c385670FAfNm2.LIZ(this.LLILLL, new AObjectS241S0100000_8(this, 78));
        }
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("aigc_clear_ar_presenter_killswitch", false) && (qVar2 = this.LLIZ) != null) {
            qVar2.Iq0().LJII(qVar2.getLifecycleOwner(), Lifecycle.State.CREATED, new AObjectS303S0200000_8(this, qVar2, 7));
        }
        Effect effect2 = this.LLJILJILJ;
        if (effect2 != null && C1449600npG.LJIIIIZZ(effect2) && (qVar = this.LLIZ) != null && (liveEventC00 = qVar.C00()) != null) {
            liveEventC00.LJII(this.LLILLL, Lifecycle.State.CREATED, new AObjectS241S0100000_8(this, 79));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121 A[PHI: r7
      0x0121: PHI (r7v3 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel) = 
      (r7v2 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel)
      (r7v7 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel)
     binds: [B:40:0x0113, B:46:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJL(X.C0MZV r32, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel> r33) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C578910MnB.LJJIJL(X.0MZV, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJ(java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn<? super java.lang.String> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.AnonymousClass0926
            if (r0 == 0) goto L37
            r5 = r9
            X.0926 r5 = (X.AnonymousClass0926) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3d
            X.C155000ia.LIZIZ(r1)
        L22:
            return r1
        L23:
            X.C155000ia.LIZIZ(r1)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.090K r1 = new X.090K
            r0 = 0
            r1.<init>(r7, r8, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L37:
            X.0926 r5 = new X.0926
            r5.<init>(r6, r9)
            goto L12
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C578910MnB.LJJIIJ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0168 A[PHI: r7
      0x0168: PHI (r7v3 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel) = 
      (r7v2 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel)
      (r7v7 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel)
     binds: [B:55:0x015a, B:61:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIL(int r32, X.EnumC579010MnL r33, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel> r34) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C578910MnB.LJJIJIL(int, X.0MnL, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        AIGCEffectMessage aIGCEffectMessage;
        Effect effect = this.LLJILJILJ;
        if ((effect == null || !C1449600npG.LJIIIIZZ(effect)) && i == 12288 && i2 == 0 && i3 == 0) {
            try {
                C1227904rF.LIZ.getClass();
                aIGCEffectMessage = (AIGCEffectMessage) C1227904rF.LIZIZ(str, AIGCEffectMessage.class);
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("failed parseAIGCEffectMessage: ");
                sbLIZ.append(e);
                AnonymousClass0925.LIZIZ("aigc_offline_effect_handler", C2188811AlT.LIZIZ(sbLIZ));
                aIGCEffectMessage = null;
            }
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LLILLL);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C578920MnC(this, aIGCEffectMessage, null), 2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0MnO] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0MnN] */
    public C578910MnB(ShortVideoContext shortVideoContext, AIGCGenerationComponent aIGCGenerationComponent, InterfaceC1645720sva interfaceC1645720sva, InterfaceC1648570t0B interfaceC1648570t0B, InterfaceC1647420syK interfaceC1647420syK, q qVar, InterfaceC560310LyH interfaceC560310LyH, InterfaceC579060MnQ interfaceC579060MnQ, e0 e0Var) {
        Class<?> cls;
        Object obj;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = aIGCGenerationComponent;
        this.LLILZ = interfaceC1645720sva;
        this.LLILZIL = interfaceC1648570t0B;
        this.LLILZLL = interfaceC1647420syK;
        this.LLIZ = qVar;
        this.LLIZLLLIL = interfaceC560310LyH;
        this.LLJ = interfaceC579060MnQ;
        this.LLJI = e0Var;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (obj = abstractC1387200mCcLJ.LIZ) != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        this.LLJIJIL = cls;
        this.LLJJIJIL = new AObjectS241S0100000_8(this, 80);
        this.LLJJJ = new AObjectS241S0100000_8(this, 81);
        this.LLJJJIL = new AObjectS241S0100000_8(this, 82);
        this.LLJJJJ = new AObjectS241S0100000_8(this, 83);
        this.LLJJJJJIL = new InterfaceC21362718iv() { // from class: X.0MnO
            @Override // X.InterfaceC21362718iv
            public final boolean LIZ() {
                CreativeModel creativeModel;
                AIGCOfflineModel aIGCOfflineModel;
                ShortVideoContext shortVideoContext2 = this.LIZ.LLILLJJLI;
                return (shortVideoContext2 == null || (creativeModel = shortVideoContext2.creativeModel) == null || (aIGCOfflineModel = creativeModel.aigcOfflineModel) == null || !aIGCOfflineModel.isOfflineAIGCEffectGenerating) ? false : true;
            }
        };
        this.LLJJJJLIIL = new InterfaceC1638740skK() { // from class: X.0MnN
            @Override // X.InterfaceC1638740skK
            public final boolean LIZ() {
                CreativeModel creativeModel;
                AIGCOfflineModel aIGCOfflineModel;
                ShortVideoContext shortVideoContext2 = this.LIZ.LLILLJJLI;
                return (shortVideoContext2 == null || (creativeModel = shortVideoContext2.creativeModel) == null || (aIGCOfflineModel = creativeModel.aigcOfflineModel) == null || !aIGCOfflineModel.isOfflineAIGCEffectGenerating) ? false : true;
            }
        };
    }
}
