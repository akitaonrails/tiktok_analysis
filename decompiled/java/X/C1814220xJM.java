package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.LiveBoardUpsertViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.SaveAssem;
import com.bytedance.android.livesdk.model.Board;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xJM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814220xJM extends C09AY implements Function1<Bitmap, Unit> {
    public final /* synthetic */ SaveAssem LL;
    public final /* synthetic */ Board LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814220xJM(SaveAssem saveAssem, Board board) {
        super(1);
        this.LL = saveAssem;
        this.LLILLJJLI = board;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        Board boardLIZ;
        String str;
        Bitmap bitmap2 = bitmap;
        SaveAssem saveAssem = this.LL;
        Board board = this.LLILLJJLI;
        Context context = saveAssem.LJJIJL().getContext();
        if (context != null && board != null && (boardLIZ = C125800ds.LIZ(board)) != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_board_set_save_click");
            C291301Ax c291301AxHo = saveAssem.Ho();
            if (c291301AxHo != null) {
                str = c291301AxHo.LL;
            } else {
                str = null;
            }
            c474500IjALIZ.LJJII(str, "board_entrance");
            saveAssem.LLJIJIL = c474500IjALIZ;
            LiveBoardUpsertViewModel.vQ2(saveAssem.Go(), context, boardLIZ, bitmap2);
        }
        return Unit.LIZ;
    }
}
