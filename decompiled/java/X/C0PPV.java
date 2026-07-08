package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0PPV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PPV<T> {
    public ArrayList<T> LIZIZ;
    public boolean LIZLLL;
    public ArrayList<T> LIZ = new ArrayList<>();
    public final C0PPW<T> LIZJ = new C0PPW<>();

    public final void LIZ() {
        if (!this.LIZLLL) {
            throw new IllegalStateException("Iteration not started");
        }
        this.LIZLLL = false;
        ArrayList<T> arrayList = this.LIZIZ;
        if (arrayList != null) {
            this.LIZ = arrayList;
            this.LIZJ.LIZ.clear();
            this.LIZJ.LIZIZ = 0;
        }
        this.LIZIZ = null;
    }

    public final ArrayList<T> LIZIZ() {
        if (!this.LIZLLL) {
            return this.LIZ;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new ArrayList<>(this.LIZ);
        }
        return this.LIZIZ;
    }
}
