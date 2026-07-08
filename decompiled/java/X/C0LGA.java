package X;

import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0LGA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LGA extends Scene implements InterfaceC379610EuV {
    public final C1DRG LLJI;
    public BPEAHandler LLJIJIL;
    public TuxTextView LLJILJIL;

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        BPEAHandler bPEAHandler = this.LLJIJIL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C0LGA(C1DRG c1drg) {
        this.LLJI = c1drg;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJIJIL = new BPEAHandler(Looper.getMainLooper());
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJILJIL = (TuxTextView) view.findViewById(R.id.tv_record_in_progress);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.oj, viewGroup, false);
    }
}
