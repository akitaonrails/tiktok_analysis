package X;

import com.bytedance.ext_power_list.AssemSingleListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [S] */
/* JADX INFO: renamed from: X.15jN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20601115jN<S> extends C09AY implements Function1<S, Unit> {
    public final /* synthetic */ AssemSingleListViewModel<ITEM, S, Cursor> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20601115jN(AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel, int i, int i2) {
        super(1);
        this.LL = assemSingleListViewModel;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        this.LL.modifyListState((InterfaceC636270OxV) obj, new C1214360hhq(this.LLILLJJLI, this.LLILLL));
        return Unit.LIZ;
    }
}
