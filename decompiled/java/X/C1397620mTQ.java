package X;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mTQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397620mTQ extends AbstractC1391450mJT {
    public static final /* synthetic */ int LJI = 0;
    public final List<C1397660mTU> LIZLLL;
    public final List<C1397650mTT> LJ;
    public boolean LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0HUD, android.view.View, android.view.ViewGroup, java.lang.Object] */
    @Override // X.AbstractC1397490mTD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LIZIZ() {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1397620mTQ.LIZIZ():android.view.View");
    }

    public C1397620mTQ(Context context) {
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

    public final C1397640mTS LIZLLL(Context context) {
        C1397640mTS c1397640mTS = new C1397640mTS(context);
        c1397640mTS.setMaskPressed(true);
        c1397640mTS.setButtonSize(this.LIZIZ.LJFF);
        c1397640mTS.setMinWidth(0);
        c1397640mTS.setMaxWidth(Integer.MAX_VALUE);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(47.5d))));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1397640mTS);
        c1397640mTS.setLayoutParams(marginLayoutParams);
        c1397640mTS.setGravity(17);
        c1397640mTS.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0);
        return c1397640mTS;
    }

    public static void LJI(C1397620mTQ c1397620mTQ, CharSequence charSequence) {
        c1397620mTQ.LIZJ(0, charSequence, null);
    }

    public static void LJIIIIZZ(C1397620mTQ c1397620mTQ, CharSequence charSequence) {
        c1397620mTQ.LIZJ(1, charSequence, null);
    }

    public final void LJ(int i, Function1<? super C1397660mTU, Unit> function1) {
        LIZJ(2, this.LIZ.getText(i), function1);
    }

    public final void LJFF(int i, Function1<? super C1397660mTU, Unit> function1) {
        LIZJ(0, this.LIZ.getText(i), function1);
    }

    public final void LJII(int i, Function1<? super C1397660mTU, Unit> function1) {
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
