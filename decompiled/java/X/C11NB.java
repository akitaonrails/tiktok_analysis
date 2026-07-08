package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11NB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11NB implements C11LR {
    public static final C11NB LL;
    public static final /* synthetic */ C11NB[] LLILLJJLI;

    @Override // X.C11LR
    public final void cancel() {
    }

    @Override // X.C11LR
    public final void request(long j) {
    }

    static {
        C11NB c11nb = new C11NB();
        LL = c11nb;
        LLILLJJLI = new C11NB[]{c11nb};
    }

    public static C11NB[] values() {
        return (C11NB[]) LLILLJJLI.clone();
    }

    public static void LIZJ(AtomicReference atomicReference) {
        C11LR c11lr;
        Object obj = atomicReference.get();
        C11NB c11nb = LL;
        if (obj != c11nb && (c11lr = (C11LR) atomicReference.getAndSet(c11nb)) != c11nb && c11lr != null) {
            c11lr.cancel();
        }
    }

    public static C11NB valueOf(String str) {
        return (C11NB) C08FF.LIZ(C11NB.class, str);
    }
}
