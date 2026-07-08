package X;

import Y.ACListenerS150S0100000_15;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestQuickConnectModuleShowChannel;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.room.MicRoomDisableInteractionEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS381S0200000_15;

/* JADX INFO: renamed from: X.0aIT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C929550aIT extends AbstractC960470b6L<C929310aI5> {
    public InterfaceC929560aIU LL;
    public final DataChannel LLILLJJLI;
    public final boolean LLILLL;
    public InterfaceC929570aIV LLILZ;
    public final C16F5 LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public final View LLIZLLLIL;

    @Override // X.AbstractC960470b6L
    public final void LLIILZL() {
        this.LL = null;
        this.LLILZ = null;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public final void L5(C929310aI5 c929310aI5) {
        String strLJIJI;
        String strLJIJI2;
        String strLJIJI3;
        int i = c929310aI5.LIZ;
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                this.LLILZIL.setText(C497740JfY.LJIJI(2131841144));
                C16F5 c16f5 = this.LLILZLL;
                if (C494680Jac.LJIILIIL()) {
                    strLJIJI3 = C497740JfY.LJIJI(2131844458);
                } else {
                    strLJIJI3 = C497740JfY.LJIJI(2131841143);
                }
                c16f5.setText(strLJIJI3);
                C439101nJ.LJI(this.LLIZ);
                return;
            }
            return;
        }
        this.LLILZIL.setText(C497740JfY.LJIJI(2131843527));
        C16F5 c16f52 = this.LLILZLL;
        if (C494680Jac.LJIILIIL()) {
            strLJIJI = C497740JfY.LJIJI(2131844458);
        } else if (this.LLILLL) {
            strLJIJI = C497740JfY.LJIJI(2131842129);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131842129);
        }
        c16f52.setText(strLJIJI);
        C16F5 c16f53 = this.LLIZ;
        if (C494680Jac.LJIILIIL() || ((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).zS()) {
            z = false;
        }
        C500260Jjc.LJLJLJ(c16f53, z);
        if (this.LLILLL) {
            strLJIJI2 = C497740JfY.LJIJI(2131842128);
        } else {
            strLJIJI2 = C497740JfY.LJIJI(2131842213);
        }
        c16f53.setText(strLJIJI2);
        C786410Ut5.l8(c16f53, new ACListenerS150S0100000_15(this, 21));
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        C929310aI5 c929310aI5 = (C929310aI5) obj;
        L5(c929310aI5);
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.CQ2(MicRoomDisableInteractionEvent.class, this, new AwS381S0200000_15(this, c929310aI5, 14));
        }
    }

    public C929550aIT(View view, InterfaceC929560aIU interfaceC929560aIU, DataChannel dataChannel, boolean z, InterfaceC929570aIV interfaceC929570aIV) {
        Boolean bool;
        super(view);
        this.LL = interfaceC929560aIU;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = z;
        this.LLILZ = interfaceC929570aIV;
        this.LLILZIL = (C16F5) view.findViewById(R.id.p_9);
        this.LLILZLL = (C16F5) view.findViewById(R.id.o8v);
        this.LLIZ = (C16F5) view.findViewById(R.id.cra);
        View viewFindViewById = view.findViewById(R.id.h1z);
        View viewFindViewById2 = view.findViewById(R.id.yd5);
        this.LLIZLLLIL = viewFindViewById2;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(MultiGuestQuickConnectModuleShowChannel.class)) != null && bool.booleanValue() && viewFindViewById != null) {
            C500260Jjc.LJLJL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), viewFindViewById);
        }
        if (C930540aK4.LJIJJLI() && viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
    }
}
