package X;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0msn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1413350msn {
    public static final ConcurrentHashMap<LifecycleOwner, CopyOnWriteArraySet<String>> LJIIJJI = new ConcurrentHashMap<>();
    public static final HashMap<LifecycleOwner, LifecycleEventObserver> LJIIL = new HashMap<>();
    public final View LIZ;
    public final LifecycleOwner LIZIZ;
    public String LIZJ;
    public Function1<? super View, Unit> LIZLLL;
    public boolean LJI;
    public boolean LJII;
    public volatile AnonymousClass0956 LJIIIIZZ;
    public final Rect LJ = new Rect();
    public long LJFF = SystemClock.elapsedRealtime();
    public final ViewTreeObserverOnPreDrawListenerC1466700oGq LJIIIZ = new ViewTreeObserverOnPreDrawListenerC1466700oGq(this, 0);
    public final ViewOnAttachStateChangeListenerC1466610oGh LJIIJ = new ViewOnAttachStateChangeListenerC1466610oGh(this, 0);

    public final void LIZ() {
        boolean globalVisibleRect;
        this.LJFF = SystemClock.elapsedRealtime();
        if (this.LIZ.isShown()) {
            globalVisibleRect = this.LIZ.getGlobalVisibleRect(this.LJ);
            if (globalVisibleRect && !this.LJI && !this.LJII) {
                CopyOnWriteArraySet<String> copyOnWriteArraySet = LJIIJJI.get(this.LIZIZ);
                if (copyOnWriteArraySet != null) {
                    copyOnWriteArraySet.add(this.LIZJ);
                }
                this.LIZLLL.invoke(this.LIZ);
            }
        } else {
            globalVisibleRect = false;
        }
        this.LJI = globalVisibleRect;
    }

    public C1413350msn(View view, LifecycleOwner lifecycleOwner, String str, Function1<? super View, Unit> function1) {
        this.LIZ = view;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = str;
        this.LIZLLL = function1;
    }
}
