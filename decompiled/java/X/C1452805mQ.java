package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05mQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C1452805mQ extends C2217421BqW implements InterfaceC1631620sYq<C1307670k8L, List<? extends Object>, InterfaceC1364105Vn<? super Object>, Object>, InterfaceC842703Qz {
    public C1452805mQ(C1453405mW c1453405mW) {
        super(3, c1453405mW, C1453405mW.class, "len", "len(Lcom/bytedance/android/starship/engine/quark/EvalContext;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1307670k8L c1307670k8L, List<? extends Object> list, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        int length;
        this.receiver.getClass();
        Object obj = ListProtector.get(list, 0);
        if (obj instanceof List) {
            length = ((List) obj).size();
        } else if (obj instanceof Map) {
            length = ((Map) obj).size();
        } else if (obj instanceof JSONObject) {
            length = ((JSONObject) obj).length();
        } else if (obj instanceof JSONArray) {
            length = ((JSONArray) obj).length();
        } else if (obj instanceof String) {
            length = ((String) obj).length();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("len is not supported for ");
            sbLIZ.append(obj);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return C2286608xc.LJ(length);
    }
}
