package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tk7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677050tk7<T> implements InterfaceC1677060tk8<T> {
    public final int LIZ;
    public final int LIZIZ;
    public final InterfaceC1686200tys LIZJ;

    public C1677050tk7() {
        this(0, (InterfaceC1686200tys) null, 7);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZJ.hashCode()) * 31) + this.LIZIZ;
    }

    @Override // X.InterfaceC1677030tk5
    public final InterfaceC1677220tkO LIZ(InterfaceC1677290tkV interfaceC1677290tkV) {
        return new C1686060tye(this.LIZ, this.LIZIZ, this.LIZJ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1677050tk7)) {
            return false;
        }
        C1677050tk7 c1677050tk7 = (C1677050tk7) obj;
        if (c1677050tk7.LIZ != this.LIZ || c1677050tk7.LIZIZ != this.LIZIZ || !Intrinsics.LJFF(c1677050tk7.LIZJ, this.LIZJ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1677060tk8, X.InterfaceC1677030tk5
    public final InterfaceC1677240tkQ LIZ(InterfaceC1677290tkV interfaceC1677290tkV) {
        return new C1686060tye(this.LIZ, this.LIZIZ, this.LIZJ);
    }

    public C1677050tk7(int i, InterfaceC1686200tys interfaceC1686200tys, int i2) {
        this((i2 & 1) != 0 ? DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL : i, 0, (i2 & 4) != 0 ? C05Y0.LIZ : interfaceC1686200tys);
    }

    public C1677050tk7(int i, int i2, InterfaceC1686200tys interfaceC1686200tys) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = interfaceC1686200tys;
    }
}
