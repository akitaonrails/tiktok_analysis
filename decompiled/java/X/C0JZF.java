package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JZF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JZF extends C09AY implements Function1<C410401ig, Unit> {
    public final /* synthetic */ SubOnlyLiveSettingDialogVM LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JZF(SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM, Context context, boolean z) {
        super(1);
        this.LL = subOnlyLiveSettingDialogVM;
        this.LLILLJJLI = context;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C410401ig c410401ig) {
        SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM = this.LL;
        subOnlyLiveSettingDialogVM.runOnUIThread(new C0JZM(subOnlyLiveSettingDialogVM, c410401ig, this.LLILLJJLI, this.LLILLL));
        return Unit.LIZ;
    }
}
