package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.components.video.doublecolumn.TakoDoubleColumnVideoListAssem;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.16HD, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HD implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
        }
    }

    public C16HD(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(C16HD c16hd, View view) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) c16hd.l0;
        viewOnAttachStateChangeListenerC20631115oD.hasAlreadyAttached = true;
        viewOnAttachStateChangeListenerC20631115oD.attachedView = view;
    }

    public static final void onViewAttachedToWindow$1(C16HD c16hd, View view) {
        TakoDoubleColumnVideoListAssem takoDoubleColumnVideoListAssem = (TakoDoubleColumnVideoListAssem) c16hd.l0;
        takoDoubleColumnVideoListAssem.getClass();
        if (!EventBus.LIZLLL().LJIIJ(takoDoubleColumnVideoListAssem)) {
            EventBus.LIZLLL().LJIJJ(takoDoubleColumnVideoListAssem);
        }
    }

    public static final void onViewDetachedFromWindow$0(C16HD c16hd, View view) {
        ((ViewOnAttachStateChangeListenerC20631115oD) c16hd.l0).hasAlreadyAttached = false;
    }

    public static final void onViewDetachedFromWindow$1(C16HD c16hd, View view) {
        TakoDoubleColumnVideoListAssem takoDoubleColumnVideoListAssem = (TakoDoubleColumnVideoListAssem) c16hd.l0;
        takoDoubleColumnVideoListAssem.getClass();
        if (EventBus.LIZLLL().LJIIJ(takoDoubleColumnVideoListAssem)) {
            EventBus.LIZLLL().LJJI(takoDoubleColumnVideoListAssem);
        }
    }
}
