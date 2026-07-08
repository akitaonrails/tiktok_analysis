package X;

import com.bytedance.android.commercialize.track.dynamic.rule.CloudRuleConfiguration;
import com.bytedance.android.commercialize.track.dynamic.rule.DynamicParamRule;
import com.bytedance.android.commercialize.track.dynamic.rule.EventDynamicParamRule;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0cjK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023080cjK extends C09AY implements Function0<Unit> {
    public C1023080cjK() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<DynamicParamRule> list;
        List listLJJLIIIJILLIZJL;
        C01GW c01gw = C293340Bee.LIZ;
        C293340Bee.LIZJ = true;
        C1023150cjR c1023150cjR = C1023060cjI.LIZIZ;
        c1023150cjR.getClass();
        CloudRuleConfiguration cloudRuleConfiguration = (CloudRuleConfiguration) C1023170cjT.LIZIZ.getValue();
        if (cloudRuleConfiguration != null && (list = cloudRuleConfiguration.dynamicParamRules) != null) {
            for (DynamicParamRule dynamicParamRule : list) {
                String str = dynamicParamRule.matchRule;
                if (str != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"-"}, 0, 6)) != null && listLJJLIIIJILLIZJL.size() == 3 && 1 != 0) {
                    String str2 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
                    Locale locale = Locale.ROOT;
                    C1023140cjQ c1023140cjQ = new C1023140cjQ(((String) ListProtector.get(listLJJLIIIJILLIZJL, 1)).toLowerCase(locale), C1022550ciT.LIZ(str2.toLowerCase(locale)), ((String) ListProtector.get(listLJJLIIIJILLIZJL, 2)).toLowerCase(locale));
                    c1023140cjQ.LIZLLL = dynamicParamRule.matchRule;
                    List<EventDynamicParamRule> list2 = dynamicParamRule.eventDynamicParamRules;
                    if (list2 != null && !list2.isEmpty() && list2 != null) {
                        C1023240cja c1023240cja = c1023150cjR.LIZ.get(c1023140cjQ);
                        if (c1023240cja != null) {
                            c1023240cja.LIZ(list2);
                        } else {
                            Map<C1023140cjQ, C1023240cja> map = c1023150cjR.LIZ;
                            C1023240cja c1023240cja2 = new C1023240cja(c1023140cjQ);
                            c1023240cja2.LIZ(list2);
                            map.put(c1023140cjQ, c1023240cja2);
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
