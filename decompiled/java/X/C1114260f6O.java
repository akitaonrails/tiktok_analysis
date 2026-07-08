package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import wh6.AbS698S0100000_17;

/* JADX INFO: renamed from: X.0f6O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114260f6O {
    public final DataChannel LIZ;
    public final View LIZIZ;
    public final C20632315oP LIZJ;
    public final List<AbstractC1114240f6M> LIZLLL;
    public final InterfaceC1114270f6P LJ;
    public final C16F5 LJFF;
    public final C16F5 LJI;
    public final View LJII;
    public int LJIIIIZZ;

    public final void LIZ() {
        try {
            if (this.LJIIIIZZ != 3 && !InterfaceC1106030et7.P9.LIZIZ().contains(Long.valueOf(C500260Jjc.LIZIZ(this.LIZ)))) {
                C500260Jjc.LLFFF(this.LJII);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZIZ(int i) {
        this.LJIIIIZZ = i;
        if (i != 2) {
            if (i == 3) {
                C16F5 c16f5 = this.LJFF;
                c16f5.setBackground(C497740JfY.LJIIJ(R.drawable.drq));
                c16f5.setTextColor(C20736316Cj.LIZJ(R.attr.ezq, this.LIZIZ));
                C16F5 c16f52 = this.LJI;
                c16f52.setBackground(null);
                c16f52.setTextColor(C20736316Cj.LIZJ(R.attr.ezs, this.LIZIZ));
                if (C500260Jjc.LJJJJIZL(this.LJII)) {
                    C500260Jjc.LJIILIIL(this.LJII);
                    try {
                        C20337914i1<List<Long>> c20337914i1 = InterfaceC1106030et7.P9;
                        List<Long> listLIZIZ = c20337914i1.LIZIZ();
                        listLIZIZ.add(Long.valueOf(C500260Jjc.LIZIZ(this.LIZ)));
                        if (listLIZIZ.size() > 100) {
                            listLIZIZ.remove(0);
                        }
                        c20337914i1.LJFF(listLIZIZ);
                        C189200o6.m2constructorimpl(c20337914i1);
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return;
                    }
                }
                return;
            }
            return;
        }
        C16F5 c16f53 = this.LJI;
        c16f53.setBackground(C497740JfY.LJIIJ(R.drawable.drq));
        c16f53.setTextColor(C20736316Cj.LIZJ(R.attr.ezq, this.LIZIZ));
        C16F5 c16f54 = this.LJFF;
        c16f54.setBackground(null);
        c16f54.setTextColor(C20736316Cj.LIZJ(R.attr.ezs, this.LIZIZ));
    }

    public C1114260f6O(DataChannel dataChannel, View view, C20632315oP c20632315oP, List list, C1114250f6N c1114250f6N) {
        this.LIZ = dataChannel;
        this.LIZIZ = view;
        this.LIZJ = c20632315oP;
        this.LIZLLL = list;
        this.LJ = c1114250f6N;
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.wpn);
        this.LJFF = c16f5;
        C16F5 c16f52 = (C16F5) view.findViewById(R.id.ho1);
        this.LJI = c16f52;
        View viewFindViewById = view.findViewById(R.id.wpm);
        this.LJII = viewFindViewById;
        this.LJIIIIZZ = 2;
        C500260Jjc.LJIILIIL(c16f52);
        C500260Jjc.LJIILIIL(c16f5);
        C500260Jjc.LJIILIIL(viewFindViewById);
        C500260Jjc.LLFFF(view);
        for (AbstractC1114240f6M abstractC1114240f6M : (ArrayList) list) {
            if (abstractC1114240f6M.I5() == 2) {
                C500260Jjc.LLFFF(this.LJI);
            } else if (abstractC1114240f6M.I5() == 3) {
                C500260Jjc.LLFFF(this.LJFF);
            }
        }
        if (C500260Jjc.LJJJJIZL(this.LJI) && C500260Jjc.LJJJJIZL(this.LJFF)) {
            C786410Ut5.I7(new AbS698S0100000_17(this, 14, 42), this.LJFF);
            C786410Ut5.I7(new AbS698S0100000_17(this, 15, 42), this.LJI);
            return;
        }
        C500260Jjc.LJIILIIL(this.LIZIZ);
    }
}
