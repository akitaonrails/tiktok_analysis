package X;

import androidx.fragment.app.DialogFragment;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModerateDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C748470TXp extends C2217421BqW implements Function1<EnumC748580TYa, Unit> {
    public C748470TXp(Object obj) {
        super(1, obj, ModeratorHostIModerateDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC748580TYa enumC748580TYa) {
        DialogFragment dialogFragment = (DialogFragment) this.receiver;
        dialogFragment.getClass();
        if (enumC748580TYa == EnumC748580TYa.DISMISS) {
            dialogFragment.dismiss();
        }
        return Unit.LIZ;
    }
}
