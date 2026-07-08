package X;

import Y.ARunnableS72S0200000_3;
import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.Choreographer;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.boot.speeder.SpeederService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.088m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C20686088m extends C20688088o {
    public final List<String> LL = new ArrayList();
    public final /* synthetic */ SpeederService LLILLJJLI;

    public C20686088m(SpeederService speederService) {
        this.LLILLJJLI = speederService;
    }

    @Override // X.C20688088o, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) throws Throwable {
        String strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(activity.getComponentName(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOinbIuAzyJz1/0Bx2F1v7A6eCzcwsSSquHecQ==", null));
        if (((ArrayList) this.LL).contains(strLJJIJIIJIL)) {
            SpeederService.DelegateChoreographerHandler delegateChoreographerHandler = this.LLILLJJLI.LIZLLL;
            if (delegateChoreographerHandler != null) {
                try {
                    Choreographer choreographer = delegateChoreographerHandler.LLILLL;
                    Class<?> cls = AnonymousClass0883.LIZ;
                    try {
                        if (((Handler) C1961107mD.LIZJ(choreographer, "mHandler")) == delegateChoreographerHandler) {
                            Choreographer choreographer2 = delegateChoreographerHandler.LLILLL;
                            try {
                                C1960207m4.LIZIZ(C1960207m4.LIZ(C1961107mD.LIZ(choreographer2.getClass(), "mHandler")), choreographer2, delegateChoreographerHandler.LL);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                Log.getStackTraceString(th);
                            }
                            AnonymousClass0883.LIZIZ(delegateChoreographerHandler, delegateChoreographerHandler.LL);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        Log.getStackTraceString(th2);
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            }
            ((ArrayList) this.LL).remove(strLJJIJIIJIL);
        }
        SpeederService.DelegateViewRootImplHandler delegateViewRootImplHandler = this.LLILLJJLI.LJ;
        if (delegateViewRootImplHandler != null) {
            delegateViewRootImplHandler.LJ();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) throws Throwable {
        super.onActivityPostResumed(activity);
        Choreographer choreographerV2 = C786410Ut5.v2();
        String strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(activity.getComponentName(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOinbIuAzyJz1/0Bx2F1v7A6eCzcwsSSquHecQ==", null));
        if (!((ArrayList) this.LL).contains(strLJJIJIIJIL)) {
            Class<?> cls = AnonymousClass0883.LIZ;
            try {
                Handler handler = (Handler) C1961107mD.LIZJ(choreographerV2, "mHandler");
                if (handler != null) {
                    this.LLILLJJLI.LIZLLL = new SpeederService.DelegateChoreographerHandler(handler, choreographerV2);
                    SpeederService.LIZIZ(handler, this.LLILLJJLI.LIZLLL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Log.getStackTraceString(th);
            }
            ((ArrayList) this.LL).add(strLJJIJIIJIL);
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        if (viewGroup != null) {
            C0X35.LJIIIIZZ(choreographerV2, new ARunnableS72S0200000_3(this, viewGroup, 31));
        }
    }
}
