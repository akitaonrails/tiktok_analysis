package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS120S0100000_20;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.19Lq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21524819Lq implements InterfaceC1292040jj8 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1292040jj8
    public final void onResult(Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, obj);
                break;
            case 1:
                onResult$1(this, obj);
                break;
            case 2:
                onResult$2(this, obj);
                break;
            case 3:
                onResult$3(this, obj);
                break;
        }
    }

    public C21524819Lq(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(C21524819Lq c21524819Lq, Object obj) {
        AnonymousClass1965 anonymousClass1965 = (AnonymousClass1965) c21524819Lq.l0;
        FrameLayout frameLayout = anonymousClass1965.LLILZ;
        if (frameLayout != null) {
            HandlerHook.viewPostDelay(frameLayout, anonymousClass1965.LLJILJILJ, Mp4ScreenVideoLoadTimeout.CONTROL);
        }
        AnonymousClass1965 anonymousClass19652 = (AnonymousClass1965) c21524819Lq.l0;
        AnonymousClass1963 anonymousClass1963 = anonymousClass19652.LLILLL;
        if (anonymousClass1963 != null) {
            anonymousClass1963.LIZ(false, anonymousClass19652.LL, C196B.LOTTIE);
        }
    }

    public static final void onResult$1(C21524819Lq c21524819Lq, Object obj) {
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        C1295960jpS c1295960jpS = ((AnonymousClass1965) c21524819Lq.l0).LLIZ;
        if (c1295960jpS != null) {
            c1295960jpS.setComposition(c1294720jnS);
        }
        if (AnonymousClass1965.LIZIZ()) {
            AnonymousClass1965 anonymousClass1965 = (AnonymousClass1965) c21524819Lq.l0;
            View view = anonymousClass1965.LLILZIL;
            if (view != null) {
                HandlerHook.viewPostDelay(view, new ARunnableS113S0100000_13(anonymousClass1965, 121), 300L);
            }
            AnonymousClass1965 anonymousClass19652 = (AnonymousClass1965) c21524819Lq.l0;
            FrameLayout frameLayout = anonymousClass19652.LLIZLLLIL;
            if (frameLayout != null) {
                HandlerHook.viewPostDelay(frameLayout, new ARunnableS120S0100000_20(anonymousClass19652, 83), 300L);
            }
        } else {
            AnonymousClass1965 anonymousClass19653 = (AnonymousClass1965) c21524819Lq.l0;
            FrameLayout frameLayout2 = anonymousClass19653.LLIZLLLIL;
            if (frameLayout2 != null) {
                frameLayout2.startAnimation(anonymousClass19653.LLJILLL);
            }
            AnonymousClass1965 anonymousClass19654 = (AnonymousClass1965) c21524819Lq.l0;
            FrameLayout frameLayout3 = anonymousClass19654.LLIZLLLIL;
            if (frameLayout3 != null) {
                HandlerHook.viewPostDelay(frameLayout3, new ARunnableS120S0100000_20(anonymousClass19654, 82), 300L);
            }
        }
        AnonymousClass1965 anonymousClass19655 = (AnonymousClass1965) c21524819Lq.l0;
        AnonymousClass1963 anonymousClass1963 = anonymousClass19655.LLILLL;
        if (anonymousClass1963 != null) {
            anonymousClass1963.LIZ(true, anonymousClass19655.LL, C196B.LOTTIE);
        }
    }

    public static final void onResult$2(C21524819Lq c21524819Lq, Object obj) {
        ((AnonymousClass1964) c21524819Lq.l0).LIZLLL();
        AnonymousClass1964 anonymousClass1964 = (AnonymousClass1964) c21524819Lq.l0;
        AnonymousClass1963 anonymousClass1963 = anonymousClass1964.LLILLL;
        if (anonymousClass1963 != null) {
            anonymousClass1963.LIZ(false, anonymousClass1964.LL, C196B.LOTTIE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onResult$3(X.C21524819Lq r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21524819Lq.onResult$3(X.19Lq, java.lang.Object):void");
    }
}
