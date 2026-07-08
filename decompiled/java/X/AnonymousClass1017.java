package X;

import X.InterfaceC722490SVr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1017, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AnonymousClass1017<M extends InterfaceC722490SVr> {
    public abstract List<Pair<AnonymousClass1018, M>> LIZ();

    public abstract C101A LIZIZ();

    public final int LIZJ(Object obj) {
        Iterator<Pair<AnonymousClass1018, M>> it2 = LIZ().iterator();
        while (it2.hasNext()) {
            AnonymousClass1018 first = it2.next().getFirst();
            if (first.shouldShow(obj)) {
                return first.getConditionType();
            }
        }
        return -1;
    }

    public final InterfaceC722490SVr LIZLLL(int i, Aweme aweme) {
        if (i == 0) {
            for (Pair<AnonymousClass1018, M> pair : LIZ()) {
                AnonymousClass1018 first = pair.getFirst();
                String scenario = LIZIZ().getScenario();
                String strLIZ = LIZIZ().LIZ(first.getConditionType());
                if (first.shouldShowWrapper(aweme, scenario, strLIZ)) {
                    C722430SVl.LIZIZ(scenario, strLIZ, true);
                    return pair.getSecond();
                }
            }
            return null;
        }
        for (Pair<AnonymousClass1018, M> pair2 : LIZ()) {
            AnonymousClass1018 first2 = pair2.getFirst();
            String scenario2 = LIZIZ().getScenario();
            String strLIZ2 = LIZIZ().LIZ(first2.getConditionType());
            if (first2.getConditionType() == i && first2.shouldShowWrapper(aweme, scenario2, strLIZ2)) {
                C722430SVl.LIZIZ(scenario2, strLIZ2, false);
                return pair2.getSecond();
            }
        }
        return null;
    }

    public final void LJ(AnonymousClass1018 anonymousClass1018, M m) {
        if (LIZ().isEmpty()) {
            LIZ().add(new Pair<>(anonymousClass1018, m));
            return;
        }
        Iterator<Pair<AnonymousClass1018, M>> it2 = LIZ().iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            int i2 = i + 1;
            Pair<AnonymousClass1018, M> next = it2.next();
            if (next.getFirst().getConditionType() == anonymousClass1018.getConditionType()) {
                return;
            }
            if (anonymousClass1018.getPriority() > next.getFirst().getPriority()) {
                if (i != -1) {
                    ListProtector.add(LIZ(), i, new Pair(anonymousClass1018, m));
                    return;
                }
            } else {
                i = i2;
            }
        }
        LIZ().add(new Pair<>(anonymousClass1018, m));
    }
}
