package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.12UC, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12UC implements C12UL {
    public final /* synthetic */ C12U9 LIZ;

    public C12UC(C12U9 c12u9) {
        this.LIZ = c12u9;
    }

    @Override // X.C12UL
    public final void LIZ(float f, boolean z) {
        int iMo51if;
        long jTe;
        long j = (long) (r3.LLJILJIL * f);
        InterfaceC1452170ntP interfaceC1452170ntP = this.LIZ.LLJIJIL;
        if (interfaceC1452170ntP != null) {
            iMo51if = interfaceC1452170ntP.mo51if();
        } else {
            iMo51if = 0;
        }
        int i = (int) (iMo51if * f);
        InterfaceC1452170ntP interfaceC1452170ntP2 = this.LIZ.LLJIJIL;
        if (interfaceC1452170ntP2 != null) {
            jTe = interfaceC1452170ntP2.Te(i);
        } else {
            jTe = 0;
        }
        this.LIZ.getClass();
        View view = null;
        if (z) {
            C12U9 c12u9 = this.LIZ;
            c12u9.LLJJIJIL = null;
            MutableLiveData<C1452730nuJ> mutableLiveData = c12u9.LLJJJJJIL;
            if (mutableLiveData == null) {
                mutableLiveData = null;
            }
            mutableLiveData.setValue(C1452730nuJ.LIZLLL(jTe));
            MutableLiveData<C1452730nuJ> mutableLiveData2 = this.LIZ.LLJJJJJIL;
            if (mutableLiveData2 == null) {
                mutableLiveData2 = null;
            }
            mutableLiveData2.setValue(C1452730nuJ.LIZJ());
            View view2 = this.LIZ.LLJLILLLLZIIL;
            if (view2 != null) {
                view = view2;
            }
            C786410Ut5.LJLLLLLL(0, view);
        } else {
            MutableLiveData<C1452730nuJ> mutableLiveData3 = this.LIZ.LLJJJJJIL;
            if (mutableLiveData3 == null) {
                mutableLiveData3 = null;
            }
            mutableLiveData3.setValue(C1452730nuJ.LIZIZ(jTe));
            MutableLiveData<C1452730nuJ> mutableLiveData4 = this.LIZ.LLJJJJJIL;
            if (mutableLiveData4 == null) {
                mutableLiveData4 = null;
            }
            mutableLiveData4.setValue(C1452730nuJ.LIZJ());
            View view3 = this.LIZ.LLJLILLLLZIIL;
            if (view3 != null) {
                view = view3;
            }
            C786410Ut5.LJLLLLLL(4, view);
        }
        this.LIZ.LLLILZ().setValue(Long.valueOf(j));
    }
}
