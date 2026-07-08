package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362630EJp extends AbstractC375510Ent<C0ECF, Unit> {
    public InterfaceC362640EJq LLJJIJIIJIL;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 386));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 387));
    public final CreativeBottomSheetBehavior<View> LLJJJIL;
    public final C0FXH LLJJJJ;
    public EnumC362260EIe LLJJJJJIL;

    @Override // X.AbstractC375510Ent
    public final Function1<C539960LFq, Unit> LLLLIIIILLL() {
        return new AwS584S0100000_5(this, 345);
    }

    @Override // X.AbstractC375510Ent
    public final Function1<C1DRF, Unit> LLLLIILL() {
        return new AwS584S0100000_5(this, 346);
    }

    public final void LLLLLILLIL() {
        InterfaceC362640EJq interfaceC362640EJq;
        C0EC4 c0ec4;
        C0E48 c0e48;
        C0ECF c0ecf;
        InterfaceC362230EIb interfaceC362230EIb;
        View viewFindViewById;
        C0E48 c0e482;
        C0E55 player;
        C0E48 c0e483;
        C0E55 player2;
        C0E48 c0e484;
        C0E48 c0e485;
        InterfaceC361710EGb interfaceC361710EGb;
        C0E5S c0e5sLJIIIZ;
        View viewFindViewById2;
        C0E48 c0e486;
        InterfaceC362230EIb interfaceC362230EIb2;
        C0E5S c0e5sLJIIIZ2;
        C0E5S c0e5sLJIIIZ3;
        Function0<Unit> function0;
        C0ECF c0ecf2 = (C0ECF) this.LLJILLL;
        if (c0ecf2 != null && (function0 = c0ecf2.LLJILJIL) != null) {
            function0.invoke();
        }
        C0ECF c0ecf3 = (C0ECF) this.LLJILLL;
        View viewXg = (c0ecf3 == null || (c0e5sLJIIIZ3 = c0ecf3.LJIIIZ()) == null) ? null : c0e5sLJIIIZ3.xg();
        C368000Ebm c368000Ebm = viewXg instanceof C368000Ebm ? (C368000Ebm) viewXg : null;
        if (c368000Ebm != null) {
            c368000Ebm.setForceTrackFirstEnabled(false);
            c368000Ebm.scrollAudioTrack(false);
        }
        if (C357780E0y.LIZ() && (viewFindViewById2 = ((Activity) this.LLJJJ.getValue()).findViewById(R.id.ygy)) != null) {
            viewFindViewById2.setScrollY(0);
            C0ECF c0ecf4 = (C0ECF) this.LLJILLL;
            if (c0ecf4 != null && (c0e5sLJIIIZ2 = c0ecf4.LJIIIZ()) != null) {
                c0e5sLJIIIZ2.ZP0(false);
            }
            C0ECF c0ecf5 = (C0ECF) this.LLJILLL;
            if (c0ecf5 != null && (interfaceC362230EIb2 = (InterfaceC362230EIb) c0ecf5.LLJJIII.getValue(c0ecf5, C0ECF.LLJJJIL[7])) != null) {
                interfaceC362230EIb2.RH1(false);
            }
            I i = this.LLJILLL;
            if (i != 0 && (c0e486 = i.LLILLJJLI) != null) {
                c0e486.S7().LIZIZ(new C358810E4x(null), "switch_track_style", false);
            }
        }
        C0ECF c0ecf6 = (C0ECF) this.LLJILLL;
        if (c0ecf6 != null && (c0e5sLJIIIZ = c0ecf6.LJIIIZ()) != null) {
            c0e5sLJIIIZ.yV(AFwS234S0000000_5.get$arr$(173));
        }
        C0ECF c0ecf7 = (C0ECF) this.LLJILLL;
        if (c0ecf7 != null && (interfaceC361710EGb = (InterfaceC361710EGb) c0ecf7.LLJJI.getValue(c0ecf7, C0ECF.LLJJJIL[5])) != null) {
            interfaceC361710EGb.LLJJIJIIJIL(true);
        }
        LLLLL(true);
        I i2 = this.LLJILLL;
        if (i2 != 0 && (c0e485 = i2.LLILLJJLI) != null) {
            c0e485.S7().LIZIZ(Boolean.FALSE, "is_bottom_panel_showing", false);
        }
        I i3 = this.LLJILLL;
        if (i3 != 0 && (c0e484 = i3.LLILLJJLI) != null) {
            c0e484.S7().LIZIZ(new C358810E4x(null), "switch_track_style", false);
        }
        I i4 = this.LLJILLL;
        if (i4 != 0 && (c0e483 = i4.LLILLJJLI) != null && (player2 = c0e483.getPlayer()) != null) {
            player2.LJIJJLI();
        }
        I i5 = this.LLJILLL;
        if (i5 != 0 && (c0e482 = i5.LLILLJJLI) != null && (player = c0e482.getPlayer()) != null) {
            player.pause(false);
        }
        C0ECF c0ecf8 = (C0ECF) this.LLJILLL;
        if (c0ecf8 != null && (c0ec4 = c0ecf8.LLJIJIL) != null && c0ec4.LIZIZ) {
            C19A3 c19a3 = c0ecf8.LLJ;
            if (c19a3 != null && (viewFindViewById = c19a3.findViewById(R.id.gct)) != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            if (!C357780E0y.LIZ()) {
                EnumC362260EIe enumC362260EIe = this.LLJJJJJIL;
                EnumC362260EIe enumC362260EIe2 = EnumC362260EIe.MIN;
                if (enumC362260EIe == enumC362260EIe2 && (c0ecf = (C0ECF) this.LLJILLL) != null && (interfaceC362230EIb = (InterfaceC362230EIb) c0ecf.LLJJIII.getValue(c0ecf, C0ECF.LLJJJIL[7])) != null) {
                    interfaceC362230EIb.td1(enumC362260EIe2);
                }
            }
            I i6 = this.LLJILLL;
            if (i6 != 0 && (c0e48 = i6.LLILLJJLI) != null) {
                c0e48.S7().LIZIZ(new C0E2C(LLLLLIL(), "audio_fade_panel", false), "panel_bounce_event", false);
            }
        }
        C0ECF c0ecf9 = (C0ECF) this.LLJILLL;
        if (c0ecf9 == null || c0ecf9.LJIIIIZZ() == null || (interfaceC362640EJq = this.LLJJIJIIJIL) == null) {
            return;
        }
        interfaceC362640EJq.i41("exit", null, null);
    }

    public C362630EJp() {
        CreativeBottomSheetBehavior<View> creativeBottomSheetBehavior = new CreativeBottomSheetBehavior<>();
        creativeBottomSheetBehavior.LJJ = true;
        creativeBottomSheetBehavior.LJIIJ = false;
        this.LLJJJIL = creativeBottomSheetBehavior;
        this.LLJJJJ = new C0FXH(this, 2);
    }

    @Override // X.AbstractC375510Ent
    public final Integer LLLLIL() {
        return Integer.valueOf(R.id.gcw);
    }

    public final int LLLLLIL() {
        C0EC4 c0ec4;
        if (C357780E0y.LIZ()) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(330)) - (((C0FU0.LIZ(C368130Ebz.LJIIIZ) + C360610EBv.LJFF) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        }
        C0ECF c0ecf = (C0ECF) this.LLJILLL;
        return (c0ecf == null || (c0ec4 = c0ecf.LLJIJIL) == null) ? ((int) (C1415610mwR.LIZ() * 0.4f)) + C0ES4.LIZJ : c0ec4.LIZ;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLLLLLZIL(this.LLJJJJ);
        }
    }

    public final void LLLLL(boolean z) {
        InterfaceC360800ECo interfaceC360800ECo;
        C0ECF c0ecf = (C0ECF) this.LLJILLL;
        if (c0ecf != null && (interfaceC360800ECo = (InterfaceC360800ECo) c0ecf.LLJJ.getValue(c0ecf, C0ECF.LLJJJIL[4])) != null) {
            C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.UNDO}, null, Boolean.valueOf(z), null, null, 26);
            if (!z) {
                C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.REDO}, null, Boolean.FALSE, null, null, 26);
            }
        }
    }

    @Override // X.AbstractC375510Ent, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        View view;
        super.onActivityCreated(bundle);
        if (!C0E47.LIZ()) {
            return;
        }
        Scene scene = this.mParentScene;
        if (scene != null && (view = scene.mView) != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0EJr
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return false;
                }
            });
            View viewFindViewById = view.findViewById(R.id.yg_);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
        }
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLIILIL(this, this.LLJJJJ);
        }
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        InterfaceC362640EJq interfaceC362640EJq = null;
        if (c1drg != null) {
            interfaceC362640EJq = (InterfaceC362640EJq) c1drg.LJIIL(null, InterfaceC362640EJq.class);
        }
        this.LLJJIJIIJIL = interfaceC362640EJq;
    }

    @Override // X.AbstractC375510Ent
    public final void LLLLJI(C18YA c18ya, Activity activity) {
        C214799194j c214799194j = c18ya.LIZ;
        c214799194j.LLLII = false;
        c214799194j.LLJL = R.style.y0;
        c214799194j.LLJLILLLLZIIL = this.LLJJJIL;
        c18ya.LIZIZ(EnumC214804194o.FIXED);
        C214799194j c214799194j2 = c18ya.LIZ;
        c214799194j2.LLLFZ = false;
        c214799194j2.LLJJJJLIIL = false;
        c214799194j2.LLJJLIIIJLLLLLLLZ = false;
        c18ya.LIZ.LLJZ = new AwS549S0100000_5(this, 388);
        c18ya.LIZ.LLJLLIL = new AwS549S0100000_5(this, 389);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0147  */
    @Override // X.AbstractC375510Ent, X.C19A3, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ViewGroup onCreateView(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362630EJp.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.ViewGroup");
    }
}
