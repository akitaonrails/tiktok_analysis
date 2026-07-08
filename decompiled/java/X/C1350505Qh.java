package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05Qh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1350505Qh {
    public final InterfaceC1627890sSp LIZ;
    public final Effect LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1350505Qh)) {
            return false;
        }
        C1350505Qh c1350505Qh = (C1350505Qh) obj;
        return Intrinsics.LJFF(this.LIZ, c1350505Qh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1350505Qh.LIZIZ);
    }

    public C1350505Qh(InterfaceC1627890sSp interfaceC1627890sSp, Effect effect) {
        this.LIZ = interfaceC1627890sSp;
        this.LIZIZ = effect;
    }
}
