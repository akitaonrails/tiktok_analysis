package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308610k9r<D> extends AbstractC1308700kA0<D> {
    public final Class<D> LJIIL;

    @Override // X.AbstractC1308700kA0
    public final String LIZIZ() {
        return this.LJIIL.getName();
    }

    public final int hashCode() {
        return this.LJIIL.hashCode();
    }

    public C1308610k9r(Class<D> cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(cls);
            sbLIZ.append(" does not implement Parcelable or Serializable.");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        this.LJIIL = cls;
    }

    @Override // X.AbstractC1308700kA0
    public final D LIZJ(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.LJFF(C1308610k9r.class, obj.getClass())) {
            return Intrinsics.LJFF(this.LJIIL, ((C1308610k9r) obj).LJIIL);
        }
        return false;
    }

    @Override // X.AbstractC1308700kA0
    public final D LIZ(Bundle bundle, String str) {
        try {
            return (D) bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    @Override // X.AbstractC1308700kA0
    public final void LIZLLL(Bundle bundle, String str, D d) {
        this.LJIIL.cast(d);
        if (d != null && !(d instanceof Parcelable)) {
            if (d instanceof Serializable) {
                C786410Ut5.LJJIZ(bundle, str, (Serializable) d);
                return;
            }
            return;
        }
        C786410Ut5.LJJIJL(bundle, str, (Parcelable) d);
    }
}
