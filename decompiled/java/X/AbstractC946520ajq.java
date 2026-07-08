package X;

import android.graphics.Rect;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ajq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC946520ajq implements InterfaceC2181941AaO {
    public Rect LIZ = new Rect();

    @Override // X.InterfaceC2181941AaO
    public final void LIZIZ(int i, int i2) {
    }

    public abstract Rect LIZJ();

    public abstract void LIZLLL(Rect rect, Pair<Integer, Integer> pair);

    @Override // X.InterfaceC2181941AaO
    public final void init() {
    }

    @Override // X.InterfaceC2181941AaO
    public final Rect getSize() {
        return this.LIZ.isEmpty() ? LIZJ() : this.LIZ;
    }

    @Override // X.InterfaceC2181941AaO
    public final void LIZ(int i, int i2, int i3, int i4) {
        LJ(i, i2, i3, i4, null);
    }

    public final void LJ(int i, int i2, int i3, int i4, Pair<Integer, Integer> pair) {
        Rect rect = new Rect(i, i2, i3, i4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update size, old: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", new: ");
        sbLIZ.append(rect);
        sbLIZ.append(" parentSize:");
        sbLIZ.append(pair);
        C20441214yg.LJIIIZ("AbsSizeFilterStreamPlayer", C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(this.LIZ, rect)) {
            this.LIZ = rect;
            LIZLLL(rect, pair);
        }
    }
}
