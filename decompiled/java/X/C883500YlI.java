package X;

import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883500YlI extends C09AY implements Function0<CopyOnWriteArraySet<InterfaceC883440YlC>> {
    public C883500YlI() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final CopyOnWriteArraySet<InterfaceC883440YlC> invoke() {
        return new CopyOnWriteArraySet<>(new LinkedHashSet());
    }
}
