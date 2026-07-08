package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07oq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1977407oq extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Object LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1977407oq(Object obj) {
        super(0);
        this.LL = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int iIntValue = ((Number) C2041907zF.LIZIZ.getValue()).intValue();
        if (iIntValue == 1) {
            HashMap<WeakReference<Object>, Runnable> map = C2041907zF.LIZLLL;
            Object obj = this.LL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<WeakReference<Object>, Runnable> entry : map.entrySet()) {
                if (Intrinsics.LJFF(entry.getKey().get(), obj) || entry.getKey().get() == null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(((Map.Entry) it2.next()).getKey());
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C2041907zF.LIZLLL.remove(it3.next());
            }
        } else if (iIntValue == 2) {
            C2041907zF.LJ.remove(this.LL);
        }
        return Unit.LIZ;
    }
}
