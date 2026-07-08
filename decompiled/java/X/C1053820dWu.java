package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dWu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1053820dWu extends C09AY implements Function0<InterfaceC1022880cj0<C1074600e4Q<CommonAdData, JSONObject, String, String>>> {
    public C1053820dWu() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0dWw] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1022880cj0<C1074600e4Q<CommonAdData, JSONObject, String, String>> invoke() {
        return new C1053830dWv(new InterfaceC1022880cj0() { // from class: X.0dWz
            @Override // X.InterfaceC1022880cj0
            public final boolean LIZ(C1074600e4Q c1074600e4Q) {
                return false;
            }
        }).LIZIZ(new InterfaceC1022880cj0<C1074600e4Q<CommonAdData, JSONObject, String, String>>() { // from class: X.0dWw
            @Override // X.InterfaceC1022880cj0
            public final boolean LIZ(C1074600e4Q c1074600e4Q) {
                C c = c1074600e4Q.LIZJ;
                for (AbstractC1053850dWx abstractC1053850dWx : (List) C1053880dX0.LIZ.getValue()) {
                    if (abstractC1053850dWx.LIZIZ.contains(c)) {
                        return abstractC1053850dWx.LIZ((InterfaceC1053960dX8) C1053880dX0.LIZIZ.getValue());
                    }
                }
                return false;
            }
        });
    }
}
