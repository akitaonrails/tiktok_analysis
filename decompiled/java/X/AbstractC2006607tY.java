package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07tY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2006607tY implements InterfaceC1911280zpu {
    public Map<String, ? extends Object> LL;
    public Object LLILLJJLI;
    public JSONObject LLILLL;
    public View LLILZ;
    public String LLILZIL;

    public abstract String LIZ();

    public abstract void LIZIZ(View view, JSONObject jSONObject, Map<String, ? extends Object> map, Object obj);

    public abstract boolean LIZJ();

    @Override // X.InterfaceC1911280zpu
    public void LLJJLIIIJLLLLLLLZ(View view) {
    }

    @Override // X.InterfaceC658750Psf
    public final void Ck(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            jSONObject.put("is_cache_sensible", "1");
        }
        this.LLILLL = jSONObject;
        View view = this.LLILZ;
        if (view != null) {
            Oc(view);
        }
    }

    @Override // X.InterfaceC1911280zpu
    public void Mh(View view) {
        this.LLILZ = view;
    }

    @Override // X.InterfaceC1911280zpu
    public final void Oc(View view) {
        if (!LIZJ() || !view.isAttachedToWindow() || !view.isShown() || this.LLILLL == null) {
            return;
        }
        String strLIZ = LIZ();
        if (Intrinsics.LJFF(strLIZ, this.LLILZIL)) {
            return;
        }
        LIZIZ(view, this.LLILLL, this.LL, this.LLILLJJLI);
        this.LLILZIL = strLIZ;
    }

    @Override // X.InterfaceC658750Psf
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            jSONObject.put("is_cache_sensible", CardStruct.IStatusCode.DEFAULT);
        }
        this.LLILLL = jSONObject;
        View view = this.LLILZ;
        if (view != null) {
            Oc(view);
        }
    }

    @Override // X.InterfaceC1911280zpu
    public final void qf(View view, Map<String, ? extends Object> map, Object obj) {
        this.LLILLL = null;
        this.LL = map;
        this.LLILLJJLI = obj;
    }
}
