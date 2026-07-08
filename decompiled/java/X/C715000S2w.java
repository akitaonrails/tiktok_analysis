package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.mediabox.arch.viewmodel.SimViewModel;

/* JADX INFO: renamed from: X.0S2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715000S2w implements InterfaceC715010S2x {
    public final View LIZ;
    public Fragment LIZIZ;
    public final C714990S2v LIZJ = new C714990S2v();
    public InterfaceC690370R6d LIZLLL;

    public final <T extends C19EG> T LIZIZ() {
        Context context = this.LIZ.getContext();
        if (context instanceof Activity) {
            if (context instanceof C19EG) {
                return (T) context;
            }
            return null;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof C19EG) {
            return (T) baseContext;
        }
        return null;
    }

    @Override // X.InterfaceC715010S2x
    public final LifecycleOwner LLILLIZIL() {
        Fragment fragment = this.LIZIZ;
        return fragment == null ? LIZIZ() : fragment;
    }

    @Override // X.InterfaceC715010S2x
    public final Context context() {
        return this.LIZ.getContext();
    }

    @Override // X.InterfaceC715010S2x
    public final InterfaceC690370R6d LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC715010S2x
    public final C714990S2v LLIIIILZ() {
        return this.LIZJ;
    }

    public C715000S2w(View view) {
        this.LIZ = view;
    }

    @Override // X.InterfaceC715010S2x
    public final <T extends SimViewModel> T LLILLJJLI(Class<T> cls) {
        try {
            return (T) new ViewModelProvider(this.LIZJ).get(cls);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
