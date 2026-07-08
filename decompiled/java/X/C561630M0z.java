package X;

import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0M0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$initObserver$5$1$1", f = "DraftBoxFragment.kt", l = {}, m = "invokeSuspend")
public final class C561630M0z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0M0P LL;
    public final /* synthetic */ DraftBoxFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561630M0z(C0M0P c0m0p, DraftBoxFragment draftBoxFragment, InterfaceC1364105Vn<? super C561630M0z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0m0p;
        this.LLILLJJLI = draftBoxFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561630M0z(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C561880M1y c561880M1y;
        C0M22 c0m22;
        C561900M2a c561900M2a;
        List<C561950M2f> list;
        C0M24 c561880M1y2;
        C1C7U.LIZ("DraftBoxFragment@80e.initObserver$5$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL != null) {
            C561900M2a c561900M2aVR = this.LLILLJJLI.VR();
            C0M0P c0m0p = this.LL;
            Iterator it2 = ((ArrayList) c561900M2aVR.LLILLJJLI).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                C561950M2f c561950M2f = (C561950M2f) next;
                if ((c561950M2f instanceof C0M0P) && Intrinsics.LJFF(((C0M0P) c561950M2f).LJ, c0m0p.LJ)) {
                    if (next == null || ((ArrayList) c561900M2aVR.LLILLJJLI).indexOf(next) < 0) {
                        break;
                    }
                    this.LLILLJJLI.ZR().LIZLLL(this.LL);
                    this.LLILLJJLI.dS().vQ2().Aw(this.LL);
                }
            }
            C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftBoxFragment", "clear filter");
            DraftBoxFragment draftBoxFragment = this.LLILLJJLI;
            draftBoxFragment.iS();
            C0M14 c0m14 = draftBoxFragment.LLLFF;
            if (c0m14 != null) {
                C0M17 c0m17 = c0m14.LIZJ;
                if (c0m17 != null) {
                    c0m17.LIZ();
                }
                C0M1W.LIZ(C2097608Jq.LJ());
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 1, "draft_box_reload_data_after_update", true) > 0) {
                draftBoxFragment.mS(C2097608Jq.LJ());
            }
            C0M26 c0m26 = this.LLILLJJLI.LLLII;
            if (c0m26 != null) {
                C0M24 c0m24LJIIIIZZ = c0m26.LJIIIIZZ();
                if ((c0m24LJIIIIZZ instanceof C561880M1y) && (c561880M1y = (C561880M1y) c0m24LJIIIIZZ) != null && (c0m22 = c0m26.LIZ) != null && (c561900M2a = c0m26.LJIIJJI) != null && (list = c561900M2a.LLILLJJLI) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (ArrayList) list) {
                        if (obj2 instanceof C0M0P) {
                            arrayList.add(obj2);
                        }
                    }
                    List listLJIILL = C0M26.LJIILL(arrayList, c561880M1y.LIZIZ, c0m22);
                    C0MAY c0may = C0MAY.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onDraftUpdated: rebucket sections=");
                    sbLIZ.append(listLJIILL.size());
                    sbLIZ.append(", mode=");
                    sbLIZ.append(c561880M1y.LIZIZ);
                    C201955140j.LIZLLL(c0may, "DraftBoxOrganizer", C2188811AlT.LIZIZ(sbLIZ));
                    if (listLJIILL.isEmpty()) {
                        c561880M1y2 = C0M23.LIZ;
                    } else {
                        c561880M1y2 = new C561880M1y(listLJIILL, c561880M1y.LIZIZ);
                    }
                    c0m26.LJIILLIIL(c561880M1y2);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.initObserver$5$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
