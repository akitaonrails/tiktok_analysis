package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupButton;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupResponse;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0zu9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913910zu9 implements InterfaceC1914160zuY {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(424));

    @Override // X.InterfaceC1914160zuY
    public final C15O7<UniversalPopupResponse> LIZIZ() {
        return C15O7.LJIIJ(new UniversalPopupResponse(Collections.singletonList(new UniversalPopup(false, "hu_dnu_consent_box", null, "v1", "pop", ((Context) this.LIZ.getValue()).getString(2131821674), ((Context) this.LIZ.getValue()).getString(2131821672), null, null, null, null, Collections.singletonList(new UniversalPopupButton(((Context) this.LIZ.getValue()).getString(2131821673), new UniversalPopupAction("1", null, null, null, 0, Boolean.TRUE, null, null, true, null, null, false, false, 7902, null), true, 0, true)), null, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, null, false, 134215557, null)), null, 2, null));
    }

    @Override // X.InterfaceC1914160zuY
    public final C15O7<Unit> LIZ(String str, Map<String, String> map) {
        return C15O7.LJIIJ(Unit.LIZ);
    }
}
