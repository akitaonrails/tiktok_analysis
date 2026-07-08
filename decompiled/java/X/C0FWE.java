package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FWE, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FWE implements C0FUG {
    public final Context LL;
    public final C0FUH LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public AnonymousClass0956 LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(283));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1004));

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
    public final void LJJIJIIJI(int i) {
    }

    @Override // X.C0FUG
    public final int getPriority() {
        return 100;
    }

    public C0FWE(Context context, C0FUH c0fuh, LifecycleOwner lifecycleOwner) {
        this.LL = context;
        this.LLILLJJLI = c0fuh;
        this.LLILLL = lifecycleOwner;
    }

    @Override // X.C0FUG
    public final void LJJIIZ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2, RectF rectF, float f3) {
        C0FFO next;
        this.LLILZLL.getValue();
        Iterator<C0FFO> it2 = this.LLILLJJLI.LJIIIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == enumC1466150oFx) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0FFO c0ffo = next;
        if (c0ffo == null) {
            c0ffo = new C0FFO(null, 0, false, false, false, false, false, null, null, false, false, false, false, false, false, new C0FXE(15), 1835007);
        }
        if (c0ffo.LJIIJ.length() > 0) {
            ((C1664680tQA) this.LLILZIL.getValue()).LIZLLL(new AwS584S0100000_5(c0ffo, 838), true);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZ = C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C0FWD(this, null), 3);
    }
}
