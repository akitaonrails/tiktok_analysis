package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.05g6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1413605g6 {
    public final InterfaceC497601wk LIZ;
    public final MutableLiveData<Integer> LIZIZ;
    public final MutableLiveData<Boolean> LIZJ;

    public C1413605g6(InterfaceC497601wk interfaceC497601wk) {
        int i;
        this.LIZ = interfaceC497601wk;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.LIZIZ = mutableLiveData;
        this.LIZJ = new MutableLiveData<>(Boolean.FALSE);
        if (C1888220zEi.LIZIZ.LIZLLL()) {
            i = 1;
        } else {
            i = 0;
        }
        mutableLiveData.setValue(i);
    }

    public final void LIZ(int i, View view) {
        Integer value = this.LIZIZ.getValue();
        if (value != null && value.intValue() == i) {
            return;
        }
        this.LIZJ.setValue(Boolean.TRUE);
        Integer value2 = this.LIZIZ.getValue();
        this.LIZIZ.setValue(Integer.valueOf(i));
        C23250099c.LIZLLL(this.LIZ, null, null, new C1413505g5(i, this, view, value2, null), 3);
    }
}
