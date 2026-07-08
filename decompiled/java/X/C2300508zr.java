package X;

import Y.AfS172S0100000_3;
import Y.AkS321S0200000_3;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08zr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2300508zr extends C09AY implements Function0<Unit> {
    public final /* synthetic */ NoticeVideoManager.InnerManager LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2300508zr(NoticeVideoManager.InnerManager innerManager) {
        super(0);
        this.LL = innerManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL.LJIIJ().isEmpty()) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("NoticeVideoManager", "requestData but aid list empty");
        } else {
            ArrayList arrayList = new ArrayList(this.LL.LJIIJ());
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.LL.LJIIJ().clear();
            ((CopyOnWriteArraySet) this.LL.LLIZLLLIL.getValue()).addAll(arrayList);
            ArrayList arrayList3 = new ArrayList();
            while (!arrayList.isEmpty()) {
                List listLLIIII = arrayList.size() >= 10 ? C13LP.LLIIII(arrayList.subList(0, 10)) : C13LP.LLIIII(arrayList);
                arrayList.removeAll(listLLIIII);
                this.LL.getClass();
                arrayList3.add(C11NZ.LJIJJLI(new C2502409rK(listLLIIII, 1)).LJL(C11S5.LIZ()).LJJJJZI(new AkS321S0200000_3(this.LL, listLLIIII, 1)));
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestData, aids:");
            sbLIZ.append(arrayList2);
            sbLIZ.append(", requests:");
            sbLIZ.append(arrayList3.size());
            C1720106oR.LJI("NoticeVideoManager", C2188811AlT.LIZIZ(sbLIZ));
            C19476611Hw c19476611HwLJL = C11NZ.LJIIZILJ(arrayList3).LJL(C11S5.LIZ());
            final NoticeVideoManager.InnerManager innerManager = this.LL;
            c19476611HwLJL.LJJZ(new AfS172S0100000_3(innerManager, 13), new C09JN() { // from class: X.07xD
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("NoticeVideoManager$InnerManager@6dab.requestData$1$3");
                    int i3 = C2187451AjH.LIZ;
                    C1720106oR.LIZIZ("NoticeVideoManager", "requestData un-expected error", (Throwable) obj);
                    C1C7U.LIZIZ("NoticeVideoManager$InnerManager@6dab.requestData$1$3");
                }
            }, new InterfaceC781210Ukh() { // from class: X.08zs
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("requestData finished, ");
                    sbLIZ2.append(innerManager.LJIIJ().size());
                    sbLIZ2.append(", ");
                    sbLIZ2.append(((CopyOnWriteArraySet) innerManager.LLIZLLLIL.getValue()).size());
                    sbLIZ2.append(", ");
                    sbLIZ2.append(innerManager.LJII().size());
                    sbLIZ2.append(", ");
                    sbLIZ2.append(innerManager.LJIIIIZZ().size());
                    C1720106oR.LJI("NoticeVideoManager", C2188811AlT.LIZIZ(sbLIZ2));
                }
            });
        }
        return Unit.LIZ;
    }
}
