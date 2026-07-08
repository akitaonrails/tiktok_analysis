package X;

import com.bytedance.ies.nle.editor_jni.NLELokiResourceProtocol;
import com.bytedance.ies.nle.editor_jni.NLELokiResourceType;
import com.bytedance.ies.nle.editor_jni.NLEResourceCallback;
import com.bytedance.ies.nle.editor_jni.NLEResourceManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS12S1500000_22;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS85S1300000_22;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416200mxO extends NLEResourceManager {
    public final C13OY LIZ;
    public final Map<String, Effect> LIZIZ;
    public final Map<String, Pair<Boolean, Boolean>> LIZJ;
    public final Map<String, Effect> LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1416200mxO() {
        /*
            r3 = this;
            r3.<init>()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IInternalAVService> r0 = com.ss.android.ugc.aweme.services.IInternalAVService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.IFoundationAVService r0 = (com.ss.android.ugc.aweme.services.IFoundationAVService) r0
            com.ss.android.ugc.aweme.services.effect.IEffectService r2 = r0.effectService()
            if (r2 == 0) goto L4f
            android.app.Application r1 = X.C0CHQ.LIZ
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            r0.getRegionService()
            java.lang.String r0 = X.C20186013yc.LIZ()
            X.0sex r0 = r2.createEffectPlatform(r1, r0)
            if (r0 == 0) goto L4f
            com.ss.android.ugc.effectmanager.EffectManager r0 = r0.LLJILJILJ()
            if (r0 == 0) goto L4f
            X.13OY r0 = r0.getEffectPlatform()
        L32:
            r3.LIZ = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.LIZIZ = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.LIZJ = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.LIZLLL = r0
            com.ss.android.ugc.effectmanager.EffectManager r0 = new com.ss.android.ugc.effectmanager.EffectManager
            r0.<init>()
            return
        L4f:
            r0 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1416200mxO.<init>():void");
    }

    public final void LIZ(String str) {
        String sdkExtra;
        boolean zOptBoolean;
        try {
            Effect effect = (Effect) ((LinkedHashMap) this.LIZIZ).get(str);
            boolean zOptBoolean2 = false;
            if (effect != null && (sdkExtra = effect.getSdkExtra()) != null && C703302op.LIZ(sdkExtra)) {
                Effect effect2 = (Effect) ((LinkedHashMap) this.LIZIZ).get(str);
                JSONObject jSONObjectOptJSONObject = null;
                if (effect2 != null) {
                    C1446130njf.LIZ.getClass();
                    JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect2);
                    if (jSONObjectLJIIIZ != null) {
                        jSONObjectOptJSONObject = jSONObjectLJIIIZ.optJSONObject("info_effect");
                    }
                }
                Map<String, Pair<Boolean, Boolean>> map = this.LIZJ;
                if (jSONObjectOptJSONObject != null) {
                    zOptBoolean = jSONObjectOptJSONObject.optBoolean("time");
                } else {
                    zOptBoolean = false;
                }
                Boolean boolValueOf = Boolean.valueOf(zOptBoolean);
                if (jSONObjectOptJSONObject != null) {
                    zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("location");
                }
                map.put(str, new Pair<>(boolValueOf, Boolean.valueOf(zOptBoolean2)));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceManager
    public final int cancelTask(String str) {
        C13OY c13oy;
        Effect effect = (Effect) ((LinkedHashMap) this.LIZIZ).get(str);
        if (effect != null && (c13oy = this.LIZ) != null) {
            c13oy.LIZ(effect);
            return 0;
        }
        return 0;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceManager
    public final int pauseTask(String str) {
        C13OY c13oy;
        Effect effect = (Effect) ((LinkedHashMap) this.LIZIZ).get(str);
        if (effect != null && (c13oy = this.LIZ) != null) {
            c13oy.LJIL(effect);
            return 0;
        }
        return 0;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceManager
    public final int resumeTask(String str) {
        C13OY c13oy;
        Effect effect = (Effect) ((LinkedHashMap) this.LIZIZ).get(str);
        if (effect != null && (c13oy = this.LIZ) != null) {
            List<InterfaceC20004913Pb> list = C13OY.LJIIJ;
            c13oy.LJJ(effect, false, false);
        }
        return 0;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceManager
    public final String fetchResource(final String str, final NLEResourceCallback nLEResourceCallback) {
        NLELokiResourceType type;
        final NLELokiResourceProtocol nLELokiResourceProtocolNLELokiResourceProtocolWithURS = NLELokiResourceProtocol.NLELokiResourceProtocolWithURS(str);
        if (nLELokiResourceProtocolNLELokiResourceProtocolWithURS != null && (type = nLELokiResourceProtocolNLELokiResourceProtocolWithURS.getType()) != null && C356300Dy0.LIZ[type.ordinal()] == 1) {
            if (((LinkedHashMap) this.LIZIZ).get(nLELokiResourceProtocolNLELokiResourceProtocolWithURS.getEffectId()) == null) {
                if (((LinkedHashMap) this.LIZLLL).get(nLELokiResourceProtocolNLELokiResourceProtocolWithURS.getEffectId()) == null) {
                    C13OY c13oy = this.LIZ;
                    if (c13oy != null) {
                        c13oy.LJIIIIZZ(C1697810uHb.LJ(nLELokiResourceProtocolNLELokiResourceProtocolWithURS.getEffectId()), null, new C13MA<EffectListResponse>() { // from class: X.0mxL
                            @Override // X.C13MA
                            public final void onSuccess(EffectListResponse effectListResponse) {
                                EffectListResponse effectListResponse2 = effectListResponse;
                                if (!effectListResponse2.getEffect_list().isEmpty()) {
                                    Effect effect = (Effect) ListProtector.get(effectListResponse2.getEffect_list(), 0);
                                    this.LIZLLL.put(nLELokiResourceProtocolNLELokiResourceProtocolWithURS.getEffectId(), effect);
                                    C0CNO.LIZ(C15O7.LJI, new AwS266S0300000_22(nLELokiResourceProtocolNLELokiResourceProtocolWithURS, this, effect, 25));
                                    final C1416200mxO c1416200mxO = this;
                                    C13OY c13oy2 = c1416200mxO.LIZ;
                                    final NLEResourceCallback nLEResourceCallback2 = nLEResourceCallback;
                                    final NLELokiResourceProtocol nLELokiResourceProtocol = nLELokiResourceProtocolNLELokiResourceProtocolWithURS;
                                    final String str2 = str;
                                    c13oy2.LJI(effect, true, true, true, new C13NY() { // from class: X.0mxM
                                        @Override // X.C13NY
                                        public final void onProgress(Effect effect2, int i, long j) {
                                        }

                                        @Override // X.C13NY
                                        public final void onStart(Effect effect2) {
                                        }

                                        @Override // X.C13MA
                                        public final void onSuccess(Effect effect2) {
                                            Effect effect3 = effect2;
                                            if (effect3 != null) {
                                                C01TT.LIZLLL(new AwS12S1500000_22(c1416200mxO, nLELokiResourceProtocol, effect3, nLEResourceCallback2, str2, effect3, 0));
                                            }
                                        }

                                        @Override // X.C13MA
                                        public final /* bridge */ /* synthetic */ void preProcess(Effect effect2) {
                                        }

                                        @Override // X.C13MA
                                        public final void onFail(Effect effect2, C1662010tLr c1662010tLr) {
                                            NLEResourceCallback nLEResourceCallback3 = nLEResourceCallback2;
                                            if (nLEResourceCallback3 != null) {
                                                nLEResourceCallback3.onError(c1662010tLr.LIZ, c1662010tLr.LIZIZ);
                                            }
                                        }
                                    });
                                }
                            }

                            @Override // X.C13MA
                            public final /* bridge */ /* synthetic */ void preProcess(EffectListResponse effectListResponse) {
                            }

                            @Override // X.C13MA
                            public final void onFail(EffectListResponse effectListResponse, C1662010tLr c1662010tLr) {
                                NLEResourceCallback nLEResourceCallback2 = nLEResourceCallback;
                                if (nLEResourceCallback2 != null) {
                                    nLEResourceCallback2.onError(c1662010tLr.LIZ, c1662010tLr.LIZIZ);
                                }
                            }
                        });
                    }
                } else {
                    Effect effect = (Effect) ((LinkedHashMap) this.LIZLLL).get(nLELokiResourceProtocolNLELokiResourceProtocolWithURS.getEffectId());
                    if (effect != null) {
                        C0CNO.LIZ(C15O7.LJI, new AwS266S0300000_22(nLELokiResourceProtocolNLELokiResourceProtocolWithURS, this, effect, 24));
                        C13OY c13oy2 = this.LIZ;
                        if (c13oy2 != null) {
                            c13oy2.LJI(effect, true, true, true, new C13NY() { // from class: X.0mxN
                                @Override // X.C13NY
                                public final void onProgress(Effect effect2, int i, long j) {
                                }

                                @Override // X.C13NY
                                public final void onStart(Effect effect2) {
                                }

                                @Override // X.C13MA
                                public final void onSuccess(Effect effect2) {
                                    Effect effect3 = effect2;
                                    if (effect3 != null) {
                                        C01TT.LIZLLL(new AwS12S1500000_22(this, nLELokiResourceProtocolNLELokiResourceProtocolWithURS, effect3, nLEResourceCallback, str, effect3, 1));
                                    }
                                }

                                @Override // X.C13MA
                                public final /* bridge */ /* synthetic */ void preProcess(Effect effect2) {
                                }

                                @Override // X.C13MA
                                public final void onFail(Effect effect2, C1662010tLr c1662010tLr) {
                                    NLEResourceCallback nLEResourceCallback2 = nLEResourceCallback;
                                    if (nLEResourceCallback2 != null) {
                                        nLEResourceCallback2.onError(c1662010tLr.LIZ, c1662010tLr.LIZIZ);
                                    }
                                }
                            });
                        }
                    }
                }
            } else {
                C1412000mqc.LIZLLL(nLELokiResourceProtocolNLELokiResourceProtocolWithURS.getEffectId(), "1");
                C01TT.LIZLLL(new AwS85S1300000_22(nLELokiResourceProtocolNLELokiResourceProtocolWithURS, nLEResourceCallback, this, str, 2));
            }
        }
        return nLELokiResourceProtocolNLELokiResourceProtocolWithURS.getEffectId();
    }
}
