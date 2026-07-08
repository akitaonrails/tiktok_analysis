package X;

import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ei8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftAlgorithmModelRestoreHandler$restoreWithNet$2", f = "DraftAlgorithmModelRestoreHandler.kt", l = {109}, m = "invokeSuspend")
public final class C371940Ei8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DraftFileRestoreResult>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C371970EiB LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C371940Ei8(C371970EiB c371970EiB, InterfaceC1364105Vn<? super C371940Ei8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c371970EiB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C371940Ei8 c371940Ei8 = new C371940Ei8(this.LLILLL, interfaceC1364105Vn);
        c371940Ei8.LLILLJJLI = obj;
        return c371940Ei8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftAlgorithmModelRestoreHandler@5648.restoreWithNet$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            this.LLILLL.getClass();
            sbLIZ.append("DraftAlgorithmModelRestoreHandler");
            sbLIZ.append(" ; restore start ...");
            C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C0CHQ.LIZ().initDownloadableModel();
            ArrayList arrayList = new ArrayList();
            if (!((ArrayList) this.LLILLL.LIZJ).isEmpty()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C371930Ei7(this.LLILLL, null), 3));
            }
            if (!((ArrayList) this.LLILLL.LIZLLL).isEmpty()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C371920Ei6(this.LLILLL, null), 3));
            }
            if (!this.LLILLL.LJ.getFirst().isEmpty()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C371950Ei9(this.LLILLL, null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DraftAlgorithmModelRestoreHandler@5648.restoreWithNet$2");
                return objLJFF;
            }
        }
        C371970EiB c371970EiB = this.LLILLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        c371970EiB.getClass();
        sbLIZ2.append("DraftAlgorithmModelRestoreHandler");
        sbLIZ2.append(" ; restore success ...");
        C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        C1C7U.LIZIZ("DraftAlgorithmModelRestoreHandler@5648.restoreWithNet$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DraftFileRestoreResult>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
