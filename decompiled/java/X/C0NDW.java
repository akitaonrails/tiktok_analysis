package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NDW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NDW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ C259800zU<List<C590280NDe>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NDW(List<String> list, C259800zU<List<C590280NDe>> c259800zU) {
        super(0);
        this.LL = list;
        this.LLILLJJLI = c259800zU;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0NDV.LIZ.getClass();
        List<C590280NDe> listLJIIIIZZ = C0NDV.LJII().LJIIIIZZ(this.LL);
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJIIIIZZ, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C590280NDe c590280NDe : listLJIIIIZZ) {
            C590280NDe c590280NDe2 = c590280NDe;
            linkedHashMap.put(c590280NDe2 != null ? c590280NDe2.LIZ : null, c590280NDe);
        }
        C259800zU<List<C590280NDe>> c259800zU = this.LLILLJJLI;
        List<String> list = this.LL;
        ?? arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(linkedHashMap.get(it2.next()));
        }
        c259800zU.element = arrayList;
        return Unit.LIZ;
    }
}
