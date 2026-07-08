package X;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JUL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JUL extends C09AY implements Function1<C0JUV, C0JUV> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ ArrayList<C0JUN> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JUL(C118300cf c118300cf, int i, C013C c013c, ArrayList<C0JUN> arrayList) {
        super(1);
        this.LL = c118300cf;
        this.LLILLJJLI = i;
        this.LLILLL = c013c;
        this.LLILZ = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JUV invoke(C0JUV c0juv) {
        Pair pair = new Pair(Integer.valueOf(this.LL.element), Integer.valueOf(this.LLILLJJLI));
        C291001Au c291001Au = new C291001Au(Boolean.TRUE);
        return C0JUV.LIZ(c0juv, null, this.LLILZ, pair, this.LLILLL.element, null, null, c291001Au, 49);
    }
}
