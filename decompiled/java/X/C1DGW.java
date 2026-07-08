package X;

import an3.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DGW, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DGW extends C09AY implements Function0<C1DKA> {
    public final /* synthetic */ C1DGV<Enum<Object>> LL;
    public final /* synthetic */ C1DGR<Enum<Object>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1DGW(C1DGV<Enum<Object>> c1dgv, C1DGR<Enum<Object>> c1dgr) {
        super(0);
        this.LL = c1dgv;
        this.LLILLJJLI = c1dgr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1DKA invoke() {
        l<KEY> lVarLIZ = this.LL.LIZ();
        this.LLILLJJLI.getClass();
        LinkedHashMap<C1DGM, Function1<Object, Unit>> linkedHashMap = lVarLIZ.LJ;
        if (!linkedHashMap.isEmpty()) {
            List listLLIIII = C13LP.LLIIII(linkedHashMap.values());
            if (!listLLIIII.isEmpty()) {
                ListIterator listIterator = listLLIIII.listIterator(listLLIIII.size());
                while (listIterator.hasPrevious()) {
                    ((Function1) listIterator.previous()).invoke(lVarLIZ);
                }
            }
        }
        return lVarLIZ.LJ(null, null, null);
    }
}
