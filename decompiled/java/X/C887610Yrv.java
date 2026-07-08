package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.ArchivePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0Yrv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C887610Yrv extends C2217421BqW implements Function1<InterfaceC887660Ys0<?>, Unit> {
    public C887610Yrv(ArchivePageViewModel archivePageViewModel) {
        super(1, archivePageViewModel, ArchivePageViewModel.class, "changeSelectStatusForItem", "changeSelectStatusForItem(Lcom/ss/android/ugc/aweme/inbox/widget/v2/rule/IInboxMultiSelectRule;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
        AssemViewModel assemViewModel = (AssemViewModel) this.receiver;
        assemViewModel.getClass();
        assemViewModel.setState(new AwS593S0100000_14(interfaceC887660Ys0, (InterfaceC887660Ys0<?>) 367));
        return Unit.LIZ;
    }
}
