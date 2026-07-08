package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.15A3, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15A3 implements C15A8 {
    public final Pair<Integer, Integer> LIZ;

    @Override // X.InterfaceC20339014iC
    public final C15A8 LIZ() {
        Pair<Integer, Integer> pair = this.LIZ;
        return new C15A3(new Pair(pair.getFirst(), pair.getSecond()));
    }

    public C15A3(Pair<Integer, Integer> pair) {
        this.LIZ = pair;
    }
}
