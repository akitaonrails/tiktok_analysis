package Y;

import X.C098200Yq;
import X.C0C9A;
import X.C0DR0;
import X.C0GV2;
import X.C0GV3;
import X.C189200o6;
import X.C19I8;
import X.C1C7U;
import X.C21419418s4;
import X.C259800zU;
import X.C339070DQz;
import X.C418440Gaw;
import X.C688690Qzr;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC328600CuQ;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS3S0500000_4 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Function0<Unit> function0;
        C339070DQz c339070DQz = (C339070DQz) this.l0;
        C21419418s4 c21419418s4 = c339070DQz.LJIIIIZZ;
        if (c21419418s4 != null) {
            ((C688690Qzr) this.l1).LJJLIIIIJ(c339070DQz.LIZJ, c21419418s4, (InterfaceC328600CuQ) this.l2, (C0GV2) this.l3, (C0GV3) this.l4, c339070DQz.LJIIJ, false, false, null, false);
        }
        ((C688690Qzr) this.l1).LLLIIIL.reset();
        C0DR0 c0dr0 = ((C339070DQz) this.l0).LJIIIZ;
        if (c0dr0 != null && (function0 = c0dr0.LJIIIIZZ) != null) {
            function0.invoke();
        }
        C339070DQz c339070DQz2 = (C339070DQz) this.l0;
        c339070DQz2.LJII = null;
        c339070DQz2.LJIIIIZZ = null;
        c339070DQz2.LJIIIZ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$1() {
        int top = ((ViewOnAttachStateChangeListenerC20604515jv) this.l1).getTop() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        View view = (View) ((C259800zU) this.l2).element;
        float top2 = top - (view != null ? view.getTop() : ((C19I8) this.l3).getTop() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        C786410Ut5.ed((View) this.l4, top2);
        C19I8 c19i8 = (C19I8) this.l3;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19i8);
        c19i8.setTranslationY(top2);
    }

    public static final void run$0(ARunnableS3S0500000_4 aRunnableS3S0500000_4) {
        boolean zLIZ;
        C1C7U.LIZ("XBridgeAPIRequestUtils@6430.handleSuccess$2");
        try {
            try {
                ((C0C9A) aRunnableS3S0500000_4.l0).LIZIZ((JSONObject) aRunnableS3S0500000_4.l1, (LinkedHashMap) aRunnableS3S0500000_4.l2, (Integer) aRunnableS3S0500000_4.l3, (Integer) aRunnableS3S0500000_4.l4);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XBridgeAPIRequestUtils@6430.handleSuccess$2");
    }

    public static final void run$1(ARunnableS3S0500000_4 aRunnableS3S0500000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MarkdownTextStreamManager@4797.finishTyping$1");
        try {
            aRunnableS3S0500000_4.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MarkdownTextStreamManager@4797.finishTyping$1");
    }

    public static final void run$2(ARunnableS3S0500000_4 aRunnableS3S0500000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ManageTopicsContentVH@4b24.triggerGuideShow$$inlined$doOnPreDraw$1");
        try {
            aRunnableS3S0500000_4.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ManageTopicsContentVH@4b24.triggerGuideShow$$inlined$doOnPreDraw$1");
    }

    public ARunnableS3S0500000_4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
