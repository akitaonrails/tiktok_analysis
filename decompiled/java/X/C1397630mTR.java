package X;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mTR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397630mTR extends AbstractC1391450mJT {
    public static final /* synthetic */ int LJI = 0;
    public final List<C1397660mTU> LIZLLL;
    public final List<C1397650mTT> LJ;
    public boolean LJFF;

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0076 A[SYNTHETIC] */
    @Override // X.AbstractC1397490mTD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LIZIZ() {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1397630mTR.LIZIZ():android.view.View");
    }

    public C1397630mTR(Context context) {
        super(context);
        this.LIZLLL = new ArrayList();
        this.LJ = new ArrayList();
    }

    @Override // X.AbstractC1397490mTD
    public final void LIZ(C1397510mTF c1397510mTF) {
        this.LIZJ = c1397510mTF;
        Iterator<C1397660mTU> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ = c1397510mTF;
        }
    }

    public final C197039127h LIZLLL(C197039127h c197039127h) {
        if (C1397510mTF.LLJJIJIIJIL != 0) {
            c197039127h.setButtonSize(this.LIZIZ.LJFF);
            c197039127h.setGravity(17);
            return c197039127h;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        C786410Ut5.J6(c197039127h, layoutParams);
        c197039127h.setButtonSize(this.LIZIZ.LJFF);
        c197039127h.setGravity(17);
        return c197039127h;
    }

    public static void LJFF(C1397630mTR c1397630mTR, CharSequence charSequence) {
        c1397630mTR.LIZJ(0, charSequence, null);
    }

    public final void LJ(int i, Function1<? super C1397660mTU, Unit> function1) {
        LIZJ(0, this.LIZ.getText(i), function1);
    }

    public final void LJI(int i, Function1<? super C1397660mTU, Unit> function1) {
        LIZJ(1, this.LIZ.getText(i), function1);
    }

    public final void LIZJ(int i, CharSequence charSequence, Function1<? super C1397660mTU, Unit> function1) {
        ((ArrayList) this.LIZLLL).add(new C1397660mTU(((ArrayList) this.LIZLLL).size()));
        if (C1397510mTF.LLJJIJIIJIL != 0) {
            if (((ArrayList) this.LJ).size() <= 2) {
                ((ArrayList) this.LJ).add(new C1397650mTT(i, charSequence, function1));
                return;
            }
            return;
        }
        ((ArrayList) this.LJ).add(new C1397650mTT(i, charSequence, function1));
    }
}
