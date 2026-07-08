package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheetViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheetViewModel$remoteFetchCallback$1$onQueryResult$1", f = "IMReactionListSheetViewModel.kt", l = {59}, m = "invokeSuspend")
public final class C315660CYy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMReactionListSheetViewModel LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ IMUser LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315660CYy(IMReactionListSheetViewModel iMReactionListSheetViewModel, Integer num, IMUser iMUser, InterfaceC1364105Vn<? super C315660CYy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMReactionListSheetViewModel;
        this.LLILLL = num;
        this.LLILZ = iMUser;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315660CYy(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMReactionListSheetViewModel@12da.remoteFetchCallback$1$onQueryResult$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLJI;
            Pair pair = new Pair(this.LLILLL, this.LLILZ);
            this.LL = 1;
            if (c2252331DDr.emit(pair, this) == objLJFF) {
                C1C7U.LIZIZ("IMReactionListSheetViewModel@12da.remoteFetchCallback$1$onQueryResult$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMReactionListSheetViewModel@12da.remoteFetchCallback$1$onQueryResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
