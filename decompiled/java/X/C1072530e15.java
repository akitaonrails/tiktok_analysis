package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0e15, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1072530e15 extends C2217421BqW implements Function1<Function1<? super InterfaceC497601wk, ? extends Unit>, Unit> {
    public C1072530e15(UserCardListViewModel userCardListViewModel) {
        super(1, userCardListViewModel, UserCardListViewModel.class, "runOnWorkThread", "runOnWorkThread(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function1<? super InterfaceC497601wk, ? extends Unit> function1) {
        ((AssemViewModel) this.receiver).runOnWorkThread(function1);
        return Unit.LIZ;
    }
}
