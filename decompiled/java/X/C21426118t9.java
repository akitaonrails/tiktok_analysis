package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18t9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21426118t9 implements InterfaceC21428018tS, InterfaceC21449318wt {
    @Override // X.InterfaceC21428018tS
    public final void LIZ(C21433918uP c21433918uP) {
        c21433918uP.LIZ(new C21429818tk() { // from class: X.18tj
            @Override // X.InterfaceC21445718wJ
            public final AbstractC21449018wq LIZ(InterfaceC21449618ww interfaceC21449618ww, C21443618vy c21443618vy) {
                StringBuilder sb;
                List<EnumC21429518th> listLJIIIZ;
                List<EnumC21429518th> listLJIIIZ2;
                C21440618vU c21440618vU = (C21440618vU) interfaceC21449618ww;
                CharSequence charSequence = c21440618vU.LIZ;
                CharSequence charSequenceLIZ = c21443618vy.LIZ();
                if (charSequenceLIZ == null) {
                    return null;
                }
                if (charSequenceLIZ instanceof StringBuilder) {
                    sb = (StringBuilder) charSequenceLIZ;
                } else {
                    sb = null;
                }
                if (sb == null) {
                    CharSequence charSequence2 = c21440618vU.LIZ;
                    CharSequence charSequenceLIZ2 = c21443618vy.LIZ();
                    if (charSequenceLIZ2 == null) {
                        return null;
                    }
                    StringBuilder sb2 = (StringBuilder) charSequenceLIZ2;
                    if (!sb2.toString().contains("|") || sb2.toString().contains("\n") || (listLJIIIZ2 = C21429618ti.LJIIIZ(charSequence2.subSequence(c21440618vU.LIZIZ, charSequence2.length()))) == null) {
                        return null;
                    }
                    ArrayList arrayList = (ArrayList) listLJIIIZ2;
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    List<String> listLJIIJ = C21429618ti.LJIIJ(charSequenceLIZ2);
                    if (arrayList.size() < ((ArrayList) listLJIIJ).size()) {
                        return null;
                    }
                    C21444418w6 c21444418w6 = new C21444418w6(new C21429618ti(listLJIIIZ2, listLJIIJ));
                    c21444418w6.LIZIZ = c21440618vU.LIZIZ;
                    c21444418w6.LIZLLL = true;
                    return c21444418w6;
                }
                String str = (String) C13LP.LJJLIIIJJI(a0.LJJLIIIJILLIZJL(charSequenceLIZ, new String[]{"\n"}, 0, 6));
                if (a0.LJJIIZI(str, "|", false) && (listLJIIIZ = C21429618ti.LJIIIZ(charSequence.subSequence(c21440618vU.LIZIZ, charSequence.length()))) != null && !((ArrayList) listLJIIIZ).isEmpty()) {
                    List<String> listLJIIJ2 = C21429618ti.LJIIJ(str);
                    ArrayList arrayList2 = (ArrayList) listLJIIIZ;
                    if (arrayList2.size() >= ((ArrayList) listLJIIJ2).size()) {
                        int length = sb.length();
                        int length2 = length - str.length();
                        if (length2 > 0) {
                            int i = length2 - 1;
                            if (((StringBuilder) charSequenceLIZ).charAt(i) == '\n') {
                                length2 = i;
                            }
                        }
                        sb.delete(length2, length);
                        C21444418w6 c21444418w62 = new C21444418w6(new C21429618ti(arrayList2, listLJIIJ2, str));
                        c21444418w62.LIZIZ = c21440618vU.LIZIZ;
                        return c21444418w62;
                    }
                }
                return null;
            }
        });
    }
}
