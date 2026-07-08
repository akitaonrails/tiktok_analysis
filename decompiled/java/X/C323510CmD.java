package X;

import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.AwemeStatusViewModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CmD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.AwemeStatusViewModel$1", f = "AwemeStatusViewModel.kt", l = {}, m = "invokeSuspend")
public final class C323510CmD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AwemeStatusViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323510CmD(AwemeStatusViewModel awemeStatusViewModel, InterfaceC1364105Vn<? super C323510CmD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = awemeStatusViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323510CmD(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwemeStatusViewModel@fcd9.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AwemeStatusViewModel awemeStatusViewModel = this.LL;
        EventLiveData<FollowStatus> eventLiveData = awemeStatusViewModel.LLILZLL;
        if (eventLiveData != null) {
            eventLiveData.observeForever(awemeStatusViewModel.LLIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeStatusViewModel@fcd9.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
