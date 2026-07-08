package com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.invitee;

import X.C16FS;
import X.C20744116Fj;
import X.C786410Ut5;
import X.C975250bUB;
import X.C986950bn3;
import X.EnumC919170a1j;
import Y.ACListenerS150S0100000_15;
import Y.AObserverS219S0100000_15;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class TeamPairInviteeCohostRoomFragment extends AbsTeamPairInviteeFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP319KyoiJyowPCwjHELIOSJ2EnLSQhOS46Oms6ICokZiwiPyYnLSBiHSoyJRUtID0aJjMlPSo2CyokJjwnGiojJAkhKSIhLCEn";
    public C975250bUB LLLIILIL;
    public final EnumC919170a1j LLLIL = EnumC919170a1j.MATCH_TYPE_2V2;

    public final void zS() {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        C975250bUB c975250bUB = this.LLLIILIL;
        boolean zLJFF = (c975250bUB == null || (mutableLiveData2 = c975250bUB.LJIILL) == null) ? false : Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.TRUE);
        C975250bUB c975250bUB2 = this.LLLIILIL;
        boolean zLJFF2 = (c975250bUB2 == null || (mutableLiveData = c975250bUB2.LJIIZILJ) == null) ? false : Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE);
        if (zLJFF) {
            C16FS c16fs = this.LLLIIIL;
            if (c16fs != null) {
                c16fs.LJ();
            }
            C16FS c16fs2 = this.LLLIIIL;
            if (c16fs2 != null) {
                c16fs2.setEnabled(false);
            }
            C16FS c16fs3 = this.LLLIIIIL;
            if (c16fs3 != null) {
                c16fs3.LJIIL();
            }
            C16FS c16fs4 = this.LLLIIIIL;
            if (c16fs4 != null) {
                c16fs4.setEnabled(false);
                return;
            }
            return;
        }
        if (zLJFF2) {
            C16FS c16fs5 = this.LLLIIIL;
            if (c16fs5 != null) {
                c16fs5.LJIIL();
            }
            C16FS c16fs6 = this.LLLIIIL;
            if (c16fs6 != null) {
                c16fs6.setEnabled(false);
            }
            C16FS c16fs7 = this.LLLIIIIL;
            if (c16fs7 != null) {
                c16fs7.LJ();
            }
            C16FS c16fs8 = this.LLLIIIIL;
            if (c16fs8 != null) {
                c16fs8.setEnabled(false);
                return;
            }
            return;
        }
        C16FS c16fs9 = this.LLLIIIL;
        if (c16fs9 != null) {
            c16fs9.LJIIL();
        }
        C16FS c16fs10 = this.LLLIIIL;
        if (c16fs10 != null) {
            c16fs10.setEnabled(true);
        }
        C16FS c16fs11 = this.LLLIIIIL;
        if (c16fs11 != null) {
            c16fs11.LJIIL();
        }
        C16FS c16fs12 = this.LLLIIIIL;
        if (c16fs12 != null) {
            c16fs12.setEnabled(true);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.AbsTeamPairFragment
    public final void uS() {
        super.uS();
        C975250bUB c975250bUB = this.LLLIILIL;
        if (c975250bUB != null) {
            c975250bUB.LJIILL.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 6));
            c975250bUB.LJIIZILJ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 7));
            c975250bUB.LJIILIIL.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 8));
            c975250bUB.LJIIIIZZ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 9));
            c975250bUB.LJIIJ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 10));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.invitee.AbsTeamPairInviteeFragment
    public final void yS(boolean z) {
        super.yS(z);
        C20744116Fj c20744116Fj = this.LLLII;
        if (c20744116Fj != null) {
            C786410Ut5.z7(c20744116Fj, new C986950bn3(this, 3));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.invitee.AbsTeamPairInviteeFragment, com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.AbsTeamPairFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        C16FS c16fs = this.LLLIIIL;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 216));
        }
        C16FS c16fs2 = this.LLLIIIIL;
        if (c16fs2 != null) {
            C786410Ut5.h8(c16fs2, new ACListenerS150S0100000_15(this, 217));
        }
        C975250bUB c975250bUB = this.LLLIILIL;
        if (c975250bUB != null) {
            z = c975250bUB.LJIJJ;
        } else {
            z = false;
        }
        yS(z);
    }
}
