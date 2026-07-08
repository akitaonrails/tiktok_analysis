package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.app.PushCameraBlurActivity;
import com.ss.android.ugc.aweme.favorites.business.comment.CommentCollectViewHolder;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListCell;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.list.RepostNormalCell;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0maR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class DialogInterfaceOnCancelListenerC1401970maR implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
            case 2:
                onCancel$2(this, dialogInterface);
                break;
            case 3:
                onCancel$3(this, dialogInterface);
                break;
            case 4:
                onCancel$4(this, dialogInterface);
                break;
            case 5:
                onCancel$5(this, dialogInterface);
                break;
            case 6:
                onCancel$6(this, dialogInterface);
                break;
            case 7:
                onCancel$7(this, dialogInterface);
                break;
            case 8:
                onCancel$8(this, dialogInterface);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onCancel$9(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnCancelListenerC1401970maR(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC1401970maR dialogInterfaceOnCancelListenerC1401970maR, DialogInterface dialogInterface) {
        Runnable runnable = ((C1372310lob) dialogInterfaceOnCancelListenerC1401970maR.l0).LJII;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC1401970maR dialogInterfaceOnCancelListenerC1401970maR, DialogInterface dialogInterface) {
        Runnable runnable = ((C1372310lob) dialogInterfaceOnCancelListenerC1401970maR.l0).LJII;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC1401970maR dialogInterfaceOnCancelListenerC1401970maR, DialogInterface dialogInterface) {
        C12QB c12qb = (C12QB) dialogInterfaceOnCancelListenerC1401970maR.l0;
        if (c12qb != null) {
            c12qb.LIZ();
        }
    }

    public static final void onCancel$3(DialogInterfaceOnCancelListenerC1401970maR dialogInterfaceOnCancelListenerC1401970maR, DialogInterface dialogInterface) {
        ((PushCameraBlurActivity) dialogInterfaceOnCancelListenerC1401970maR.l0).finish();
    }

    public static final void onCancel$4(DialogInterfaceOnCancelListenerC1401970maR dialogInterfaceOnCancelListenerC1401970maR, DialogInterface dialogInterface) {
        InterfaceC1346260l8a interfaceC1346260l8a = ((CommentCollectViewHolder) dialogInterfaceOnCancelListenerC1401970maR.l0).mCommentActionSheetClickListener;
        if (interfaceC1346260l8a != null) {
            interfaceC1346260l8a.onCancel();
        }
    }

    public static final void onCancel$5(DialogInterfaceOnCancelListenerC1401970maR dialogInterfaceOnCancelListenerC1401970maR, DialogInterface dialogInterface) {
        ((UpvotePanelListCell) dialogInterfaceOnCancelListenerC1401970maR.l0).v6("click_cancel");
    }

    public static final void onCancel$6(DialogInterfaceOnCancelListenerC1401970maR dialogInterfaceOnCancelListenerC1401970maR, DialogInterface dialogInterface) {
        ((RepostNormalCell) dialogInterfaceOnCancelListenerC1401970maR.l0).e6("click", "cancel");
    }

    public static final void onCancel$7(DialogInterfaceOnCancelListenerC1401970maR dialogInterfaceOnCancelListenerC1401970maR, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnCancelListenerC1401970maR.l0).invoke();
    }

    public static final void onCancel$8(DialogInterfaceOnCancelListenerC1401970maR dialogInterfaceOnCancelListenerC1401970maR, DialogInterface dialogInterface) {
        ((InterfaceC1346260l8a) dialogInterfaceOnCancelListenerC1401970maR.l0).onCancel();
    }

    public static final void onCancel$9(DialogInterfaceOnCancelListenerC1401970maR dialogInterfaceOnCancelListenerC1401970maR, DialogInterface dialogInterface) {
        AbstractDialogInterfaceC1397690mTX abstractDialogInterfaceC1397690mTX = (AbstractDialogInterfaceC1397690mTX) dialogInterfaceOnCancelListenerC1401970maR.l0;
        DialogInterface.OnCancelListener onCancelListener = abstractDialogInterfaceC1397690mTX.LLILZIL;
        if (onCancelListener != null) {
            onCancelListener.onCancel(abstractDialogInterfaceC1397690mTX);
        }
    }
}
