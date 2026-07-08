package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;

/* JADX INFO: renamed from: X.0yU3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859290yU3 implements C0GV2 {
    public final TakoCardAbility LIZ;

    public C1859290yU3(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LIZ = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null);
    }

    @Override // X.C0GV2
    public final void LIZ(View view, InterfaceC1859880yV0 interfaceC1859880yV0, String str, int i, int i2, boolean z) {
        TakoCardAbility takoCardAbility = this.LIZ;
        if (takoCardAbility != null) {
            takoCardAbility.Zp1(view, str, i, z);
        }
    }
}
