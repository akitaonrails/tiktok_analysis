package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingDialogNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494030JYz extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ SubOnlyLiveSettingDialogNew LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494030JYz(SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew) {
        super(1);
        this.LL = subOnlyLiveSettingDialogNew;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew = this.LL;
        c062p.LIZ = new C0JZH(subOnlyLiveSettingDialogNew.LLJJJIL, subOnlyLiveSettingDialogNew.dataChannel, subOnlyLiveSettingDialogNew.LLJJJJ);
        return Unit.LIZ;
    }
}
