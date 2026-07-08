package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyTrialLiveSwitchChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01ic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C410001ic extends C09AY implements Function1<C410401ig, Unit> {
    public final /* synthetic */ SubOnlyLiveSettingDialogVM LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ DataChannel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C410001ic(SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM, int i, long j, DataChannel dataChannel) {
        super(1);
        this.LL = subOnlyLiveSettingDialogVM;
        this.LLILLJJLI = i;
        this.LLILLL = j;
        this.LLILZ = dataChannel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C410401ig c410401ig) {
        C410401ig c410401ig2 = c410401ig;
        boolean z = c410401ig2.LLILLJJLI;
        C291001Au<Boolean> c291001Au = c410401ig2.LLILLL;
        Boolean bool = (Boolean) DataChannelGlobal.LLILZ.gg0(PreviewSubOnlyTrialLiveSwitchChannel.class);
        Room room = this.LL.vQ2().LLILLJJLI;
        if (room != null) {
            SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM = this.LL;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(subOnlyLiveSettingDialogVM), null, null, new C409201iU(bool, z, c291001Au, room, this.LLILLJJLI, this.LLILLL, subOnlyLiveSettingDialogVM, this.LLILZ, null), 3);
        }
        return Unit.LIZ;
    }
}
