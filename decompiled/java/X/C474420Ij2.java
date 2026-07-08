package X;

import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ij2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474420Ij2 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubOnlyLiveSettingFragment LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C474420Ij2(SubOnlyLiveSettingFragment subOnlyLiveSettingFragment, String str) {
        super(0);
        this.LL = subOnlyLiveSettingFragment;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LL.getContext(), this.LLILLJJLI);
        C0KPJ.Xe.LIZJ(Boolean.TRUE);
        return Unit.LIZ;
    }
}
