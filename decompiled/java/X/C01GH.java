package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.billboard.broadcast.BillboardMultiDeleteConfirmSheetFragment;
import kotlin.jvm.functions.Function0;
import webcast.data.host_board.BoardInfo;
import webcast.data.host_board.HostBoard;

/* JADX INFO: renamed from: X.01GH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01GH {
    public static void LIZIZ(Context context, C2757014x c2757014x, final Function0 function0) {
        String str;
        final HostBoard hostBoard = c2757014x.LIZ;
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJIILL = false;
        if (c2757014x.LIZ.nonDeletable) {
            c782110Um9.LJII(2131852412);
            c782110Um9.LJIILIIL(2131852413, new InterfaceC743640TFa() { // from class: X.010A
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
        } else {
            BoardInfo boardInfo = hostBoard.boardInfo;
            String str2 = null;
            if (boardInfo != null) {
                str = boardInfo.boardDeleteTitle;
            } else {
                str = null;
            }
            c782110Um9.LIZJ = str;
            if (boardInfo != null) {
                str2 = boardInfo.boardDeleteSubtitle;
            }
            c782110Um9.LJIIIZ(str2);
            c782110Um9.LJIILIIL(2131851343, new InterfaceC743640TFa() { // from class: X.00zi
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).rN2(hostBoard.boardId, C011V.BROADCAST, 0L);
                    C784440Upu.LIZ().LIZIZ(new C260100zX(C1697810uHb.LJ(hostBoard)));
                    function0.invoke();
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIIJ(2131851342, new InterfaceC743640TFa() { // from class: X.01GK
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.cancel();
                }
            });
        }
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public static void LIZ(FragmentManager fragmentManager, C201600q6 c201600q6, C2757014x c2757014x, Function0 function0) {
        if (fragmentManager != null && !c201600q6.LIZ.isEmpty()) {
            C19322110iZ.LJFF(fragmentManager, new BillboardMultiDeleteConfirmSheetFragment(c2757014x, c201600q6.LIZ, function0), "Billboard_MultiDelete", null, 0);
        } else {
            function0.invoke();
        }
    }
}
