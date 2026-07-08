package X;

import Y.ARunnableS106S0100000_6;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0wJP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class ViewOnFocusChangeListenerC1775810wJP implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
            case 2:
                onFocusChange$2(this, view, z);
                break;
            case 3:
                onFocusChange$3(this, view, z);
                break;
        }
    }

    public ViewOnFocusChangeListenerC1775810wJP(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onFocusChange$0(ViewOnFocusChangeListenerC1775810wJP viewOnFocusChangeListenerC1775810wJP, View view, boolean z) {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CCDCNormalView focus change: ");
        sbLIZ.append(z);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        ((C1710780ucW) viewOnFocusChangeListenerC1775810wJP.l0).LLILLJJLI.LJIILLIIL(z);
        ((C1710780ucW) viewOnFocusChangeListenerC1775810wJP.l0).getFocusChange().invoke(Boolean.valueOf(z));
        ((C1710780ucW) viewOnFocusChangeListenerC1775810wJP.l0).getOnFocusChange().invoke(Boolean.valueOf(z));
        if (z) {
            ((C1710380ubs) viewOnFocusChangeListenerC1775810wJP.l1).LIZ();
            ((C1710780ucW) viewOnFocusChangeListenerC1775810wJP.l0).LIZJ(null);
            ((C1710780ucW) viewOnFocusChangeListenerC1775810wJP.l0).getOnErrorClear().invoke();
            return;
        }
        C1710830ucb c1710830ucbInvoke = ((C1710780ucW) viewOnFocusChangeListenerC1775810wJP.l0).getOnVerify().invoke(((C1710780ucW) viewOnFocusChangeListenerC1775810wJP.l0).getValue());
        if (c1710830ucbInvoke != null) {
            C1710380ubs c1710380ubs = (C1710380ubs) viewOnFocusChangeListenerC1775810wJP.l1;
            C1710780ucW c1710780ucW = (C1710780ucW) viewOnFocusChangeListenerC1775810wJP.l0;
            c1710380ubs.LIZIZ(c1710830ucbInvoke.LIZ, c1710830ucbInvoke.LIZIZ.getDesc());
            c1710780ucW.LIZJ(c1710830ucbInvoke);
            return;
        }
        C1710780ucW c1710780ucW2 = (C1710780ucW) viewOnFocusChangeListenerC1775810wJP.l0;
        ((C1710380ubs) viewOnFocusChangeListenerC1775810wJP.l1).LIZIZ(null, null);
        c1710780ucW2.LIZJ(null);
    }

    public static final void onFocusChange$1(ViewOnFocusChangeListenerC1775810wJP viewOnFocusChangeListenerC1775810wJP, View view, boolean z) {
        ((C1710850ucd) viewOnFocusChangeListenerC1775810wJP.l0).LLILLJJLI.LJIILLIIL(z);
        if (z) {
            ((C1710380ubs) viewOnFocusChangeListenerC1775810wJP.l1).LIZ();
            ((C1710850ucd) viewOnFocusChangeListenerC1775810wJP.l0).LIZJ(null);
            ((C1710850ucd) viewOnFocusChangeListenerC1775810wJP.l0).getOnErrorClear().invoke();
            C1710830ucb c1710830ucbInvoke = ((C1710850ucd) viewOnFocusChangeListenerC1775810wJP.l0).getOnCheckingCardIfSupported().invoke(((C1710850ucd) viewOnFocusChangeListenerC1775810wJP.l0).getValue());
            if (c1710830ucbInvoke != null) {
                ((C1710850ucd) viewOnFocusChangeListenerC1775810wJP.l0).LIZJ(c1710830ucbInvoke);
                return;
            } else {
                ((C1710850ucd) viewOnFocusChangeListenerC1775810wJP.l0).LIZJ(null);
                return;
            }
        }
        C1710830ucb c1710830ucbInvoke2 = ((C1710850ucd) viewOnFocusChangeListenerC1775810wJP.l0).getOnCheckingCardIfSupported().invoke(((C1710850ucd) viewOnFocusChangeListenerC1775810wJP.l0).getValue());
        if (c1710830ucbInvoke2 != null) {
            C1710380ubs c1710380ubs = (C1710380ubs) viewOnFocusChangeListenerC1775810wJP.l1;
            C1710850ucd c1710850ucd = (C1710850ucd) viewOnFocusChangeListenerC1775810wJP.l0;
            c1710380ubs.LIZIZ(c1710830ucbInvoke2.LIZ, c1710830ucbInvoke2.LIZIZ.getDesc());
            c1710850ucd.LIZJ(c1710830ucbInvoke2);
            return;
        }
        C1710850ucd c1710850ucd2 = (C1710850ucd) viewOnFocusChangeListenerC1775810wJP.l0;
        C1710380ubs c1710380ubs2 = (C1710380ubs) viewOnFocusChangeListenerC1775810wJP.l1;
        C1710830ucb c1710830ucbInvoke3 = c1710850ucd2.getOnVerify().invoke(c1710850ucd2.getValue());
        if (c1710830ucbInvoke3 != null) {
            c1710380ubs2.LIZIZ(c1710830ucbInvoke3.LIZ, c1710830ucbInvoke3.LIZIZ.getDesc());
            c1710850ucd2.LIZJ(c1710830ucbInvoke3);
        } else {
            c1710380ubs2.LIZIZ(null, null);
            c1710850ucd2.LIZJ(null);
        }
    }

    public static final void onFocusChange$2(ViewOnFocusChangeListenerC1775810wJP viewOnFocusChangeListenerC1775810wJP, View view, boolean z) {
        ((C1710810ucZ) viewOnFocusChangeListenerC1775810wJP.l0).LLILLJJLI.LJIILLIIL(z);
        ((C1710810ucZ) viewOnFocusChangeListenerC1775810wJP.l0).getFocusChange().invoke(Boolean.valueOf(z));
        ((C1710810ucZ) viewOnFocusChangeListenerC1775810wJP.l0).setTextHasFocus(z);
        if (z) {
            ((C1710380ubs) viewOnFocusChangeListenerC1775810wJP.l1).LIZ();
            ((C1710810ucZ) viewOnFocusChangeListenerC1775810wJP.l0).LIZJ(null);
            ((C1710810ucZ) viewOnFocusChangeListenerC1775810wJP.l0).getOnErrorClear().invoke();
            return;
        }
        C1710830ucb c1710830ucbInvoke = ((C1710810ucZ) viewOnFocusChangeListenerC1775810wJP.l0).getOnVerify().invoke(C2204961BRm.LLJILLL(((C1710810ucZ) viewOnFocusChangeListenerC1775810wJP.l0).getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CA3zMRkEGe2F3/FRz8DHtueHA4i57+swHAT/GA9lW1CFXaxMPvdCxUtjXO17fYhNg=", null)).toString());
        if (c1710830ucbInvoke != null) {
            C1710380ubs c1710380ubs = (C1710380ubs) viewOnFocusChangeListenerC1775810wJP.l1;
            C1710810ucZ c1710810ucZ = (C1710810ucZ) viewOnFocusChangeListenerC1775810wJP.l0;
            c1710380ubs.LIZIZ(c1710830ucbInvoke.LIZ, c1710830ucbInvoke.LIZIZ.getDesc());
            c1710810ucZ.LIZJ(c1710830ucbInvoke);
            return;
        }
        C1710810ucZ c1710810ucZ2 = (C1710810ucZ) viewOnFocusChangeListenerC1775810wJP.l0;
        ((C1710380ubs) viewOnFocusChangeListenerC1775810wJP.l1).LIZIZ(null, null);
        c1710810ucZ2.LIZJ(null);
    }

    public static final void onFocusChange$3(ViewOnFocusChangeListenerC1775810wJP viewOnFocusChangeListenerC1775810wJP, View view, boolean z) {
        if (z) {
            C0I7D c0i7d = (C0I7D) viewOnFocusChangeListenerC1775810wJP.l0;
            HandlerHook.viewPost(c0i7d, new ARunnableS106S0100000_6((Object) c0i7d, 183));
        }
        if (LivePcsFormUxOptSetting.INSTANCE.isUxOptEnabled()) {
            ((C1727920v4A) viewOnFocusChangeListenerC1775810wJP.l1).LLILLJJLI.LJIILLIIL(z);
        }
    }
}
