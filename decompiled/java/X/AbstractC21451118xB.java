package X;

import java.util.List;

/* JADX INFO: renamed from: X.18xB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21451118xB {
    public final void LIZ(List<? extends InterfaceC21451418xE> list) {
        for (InterfaceC21451418xE interfaceC21451418xE : list) {
            if (interfaceC21451418xE.LJFF()) {
                InterfaceC21451218xC interfaceC21451218xC = (InterfaceC21451218xC) interfaceC21451418xE;
                C21451018xA c21451018xA = (C21451018xA) this;
                int length = c21451018xA.LIZJ.length();
                c21451018xA.LIZ(interfaceC21451218xC.LIZ());
                int length2 = c21451018xA.LIZJ.length();
                if (length2 != length) {
                    c21451018xA.LIZIZ.LIZ(c21451018xA.LIZ, interfaceC21451218xC, c21451018xA.LIZJ, length, length2);
                }
            } else {
                ((C21451018xA) this).LIZJ.append((CharSequence) ((InterfaceC21451318xD) interfaceC21451418xE).LIZLLL());
            }
        }
    }
}
