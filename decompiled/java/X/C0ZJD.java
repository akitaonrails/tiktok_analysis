package X;

import X.AnonymousClass0956;
import X.C0ZJ9;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0ZJD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZJD implements InterfaceC899440ZQg {
    public final EnumC1910440zoY LIZ;
    public final View LIZIZ;
    public final SoftReference<View> LJ;
    public final C0ZJE LIZJ = new InterfaceC908170Zjz() { // from class: X.0ZJE
        @Override // X.InterfaceC908170Zjz
        public final void onAccountResult(int i, boolean z, int i2, User user) {
            if (C13LQ.LJJIJIIJI(Integer.valueOf(i), new Integer[]{3, 2}) >= 0 && z) {
                C0ZJD c0zjd = this.LL;
                c0zjd.getClass();
                C15580068c.LIZ.getClass();
                C15580068c.LIZIZ(c0zjd);
                ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZ(c0zjd.LIZJ);
            }
        }
    };
    public final C1231704rr LIZLLL = new C1231704rr("ActivityStatusAccuracyClient", null, 6);
    public final C054G LJFF = C2296808zG.LIZ(new C914180Ztg(CoroutineExceptionHandler.LJJLIL, this, 7));

    @Override // X.InterfaceC899440ZQg
    public final void onInvisible() {
        C15580068c.LIZ.getClass();
        C15580068c.LIZIZ(this);
        EnumC1910440zoY enumC1910440zoY = this.LIZ;
        EnumC1910440zoY enumC1910440zoY2 = EnumC1910440zoY.INBOX_TOP;
        if (enumC1910440zoY != enumC1910440zoY2) {
            return;
        }
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZ(this.LIZJ);
        C0ZJ9.LIZ.getClass();
        ActivityStatusAccuracyImpl activityStatusAccuracyImpl = (ActivityStatusAccuracyImpl) ((LinkedHashMap) C0ZJ9.LIZIZ).get(enumC1910440zoY2);
        if (activityStatusAccuracyImpl != null) {
            activityStatusAccuracyImpl.LJI = false;
            activityStatusAccuracyImpl.LIZ();
        }
    }

    @Override // X.InterfaceC899440ZQg
    public final void onVisible() {
        C15580068c.LIZ.getClass();
        C15580068c.LIZ(this);
        EnumC1910440zoY enumC1910440zoY = this.LIZ;
        EnumC1910440zoY enumC1910440zoY2 = EnumC1910440zoY.INBOX_TOP;
        if (enumC1910440zoY != enumC1910440zoY2) {
            return;
        }
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(this.LIZJ);
        C0ZJ9.LIZ.getClass();
        ActivityStatusAccuracyImpl activityStatusAccuracyImpl = (ActivityStatusAccuracyImpl) ((LinkedHashMap) C0ZJ9.LIZIZ).get(enumC1910440zoY2);
        if (activityStatusAccuracyImpl != null) {
            activityStatusAccuracyImpl.LJI = true;
            activityStatusAccuracyImpl.LIZ();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onNotifyActivityStatusAccuracyInfoCollectionEvent(C694970RNv c694970RNv) {
        View view;
        RecyclerView recyclerView;
        if (c694970RNv.LIZ != this.LIZ || (view = this.LJ.get()) == null) {
            return;
        }
        EnumC1910440zoY enumC1910440zoY = this.LIZ;
        if (enumC1910440zoY == EnumC1910440zoY.LONG_PRESS_PANEL) {
            View view2 = this.LIZIZ;
            if (view2 != null && (view instanceof RecyclerView) && (recyclerView = (RecyclerView) view) != null) {
                C23250099c.LIZLLL(this.LJFF, C0PEM.LIZJ.plus(C2296908zH.LIZ()), null, new C0ZJ6(this, view2, recyclerView, null), 2);
                return;
            }
            return;
        }
        if (view instanceof RecyclerView) {
            C23250099c.LIZLLL(this.LJFF, C0PEM.LIZJ.plus(C2296908zH.LIZ()), null, new C0ZJ5(this, (RecyclerView) view, null), 2);
            return;
        }
        Object tag = view.getTag(R.id.kag);
        if ((tag instanceof C0ZJ8) && tag != null) {
            C0ZJ9 c0zj9 = C0ZJ9.LIZ;
            List listSingletonList = Collections.singletonList(tag);
            c0zj9.getClass();
            C0ZJ9.LJ(enumC1910440zoY, listSingletonList);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ZJE] */
    public C0ZJD(final EnumC1910440zoY enumC1910440zoY, View view, LifecycleOwner lifecycleOwner, Context context, View view2) {
        this.LIZ = enumC1910440zoY;
        this.LIZIZ = view2;
        this.LJ = new SoftReference<>(view);
        C0ZJ9.LIZ.getClass();
        if (C1867550yhN.LIZ()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) C0ZJ9.LIZIZ;
            if (linkedHashMap.get(enumC1910440zoY) == null) {
                ActivityStatusAccuracyImpl activityStatusAccuracyImpl = new ActivityStatusAccuracyImpl(enumC1910440zoY, lifecycleOwner, context);
                lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusPerformanceAnalysisImpl$initActivityStatusAccuracy$1$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        ActivityStatusAccuracyImpl activityStatusAccuracyImplRemove;
                        if (event == Lifecycle.Event.ON_DESTROY && (activityStatusAccuracyImplRemove = C0ZJ9.LIZIZ.remove(enumC1910440zoY)) != null) {
                            activityStatusAccuracyImplRemove.LIZJ("clear");
                            activityStatusAccuracyImplRemove.LIZJ("stop polling");
                            AnonymousClass0956 anonymousClass0956 = activityStatusAccuracyImplRemove.LIZJ;
                            if (anonymousClass0956 != null) {
                                anonymousClass0956.LIZIZ(null);
                            }
                            activityStatusAccuracyImplRemove.LIZJ = null;
                        }
                    }
                });
                linkedHashMap.put(enumC1910440zoY, activityStatusAccuracyImpl);
            }
        }
    }
}
