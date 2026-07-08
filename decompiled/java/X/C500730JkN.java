package X;

import androidx.fragment.app.Fragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0JkN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500730JkN implements InterfaceC776570UdD {
    public final Fragment LL;
    public final DataChannel LLILLJJLI;
    public final InterfaceC500720JkM LLILLL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public String LLILZ = "float_window_setting";
    public final C500750JkP LLILZIL = new Object() { // from class: X.0JkP
    };
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(267));

    @Override // X.InterfaceC776570UdD
    public final void LIZJ() {
    }

    @Override // X.InterfaceC776570UdD
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC776570UdD
    public final void LJ() {
    }

    @Override // X.InterfaceC776570UdD
    public final void LJFF(boolean z) {
    }

    @Override // X.InterfaceC776570UdD
    public final void LIZ() {
        this.LLILZLL = C0W78.LJFF(this.LL.getActivity());
        EnumC1102750enp.MESSAGE_ALERT.load(this.LLILLJJLI, new C500710JkL(this));
    }

    @Override // X.InterfaceC776570UdD
    public final void LIZIZ() {
        InterfaceC772390URp.LLLZI.LIZIZ().booleanValue();
    }

    public final void LJI() {
        if (C0W78.LJFF(this.LL.getActivity())) {
            if (this.LLILZLL) {
                this.LLILLL.LJIIJJI();
                return;
            }
            if (!this.LLILZLL) {
                C20337914i1<Boolean> c20337914i1 = InterfaceC772390URp.LLLZIL;
                Boolean bool = Boolean.TRUE;
                c20337914i1.LJFF(bool);
                InterfaceC772390URp.LLLZIIL.LJFF(bool);
                InterfaceC772390URp.LLZ.LJFF(bool);
                InterfaceC772390URp.LLZIL.LJFF(bool);
                InterfaceC772390URp.LLZILL.LJFF(bool);
                this.LLILLL.LJIIJJI();
            }
        } else if (this.LLILZLL) {
            this.LLILLL.LJI();
        }
        C784440Upu.LIZ().LIZIZ(this.LLILZIL);
    }

    public final void LJII() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_overlay_permission_banner_show");
        c474500IjALIZ.LJJII(this.LLIZLLLIL.getValue(), "anchor_id");
        c474500IjALIZ.LJJII(this.LLILZ, "enter_from");
        c474500IjALIZ.LJJII("in_live", "scene_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC776570UdD
    public final void onPause() {
        this.LLILZLL = C0W78.LJFF(this.LL.getActivity());
        this.LLIZ = false;
    }

    @Override // X.InterfaceC776570UdD
    public final void onResume() {
        LJI();
        this.LLIZ = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0JkP] */
    public C500730JkN(Fragment fragment, DataChannel dataChannel, InterfaceC500720JkM interfaceC500720JkM) {
        this.LL = fragment;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = interfaceC500720JkM;
    }
}
