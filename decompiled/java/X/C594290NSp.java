package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.pages.middlepage.historytag.viewmodel.SearchHistoryIconManagerVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NSp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.middlepage.historytag.viewmodel.SearchHistoryIconManagerVM$tryFetchHistoryExtraListData$1", f = "SearchHistoryIconManagerVM.kt", l = {106}, m = "invokeSuspend")
public final class C594290NSp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ SearchHistoryIconManagerVM LLILLL;
    public final /* synthetic */ List<SearchHistory> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C594290NSp(SearchHistoryIconManagerVM searchHistoryIconManagerVM, List<? extends SearchHistory> list, InterfaceC1364105Vn<? super C594290NSp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = searchHistoryIconManagerVM;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594290NSp(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("SearchHistoryIconManagerVM@b440.tryFetchHistoryExtraListData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    Object obj3 = this.LL;
                    C155000ia.LIZIZ(obj);
                    obj2 = obj3;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                ArrayList arrayList = new ArrayList();
                C1DFB c1dfb = C0PEM.LIZJ;
                C668110QIn c668110QIn = new C668110QIn(this.LLILZ, arrayList, null);
                this.LL = arrayList;
                this.LLILLJJLI = 1;
                obj2 = arrayList;
                if (C23250099c.LJI(this, c1dfb, c668110QIn) == objLJFF) {
                    C1C7U.LIZIZ("SearchHistoryIconManagerVM@b440.tryFetchHistoryExtraListData$1");
                    return objLJFF;
                }
            }
            this.LLILLL.LL.setValue(obj2);
            this.LLILLL.LLILZ = false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SearchHistoryIconManagerVM searchHistoryIconManagerVM = this.LLILLL;
            searchHistoryIconManagerVM.LLILZ = false;
            searchHistoryIconManagerVM.LL.setValue(null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchHistoryIconManagerVM@b440.tryFetchHistoryExtraListData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
