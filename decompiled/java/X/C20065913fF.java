package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS609S0100000_30;
import p2.j1;

/* JADX INFO: renamed from: X.13fF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20065913fF extends AbstractC20058513e3 {
    public EnumC1686580tzU LIZIZ = EnumC1686580tzU.LL;
    public final /* synthetic */ C1672560tcs LIZJ;

    public final void LIZIZ() {
        if (this.LIZIZ == EnumC1686580tzU.LLILLJJLI) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            AwS609S0100000_30 awS609S0100000_30 = new AwS609S0100000_30(this.LIZJ, 192);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            awS609S0100000_30.invoke(motionEventObtain);
            motionEventObtain.recycle();
            this.LIZIZ = EnumC1686580tzU.LL;
            this.LIZJ.LIZLLL = false;
        }
    }

    public C20065913fF(C1672560tcs c1672560tcs) {
        this.LIZJ = c1672560tcs;
    }

    public final void LIZ(C20067313fT c20067313fT) {
        boolean z;
        List<C20066813fO> list = c20067313fT.LIZ;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (((C20066813fO) ListProtector.get(list, i)).LIZIZ()) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            if (this.LIZIZ == EnumC1686580tzU.LLILLJJLI) {
                j1 j1Var = this.LIZ;
                if (j1Var != null) {
                    C20067513fV.LIZ(c20067313fT, j1Var.LJJJJ(0L), new AwS604S0100000_25(this.LIZJ, 618), true);
                } else {
                    "layoutCoordinates not set".toString();
                    throw new IllegalStateException("layoutCoordinates not set");
                }
            }
            this.LIZIZ = EnumC1686580tzU.LLILLL;
            return;
        }
        j1 j1Var2 = this.LIZ;
        if (j1Var2 != null) {
            C20067513fV.LIZ(c20067313fT, j1Var2.LJJJJ(0L), new AwS391S0200000_25(this, this.LIZJ, 214), false);
            if (this.LIZIZ != EnumC1686580tzU.LLILLJJLI) {
                return;
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C20066813fO) ListProtector.get(list, i2)).LIZ();
            }
            C20067413fU c20067413fU = c20067313fT.LIZIZ;
            if (c20067413fU == null) {
                return;
            }
            c20067413fU.LIZJ = !this.LIZJ.LIZLLL;
            return;
        }
        "layoutCoordinates not set".toString();
        throw new IllegalStateException("layoutCoordinates not set");
    }

    public final void LIZJ(C20067313fT c20067313fT, EnumC20065813fE enumC20065813fE) {
        boolean z;
        List<C20066813fO> list = c20067313fT.LIZ;
        if (!this.LIZJ.LIZLLL) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C20066813fO c20066813fO = (C20066813fO) ListProtector.get(list, i);
                if (C05ZS.LIZ(c20066813fO) || C05ZS.LIZJ(c20066813fO)) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = true;
            break;
        }
        if (this.LIZIZ != EnumC1686580tzU.LLILLL) {
            if (enumC20065813fE == EnumC20065813fE.Initial && z) {
                LIZ(c20067313fT);
            }
            if (enumC20065813fE == EnumC20065813fE.Final && !z) {
                LIZ(c20067313fT);
            }
        }
        if (enumC20065813fE == EnumC20065813fE.Final) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!C05ZS.LIZJ((C20066813fO) ListProtector.get(list, i2))) {
                    return;
                }
            }
            this.LIZIZ = EnumC1686580tzU.LL;
            this.LIZJ.LIZLLL = false;
        }
    }
}
