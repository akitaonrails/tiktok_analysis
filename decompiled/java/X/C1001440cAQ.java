package X;

import com.ss.android.ugc.aweme.ad.feed.idelpreload.exp.IDLEPreloadSettingModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cAQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001440cAQ extends C09AY implements Function0<EnumC1001450cAR> {
    public C1001440cAQ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final EnumC1001450cAR invoke() {
        int i = ((IDLEPreloadSettingModel) C1001430cAP.LIZIZ.getValue()).failedStrategyType;
        return i != 0 ? i != 1 ? i != 2 ? EnumC1001450cAR.FORCE_RUN : EnumC1001450cAR.DISCARD_AND_STOP_STYLE_SHOW : EnumC1001450cAR.DIRECT_DISCARD : EnumC1001450cAR.FORCE_RUN;
    }
}
