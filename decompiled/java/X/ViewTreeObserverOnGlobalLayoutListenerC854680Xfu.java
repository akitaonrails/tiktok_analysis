package X;

import Y.ARunnableS113S0100000_13;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.xtrace.BigBitmapCheckKit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Xfu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC854680Xfu implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
            case 5:
                onGlobalLayout$5(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC854680Xfu viewTreeObserverOnGlobalLayoutListenerC854680Xfu) {
        if (((View) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l0).getWidth() <= 0) {
            return;
        }
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC854680Xfu);
        HandlerHook.viewPost((View) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l0, new ARunnableS113S0100000_13((Function0) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l1, (Function0<Unit>) 34));
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC854680Xfu viewTreeObserverOnGlobalLayoutListenerC854680Xfu) {
        C786410Ut5.C3(((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC854680Xfu);
        C1846230y8z.LIZ((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l0, (Bitmap) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l1);
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC854680Xfu viewTreeObserverOnGlobalLayoutListenerC854680Xfu) {
        String resourceName;
        C786410Ut5.C3(((ImageView) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC854680Xfu);
        int width = ((ImageView) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l0).getWidth();
        int height = ((ImageView) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l0).getHeight();
        int iWidth = ((Drawable) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l1).getBounds().width();
        int iHeight = ((Drawable) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l1).getBounds().height();
        if (width != 0 && height != 0 && (iWidth > width * 2 || iHeight > height * 2)) {
            try {
                resourceName = ((ImageView) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l0).getResources().getResourceName(((ImageView) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l0).getId());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                resourceName = null;
            }
            StringBuilder sb = new StringBuilder("drawable size exceeds the limit: view id name: ");
            sb.append(resourceName);
            sb.append(" view width:");
            sb.append(width);
            sb.append(" view height:");
            sb.append(height);
            sb.append(" drawable width:");
            sb.append(iWidth);
            sb.append(" drawable height:");
            sb.append(iHeight);
            if (((Drawable) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l1) instanceof BitmapDrawable) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" bitmap count:");
                sbLIZ.append(((BitmapDrawable) ((Drawable) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l1)).getBitmap().getByteCount());
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
            sb.append("\ncall stack:");
            sb.append(BigBitmapCheckKit.drawableStackMap.get((Drawable) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l1));
            C805380Via.LJFF("LaunchProtectException", "BigBitmapCheckKit", new C806800Vks(sb.toString()));
        }
        BigBitmapCheckKit.drawableStackMap.put((Drawable) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l1, "");
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC854680Xfu viewTreeObserverOnGlobalLayoutListenerC854680Xfu) {
        ViewTreeObserver viewTreeObserver = ((View) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l0).getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC854680Xfu);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC854680Xfu, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        ((C1369580lkC) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l1).LLJJJJJIL = ((View) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l0).getHeight();
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC854680Xfu viewTreeObserverOnGlobalLayoutListenerC854680Xfu) {
        ViewTreeObserver viewTreeObserver;
        View view = ((C1136290ffv) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l0).LJ;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC854680Xfu);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC854680Xfu, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        View view2 = ((C1136290ffv) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l0).LJ;
        if (view2 != null) {
            HandlerHook.viewPostDelay(view2, (Runnable) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l1, 150L);
        }
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC854680Xfu viewTreeObserverOnGlobalLayoutListenerC854680Xfu) {
        C786410Ut5.C3((ViewTreeObserver) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l0, viewTreeObserverOnGlobalLayoutListenerC854680Xfu);
        ((Runnable) viewTreeObserverOnGlobalLayoutListenerC854680Xfu.l1).run();
    }

    public ViewTreeObserverOnGlobalLayoutListenerC854680Xfu(C1136290ffv c1136290ffv, int i) {
        this.$t = i;
        RunnableC787720UvC runnableC787720UvC = new Runnable() { // from class: X.0UvC
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("GiftEffectLayoutHelper@ca40.init$1$1");
                C1C7U.LIZIZ("GiftEffectLayoutHelper@ca40.init$1$1");
            }
        };
        this.l0 = c1136290ffv;
        this.l1 = runnableC787720UvC;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC854680Xfu(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
