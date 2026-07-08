package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.LiveBoardUpsertViewModel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.LiveBoardUpsertViewModel$upsertReally$3$4$1", f = "LiveBoardUpsertViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1813910xIr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Throwable LL;
    public final /* synthetic */ LiveBoardUpsertViewModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Board LLILZ;
    public final /* synthetic */ Bitmap LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813910xIr(Throwable th, LiveBoardUpsertViewModel liveBoardUpsertViewModel, Context context, Board board, Bitmap bitmap, InterfaceC1364105Vn<? super C1813910xIr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = th;
        this.LLILLJJLI = liveBoardUpsertViewModel;
        this.LLILLL = context;
        this.LLILZ = board;
        this.LLILZIL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1813910xIr(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBoardUpsertViewModel@44af.upsertReally$3$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = this.LL;
        if (th instanceof C501470JlZ) {
            if (((C501520Jle) th).getErrorCode() == 4033144) {
                final LiveBoardUpsertViewModel liveBoardUpsertViewModel = this.LLILLJJLI;
                final Context context = this.LLILLL;
                final Board board = this.LLILZ;
                final Bitmap bitmap = this.LLILZIL;
                liveBoardUpsertViewModel.getClass();
                C782110Um9 c782110Um9 = new C782110Um9(context, C011Z.LIZ.LJIIIZ());
                c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131851492));
                c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131851491), new InterfaceC743640TFa() { // from class: X.0xIs
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        LiveBoardUpsertViewModel.vQ2(liveBoardUpsertViewModel, context, board, bitmap);
                        liveDialog.dismiss();
                    }
                });
                c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131851489), new InterfaceC743640TFa() { // from class: X.0xIq
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        liveBoardUpsertViewModel.qD1(false);
                        liveDialog.dismiss();
                    }
                });
                c782110Um9.LJIIZILJ = new DialogInterface.OnShowListener() { // from class: X.011K
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_disclose_live_as_speonsored_content_popup");
                        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                        c474500IjALIZ.LJJII("show", "action_type");
                        c474500IjALIZ.LIZ();
                    }
                };
                c782110Um9.LJIILL = false;
                c782110Um9.LJIJ = new DialogInterface.OnDismissListener() { // from class: X.0xIt
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                    }
                };
                C786410Ut5.E4(c782110Um9.LIZ());
            } else {
                this.LLILLJJLI.setState(new C1814060xJ6(this.LL));
            }
        } else {
            this.LLILLJJLI.setState(new C1814070xJ7(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBoardUpsertViewModel@44af.upsertReally$3$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
