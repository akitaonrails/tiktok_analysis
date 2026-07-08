package X;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.1831, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1831 implements C188I {
    public Integer LIZ = 0;
    public C183F LIZIZ;
    public Function1<? super C183I, Unit> LIZJ;
    public ViewGroup LIZLLL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.183P] */
    @Override // X.C188I
    public final C188K build() {
        C212203182n c212203182n = new C212203182n();
        c212203182n.LLIZLLLIL = this.LIZJ;
        c212203182n.LLIZ = this.LIZIZ;
        ViewGroup viewGroup = this.LIZLLL;
        if (viewGroup == null) {
            return null;
        }
        c212203182n.LLILLJJLI = viewGroup;
        Integer num = this.LIZ;
        if (num == null) {
            return null;
        }
        if (num.intValue() == 1) {
            c212203182n.LLILLL = new Object() { // from class: X.183P
            };
        }
        return c212203182n;
    }

    @Override // X.C188I
    public final void LIZ(C188L c188l) {
        this.LIZIZ = c188l;
    }

    @Override // X.C188I
    public final void LIZIZ(Integer num) {
        this.LIZ = num;
    }

    @Override // X.C188I
    public final void LIZJ(ViewGroup viewGroup) {
        this.LIZLLL = viewGroup;
    }

    @Override // X.C188I
    public final void LIZLLL(AwS611S0100000_32 awS611S0100000_32) {
        this.LIZJ = awS611S0100000_32;
    }
}
