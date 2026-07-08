package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jcN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287850jcN extends C09AY implements Function0<Object> {
    public final /* synthetic */ List<PageInfo> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1287850jcN(List<PageInfo> list) {
        super(0);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sb = new StringBuilder();
        Iterator<PageInfo> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            PageInfo next = it2.next();
            sb.append("\n");
            sb.append(next != null ? next.toString() : null);
        }
        return sb;
    }
}
