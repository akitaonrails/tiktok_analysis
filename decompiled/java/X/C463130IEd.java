package X;

import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;

/* JADX INFO: renamed from: X.0IEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C463130IEd implements InterfaceC514560KFy {
    public final /* synthetic */ LivePlayFragment LIZ;
    public final /* synthetic */ C0IIQ LIZIZ;

    public /* synthetic */ C463130IEd(LivePlayFragment livePlayFragment, C0IIQ c0iiq) {
        this.LIZ = livePlayFragment;
        this.LIZIZ = c0iiq;
    }

    public final void LIZ() {
        LivePlayFragment livePlayFragment = this.LIZ;
        C0IIQ c0iiq = this.LIZIZ;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        C520010KaN.LJIILJJIL(livePlayFragment, "intent_smooth_exit_room");
        InterfaceC463580IFw interfaceC463580IFwV7 = livePlayFragment.AU().V7();
        if (interfaceC463580IFwV7 != null) {
            livePlayFragment.oW(c0iiq, true);
            ((C464520IJm) interfaceC463580IFwV7).LIZ(c0iiq);
        }
    }
}
