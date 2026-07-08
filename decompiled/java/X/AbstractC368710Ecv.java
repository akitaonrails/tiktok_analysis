package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Ecv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC368710Ecv implements InterfaceC369180Edg {
    public final /* synthetic */ InterfaceC369180Edg LL;
    public List<Long> LLILLJJLI = C13BV.INSTANCE;

    public abstract void LIZ();

    public boolean LIZJ(NLETrackSlot nLETrackSlot) {
        return true;
    }

    public abstract List<Long> LJ(NLETrackSlot nLETrackSlot);

    @Override // X.InterfaceC369180Edg
    public final void LJIIZILJ(boolean z, int i, int i2, boolean z2, boolean z3) {
        this.LL.LJIIZILJ(z, i, i2, z2, z3);
    }

    @Override // X.InterfaceC369180Edg
    public final void LJLLILLLL(int i) {
        this.LL.LJLLILLLL(i);
    }

    @Override // X.InterfaceC369180Edg
    public final void LLILIL(int i) {
        this.LL.LLILIL(i);
    }

    public AbstractC368710Ecv(C368680Ecs c368680Ecs) {
        this.LL = c368680Ecs;
    }

    public final Long LIZIZ(long j, long j2) {
        boolean z = C0E8Z.LIZ;
        Iterator<Long> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            long jLongValue = it2.next().longValue();
            double dAbs = Math.abs(jLongValue - j);
            boolean z2 = C0E8Z.LIZ;
            if (dAbs < ((double) 100) / 1.0d) {
                return Long.valueOf(jLongValue - j2);
            }
        }
        return null;
    }

    public final void LIZLLL(C368630Ecn c368630Ecn, int i, int i2, boolean z, boolean z2) {
        if (!z2 ? i > 0 : i < 0) {
            LLILIL(Math.abs(c368630Ecn.getScrollX() + i));
        }
        LJIIZILJ(z, i, i2, false, false);
    }
}
