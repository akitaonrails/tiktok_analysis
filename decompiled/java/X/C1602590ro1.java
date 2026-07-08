package X;

import com.ss.android.ugc.aweme.ab.CardCepConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ro1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602590ro1 extends C09AY implements Function0<CardCepConfig> {
    public C1602590ro1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ab.CardCepConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final CardCepConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        CardCepConfig cardCepConfig = C1602480rnq.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(CardCepConfig.class, cardCepConfig, "live_preview_card_hot_refresh_use_cep_config", true);
        return LJJII != 0 ? LJJII : cardCepConfig;
    }
}
