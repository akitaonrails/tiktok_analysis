package X;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.0l4Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343680l4Q {
    public InterfaceC420801kM LIZ;
    public MutableLiveData<C1342530l2Z> LIZIZ;
    public boolean LIZJ;

    public final void LIZ(C1342530l2Z c1342530l2Z) {
        InterfaceC420801kM interfaceC420801kM = this.LIZ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        MutableLiveData<C1342530l2Z> mutableLiveData = this.LIZIZ;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(c1342530l2Z);
        }
        this.LIZJ = false;
        this.LIZ = null;
        this.LIZIZ = null;
    }
}
