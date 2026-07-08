package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.00Us, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C088000Us extends C09AY implements Function2<List<Object>, Object, List<Object>> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C088000Us(int i) {
        super(2);
        this.LL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<Object> invoke(List<Object> list, Object obj) {
        List<Object> list2 = list;
        if (list2 != null) {
            int i = this.LL;
            ArrayList arrayList = new ArrayList(list2);
            if (obj != null) {
                ListProtector.set(arrayList, i, obj);
            }
            return C13LP.LLIIII(arrayList);
        }
        return null;
    }
}
