package X;

import Y.ARunnableS117S0100000_17;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;

/* JADX INFO: renamed from: X.0eGC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1081900eGC extends C1077720e9S {
    public final /* synthetic */ PortraitAudienceInteractionFragment LIZ;

    @Override // X.C1077720e9S, X.InterfaceC1082180eGe
    public final void LIZJ(EnumC1083180eIG enumC1083180eIG) {
    }

    @Override // X.C1077720e9S, X.InterfaceC1082180eGe
    public final void LJJJIL() {
        if (this.LIZ.getView() != null) {
            this.LIZ.getView().animate().alpha(0.0f).withEndAction(new ARunnableS117S0100000_17(this, 60)).start();
        }
    }

    public C1081900eGC(PortraitAudienceInteractionFragment portraitAudienceInteractionFragment) {
        this.LIZ = portraitAudienceInteractionFragment;
    }

    @Override // X.C1077720e9S, X.InterfaceC1082180eGe
    public final void LJ(float f, EnumC1083180eIG enumC1083180eIG) {
        C500260Jjc.LLFFF(this.LIZ.getView());
        if (this.LIZ.getView() != null) {
            this.LIZ.getView().animate().alpha(1.0f).start();
        }
        C1078610eAt.LIZIZ(this.LIZ.LLJILJIL.getId(), f, true);
        C1078610eAt.LIZ(this.LIZ.LLJILJIL.getId(), true, enumC1083180eIG);
    }
}
