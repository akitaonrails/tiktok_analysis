package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00fN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C135100fN implements InterfaceC944203ma {
    public final CharSequence LIZ;
    public int LIZIZ = -1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C135100fN) && Intrinsics.LJFF(this.LIZ, ((C135100fN) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DateInputElement(textValue=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC944203ma
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final List<String> value() {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(this.LIZ, new String[]{"/"}, 0, 6);
        return C1697810uHb.LJIIJJI(C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL), C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC944203ma
    public final String[] LIZ() {
        List<String> listValue = value();
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, listValue);
        if (objLJJJLZIJ == null) {
            objLJJJLZIJ = "";
        }
        Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, listValue);
        return new String[]{objLJJJLZIJ, objLJJJLZIJ2 != null ? objLJJJLZIJ2 : ""};
    }

    @Override // X.InterfaceC944203ma
    public final CharSequence LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC944203ma
    public final int getCursor() {
        return this.LIZIZ;
    }

    public C135100fN(CharSequence charSequence) {
        this.LIZ = charSequence;
    }
}
