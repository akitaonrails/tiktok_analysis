package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS280S0300000_1;

/* JADX INFO: renamed from: X.04EO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04EO implements C04ES {
    public final /* synthetic */ Function2<Integer, C042Y, Unit> LIZ;
    public final /* synthetic */ InterfaceC1631630sYr<Integer, Integer, C042Y, Boolean, Unit> LIZIZ;

    public C04EO(AwS280S0300000_1 awS280S0300000_1, C1077704Jj c1077704Jj) {
        this.LIZ = awS280S0300000_1;
        this.LIZIZ = c1077704Jj;
    }

    @Override // X.C04ES
    public final void LIZ(int i, C042Y c042y) {
        this.LIZ.invoke(Integer.valueOf(i), c042y);
    }

    @Override // X.C04ES
    public final void LIZIZ(int i, int i2, C042Y c042y, boolean z) {
        this.LIZIZ.invoke(Integer.valueOf(i), Integer.valueOf(i2), c042y, Boolean.valueOf(z));
    }
}
