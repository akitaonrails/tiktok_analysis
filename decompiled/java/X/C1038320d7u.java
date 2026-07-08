package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038320d7u extends AbstractC1038330d7v {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1038340d7w interfaceC1038340d7w = (InterfaceC1038340d7w) xBaseParamModel;
        List<InterfaceC1038350d7x> listLJIILJJIL = C1697810uHb.LJIILJJIL(new InterfaceC1038350d7x() { // from class: X.0d7t
            @Override // X.InterfaceC1038350d7x
            public final void getName() {
            }

            @Override // X.InterfaceC1038350d7x
            public final Pair LIZ(AbstractC1549150qPp abstractC1549150qPp, InterfaceC1038340d7w interfaceC1038340d7w2) {
                SparkContext sparkContext;
                C1529880puk c1529880puk = SparkContext.Companion;
                InterfaceC634840OvC interfaceC634840OvC = abstractC1549150qPp.IBridgeSdkContext;
                String containerID = null;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                }
                c1529880puk.getClass();
                C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
                if (c1537480q70LIZIZ != null && (c1537480q70LIZIZ instanceof SparkContext) && (sparkContext = (SparkContext) c1537480q70LIZIZ) != null) {
                    InterfaceC1036370d4l interfaceC1036370d4l = (InterfaceC1036370d4l) sparkContext.LJFF(InterfaceC1036370d4l.class);
                    if (interfaceC1036370d4l == null) {
                        return new Pair(Boolean.FALSE, "failed to get external guide handler manager");
                    }
                    C1038280d7q c1038280d7qLIZJ = interfaceC1036370d4l.LIZJ(AdExternalGuideTriggerCondition.Type.FRONT_END, new C1038300d7s(interfaceC1038340d7w2.getType(), sparkContext));
                    if (c1038280d7qLIZJ == null) {
                        return new Pair(Boolean.FALSE, "failed to get external guide handler");
                    }
                    if (c1038280d7qLIZJ.LIZ()) {
                        return new Pair(Boolean.TRUE, "success");
                    }
                    return new Pair(Boolean.FALSE, "failed to handle external guide");
                }
                return new Pair(Boolean.FALSE, "failed to get spark context");
            }
        });
        final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIILJJIL, 10));
        for (InterfaceC1038350d7x interfaceC1038350d7x : listLJIILJJIL) {
            Pair pairLIZ = interfaceC1038350d7x.LIZ(this, interfaceC1038340d7w);
            interfaceC1038350d7x.getName();
            arrayList.add(new C443120HZe("AdExternalGuideHandler", pairLIZ.getFirst(), pairLIZ.getSecond()));
        }
        completionBlock.onSuccess(new XBaseResultModel(arrayList) { // from class: X.00vE
            public final List<C443120HZe<String, Boolean, String>> LIZ;

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final Map<String, Object> convert() {
                return null;
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final JSONObject toJSON() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                for (C443120HZe<String, Boolean, String> c443120HZe : this.LIZ) {
                    JSONObject jSONObject2 = new JSONObject();
                    String first = c443120HZe.getFirst();
                    boolean zBooleanValue = c443120HZe.getSecond().booleanValue();
                    String third = c443120HZe.getThird();
                    jSONObject2.put("success", zBooleanValue);
                    jSONObject2.put("reason", third);
                    jSONObject.put(first, jSONObject2);
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel
            public final List<String> provideResultList() {
                return C13BV.INSTANCE;
            }

            {
                this.LIZ = arrayList;
            }
        }, "");
    }
}
