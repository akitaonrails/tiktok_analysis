package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01hu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC405601hu implements InterfaceC381401e0<C923800a9C, Unit> {
    public final int LIZ;
    public final String LIZIZ;
    public final Function1<C923800a9C, Unit> LIZJ;

    public AbstractC405601hu() {
        this(null);
    }

    @Override // X.InterfaceC381401e0
    public final String getContext() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC381401e0
    public final int getType() {
        return this.LIZ;
    }

    public AbstractC405601hu(Object obj) {
        this.LIZ = EnumC405401hs.DISPATCH_METRICS_BIZ.ordinal();
        this.LIZIZ = "IO";
        this.LIZJ = null;
    }
}
