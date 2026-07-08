package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01hw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C405801hw extends AbstractC405501ht {
    @Override // X.InterfaceC381401e0
    public final Object LIZ(Pair<? extends String, ? extends List<? extends String>> pair, InterfaceC1364105Vn<? super List<? extends String>> interfaceC1364105Vn) {
        Pair<? extends String, ? extends List<? extends String>> pair2 = pair;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveHostBizAbilityTask beg, params: ");
        sbLIZ.append(pair2);
        C20441214yg.LIZIZ("AutoAdaptiveCenter", C2188811AlT.LIZIZ(sbLIZ));
        if (pair2 == null) {
            C20441214yg.LJ("AutoAdaptiveCenter", "LiveHostNormal end,  params is null.");
            return null;
        }
        List<? extends String> second = pair2.getSecond();
        if (Intrinsics.LJFF(pair2.getFirst(), "down")) {
            Iterator<? extends String> it2 = second.iterator();
            while (it2.hasNext()) {
                LiveHostAutoAdaptiveParams.INSTANCE.disable(EnumC1100890ekp.ADAPTIVE, it2.next());
            }
        }
        if (Intrinsics.LJFF(pair2.getFirst(), "up")) {
            Iterator<? extends String> it3 = second.iterator();
            while (it3.hasNext()) {
                LiveHostAutoAdaptiveParams.INSTANCE.enable(EnumC1100890ekp.ADAPTIVE, it3.next());
            }
        }
        C20441214yg.LIZIZ("AutoAdaptiveCenter", "LiveHostBizAbilityTask end");
        return null;
    }
}
