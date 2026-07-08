package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;

/* JADX INFO: renamed from: X.0plH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524010plH extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public final String LLIZ = "WebRequestReportExtension_";
    public final C1524040plK LLIZLLLIL = new AbstractC1541650qDj<C2205951BVh>(this) { // from class: X.0plK
        public final C1522830pjN LLIZ;

        @Override // X.AbstractC1541650qDj
        public final void LIZJ() {
            LJ("shouldInterceptRequest", this.LLIZ, LivePreCreateNextRoomPlayer.ENABLE);
            LJ("onPageStarted", this.LLIZ, LivePreCreateNextRoomPlayer.ENABLE);
            LJ("onPageFinished", this.LLIZ, LivePreCreateNextRoomPlayer.ENABLE);
        }

        {
            this.LLIZ = new C1522830pjN(this, this);
        }
    };

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        this.LLILLL = "web_request";
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebViewClient(), this.LLIZLLLIL);
    }
}
