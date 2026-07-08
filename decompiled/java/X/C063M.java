package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.SettingsRvmpComposeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS17S0010000_2;
import kotlin.jvm.internal.AwS53S1000000_2;

/* JADX INFO: renamed from: X.063M, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C063M extends C2217421BqW implements Function1<C063K, Unit> {
    public C063M(Object obj) {
        super(1, obj, SettingsRvmpComposeViewModel.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/SettingsEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C063K c063k) {
        C063K c063k2 = c063k;
        AssemViewModel assemViewModel = (AssemViewModel) this.receiver;
        assemViewModel.getClass();
        if (c063k2 instanceof C063L) {
            assemViewModel.setState(new AwS17S0010000_2(((C063L) c063k2).LIZ, 15));
        } else if (c063k2 instanceof C063G) {
            assemViewModel.setState(new AwS53S1000000_2(((C063G) c063k2).LIZ, 16));
        } else if (c063k2 instanceof C063J) {
            assemViewModel.setState(new AwS53S1000000_2(((C063J) c063k2).LIZ, 15));
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }
}
