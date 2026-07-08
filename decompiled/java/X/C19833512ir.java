package X;

import android.content.Context;

/* JADX INFO: renamed from: X.12ir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19833512ir extends AbstractC19833612is {
    public final Context LIZ;
    public final InterfaceC1456340o08<AbstractC19852312lt<InterfaceC813010Vut>> LIZIZ;

    public final int hashCode() {
        int iHashCode = (this.LIZ.hashCode() ^ 1000003) * 1000003;
        InterfaceC1456340o08<AbstractC19852312lt<InterfaceC813010Vut>> interfaceC1456340o08 = this.LIZIZ;
        return iHashCode ^ (interfaceC1456340o08 == null ? 0 : interfaceC1456340o08.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.LIZ) + ", hermeticFileOverrides=" + String.valueOf(this.LIZIZ) + "}";
    }

    @Override // X.AbstractC19833612is
    public final Context LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC19833612is
    public final InterfaceC1456340o08<AbstractC19852312lt<InterfaceC813010Vut>> LIZIZ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC19833612is) {
            AbstractC19833612is abstractC19833612is = (AbstractC19833612is) obj;
            if (this.LIZ.equals(abstractC19833612is.LIZ())) {
                InterfaceC1456340o08<AbstractC19852312lt<InterfaceC813010Vut>> interfaceC1456340o08 = this.LIZIZ;
                if (interfaceC1456340o08 == null) {
                    if (abstractC19833612is.LIZIZ() == null) {
                        return true;
                    }
                } else if (interfaceC1456340o08.equals(abstractC19833612is.LIZIZ())) {
                    return true;
                }
            }
        }
        return false;
    }

    public C19833512ir(Context context, InterfaceC1456340o08<AbstractC19852312lt<InterfaceC813010Vut>> interfaceC1456340o08) {
        this.LIZ = context;
        this.LIZIZ = interfaceC1456340o08;
    }
}
