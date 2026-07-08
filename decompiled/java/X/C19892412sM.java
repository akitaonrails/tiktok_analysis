package X;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* JADX INFO: renamed from: X.12sM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19892412sM {
    public final AbstractC19870912ot<C19893012sS, Type> LIZ;

    public C19892412sM() {
        this.LIZ = AbstractC19870912ot.of();
    }

    public C19892412sM(C19869812oi c19869812oi) {
        this.LIZ = c19869812oi;
    }

    public Type LIZ(TypeVariable typeVariable, C19893912sb c19893912sb) {
        Type type = this.LIZ.get(new C19893012sS(typeVariable));
        if (type == null) {
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] typeArrLIZJ = new C19891612sE(c19893912sb).LIZJ(bounds);
            if (C19893512sX.LIZ && Arrays.equals(bounds, typeArrLIZJ)) {
                return typeVariable;
            }
            return C19891812sG.LIZLLL(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrLIZJ);
        }
        return new C19891612sE(c19893912sb).LIZIZ(type);
    }
}
