package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.viewmodel.SingleLiveEvent;

/* JADX INFO: renamed from: X.0qN5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1547450qN5 implements InterfaceC1541510qDV {
    public LiveData<NetworkResponse<MinisMetaResp>> LIZ;
    public final C1546260qLA LIZIZ;
    public final C0WTF LIZJ = new C0WTF();
    public InterfaceC1541780qDw LIZLLL = new C1547230qMj();
    public final C1547460qN6 LJ;

    @Override // X.InterfaceC1541510qDV
    public boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC1541510qDV
    public boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC1541510qDV
    public void LJ() {
        this.LIZLLL = null;
    }

    @Override // X.InterfaceC1541510qDV
    public InterfaceC1541770qDv LJFF() {
        return null;
    }

    @Override // X.InterfaceC1541510qDV
    public boolean LJII() {
        return false;
    }

    @Override // X.InterfaceC1541510qDV
    public String name() {
        return "Minis";
    }

    @Override // X.InterfaceC1541510qDV
    public InterfaceC1536300q56 LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1541510qDV
    public InterfaceC1541780qDw LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1541510qDV
    public InterfaceC1543050qFz LJI() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1541510qDV
    public InterfaceC1059260dfg LJIIIIZZ() {
        return this.LIZJ;
    }

    public C1547450qN5(MutableLiveData mutableLiveData) {
        this.LIZ = mutableLiveData;
        this.LIZIZ = new C1546260qLA(this.LIZ);
        this.LJ = new C1547460qN6(this.LIZ);
    }

    public void LJIIIZ(SingleLiveEvent singleLiveEvent) {
        C1547460qN6 c1547460qN6;
        C1546260qLA c1546260qLA;
        this.LIZ = singleLiveEvent;
        InterfaceC1543050qFz interfaceC1543050qFzLJI = LJI();
        if ((interfaceC1543050qFzLJI instanceof C1546260qLA) && (c1546260qLA = (C1546260qLA) interfaceC1543050qFzLJI) != null) {
            c1546260qLA.LIZ = singleLiveEvent;
        }
        InterfaceC1536300q56 interfaceC1536300q56LIZ = LIZ();
        if ((interfaceC1536300q56LIZ instanceof C1547460qN6) && (c1547460qN6 = (C1547460qN6) interfaceC1536300q56LIZ) != null) {
            c1547460qN6.LIZ = singleLiveEvent;
        }
    }
}
