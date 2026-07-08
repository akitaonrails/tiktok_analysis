package com.bytedance.android.live.liveinteract.matchv2.connection.matchoption.aihistory;

import X.AnonymousClass0951;
import X.C09IC;
import X.C1BNE;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C497740JfY;
import X.C915980Zwa;
import X.C973660bRc;
import X.C980940bdM;
import X.InterfaceC1106030et7;
import X.InterfaceC963450bB9;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS133S0110000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchAIHistoryViewModel extends ViewModel {
    public final boolean LL;
    public final InterfaceC963450bB9 LLILLJJLI;
    public final DataChannel LLILLL;
    public final Function1<Boolean, Unit> LLILZ;
    public final C2252321DDq LLILZIL;
    public final AnonymousClass0951 LLILZLL;

    public MatchAIHistoryViewModel() {
        this(false, null, null, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCleared: ");
        sbLIZ.append(((C980940bdM) this.LLILZIL.getValue()).LIZ);
        C20441214yg.LJIIIZ("MatchAIHistoryViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Function1<Boolean, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(((C980940bdM) this.LLILZIL.getValue()).LIZ));
        }
    }

    public final void vQ2(boolean z) {
        Context context;
        Object value;
        View rootView;
        InterfaceC963450bB9 interfaceC963450bB9 = this.LLILLJJLI;
        if (interfaceC963450bB9 != null && (rootView = interfaceC963450bB9.getRootView()) != null) {
            context = rootView.getContext();
        } else {
            context = null;
        }
        if (this.LL && !z && context != null) {
            C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.M4;
            if (c20337914i1.LIZIZ().intValue() <= 0) {
                c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
                C973660bRc c973660bRc = C973660bRc.LIZ;
                C973660bRc.LIZ.LJJJJJ(this.LLILLL, "match_option", "pk_icon", "turn_off_share_perf", "", false);
                C915980Zwa.LJ().me1(context, C497740JfY.LJIJI(2131853697), C497740JfY.LJIJI(2131853694), C497740JfY.LJIJI(2131853695), C497740JfY.LJIJI(2131853696), new AwS133S0110000_15(this, z, 1), new AwS559S0100000_15(this, 148));
                return;
            }
        }
        C2252321DDq c2252321DDq = this.LLILZIL;
        do {
            value = c2252321DDq.getValue();
            value.getClass();
        } while (!c2252321DDq.compareAndSet(value, new C980940bdM(z)));
    }

    public MatchAIHistoryViewModel(boolean z, InterfaceC963450bB9 interfaceC963450bB9, DataChannel dataChannel, Function1 function1) {
        this.LL = z;
        this.LLILLJJLI = interfaceC963450bB9;
        this.LLILLL = dataChannel;
        this.LLILZ = function1;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C980940bdM(false));
        this.LLILZIL = c2252321DDqLIZ;
        this.LLILZLL = C09IC.LIZIZ(c2252321DDqLIZ);
    }
}
