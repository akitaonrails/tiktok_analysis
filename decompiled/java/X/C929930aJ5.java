package X;

import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aJ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C929930aJ5 extends C2217421BqW implements Function0<Unit> {
    public C929930aJ5(Object obj) {
        super(0, obj, MultiGuestV3GuestBeInvitedDialog.class, "dismiss", "dismiss()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((DialogFragment) this.receiver).dismiss();
        return Unit.LIZ;
    }
}
