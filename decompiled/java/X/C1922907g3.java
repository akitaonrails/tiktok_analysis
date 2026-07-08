package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07g3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1922907g3 implements InterfaceC1921807fs {
    public final String LIZ;

    @Override // X.InterfaceC1921807fs
    public final boolean LIZ() {
        String str = this.LIZ;
        try {
            double d = CastDoubleProtector.parseDouble(str);
            if (d == 0.0d || Double.isNaN(d)) {
                return false;
            }
            return !Double.isInfinite(d);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return str.length() > 0 && !Intrinsics.LJFF(str, "false");
        }
    }

    @Override // X.InterfaceC1921807fs
    public final Double LIZJ() {
        Object c098200Yq;
        try {
            c098200Yq = Double.valueOf(CastDoubleProtector.parseDouble(this.LIZ));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Double) c098200Yq;
    }

    @Override // X.InterfaceC1921807fs
    public final Long LIZLLL() {
        Object c098200Yq;
        try {
            c098200Yq = Long.valueOf(CastLongProtector.parseLong(this.LIZ));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Long) c098200Yq;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StringType(value=");
        sbLIZ.append(str);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1921807fs
    public final String LIZIZ() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        String str = this.LIZ;
        if (!(obj instanceof C1922907g3) || !Intrinsics.LJFF(str, ((C1922907g3) obj).LIZ)) {
            return false;
        }
        return true;
    }
}
