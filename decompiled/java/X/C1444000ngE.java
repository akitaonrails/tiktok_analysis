package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AwS566S0100000_22;
import lgo.a;

/* JADX INFO: renamed from: X.0ngE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444000ngE {
    public LifecycleOwner LIZ;
    public C1322110kVd LIZIZ;

    public C1444000ngE(LifecycleOwner lifecycleOwner, C1322110kVd c1322110kVd, String str) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = c1322110kVd;
        if (C0BP2.LIZ()) {
            C201955140j.LIZLLL(C20102213l6.LIZIZ, "MEMORY_LEAK", "SafeSimpleDraweeView init");
            a.LIZIZ.LIZ().LIZJ(this.LIZ, str, new AwS566S0100000_22(this, 820));
        }
    }
}
