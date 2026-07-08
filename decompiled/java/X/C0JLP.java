package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JLP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JLP extends C09AY implements Function1<C0JLJ, C0JLJ> {
    public final /* synthetic */ AbstractC509020Jxk LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JLP(AbstractC509020Jxk abstractC509020Jxk) {
        super(1);
        this.LL = abstractC509020Jxk;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JLJ invoke(C0JLJ c0jlj) {
        Throwable exc = ((C490400JLa) this.LL).LIZ;
        if (!(exc instanceof Exception) || exc == null) {
            exc = new Exception(((C490400JLa) this.LL).LIZIZ);
        }
        C0JLM c0jlm = new C0JLM(exc);
        c0jlj.getClass();
        return new C0JLJ(c0jlm);
    }
}
