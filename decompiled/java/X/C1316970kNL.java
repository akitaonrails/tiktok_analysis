package X;

import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kNL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316970kNL {
    public final WeakReference<AbstractC1317090kNX> LIZ;
    public boolean LJFF;
    public String LIZIZ = "";
    public EnumC1317010kNP LIZJ = EnumC1317010kNP.STOP;
    public final Map<String, JSONObject> LIZLLL = new LinkedHashMap();
    public final Map<String, Long> LJ = new LinkedHashMap();
    public final Map<String, Integer> LJI = new LinkedHashMap();

    public C1316970kNL(WeakReference<AbstractC1317090kNX> weakReference) {
        this.LIZ = weakReference;
    }

    public static int LIZ(AbstractC1317090kNX abstractC1317090kNX, int i) {
        SDUIBaseUI sDUIBaseUILIZ = abstractC1317090kNX.LIZ(i);
        if (!Intrinsics.LJFF(sDUIBaseUILIZ.LJIJ(), "stop-icon") && !Intrinsics.LJFF(sDUIBaseUILIZ.LJIJ(), "loading-icon") && !Intrinsics.LJFF(sDUIBaseUILIZ.LJIJ(), "playing-icon")) {
            Iterator<SDUIBaseUI> it2 = sDUIBaseUILIZ.LJIILL().iterator();
            while (it2.hasNext()) {
                int iLIZ = LIZ(abstractC1317090kNX, it2.next().LLJJ);
                if (iLIZ != -1) {
                    return iLIZ;
                }
            }
            return -1;
        }
        return sDUIBaseUILIZ.LLJJ;
    }

    public final void LIZIZ(String str, JSONObject jSONObject) throws JSONException {
        C1317210kNj c1317210kNj;
        C1317210kNj c1317210kNj2;
        if (jSONObject != null) {
            AbstractC1317090kNX abstractC1317090kNX = this.LIZ.get();
            if (abstractC1317090kNX != null && (c1317210kNj2 = abstractC1317090kNX.LLJILLL) != null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("eventName", str);
                jSONObject3.put("params", jSONObject);
                jSONObject2.put("data", jSONObject3);
                c1317210kNj2.LIZ(-1L, "sendLogV3", C786410Ut5.J3(jSONObject2));
            }
            AbstractC1317090kNX abstractC1317090kNX2 = this.LIZ.get();
            if (abstractC1317090kNX2 != null && (c1317210kNj = abstractC1317090kNX2.LLJILLL) != null) {
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("eventName", Intrinsics.LJIIJJI(str, "sdui_"));
                jSONObject5.put("params", jSONObject);
                jSONObject4.put("data", jSONObject5);
                c1317210kNj.LIZ(-1L, "sendLogV3", C786410Ut5.J3(jSONObject4));
            }
        }
    }

    public final void LIZJ(int i, EnumC1317010kNP enumC1317010kNP) {
        Object c098200Yq;
        SDUIBaseUI sDUIBaseUILIZ;
        C1313470kHh c1313470kHhLIZIZ;
        SDUIBaseUI sDUIBaseUILIZ2;
        try {
            this.LIZJ = enumC1317010kNP;
            String str = "{}";
            int i2 = C1317020kNQ.LIZ[enumC1317010kNP.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        str = "{\"mode\":\"aspectFit\",\"skip-redirection\":true,\"idSelector\":\"playing-icon\",\"src\":\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwBAMAAAClLOS0AAAAJFBMVEUAAAASEhL7+/sjIyMGBgYGBgYHBwf+/v79/f36+voGBgb///8VWQz8AAAAC3RSTlMACMMGHRYT4MGTDVPjOfAAAACLSURBVDjLYxiKoHr37t0TQAxOIGM7ksRuIGgAMThALIQ4M6qEAVyCEcRVBLGMQCwBVAllkiUUKdKBKSFEsasIGyVEsj+EyPEH/Y0iHFZUNIoOgUi5c0EZZyKIJQnKOEgSKS4uLskglhmQ4YaQYF4aGhq2GMSySg0NjTJAZClDQUFBMJcZyBBmoBcAAF2Y2yGNzlrUAAAAAElFTkSuQmCC\"}";
                    }
                } else {
                    str = "{\"src\":\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAMAAABg3Am1AAAAe1BMVEUAAAAgICAGBgYKCgoSEhL+/v4ICAgODg4ICAj////h4eH09PT////////+/v7u7u709PT+/v7Nzc2QkJD39/f////09PT///+qqqp2dnb29vb8/Pzw8PDn5+f+/v7t7e3+/v79/f3k5OTv7+9iYmLa2tr6+vrJycn///8TmSMYAAAAKHRSTlMABRoNCuIWEBKAfxHAIKGbhnBkOcWQdVAwI8exqo5AI/HRj1YqcGJSNfhgEAAAAY1JREFUSMftVMl2gzAMrGVjG4dA2BICIfvC/39hgzDpw0vCqYe+zo3RjCxhWV//+DUsN2kYppvlPPW+DDqNIP7sWUbdBJ8saWchfCNfRJ0DzcKrP42aenduk3r8OvkcjW5VXQGR33T7kVsfDtHkClxKIYTkAO3Apc7/g6FjBpIygmCUQ3ZE+uAwxBjJuGBkpAgTkPmKOmCg5VTLtYXyBAN79wEB6qeOLXZeWgakb4KYPBEKU7krqphdK9s62770ZKELMooq+tjFoNd4BXiACbbrY2syTbPqydVIOmPzDWt9gk3GbkP/Y4PKMAxNI2mBVkptqWGouh7uOSYSQBIzS+CZSnRQykwDS/A+fU+F2Myj0yMzE0QU6NjMdrCh7aPh2DeRJweRyl4ri9L9FhCM13oJ3JdangZGCvOpvNZMVIZh/FpSd1/f8tp0DhTUZ2ASWluvOCVvHPluKq9zEOTdbfCn5WfdJw/gWu8/hAPkmTqfVZbDU27VY1sE54DgEpfaJ+COpIL2E+qQ+11ffxff17dBGRYQAQ4AAAAASUVORK5CYII=\",\"animation\":[[\"loading\",1000,0,0,0,0,0,0,0,1000000000,0,0,1]],\"mode\":\"aspectFit\",\"skip-redirection\":true,\"idSelector\":\"loading-icon\"}";
                }
            } else {
                str = "{\"idSelector\":\"stop-icon\",\"src\":\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAMAAABg3Am1AAAAaVBMVEUAAAAVFRUjIyMFBQUHBwcMDAwNDQ3///////8MDAz19fW/v7/9/f37+/v///////+VlZVjY2P+/v7m5ub////19fXy8vLr6+uqqqr////////+/v7////////f39/X19f///+AgID///9sTu7EAAAAInRSTlMACQcaFhIPIN8Mx1bx459gNyrBjn8QqJxIMO+wr4+AckAiT5sZPAAAAN1JREFUSMftk0kOgzAQBPEWCJiEPZA9/v8jIwRSH6fnGCl9dnnKbTv7J1sW1fK8S6nIFcAtrTnxSNpSnMn1dgdoL5OQR66aAC95AtLlJIAMIwvASwngUmQAXlJLgpc4AV4ygFwHFoDXmwXgNSqBdCdbQkblhGSVwGR0wPRRAXXlDgql2DsfLF9r2bhwtPLFwcZDRwRi37pg2OcNGxmAjeF/XN96bC8DZYPDEkB8wYb50xfYMBPKygXYiEB8bjYy0O02qF4Amnq1QTdS7MHNs/N4CDIRPLrhCGNs9nP5Av96Wz3LYlSMAAAAAElFTkSuQmCC\",\"mode\":\"aspectFit\",\"skip-redirection\":true}";
            }
            AbstractC1317090kNX abstractC1317090kNX = this.LIZ.get();
            c098200Yq = null;
            if (abstractC1317090kNX != null && (sDUIBaseUILIZ2 = abstractC1317090kNX.LIZ(i)) != null) {
                sDUIBaseUILIZ2.LJJLJ(null);
            }
            AbstractC1317090kNX abstractC1317090kNX2 = this.LIZ.get();
            if (abstractC1317090kNX2 != null && (c1313470kHhLIZIZ = abstractC1317090kNX2.LIZIZ()) != null) {
                C1298130jsx c1298130jsx = C1298130jsx.LIZ;
                JSONObject jSONObject = new JSONObject(str);
                c1298130jsx.getClass();
                c1313470kHhLIZIZ.LJIILL(i, new C1291290jhv(C1298130jsx.LIZIZ(jSONObject)), null);
            }
            AbstractC1317090kNX abstractC1317090kNX3 = this.LIZ.get();
            if (abstractC1317090kNX3 != null && (sDUIBaseUILIZ = abstractC1317090kNX3.LIZ(i)) != null) {
                sDUIBaseUILIZ.LJJLI();
                c098200Yq = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
