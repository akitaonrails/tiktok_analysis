package X;

import android.app.Activity;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0S0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714460S0u implements C0RR3 {
    public Aweme LL;
    public InterfaceC712550RxF LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public MotionEvent LLJIJIL;
    public MotionEvent LLJILJIL;
    public boolean LLJILJILJ;
    public final /* synthetic */ GestureDetector LLJILLL;
    public final /* synthetic */ InterfaceC714480S0w LLJJ;
    public final /* synthetic */ Handler LLJJI;
    public final /* synthetic */ Fragment LLJJIII;
    public final /* synthetic */ InterfaceC665370Q7z LLJJIJI;

    @Override // X.C0RR3
    public final void Kl(C698900RbE c698900RbE) {
        this.LLILLJJLI = c698900RbE;
    }

    @Override // X.C0RR3
    public final void LJIILIIL(Aweme aweme) {
        this.LL = aweme;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C714460S0u.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C714460S0u(Activity activity, GestureDetector gestureDetector, C714490S0x c714490S0x, WeakHandler weakHandler, Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLJILLL = gestureDetector;
        this.LLJJ = c714490S0x;
        this.LLJJI = weakHandler;
        this.LLJJIII = fragment;
        this.LLJJIJI = interfaceC665370Q7z;
        int scaledDoubleTapSlop = ViewConfiguration.get(activity).getScaledDoubleTapSlop();
        int scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop() * 3;
        this.LLILZIL = scaledTouchSlop;
        this.LLILZLL = scaledTouchSlop * scaledTouchSlop;
        this.LLIZ = scaledDoubleTapSlop * scaledDoubleTapSlop;
        this.LLJILJILJ = false;
    }
}
