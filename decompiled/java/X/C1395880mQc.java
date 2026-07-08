package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1395880mQc extends C2217421BqW implements Function1<C050V, Unit> {
    public C1395880mQc(C1395870mQb c1395870mQb) {
        super(1, c1395870mQb, C1395870mQb.class, "render", "render(Lcom/ss/android/ugc/aweme/tablet/api/helper/feed/TabletBottomControlBarModel;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C050V c050v) {
        C050V c050v2 = c050v;
        C1395870mQb c1395870mQb = (C1395870mQb) this.receiver;
        InterfaceC1395860mQa interfaceC1395860mQa = c1395870mQb.LIZJ;
        if (interfaceC1395860mQa != null) {
            c1395870mQb.LJ();
            if (!c050v2.LIZ) {
                c1395870mQb.LJ();
                C1592370rXX c1592370rXXLIZ = C1395900mQe.LIZ(c1395870mQb.LIZ);
                if (c1592370rXXLIZ != null) {
                    c1592370rXXLIZ.LLILZLL = null;
                    c1592370rXXLIZ.LLIZ = null;
                    C786410Ut5.LJJJJIZL(c1592370rXXLIZ.LLILLL);
                    C786410Ut5.LJJJJIZL(c1592370rXXLIZ.LLILZ);
                    C786410Ut5.LJZ(8, c1592370rXXLIZ.LLILLL);
                    C786410Ut5.LJZ(8, c1592370rXXLIZ.LLILZ);
                }
            } else {
                View viewLIZ = c1395870mQb.LIZ(EnumC429500Gsm.LEFT, c050v2.LIZIZ, interfaceC1395860mQa);
                View viewLIZ2 = c1395870mQb.LIZ(EnumC429500Gsm.RIGHT, c050v2.LIZJ, interfaceC1395860mQa);
                C1592370rXX c1592370rXXLIZ2 = C1395900mQe.LIZ(c1395870mQb.LIZ);
                if (c1592370rXXLIZ2 != null) {
                    int iLJFF = C1395870mQb.LJFF(viewLIZ);
                    int iLJFF2 = C1395870mQb.LJFF(viewLIZ2);
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    c1592370rXXLIZ2.LIZLLL(iLJFF, iLIZIZ, iLIZIZ2, viewLIZ, true);
                    c1592370rXXLIZ2.LIZLLL(iLJFF2, iLIZIZ, iLIZIZ2, viewLIZ2, false);
                }
            }
        }
        return Unit.LIZ;
    }
}
