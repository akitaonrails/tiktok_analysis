package X;

import com.bytedance.scene.Scene;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0phA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521460phA extends AbstractC1520150pf3 {
    public String LJI;
    public int LJII;
    public String LJIIIIZZ;

    public C1521460phA() {
        super("nativeError");
        this.LJI = "lynx_error";
    }

    @Override // X.AbstractC1520070pev
    public final void LIZ(JSONObject jSONObject) {
        C12868051u.LJI(jSONObject, Scene.SCENE_SERVICE, this.LJI);
        C12868051u.LJI(jSONObject, "error_code", Integer.valueOf(this.LJII));
        C12868051u.LJI(jSONObject, "error_msg", this.LJIIIIZZ);
    }
}
