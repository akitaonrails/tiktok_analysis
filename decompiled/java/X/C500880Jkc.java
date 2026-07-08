package X;

import com.bytedance.android.livesdk.game.broadcast.dialog.GameMessageAlertDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jkc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C500880Jkc extends C2217421BqW implements Function0<Unit> {
    public C500880Jkc(Object obj) {
        super(0, obj, GameMessageAlertDialog.class, "showRequestOverlayPermissionDialog", "showRequestOverlayPermissionDialog()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((GameMessageAlertDialog) this.receiver).MR();
        return Unit.LIZ;
    }
}
