package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLivePreviewSettingDialogVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JaM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494520JaM extends C09AY implements Function1<C494590JaT, Unit> {
    public final /* synthetic */ SubOnlyLivePreviewSettingDialogVM LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494520JaM(SubOnlyLivePreviewSettingDialogVM subOnlyLivePreviewSettingDialogVM, boolean z, Context context, boolean z2) {
        super(1);
        this.LL = subOnlyLivePreviewSettingDialogVM;
        this.LLILLJJLI = z;
        this.LLILLL = context;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C494590JaT c494590JaT) {
        C500260Jjc.LJJLIIIJJIZ(new C494450JaF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ));
        return Unit.LIZ;
    }
}
