package X;

import com.ss.android.ugc.aweme.translation.exp.CLABizCompTranslationConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E8V, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E8V extends C09AY implements Function0<Boolean> {
    public C1E8V() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C1E8U.LIZ() && ((CLABizCompTranslationConfig) C1E8U.LIZIZ.getValue()).enableHalfScreenTranslationAndDntSettingPanels);
    }
}
