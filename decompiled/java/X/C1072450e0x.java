package X;

import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0e0x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1072450e0x extends C2217421BqW implements Function0<Unit> {
    public C1072450e0x(UserCardListViewModel userCardListViewModel) {
        super(0, userCardListViewModel, UserCardListViewModel.class, "reset", "reset()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((UserCardListViewModel) this.receiver).reset();
        return Unit.LIZ;
    }
}
