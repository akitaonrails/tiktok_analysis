package X;

import android.os.Looper;
import android.os.MessageQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07zL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2042507zL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ Runnable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2042507zL(Object obj, Runnable runnable) {
        super(0);
        this.LL = obj;
        this.LLILLJJLI = runnable;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        int iIntValue = ((Number) C2041907zF.LIZIZ.getValue()).intValue();
        if (iIntValue == 1) {
            HashMap<WeakReference<Object>, Runnable> map = C2041907zF.LIZLLL;
            if (map.isEmpty()) {
                C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.07zM
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        for (Map.Entry<WeakReference<Object>, Runnable> entry : C2041907zF.LIZLLL.entrySet()) {
                            WeakReference<Object> key = entry.getKey();
                            Runnable value = entry.getValue();
                            if (key.get() != null) {
                                value.run();
                            }
                        }
                        C2041907zF.LIZLLL.clear();
                        return false;
                    }
                }, Looper.myQueue());
            }
            map.put(new WeakReference<>(this.LL), this.LLILLJJLI);
        } else if (iIntValue == 2) {
            if (C2041907zF.LJFF) {
                this.LLILLJJLI.run();
            } else {
                Map<Object, Runnable> map2 = C2041907zF.LJ;
                if (map2.isEmpty()) {
                    C786410Ut5.LJLIIL(10000L, C2113808Pw.LIZIZ.LL, new Runnable() { // from class: X.07zJ
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("FYPAnimationDelayExperiment@e730.delayStartAnimation$1$2");
                            try {
                                if (!C2041907zF.LJFF && ((Boolean) C2041907zF.LIZJ.getValue()).booleanValue()) {
                                    C2041907zF.LIZIZ(new C2042407zK());
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("FYPAnimationDelayExperiment@e730.delayStartAnimation$1$2");
                        }
                    });
                }
                map2.put(this.LL, this.LLILLJJLI);
            }
        }
        return Unit.LIZ;
    }
}
