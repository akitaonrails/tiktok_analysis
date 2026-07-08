package X;

import Y.ALAdapterS7S0100000_10;
import android.content.Context;
import android.view.KeyEvent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0QhN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C677230QhN extends LinearLayout implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public SmartImageView LL;
    public LinearLayout LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public WeakReference<Lifecycle> LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public boolean LLJI;
    public String LLJIJIL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    private final LinearLayout getActionList() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.u2b);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final void LIZ() {
        if (this.LLJI || getVisibility() == 8) {
            return;
        }
        this.LLJI = true;
        AnonymousClass0956 anonymousClass0956 = this.LLIZLLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLIZLLLIL = null;
        animate().alpha(0.0f).setDuration(150L).setInterpolator(new LinearInterpolator()).setListener(new ALAdapterS7S0100000_10(this, 0)).start();
    }

    public final SmartImageView getScreenshotImage() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.u2c);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(final com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r14) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C677230QhN.LIZIZ(com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams):void");
    }

    public final void LIZJ(PhotoSearchEnterParams photoSearchEnterParams) {
        C03DZ.LIZJ(this);
        animate().alpha(1.0f).setDuration(150L).setInterpolator(new LinearInterpolator()).setListener(new ALAdapterS7S0100000_10(this, 1)).start();
        C675940QfI.LIZIZ("find_similar_tab_show", photoSearchEnterParams, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        C356901a3.LIZIZ(this, lifecycleOwner);
        animate().cancel();
        AnonymousClass0956 anonymousClass0956 = this.LLIZLLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLIZLLLIL = null;
        AnonymousClass0956 anonymousClass09562 = this.LLJ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLJ = null;
        WeakReference<Lifecycle> weakReference = this.LLIZ;
        if (weakReference != null && (lifecycle = weakReference.get()) != null) {
            lifecycle.removeObserver(this);
        }
        WeakReference<Lifecycle> weakReference2 = this.LLIZ;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
    }

    public C677230QhN(int i, Context context) {
        super(context, null, 0);
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(132));
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LLILZIL = iLIZIZ2;
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        C0H1U.LIZIZ(this);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(iLIZIZ);
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = i + iLIZIZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setOrientation(1);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zb);
        setBackground(c384050F3z.LIZ(context));
        setPadding(iLIZIZ2, iLIZIZ2, iLIZIZ2, iLIZIZ2);
        LinearLayout.inflate(context, R.layout.boh, this);
    }
}
