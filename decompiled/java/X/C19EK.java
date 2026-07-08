package X;

import Y.ARunnableS132S0100000_32;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19EK, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19EK extends DialogC19728412Gs implements LifecycleOwner, InterfaceC1671500tbA, C128Y {
    public LifecycleRegistry LL;
    public final C197065128h LLILLJJLI;
    public final OnBackPressedDispatcher LLILLL;

    public Lifecycle getLifecycle() {
        LifecycleRegistry lifecycleRegistry = this.LL;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this);
        this.LL = lifecycleRegistry2;
        return lifecycleRegistry2;
    }

    @Override // X.C128Y
    public final C197066128i getSavedStateRegistry() {
        return this.LLILLJJLI.LIZIZ;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.LLILLL.LJ();
    }

    @Override // android.app.Dialog
    public void onStop() {
        LifecycleRegistry lifecycleRegistry = this.LL;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this);
            this.LL = lifecycleRegistry;
        }
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.LL = null;
        super.onStop();
    }

    public final void LJJLIIIJLLLLLLLZ() {
        ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        C1688560u2g.LIZIZ(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        this.LLILLJJLI.LIZIZ(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        LifecycleRegistry lifecycleRegistry = this.LL;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this);
            this.LL = lifecycleRegistry;
        }
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        C1389600mGU.LIZJ(this);
    }

    @Override // X.InterfaceC1671500tbA
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.LLILLL;
    }

    public static void LJJLIIJ(C19EK c19ek) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.LLILLL;
            onBackPressedDispatcher.LJFF = getOnBackInvokedDispatcher();
            onBackPressedDispatcher.LJFF(onBackPressedDispatcher.LJII);
        }
        this.LLILLJJLI.LIZ(bundle);
        LifecycleRegistry lifecycleRegistry = this.LL;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this);
            this.LL = lifecycleRegistry;
        }
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        LJJLIIIJLLLLLLLZ();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        LJJLIIIJLLLLLLLZ();
        super.setContentView(view);
    }

    public C19EK(Context context, int i) {
        super(context, i);
        this.LLILLJJLI = C197069128l.LIZ(this);
        this.LLILLL = new OnBackPressedDispatcher(new ARunnableS132S0100000_32(this, 5));
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LJJLIIIJLLLLLLLZ();
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LJJLIIIJLLLLLLLZ();
        super.setContentView(view, layoutParams);
    }
}
