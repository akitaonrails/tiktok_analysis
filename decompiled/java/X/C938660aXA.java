package X;

import Y.ACListenerS150S0100000_15;
import Y.AObserverS219S0100000_15;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.linkroom.toolbarbehavior.ToolbarMultiGuestManageBehavior;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSupportNewLayoutInFeedSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aXA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938660aXA extends ViewOnClickListenerC939670aYn {
    public final Context LLJJ;
    public final LifecycleOwner LLJJI;
    public final AObserverS219S0100000_15 LLJJIII;
    public final C01GW LLJJIJI;
    public final AObserverS219S0100000_15 LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C938740aXI<AbstractC938650aX9> LLJJJ;
    public final AObserverS219S0100000_15 LLJJJIL;
    public final AObserverS219S0100000_15 LLJJJJ;
    public final AObserverS219S0100000_15 LLJJJJJIL;

    @Override // X.ViewOnClickListenerC939670aYn
    public final int LIZJ() {
        return R.layout.hwl;
    }

    @Override // X.ViewOnClickListenerC939670aYn
    public final int LIZLLL() {
        return R.id.ywi;
    }

    @Override // X.ViewOnClickListenerC939670aYn, X.InterfaceC938700aXE
    public final Long LIZ() {
        User userLJIIJ;
        AbstractC938650aX9 abstractC938650aX9 = this.LLJIJIL;
        if (abstractC938650aX9 == null || (userLJIIJ = abstractC938650aX9.LJIIJ()) == null) {
            return null;
        }
        return Long.valueOf(userLJIIJ.getId());
    }

    @Override // X.ViewOnClickListenerC939670aYn
    public final void LJIIIZ() {
        DataChannel dataChannel;
        AbstractC938650aX9 abstractC938650aX9 = this.LLJIJIL;
        if (abstractC938650aX9 == null || (dataChannel = abstractC938650aX9.LIZ) == null) {
            return;
        }
        dataChannel.LC0(ToolbarMultiGuestManageBehavior.ShowMultiGuestMenuEvent.class, new C926450aDT(false, "guest_control_popup_panel"));
    }

    @Override // X.ViewOnClickListenerC939670aYn
    public final void LJIIJ() {
        View viewFindViewById;
        AbstractC938650aX9 abstractC938650aX9;
        LiveData liveData;
        MutableLiveData<Long> mutableLiveDataLJII;
        LiveData liveData2;
        MutableLiveData<String> mutableLiveDataLJIIIIZZ;
        LiveData liveData3;
        AbstractC938650aX9 abstractC938650aX92 = this.LLJIJIL;
        if (abstractC938650aX92 != null && (liveData3 = (LiveData) abstractC938650aX92.LJIILIIL.getValue()) != null) {
            liveData3.removeObserver(this.LLJJJJJIL);
        }
        AbstractC938650aX9 abstractC938650aX93 = this.LLJIJIL;
        if (abstractC938650aX93 != null && (mutableLiveDataLJIIIIZZ = abstractC938650aX93.LJIIIIZZ()) != null) {
            mutableLiveDataLJIIIIZZ.removeObserver(this.LLJJJJ);
        }
        AbstractC938650aX9 abstractC938650aX94 = this.LLJIJIL;
        if (abstractC938650aX94 != null && (liveData2 = (LiveData) abstractC938650aX94.LJIIJJI.getValue()) != null) {
            liveData2.removeObserver(this.LLJJJIL);
        }
        AbstractC938650aX9 abstractC938650aX95 = this.LLJIJIL;
        if (abstractC938650aX95 != null && (mutableLiveDataLJII = abstractC938650aX95.LJII()) != null) {
            mutableLiveDataLJII.removeObserver(this.LLJJIII);
        }
        if (LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue() && (abstractC938650aX9 = this.LLJIJIL) != null && (liveData = (LiveData) abstractC938650aX9.LJIIIIZZ.getValue()) != null) {
            liveData.removeObserver(this.LLJJIJIIJIL);
        }
        ViewGroup viewGroup = this.LLJILJIL;
        if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.p57)) != null) {
            C439101nJ.LJI(viewFindViewById);
        }
        C938740aXI<AbstractC938650aX9> c938740aXI = this.LLJJJ;
        if (c938740aXI != null) {
            C940110aZV c940110aZV = (C940110aZV) c938740aXI.LIZ.getValue();
            if (c940110aZV != null) {
                c940110aZV.LIZLLL();
            } else {
                c938740aXI.LIZ();
            }
        }
        super.LJIIJ();
    }

    @Override // X.ViewOnClickListenerC939670aYn
    public final void LJ() {
        ConstraintLayout constraintLayout;
        super.LJ();
        ViewGroup viewGroup = this.LLJILJIL;
        if (viewGroup == null || (constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.xv8)) == null) {
            return;
        }
        C786410Ut5.Y7(constraintLayout, new ACListenerS150S0100000_15(this, 276));
    }

    @Override // X.ViewOnClickListenerC939670aYn
    public final void LJIIIIZZ() {
        User userLJIIJ;
        User userLJIIJ2;
        AbstractC939840aZ4 abstractC939840aZ4;
        AbstractC938650aX9 abstractC938650aX9;
        if (C930540aK4.LIZJ() && C931780aM4.LIZJ()) {
            AbstractC938650aX9 abstractC938650aX92 = this.LLJIJIL;
            if (abstractC938650aX92 == null || (userLJIIJ2 = abstractC938650aX92.LJIIJ()) == null) {
                return;
            }
            C932100aMa c932100aMa = new C932100aMa(C1697810uHb.LJIIJJI("gift", "audio", "zoom"), null);
            C0JGU.LIZ(Long.valueOf(userLJIIJ2.getId()));
            LifecycleOwner lifecycleOwner = this.LLJJI;
            if ((lifecycleOwner instanceof AbstractC939840aZ4) && (abstractC939840aZ4 = (AbstractC939840aZ4) lifecycleOwner) != null && (abstractC938650aX9 = this.LLJIJIL) != null) {
                abstractC938650aX9.LJIILL(this.LLJJ, abstractC939840aZ4, c932100aMa);
            }
        } else {
            AbstractC938650aX9 abstractC938650aX93 = this.LLJIJIL;
            if (abstractC938650aX93 != null && (userLJIIJ = abstractC938650aX93.LJIIJ()) != null) {
                AbstractC938650aX9 abstractC938650aX94 = this.LLJIJIL;
                if (abstractC938650aX94 != null) {
                    C933980aPc.LJIIIIZZ(abstractC938650aX94.LIZ, abstractC938650aX94.LJIIJ(), abstractC938650aX94.LIZIZ, "anchor_link_guest");
                }
                C0JGU.LIZ(Long.valueOf(userLJIIJ.getId()));
            }
        }
        AbstractC938650aX9 abstractC938650aX95 = this.LLJIJIL;
        if (Intrinsics.LJFF(abstractC938650aX95 != null ? abstractC938650aX95.LJIIIZ() : null, "guest")) {
            C01Z6.LIZ(false);
        }
    }

    public C938660aXA(Context context, LifecycleOwner lifecycleOwner) {
        super(context, lifecycleOwner);
        this.LLJJ = context;
        this.LLJJI = lifecycleOwner;
        this.LLJJIII = new AObserverS219S0100000_15(this, 109);
        this.LLJJIJI = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1060));
        this.LLJJIJIIJIL = new AObserverS219S0100000_15(this, 113);
        this.LLJJJ = new C938740aXI<>(this);
        this.LLJJJIL = new AObserverS219S0100000_15(this, 112);
        this.LLJJJJ = new AObserverS219S0100000_15(this, 110);
        this.LLJJJJJIL = new AObserverS219S0100000_15(this, 111);
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x01a3  */
    @Override // X.ViewOnClickListenerC939670aYn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.AbstractC938650aX9 r9, android.view.ViewGroup r10) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C938660aXA.LIZIZ(X.0aX9, android.view.ViewGroup):void");
    }
}
