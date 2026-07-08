package X;

import Y.ARunnableS129S0100000_29;
import android.text.Editable;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.12Ud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19763312Ud extends C19763812Ui {
    public final /* synthetic */ C12UW LL;

    public C19763312Ud(C12UW c12uw) {
        this.LL = c12uw;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        HandlerHook.viewPost(this.LL.LLJILJILJ, new ARunnableS129S0100000_29(this, 244));
    }
}
