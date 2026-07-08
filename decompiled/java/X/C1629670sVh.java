package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0sVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629670sVh {
    public Function0<Boolean> LIZ;
    public final Function0<Unit> LIZIZ;
    public boolean LIZJ;
    public final AwS639S0100000_25 LIZLLL = new AwS639S0100000_25(this, 123);

    public final void LIZJ() {
        this.LIZJ = false;
        C20510015Ni.LIZ.LIZJ(this.LIZLLL);
    }

    public final void LIZ() {
        C20510015Ni c20510015Ni = C20510015Ni.LIZ;
        if (c20510015Ni.LJIIIIZZ() || this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        c20510015Ni.LJII(this.LIZLLL);
    }

    public final void LIZIZ() {
        if (C20510015Ni.LIZ.LJI() != EnumC1641500som.AVAILABLE || !this.LIZ.invoke().booleanValue()) {
            LIZ();
        } else {
            LIZJ();
            this.LIZIZ.invoke();
        }
    }

    public C1629670sVh(Function0<Boolean> function0, Function0<Unit> function02) {
        this.LIZ = function0;
        this.LIZIZ = function02;
    }
}
