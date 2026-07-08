package X;

import java.lang.Enum;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0k9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308630k9t<D extends Enum<?>> extends C1308620k9s<D> {
    public final Class<D> LJIILIIL;

    @Override // X.C1308620k9s, X.AbstractC1308700kA0
    public final String LIZIZ() {
        return this.LJIILIIL.getName();
    }

    public C1308630k9t(Class<D> cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.LJIILIIL = cls;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(cls);
        sbLIZ.append(" is not an Enum type.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    @Override // X.C1308620k9s
    /* JADX INFO: renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public final D LIZJ(String str) {
        D d;
        D[] enumConstants = this.LJIILIIL.getEnumConstants();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i < length) {
                d = enumConstants[i];
                if (u.LJIJI(d.name(), str, true)) {
                    break;
                }
                i++;
            } else {
                d = null;
                break;
            }
        }
        D d2 = d;
        if (d2 != null) {
            return d2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Enum value ");
        sbLIZ.append(str);
        sbLIZ.append(" not found for type ");
        sbLIZ.append(this.LJIILIIL.getName());
        sbLIZ.append('.');
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
