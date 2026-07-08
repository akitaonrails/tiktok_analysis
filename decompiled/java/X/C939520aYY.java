package X;

import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aYY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939520aYY extends AbstractC939360aYI {
    public final ViewGroup LLILZ;
    public final ViewGroup LLILZIL;
    public final DataChannel LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 999));

    public final EnumC934000aPe LJJ() {
        List list = (List) this.LLILZLL.gg0(MultiGuestLayoutRenderV2.RoleChannel.class);
        if (list != null) {
            return (EnumC934000aPe) C13LP.LJJJLL(list);
        }
        return null;
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJI() {
        EnumC934000aPe enumC934000aPeLJJ = LJJ();
        if (enumC934000aPeLJJ != null) {
            EnumC934000aPe enumC934000aPe = EnumC934000aPe.AUDIENCE;
            if (enumC934000aPeLJJ == enumC934000aPe || enumC934000aPeLJJ == EnumC934000aPe.GUEST) {
                ((C937770aVj) this.LLIZ.getValue()).LJIIZILJ(enumC934000aPeLJJ == enumC934000aPe);
            }
        }
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void onDetach() {
        super.onDetach();
        ((C937770aVj) this.LLIZ.getValue()).LIZJ();
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIJ(InterfaceC940060aZQ interfaceC940060aZQ) {
        super.LJIJ(interfaceC940060aZQ);
        this.LLILZLL.BQ2(this, MultiGuestLayoutRenderV2.RoleChannel.class, new AwS594S0100000_15(this, 932));
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIL(C942080acg c942080acg) {
        boolean z;
        EnumC934000aPe enumC934000aPeLJJ = LJJ();
        if (enumC934000aPeLJJ != null) {
            EnumC934000aPe enumC934000aPe = EnumC934000aPe.AUDIENCE;
            if (enumC934000aPeLJJ == enumC934000aPe || enumC934000aPeLJJ == EnumC934000aPe.GUEST) {
                C937770aVj c937770aVj = (C937770aVj) this.LLIZ.getValue();
                if (enumC934000aPeLJJ == enumC934000aPe) {
                    z = true;
                } else {
                    z = false;
                }
                c937770aVj.LJIIZILJ(z);
            }
        }
    }

    public C939520aYY(ViewGroup viewGroup, ViewGroup viewGroup2, DataChannel dataChannel) {
        this.LLILZ = viewGroup;
        this.LLILZIL = viewGroup2;
        this.LLILZLL = dataChannel;
    }
}
