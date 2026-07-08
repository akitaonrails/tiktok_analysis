package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLivePreviewSettingDialogNew;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JaC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494420JaC extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ SubOnlyLivePreviewSettingDialogNew LL;
    public final /* synthetic */ Room LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494420JaC(SubOnlyLivePreviewSettingDialogNew subOnlyLivePreviewSettingDialogNew, Room room) {
        super(1);
        this.LL = subOnlyLivePreviewSettingDialogNew;
        this.LLILLJJLI = room;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        SubOnlyLivePreviewSettingDialogNew subOnlyLivePreviewSettingDialogNew = this.LL;
        c062p.LIZ = new C494430JaD(this.LLILLJJLI, subOnlyLivePreviewSettingDialogNew.dataChannel, subOnlyLivePreviewSettingDialogNew.LL);
        return Unit.LIZ;
    }
}
