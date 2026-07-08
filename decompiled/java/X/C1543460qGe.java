package X;

import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.lynx.tasm.LynxView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543460qGe extends AbstractC1543580qGq {
    public final C1543190qGD LIZIZ;

    @Override // X.AbstractC1543580qGq
    public final void LJIIIIZZ() {
    }

    public C1543460qGe(C1543190qGD c1543190qGD) {
        super(c1543190qGD);
        this.LIZIZ = c1543190qGD;
    }

    @Override // X.AbstractC1543580qGq
    public final void LJIIIZ(Object obj, String str) throws JSONException {
        if (obj instanceof JavaOnlyArray) {
            this.LIZIZ.LIZLLL.LJI(obj, str);
            JavaOnlyArray javaOnlyArray = (JavaOnlyArray) obj;
            LynxView lynxView = this.LIZIZ.LJFF;
            if (lynxView != null) {
                lynxView.sendGlobalEvent(str, javaOnlyArray);
            }
            this.LIZIZ.LIZLLL.LJFF(obj, str);
            return;
        }
        if (obj != null && !(obj instanceof JSONObject)) {
            return;
        }
        JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
        C1297550js1 c1297550js1 = C1297550js1.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", obj);
        jSONObject.put("containerID", this.LIZIZ.LJIIIZ);
        jSONObject.put("protocolVersion", "1.0");
        jSONObject.put("code", 1);
        c1297550js1.getClass();
        javaOnlyArray2.pushMap(C1297550js1.LIZIZ(jSONObject));
        this.LIZIZ.LIZLLL.LJI(javaOnlyArray2, str);
        LynxView lynxView2 = this.LIZIZ.LJFF;
        if (lynxView2 != null) {
            lynxView2.sendGlobalEvent(str, javaOnlyArray2);
        }
        this.LIZIZ.LIZLLL.LJFF(javaOnlyArray2, str);
    }

    @Override // X.AbstractC1543580qGq
    public final void LJIIJ(Object obj, String str) throws JSONException {
        if (obj instanceof JavaOnlyArray) {
            this.LIZIZ.LIZLLL.LJI(obj, str);
            JavaOnlyArray javaOnlyArray = (JavaOnlyArray) obj;
            LynxBackgroundRuntime lynxBackgroundRuntime = this.LIZIZ.LJI;
            if (lynxBackgroundRuntime != null) {
                lynxBackgroundRuntime.LJ(str, javaOnlyArray);
            }
            this.LIZIZ.LIZLLL.LJFF(obj, str);
            return;
        }
        if (obj != null && !(obj instanceof JSONObject)) {
            return;
        }
        JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
        C1297550js1 c1297550js1 = C1297550js1.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", obj);
        jSONObject.put("containerID", this.LIZIZ.LJIIIZ);
        jSONObject.put("protocolVersion", "1.0");
        jSONObject.put("code", 1);
        c1297550js1.getClass();
        javaOnlyArray2.pushMap(C1297550js1.LIZIZ(jSONObject));
        this.LIZIZ.LIZLLL.LJI(javaOnlyArray2, str);
        LynxBackgroundRuntime lynxBackgroundRuntime2 = this.LIZIZ.LJI;
        if (lynxBackgroundRuntime2 != null) {
            lynxBackgroundRuntime2.LJ(str, javaOnlyArray2);
        }
        this.LIZIZ.LIZLLL.LJFF(javaOnlyArray2, str);
    }
}
