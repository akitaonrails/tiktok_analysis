package X;

import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0mIV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390850mIV {
    public final TuxActionSheet LIZ = new TuxActionSheet();
    public boolean LIZIZ;
    public boolean LIZJ;

    public final TuxActionSheet LIZJ() {
        TuxActionSheet tuxActionSheet = this.LIZ;
        boolean z = this.LIZIZ;
        tuxActionSheet.LLJJJJJIL = !z;
        tuxActionSheet.LLJJJJLIIL = z && !this.LIZJ;
        return tuxActionSheet;
    }

    public final void LIZ(C1247530iZL... c1247530iZLArr) {
        ((ArrayList) this.LIZ.LLJJIII).add(C13LQ.LJJLL(c1247530iZLArr));
        this.LIZIZ = true;
    }

    public final void LIZIZ(C1247510iZJ... c1247510iZJArr) {
        ((ArrayList) this.LIZ.LLJJIII).add(C13LQ.LJJLL(c1247510iZJArr));
        this.LIZJ = true;
    }

    public final void LIZLLL(int i) {
        this.LIZ.LLJJJJ = Integer.valueOf(i);
    }

    public final void LJ(int i) {
        this.LIZ.LLILZLL = Integer.valueOf(i);
    }

    public final void LJFF(List list) {
        ((ArrayList) this.LIZ.LLJJIII).add(list);
        this.LIZIZ = true;
    }

    public final void LJI(List list) {
        ((ArrayList) this.LIZ.LLJJIII).add(list);
        this.LIZJ = true;
    }

    public final void LJII(int i) {
        this.LIZ.LLJJIJIIJIL = Integer.valueOf(i);
    }
}
