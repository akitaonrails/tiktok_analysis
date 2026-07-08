package X;

import com.ss.android.ugc.aweme.commercialize.experiment.CommerceALogConfig;
import com.ss.android.ugc.aweme.commercialize.experiment.CommerceALogEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0g6Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152800g6Y extends C09AY implements Function0<Set<? extends String>> {
    public C1152800g6Y() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends String> invoke() {
        List<CommerceALogEvent> list = ((CommerceALogConfig) C1152810g6Z.LIZIZ.getValue()).lowLevelEvents;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<CommerceALogEvent> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().label);
        }
        return C13LP.LLIIJI(arrayList);
    }
}
