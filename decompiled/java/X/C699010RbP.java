package X;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699010RbP extends C09AY implements Function0<Set<C699000RbO>> {
    public C699010RbP() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<C699000RbO> invoke() {
        return Collections.synchronizedSet(new LinkedHashSet());
    }
}
