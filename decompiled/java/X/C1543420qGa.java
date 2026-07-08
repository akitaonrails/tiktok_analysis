package X;

import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543420qGa implements InterfaceC1543220qGG {
    public InterfaceC634840OvC LIZ;
    public final C1543450qGd LIZIZ = new C1543450qGd();
    public C1543540qGm LIZJ;
    public boolean LIZLLL;

    public static JSONObject LIZJ(Object obj) {
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (obj instanceof ReadableMap) {
            ReadableMap map = ((ReadableMap) obj).getMap("data");
            if (map != null) {
                if (map instanceof JavaOnlyMap) {
                    C1297550js1.LIZ.getClass();
                    return C1297550js1.LJ((JavaOnlyMap) map);
                }
                return new JSONObject();
            }
            return new JSONObject();
        }
        return new JSONObject();
    }

    public final void LIZIZ(InterfaceC634840OvC interfaceC634840OvC) {
        this.LIZ = interfaceC634840OvC;
        C1543450qGd c1543450qGd = this.LIZIZ;
        c1543450qGd.LIZ = interfaceC634840OvC;
        ((C1543500qGi) c1543450qGd.LIZJ.getValue()).LIZIZ = interfaceC634840OvC;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x022d A[PHI: r0
      0x022d: PHI (r0v43 com.lynx.react.bridge.ReadableMap) = (r0v42 com.lynx.react.bridge.ReadableMap), (r0v44 com.lynx.react.bridge.ReadableMap) binds: [B:101:0x0220, B:103:0x0223] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1543220qGG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1543190qGD r17, final X.C1543910qHN r18, final X.C1543250qGJ r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1543420qGa.LIZ(X.0qGD, X.0qHN, X.0qGJ):void");
    }
}
