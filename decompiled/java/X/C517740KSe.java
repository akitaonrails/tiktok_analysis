package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxDialog;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KSe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517740KSe extends C09AY implements Function0<Unit> {
    public final /* synthetic */ FansClubViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C517740KSe(FansClubViewModel fansClubViewModel, String str, String str2) {
        super(0);
        this.LL = fansClubViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.LL.getDataChannel();
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            TreasureBoxDialog treasureBoxDialog = new TreasureBoxDialog();
            treasureBoxDialog.LLJLLL = str;
            treasureBoxDialog.LLJZ = str2;
            C19322110iZ.LJFF(fragmentManager, treasureBoxDialog, "super_fan_treasure_box_dialog", null, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)));
        }
        return Unit.LIZ;
    }
}
