package X;

import com.ss.android.ugc.aweme.frequency.model.DetectBehavior;
import com.ss.android.ugc.aweme.frequency.model.ExitRule;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import com.ss.android.ugc.aweme.frequency.model.RuleWindow;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS222S0300000_13;
import kotlin.jvm.internal.AwS379S0200000_13;
import kotlin.jvm.internal.AwS56S0010000_13;

/* JADX INFO: renamed from: X.0WPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822810WPn extends AbstractC2276531E8t<ExitRule> {
    public final List<String> LIZ;
    public final ExitRule LIZIZ;
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
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = -1L;
        this.LIZJ.doLoop(new AwS379S0200000_13((List) list, (List<String>) c238400w2, (C238400w2) 23));
        long j = c238400w2.element;
        String ruleId = this.LIZIZ.getRuleId();
        boolean z = false;
        if (ruleId != null && ruleId.length() != 0) {
            if (j != -1) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                RuleWindow blockWindow = this.LIZIZ.getBlockWindow();
                if (blockWindow != null) {
                    long valueMs = blockWindow.getValueMs();
                    if (valueMs > 0) {
                        long j2 = j + valueMs;
                        InterfaceC822750WPh interfaceC822750WPh = this.LIZLLL;
                        if (interfaceC822750WPh != null && interfaceC822750WPh.getLogger() != null) {
                            new C822820WPo(j, jCurrentTimeMillis, j2, this);
                        }
                        if (jCurrentTimeMillis < j2) {
                            RuleWindow window = this.LIZIZ.getWindow();
                            if (window != null) {
                                long valueMs2 = window.getValueMs();
                                List<DetectBehavior> detectBehaviors = this.LIZIZ.getDetectBehaviors();
                                if (detectBehaviors != null) {
                                    long j3 = j - valueMs2;
                                    C013C c013c = new C013C();
                                    AwS222S0300000_13 awS222S0300000_13 = new AwS222S0300000_13(c013c, (C013C) this, (C822810WPn) detectBehaviors, (List<DetectBehavior>) 13);
                                    InterfaceC822750WPh interfaceC822750WPh2 = this.LIZLLL;
                                    if (interfaceC822750WPh2 != null) {
                                        interfaceC822750WPh2.getLogger();
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    C013C c013c2 = new C013C();
                                    this.LIZJ.doLoop(new C822790WPl(list, j3, detectBehaviors, linkedHashMap, linkedHashMap2, this, c013c2, awS222S0300000_13));
                                    if (!c013c2.element) {
                                        c013c2.element = ((Boolean) awS222S0300000_13.invoke(linkedHashMap)).booleanValue();
                                    }
                                    z = c013c.element;
                                }
                            }
                            Boolean boolValueOf = Boolean.valueOf(z);
                            boolean zBooleanValue = boolValueOf.booleanValue();
                            InterfaceC822750WPh interfaceC822750WPh3 = this.LIZLLL;
                            if (interfaceC822750WPh3 != null && interfaceC822750WPh3.getLogger() != null) {
                                new AwS56S0010000_13(zBooleanValue, 10);
                            }
                            return new RuleHitState(str, str2, boolValueOf, Collections.singletonList(ruleId), "exit", System.currentTimeMillis());
                        }
                    }
                }
            }
            InterfaceC822750WPh interfaceC822750WPh4 = this.LIZLLL;
            if (interfaceC822750WPh4 != null) {
                interfaceC822750WPh4.getLogger();
            }
            return new RuleHitState(str, str2, Boolean.FALSE, Collections.singletonList(ruleId), "exit", System.currentTimeMillis());
        }
        return new RuleHitState(str, str2, Boolean.FALSE, null, "exit", System.currentTimeMillis());
    }

    public C822810WPn(List<String> list, ExitRule exitRule, InterfaceC822740WPg interfaceC822740WPg, InterfaceC822750WPh interfaceC822750WPh) {
        this.LIZ = list;
        this.LIZIZ = exitRule;
        this.LIZJ = interfaceC822740WPg;
        this.LIZLLL = interfaceC822750WPh;
    }
}
