package X;

import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YlJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883510YlJ extends C09AY implements Function0<CopyOnWriteArraySet<InterfaceC872780YLs>> {
    public C883510YlJ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final CopyOnWriteArraySet<InterfaceC872780YLs> invoke() {
        return new CopyOnWriteArraySet<>(new LinkedHashSet());
    }
}
