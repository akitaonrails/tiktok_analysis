package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.01X1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01X1 implements C01X2 {
    public final /* synthetic */ C259800zU<JSONObject> LIZ;
    public final /* synthetic */ C259800zU<C1309260kAu> LIZIZ;

    public C01X1(C259800zU<JSONObject> c259800zU, C259800zU<C1309260kAu> c259800zU2) {
        this.LIZ = c259800zU;
        this.LIZIZ = c259800zU2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C01X2
    public final void LIZ(C1309260kAu c1309260kAu, JSONObject jSONObject) {
        this.LIZ.element = jSONObject;
        this.LIZIZ.element = c1309260kAu;
    }
}
