package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0f7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115060f7g extends AbstractC1115080f7i {
    public final LifecycleOwner LJIIL;
    public InterfaceC1115270f81 LJIILIIL;

    @Override // X.AbstractC1115080f7i
    public final View LIZIZ() {
        Context context = this.LIZ;
        DataChannel dataChannel = this.LIZJ;
        boolean z = this.LJ;
        InterfaceC1115270f81 interfaceC1115270f81 = this.LJIILIIL;
        C1115340f88 c1115340f88 = new C1115340f88(context, this.LJIIL, this.LIZIZ);
        c1115340f88.setDataChannel(dataChannel);
        c1115340f88.setOnEmojiSelectListener(interfaceC1115270f81);
        c1115340f88.h0(z);
        return c1115340f88;
    }

    @Override // X.AbstractC1115080f7i
    public final void LIZJ() {
        InterfaceC1115270f81 interfaceC1115270f81 = this.LJIILIIL;
        if (interfaceC1115270f81 != null) {
            interfaceC1115270f81.LIZIZ();
        }
    }

    @Override // X.AbstractC1115080f7i
    public final void LJ() {
        InterfaceC1115270f81 interfaceC1115270f81 = this.LJIILIIL;
        if (interfaceC1115270f81 != null) {
            interfaceC1115270f81.LIZJ();
        }
    }

    @Override // X.AbstractC1115080f7i
    public final void LIZLLL(String str, boolean z) {
        String str2;
        if (z) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_emoji_show");
            c474500IjALIZ.LJIL();
            if (this.LJIIJJI) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str2, "is_show_send_in_emoji");
            c474500IjALIZ.LJJII(str, "method");
            c474500IjALIZ.LIZ();
        }
    }

    public C1115060f7g(Context context, LifecycleOwner lifecycleOwner, EnumC584890Mwp enumC584890Mwp) {
        super(context, enumC584890Mwp);
        this.LJIIL = lifecycleOwner;
    }
}
