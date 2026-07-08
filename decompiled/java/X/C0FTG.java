package X;

import android.graphics.RectF;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FTG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FTG extends C0FUM implements C0FUG {
    public final Function1<Integer, Unit> LL;
    public long LLILLJJLI;

    @Override // X.C0FUG
    public final void LIZJ() {
    }

    @Override // X.C0FUG
    public final void LJI() {
    }

    @Override // X.C0FUG
    public final void LJII(MotionEvent motionEvent) {
    }

    @Override // X.C0FUG
    public final void LJIIIIZZ(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIJ(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIJJI(float f, int i, RectF rectF) {
    }

    @Override // X.C0FUG
    public final void LJIILL(int i) {
    }

    @Override // X.C0FUG
    public final void LJIILLIIL(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIZILJ() {
    }

    @Override // X.C0FUG
    public final void LJIJ(int i, EnumC1466150oFx enumC1466150oFx) {
    }

    @Override // X.C0FUG
    public final void LJIJI(int i, boolean z) {
    }

    @Override // X.C0FUG
    public final void LJIL() {
    }

    @Override // X.C0FUG
    public final void LJJ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2) {
    }

    @Override // X.C0FUG
    public final void LJJI(int i, float f, float f2, RectF rectF) {
    }

    @Override // X.C0FUG
    public final void LJJIII() {
    }

    @Override // X.C0FUG
    public final void LJJIIJZLJL() {
    }

    @Override // X.C0FUG
    public final void LJJIJ() {
    }

    @Override // X.C0FUG
    public final int getPriority() {
        return 100;
    }

    public C0FTG(AwS584S0100000_5 awS584S0100000_5) {
        this.LL = awS584S0100000_5;
    }

    @Override // X.C0FUG
    public final void LJJIJIIJI(int i) {
        if (System.currentTimeMillis() - this.LLILLJJLI > 500) {
            this.LL.invoke(Integer.valueOf(i));
            this.LLILLJJLI = System.currentTimeMillis();
        }
    }

    @Override // X.C0FUG
    public final void LJJIIZ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2, RectF rectF, float f3) {
        if (System.currentTimeMillis() - this.LLILLJJLI > 500) {
            this.LL.invoke(Integer.valueOf(i));
            this.LLILLJJLI = System.currentTimeMillis();
        }
    }
}
