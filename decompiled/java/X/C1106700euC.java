package X;

import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.livesdk.livesetting.clientai.AlgoPkgConfig;
import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerConfig;
import com.bytedance.android.livesdk.livesetting.gift.LiveDynamicPerformanceDegradationSetting;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0euC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106700euC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, long j, String str2, List list, final InterfaceC1631620sYq interfaceC1631620sYq, final Function1 function1) {
        long j2;
        Object feature$default;
        String string;
        Boolean boolValueOf = null;
        if (LiveDynamicPerformanceDegradationSetting.getValue() == 2) {
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_client_ai", 0, 2, null);
            if (producer$default != null && (feature$default = FeatureProducer.getFeature$default(producer$default, "dynamic_perf_stable_score", (JSONObject) null, "live_gift_video_downgrade", (ReturnCode) null, 10, (Object) null)) != null && (string = feature$default.toString()) != null && string.length() != 0) {
                try {
                    float f = CastFloatProtector.parseFloat(string);
                    if (f < 52.0f) {
                        C20441214yg.LIZIZ("GuideTriggerPitayaTask", "Degrade all points, roomId = " + j + ", score = " + f);
                        return;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } else if (LiveDynamicPerformanceDegradationSetting.getValue() == 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Degrade all points, roomId = ");
            sbLIZ.append(j);
            C20441214yg.LIZIZ("GuideTriggerPitayaTask", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("submit guide trigger task, algoPkgName = ");
        sbLIZ2.append(str);
        sbLIZ2.append(", roomId = ");
        sbLIZ2.append(j);
        sbLIZ2.append(", triggerType = ");
        sbLIZ2.append(str2);
        sbLIZ2.append(", bizNames = ");
        sbLIZ2.append(list);
        C20441214yg.LIZIZ("GuideTriggerPitayaTask", C2188811AlT.LIZIZ(sbLIZ2));
        AlgoPkgConfig algoPkgConfig = LiveClientTriggerConfig.INSTANCE.getAlgoPkgConfig(str);
        InterfaceC964460bCm interfaceC964460bCmLJIIL = LivePitayaEnv.LJIIL();
        if (algoPkgConfig != null) {
            boolValueOf = Boolean.valueOf(algoPkgConfig.forceDownload);
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("room_id", Long.valueOf(j));
            jSONObject.putOpt("trigger_type", str2);
            jSONObject.putOpt("biz_names", new JSONArray((Collection) list));
            C189200o6.m2constructorimpl(jSONObject.putOpt("business", new JSONArray((Collection) list)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1132380fZc c1132380fZc = new C1132380fZc(zLJJJI, jSONObject);
        InterfaceC2179811ASt interfaceC2179811ASt = new InterfaceC2179811ASt() { // from class: X.0eln
            /* JADX WARN: Multi-variable type inference failed */
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
            @Override // X.InterfaceC2179811ASt
            public final void LIZ(C21406118pv c21406118pv) {
                Object c098200Yq;
                List list2;
                boolean z = false;
                if (!c21406118pv.LIZ()) {
                    Function1<Boolean, Unit> function12 = function1;
                    int i = c21406118pv.LIZ;
                    if (i == -3 || i == -4) {
                        z = true;
                    }
                    function12.invoke(Boolean.valueOf(z));
                    return;
                }
                InterfaceC1631620sYq<Long, List<String>, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                Function1<Boolean, Unit> function13 = function1;
                try {
                    JSONObject jSONObject2 = c21406118pv.LIZIZ;
                    if (jSONObject2 == null) {
                        return;
                    }
                    int iOptInt = jSONObject2.optInt("code", -1);
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = new JSONObject();
                    }
                    long jOptLong = jSONObjectOptJSONObject.optLong("next_execution_delay", jSONObjectOptJSONObject.optLong("nextDelay", 60L));
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("features");
                    if (jSONObjectOptJSONObject2 == null) {
                        jSONObjectOptJSONObject2 = new JSONObject();
                    }
                    String strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject2);
                    int iOptInt2 = jSONObjectOptJSONObject.optInt("version", 1);
                    int iOptInt3 = jSONObjectOptJSONObject.optInt("result_type", 0);
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("biz_name");
                    if (jSONArrayOptJSONArray == null || (list2 = JsonExtKt.toList(jSONArrayOptJSONArray)) == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    if (iOptInt == 0 && iOptInt3 > 0 && 1 >= iOptInt2) {
                        interfaceC1631620sYq2.invoke(Long.valueOf(jOptLong), list2, strJ3);
                    } else {
                        function13.invoke(Boolean.FALSE);
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Function1<Boolean, Unit> function14 = function1;
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    function14.invoke(Boolean.FALSE);
                }
            }
        };
        if (algoPkgConfig != null) {
            j2 = algoPkgConfig.execTimeout;
        } else {
            j2 = 1000;
        }
        ((C1ATJ) interfaceC964460bCmLJIIL).LIZJ(new C1ATK(str, c1132380fZc, interfaceC2179811ASt, new C1ATM(j2, true, 3), 8));
    }
}
