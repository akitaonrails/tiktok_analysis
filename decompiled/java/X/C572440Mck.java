package X;

import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment.CanvasStyle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Mck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572440Mck {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(int i, int i2) throws JSONException {
        CanvasStyle canvasStyle = new CanvasStyle(8);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("iType", canvasStyle.type);
        jSONObject.put("workShowType", i);
        jSONObject.put("maskType", i2);
        return C786410Ut5.J3(jSONObject);
    }
}
