package X;

import Y.AcS354S0200000_15;
import Y.AcS83S1200000_15;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderLayoutAvailableChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderSelectChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bOd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971810bOd implements InterfaceC972070bP3 {
    public final InterfaceC950700aqa LL;
    public final Function1<List<C354101Zb>, Unit> LLILLJJLI;
    public final Function1<Boolean, Unit> LLILLL;

    @Override // X.InterfaceC972070bP3
    public final void qP(C354001Za c354001Za) {
    }

    public final void LIZ() {
        C01ZA c01zaLJIIIZ;
        InterfaceC971790bOb interfaceC971790bObLIZIZ = C01OF.LIZIZ();
        this.LLILLJJLI.invoke(Collections.singletonList(new C354101Zb((interfaceC971790bObLIZIZ == null || (c01zaLJIIIZ = interfaceC971790bObLIZIZ.LJIIIZ()) == null) ? null : new C354001Za(true, c01zaLJIIIZ))));
    }

    @Override // X.InterfaceC972070bP3
    public final void A5(C354001Za c354001Za) {
        LIZIZ(c354001Za);
        LIZJ(EnumC971520bOA.EDIT, c354001Za);
    }

    @Override // X.InterfaceC972070bP3
    public final void EA(C354001Za c354001Za) {
        Context context = this.LL.getContext();
        if (context == null) {
            return;
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJIIZILJ(2131854337);
        c782110Um9.LJII(2131854336);
        c782110Um9.LJIIJ(2131854350, new InterfaceC743640TFa() { // from class: X.0bOe
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        c782110Um9.LJIILIIL(2131854353, new AcS354S0200000_15(this, c354001Za, 15));
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public final void LIZIZ(C354001Za c354001Za) {
        InterfaceC971790bOb interfaceC971790bObLIZIZ;
        C946850akN.LIZIZ = EnumC952890au7.DESIGN_PANEL;
        if (c354001Za != null && (interfaceC971790bObLIZIZ = C01OF.LIZIZ()) != null) {
            interfaceC971790bObLIZIZ.LIZJ(c354001Za.LIZIZ, EnumC971980bOu.ALL_LIST_TYPE, false);
            if (Unit.LIZ != null) {
                return;
            }
        }
        InterfaceC971790bOb interfaceC971790bObLIZIZ2 = C01OF.LIZIZ();
        if (interfaceC971790bObLIZIZ2 != null) {
            interfaceC971790bObLIZIZ2.LJII(1, this.LL.getContext(), EnumC971980bOu.ALL_LIST_TYPE, false);
        }
    }

    @Override // X.InterfaceC972070bP3
    public final void xd(C354001Za c354001Za) {
        String str;
        Context context = this.LL.getContext();
        if (context == null) {
            return;
        }
        C01F5 c01f5 = c354001Za.LIZIZ.LIZ;
        if (c01f5 != null) {
            str = c01f5.LIZ;
        } else {
            str = null;
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJIIIZ(C497740JfY.LJIJJ(2131854276, str));
        c782110Um9.LJIIJ(2131854350, new InterfaceC743640TFa() { // from class: X.0bOf
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        c782110Um9.LJIILIIL(2131851918, new AcS83S1200000_15(this, c354001Za, str, 2));
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public static void LIZJ(EnumC971520bOA enumC971520bOA, C354001Za c354001Za) {
        C946850akN.LJIIIZ(enumC971520bOA, Long.valueOf(c354001Za.LIZIZ.LIZLLL), "personal", EnumC937290aUx.DESIGN_PAGE, "header");
    }

    public C971810bOd(InterfaceC950700aqa interfaceC950700aqa, C951020ar6 c951020ar6, C951000ar4 c951000ar4) {
        this.LL = interfaceC950700aqa;
        this.LLILLJJLI = c951020ar6;
        this.LLILLL = c951000ar4;
        DataChannel dataChannel = interfaceC950700aqa.getDataChannel();
        LifecycleOwner lifecycleOwnerLJJJJ = interfaceC950700aqa.LJJJJ();
        if (dataChannel != null && lifecycleOwnerLJJJJ != null) {
            dataChannel.BQ2(lifecycleOwnerLJJJJ, TextHeaderSelectChangeEvent.class, new AwS594S0100000_15(this, 680));
            dataChannel.BQ2(lifecycleOwnerLJJJJ, TextHeaderLayoutAvailableChangeEvent.class, new AwS594S0100000_15(this, 681));
        }
    }
}
