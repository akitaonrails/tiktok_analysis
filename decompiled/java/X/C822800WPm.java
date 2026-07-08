package X;

import com.ss.android.ugc.aweme.frequency.model.FrequencyRule;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import com.ss.android.ugc.aweme.frequency.model.RuleWindow;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS379S0200000_13;

/* JADX INFO: renamed from: X.0WPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822800WPm extends AbstractC2276531E8t<FrequencyRule> {
    public final List<String> LIZ;
    public final FrequencyRule LIZIZ;
    public final InterfaceC822740WPg LIZJ;
    public final InterfaceC822750WPh LIZLLL;

    @Override // X.InterfaceC2276541E8u
    public final /* bridge */ /* synthetic */ InterfaceC822840WPq LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC2276541E8u
    public final List<String> LIZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC2276541E8u
    public final InterfaceC822750WPh getContext() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC2276531E8t
    public final RuleHitState LIZLLL(String str, String str2, List<String> list) {
        String ruleId = this.LIZIZ.getRuleId();
        boolean z = false;
        if (ruleId != null && ruleId.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            RuleWindow window = this.LIZIZ.getWindow();
            if (window != null) {
                long valueMs = jCurrentTimeMillis - window.getValueMs();
                C013C c013c = new C013C();
                AwS379S0200000_13 awS379S0200000_13 = new AwS379S0200000_13(c013c, this, 24);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.LIZJ.doLoop(new C818450W8t(linkedHashMap, list, valueMs));
                awS379S0200000_13.invoke(linkedHashMap);
                z = c013c.element;
            }
            return new RuleHitState(str, str2, Boolean.valueOf(z), Collections.singletonList(ruleId), "frequency", System.currentTimeMillis());
        }
        return new RuleHitState(str, str2, Boolean.FALSE, null, "frequency", System.currentTimeMillis());
    }

    public C822800WPm(List<String> list, FrequencyRule frequencyRule, InterfaceC822740WPg interfaceC822740WPg, InterfaceC822750WPh interfaceC822750WPh) {
        this.LIZ = list;
        this.LIZIZ = frequencyRule;
        this.LIZJ = interfaceC822740WPg;
        this.LIZLLL = interfaceC822750WPh;
    }
}
