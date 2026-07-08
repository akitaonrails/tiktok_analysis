package X;

import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.EnableDoneEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.FullyCustomizedBoardItemEditContainerDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817710xOz extends C09AY implements Function2<C03H5, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ FullyCustomizedBoardItemEditContainerDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817710xOz(FullyCustomizedBoardItemEditContainerDialog fullyCustomizedBoardItemEditContainerDialog) {
        super(2);
        this.LL = fullyCustomizedBoardItemEditContainerDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends Boolean> c291001Au) {
        T t = c291001Au.LIZ;
        FullyCustomizedBoardItemEditContainerDialog fullyCustomizedBoardItemEditContainerDialog = this.LL;
        boolean zBooleanValue = ((Boolean) t).booleanValue();
        DataChannel dataChannel = fullyCustomizedBoardItemEditContainerDialog.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(EnableDoneEvent.class, Boolean.valueOf(zBooleanValue));
        }
        return Unit.LIZ;
    }
}
