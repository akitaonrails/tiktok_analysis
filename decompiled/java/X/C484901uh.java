package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01uh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C484901uh extends C2217421BqW implements InterfaceC1631630sYr<Float, Float, Float, Float, Unit> {
    public C484901uh(Object obj) {
        super(4, obj, InterfaceC395901gL.class, "onPositionChange", "onPositionChange(FFFF)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Float f, Float f2, Float f3, Float f4) {
        ((InterfaceC395901gL) this.receiver).LJ(f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue());
        return Unit.LIZ;
    }
}
