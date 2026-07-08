package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0SV8, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SV8 implements InterfaceC1167780gUi {
    public final /* synthetic */ C0SRL LIZ;

    @Override // X.InterfaceC1167780gUi
    public final void LIZIZ(boolean z) {
    }

    public C0SV8(C0SRL c0srl) {
        this.LIZ = c0srl;
    }

    @Override // X.InterfaceC1167780gUi
    public final void LIZ(boolean z) {
        if (z) {
            Aweme aweme = this.LIZ.LIZJ;
            if (aweme != null) {
                aweme.playlist_info = null;
            }
            C1440005kM.LIZ(new C739260SzE(aweme, null, false));
        }
    }
}
