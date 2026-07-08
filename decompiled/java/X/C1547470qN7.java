package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.viewmodel.SingleLiveEvent;

/* JADX INFO: renamed from: X.0qN7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547470qN7 extends C1547450qN5 {
    public LiveData<NetworkResponse<MinisMetaResp>> LJFF;
    public final C1546230qL7 LJI;
    public final C0WTF LJII;
    public InterfaceC1541780qDw LJIIIIZZ;
    public final C1547480qN8 LJIIIZ;

    @Override // X.C1547450qN5, X.InterfaceC1541510qDV
    public final void LJ() {
        this.LJIIIIZZ = null;
    }

    @Override // X.C1547450qN5, X.InterfaceC1541510qDV
    public final InterfaceC1541770qDv LJFF() {
        return null;
    }

    @Override // X.C1547450qN5, X.InterfaceC1541510qDV
    public final String name() {
        return "Minigame";
    }

    @Override // X.C1547450qN5, X.InterfaceC1541510qDV
    public final InterfaceC1536300q56 LIZ() {
        return this.LJIIIZ;
    }

    @Override // X.C1547450qN5, X.InterfaceC1541510qDV
    public final InterfaceC1541780qDw LIZIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C1547450qN5, X.InterfaceC1541510qDV
    public final InterfaceC1543050qFz LJI() {
        return this.LJI;
    }

    @Override // X.C1547450qN5, X.InterfaceC1541510qDV
    public final InterfaceC1059260dfg LJIIIIZZ() {
        return this.LJII;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0qN8] */
    public C1547470qN7(MutableLiveData mutableLiveData) {
        super(mutableLiveData);
        this.LJFF = mutableLiveData;
        this.LJI = new C1546230qL7(this.LJFF);
        this.LJII = new C0WTF();
        this.LJIIIIZZ = new C1547230qMj();
        this.LJIIIZ = new InterfaceC1536300q56() { // from class: X.0qN8
            @Override // X.InterfaceC1536300q56
            public final boolean LIZ(C1537480q70 c1537480q70, InterfaceC1541510qDV interfaceC1541510qDV, WebView webView, WebResourceRequest webResourceRequest) {
                return false;
            }

            @Override // X.InterfaceC1536300q56
            public final boolean LIZIZ(C1537480q70 c1537480q70, InterfaceC1541510qDV interfaceC1541510qDV, WebView webView, String str) {
                return false;
            }

            @Override // X.InterfaceC1536300q56
            public final void LIZJ(C1537480q70 c1537480q70, InterfaceC1541510qDV interfaceC1541510qDV, WebView webView, String str) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPageStarted，url:");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }

    @Override // X.C1547450qN5
    public final void LJIIIZ(SingleLiveEvent singleLiveEvent) {
        this.LJFF = singleLiveEvent;
        C1546230qL7 c1546230qL7 = this.LJI;
        if ((c1546230qL7 instanceof C1546230qL7) && c1546230qL7 != null) {
            c1546230qL7.LIZ = singleLiveEvent;
        }
    }
}
