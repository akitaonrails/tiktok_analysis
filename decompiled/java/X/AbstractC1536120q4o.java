package X;

import com.lynx.tasm.TemplateBundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1536120q4o implements InterfaceC1541060qCm {
    public static final C1536000q4c LIZIZ = new C1536000q4c();
    public static volatile C0VSJ LIZJ;
    public TemplateBundle LIZ;

    public abstract String LIZIZ();

    public abstract C0VSJ LIZJ();

    public abstract C1529350ptt LIZLLL();

    public abstract String LJ();

    public abstract String LJFF();

    @Override // X.InterfaceC1541060qCm
    public final int hashCode() {
        return LIZIZ().hashCode();
    }

    @Override // X.InterfaceC1541060qCm
    public final String toString() {
        return LIZIZ();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1536120q4o)) {
            return false;
        }
        return Intrinsics.LJFF(LIZIZ(), ((AbstractC1536120q4o) obj).LIZIZ());
    }

    @Override // X.InterfaceC1541060qCm
    public final C1535940q4W LIZ(InterfaceC1541060qCm interfaceC1541060qCm, C1535940q4W c1535940q4W) {
        if (Intrinsics.LJFF(interfaceC1541060qCm, this)) {
            return c1535940q4W;
        }
        return null;
    }
}
