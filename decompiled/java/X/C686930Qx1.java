package X;

import Y.ARunnableS110S0100000_10;
import android.view.View;
import java.util.LinkedList;
import kotlin.jvm.internal.AwS411S0200000_10;

/* JADX INFO: renamed from: X.0Qx1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686930Qx1 extends C686870Qwv {
    public C686930Qx1(C19EG c19eg) {
        super(c19eg);
    }

    public final Integer LIZLLL(int i) {
        LinkedList<View> linkedList = this.LIZIZ.get(Integer.valueOf(i));
        if (linkedList != null) {
            return Integer.valueOf(linkedList.size());
        }
        return null;
    }

    @Override // X.C686870Qwv, X.AbstractC686880Qww
    public final void LIZJ(C686940Qx2 c686940Qx2, long j) {
        if (!C800870VbJ.LIZ()) {
            return;
        }
        AwS411S0200000_10 awS411S0200000_10 = new AwS411S0200000_10(this, c686940Qx2, 54);
        if (j > 0) {
            C786410Ut5.LJLIIL(j, C686950Qx3.LIZ, new ARunnableS110S0100000_10(awS411S0200000_10, 90));
        } else {
            C786410Ut5.LJJZZIII(C686950Qx3.LIZ, new ARunnableS110S0100000_10(awS411S0200000_10, 90));
        }
    }
}
