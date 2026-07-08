package X;

import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C648850Pch {
    public static final /* synthetic */ int LIZIZ = 0;
    public final InterfaceC1541990qEH LIZ;

    public C648850Pch(InterfaceC1541990qEH interfaceC1541990qEH) {
        this.LIZ = interfaceC1541990qEH;
    }

    public void LIZIZ(TemplateData templateData) {
        ((LynxView) this.LIZ).updateData(templateData);
    }

    public void LIZJ(DynamicPatch dynamicPatch) {
        ((LynxView) this.LIZ).updateData(dynamicPatch.getRawData());
    }

    public void LIZLLL(String str) {
        ((LynxView) this.LIZ).updateData(str);
    }

    public void LIZ(String str, JSONObject jSONObject) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            javaOnlyMap2.put(next, jSONObject.opt(next));
        }
        javaOnlyMap.put("data", javaOnlyMap2);
        this.LIZ.X0(str, Collections.singletonList(javaOnlyMap));
    }
}
