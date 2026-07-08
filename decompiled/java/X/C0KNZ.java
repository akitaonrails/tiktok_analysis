package X;

import com.bytedance.android.livesdk.comp.api.subscription.setting.SubCheckOrderIdListSizeSetting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KNZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KNZ extends C09AY implements Function2<Integer, Throwable, Unit> {
    public final /* synthetic */ C516200KMg LL;
    public final /* synthetic */ C0KJK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KNZ(C516200KMg c516200KMg, C0KJK c0kjk) {
        super(2);
        this.LL = c516200KMg;
        this.LLILLJJLI = c0kjk;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Throwable th) {
        Exception exc;
        int iIntValue = num.intValue();
        final Throwable th2 = th;
        C516200KMg c516200KMg = this.LL;
        if (!(th2 instanceof Exception) || (exc = (Exception) th2) == null) {
            exc = new Exception("Unknown error");
        }
        final C516200KMg c516200KMg2 = this.LL;
        final C0KJK c0kjk = this.LLILLJJLI;
        c516200KMg.LJI(0, 71, iIntValue, exc, new InterfaceC516660KOa() { // from class: X.0KMp
            /* JADX WARN: Type inference failed for: r1v2, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.List] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
            @Override // X.InterfaceC516660KOa
            public final void LIZ() {
                ?? arrayList;
                List listLJLJJLL;
                List listLL;
                C516200KMg c516200KMg3 = c516200KMg2;
                C0KJK c0kjk2 = c0kjk;
                C516420KNc c516420KNc = new C516420KNc(c516200KMg3, th2);
                c516200KMg3.getClass();
                C259800zU c259800zU = new C259800zU();
                Object value = c516200KMg3.LJIIIIZZ.getValue();
                String str = c0kjk2.LJIIIZ;
                value.getClass();
                Iterable iterable = (Iterable) ((LinkedHashMap) C0KMK.LIZIZ).get(str);
                if (iterable == null || (listLJLJJLL = C13LP.LJLJJLL(iterable)) == null || (listLL = C13LP.LL(listLJLJJLL, SubCheckOrderIdListSizeSetting.INSTANCE.getValue())) == null) {
                    arrayList = C13BV.INSTANCE;
                } else {
                    arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                    Iterator it2 = listLL.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((C0KML) it2.next()).LIZ);
                    }
                }
                c259800zU.element = arrayList;
                if (arrayList.isEmpty()) {
                    ?? arrayList2 = new ArrayList((Collection) c259800zU.element);
                    arrayList2.add("");
                    c259800zU.element = arrayList2;
                }
                C118300cf c118300cf = new C118300cf();
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C516280KMo(c259800zU, c118300cf, c516200KMg3, c0kjk2, c516420KNc, null), 3);
            }
        });
        return Unit.LIZ;
    }
}
