package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.config.GlobalLayoutChangeObserverViewModel;
import com.ss.android.ugc.aweme.config.GlobalLayoutChangeObserverViewModel$addObserver$1;
import com.ss.android.ugc.aweme.config.RootFragmentFixLeakKt$addOnGlobalLayoutListenerFixLeak$2;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS411S0200000_10;

/* JADX INFO: renamed from: X.0P92, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P92 {
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0P93, android.view.ViewTreeObserver$OnGlobalLayoutListener] */
    public static final AwS411S0200000_10 LIZ(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        C19EG c19egLIZIZ;
        C19EG c19egLIZIZ2;
        View view2;
        if (view == null) {
            return null;
        }
        if (((Boolean) C286190BJp.LIZIZ.getValue()).booleanValue()) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            Context context = view.getContext();
            if (context != null) {
                c19egLIZIZ2 = C1388190mED.LIZIZ(context);
            } else {
                c19egLIZIZ2 = null;
            }
            sAFHelper.getClass();
            Fragment fragmentLJJIIZI = SAFHelper.LJJIIZI(view, c19egLIZIZ2);
            if (fragmentLJJIIZI != null && (view2 = fragmentLJJIIZI.getView()) != null) {
                GlobalLayoutChangeObserverViewModel globalLayoutChangeObserverViewModel = (GlobalLayoutChangeObserverViewModel) ViewModelProviders.of(fragmentLJJIIZI).get(GlobalLayoutChangeObserverViewModel.class);
                synchronized (globalLayoutChangeObserverViewModel) {
                    if (!globalLayoutChangeObserverViewModel.LL) {
                        final List<ViewTreeObserver.OnGlobalLayoutListener> list = globalLayoutChangeObserverViewModel.LLILLJJLI;
                        ?? r2 = new ViewTreeObserver.OnGlobalLayoutListener(list) { // from class: X.0P93
                            public final List<ViewTreeObserver.OnGlobalLayoutListener> LL;

                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public final void onGlobalLayout() {
                                Iterator<ViewTreeObserver.OnGlobalLayoutListener> it2 = this.LL.iterator();
                                while (it2.hasNext()) {
                                    it2.next().onGlobalLayout();
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                this.LL = list;
                            }
                        };
                        C786410Ut5.x3(view2.getViewTreeObserver(), r2);
                        fragmentLJJIIZI.getLifecycle().addObserver(new GlobalLayoutChangeObserverViewModel$addObserver$1(view2, r2));
                        globalLayoutChangeObserverViewModel.LL = true;
                    }
                    ((ArrayList) globalLayoutChangeObserverViewModel.LLILLJJLI).add(onGlobalLayoutListener);
                }
                return new AwS411S0200000_10(globalLayoutChangeObserverViewModel, onGlobalLayoutListener, 66);
            }
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        SAFHelper sAFHelper2 = SAFHelper.LIZ;
        Context context2 = view.getContext();
        if (context2 != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context2);
        } else {
            c19egLIZIZ = null;
        }
        sAFHelper2.getClass();
        Lifecycle lifecycleLJIILLIIL = SAFHelper.LJIILLIIL(view, c19egLIZIZ);
        if (lifecycleLJIILLIIL != null) {
            lifecycleLJIILLIIL.addObserver(new RootFragmentFixLeakKt$addOnGlobalLayoutListenerFixLeak$2(view, onGlobalLayoutListener));
        }
        return null;
    }
}
