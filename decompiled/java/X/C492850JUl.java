package X;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JUl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492850JUl extends C09AY implements Function1<C492830JUj, C492830JUj> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ ArrayList<AbstractC492880JUo> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492850JUl(C118300cf c118300cf, int i, C013C c013c, ArrayList<AbstractC492880JUo> arrayList) {
        super(1);
        this.LL = c118300cf;
        this.LLILLJJLI = i;
        this.LLILLL = c013c;
        this.LLILZ = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C492830JUj invoke(C492830JUj c492830JUj) {
        Pair pair = new Pair(Integer.valueOf(this.LL.element), Integer.valueOf(this.LLILLJJLI));
        C291001Au c291001Au = new C291001Au(Boolean.TRUE);
        return C492830JUj.LIZ(c492830JUj, this.LLILZ, pair, this.LLILLL.element, null, null, c291001Au, null, 88);
    }
}
