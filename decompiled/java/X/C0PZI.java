package X;

import android.view.View;
import android.view.ViewGroup;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.lynx.core.model.DynamicData;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PZI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public interface C0PZI {
    void LIZ(int i, ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup);

    View LIZIZ();

    void LIZJ(String str);

    void LIZLLL(TemplateData templateData);

    @InterfaceC1294060jmO
    void LJ(List<DynamicData> list);

    void LJFF(DynamicPatch dynamicPatch, Map<String, ? extends Object> map, boolean z, boolean z2, boolean z3, LynxViewClient lynxViewClient);

    void sendEvent(String str, JSONObject jSONObject);
}
