package com.bytedance.android.live.design.view.sheet;

import X.C1145100fu8;
import X.C19322210ia;
import X.C20484615Do;
import X.InterfaceC1107740evs;
import X.InterfaceC20484815Dq;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LifecycleAwareDialog;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes29.dex */
public class LiveSheetDialog extends LifecycleAwareDialog implements InterfaceC1107740evs {
    public C19322210ia LLJILJIL;
    public LiveSheetHostFragment LLJILJILJ;
    public boolean LLJILLL;
    public String LLJJ;

    @Override // X.C19GJ
    public final boolean LJLI() {
        return true;
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C19EK, android.app.Dialog
    public final void onBackPressed() {
        C19322210ia c19322210ia = this.LLJILJIL;
        if (c19322210ia == null) {
            super.onBackPressed();
            return;
        }
        C20484615Do c20484615Do = c19322210ia.LIZ.LL;
        if (((ArrayList) c20484615Do.LJ).isEmpty()) {
            return;
        }
        InterfaceC20484815Dq interfaceC20484815Dq = (InterfaceC20484815Dq) ListProtector.get(c20484615Do.LJ, ((ArrayList) r1).size() - 1);
        if (interfaceC20484815Dq.isCancelable()) {
            interfaceC20484815Dq.sl();
        }
    }

    public int LJLIIIL() {
        return (getContext().getResources().getConfiguration().orientation == 1 || this.LLJILLL) ? R.style.as : getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? R.style.au : R.style.at;
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, X.C19GJ, X.C19GU, X.C19EK, android.app.Dialog
    public final void onStop() {
        super.onStop();
        this.LLJILJILJ = null;
        this.LLJILJIL = null;
    }

    @Override // X.InterfaceC1107740evs
    public final String getTag() {
        return this.LLJJ;
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
            window.setWindowAnimations(LJLIIIL());
            C1145100fu8.LIZ(window);
        }
        getContext().getTheme().resolveAttribute(android.R.attr.backgroundDimAmount, new TypedValue(), true);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        C20484615Do c20484615Do;
        super.onWindowFocusChanged(z);
        LiveSheetHostFragment liveSheetHostFragment = this.LLJILJILJ;
        if (liveSheetHostFragment != null && (c20484615Do = liveSheetHostFragment.LL) != null) {
            Iterator it2 = ((ArrayList) c20484615Do.LJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC20484815Dq) it2.next()).onWindowFocusChanged(z);
            }
        }
    }

    public LiveSheetDialog(Context context, int i) {
        super(context, i);
    }
}
