package X;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19J0, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C19J0 {
    public final JSONObject LIZ;
    public final C19JH LIZIZ;
    public String LIZJ;

    public abstract void LIZ(Canvas canvas);

    public abstract void LIZIZ(int i, int i2);

    public abstract void LIZJ();

    public abstract List<PropertyValuesHolder> LIZLLL();

    public C19J0(C19JH c19jh, JSONObject jSONObject) {
        this.LIZ = jSONObject;
        this.LIZIZ = c19jh;
        this.LIZJ = jSONObject.optString("type");
        LIZJ();
    }
}
