package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.feed.api.TopLiveSkylightEntranceEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.live.root.tab.room.skylight.SkylightController;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0IkT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475310IkT {
    public final LifecycleOwner LIZ;
    public final InterfaceC475300IkS LIZIZ;
    public final boolean LIZJ;
    public final Function0<Boolean> LIZLLL;
    public final InterfaceC479780Irg<?> LJ;
    public final SkylightController LJFF;
    public View LJI;
    public InterfaceC475340IkW LJII;

    public final Fragment LIZ(EnterRoomConfig enterRoomConfig) {
        Pair<Fragment, C0IEG> pairLJIIZILJ;
        C0IEG second;
        InterfaceC475300IkS interfaceC475300IkS = this.LIZIZ;
        if (interfaceC475300IkS != null) {
            pairLJIIZILJ = interfaceC475300IkS.LJIIZILJ(enterRoomConfig);
        } else {
            pairLJIIZILJ = null;
        }
        InterfaceC475340IkW interfaceC475340IkW = this.LJII;
        if (interfaceC475340IkW != null) {
            if (pairLJIIZILJ != null) {
                second = pairLJIIZILJ.getSecond();
            } else {
                second = null;
            }
            interfaceC475340IkW.ya(second);
        }
        if (pairLJIIZILJ == null) {
            return null;
        }
        return pairLJIIZILJ.getFirst();
    }

    public final void LIZIZ(EnterRoomConfig enterRoomConfig, C19EH c19eh, C472280Ifa c472280Ifa) {
        Fragment fragmentLIZ;
        SkylightController skylightController;
        Integer numValueOf;
        InterfaceC475300IkS interfaceC475300IkS;
        InterfaceC475300IkS interfaceC475300IkS2;
        InterfaceC475300IkS interfaceC475300IkS3;
        InterfaceC475300IkS interfaceC475300IkS4;
        boolean z = false;
        if (!this.LIZJ || (((interfaceC475300IkS3 = this.LIZIZ) != null && interfaceC475300IkS3.LIZ(enterRoomConfig) == 0) || ((interfaceC475300IkS4 = this.LIZIZ) != null && interfaceC475300IkS4.LJIILL()))) {
            InterfaceC475300IkS interfaceC475300IkS5 = this.LIZIZ;
            if ((interfaceC475300IkS5 == null || !interfaceC475300IkS5.LJIILIIL()) && (fragmentLIZ = LIZ(enterRoomConfig)) != null && c19eh != null) {
                c19eh.LIZIZ(R.id.iiv, fragmentLIZ);
                c19eh.LJIIIZ();
            }
        } else {
            InterfaceC475300IkS interfaceC475300IkS6 = this.LIZIZ;
            if (interfaceC475300IkS6 != null) {
                interfaceC475300IkS6.LJIIIZ();
            }
        }
        SkylightController skylightController2 = this.LJFF;
        if (skylightController2 != null) {
            skylightController2.LLIZ = c472280Ifa;
            skylightController2.LIZIZ(enterRoomConfig);
        }
        if ((!this.LIZJ || (((interfaceC475300IkS = this.LIZIZ) != null && interfaceC475300IkS.LIZ(enterRoomConfig) == 0) || ((interfaceC475300IkS2 = this.LIZIZ) != null && interfaceC475300IkS2.LJIILL()))) && (skylightController = this.LJFF) != null) {
            C476830Imv c476830Imv = skylightController.LL;
            if (c476830Imv != null) {
                C500260Jjc.LLFFF(c476830Imv.LJIILLIIL);
            }
            skylightController.LLJILJIL = true;
        }
        if (this.LIZJ) {
            InterfaceC475300IkS interfaceC475300IkS7 = this.LIZIZ;
            if (interfaceC475300IkS7 != null && (numValueOf = Integer.valueOf(interfaceC475300IkS7.LIZ(enterRoomConfig))) != null && numValueOf.intValue() == 0) {
                z = true;
            }
            if (!TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.getValue().alignOnline || new C477580Io8().LIZ(null) != 0) {
                DataChannelGlobal.LLILZ.FQ2(TopLiveSkylightEntranceEvent.class, new C477110InN(true, "topTabPreLoad", "topTabPreLoad", z));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.android.livesdkapi.session.EnterRoomConfig r12, X.InterfaceC479830Irl<?> r13, X.C19EH r14, X.C472280Ifa r15) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C475310IkT.LIZJ(com.bytedance.android.livesdkapi.session.EnterRoomConfig, X.0Irl, X.19EH, X.0Ifa):void");
    }

    public C475310IkT(LifecycleOwner lifecycleOwner, InterfaceC479780Irg<?> interfaceC479780Irg, InterfaceC475300IkS interfaceC475300IkS, boolean z, InterfaceC477100InM interfaceC477100InM, Function0<Boolean> function0) {
        LifecycleOwner lifecycleOwnerXL;
        this.LIZ = lifecycleOwner;
        this.LIZIZ = interfaceC475300IkS;
        this.LIZJ = z;
        this.LIZLLL = function0;
        this.LJ = interfaceC479780Irg;
        if (interfaceC479780Irg != null) {
            lifecycleOwnerXL = interfaceC479780Irg.xL();
        } else {
            lifecycleOwnerXL = null;
        }
        SkylightController skylightController = new SkylightController(interfaceC479780Irg, lifecycleOwnerXL, interfaceC475300IkS, interfaceC477100InM);
        this.LJFF = skylightController;
        skylightController.LLJI = z;
        skylightController.LLJIJIL = new AwS586S0100000_7(this, 599);
    }
}
