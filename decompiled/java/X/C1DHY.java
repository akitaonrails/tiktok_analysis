package X;

import java.util.List;
import kotlin.jvm.internal.AwS0S0210001_35;
import kotlin.jvm.internal.AwS0S0221001_35;
import kotlin.jvm.internal.AwS172S0101000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS6S1102000_35;

/* JADX INFO: renamed from: X.1DHY, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DHY implements C1DHZ {
    public final C1DHC LIZ;
    public final C1DHZ LIZIZ;

    @Override // X.C1DHZ
    public final void LJI() {
        new AwS579S0100000_35(this, 248).invoke();
    }

    @Override // X.C1DHZ
    public final void LJIIIZ() {
        new AwS579S0100000_35(this, 247).invoke();
    }

    public C1DHY(C1DHC c1dhc) {
        this.LIZ = c1dhc;
        this.LIZIZ = c1dhc.LIZJ;
        new C11NJ();
    }

    @Override // X.C1DHZ
    public final void LIZLLL(int i) {
        new AwS172S0101000_35(this, i, 5).invoke();
    }

    @Override // X.C1DHZ
    public final void LJIIJ(int i) {
        new AwS172S0101000_35(this, i, 4).invoke();
    }

    @Override // X.C1DHZ
    public final void LIZ(int i, int i2) {
        new C2253211DHb(this, i, i2).invoke();
    }

    @Override // X.C1DHZ
    public final void LIZIZ(int i, int i2, String str) {
        new AwS6S1102000_35(this, i, i2, str, 1).invoke();
    }

    @Override // X.C1DHZ
    public final void LJFF(float f, int i, boolean z) {
        new C2253221DHc(this, i, f, z).invoke();
    }

    @Override // X.C1DHZ
    public final void LJII(int i, int i2, String str) {
        new AwS6S1102000_35(this, i, i2, str, 0).invoke();
    }

    @Override // X.C1DHZ
    public final void LJIIIIZZ(List list, boolean z, float f) {
        new AwS0S0210001_35(this, (C1DHY) z, (boolean) f, (float) list, (List<Integer>) 0).invoke();
    }

    @Override // X.C1DHZ
    public final void LJ(long j, String str, String str2, String str3) {
        new C2253201DHa(this, j, str, str2, str3).invoke();
    }

    @Override // X.C1DHZ
    public final void LIZJ(int i, boolean z, boolean z2, float f, List<Integer> list) {
        new AwS0S0221001_35(this, (C1DHY) i, (int) z, z2, (boolean) f, (float) list, (List<Integer>) 1).invoke();
    }
}
