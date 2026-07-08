package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Rtt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710470Rtt extends C09AY implements InterfaceC1685420txc<TranslationStatusAssem, C0S5P, Boolean, C0S5R, C0S5N, Unit> {
    public C710470Rtt() {
        super(5);
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(TranslationStatusAssem translationStatusAssem, C0S5P c0s5p, Boolean bool, C0S5R c0s5r, C0S5N c0s5n) {
        TranslationStatusAssem translationStatusAssem2 = translationStatusAssem;
        C0S5P c0s5p2 = c0s5p;
        boolean zBooleanValue = bool.booleanValue();
        C0S5R c0s5r2 = c0s5r;
        C0S5N c0s5n2 = c0s5n;
        View view = translationStatusAssem2.LLLFFI;
        AnonymousClass0956 anonymousClass0956 = translationStatusAssem2.LLLII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (!C2547809ye.LIZ) {
            translationStatusAssem2.Ip(c0s5p2, zBooleanValue, c0s5r2, c0s5n2, view);
        } else if (c0s5p2 instanceof C710270RtZ) {
            translationStatusAssem2.LLLII = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(translationStatusAssem2), null, null, new C710460Rts(translationStatusAssem2, c0s5p2, zBooleanValue, c0s5r2, c0s5n2, view, null), 3);
        } else {
            translationStatusAssem2.LLLII = null;
            translationStatusAssem2.Ip(c0s5p2, zBooleanValue, c0s5r2, c0s5n2, view);
        }
        return Unit.LIZ;
    }
}
