package X;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04aU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1124004aU extends C09AY implements Function1<Set<? extends String>, List<? extends String>> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1124004aU(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends String> invoke(Set<? extends String> set) {
        return Collections.singletonList(this.LL);
    }
}
