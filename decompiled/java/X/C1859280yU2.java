package X;

import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import io.noties.markwon.core.spans.CustomLinkSpan;

/* JADX INFO: renamed from: X.0yU2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859280yU2 implements C0R20 {
    public final TakoCardAbility LIZ;

    public C1859280yU2(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LIZ = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null);
    }

    @Override // X.C0R20
    public final void LIZJ(CustomLinkSpan customLinkSpan, CharSequence charSequence, CharSequence charSequence2) {
        TakoCardAbility takoCardAbility = this.LIZ;
        if (takoCardAbility != null) {
            takoCardAbility.m52(charSequence2, charSequence);
        }
    }
}
