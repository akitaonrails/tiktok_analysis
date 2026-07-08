package X;

import com.ss.android.ugc.aweme.experiment.ApmBodyHeaderAllowKeysModel;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0W8B, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W8B extends C09AY implements Function0<HashSet<String>> {
    public C0W8B() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HashSet<String> invoke() {
        HashSet<String> hashSet = new HashSet<>();
        Iterator<String> it2 = ((ApmBodyHeaderAllowKeysModel) C0W8A.LIZJ.getValue()).additionAllowKeys.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next());
        }
        hashSet.addAll(C0W8A.LIZIZ);
        return hashSet;
    }
}
