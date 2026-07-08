package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0qp7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564830qp7 {
    public volatile boolean LIZ;
    public CopyOnWriteArrayList<C1564850qp9> LIZIZ = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<C1564850qp9> LIZJ = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<C1564850qp9> LIZLLL = new CopyOnWriteArrayList<>();

    public final synchronized CopyOnWriteArrayList<C1564850qp9> LIZ() {
        CopyOnWriteArrayList<C1564850qp9> copyOnWriteArrayList;
        copyOnWriteArrayList = this.LIZJ;
        this.LIZJ = new CopyOnWriteArrayList<>();
        return copyOnWriteArrayList;
    }

    public final synchronized CopyOnWriteArrayList<C1564850qp9> LIZIZ() {
        CopyOnWriteArrayList<C1564850qp9> copyOnWriteArrayList;
        copyOnWriteArrayList = this.LIZLLL;
        this.LIZLLL = new CopyOnWriteArrayList<>();
        return copyOnWriteArrayList;
    }

    public final synchronized CopyOnWriteArrayList<C1564850qp9> LIZJ() {
        CopyOnWriteArrayList<C1564850qp9> copyOnWriteArrayList;
        copyOnWriteArrayList = this.LIZIZ;
        this.LIZIZ = new CopyOnWriteArrayList<>();
        return copyOnWriteArrayList;
    }
}
