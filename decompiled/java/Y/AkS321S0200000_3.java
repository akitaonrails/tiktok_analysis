package Y;

import X.C118300cf;
import X.C259800zU;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public class AkS321S0200000_3 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    public static final Object apply$0(AkS321S0200000_3 akS321S0200000_3, Object obj) {
        ArrayList arrayList = new ArrayList();
        C118300cf c118300cf = (C118300cf) akS321S0200000_3.l0;
        C259800zU c259800zU = (C259800zU) akS321S0200000_3.l1;
        for (Object obj2 : (Object[]) obj) {
            if (obj2 instanceof BaseNetResponse) {
                BaseNetResponse baseNetResponse = (BaseNetResponse) obj2;
                if (baseNetResponse.status_code == 0) {
                    arrayList.add(obj2);
                } else {
                    c118300cf.element++;
                    String str = baseNetResponse.message;
                    if (str != null && str.length() > 0) {
                        c259800zU.element = baseNetResponse.message;
                    }
                }
            }
        }
        return arrayList;
    }

    public static final Object apply$1(AkS321S0200000_3 akS321S0200000_3, Object obj) {
        ((CopyOnWriteArraySet) ((NoticeVideoManager.InnerManager) akS321S0200000_3.l0).LLIZLLLIL.getValue()).removeAll((List) akS321S0200000_3.l1);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AkS321S0200000_3(Object obj, NoticeVideoManager.InnerManager innerManager, List<String> list) {
        this.$t = list;
        this.l0 = obj;
        this.l1 = innerManager;
    }
}
