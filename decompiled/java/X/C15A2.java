package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.15A2, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15A2 implements C15A8 {
    public final Pair<Float, Float> LIZ;
    public final Pair<Float, Float> LIZIZ;
    public final int LIZJ;

    @Override // X.InterfaceC20339014iC
    public final C15A8 LIZ() {
        Pair pair = new Pair(this.LIZ.getFirst(), this.LIZ.getSecond());
        Pair<Float, Float> pair2 = this.LIZIZ;
        return new C15A2(pair, pair2 == null ? null : new Pair(pair2.getFirst(), pair2.getSecond()), this.LIZJ);
    }

    public C15A2(Pair<Float, Float> pair, Pair<Float, Float> pair2, int i) {
        this.LIZ = pair;
        this.LIZIZ = pair2;
        this.LIZJ = i;
    }

    public /* synthetic */ C15A2(Pair pair, Pair pair2, int i, int i2) {
        this(pair, (i & 2) != 0 ? null : pair2, 0);
    }
}
