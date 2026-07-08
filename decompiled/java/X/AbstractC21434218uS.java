package X;

import java.util.Collection;

/* JADX INFO: renamed from: X.18uS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21434218uS {
    public abstract void LIZ(InterfaceC21427218tK interfaceC21427218tK, C21433418uK c21433418uK, InterfaceC21435018ua interfaceC21435018ua);

    public CharSequence LIZIZ(AbstractC21434718uX abstractC21434718uX, C21423618sk c21423618sk) {
        return null;
    }

    public abstract Collection<String> LIZJ();

    public static void LIZLLL(InterfaceC21427218tK interfaceC21427218tK, C21433418uK c21433418uK, InterfaceC21436718ur interfaceC21436718ur) {
        for (InterfaceC21436718ur interfaceC21436718ur2 : interfaceC21436718ur.LIZ()) {
            if (interfaceC21436718ur2.isClosed()) {
                AbstractC21434218uS abstractC21434218uSLIZIZ = c21433418uK.LIZIZ(interfaceC21436718ur2.name());
                if (abstractC21434218uSLIZIZ != null) {
                    abstractC21434218uSLIZIZ.LIZ(interfaceC21427218tK, c21433418uK, interfaceC21436718ur2);
                } else {
                    LIZLLL(interfaceC21427218tK, c21433418uK, interfaceC21436718ur2);
                }
            }
        }
    }
}
