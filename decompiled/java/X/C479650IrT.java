package X;

import Y.ARunnableS40S0300000_7;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutTopliveCrashFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveHangoutPerformanceOptSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectionVM;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS285S0300000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0IrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479650IrT {
    public final UIAssem LIZ;
    public final AssemVMLazy<C479290Iqt, LiveHangoutV2SelectionVM> LIZIZ;
    public boolean LIZJ;

    public final void LIZIZ() {
        InterfaceC479210Iql interfaceC479210Iql;
        if (this.LIZJ || !HangoutTopliveCrashFixSetting.INSTANCE.isFix()) {
            return;
        }
        C03H8 c03h8 = this.LIZ;
        if (!(c03h8 instanceof InterfaceC479210Iql) || (interfaceC479210Iql = (InterfaceC479210Iql) c03h8) == null) {
            return;
        }
        LiveHangoutV2SelectionVM liveHangoutV2SelectionVM = (LiveHangoutV2SelectionVM) this.LIZIZ.getValue();
        this.LIZJ = true;
        C736680Sv4.LJIIIIZZ(this.LIZ, liveHangoutV2SelectionVM, new C2217381BqS() { // from class: X.0IrU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C479290Iqt) obj).LL);
            }
        }, C736820SvI.LIZLLL(), new AwS285S0300000_7(this, interfaceC479210Iql, liveHangoutV2SelectionVM, 2), 4);
        C479290Iqt state = liveHangoutV2SelectionVM.getState();
        if (state.LL == 0 || !state.LLILLJJLI) {
            return;
        }
        LIZ(interfaceC479210Iql, state);
    }

    public C479650IrT(UIAssem uIAssem) {
        this.LIZ = uIAssem;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveHangoutV2SelectionVM.class);
        this.LIZIZ = C724750Sbp.LIZ(uIAssem, C724750Sbp.LJIIJ(uIAssem, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 816), AFwS237S0000000_7.get$arr$(366), null, true);
    }

    public final void LIZ(InterfaceC479210Iql interfaceC479210Iql, C479290Iqt c479290Iqt) {
        if (!this.LIZ.so() || !c479290Iqt.LLILLJJLI) {
            return;
        }
        if (TiktokLiveHangoutPerformanceOptSetting.isDispatchOpt()) {
            HandlerHook.viewPost(this.LIZ.LJJIJL(), new ARunnableS40S0300000_7(this, c479290Iqt, interfaceC479210Iql, 15));
        } else {
            interfaceC479210Iql.u(c479290Iqt.LLILLL, c479290Iqt.LLILZ);
        }
    }
}
