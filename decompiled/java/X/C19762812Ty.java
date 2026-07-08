package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.12Ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19762812Ty implements InterfaceC19756212Rk {
    public final /* synthetic */ C19762612Tw LIZ;

    public C19762812Ty(C19762612Tw c19762612Tw) {
        this.LIZ = c19762612Tw;
    }

    @Override // X.InterfaceC19756212Rk
    public final void LIZ(float f, boolean z) {
        int iMo51if;
        long jTe;
        long j = (long) (r3.LLJILJILJ * f);
        InterfaceC1452170ntP interfaceC1452170ntP = this.LIZ.LLJILJIL;
        if (interfaceC1452170ntP != null) {
            iMo51if = interfaceC1452170ntP.mo51if();
        } else {
            iMo51if = 0;
        }
        int i = (int) (iMo51if * f);
        InterfaceC1452170ntP interfaceC1452170ntP2 = this.LIZ.LLJILJIL;
        if (interfaceC1452170ntP2 != null) {
            jTe = interfaceC1452170ntP2.Te(i);
        } else {
            jTe = 0;
        }
        this.LIZ.getClass();
        View view = null;
        if (z) {
            C19762612Tw c19762612Tw = this.LIZ;
            c19762612Tw.LLJJJ = null;
            MutableLiveData<C1452730nuJ> mutableLiveData = c19762612Tw.LLJLILLLLZIIL;
            if (mutableLiveData == null) {
                mutableLiveData = null;
            }
            mutableLiveData.setValue(C1452730nuJ.LIZLLL(jTe));
            MutableLiveData<C1452730nuJ> mutableLiveData2 = this.LIZ.LLJLILLLLZIIL;
            if (mutableLiveData2 == null) {
                mutableLiveData2 = null;
            }
            mutableLiveData2.setValue(C1452730nuJ.LIZJ());
            View view2 = this.LIZ.LLL;
            if (view2 != null) {
                view = view2;
            }
            C786410Ut5.LJLLLLLL(0, view);
        } else {
            MutableLiveData<C1452730nuJ> mutableLiveData3 = this.LIZ.LLJLILLLLZIIL;
            if (mutableLiveData3 == null) {
                mutableLiveData3 = null;
            }
            mutableLiveData3.setValue(C1452730nuJ.LIZIZ(jTe));
            MutableLiveData<C1452730nuJ> mutableLiveData4 = this.LIZ.LLJLILLLLZIIL;
            if (mutableLiveData4 == null) {
                mutableLiveData4 = null;
            }
            mutableLiveData4.setValue(C1452730nuJ.LIZJ());
            View view3 = this.LIZ.LLL;
            if (view3 != null) {
                view = view3;
            }
            C786410Ut5.LJLLLLLL(4, view);
        }
        this.LIZ.LLLJ().setValue(Long.valueOf(j));
    }
}
