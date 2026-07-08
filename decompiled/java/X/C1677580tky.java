package X;

import X.AbstractC1677260tkS;

/* JADX INFO: renamed from: X.0tky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677580tky<T, V extends AbstractC1677260tkS> implements C05P1<T> {
    public final InterfaceC1677290tkV<T, V> LL;
    public final C05P0 LLILLJJLI;
    public V LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;

    public final T LJIIL() {
        return this.LL.LIZIZ().invoke(this.LLILLL);
    }

    @Override // X.C05P1
    public final T getValue() {
        return (T) this.LLILLJJLI.getValue();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationState(value=");
        sbLIZ.append(getValue());
        sbLIZ.append(", velocity=");
        sbLIZ.append(LJIIL());
        sbLIZ.append(", isRunning=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", lastFrameTimeNanos=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", finishedTimeNanos=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1677580tky(InterfaceC1677290tkV interfaceC1677290tkV, Object obj, AbstractC1677260tkS abstractC1677260tkS, int i) {
        long j;
        long j2;
        AbstractC1677260tkS abstractC1677260tkS2 = (i & 4) != 0 ? null : abstractC1677260tkS;
        if ((i & 8) != 0) {
            j = Long.MIN_VALUE;
        } else {
            j = 0;
        }
        if ((i & 16) != 0) {
            j2 = Long.MIN_VALUE;
        } else {
            j2 = 0;
        }
        this(interfaceC1677290tkV, obj, abstractC1677260tkS2, j, j2, false);
    }

    public C1677580tky(InterfaceC1677290tkV<T, V> interfaceC1677290tkV, T t, V v, long j, long j2, boolean z) {
        V vInvoke;
        this.LL = interfaceC1677290tkV;
        this.LLILLJJLI = C20028913Yh.LJI(t);
        if (v != null) {
            vInvoke = (V) C1677250tkR.LIZ(v);
        } else {
            vInvoke = interfaceC1677290tkV.LIZ().invoke(t);
            vInvoke.LIZLLL();
        }
        this.LLILLL = vInvoke;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = z;
    }
}
