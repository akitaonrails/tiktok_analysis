package X;

import android.view.ViewConfiguration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS130S0101000_24;

/* JADX INFO: renamed from: X.0rZH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593450rZH implements InterfaceC1592400rXa {
    public final long LIZ;

    public C1593450rZH(long j) {
        this.LIZ = j;
    }

    @Override // X.InterfaceC1592400rXa
    public final Function1 LIZ(C19EG c19eg) {
        return new AwS130S0101000_24(ViewConfiguration.get(c19eg).getScaledTouchSlop(), this, 5);
    }
}
