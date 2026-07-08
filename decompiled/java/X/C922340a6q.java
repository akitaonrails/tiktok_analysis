package X;

import Y.AfS184S0100000_15;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowBeginStatusEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowEndStatusEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.NoticeboardGuestController;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderUsingRichTextChangeChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0a6q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922340a6q extends AbstractC939360aYI {
    public final ViewGroup LLILZ;
    public final ViewGroup LLILZIL;
    public final DataChannel LLILZLL;
    public final C11NJ LLIZ = new C11NJ();

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void onDetach() {
        super.onDetach();
        this.LLIZ.LJ();
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIJ(InterfaceC940060aZQ interfaceC940060aZQ) {
        C11PQ<String> c11pq;
        super.LJIJ(interfaceC940060aZQ);
        DataChannel dataChannel = this.LLILZLL;
        dataChannel.BQ2(this, LiveShowBeginStatusEvent.class, AFwS250S0000000_15.get$arr$(205));
        dataChannel.BQ2(this, LiveShowEndStatusEvent.class, AFwS250S0000000_15.get$arr$(206));
        if (C937310aUz.LIZIZ(this.LLILZLL) == EnumC934000aPe.ANCHOR) {
            C953610avH.LJJI.getClass();
            c11pq = C953610avH.LJJIIZ;
        } else {
            c11pq = NoticeboardGuestController.LJIILJJIL;
        }
        if (!C930540aK4.LIZJ() && C931810aM7.LIZJ(C930540aK4.LIZJ())) {
            this.LLILZLL.BQ2(this, TextHeaderUsingRichTextChangeChannel.class, new AwS594S0100000_15(new C259800zU(), (C259800zU<String>) 940));
        }
        this.LLIZ.LIZ(new C11IW(c11pq.LJJIFFI().LJJIJIIJIL(new AfS184S0100000_15(this, 168))).LJIILL().LJIIZILJ());
    }

    public C922340a6q(ViewGroup viewGroup, ViewGroup viewGroup2, DataChannel dataChannel) {
        this.LLILZ = viewGroup;
        this.LLILZIL = viewGroup2;
        this.LLILZLL = dataChannel;
    }
}
