package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520700pfw {
    public final Map<String, InterfaceC1520720pfy> LIZ = C2097608Jq.LJIIIIZZ(new Pair("jsbError", new InterfaceC1520720pfy() { // from class: X.0pft
        @Override // X.InterfaceC1520720pfy
        public final boolean LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
            return C1520640pfq.LJ(C1520640pfq.LJII("nativeInfo", jSONObject2), C1520640pfq.LJII("nativeInfo", jSONObject), "bridge_name", "error_code", "error_message");
        }
    }), new Pair("fetchError", new InterfaceC1520720pfy() { // from class: X.0pfr
        @Override // X.InterfaceC1520720pfy
        public final boolean LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
            return C1520640pfq.LJ(C1520640pfq.LJII("nativeInfo", jSONObject2), C1520640pfq.LJII("nativeInfo", jSONObject), "url", "method", "status_code", "request_error_code", "request_error_msg", "error_no", "error_msg");
        }
    }), new Pair("nativeError", new InterfaceC1520720pfy() { // from class: X.0pfv
        @Override // X.InterfaceC1520720pfy
        public final boolean LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
            return C1520640pfq.LJ(C1520640pfq.LJII("nativeInfo", jSONObject2), C1520640pfq.LJII("nativeInfo", jSONObject), Scene.SCENE_SERVICE, "error_code", "error_msg", "http_status");
        }
    }), new Pair("jsbPerf", new InterfaceC1520720pfy() { // from class: X.0pfu
        @Override // X.InterfaceC1520720pfy
        public final boolean LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
            return C1520640pfq.LJ(C1520640pfq.LJII("nativeInfo", jSONObject2), C1520640pfq.LJII("nativeInfo", jSONObject), "bridge_name", "status_code", "status_description");
        }
    }), new Pair("custom", new InterfaceC1520720pfy() { // from class: X.0pfx
        @Override // X.InterfaceC1520720pfy
        public final boolean LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
            if (jSONObject != null) {
                return C786410Ut5.J3(jSONObject2).equals(C786410Ut5.J3(jSONObject));
            }
            return false;
        }
    }));
    public JSONObject LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public String LJ;
    public InterfaceC1520860pgC LJFF;

    public final void LIZ() {
        int i = this.LIZJ;
        if (i > 0) {
            C1520640pfq.LJIIJJI(i, "native_repeat_count", this.LIZIZ);
            C1520700pfw c1520700pfw = C1520730pfz.LIZ;
            C1520730pfz.LIZLLL(this.LJFF, this.LIZIZ, this.LIZLLL, this.LJ, null);
            this.LIZJ = 0;
        }
    }
}
