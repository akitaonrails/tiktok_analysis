package X;

import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.099d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23251099d<T> extends C099Z<T> {
    public final ThreadLocal<Pair<CoroutineContext, Object>> LLILZIL;
    public volatile boolean threadLocalIsSet;

    public final boolean LJLJJL() {
        boolean z = this.threadLocalIsSet && this.LLILZIL.get() == null;
        this.LLILZIL.remove();
        return !z;
    }

    @Override // X.C099Z, X.C099D
    public final void LJLIL(Object obj) {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.LLILZIL.get();
            if (pair != null) {
                C09AQ.LIZ(pair.getFirst(), pair.getSecond());
            }
            this.LLILZIL.remove();
        }
        Object objLIZ = C23248099a.LIZ(obj);
        InterfaceC1364105Vn<T> interfaceC1364105Vn = this.LLILZ;
        CoroutineContext context = interfaceC1364105Vn.getContext();
        C23251099d<?> c23251099dLIZJ = null;
        Object objLIZJ = C09AQ.LIZJ(context, null);
        if (objLIZJ != C09AQ.LIZ) {
            c23251099dLIZJ = C23252099e.LIZJ(interfaceC1364105Vn, context, objLIZJ);
        }
        try {
            this.LLILZ.resumeWith(objLIZ);
        } finally {
            if (c23251099dLIZJ == null || c23251099dLIZJ.LJLJJL()) {
                C09AQ.LIZ(context, objLIZJ);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C23251099d(InterfaceC1364105Vn interfaceC1364105Vn, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextPlus;
        C23270099w c23270099w = C23270099w.LL;
        if (coroutineContext.get(c23270099w) == null) {
            coroutineContextPlus = coroutineContext.plus(c23270099w);
        } else {
            coroutineContextPlus = coroutineContext;
        }
        super(interfaceC1364105Vn, coroutineContextPlus);
        this.LLILZIL = new ThreadLocal<>();
        if (!(interfaceC1364105Vn.getContext().get(InterfaceC23139094v.LJJLIIJ) instanceof AbstractC2252651DEx)) {
            Object objLIZJ = C09AQ.LIZJ(coroutineContext, null);
            C09AQ.LIZ(coroutineContext, objLIZJ);
            LJLJL(coroutineContext, objLIZJ);
        }
    }

    public final void LJLJL(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.LLILZIL.set(new Pair<>(coroutineContext, obj));
    }
}
