package X;

import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0vf5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1750810vf5 {
    public final PdpViewModel LIZ;

    public C1750810vf5(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
    }

    public static void LIZJ(int i, View view) {
        if (view instanceof C1753460vjM) {
            ((C1753460vjM) view).setIconRes(i);
        } else {
            if (!(view instanceof TuxIconView)) {
                return;
            }
            ((TuxIconView) view).setIconRes(i);
        }
    }

    public final void LIZIZ(View view, String str) {
        if (str != null) {
            C919503ib.LIZIZ(view.getContext(), str, C2097608Jq.LJIIIIZZ(new Pair("source_previous_page", "product_detail"), new Pair("previous_page", "product_detail"), new Pair("enter_from", this.LIZ.HR2()), new Pair("init_time", Long.valueOf(System.currentTimeMillis()))), false).open();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102 A[PHI: r5
      0x0102: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v6 java.lang.String) binds: [B:50:0x00fe, B:8:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107 A[PHI: r4 r5
      0x0107: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:53:0x0103, B:11:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v5 java.lang.String) binds: [B:53:0x0103, B:11:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.view.View r14, com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX r15) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1750810vf5.LIZLLL(android.view.View, com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX):void");
    }

    public final void LIZ(View view, Map map, boolean z) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LIZ), C0PEM.LIZJ, null, new C1750580vei(view, this, z, map, null), 2);
        this.LIZ.LLLILZJ = Boolean.valueOf(z);
        this.LIZ.setState(new AwS605S0100000_26(this, 531));
    }
}
