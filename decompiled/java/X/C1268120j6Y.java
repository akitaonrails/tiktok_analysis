package X;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHEffectSuperResolutionCommand;
import com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHShowToastCommand;
import com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHSimulcastCommand;
import com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHUpdateDenoiseParamsCommand;
import com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHUpdateFpsResolutionCommand;
import com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHUpdateLinkMicPerformanceParamsCommand;
import com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHUpdateLinkMicVideoParamsCommand;
import com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHUpdateStreamHDParamsCommand;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.ttlivestreamer.core.effect.EffectAlgorithmStrategyResult;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j6Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268120j6Y implements InterfaceC1267450j5T {
    public final /* synthetic */ C1266350j3h LIZ;

    public C1268120j6Y(C1266350j3h c1266350j3h) {
        this.LIZ = c1266350j3h;
    }

    public final void LIZ(TTLHUpdateDenoiseParamsCommand tTLHUpdateDenoiseParamsCommand) {
        int i;
        boolean z = tTLHUpdateDenoiseParamsCommand.enable;
        C1266350j3h c1266350j3h = this.LIZ;
        if (c1266350j3h.LLJLILLLLZIIL != null) {
            if (c1266350j3h.LLJILLL()) {
                InterfaceC1266410j3n interfaceC1266410j3n = this.LIZ.LLJJJ;
                if (interfaceC1266410j3n != null) {
                    interfaceC1266410j3n.LJLJI(8, 16, z);
                }
            } else {
                this.LIZ.LLJLILLLLZIIL.LLILIL(16, z);
            }
            i = 1;
        } else {
            i = 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(tTLHUpdateDenoiseParamsCommand.adaptiveResultMap);
            jSONObject.put("execute", i);
            InterfaceC1266960j4g interfaceC1266960j4g = this.LIZ.LLJI;
            if (interfaceC1266960j4g != null) {
                interfaceC1266960j4g.LIZ("ttlh_adaptive_rule_execute", jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LIZ.LLLZLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHEffectModelCommand r5) {
        /*
            r4 = this;
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r5.dataMap
            if (r0 != 0) goto L5
            return
        L5:
            X.0j3h r0 = r4.LIZ
            boolean r0 = r0.LLJIJIL(r5)
            if (r0 == 0) goto L37
            X.0j3h r0 = r4.LIZ
            X.0j7O r0 = r0.LLJLILLLLZIIL
            if (r0 == 0) goto L6c
            java.util.Map r1 = r0.LJLZ()
            java.lang.String r0 = "face_extra_model_name"
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "matting_model_name"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r5.faceModelName
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L54
            java.lang.String r0 = r5.mattingModelName
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L54
        L37:
            r3 = 0
        L38:
            X.0j3h r0 = r4.LIZ
            X.0j5C r0 = r0.LLZZZZ
            if (r0 == 0) goto L51
            X.0j3r r1 = new X.0j3r
            r1.<init>()
            X.0j3h r0 = r4.LIZ
            r0.LLLLLJLJLL(r1)
            X.0j3h r0 = r4.LIZ
            X.0j5C r0 = r0.LLZZZZ
            X.0j4s r0 = r0.LIZLLL
            r0.LIZIZ(r1)
        L51:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.adaptiveResultMap
            goto L6e
        L54:
            X.0j3h r0 = r4.LIZ     // Catch: java.lang.Exception -> L66
            X.0j7O r2 = r0.LLJLILLLLZIIL     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto L6a
            java.lang.String r1 = "GradedOptConfig"
            org.json.JSONObject r0 = r5.commandJsonObject     // Catch: java.lang.Exception -> L66
            java.lang.String r0 = X.C786410Ut5.J3(r0)     // Catch: java.lang.Exception -> L66
            r2.setRenderCacheString(r1, r0)     // Catch: java.lang.Exception -> L66
            goto L6a
        L66:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6a:
            r3 = 1
            goto L38
        L6c:
            r3 = -1
            goto L38
        L6e:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L84
            r2.<init>(r0)     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = "execute"
            r2.put(r0, r3)     // Catch: java.lang.Exception -> L84
            X.0j3h r0 = r4.LIZ     // Catch: java.lang.Exception -> L84
            X.0j4g r1 = r0.LLJI     // Catch: java.lang.Exception -> L84
            if (r1 == 0) goto L88
            java.lang.String r0 = "ttlh_adaptive_rule_execute"
            r1.LIZ(r0, r2)     // Catch: java.lang.Exception -> L84
            return
        L84:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1268120j6Y.LIZIZ(com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHEffectModelCommand):void");
    }

    public final void LIZLLL(TTLHEffectSuperResolutionCommand tTLHEffectSuperResolutionCommand) {
        C1267620j5k c1267620j5k = this.LIZ.LLLZL;
        if (c1267620j5k != null) {
            boolean z = tTLHEffectSuperResolutionCommand.enable;
            float f = tTLHEffectSuperResolutionCommand.scale;
            if (!c1267620j5k.LJIIIIZZ) {
                c1267620j5k.LJIIIZ = z;
                if (f > 0.0f && f != c1267620j5k.LJFF) {
                    c1267620j5k.LJFF = f;
                }
            } else {
                c1267620j5k.LJFF = 1.5f;
            }
            String strategies = tTLHEffectSuperResolutionCommand.getStrategies();
            if (!TextUtils.isEmpty(strategies)) {
                try {
                    JSONObject jSONObject = new JSONObject(strategies);
                    InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ.LLJLILLLLZIIL;
                    if (interfaceC1268640j7O != null && interfaceC1268640j7O.isValid() && jSONObject.has("ttlh_realtime_device_score")) {
                        this.LIZ.LLJLILLLLZIIL.LJJJLL().setEffectStrategy("ttlh_realtime_device_score", CastDoubleProtector.parseDouble(jSONObject.get("ttlh_realtime_device_score").toString()));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        try {
            JSONObject jSONObject2 = new JSONObject(tTLHEffectSuperResolutionCommand.adaptiveResultMap);
            InterfaceC1266960j4g interfaceC1266960j4g = this.LIZ.LLJI;
            if (interfaceC1266960j4g != null) {
                interfaceC1266960j4g.LIZ("ttlh_adaptive_rule_execute", jSONObject2);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public final void LJ(TTLHUpdateFpsResolutionCommand tTLHUpdateFpsResolutionCommand) {
        int iLJIILJJIL;
        int iLJIILIIL;
        int iLJFF;
        int i = tTLHUpdateFpsResolutionCommand.capWidth;
        int i2 = tTLHUpdateFpsResolutionCommand.capHeight;
        int i3 = tTLHUpdateFpsResolutionCommand.width;
        int i4 = tTLHUpdateFpsResolutionCommand.height;
        int i5 = tTLHUpdateFpsResolutionCommand.fps;
        int i6 = 0;
        if (this.LIZ.LLJJ()) {
            iLJIILJJIL = this.LIZ.LLILZLL.LJIILJJIL(0);
            iLJIILIIL = this.LIZ.LLILZLL.LJIILIIL(0);
            iLJFF = this.LIZ.LLILZLL.LJFF();
        } else {
            LiveStreamVideoCapture liveStreamVideoCapture = this.LIZ.LLJJIJIL;
            if (liveStreamVideoCapture != null) {
                iLJIILJJIL = liveStreamVideoCapture.LLLIILIL;
                iLJIILIIL = liveStreamVideoCapture.LLLIL;
                iLJFF = liveStreamVideoCapture.LLLII;
            } else {
                iLJIILJJIL = 0;
                iLJIILIIL = 0;
                iLJFF = 0;
            }
        }
        if (this.LIZ.LLFZ() && this.LIZ.LLJIJIL(tTLHUpdateFpsResolutionCommand) && i3 > 0 && i4 > 0 && i5 > 0 && (i3 != iLJIILJJIL || i4 != iLJIILIIL || i5 != iLJFF)) {
            if (i3 != iLJIILJJIL || i4 != iLJIILIIL) {
                this.LIZ.LLLLZ(true);
            }
            if (!TextUtils.equals("network", tTLHUpdateFpsResolutionCommand.reason)) {
                this.LIZ.LLLLLJIL(i3, i4, i5, true);
            } else {
                this.LIZ.LLLLLJIL(i3, i4, i5, false);
            }
            if (i > 0 && i2 > 0) {
                this.LIZ.LLILZLL.LJJLIIIJLLLLLLLZ(i, i2);
                C1266350j3h c1266350j3h = this.LIZ;
                c1266350j3h.LLLLLZL(c1266350j3h.LLILZLL.LJJIIZI(), this.LIZ.LLILZLL.LJJIIJ(), this.LIZ.LLILZLL.LJJIIJZLJL(), this.LIZ.LLILZLL.LJJIII(), this.LIZ.LLILZLL.LJJIIZ().LIZIZ);
            }
            i6 = 1;
        }
        try {
            JSONObject jSONObject = new JSONObject(tTLHUpdateFpsResolutionCommand.adaptiveResultMap);
            jSONObject.put("execute", i6);
            InterfaceC1266960j4g interfaceC1266960j4g = this.LIZ.LLJI;
            if (interfaceC1266960j4g != null) {
                interfaceC1266960j4g.LIZ("ttlh_adaptive_rule_execute", jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i6 != 0 && i3 > 0 && i4 > 0) {
            this.LIZ.LLLZLZ(i3, i4, "");
        }
    }

    public final void LJFF(TTLHUpdateFpsResolutionCommand tTLHUpdateFpsResolutionCommand) {
        boolean z;
        C1266350j3h c1266350j3h = this.LIZ;
        int i = tTLHUpdateFpsResolutionCommand.width;
        int i2 = tTLHUpdateFpsResolutionCommand.height;
        int i3 = tTLHUpdateFpsResolutionCommand.fps;
        String strLLIIIL = c1266350j3h.LLIIIL(i, i2);
        int i4 = 1;
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        C1274630jH3.LIZ(i, i2, Math.min(this.LIZ.LLILZLL.LJJIL(0), this.LIZ.LLILZLL.LJJIJIIJIL(0)), Math.max(this.LIZ.LLILZLL.LJJIL(0), this.LIZ.LLILZLL.LJJIJIIJIL(0)), z);
        if (this.LIZ.LLFZ() && i > 0 && i2 > 0 && i3 > 0 && !TextUtils.isEmpty(strLLIIIL)) {
            int iMin = Math.min(i, i2);
            int iMax = Math.max(i, i2);
            InterfaceC1266360j3i interfaceC1266360j3i = this.LIZ.LLIZ;
            if (interfaceC1266360j3i != null) {
                interfaceC1266360j3i.LJJIJIL(iMin, iMax, i3);
            }
        } else {
            i4 = 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(tTLHUpdateFpsResolutionCommand.adaptiveResultMap);
            jSONObject.put("execute", i4);
            jSONObject.put(Scene.SCENE_SERVICE, tTLHUpdateFpsResolutionCommand.scene);
            InterfaceC1266960j4g interfaceC1266960j4g = this.LIZ.LLJI;
            if (interfaceC1266960j4g != null) {
                interfaceC1266960j4g.LIZ("ttlh_adaptive_rule_execute", jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LIZ.LLLZLL();
        C0UHL c0uhl = this.LIZ.LLJJIJI;
        if (c0uhl != null) {
            c0uhl.LLLZ(tTLHUpdateFpsResolutionCommand.ruleName, tTLHUpdateFpsResolutionCommand.direction, tTLHUpdateFpsResolutionCommand.resultToParams, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHUpdateFpsResolutionCommand r11) {
        /*
            r10 = this;
            X.0j3h r0 = r10.LIZ
            int r6 = r11.width
            int r5 = r11.height
            int r4 = r11.fps
            java.lang.String r9 = r0.LLIIIL(r6, r5)
            r3 = 1
            r8 = 0
            if (r6 <= r5) goto L79
            r7 = 1
        L11:
            X.0j3h r0 = r10.LIZ
            X.0j8E r0 = r0.LLILZLL
            int r1 = r0.LJJIL(r8)
            X.0j3h r0 = r10.LIZ
            X.0j8E r0 = r0.LLILZLL
            int r0 = r0.LJJIJIIJIL(r8)
            int r2 = java.lang.Math.min(r1, r0)
            X.0j3h r0 = r10.LIZ
            X.0j8E r0 = r0.LLILZLL
            int r1 = r0.LJJIL(r8)
            X.0j3h r0 = r10.LIZ
            X.0j8E r0 = r0.LLILZLL
            int r0 = r0.LJJIJIIJIL(r8)
            int r0 = java.lang.Math.max(r1, r0)
            X.C1274630jH3.LIZ(r6, r5, r2, r0, r7)
            X.0j3h r0 = r10.LIZ
            boolean r0 = r0.LLFZ()
            if (r0 == 0) goto L77
            X.0j3h r0 = r10.LIZ
            r0.getClass()
            java.lang.String r1 = r11.scene
            X.0j6M r0 = X.EnumC1268000j6M.GAME_LIVE
            java.lang.String r0 = r0.getName()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L77
            if (r6 <= 0) goto L77
            if (r5 <= 0) goto L77
            if (r4 <= 0) goto L77
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L77
            int r2 = java.lang.Math.min(r6, r5)
            int r1 = java.lang.Math.max(r6, r5)
            X.0j3h r0 = r10.LIZ
            X.0j3i r0 = r0.LLIZ
            if (r0 == 0) goto L74
            r0.LJJIJIL(r2, r1, r4)
        L74:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.adaptiveResultMap
            goto L7b
        L77:
            r3 = 0
            goto L74
        L79:
            r7 = 0
            goto L11
        L7b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L98
            r2.<init>(r0)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = "execute"
            r2.put(r0, r3)     // Catch: java.lang.Exception -> L98
            java.lang.String r1 = "scene"
            java.lang.String r0 = r11.scene     // Catch: java.lang.Exception -> L98
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L98
            X.0j3h r0 = r10.LIZ     // Catch: java.lang.Exception -> L98
            X.0j4g r1 = r0.LLJI     // Catch: java.lang.Exception -> L98
            if (r1 == 0) goto L9c
            java.lang.String r0 = "ttlh_adaptive_rule_execute"
            r1.LIZ(r0, r2)     // Catch: java.lang.Exception -> L98
            goto L9c
        L98:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L9c:
            X.0j3h r0 = r10.LIZ
            r0.LLLZLL()
            X.0j3h r0 = r10.LIZ
            X.0UHL r4 = r0.LLJJIJI
            if (r4 == 0) goto Lb1
            java.lang.String r3 = r11.ruleName
            java.lang.String r2 = r11.direction
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r11.resultToParams
            r0 = 0
            r4.LLLZ(r3, r2, r1, r0)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1268120j6Y.LJI(com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHUpdateFpsResolutionCommand):void");
    }

    public final void LJII(TTLHUpdateStreamHDParamsCommand tTLHUpdateStreamHDParamsCommand) {
        int i;
        InterfaceC1266410j3n interfaceC1266410j3n;
        if (this.LIZ.LLILZLL.LIZ.mPushBase.LJIILL()) {
            boolean z = tTLHUpdateStreamHDParamsCommand.enable;
            if (this.LIZ.LLJJ() && (interfaceC1266410j3n = this.LIZ.LLJJJ) != null) {
                interfaceC1266410j3n.LJLJI(32, 16, z);
                i = 1;
            } else {
                i = 0;
            }
            try {
                JSONObject jSONObject = new JSONObject(tTLHUpdateStreamHDParamsCommand.adaptiveResultMap);
                jSONObject.put("execute", i);
                jSONObject.put(Scene.SCENE_SERVICE, this.LIZ.LLLLZ);
                InterfaceC1266960j4g interfaceC1266960j4g = this.LIZ.LLJI;
                if (interfaceC1266960j4g != null) {
                    interfaceC1266960j4g.LIZ("ttlh_adaptive_rule_execute", jSONObject);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LIZ.LLLZLL();
            C0UHL c0uhl = this.LIZ.LLJJIJI;
            if (c0uhl != null) {
                c0uhl.LLLZ(tTLHUpdateStreamHDParamsCommand.ruleName, tTLHUpdateStreamHDParamsCommand.direction, tTLHUpdateStreamHDParamsCommand.resultToParams, null);
            }
        }
    }

    public final void LJIIIIZZ(TTLHUpdateLinkMicPerformanceParamsCommand tTLHUpdateLinkMicPerformanceParamsCommand) {
        C1268130j6Z c1268130j6Z = this.LIZ.j;
        if (c1268130j6Z != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateLinkMicPerformanceParams ");
            sbLIZ.append(tTLHUpdateLinkMicPerformanceParamsCommand);
            AVLog.logKibana(4, "LinkMicVideoParamsManagerLog", C2188811AlT.LIZIZ(sbLIZ), null);
            if (!c1268130j6Z.LJJIJLIJ) {
                AVLog.logKibana(4, "LinkMicVideoParamsManagerLog", "updateLinkMicPerformanceParams return because enableAdaptiveLinkMicLayoutParams false", null);
                return;
            }
            try {
                int i = tTLHUpdateLinkMicPerformanceParamsCommand.captureWidth;
                int i2 = tTLHUpdateLinkMicPerformanceParamsCommand.captureHeight;
                int i3 = tTLHUpdateLinkMicPerformanceParamsCommand.fps;
                int i4 = tTLHUpdateLinkMicPerformanceParamsCommand.effectWidth;
                int i5 = tTLHUpdateLinkMicPerformanceParamsCommand.effectHeight;
                int i6 = tTLHUpdateLinkMicPerformanceParamsCommand.encodeWidth;
                int i7 = tTLHUpdateLinkMicPerformanceParamsCommand.encodeHeight;
                c1268130j6Z.LJIIIIZZ(i, i2, i4, i5, i3);
                InterfaceC1268200j6g interfaceC1268200j6g = c1268130j6Z.LJIJJLI;
                if (interfaceC1268200j6g != null) {
                    interfaceC1268200j6g.LJ(i6, i7, i3);
                }
                c1268130j6Z.LIZJ = tTLHUpdateLinkMicPerformanceParamsCommand.performanceLevel;
                c1268130j6Z.LJJIFFI = tTLHUpdateLinkMicPerformanceParamsCommand.multiStreamReasonPerf;
                c1268130j6Z.LJIIJJI(true);
                JSONObject jSONObject = new JSONObject(tTLHUpdateLinkMicPerformanceParamsCommand.adaptiveResultMap);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateLinkMicPerformanceParams success currentPerformanceLevel:");
                sbLIZ2.append(c1268130j6Z.LIZJ);
                sbLIZ2.append(" multiStreamReasonPerf:");
                sbLIZ2.append(c1268130j6Z.LJJIFFI);
                AVLog.logKibana(4, "LinkMicVideoParamsManagerLog", C2188811AlT.LIZIZ(sbLIZ2), null);
                jSONObject.put("execute", 1);
                InterfaceC1266960j4g interfaceC1266960j4g = c1268130j6Z.LJJ;
                if (interfaceC1266960j4g == null) {
                    return;
                }
                interfaceC1266960j4g.LIZ("ttlh_adaptive_rule_execute", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("updateLinkMicPerformanceParams error ");
                sbLIZ3.append(e);
                AVLog.logKibana(6, "LinkMicVideoParamsManagerLog", C2188811AlT.LIZIZ(sbLIZ3), null);
            }
        }
    }

    public final void LJIIIZ(TTLHUpdateLinkMicVideoParamsCommand tTLHUpdateLinkMicVideoParamsCommand) {
        C1268130j6Z c1268130j6Z = this.LIZ.j;
        if (c1268130j6Z != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateLinkMicVideoParams ");
            sbLIZ.append(tTLHUpdateLinkMicVideoParamsCommand);
            AVLog.logKibana(4, "LinkMicVideoParamsManagerLog", C2188811AlT.LIZIZ(sbLIZ), null);
            if (!c1268130j6Z.LJJIJLIJ) {
                AVLog.logKibana(4, "LinkMicVideoParamsManagerLog", "updateLinkMicVideoParams return because enableAdaptiveLinkMicLayoutParams false", null);
                return;
            }
            try {
                JSONObject jSONObject = tTLHUpdateLinkMicVideoParamsCommand.defaultLevelVideoParam;
                c1268130j6Z.LJIIIIZZ(JSONObjectProtectorUtils.getInt(jSONObject, "capture_width"), JSONObjectProtectorUtils.getInt(jSONObject, "capture_height"), JSONObjectProtectorUtils.getInt(jSONObject, "effect_width"), JSONObjectProtectorUtils.getInt(jSONObject, "effect_height"), JSONObjectProtectorUtils.getInt(jSONObject, "fps"));
                c1268130j6Z.LIZJ = tTLHUpdateLinkMicVideoParamsCommand.defaultPerformanceLevel;
                JSONObject jSONObject2 = tTLHUpdateLinkMicVideoParamsCommand.performanceLevels;
                c1268130j6Z.LIZLLL = jSONObject2;
                c1268130j6Z.LJIILIIL(jSONObject2);
                c1268130j6Z.LJ = tTLHUpdateLinkMicVideoParamsCommand.performanceMode;
                c1268130j6Z.LJJI = tTLHUpdateLinkMicVideoParamsCommand.simulcastMode;
                JSONObject jSONObject3 = tTLHUpdateLinkMicVideoParamsCommand.encodeConfigs;
                c1268130j6Z.LJFF = jSONObject3;
                c1268130j6Z.LJIIJ(jSONObject3);
                c1268130j6Z.LJIIJJI(true);
                c1268130j6Z.LJJIIZI = true;
                c1268130j6Z.LJJIJ++;
                if (c1268130j6Z.LJJIJIIJI) {
                    c1268130j6Z.LJJIJIL++;
                }
                Handler handler = c1268130j6Z.LJJIIZ;
                if (handler != null) {
                    handler.removeCallbacks(c1268130j6Z.LJJIIJZLJL);
                }
                JSONObject jSONObject4 = new JSONObject(tTLHUpdateLinkMicVideoParamsCommand.adaptiveResultMap);
                jSONObject4.put("execute", 1);
                InterfaceC1266960j4g interfaceC1266960j4g = c1268130j6Z.LJJ;
                if (interfaceC1266960j4g != null) {
                    interfaceC1266960j4g.LIZ("ttlh_adaptive_rule_execute", jSONObject4);
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - c1268130j6Z.LJJIZ;
                c1268130j6Z.LJJJ = jCurrentTimeMillis;
                ((ArrayList) c1268130j6Z.LJJJI).add(Long.valueOf(jCurrentTimeMillis));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateLinkMicVideoParams success, strategy execution time: ");
                sbLIZ2.append(c1268130j6Z.LJJJ);
                sbLIZ2.append(" ms");
                AVLog.logKibana(4, "LinkMicVideoParamsManagerLog", C2188811AlT.LIZIZ(sbLIZ2), null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("updateLinkMicVideoParams error ");
                sbLIZ3.append(e);
                AVLog.logKibana(6, "LinkMicVideoParamsManagerLog", C2188811AlT.LIZIZ(sbLIZ3), null);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIIJ(TTLHShowToastCommand tTLHShowToastCommand) {
        if (this.LIZ.LLJJIJI != null) {
            this.LIZ.LLJJIJI.LIZLLL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, TextUtils.equals("network", tTLHShowToastCommand.reason) ? 1 : 0, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(tTLHShowToastCommand.adaptiveResultMap);
            jSONObject.put("execute", 1);
            this.LIZ.LLJI.LIZ("ttlh_adaptive_rule_execute", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJIIJJI(TTLHSimulcastCommand tTLHSimulcastCommand) {
        InterfaceC1274230jGP interfaceC1274230jGP = this.LIZ.d;
        if (interfaceC1274230jGP != null && !tTLHSimulcastCommand.linkmicLayoutConfigId.equals(interfaceC1274230jGP.LJIJJLI())) {
            AVLog.logKibana(6, "LiveStream", "simulcast layout changed, discard command", null);
            return;
        }
        int i = 1;
        if (this.LIZ.LLJJ()) {
            if (tTLHSimulcastCommand.effectWidth != this.LIZ.LLILZLL.LJIILJJIL(0) || tTLHSimulcastCommand.effectHeight != this.LIZ.LLILZLL.LJIILIIL(0)) {
                this.LIZ.LLLLZ(true);
            }
        } else {
            C1266350j3h c1266350j3h = this.LIZ;
            LiveStreamVideoCapture liveStreamVideoCapture = c1266350j3h.LLJJIJIL;
            if (liveStreamVideoCapture == null) {
                return;
            }
            if (tTLHSimulcastCommand.effectWidth != liveStreamVideoCapture.LLLIILIL || tTLHSimulcastCommand.effectHeight != liveStreamVideoCapture.LLLIL) {
                c1266350j3h.LLLLZ(true);
            }
        }
        n nVar = new n();
        n nVar2 = new n();
        nVar.LJJIII(Integer.valueOf(tTLHSimulcastCommand.effectWidth), "cap_adapted_width");
        nVar.LJJIII(Integer.valueOf(tTLHSimulcastCommand.effectHeight), "cap_adapted_height");
        InterfaceC1274230jGP interfaceC1274230jGP2 = this.LIZ.d;
        if (interfaceC1274230jGP2 != null && interfaceC1274230jGP2.LJIIZILJ()) {
            nVar.LJJIII(Integer.valueOf(tTLHSimulcastCommand.effectHeight / 2), "cap_adapted_width");
        }
        nVar.LJJIII(Integer.valueOf(tTLHSimulcastCommand.effectFps), "fps");
        nVar2.LJJIFFI("PushBase", nVar);
        this.LIZ.LJIIZILJ(nVar2.toString());
        InterfaceC1274230jGP interfaceC1274230jGP3 = this.LIZ.d;
        if (interfaceC1274230jGP3 != null) {
            interfaceC1274230jGP3.LJI(tTLHSimulcastCommand.perfWidth, tTLHSimulcastCommand.perfHeight, tTLHSimulcastCommand.perfFps, tTLHSimulcastCommand.name, tTLHSimulcastCommand.linkmicLayoutConfigId);
            HashMap<String, Object> map = tTLHSimulcastCommand.toParamsMap;
            HashMap map2 = new HashMap();
            map2.put("multi_stream_encode_fps", map.get("multi_stream_encode_fps"));
            map2.put("multi_stream_push_fps", map.get("multi_stream_push_fps"));
            map2.put("multi_stream_resolution_width", map.get("multi_stream_resolution_width"));
            map2.put("multi_stream_resolution_height", map.get("multi_stream_resolution_height"));
            this.LIZ.d.LJIIIZ(GsonProtectorUtils.toJson(new Gson(), map2));
        }
        try {
            JSONObject jSONObject = new JSONObject(tTLHSimulcastCommand.adaptiveResultMap);
            if (this.LIZ.d == null) {
                i = 0;
            }
            jSONObject.put("execute", i);
            InterfaceC1274230jGP interfaceC1274230jGP4 = this.LIZ.d;
            if (interfaceC1274230jGP4 != null) {
                interfaceC1274230jGP4.LJIIIIZZ(jSONObject);
            }
            this.LIZ.LLJI.LIZ("ttlh_adaptive_rule_execute", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJIIL(TTLHUpdateStreamHDParamsCommand tTLHUpdateStreamHDParamsCommand) {
        int i;
        boolean z = tTLHUpdateStreamHDParamsCommand.enable;
        C1266350j3h c1266350j3h = this.LIZ;
        if (c1266350j3h.LLJLILLLLZIIL != null) {
            if (c1266350j3h.LLJILLL()) {
                InterfaceC1266410j3n interfaceC1266410j3n = this.LIZ.LLJJJ;
                if (interfaceC1266410j3n != null) {
                    interfaceC1266410j3n.LJLJI(32, 16, z);
                }
            } else {
                this.LIZ.LLJLILLLLZIIL.LJJZZI(16, z);
            }
            i = 1;
        } else {
            i = 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(tTLHUpdateStreamHDParamsCommand.adaptiveResultMap);
            jSONObject.put("execute", i);
            InterfaceC1266960j4g interfaceC1266960j4g = this.LIZ.LLJI;
            if (interfaceC1266960j4g != null) {
                interfaceC1266960j4g.LIZ("ttlh_adaptive_rule_execute", jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LIZ.LLLZLL();
    }

    public final void LIZJ(final C1268070j6T c1268070j6T, C1268110j6X c1268110j6X) {
        int i;
        String str;
        int iOptInt;
        int iOptInt2;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (TextUtils.equals(c1268070j6T.ruleName, "effect_resource_strategy")) {
            C0UHL c0uhl = this.LIZ.LLJJIJI;
            if (c0uhl != null) {
                c0uhl.LLLZ(c1268070j6T.ruleName, c1268070j6T.direction, c1268070j6T.resultToParams, new C0U8C() { // from class: X.0j6R
                    @Override // X.C0U8C
                    public final void LIZ(String str2) {
                        C1268120j6Y c1268120j6Y = this.LIZ;
                        C1268070j6T c1268070j6T2 = c1268070j6T;
                        c1268120j6Y.getClass();
                        int i2 = 0;
                        if (!TextUtils.isEmpty(str2)) {
                            try {
                                if (new JSONObject(str2).optInt("error_code", -1) == 0) {
                                    i2 = 1;
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } else {
                            str2 = "";
                        }
                        c1268120j6Y.LIZ.LJLJJLL(c1268070j6T2, str2, i2);
                    }
                });
                return;
            }
            return;
        }
        if (!TextUtils.equals(c1268070j6T.ruleName, "effect_model_strategy")) {
            return;
        }
        int i2 = 0;
        if (c1268070j6T.resultToParams.containsKey("force_downgrade_to_bottom") && CastIntegerProtector.parseInt(c1268070j6T.resultToParams.get("force_downgrade_to_bottom").toString()) == 1) {
            str = "alg_model_minimum";
            i = 0;
        } else {
            if (c1268070j6T.resultToParams.containsKey("level")) {
                i = CastIntegerProtector.parseInt(c1268070j6T.resultToParams.get("level").toString());
                if (i == 0) {
                    str = "alg_model_recover";
                }
            } else {
                i = 0;
            }
            str = "alg_model_grade";
        }
        String outData = "";
        EffectAlgorithmStrategyResult effectAlgorithmStrategy = this.LIZ.LLJLILLLLZIIL.LJJJLL().setEffectAlgorithmStrategy(str, i, "");
        if (effectAlgorithmStrategy != null && effectAlgorithmStrategy.getStatusCode() == 0 && !TextUtils.isEmpty(effectAlgorithmStrategy.getOutData())) {
            outData = effectAlgorithmStrategy.getOutData();
            i2 = 1;
        }
        JSONObject jSONObjectLJLJJLL = this.LIZ.LJLJJLL(c1268070j6T, outData, i2);
        C1268090j6V c1268090j6V = c1268110j6X.LIZ;
        C1268070j6T c1268070j6T2 = c1268110j6X.LIZIZ;
        c1268090j6V.getClass();
        if (jSONObjectLJLJJLL == null || !TextUtils.equals(c1268070j6T2.ruleName, "effect_model_strategy")) {
            return;
        }
        try {
            c1268070j6T2.adaptiveStrategyStatus = jSONObjectLJLJJLL.optString("direction");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectLJLJJLL.optJSONObject("to_params");
            JSONObject jSONObjectOptJSONObject4 = jSONObjectLJLJJLL.optJSONObject("from_params");
            JSONObject jSONObjectOptJSONObject5 = jSONObjectLJLJJLL.optJSONObject("init");
            int iOptInt3 = -1;
            if (jSONObjectOptJSONObject3 != null) {
                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject3.optJSONObject("tt_matting");
                if (jSONObjectOptJSONObject6 != null) {
                    iOptInt = jSONObjectOptJSONObject6.optInt("effect_level", -1);
                    c1268070j6T2.adaptiveStrategyLevelMap.put("tt_matting", Integer.valueOf(iOptInt));
                } else {
                    iOptInt = -1;
                }
                JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject3.optJSONObject("tt_face_extra");
                if (jSONObjectOptJSONObject7 != null) {
                    c1268070j6T2.adaptiveStrategyLevelMap.put("tt_face_extra", Integer.valueOf(jSONObjectOptJSONObject7.optInt("effect_level", -1)));
                }
            } else {
                iOptInt = -1;
            }
            if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("tt_matting")) != null) {
                iOptInt2 = jSONObjectOptJSONObject2.optInt("effect_level");
            } else {
                iOptInt2 = -1;
            }
            if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject5.optJSONObject("tt_matting")) != null) {
                iOptInt3 = jSONObjectOptJSONObject.optInt("effect_level");
            }
            if (iOptInt >= 0) {
                if (iOptInt3 >= 0) {
                    if (iOptInt < iOptInt3) {
                        c1268070j6T2.adaptiveStrategyStatusListItem = "effect_model_up";
                    } else if (iOptInt > iOptInt3) {
                        c1268070j6T2.adaptiveStrategyStatusListItem = "effect_model_down";
                    } else {
                        c1268070j6T2.adaptiveStrategyStatusListItem = "effect_model_default";
                    }
                }
                if (iOptInt2 >= 0) {
                    if (iOptInt < iOptInt2) {
                        c1268070j6T2.adaptiveStrategyName = "effect_model_up";
                        c1268070j6T2.adaptiveStrategyStatus = "up";
                    } else if (iOptInt > iOptInt2) {
                        c1268070j6T2.adaptiveStrategyName = "effect_model_down";
                        c1268070j6T2.adaptiveStrategyStatus = "down";
                    } else {
                        c1268070j6T2.adaptiveStrategyName = "effect_model_default";
                        c1268070j6T2.adaptiveStrategyStatus = "default";
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((HashMap) c1268090j6V.LIZJ).put(c1268070j6T2.ruleName, c1268070j6T2);
    }
}
