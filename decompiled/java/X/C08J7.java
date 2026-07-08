package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.08J7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08J7 extends LinearLayout implements LifecycleEventObserver {
    public final TuxIconView LL;
    public final FrameLayout LLILLJJLI;
    public LifecycleOwner LLILLL;
    public String LLILZ;

    public C08J7(Context context) {
        super(context, null, 0);
        this.LLILZ = "";
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bnd, this, true);
        this.LL = (TuxIconView) findViewById(R.id.bn0);
        this.LLILLJJLI = (FrameLayout) findViewById(R.id.eqx);
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.LLILLL = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle lifecycle;
        if (C2023307wF.LIZ[event.ordinal()] == 1) {
            LifecycleOwner lifecycleOwner2 = this.LLILLL;
            if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            this.LLILLL = null;
        }
    }
}
