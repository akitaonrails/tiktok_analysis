package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Vy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2384409Vy extends C09VZ {
    public final JSONObject LIZJ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objValueOf = jSONObject.get(next);
            if (objValueOf instanceof JSONObject) {
                jSONObject2.put(next, LIZJ((JSONObject) objValueOf));
            } else {
                if (!(objValueOf instanceof Double)) {
                    if (objValueOf instanceof Float) {
                        if (objValueOf instanceof Float) {
                            Number number = (Number) objValueOf;
                            if (Float.compare(number.floatValue(), (long) number.floatValue()) == 0) {
                                objValueOf = Long.valueOf((long) number.floatValue());
                            }
                        }
                    } else {
                        jSONObject2.put(next, objValueOf);
                    }
                } else {
                    Number number2 = (Number) objValueOf;
                    if (Double.compare(number2.doubleValue(), (long) number2.doubleValue()) == 0) {
                        objValueOf = Long.valueOf((long) number2.doubleValue());
                    }
                }
                jSONObject2.put(next, objValueOf);
            }
        }
        return jSONObject2;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws JSONException {
        Context context;
        String str = "";
        C1058910df7 c1058910df7 = new C1058910df7();
        c1058910df7.LIZLLL = LIZJ(xBaseParamModel.toJSON());
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        new C1066040dqc(new WeakReference(context)).call(c1058910df7, new JSONObject());
        try {
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC2382009Va.class, null), "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message != null) {
                str = message;
            }
            C2382909Vj.LIZ(completionBlock, 0, str, null, 4);
        }
    }
}
