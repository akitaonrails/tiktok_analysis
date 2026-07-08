package X;

import X.C098200Yq;
import X.C189200o6;
import X.C1C7U;
import Y.ALAdapterS6S0100000_9;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.anim.AnchorEducationGuideController$handler$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Oa3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621730Oa3 {
    public final List<View> LIZ;
    public final View LIZIZ;
    public Animator LIZJ;
    public final AnchorEducationGuideController$handler$1 LIZLLL;

    public final void LIZ() {
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.cancel();
        }
        this.LIZJ = null;
        Iterator<View> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            C786410Ut5.T4(it2.next(), 1.0f);
        }
        C786410Ut5.LJLLLLLL(8, this.LIZIZ);
    }

    public final void LIZIZ() {
        if (this.LIZJ != null) {
            LIZ();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        for (View view : this.LIZ) {
            arrayList.add(C621740Oa4.LIZ(view.getAlpha(), 0.0f, view));
        }
        Animator animatorLIZIZ = C621740Oa4.LIZIZ(this.LIZIZ.getHeight(), 0.0f, this.LIZIZ);
        animatorLIZIZ.addListener(new ALAdapterS6S0100000_9(this, 13));
        arrayList.add(animatorLIZIZ);
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(C1619980sG4.LJIILIIL());
        animatorSet.setDuration(300L);
        animatorSet.start();
        this.LIZJ = animatorSet;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.anim.AnchorEducationGuideController$handler$1] */
    public C621730Oa3(View view, List list) {
        this.LIZ = list;
        this.LIZIZ = view;
        final Looper mainLooper = Looper.getMainLooper();
        this.LIZLLL = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.anim.AnchorEducationGuideController$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("AnchorEducationGuideController@ffad.handler$1");
                super.handleMessage(message);
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        this.LL.LIZ();
                    }
                } else {
                    try {
                        this.LL.LIZIZ();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                C1C7U.LIZIZ("AnchorEducationGuideController@ffad.handler$1");
            }
        };
    }
}
