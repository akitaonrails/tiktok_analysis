package X;

import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multiguestv3.OuterMultiGuestLayoutChangeEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0ZyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916990ZyD extends AbstractC939360aYI {
    public final ViewGroup LLILZ;
    public final ViewGroup LLILZIL;
    public final DataChannel LLILZLL;
    public final C01GW LLIZ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(374));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, LSPassThroughRecordSizeConfig.DEFAULT));

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void onDetach() {
        super.onDetach();
        C940770aaZ.LIZ().LJJ((C916940Zy8) this.LLIZLLLIL.getValue());
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIJ(InterfaceC940060aZQ interfaceC940060aZQ) {
        super.LJIJ(interfaceC940060aZQ);
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            this.LLILZLL.BQ2(this, OuterMultiGuestLayoutChangeEvent.class, new AwS594S0100000_15(this, 933));
        }
        C940770aaZ.LIZ().LJIIZILJ((C916940Zy8) this.LLIZLLLIL.getValue());
    }

    public C916990ZyD(ViewGroup viewGroup, ViewGroup viewGroup2, DataChannel dataChannel) {
        this.LLILZ = viewGroup;
        this.LLILZIL = viewGroup2;
        this.LLILZLL = dataChannel;
    }
}
