package X;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.guest.MultiLiveGuestUserInfoDialog;
import com.bytedance.android.livesdk.LiveDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aEH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C926950aEH extends C2217421BqW implements Function1<DialogInterface.OnDismissListener, Unit> {
    public C926950aEH(MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog) {
        super(1, multiLiveGuestUserInfoDialog, MultiLiveGuestUserInfoDialog.class, "setOnDismissListener", "setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DialogInterface.OnDismissListener onDismissListener) {
        ((LiveDialogFragment) this.receiver).setOnDismissListener(onDismissListener);
        return Unit.LIZ;
    }
}
