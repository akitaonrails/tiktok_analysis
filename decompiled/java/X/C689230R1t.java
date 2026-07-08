package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0R1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689230R1t implements InterfaceC328600CuQ {
    public final TakoCardAbility LIZ;

    @Override // X.InterfaceC328600CuQ
    public final void LIZIZ(View view, InterfaceC431020GvE interfaceC431020GvE, List<? extends CharSequence> list, Map<String, ? extends Object> map) {
    }

    public C689230R1t(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LIZ = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null);
    }

    @Override // X.InterfaceC328600CuQ
    public final void LIZ(View view, InterfaceC431020GvE interfaceC431020GvE, CharSequence charSequence, CharSequence charSequence2) {
        TakoCardAbility takoCardAbility = this.LIZ;
        if (takoCardAbility != null) {
            takoCardAbility.Ez(charSequence2, charSequence);
        }
    }
}
