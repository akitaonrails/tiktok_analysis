package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0TMO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TMO extends C09AY implements Function2<DataChannel, String, Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TMO(String str) {
        super(2);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(DataChannel dataChannel, String str) {
        DataChannel dataChannel2 = dataChannel;
        FragmentManager fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class);
        if (fragmentManager != null) {
            C0TND.LIZ(LiveBoardsPageDialogFragment.LLJILJILJ, this.LL, String.valueOf(C500260Jjc.LJJLIIIJ(dataChannel2)), dataChannel2, new Bundle(), null, 16).show(fragmentManager, "LiveBoardsPageDialogFragment");
        }
        return Unit.LIZ;
    }
}
