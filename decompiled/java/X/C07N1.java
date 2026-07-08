package X;

import com.ss.android.ugc.aweme.ad.recording.settings.AdLandPagePreClickRuleModel;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07N1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07N1 extends C09AY implements Function0<Set<? extends String>> {
    public C07N1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends String> invoke() {
        Set<String> rules = ((AdLandPagePreClickRuleModel) C1851507Mz.LIZIZ.getValue()).getRules();
        return rules == null ? C08CX.INSTANCE : rules;
    }
}
