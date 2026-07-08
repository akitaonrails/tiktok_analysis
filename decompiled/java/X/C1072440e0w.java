package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS33S0001000_19;

/* JADX INFO: renamed from: X.0e0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1072440e0w extends C2217421BqW implements Function1<Integer, Unit> {
    public C1072440e0w(UserCardListViewModel userCardListViewModel) {
        super(1, userCardListViewModel, UserCardListViewModel.class, "toastMessage", "toastMessage(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        AssemViewModel assemViewModel = (AssemViewModel) this.receiver;
        assemViewModel.getClass();
        assemViewModel.setState(new AwS33S0001000_19(iIntValue, 0));
        return Unit.LIZ;
    }
}
