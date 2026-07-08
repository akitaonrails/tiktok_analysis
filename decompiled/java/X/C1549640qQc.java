package X;

import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549640qQc extends C09AY implements Function1<Pair<? extends String, ? extends Object>, Unit> {
    public final /* synthetic */ int[] LL;
    public final /* synthetic */ C1549590qQX LLILLJJLI;
    public final /* synthetic */ Map.Entry<String, Pair<Method, InterfaceC1549470qQL>> LLILLL;
    public final /* synthetic */ Object LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1549640qQc(int[] iArr, C1549590qQX c1549590qQX, Map.Entry<String, ? extends Pair<Method, ? extends InterfaceC1549470qQL>> entry, Object obj) {
        super(1);
        this.LL = iArr;
        this.LLILLJJLI = c1549590qQX;
        this.LLILLL = entry;
        this.LLILZ = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends String, ? extends Object> pair) throws C1549560qQU {
        if (C13LQ.LJIILJJIL(C1549590qQX.LIZLLL(pair.getSecond()), this.LL)) {
            return Unit.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLL.getKey());
        sbLIZ.append(" has wrong value.should be one of ");
        sbLIZ.append(new C1549740qQm(this.LL));
        sbLIZ.append(" but got ");
        sbLIZ.append(this.LLILZ);
        throw new C1549560qQU(C2188811AlT.LIZIZ(sbLIZ));
    }
}
