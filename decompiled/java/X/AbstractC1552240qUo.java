package X;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0qUo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1552240qUo<IN, OUT> {
    public static final AtomicLong LJFF = new AtomicLong();
    public AbstractC1552240qUo LIZ;
    public IN LIZIZ;
    public OUT LIZJ;
    public AbstractC1552800qVi LIZLLL;
    public C1552250qUp LJ;

    public void LIZIZ(Object... objArr) {
    }

    public abstract Object LIZJ(InterfaceC1552320qUw<OUT> interfaceC1552320qUw, IN in);

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(C1552230qUn c1552230qUn, AbstractC1552240qUo abstractC1552240qUo, Object obj, AbstractC1552800qVi abstractC1552800qVi, Object[] objArr) {
        this.LJ = new C1552250qUp(c1552230qUn);
        this.LIZ = abstractC1552240qUo;
        this.LIZIZ = obj;
        this.LIZLLL = abstractC1552800qVi;
        if (abstractC1552240qUo == null && LJFF.getAndIncrement() < 0) {
            throw new RuntimeException("Pipeline ID use up!");
        }
        LIZIZ(objArr);
    }
}
