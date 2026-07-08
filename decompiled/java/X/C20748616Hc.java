package X;

import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.16Hc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20748616Hc implements C0XTR {
    public final int $t;
    public Object l0;

    @Override // X.C0XTR
    public final void onResult(int i, int i2, Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                break;
            case 1:
                onResult$1(this, i, i2, obj);
                break;
            case 2:
                onResult$2(this, i, i2, obj);
                break;
            case 3:
                onResult$3(this, i, i2, obj);
                break;
            case 4:
                onResult$4(this, i, i2, obj);
                break;
            case 5:
                onResult$5(this, i, i2, obj);
                break;
            case 6:
                onResult$6(this, i, i2, obj);
                break;
        }
    }

    public C20748616Hc(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(C20748616Hc c20748616Hc, int i, int i2, Object obj) throws JSONException {
        if (i2 == 1) {
            InterfaceC1019840ce6 interfaceC1019840ce6 = (InterfaceC1019840ce6) c20748616Hc.l0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("statusCode", 0);
            interfaceC1019840ce6.onSuccess(jSONObject);
            return;
        }
        ((InterfaceC1019840ce6) c20748616Hc.l0).LIZ(0, "verify failed");
    }

    public static final void onResult$1(C20748616Hc c20748616Hc, int i, int i2, Object obj) throws JSONException {
        if (i2 == 1) {
            InterfaceC1019840ce6 interfaceC1019840ce6 = (InterfaceC1019840ce6) c20748616Hc.l0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("statusCode", 0);
            interfaceC1019840ce6.onSuccess(jSONObject);
            return;
        }
        ((InterfaceC1019840ce6) c20748616Hc.l0).LIZ(0, "verify failed");
    }

    public static final void onResult$2(C20748616Hc c20748616Hc, int i, int i2, Object obj) throws JSONException {
        if (i2 == 1) {
            InterfaceC1019840ce6 interfaceC1019840ce6 = (InterfaceC1019840ce6) c20748616Hc.l0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("statusCode", 0);
            interfaceC1019840ce6.onSuccess(jSONObject);
            return;
        }
        ((InterfaceC1019840ce6) c20748616Hc.l0).LIZ(0, "verify failed");
    }

    public static final void onResult$3(C20748616Hc c20748616Hc, int i, int i2, Object obj) throws JSONException {
        if (i2 == 1) {
            InterfaceC1019840ce6 interfaceC1019840ce6 = (InterfaceC1019840ce6) c20748616Hc.l0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("statusCode", 0);
            interfaceC1019840ce6.onSuccess(jSONObject);
            return;
        }
        ((InterfaceC1019840ce6) c20748616Hc.l0).LIZ(0, "verify failed");
    }

    public static final void onResult$4(C20748616Hc c20748616Hc, int i, int i2, Object obj) {
        InterfaceC20311214di interfaceC20311214di = (InterfaceC20311214di) c20748616Hc.l0;
        if (interfaceC20311214di != null) {
            interfaceC20311214di.LIZ();
        }
    }

    public static final void onResult$5(C20748616Hc c20748616Hc, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            ((Function0) c20748616Hc.l0).invoke();
        }
    }

    public static final void onResult$6(C20748616Hc c20748616Hc, int i, int i2, Object obj) {
        InterfaceC207239167p interfaceC207239167p = (InterfaceC207239167p) c20748616Hc.l0;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    interfaceC207239167p.onFailed();
                    return;
                }
                return;
            }
            interfaceC207239167p.onCancel();
            return;
        }
        interfaceC207239167p.onSuccess();
    }
}
