package X;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Xlt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC858390Xlt extends AbstractC858320Xlm<AVTextExtraStruct> {
    public int LJI;
    public C0W3U LJII;
    public final List<C858350Xlp> LJIIIIZZ;

    public boolean LJIL() {
        return this instanceof C858410Xlv;
    }

    @Override // X.AbstractC858320Xlm
    public String LJIILJJIL() {
        int i = this.LJI;
        CharSequence[] charSequenceArr = new CharSequence[i];
        for (int i2 = 0; i2 < i; i2++) {
            charSequenceArr[i2] = "";
        }
        LJIJI(charSequenceArr);
        return this.LJII == C0W3U.LTR ? C13LQ.LJJJ(charSequenceArr, "", null, null, null, 62) : C13LQ.LJJJ(C13LQ.LJJJLZIJ(charSequenceArr), "", null, null, null, 62);
    }

    public static String LJIJJLI(CharSequence charSequence) {
        String str = (String) charSequence;
        int length = str.length();
        String strLIZIZ = "";
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\n') {
                if (cCharAt != '&') {
                    if (cCharAt != '<') {
                        if (cCharAt != '>') {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZIZ);
                            sbLIZ.append(str.charAt(i));
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLIZIZ);
                            sbLIZ2.append("&gt;");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(strLIZIZ);
                        sbLIZ3.append("&lt;");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(strLIZIZ);
                    sbLIZ4.append("&amp;");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                }
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(strLIZIZ);
                sbLIZ5.append('<');
                sbLIZ5.append("br");
                sbLIZ5.append('>');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
            }
        }
        return strLIZIZ;
    }

    @Override // X.AbstractC858320Xlm
    public CharSequence LJIIIZ(CharSequence charSequence) {
        int i = this.LJI;
        CharSequence[] charSequenceArr = new CharSequence[i];
        for (int i2 = 0; i2 < i; i2++) {
            charSequenceArr[i2] = "";
        }
        LJIJJ(charSequenceArr);
        if (this.LJII == C0W3U.LTR) {
            return C13LQ.LJJJ(charSequenceArr, "", null, null, null, 62);
        }
        return C13LQ.LJJJ(C13LQ.LJJJLZIJ(charSequenceArr), "", null, null, null, 62);
    }

    @Override // X.AbstractC858320Xlm
    public void LJIILIIL(String str) {
        this.LIZLLL = str;
        Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            LJJII((AbstractC858390Xlt) it2.next());
        }
    }

    public final void LJIILLIIL(AbstractC858390Xlt abstractC858390Xlt) {
        int i = this.LJI;
        this.LJI = i + 1;
        abstractC858390Xlt.LJ = i;
        abstractC858390Xlt.LIZIZ(this);
    }

    public final boolean LJIIZILJ(AbstractC858320Xlm<AVTextExtraStruct> abstractC858320Xlm) {
        if (abstractC858320Xlm instanceof C858350Xlp) {
            List<C858350Xlp> list = this.LJIIIIZZ;
            int i = this.LJI;
            this.LJI = i + 1;
            abstractC858320Xlm.LJ = i;
            ((ArrayList) list).add(abstractC858320Xlm);
            abstractC858320Xlm.LIZIZ(this);
            return true;
        }
        return false;
    }

    public AVTextExtraStruct LJIJ(AwS558S0100000_14 awS558S0100000_14) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("plz implement boundary metadata generate logic for block type: ");
        sbLIZ.append(getClass().getSimpleName());
        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void LJIJI(CharSequence[] charSequenceArr) {
        Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            LJJIII(charSequenceArr, (AbstractC858390Xlt) it2.next());
        }
    }

    public void LJIJJ(CharSequence[] charSequenceArr) {
        Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            LJJIIJ(charSequenceArr, (AbstractC858390Xlt) it2.next());
        }
    }

    public Spannable LJJ(InterfaceC858060XlM interfaceC858060XlM) {
        if (!LJIIJ()) {
            return interfaceC858060XlM.LIZ(this).LIZ(interfaceC858060XlM, this);
        }
        int i = this.LJI;
        CharSequence[] charSequenceArr = new CharSequence[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            charSequenceArr[i3] = "";
        }
        LJJIFFI(interfaceC858060XlM, charSequenceArr);
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf("");
        if (this.LJII != C0W3U.LTR) {
            Object[] objArrLJJJLZIJ = C13LQ.LJJJLZIJ(charSequenceArr);
            int length = objArrLJJJLZIJ.length;
            while (i2 < length) {
                spannableStringBuilderValueOf.append((CharSequence) objArrLJJJLZIJ[i2]);
                i2++;
            }
        } else {
            while (i2 < i) {
                spannableStringBuilderValueOf.append(charSequenceArr[i2]);
                i2++;
            }
        }
        return SpannableString.valueOf(spannableStringBuilderValueOf);
    }

    public final void LJJII(AbstractC858390Xlt abstractC858390Xlt) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIIIIZZ());
        sbLIZ.append('#');
        sbLIZ.append(abstractC858390Xlt.LJ);
        abstractC858390Xlt.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJJIII(CharSequence[] charSequenceArr, AbstractC858390Xlt abstractC858390Xlt) {
        charSequenceArr[abstractC858390Xlt.LJ] = abstractC858390Xlt.LJIILJJIL();
    }

    public static void LJJIIJ(CharSequence[] charSequenceArr, AbstractC858390Xlt abstractC858390Xlt) {
        charSequenceArr[abstractC858390Xlt.LJ] = abstractC858390Xlt.LJIILL("");
    }

    public static void LJJIIJZLJL(String str, String str2) {
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ(str, str2);
    }

    public void LJJIFFI(InterfaceC858060XlM interfaceC858060XlM, CharSequence[] charSequenceArr) {
        Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            LJJI(charSequenceArr, interfaceC858060XlM, (AbstractC858390Xlt) it2.next());
        }
    }

    public AbstractC858390Xlt(int i, int i2, int i3) {
        super(i, i2, i3);
        this.LJII = C0W3U.LTR;
        this.LJIIIIZZ = new ArrayList();
    }

    public static void LJJI(CharSequence[] charSequenceArr, InterfaceC858060XlM interfaceC858060XlM, AbstractC858390Xlt abstractC858390Xlt) {
        charSequenceArr[abstractC858390Xlt.LJ] = abstractC858390Xlt.LJJ(interfaceC858060XlM);
    }
}
