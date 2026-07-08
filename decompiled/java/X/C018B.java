package X;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.018B, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C018B extends C09AY implements Function1<Set<String>, Set<String>> {
    public C018B() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Set<String> invoke(Set<String> set) {
        Set<String> set2 = set;
        if (set2.isEmpty()) {
            Set<String> set3 = C697090RVz.LIZ().get("genre_tag");
            if (set3 != null) {
                return C13LP.LLIIIZ(set3);
            }
            return new LinkedHashSet();
        }
        return set2;
    }
}
