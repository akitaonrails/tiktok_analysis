package X;

import android.graphics.RectF;
import android.view.MotionEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FTF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FTF extends C0FUM implements C0FUD, C0FUG {
    public final Function1<Integer, Unit> LL;
    public final C01GW LLILLJJLI;
    public long LLILLL;
    public Integer LLILZ;

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

    @Override // X.C0FUD
    public final boolean LJIILIIL() {
        return true;
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

    @Override // X.C0FUD
    public final boolean LJIJJLI(float f, float f2, int i, RectF rectF, EnumC1466150oFx enumC1466150oFx) {
        return false;
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

    @Override // X.C0FUD
    public final boolean LJJIFFI(float f, int i, RectF rectF) {
        return false;
    }

    @Override // X.C0FUD
    public final boolean LJJII(float f, int i, RectF rectF) {
        return false;
    }

    @Override // X.C0FUG
    public final void LJJIII() {
    }

    @Override // X.C0FUG
    public final void LJJIIJZLJL() {
    }

    @Override // X.C0FUG
    public final void LJJIIZ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2, RectF rectF, float f3) {
    }

    @Override // X.C0FUG
    public final void LJJIJ() {
    }

    @Override // X.C0FUG
    public final void LJJIJIIJI(int i) {
    }

    @Override // X.C0FUG
    public final int getPriority() {
        return 100;
    }

    @Override // X.C0FUD
    public final boolean LJIILJJIL(int i) {
        C0FTJ c0ftjLIZ = C0FKU.LIZ(i, (List) this.LLILLJJLI.getValue());
        if (c0ftjLIZ == null || !c0ftjLIZ.LJI()) {
            return false;
        }
        this.LL.invoke(Integer.valueOf(i));
        return true;
    }

    @Override // X.C0FUD
    public final boolean LJJIIJ(int i) {
        long jCurrentTimeMillis;
        Integer num;
        C0FTJ c0ftjLIZ = C0FKU.LIZ(i, (List) this.LLILLJJLI.getValue());
        if (c0ftjLIZ == null || !c0ftjLIZ.LJIJJLI()) {
            return false;
        }
        if (System.currentTimeMillis() - this.LLILLL < 3000 && (num = this.LLILZ) != null && num.intValue() == i) {
            this.LLILZ = null;
            this.LL.invoke(Integer.valueOf(i));
            jCurrentTimeMillis = 0;
        } else {
            this.LLILZ = Integer.valueOf(i);
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.LLILLL = jCurrentTimeMillis;
        if (jCurrentTimeMillis == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.LLILLL = 0L;
        return this instanceof C1417630mzh;
    }

    public C0FTF(C390420FSm c390420FSm, AwS584S0100000_5 awS584S0100000_5) {
        this.LL = awS584S0100000_5;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 1035));
    }
}
