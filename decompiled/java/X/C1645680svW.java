package X;

import android.view.MotionEvent;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0svW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645680svW extends AbstractC2255721DQs<InterfaceC1645420sv6> implements InterfaceC379610EuV, InterfaceC1645420sv6 {
    public static final int LLILZIL = 8;
    public final C1DRG LL;
    public final C1645680svW LLILLJJLI = this;
    public final Set<InterfaceC21645719nT> LLILLL = new LinkedHashSet();
    public final Set<Function1<MotionEvent, Unit>> LLILZ = new LinkedHashSet();

    public final void Z1() {
        this.LLILLL.clear();
        this.LLILZ.clear();
    }

    public C1645680svW W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1645680svW(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1645420sv6
    public void JF(Function1<? super MotionEvent, Unit> function1) {
        this.LLILZ.remove(function1);
    }

    @Override // X.InterfaceC1645420sv6
    public void R10(InterfaceC21645719nT interfaceC21645719nT) {
        this.LLILLL.add(interfaceC21645719nT);
    }

    @Override // X.InterfaceC1645420sv6
    public void Yk1(Function1<? super MotionEvent, Unit> function1) {
        this.LLILZ.add(function1);
    }

    @Override // X.InterfaceC1645420sv6
    public void fo1(InterfaceC21645719nT interfaceC21645719nT) {
        this.LLILLL.remove(interfaceC21645719nT);
    }

    public final void X1(MotionEvent motionEvent, long j) {
        int action = motionEvent.getAction() & 255;
        int[] iArr = {(int) Float.intBitsToFloat((int) (j >> 32)), (int) Float.intBitsToFloat((int) (j & 4294967295L))};
        if (action != 2) {
            if (action != 5) {
                if (action == 6) {
                    for (InterfaceC21645719nT interfaceC21645719nT : this.LLILLL) {
                        if (interfaceC21645719nT != null) {
                            interfaceC21645719nT.LJIIIIZZ(motionEvent, iArr);
                            interfaceC21645719nT.LIZJ(motionEvent, iArr);
                        }
                    }
                    return;
                }
                return;
            }
            for (InterfaceC21645719nT interfaceC21645719nT2 : this.LLILLL) {
                interfaceC21645719nT2.LJI(motionEvent, iArr);
                interfaceC21645719nT2.LJII(motionEvent, iArr);
            }
            return;
        }
        for (InterfaceC21645719nT interfaceC21645719nT3 : this.LLILLL) {
            if (interfaceC21645719nT3 != null) {
                interfaceC21645719nT3.LJIIJ(motionEvent, iArr);
            }
        }
    }
}
