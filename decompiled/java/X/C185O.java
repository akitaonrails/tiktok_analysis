package X;

import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.PinCardRefactorSettings;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.185O, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C185O extends C185J<TuxIconView, C212273185f> {
    public final TuxIconView LIZLLL;

    public C185O(TuxIconView tuxIconView) {
        super(tuxIconView);
        this.LIZLLL = tuxIconView;
    }

    public final void LJIIJ(C212273185f c212273185f) {
        if (!PinCardRefactorSettings.LIZ().assistantEnable) {
            LJIIIZ(false);
            return;
        }
        if (Intrinsics.LJFF(c212273185f.LIZ, Boolean.TRUE)) {
            LJIIIZ(true);
            List<Object> list = c212273185f.LIZIZ;
            if (list != null && !list.isEmpty()) {
                this.LIZLLL.setTintColorRes(R.attr.a1j);
                return;
            } else {
                this.LIZLLL.setTintColorRes(R.attr.ne);
                return;
            }
        }
        LJIIIZ(false);
    }
}
