package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09AR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09AR extends C09AY implements Function2<C09AS, CoroutineContext.Element, C09AS> {
    public C09AR() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C09AS invoke(C09AS c09as, CoroutineContext.Element element) {
        C09AS c09as2 = c09as;
        CoroutineContext.Element element2 = element;
        if (element2 instanceof C09AT) {
            C09AT<Object> c09at = (C09AT) element2;
            Object objLJJLIIIJ = c09at.LJJLIIIJ(c09as2.LIZ);
            Object[] objArr = c09as2.LIZIZ;
            int i = c09as2.LIZLLL;
            objArr[i] = objLJJLIIIJ;
            C09AT<Object>[] c09atArr = c09as2.LIZJ;
            c09as2.LIZLLL = i + 1;
            c09atArr[i] = c09at;
        }
        return c09as2;
    }
}
