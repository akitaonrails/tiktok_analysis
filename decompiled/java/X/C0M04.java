package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftOperationInfo;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M04, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$queryDraftMemorySize$2", f = "DraftViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0M04 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Long>, Object> {
    public final /* synthetic */ DraftViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M04(DraftViewModel draftViewModel, InterfaceC1364105Vn<? super C0M04> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M04(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftViewModel@38a5.queryDraftMemorySize$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Iterator it2 = ((ArrayList) C0M4A.LJ(new C0M4E(C0M4D.LJ(), null, null, true, this.LL.BQ2(), null, null, null, false, null, 998), null)).iterator();
        long j = 0;
        while (it2.hasNext()) {
            DraftOperationInfo draftOperationInfo = C562270M3l.LIZ((AwemeDraft) it2.next()).draftOperationInfo;
            if (draftOperationInfo.isNeedShow) {
                j += draftOperationInfo.freeUpSpace;
            }
        }
        Long lLJFF = C2286608xc.LJFF(j);
        C1C7U.LIZIZ("DraftViewModel@38a5.queryDraftMemorySize$2");
        return lLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Long> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
