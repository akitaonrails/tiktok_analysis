package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1308620k9s<D extends Serializable> extends AbstractC1308700kA0<D> {
    public final Class<D> LJIIL;

    @Override // X.AbstractC1308700kA0
    public String LIZIZ() {
        return this.LJIIL.getName();
    }

    public final int hashCode() {
        return this.LJIIL.hashCode();
    }

    public C1308620k9s(Class<D> cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            if (true ^ cls.isEnum()) {
                this.LJIIL = cls;
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(cls);
            sbLIZ.append(" is an Enum. You should use EnumType instead.");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(cls);
        sbLIZ2.append(" does not implement Serializable.");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalArgumentException(strLIZIZ2);
    }

    @Override // X.AbstractC1308700kA0
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public D LIZJ(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1308620k9s)) {
            return false;
        }
        return Intrinsics.LJFF(this.LJIIL, ((C1308620k9s) obj).LJIIL);
    }

    public C1308620k9s(Class cls, int i) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.LJIIL = cls;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(cls);
        sbLIZ.append(" does not implement Serializable.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
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
        Serializable serializable = (Serializable) obj;
        this.LJIIL.cast(serializable);
        C786410Ut5.LJJIZ(bundle, str, serializable);
    }
}
