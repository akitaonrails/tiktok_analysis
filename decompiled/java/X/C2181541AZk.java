package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicLayoutLeakFixSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181541AZk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2181481AZe LL;
    public final /* synthetic */ C2181561AZm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181541AZk(C2181481AZe c2181481AZe, C2181561AZm c2181561AZm) {
        super(0);
        this.LL = c2181481AZe;
        this.LLILLJJLI = c2181561AZm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2181481AZe c2181481AZe = this.LL;
        if (c2181481AZe != null) {
            C20441214yg.LIZIZ(c2181481AZe.LLILZ, "destroy, clear all view cache");
            List<View> listLLIIII = C13LP.LLIIII(c2181481AZe.LLILZIL.values());
            c2181481AZe.LLILZIL.clear();
            for (View view : listLLIIII) {
                try {
                    if (c2181481AZe.LJJII(view)) {
                        C500260Jjc.LJJJLL(view);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c2181481AZe.LLILZ);
                    sbLIZ.append("_onDestroyView");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    String strValueOf = String.valueOf(th.getMessage());
                    if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                        C20441214yg.LJ(strLIZIZ, strValueOf);
                    }
                }
            }
            List<C2182161Aak> listLLIIII2 = C13LP.LLIIII(c2181481AZe.LLILZLL.values());
            c2181481AZe.LLILZLL.clear();
            for (C2182161Aak c2182161Aak : listLLIIII2) {
                try {
                    c2182161Aak.LIZIZ.LJIIJ();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c2181481AZe.LLILZ);
                    sbLIZ2.append("_onDestroyRTCView");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    String strValueOf2 = String.valueOf(th2.getMessage());
                    if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                        C20441214yg.LJ(strLIZIZ2, strValueOf2);
                    }
                }
                c2182161Aak.LIZIZ.LJIIJJI();
            }
            C21614919iV c21614919iV = c2181481AZe.LLJ;
            if (c21614919iV != null) {
                C500260Jjc.LJJJLL(c21614919iV);
                c2181481AZe.LLJ = null;
            }
            FrameLayout frameLayout = c2181481AZe.LLJILJIL;
            if (frameLayout != null) {
                if (c2181481AZe.LJJII(frameLayout)) {
                    C500260Jjc.LJJJLL(frameLayout);
                }
                c2181481AZe.LLJILJIL = null;
                c2181481AZe.LLJIJIL = 0L;
            }
            c2181481AZe.LLILZIL.remove(Long.valueOf(c2181481AZe.LLJI));
            c2181481AZe.LLJI = 0L;
            if (LinkmicLayoutLeakFixSetting.INSTANCE.getValue()) {
                FrameLayout frameLayout2 = c2181481AZe.LLIZLLLIL;
                if (frameLayout2 != null) {
                    C500260Jjc.LJJJLL(frameLayout2);
                }
                c2181481AZe.LLIZLLLIL = null;
            }
        }
        C2181561AZm c2181561AZm = this.LLILLJJLI;
        if (c2181561AZm != null) {
            c2181561AZm.LIZIZ();
        }
        return Unit.LIZ;
    }
}
