package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS98S0200000_29;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.124N, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C124N implements InterfaceC19512811Vu {
    public final /* synthetic */ ARunnableS129S0100000_29 LIZ;

    public C124N(ARunnableS129S0100000_29 aRunnableS129S0100000_29) {
        this.LIZ = aRunnableS129S0100000_29;
    }

    @Override // X.InterfaceC19512811Vu
    public final void LIZ(AnchorTransData anchorTransData) {
        ((ArrayList) ((C19512611Vs) C1403010mc7.LIZ.getWikiService()).LIZ).remove(this);
        HandlerHook.viewPostDelay(((C1464910oDx) ((ACListenerS163S0100000_29) this.LIZ.l0).l0).LLJLL, new ARunnableS98S0200000_29(anchorTransData, this, 32), 500L);
    }
}
