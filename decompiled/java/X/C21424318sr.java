package X;

import android.widget.TextView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18sr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21424318sr extends C21423818sm {
    public static final C14S5<String> LIZLLL = new C14S5<>("link-title");
    public final boolean LIZJ;

    @Override // X.C21423818sm, X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LJII(TextView textView, AbstractC21430218to abstractC21430218to, C21431218ty c21431218ty) {
    }

    public C21424318sr(boolean z) {
        this.LIZJ = z;
    }

    @Override // X.C21423818sm, X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LIZLLL(C21427518tN c21427518tN) {
        super.LIZLLL(c21427518tN);
        c21427518tN.LIZ(C21436418uo.class, new InterfaceC21427718tP() { // from class: X.18ss
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                C21437418uy c21437418uy;
                C21436418uo c21436418uo = (C21436418uo) abstractC21430218to;
                int length = interfaceC21427218tK.length();
                interfaceC21427218tK.LJJIIZ(c21436418uo);
                interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LJIIIIZZ, Boolean.valueOf(C21426518tD.LIZ(c21436418uo)));
                interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LJ, c21436418uo.LJFF);
                C14S5<String> c14s5 = C21424318sr.LIZLLL;
                C14S7 c14s7LJIL = interfaceC21427218tK.LJIL();
                String str = c21436418uo.LJI;
                if (str == null) {
                    AbstractC21430218to abstractC21430218to2 = c21436418uo.LIZIZ;
                    if (!(abstractC21430218to2 instanceof C21437418uy) || (c21437418uy = (C21437418uy) abstractC21430218to2) == null || (str = c21437418uy.LJFF) == null) {
                        str = "";
                    }
                }
                c14s7LJIL.LIZ(c14s5, str);
                interfaceC21427218tK.LJJIIJZLJL(c21436418uo, length);
            }
        });
        c21427518tN.LIZ(C21436318un.class, new InterfaceC21427718tP() { // from class: X.18tz
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                InterfaceC21446318wP interfaceC21446318wPLIZ;
                C21436318un c21436318un = (C21436318un) abstractC21430218to;
                if (this.LIZ.LIZJ) {
                    interfaceC21446318wPLIZ = ((C21435218uc) interfaceC21427218tK.LJJIII().LJFF).LIZ(C21436418uo.class);
                } else {
                    interfaceC21446318wPLIZ = ((C21435218uc) interfaceC21427218tK.LJJIII().LJFF).LIZ(C21436318un.class);
                }
                if (interfaceC21446318wPLIZ == null) {
                    interfaceC21427218tK.LJJIIZ(c21436318un);
                    return;
                }
                int length = interfaceC21427218tK.length();
                interfaceC21427218tK.LJJIIZ(c21436318un);
                if (length == interfaceC21427218tK.length()) {
                    interfaceC21427218tK.builder().LIZ((char) 65532);
                }
                C21432118u7 c21432118u7LJJIII = interfaceC21427218tK.LJJIII();
                boolean z = c21436318un.LIZ instanceof C21436418uo;
                AbstractC21447018wW abstractC21447018wW = c21432118u7LJJIII.LJ;
                String str = c21436318un.LJFF;
                abstractC21447018wW.getClass();
                C14S7 c14s7LJIL = interfaceC21427218tK.LJIL();
                c14s7LJIL.LIZ(AbstractC21436218um.LIZ, str);
                c14s7LJIL.LIZ(AbstractC21436218um.LIZIZ, Boolean.valueOf(z));
                C14S5<C448940Hj2> c14s5 = AbstractC21436218um.LIZJ;
                this.LIZ.getClass();
                Matcher matcher = PatternProtector.compile(":(\\d+):(\\d+):(\\d+):(\\d+):(\\d+):(\\d+)").matcher(str);
                C448940Hj2 c448940Hj2 = null;
                if (matcher.find()) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(matcher.group(), new String[]{":"}, 0, 6);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                    while (it2.hasNext()) {
                        Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) it2.next());
                        if (numLJIIJJI != null) {
                            arrayList.add(numLJIIJJI);
                        }
                    }
                    if (arrayList.size() >= 4) {
                        int iIntValue = ((Number) ListProtector.get(arrayList, 2)).intValue() - ((Number) ListProtector.get(arrayList, 0)).intValue();
                        int iIntValue2 = ((Number) ListProtector.get(arrayList, 3)).intValue() - ((Number) ListProtector.get(arrayList, 1)).intValue();
                        if (iIntValue > 0 && iIntValue2 > 0) {
                            c448940Hj2 = new C448940Hj2(new C448930Hj1(iIntValue, "px"), new C448930Hj1(iIntValue2, "px"));
                        }
                    }
                }
                c14s7LJIL.LIZ(c14s5, c448940Hj2);
                c14s7LJIL.LIZ(AbstractC21436218um.LIZLLL, Integer.valueOf(length));
                c14s7LJIL.LIZ(AbstractC21436218um.LJ, Integer.valueOf(interfaceC21427218tK.builder().length()));
                if (this.LIZ.LIZJ) {
                    interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LJIIIIZZ, Boolean.valueOf(C21426518tD.LIZ(c21436318un)));
                    c14s7LJIL.LIZ(AbstractC20267814Se.LJ, str);
                    C14S5<String> c14s52 = C21424318sr.LIZLLL;
                    String str2 = c21436318un.LJI;
                    if (str2 != null && str2.length() != 0 && str2 != null) {
                        str = str2;
                    }
                    c14s7LJIL.LIZ(c14s52, str);
                }
                interfaceC21427218tK.LJIJI(length, interfaceC21446318wPLIZ.LIZ(c21432118u7LJJIII, c14s7LJIL));
            }
        });
    }
}
