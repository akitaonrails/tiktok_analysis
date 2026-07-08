package X;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0jcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287820jcK extends C09AY implements Function0<List<? extends Regex>> {
    public C1287820jcK() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Regex> invoke() {
        return C1697810uHb.LJIIJJI(new Regex("a[0-9]+\\.b\\w+\\.c[0-9]+\\.d\\w+"), new Regex("a[0-9]+\\.b\\w+\\.c[0-9]+\\.[^d\\.][\\w]+"));
    }
}
