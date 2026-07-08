package X;

import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.PinCardRefactorSettings;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.183i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212224183i extends AbstractC212220183e<TuxIconView, C212237183v> {
    public final TuxIconView LJ;

    public C212224183i(TuxIconView tuxIconView) {
        super(tuxIconView, "assistant_switch");
        this.LJ = tuxIconView;
    }

    public final void LJIIJJI(C212237183v c212237183v) {
        if (!PinCardRefactorSettings.LIZ().assistantEnable) {
            LJIIJ(false);
            return;
        }
        if (Intrinsics.LJFF(c212237183v.LIZ, Boolean.TRUE)) {
            LJIIJ(true);
            List<Object> list = c212237183v.LIZIZ;
            if (list != null && !list.isEmpty()) {
                this.LJ.setTintColorRes(R.attr.a1j);
                return;
            } else {
                this.LJ.setTintColorRes(R.attr.ne);
                return;
            }
        }
        LJIIJ(false);
    }
}
