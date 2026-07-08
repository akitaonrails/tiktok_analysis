package X;

import android.app.Dialog;

/* JADX INFO: renamed from: X.0Xhd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855750Xhd implements InterfaceC855760Xhe {
    public final /* synthetic */ Dialog LIZ;
    public final /* synthetic */ InterfaceC855760Xhe LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.InterfaceC855760Xhe
    public final void LIZ() {
        C786410Ut5.LIZIZ(this.LIZ);
        this.LIZIZ.LIZ();
        C855740Xhc.LIZ(this.LIZJ, "cancel");
    }

    @Override // X.InterfaceC855760Xhe
    public final void LIZIZ() {
        C786410Ut5.LIZIZ(this.LIZ);
        this.LIZIZ.LIZIZ();
        C855740Xhc.LIZ(this.LIZJ, "download");
    }

    public C855750Xhd(Dialog dialog, C855720Xha c855720Xha, String str) {
        this.LIZ = dialog;
        this.LIZIZ = c855720Xha;
        this.LIZJ = str;
    }
}
