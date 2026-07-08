package X;

import Y.ARunnableS135S0100000_35;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.1DOI, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DOI implements InterfaceC1464200oCo {
    public final /* synthetic */ VEEditor LL;
    public final /* synthetic */ C1DOH LLILLJJLI;

    public C1DOI(VEEditor vEEditor, C1DOH c1doh) {
        this.LL = vEEditor;
        this.LLILLJJLI = c1doh;
    }

    @Override // X.InterfaceC1464200oCo
    public final void onCallback(int i, int i2, float f, String str) {
        new BPEAThread(new ARunnableS135S0100000_35(this, 21)).start();
    }
}
