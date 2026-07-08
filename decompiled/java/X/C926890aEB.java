package X;

import android.app.Dialog;
import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aEB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C926890aEB extends C2217421BqW implements Function1<DialogInterface.OnDismissListener, Unit> {
    public C926890aEB(LiveDialog liveDialog) {
        super(1, liveDialog, LiveDialog.class, "setOnDismissListener", "setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DialogInterface.OnDismissListener onDismissListener) {
        ((Dialog) this.receiver).setOnDismissListener(onDismissListener);
        return Unit.LIZ;
    }
}
