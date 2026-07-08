package X;

import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;

/* JADX INFO: renamed from: X.0aOH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933150aOH extends C933130aOF {
    public C933150aOH(C933100aOC c933100aOC) {
        super(c933100aOC);
        if (this.LIZJ == null) {
            this.LIZJ = new InterfaceC933880aPS() { // from class: X.0aOI
                @Override // X.InterfaceC933880aPS
                public final void LIZ(LiveActionSheetDialog liveActionSheetDialog) {
                    liveActionSheetDialog.cancel();
                }
            };
        }
    }
}
