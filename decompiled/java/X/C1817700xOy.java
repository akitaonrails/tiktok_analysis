package X;

import android.app.Dialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.FullyCustomizedBoardItemEditContainerDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817700xOy extends C09AY implements Function2<C03H5, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ FullyCustomizedBoardItemEditContainerDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817700xOy(FullyCustomizedBoardItemEditContainerDialog fullyCustomizedBoardItemEditContainerDialog) {
        super(2);
        this.LL = fullyCustomizedBoardItemEditContainerDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends Boolean> c291001Au) {
        Boolean boolLIZ = c291001Au.LIZ();
        if (boolLIZ != null) {
            FullyCustomizedBoardItemEditContainerDialog fullyCustomizedBoardItemEditContainerDialog = this.LL;
            boolean zBooleanValue = boolLIZ.booleanValue();
            FullyCustomizedBoardItemEditContainerDialog fullyCustomizedBoardItemEditContainerDialog2 = fullyCustomizedBoardItemEditContainerDialog.LL;
            if (zBooleanValue) {
                C500260Jjc.LJJLIIIJLLLLLLLZ((Dialog) fullyCustomizedBoardItemEditContainerDialog2.LLJILLL.getValue());
            } else {
                C500260Jjc.LJJLIIIJL((Dialog) fullyCustomizedBoardItemEditContainerDialog2.LLJILLL.getValue());
            }
        }
        return Unit.LIZ;
    }
}
