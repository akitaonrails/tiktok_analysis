package X;

import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lzk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$initLoadMore$2$3", f = "DraftBoxFragment.kt", l = {}, m = "invokeSuspend")
public final class C561220Lzk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DraftBoxFragment LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561220Lzk(DraftBoxFragment draftBoxFragment, int i, InterfaceC1364105Vn<? super C561220Lzk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftBoxFragment;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561220Lzk(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxFragment@80e.initLoadMore$2$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.dS().LLJILJIL.setValue(false);
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load more failed, pageSize = ");
        sbLIZ.append(this.LLILLJJLI);
        C201955140j.LIZLLL(c0may, "DraftBoxFragment", C2188811AlT.LIZIZ(sbLIZ));
        C561900M2a c561900M2aVR = this.LL.VR();
        C0M0T c0m0t = c561900M2aVR.LLIZ;
        if (c0m0t != null) {
            c0m0t.LJ = 1;
        }
        ArrayList arrayList = (ArrayList) c561900M2aVR.LLILLJJLI;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            if (((C561950M2f) objPrevious).LIZ() == 108) {
                if (objPrevious != null) {
                    c561900M2aVR.notifyItemChanged(((ArrayList) c561900M2aVR.LLILLJJLI).indexOf(objPrevious));
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.initLoadMore$2$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
