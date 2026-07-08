package X;

/* JADX INFO: renamed from: X.18uV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21434518uV extends AbstractC21434218uS {
    public abstract Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua);

    @Override // X.AbstractC21434218uS
    public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, C21433418uK c21433418uK, InterfaceC21435018ua interfaceC21435018ua) {
        if (interfaceC21435018ua.LJ()) {
            AbstractC21434218uS.LIZLLL(interfaceC21427218tK, c21433418uK, interfaceC21435018ua.LIZJ());
        }
        Object objLJ = LJ(interfaceC21427218tK.LJJIII(), interfaceC21427218tK.LJIL(), interfaceC21435018ua);
        if (objLJ != null) {
            C21423918sn.LJI(interfaceC21427218tK.builder(), objLJ, interfaceC21435018ua.start(), interfaceC21435018ua.end());
        }
    }
}
