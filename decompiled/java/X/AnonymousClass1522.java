package X;

import com.bytedance.android.livesdk.livesetting.game.GameKeytimeRecognitionLiveSetting;
import com.bytedance.android.livesdk.livesetting.game.GameRestRecognitionLiveSetting;
import com.bytedance.android.livesdk.livesetting.game.VirtualSexualModelOffloadOptSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.ab.GameKeytimeRecognitionExperiment;
import com.ss.android.ugc.aweme.ml.ab.SmartGameMLBBHeroRecognitionExperiment;
import com.ss.android.ugc.aweme.ml.ab.SmartGameRestRecognitionExperiment;
import com.ss.android.ugc.aweme.ml.ab.SmartSexualRecognitionExperiment;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1522, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1522 {
    public static int[] LIZJ;
    public static AbstractC1511510pR7 LJ;
    public static final AnonymousClass1522 LIZ = new AnonymousClass1522();
    public static final String[] LIZIZ = {"115", "251"};
    public static final Float[] LIZLLL = GameRestRecognitionLiveSetting.INSTANCE.getValue().scoreThreshold;

    public static float[] LIZ(Map map) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        float fFloatValue5;
        float fFloatValue6;
        float fFloatValue7;
        float[] fArr = new float[8];
        if (map != null) {
            if (map.size() < 8) {
                return fArr;
            }
            Float f = (Float) map.get("label0");
            float fFloatValue8 = 0.0f;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            fArr[0] = fFloatValue;
            if (fFloatValue < 1.0E-4d) {
                fArr[0] = 1.0E-4f;
            }
            Float f2 = (Float) map.get("label1");
            if (f2 != null) {
                fFloatValue2 = f2.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            fArr[1] = fFloatValue2;
            if (fFloatValue2 < 1.0E-4d) {
                fArr[1] = 1.0E-4f;
            }
            Float f3 = (Float) map.get("label2");
            if (f3 != null) {
                fFloatValue3 = f3.floatValue();
            } else {
                fFloatValue3 = 0.0f;
            }
            fArr[2] = fFloatValue3;
            if (fFloatValue3 < 1.0E-4d) {
                fArr[2] = 1.0E-4f;
            }
            Float f4 = (Float) map.get("label3");
            if (f4 != null) {
                fFloatValue4 = f4.floatValue();
            } else {
                fFloatValue4 = 0.0f;
            }
            fArr[3] = fFloatValue4;
            if (fFloatValue4 < 1.0E-4d) {
                fArr[3] = 1.0E-4f;
            }
            Float f5 = (Float) map.get("label4");
            if (f5 != null) {
                fFloatValue5 = f5.floatValue();
            } else {
                fFloatValue5 = 0.0f;
            }
            fArr[4] = fFloatValue5;
            if (fFloatValue5 < 1.0E-4d) {
                fArr[4] = 1.0E-4f;
            }
            Float f6 = (Float) map.get("label5");
            if (f6 != null) {
                fFloatValue6 = f6.floatValue();
            } else {
                fFloatValue6 = 0.0f;
            }
            fArr[5] = fFloatValue6;
            if (fFloatValue6 < 1.0E-4d) {
                fArr[5] = 1.0E-4f;
            }
            Float f7 = (Float) map.get("label6");
            if (f7 != null) {
                fFloatValue7 = f7.floatValue();
            } else {
                fFloatValue7 = 0.0f;
            }
            fArr[6] = fFloatValue7;
            if (fFloatValue7 < 1.0E-4d) {
                fArr[6] = 1.0E-4f;
            }
            Float f8 = (Float) map.get("label7");
            if (f8 != null) {
                fFloatValue8 = f8.floatValue();
            }
            fArr[7] = fFloatValue8;
            if (fFloatValue8 < 1.0E-4d) {
                fArr[7] = 1.0E-4f;
            }
        }
        Map<String, Object> map2 = C1338270kvh.LIZ;
        return fArr;
    }

    public static float[] LIZIZ(Map map) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        float fFloatValue5;
        float[] fArr = new float[6];
        if (map != null) {
            if (map.size() < 6) {
                return fArr;
            }
            Float f = (Float) map.get("label0");
            float fFloatValue6 = 0.0f;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            fArr[0] = fFloatValue;
            if (fFloatValue < 1.0E-4d) {
                fArr[0] = 1.0E-4f;
            }
            Float f2 = (Float) map.get("label1");
            if (f2 != null) {
                fFloatValue2 = f2.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            fArr[1] = fFloatValue2;
            if (fFloatValue2 < 1.0E-4d) {
                fArr[1] = 1.0E-4f;
            }
            Float f3 = (Float) map.get("label2");
            if (f3 != null) {
                fFloatValue3 = f3.floatValue();
            } else {
                fFloatValue3 = 0.0f;
            }
            fArr[2] = fFloatValue3;
            if (fFloatValue3 < 1.0E-4d) {
                fArr[2] = 1.0E-4f;
            }
            Float f4 = (Float) map.get("label3");
            if (f4 != null) {
                fFloatValue4 = f4.floatValue();
            } else {
                fFloatValue4 = 0.0f;
            }
            fArr[3] = fFloatValue4;
            if (fFloatValue4 < 1.0E-4d) {
                fArr[3] = 1.0E-4f;
            }
            Float f5 = (Float) map.get("label4");
            if (f5 != null) {
                fFloatValue5 = f5.floatValue();
            } else {
                fFloatValue5 = 0.0f;
            }
            fArr[4] = fFloatValue5;
            if (fFloatValue5 < 1.0E-4d) {
                fArr[4] = 1.0E-4f;
            }
            Float f6 = (Float) map.get("label5");
            if (f6 != null) {
                fFloatValue6 = f6.floatValue();
            }
            fArr[5] = fFloatValue6;
            if (fFloatValue6 < 1.0E-4d) {
                fArr[5] = 1.0E-4f;
            }
        }
        Map<String, Object> map2 = C1338270kvh.LIZ;
        return fArr;
    }

    public static AbstractC1511510pR7 LJ(C151B c151b) {
        String scene;
        AbstractC1511510pR7 abstractC1511510pR7 = LJ;
        if (abstractC1511510pR7 != null) {
            return abstractC1511510pR7;
        }
        if (c151b == C151B.SEXUAL) {
            C1511390pQv c1511390pQvLIZ = C1511420pQy.LIZ();
            C1510230pP3 c1510230pP3 = new C1510230pP3(SmartSexualRecognitionExperiment.SCENE);
            SmartSexualRecognitionExperiment smartSexualRecognitionExperiment = SmartSexualRecognitionExperiment.INSTANCE;
            c1510230pP3.LIZIZ = smartSexualRecognitionExperiment.getConfig();
            LJ = c1511390pQvLIZ.LIZ(SmartSexualRecognitionExperiment.SCENE, c1510230pP3);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sexual config=");
            sbLIZ.append(smartSexualRecognitionExperiment.getConfig());
            C20441214yg.LJIIIZ("GameAiRecognitionManagerTag", C2188811AlT.LIZIZ(sbLIZ));
            return LJ;
        }
        if (c151b == C151B.KEY_TIME) {
            GameKeytimeRecognitionExperiment gameKeytimeRecognitionExperiment = GameKeytimeRecognitionExperiment.INSTANCE;
            AnonymousClass1528 config = gameKeytimeRecognitionExperiment.getConfig();
            if (config == null || (scene = config.getScene()) == null) {
                scene = "game_keytime_recognition";
            }
            C1511390pQv c1511390pQvLIZ2 = C1511420pQy.LIZ();
            C1510230pP3 c1510230pP32 = new C1510230pP3(scene);
            c1510230pP32.LIZIZ = gameKeytimeRecognitionExperiment.getConfig();
            LJ = c1511390pQvLIZ2.LIZ(scene, c1510230pP32);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("keytime config=");
            sbLIZ2.append(gameKeytimeRecognitionExperiment.getConfig());
            C20441214yg.LJIIIZ("GameAiRecognitionManagerTag", C2188811AlT.LIZIZ(sbLIZ2));
            return LJ;
        }
        return null;
    }

    public static AbstractC1511510pR7 LJFF(C151B c151b) {
        String scene;
        String scene2;
        int i = C151C.LIZ[c151b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    C1511390pQv c1511390pQvLIZ = C1511420pQy.LIZ();
                    C1510230pP3 c1510230pP3 = new C1510230pP3(SmartGameMLBBHeroRecognitionExperiment.SCENE);
                    c1510230pP3.LIZIZ = SmartGameMLBBHeroRecognitionExperiment.INSTANCE.getConfig();
                    return c1511390pQvLIZ.LIZ(SmartGameMLBBHeroRecognitionExperiment.SCENE, c1510230pP3);
                }
                C1511390pQv c1511390pQvLIZ2 = C1511420pQy.LIZ();
                C1510230pP3 c1510230pP32 = new C1510230pP3(SmartSexualRecognitionExperiment.SCENE);
                c1510230pP32.LIZIZ = SmartSexualRecognitionExperiment.INSTANCE.getConfig();
                return c1511390pQvLIZ2.LIZ(SmartSexualRecognitionExperiment.SCENE, c1510230pP32);
            }
            SmartGameRestRecognitionExperiment smartGameRestRecognitionExperiment = SmartGameRestRecognitionExperiment.INSTANCE;
            AnonymousClass1527 config = smartGameRestRecognitionExperiment.getConfig();
            if (config == null || (scene2 = config.getScene()) == null) {
                scene2 = SmartGameRestRecognitionExperiment.SCENE;
            }
            C1511390pQv c1511390pQvLIZ3 = C1511420pQy.LIZ();
            C1510230pP3 c1510230pP33 = new C1510230pP3(scene2);
            c1510230pP33.LIZIZ = smartGameRestRecognitionExperiment.getConfig();
            return c1511390pQvLIZ3.LIZ(scene2, c1510230pP33);
        }
        GameKeytimeRecognitionExperiment gameKeytimeRecognitionExperiment = GameKeytimeRecognitionExperiment.INSTANCE;
        AnonymousClass1528 config2 = gameKeytimeRecognitionExperiment.getConfig();
        if (config2 == null || (scene = config2.getScene()) == null) {
            scene = "game_keytime_recognition";
        }
        C1511390pQv c1511390pQvLIZ4 = C1511420pQy.LIZ();
        C1510230pP3 c1510230pP34 = new C1510230pP3(scene);
        c1510230pP34.LIZIZ = gameKeytimeRecognitionExperiment.getConfig();
        return c1511390pQvLIZ4.LIZ(scene, c1510230pP34);
    }

    public static AbstractC1511510pR7 LJI(C151B c151b) {
        int i = C151C.LIZ[c151b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return LJFF(c151b);
                }
                if (VirtualSexualModelOffloadOptSetting.INSTANCE.getValue()) {
                    return LJFF(c151b);
                }
                return LJ(c151b);
            }
            if (GameRestRecognitionLiveSetting.INSTANCE.getValue().enableFunction) {
                return LJFF(c151b);
            }
            return LJ(c151b);
        }
        if (GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelOffloadOpt) {
            return LJFF(c151b);
        }
        return LJ(c151b);
    }

    public static void LIZJ(ByteBuffer byteBuffer, C151R c151r, C151B c151b) {
        Float f;
        float[] fArrLIZ;
        float fFloatValue;
        Map<String, Object> map = C1338270kvh.LIZ;
        AbstractC1511510pR7 abstractC1511510pR7LJI = LJI(c151b);
        if (abstractC1511510pR7LJI != null && abstractC1511510pR7LJI.enable()) {
            int[] iArr = LIZJ;
            if (iArr == null) {
                iArr = new int[150528];
            }
            LIZJ = iArr;
            int i = 0;
            C1509310pNZ c1509310pNZ = new C1509310pNZ(0);
            byte[] bArrArray = byteBuffer.array();
            int length = bArrArray.length;
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                if (i3 % 4 != 0 && i2 < 150528) {
                    iArr[i2] = bArrArray[i] & 255;
                    i2++;
                }
                i = i3;
            }
            c1509310pNZ.LIZIZ().put("image_array", iArr);
            C1512100pS4 c1512100pS4RunSync = abstractC1511510pR7LJI.runSync(c1509310pNZ);
            if (c1512100pS4RunSync == null) {
                c151r.LIZ(new C204518150y(0.0f, new float[8], false, c151b, false, 112));
                return;
            }
            if (c1512100pS4RunSync.LIZIZ()) {
                Map<String, Float> map2 = c1512100pS4RunSync.LIZJ;
                Map<String, Object> map3 = C1338270kvh.LIZ;
                if (map2 != null) {
                    f = map2.get("true");
                } else {
                    f = null;
                }
                if (GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelOpt) {
                    fArrLIZ = LIZIZ(map2);
                } else {
                    fArrLIZ = LIZ(map2);
                }
                if (f != null) {
                    fFloatValue = f.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                c151r.LIZ(new C204518150y(fFloatValue, fArrLIZ, true, c151b, false, 112));
                return;
            }
            c151r.LIZ(new C204518150y(0.0f, new float[8], false, c151b, false, 112));
            Map<String, Object> map4 = C1338270kvh.LIZ;
            return;
        }
        c151r.LIZ(new C204518150y(0.0f, new float[8], false, c151b, false, 112));
    }

    public static void LIZLLL(ByteBuffer byteBuffer, C151R c151r, C151B c151b, boolean z, long j, String str) {
        float[] fArrLIZ;
        float fFloatValue;
        int iIntValue;
        float fFloatValue2;
        float fFloatValue3;
        EnumC19363810pI enumC19363810pI;
        Float[] fArr;
        Float[] fArr2;
        Float f;
        Integer num;
        EnumC19363810pI enumC19363810pI2;
        float fFloatValue4;
        float[] fArr3;
        JSONArray jSONArray;
        float fFloatValue5;
        Float fLJIIIIZZ;
        float[] fArr4;
        Map<String, Object> map = C1338270kvh.LIZ;
        AbstractC1511510pR7 abstractC1511510pR7LJI = LJI(c151b);
        if (abstractC1511510pR7LJI != null && abstractC1511510pR7LJI.enable()) {
            int[] iArr = LIZJ;
            if (iArr == null) {
                iArr = new int[150528];
            }
            LIZJ = iArr;
            int i = 0;
            C1509310pNZ c1509310pNZ = new C1509310pNZ(0);
            if (!z) {
                byte[] bArrArray = byteBuffer.array();
                int length = bArrArray.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i2 + 1;
                    if (i4 % 4 != 0 && i3 < 150528) {
                        iArr[i3] = bArrArray[i2] & 255;
                        i3++;
                    }
                    i2 = i4;
                }
                c1509310pNZ.LIZIZ().put("image_array", iArr);
                if (c151b == C151B.KEY_GAP) {
                    Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
                    LIZ.getClass();
                    if (Intrinsics.LJFF(str, "129")) {
                        fArr4 = new float[]{0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                    } else if (Intrinsics.LJFF(str, "104")) {
                        fArr4 = new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                    } else if (Intrinsics.LJFF(str, "134")) {
                        fArr4 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                    } else if (Intrinsics.LJFF(str, "108")) {
                        fArr4 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                    } else if (Intrinsics.LJFF(str, "123")) {
                        fArr4 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                    } else if (Intrinsics.LJFF(str, "132")) {
                        fArr4 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f};
                    } else if (Intrinsics.LJFF(str, "1041")) {
                        fArr4 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};
                    } else if (Intrinsics.LJFF(str, "117")) {
                        fArr4 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
                    } else if (Intrinsics.LJFF(str, "119")) {
                        fArr4 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
                    } else if (C13LQ.LJIILLIIL(str, LIZIZ)) {
                        fArr4 = new float[]{0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                    } else {
                        fArr4 = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                    }
                    mapLIZIZ.put("outer_input", fArr4);
                }
            } else {
                c1509310pNZ.LIZIZ().put("room_id", String.valueOf(j));
            }
            C1512100pS4 c1512100pS4RunSync = abstractC1511510pR7LJI.runSync(c1509310pNZ);
            if (c1512100pS4RunSync == null) {
                c151r.LIZ(new C204518150y(0.0f, new float[8], false, c151b, z, 80));
                return;
            }
            if (c1512100pS4RunSync.LIZIZ()) {
                Map<String, Float> map2 = c1512100pS4RunSync.LIZJ;
                Map<String, Object> map3 = C1338270kvh.LIZ;
                int i5 = C151C.LIZ[c151b.ordinal()];
                if (i5 != 1) {
                    Object obj = null;
                    Object obj2 = null;
                    Float f2 = null;
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 != 4) {
                                c151r.LIZ(new C204518150y(0.0f, new float[8], false, c151b, z, 80));
                                return;
                            }
                            try {
                                Map<String, Object> map4 = c1512100pS4RunSync.LJFF;
                                if (map4 != null) {
                                    obj2 = map4.get("confidence");
                                }
                                if ((obj2 instanceof JSONArray) && (jSONArray = (JSONArray) obj2) != null) {
                                    fArr3 = new float[jSONArray.length()];
                                    int length2 = jSONArray.length();
                                    while (i < length2) {
                                        Object objOpt = jSONArray.opt(i);
                                        if (objOpt instanceof Number) {
                                            fFloatValue5 = ((Number) objOpt).floatValue();
                                        } else if ((objOpt instanceof String) && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ((String) objOpt)) != null) {
                                            fFloatValue5 = fLJIIIIZZ.floatValue();
                                        } else {
                                            fFloatValue5 = 0.0f;
                                        }
                                        fArr3[i] = fFloatValue5;
                                        i++;
                                    }
                                } else {
                                    fArr3 = new float[0];
                                }
                                c151r.LIZ(new C204518150y(0.0f, fArr3, true, c151b, false, 80));
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                Map<String, Object> map5 = C1338270kvh.LIZ;
                                c151r.LIZ(new C204518150y(0.0f, null, false, null, false, 127));
                                return;
                            }
                        }
                        if (map2 != null) {
                            f2 = map2.get("true");
                        }
                        if (f2 != null) {
                            fFloatValue4 = f2.floatValue();
                        } else {
                            fFloatValue4 = 0.0f;
                        }
                        c151r.LIZ(new C204518150y(fFloatValue4, new float[8], true, c151b, z, 80));
                        return;
                    }
                    if (z) {
                        String str2 = c1512100pS4RunSync.LJ;
                        if (str2 != null) {
                            try {
                                String strOptString = new JSONObject(str2).optString("Result");
                                if (Intrinsics.LJFF(strOptString, "1")) {
                                    enumC19363810pI2 = EnumC19363810pI.REST;
                                } else if (Intrinsics.LJFF(strOptString, "2")) {
                                    enumC19363810pI2 = EnumC19363810pI.UNREST;
                                } else {
                                    enumC19363810pI2 = EnumC19363810pI.UNKNOWN;
                                }
                                c151r.LIZ(new C204518150y(1.0f, new float[8], true, c151b, 0.0f, true, enumC19363810pI2));
                                return;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                c151r.LIZ(new C204518150y(1.0f, new float[8], false, c151b, true, 64));
                                return;
                            }
                        }
                        c151r.LIZ(new C204518150y(1.0f, new float[8], false, c151b, true, 64));
                        return;
                    }
                    if (!z) {
                        String str3 = c1512100pS4RunSync.LIZIZ;
                        Map<String, Object> map6 = c1512100pS4RunSync.LJFF;
                        if (map6 != null) {
                            obj = map6.get("result");
                        }
                        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = -1;
                        }
                        if (map2 != null && (f = map2.get(str3)) != null) {
                            fFloatValue2 = f.floatValue();
                        } else {
                            fFloatValue2 = 0.0f;
                        }
                        if (iIntValue >= 0 && (fArr2 = LIZLLL) != null && iIntValue < fArr2.length && fArr2 != null) {
                            fFloatValue3 = fArr2[iIntValue].floatValue();
                        } else {
                            fFloatValue3 = 1.0f;
                        }
                        if (iIntValue == 0) {
                            enumC19363810pI = EnumC19363810pI.UNREST;
                        } else if (iIntValue > 0 && (fArr = LIZLLL) != null && iIntValue < fArr.length && fFloatValue2 >= fFloatValue3) {
                            enumC19363810pI = EnumC19363810pI.REST;
                        } else {
                            enumC19363810pI = EnumC19363810pI.UNKNOWN;
                        }
                        c151r.LIZ(new C204518150y(fFloatValue2, new float[8], true, c151b, fFloatValue3, false, enumC19363810pI));
                        return;
                    }
                    throw new C1954807lC();
                }
                if (z) {
                    C20441214yg.LJIIIIZZ("cloud ai inference todo");
                    String str4 = c1512100pS4RunSync.LJ;
                    if (str4 != null) {
                        try {
                            JSONArray jSONArray2 = new JSONArray(str4);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            int length3 = jSONArray2.length();
                            while (i < length3) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("label");
                                sbLIZ.append(i);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(JSONArrayProtectorUtils.getString(jSONArray2, i));
                                if (fLJIIIIZZ2 != null) {
                                    fFloatValue = fLJIIIIZZ2.floatValue();
                                } else {
                                    fFloatValue = 0.0f;
                                }
                                linkedHashMap.put(strLIZIZ, Float.valueOf(fFloatValue));
                                i++;
                            }
                            LIZ.getClass();
                            c151r.LIZ(new C204518150y(0.0f, LIZIZ(linkedHashMap), true, c151b, true, 80));
                            return;
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            c151r.LIZ(new C204518150y(0.0f, new float[6], false, c151b, true, 64));
                            return;
                        }
                    }
                    c151r.LIZ(new C204518150y(1.0f, new float[6], false, c151b, true, 64));
                    return;
                }
                if (!z) {
                    if (GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelOpt) {
                        fArrLIZ = LIZIZ(map2);
                    } else {
                        fArrLIZ = LIZ(map2);
                    }
                    c151r.LIZ(new C204518150y(0.0f, fArrLIZ, true, c151b, false, 80));
                    return;
                }
                throw new C1954807lC();
            }
            c151r.LIZ(new C204518150y(0.0f, new float[8], false, c151b, z, 80));
            Map<String, Object> map7 = C1338270kvh.LIZ;
            return;
        }
        c151r.LIZ(new C204518150y(0.0f, new float[8], false, c151b, z, 80));
    }
}
