package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308650k9v<D extends Parcelable> extends AbstractC1308700kA0<D[]> {
    public final Class<D[]> LJIIL;

    @Override // X.AbstractC1308700kA0
    public final String LIZIZ() {
        return this.LJIIL.getName();
    }

    public final int hashCode() {
        return this.LJIIL.hashCode();
    }

    public C1308650k9v(Class<D> cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls)) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[L");
                sbLIZ.append(cls.getName());
                sbLIZ.append(';');
                this.LJIIL = (Class<D[]>) Class.forName(C2188811AlT.LIZIZ(sbLIZ));
                return;
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(cls);
        sbLIZ2.append(" does not implement Parcelable.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    @Override // X.AbstractC1308700kA0
    public final Object LIZJ(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.LJFF(C1308650k9v.class, obj.getClass())) {
            return Intrinsics.LJFF(this.LJIIL, ((C1308650k9v) obj).LJIIL);
        }
        return false;
    }

    @Override // X.AbstractC1308700kA0
    public final Object LIZ(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    @Override // X.AbstractC1308700kA0
    public final void LIZLLL(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        this.LJIIL.cast(parcelableArr);
        C786410Ut5.LJJIJLIJ(bundle, str, parcelableArr);
    }
}
