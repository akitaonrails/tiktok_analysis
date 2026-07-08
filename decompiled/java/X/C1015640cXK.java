package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentSizeModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cXK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015640cXK {
    /* JADX WARN: Type inference failed for: r3v6, types: [X.0cX7] */
    public static final void LIZ(final C1015550cXB c1015550cXB, boolean z, JSONObject jSONObject, final InterfaceC1015680cXO interfaceC1015680cXO) {
        String str;
        float f;
        float f2;
        C19JH<View> c19jhLIZIZ;
        if (c1015550cXB.LL.getUgenTemplateModel() != null && jSONObject != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AnoleUgenPrerender real render() ugenTemplateModel = ");
            sbLIZ.append(c1015550cXB.LL.getUgenTemplateModel());
            sbLIZ.append(", ugenData = ");
            sbLIZ.append(jSONObject);
            C2188811AlT.LIZIZ(sbLIZ);
            AbstractC1014880cW6 abstractC1014880cW6 = c1015550cXB.LLJLILLLLZIIL;
            C1014980cWG c1014980cWG = C1014980cWG.LIZ;
            if (!Intrinsics.LJFF(abstractC1014880cW6, c1014980cWG) && !Intrinsics.LJFF(c1015550cXB.LLJLILLLLZIIL, C1014990cWH.LIZ)) {
                c1015550cXB.LJJIII(c1014980cWG);
                C1015650cXL c1015650cXL = new C1015650cXL();
                final long jCurrentTimeMillis = System.currentTimeMillis();
                AnoleComponentModel anoleComponentModel = c1015550cXB.LL;
                C1009340cNA c1009340cNA = c1015550cXB.LLILLJJLI;
                C1015450cX1 c1015450cX1 = C1015450cX1.LIZ;
                String str2 = (String) c1015550cXB.LLLIIIIL.getValue();
                String str3 = (String) c1015550cXB.LLLIIIL.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_prerender", str);
                c1015450cX1.getClass();
                C1015450cX1.LJIIJ("anole_component_start_render", str2, str3, anoleComponentModel, c1009340cNA, linkedHashMap);
                c1015650cXL.LIZ = c1015550cXB.LLILZ;
                c1015650cXL.LIZIZ = jSONObject;
                C1049800dQQ c1049800dQQLJJI = c1015550cXB.LJJI();
                c1049800dQQLJJI.LJIIIIZZ = c1015650cXL;
                c1049800dQQLJJI.LIZIZ = c1015650cXL.LIZIZ;
                c1015550cXB.LJJI().LJFF = new InterfaceC1015520cX8() { // from class: X.0cX7
                    @Override // X.InterfaceC1015520cX8
                    public final void LIZ(C19JH<?> c19jh, MotionEvent motionEvent) {
                        String str4;
                        C1015550cXB c1015550cXB2 = c1015550cXB;
                        String str5 = null;
                        if (c19jh != null) {
                            str4 = c19jh.LLJ;
                        } else {
                            str4 = null;
                        }
                        c1015550cXB2.LLJZ = str4;
                        if (c19jh != null) {
                            str5 = c19jh.LLJI;
                        }
                        c1015550cXB2.LLJZIJLIL = str5;
                        if (motionEvent != null) {
                            if (motionEvent.getAction() == 0) {
                                c1015550cXB.LLL = Float.valueOf(motionEvent.getX());
                                c1015550cXB.LLLF = Float.valueOf(motionEvent.getY());
                            } else if (motionEvent.getAction() == 1) {
                                c1015550cXB.LLLFF = Float.valueOf(motionEvent.getX());
                                c1015550cXB.LLLFFI = Float.valueOf(motionEvent.getY());
                            }
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateCoordinate ugenClickId = ");
                        sbLIZ2.append(c1015550cXB.LLJZ);
                        sbLIZ2.append(", ugenClickName = ");
                        sbLIZ2.append(c1015550cXB.LLJZIJLIL);
                        sbLIZ2.append(" ,ugenWidgetDownX = ");
                        sbLIZ2.append(c1015550cXB.LLL);
                        sbLIZ2.append(",ugenWidgetDownY = ");
                        sbLIZ2.append(c1015550cXB.LLLF);
                        sbLIZ2.append(",ugenWidgetUpX = ");
                        sbLIZ2.append(c1015550cXB.LLLFF);
                        sbLIZ2.append(",ugenWidgetUpY = ");
                        sbLIZ2.append(c1015550cXB.LLLFFI);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                };
                C1049800dQQ c1049800dQQLJJI2 = c1015550cXB.LJJI();
                C1015420cWy c1015420cWy = new C1015420cWy(c1015550cXB.LL, c1015550cXB.LLILLJJLI, c1015550cXB.LLILLL, c1015550cXB, (String) c1015550cXB.LLLIIIIL.getValue(), (String) c1015550cXB.LLLIIIL.getValue());
                c1049800dQQLJJI2.getClass();
                C1015570cXD.LIZ().getClass();
                c1049800dQQLJJI2.LIZLLL = c1015420cWy;
                c1015550cXB.LJJI().LJ = c1015550cXB.LJJIFFI();
                C1009390cNF c1009390cNFW2 = c1015550cXB.LLILLL.W2(c1015550cXB.LL.slotID);
                if (c1009390cNFW2 != null) {
                    f = (float) c1009390cNFW2.LIZ;
                } else {
                    f = 0.0f;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AnoleUgenPrerender real render() setTemplateSize(), maxWidth = ");
                sbLIZ2.append(f);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (c1009390cNFW2 != null) {
                    f2 = (float) c1009390cNFW2.LIZIZ;
                } else {
                    f2 = 0.0f;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("AnoleUgenPrerender real render()  setTemplateSize(), maxHeight = ");
                sbLIZ3.append(f2);
                C2188811AlT.LIZIZ(sbLIZ3);
                C1049800dQQ c1049800dQQLJJI3 = c1015550cXB.LJJI();
                c1049800dQQLJJI3.LJIIJJI = f;
                c1049800dQQLJJI3.LJIIL = f2;
                c1015550cXB.LJJI().LJIILJJIL = c1015550cXB.LL.getUgenResourceReadyPercent();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("AnoleUgenPrerender ugenResourceReadyPercent = ");
                sbLIZ4.append(c1015550cXB.LL.getUgenResourceReadyPercent());
                C2188811AlT.LIZIZ(sbLIZ4);
                AnoleComponentModel anoleComponentModel2 = c1015550cXB.LL;
                Gson gsonLIZ = C09C2.LIZ();
                AnoleComponentSizeModel anoleComponentSizeModel = anoleComponentModel2.size;
                if (anoleComponentSizeModel != null) {
                    jSONObject.put("size", new JSONObject(GsonProtectorUtils.toJson(gsonLIZ, anoleComponentSizeModel)));
                }
                AnoleComponentLayoutModel anoleComponentLayoutModel = anoleComponentModel2.layout;
                if (anoleComponentLayoutModel != null) {
                    jSONObject.put("layout", new JSONObject(GsonProtectorUtils.toJson(gsonLIZ, anoleComponentLayoutModel)));
                }
                Context context = c1015550cXB.LLILZ;
                jSONObject.put("system", "android");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("screen_width", C418440Gaw.LJFF(C14KQ.LJIIIIZZ(context), context));
                jSONObject2.put("screen_height", C418440Gaw.LJFF(C14KQ.LJ(context), context));
                jSONObject.put("ugenConfig", jSONObject2);
                C1049800dQQ c1049800dQQLJJI4 = c1015550cXB.LJJI();
                JSONObject ugenTemplateModel = c1015550cXB.LL.getUgenTemplateModel();
                InterfaceC1015670cXN interfaceC1015670cXN = new InterfaceC1015670cXN() { // from class: X.0cXJ
                    @Override // X.InterfaceC1015670cXN
                    public final void LIZ(C1015660cXM c1015660cXM) {
                        boolean z2;
                        String str4;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        int i = c1015660cXM.LIZ;
                        if (i == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C1015550cXB c1015550cXB2 = c1015550cXB;
                        String strValueOf = String.valueOf(i);
                        C1015550cXB c1015550cXB3 = c1015550cXB;
                        AnoleComponentModel anoleComponentModel3 = c1015550cXB3.LL;
                        C1009340cNA c1009340cNA2 = c1015550cXB3.LLILLJJLI;
                        C1015450cX1 c1015450cX12 = C1015450cX1.LIZ;
                        String str5 = (String) c1015550cXB2.LLLIIIIL.getValue();
                        String str6 = (String) c1015550cXB2.LLLIIIL.getValue();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("total_duration", Long.valueOf(jCurrentTimeMillis2));
                        linkedHashMap2.put("error_code", strValueOf);
                        if (z2) {
                            str4 = "1";
                        } else {
                            str4 = CardStruct.IStatusCode.DEFAULT;
                        }
                        linkedHashMap2.put("is_success", str4);
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.put("template_parse_start", Long.valueOf(c1015550cXB2.LJJIFFI().LIZ));
                        linkedHashMap3.put("template_parse_end", Long.valueOf(c1015550cXB2.LJJIFFI().LIZIZ));
                        linkedHashMap3.put("render_start", Long.valueOf(c1015550cXB2.LJJIFFI().LIZJ));
                        linkedHashMap3.put("render_end", Long.valueOf(c1015550cXB2.LJJIFFI().LIZLLL));
                        linkedHashMap3.put("download_start", Long.valueOf(c1015550cXB2.LJJIFFI().LJ));
                        linkedHashMap3.put("download_end", Long.valueOf(c1015550cXB2.LJJIFFI().LJFF));
                        linkedHashMap3.put("template_parse_duration", Long.valueOf(c1015550cXB2.LJJIFFI().LIZIZ - c1015550cXB2.LJJIFFI().LIZ));
                        linkedHashMap3.put("render_duration", Long.valueOf(c1015550cXB2.LJJIFFI().LIZLLL - c1015550cXB2.LJJIFFI().LIZJ));
                        linkedHashMap3.put("template_render_duration", Long.valueOf(c1015550cXB2.LJJIFFI().LIZLLL - c1015550cXB2.LJJIFFI().LIZ));
                        linkedHashMap3.put("download_duration", Long.valueOf(c1015550cXB2.LJJIFFI().LJFF - c1015550cXB2.LJJIFFI().LJ));
                        linkedHashMap2.putAll(linkedHashMap3);
                        c1015450cX12.getClass();
                        C1015450cX1.LJIIJ("anole_component_render_result", str5, str6, anoleComponentModel3, c1009340cNA2, linkedHashMap2);
                        if (z2) {
                            c1015550cXB.LJJIII(C1014990cWH.LIZ);
                            C1015550cXB c1015550cXB4 = c1015550cXB;
                            T t = c1015660cXM.LIZJ.LLILZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("AnoleUgenPrerender onResult(), contentView = ");
                            sbLIZ5.append(t);
                            C2188811AlT.LIZIZ(sbLIZ5);
                            c1015550cXB4.LLJJIJIL = t;
                            InterfaceC1015680cXO interfaceC1015680cXO2 = interfaceC1015680cXO;
                            if (interfaceC1015680cXO2 != null) {
                                interfaceC1015680cXO2.LIZ(c1015550cXB.LLJJIJIL);
                                return;
                            }
                            return;
                        }
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("AnoleUgenPrerender onResult(), failed, errorMsg = ");
                        sbLIZ6.append(c1015660cXM.LIZIZ);
                        sbLIZ6.append(",errorCode = ");
                        sbLIZ6.append(c1015660cXM.LIZ);
                        C2188811AlT.LIZIZ(sbLIZ6);
                        c1015550cXB.LJJIII(C1014960cWE.LIZ);
                        c1015550cXB.LLJLIL = String.valueOf(c1015660cXM.LIZ);
                    }
                };
                c1049800dQQLJJI4.getClass();
                try {
                    c1049800dQQLJJI4.LJI = interfaceC1015670cXN;
                    float f3 = c1049800dQQLJJI4.LJIILJJIL;
                    if (f3 > 0.0f && c1049800dQQLJJI4.LJIILIIL == null) {
                        c1049800dQQLJJI4.LJIILIIL = new C1015690cXP(f3);
                    }
                    c19jhLIZIZ = c1049800dQQLJJI4.LIZIZ(ugenTemplateModel, jSONObject);
                    C1015690cXP c1015690cXP = c1049800dQQLJJI4.LJIILIIL;
                    if (c1015690cXP == null || c1015690cXP.LIZ.get() <= 0) {
                        C1015660cXM c1015660cXM = new C1015660cXM();
                        c1015660cXM.LIZ = 0;
                        c1015660cXM.LIZJ = c19jhLIZIZ;
                        interfaceC1015670cXN.LIZ(c1015660cXM);
                    }
                } catch (NoClassDefFoundError e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1015660cXM c1015660cXM2 = new C1015660cXM();
                    c1015660cXM2.LIZ = -2;
                    c1015660cXM2.LIZIZ = "yoga so no class found";
                    interfaceC1015670cXN.LIZ(c1015660cXM2);
                    c19jhLIZIZ = null;
                } catch (UnsatisfiedLinkError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1015660cXM c1015660cXM3 = new C1015660cXM();
                    c1015660cXM3.LIZ = -1;
                    c1015660cXM3.LIZIZ = "yoga so link fail";
                    interfaceC1015670cXN.LIZ(c1015660cXM3);
                    c19jhLIZIZ = null;
                }
                c1015550cXB.LLLIILIL = c19jhLIZIZ;
                return;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("AnoleUgenPrerender real render() return ,cause is rendering or success ,renderStatus = ");
            sbLIZ5.append(c1015550cXB.LLJLILLLLZIIL);
            C2188811AlT.LIZIZ(sbLIZ5);
            return;
        }
        c1015550cXB.LJJIII(C1014960cWE.LIZ);
        c1015550cXB.LLJLIL = "-10001";
    }
}
