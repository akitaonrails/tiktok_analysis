package X;

import com.bytedance.retrofit2.ParameterHandler;
import com.bytedance.retrofit2.RequestFactory;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.09UH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09UH {
    public static String LIZ(C0X9S<?> c0x9s) {
        if (!(c0x9s instanceof SsHttpCall)) {
            return "call isn't SsHttpCall";
        }
        JSONArray jSONArray = new JSONArray();
        try {
            Field declaredField = SsHttpCall.class.getDeclaredField("requestFactory");
            declaredField.setAccessible(true);
            RequestFactory requestFactory = (RequestFactory) declaredField.get(c0x9s);
            Field declaredField2 = RequestFactory.class.getDeclaredField("parameterHandlers");
            declaredField2.setAccessible(true);
            for (ParameterHandler parameterHandler : (ParameterHandler[]) declaredField2.get(requestFactory)) {
                if (parameterHandler instanceof ParameterHandler.Field) {
                    Field declaredField3 = ParameterHandler.Field.class.getDeclaredField("valueConverter");
                    declaredField3.setAccessible(true);
                    Object obj = declaredField3.get(parameterHandler);
                    if (obj != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("class:");
                        sbLIZ.append(obj.getClass());
                        sbLIZ.append("; value:");
                        sbLIZ.append(obj);
                        jSONArray.put(C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        jSONArray.put("converter is null");
                    }
                }
            }
            Field declaredField4 = SsHttpCall.class.getDeclaredField("args");
            declaredField4.setAccessible(true);
            Object[] objArr = (Object[]) declaredField4.get(c0x9s);
            if (objArr != null) {
                for (Object obj2 : objArr) {
                    if (obj2 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("arg value: ");
                        sbLIZ2.append(obj2);
                        jSONArray.put(C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        jSONArray.put("arg is null");
                    }
                }
            }
            return jSONArray.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return e.toString();
        }
    }
}
