package X;

import X.InterfaceC21434318uT;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.18uj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21435918uj<P extends InterfaceC21434318uT> {
    public static final C21435918uj<P> LIZ = new C21435918uj<>();

    public static final void LIZ(InterfaceC21434318uT interfaceC21434318uT) {
        ((ArrayList) ((C21423818sm) interfaceC21434318uT).LIZ).add(new C848180XPc() { // from class: X.18u2
            public final Pattern LIZIZ = PatternProtector.compile("[a-zA-Z]*\\.[a-zA-Z]*");

            @Override // X.InterfaceC21427918tR
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, String str, int i) {
                InterfaceC21446318wP interfaceC21446318wPLIZ = ((C21435218uc) interfaceC21427218tK.LJJIII().LJFF).LIZ(C21436418uo.class);
                if (interfaceC21446318wPLIZ == null) {
                    return;
                }
                Matcher matcher = this.LIZ.matcher(str);
                while (matcher.find()) {
                    int iStart = matcher.start();
                    int iEnd = matcher.end();
                    String strGroup = matcher.group();
                    if (!u.LJJIIJZLJL(strGroup, e3.g, false) && !this.LIZIZ.matcher(strGroup).matches() && !C0XOY.LIZIZ.matcher(strGroup).find()) {
                        C14S7 c14s7LJIL = interfaceC21427218tK.LJIL();
                        C21423918sn c21423918snBuilder = interfaceC21427218tK.builder();
                        c14s7LJIL.LIZ(AbstractC20267814Se.LJ, strGroup);
                        C21423918sn.LJI(c21423918snBuilder, interfaceC21446318wPLIZ.LIZ(interfaceC21427218tK.LJJIII(), c14s7LJIL), iStart + i, iEnd + i);
                    }
                }
            }
        });
    }
}
