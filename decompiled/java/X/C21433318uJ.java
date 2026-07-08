package X;

import android.text.style.UnderlineSpan;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: X.18uJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21433318uJ extends AbstractC21434218uS {
    @Override // X.AbstractC21434218uS
    public final Collection<String> LIZJ() {
        return Arrays.asList("u", "ins");
    }

    @Override // X.AbstractC21434218uS
    public void LIZ(InterfaceC21427218tK interfaceC21427218tK, C21433418uK c21433418uK, InterfaceC21435018ua interfaceC21435018ua) {
        if (interfaceC21435018ua.LJ()) {
            AbstractC21434218uS.LIZLLL(interfaceC21427218tK, c21433418uK, interfaceC21435018ua.LIZJ());
        }
        C21423918sn.LJI(interfaceC21427218tK.builder(), new UnderlineSpan(), interfaceC21435018ua.start(), interfaceC21435018ua.end());
    }
}
