package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursInviteFriendsFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0De0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C343900De0 extends C2217421BqW implements Function2<List<? extends UserInvitee>, InterfaceC1364105Vn<? super Unit>, Object>, InterfaceC842703Qz {
    public C343900De0(AddYoursInviteFriendsFragment addYoursInviteFriendsFragment) {
        super(2, addYoursInviteFriendsFragment, AddYoursInviteFriendsFragment.class, "onInviteBtnClicked", "onInviteBtnClicked(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends UserInvitee> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((AddYoursInviteFriendsFragment) this.receiver).VR(list, interfaceC1364105Vn);
    }
}
