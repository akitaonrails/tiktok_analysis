package X;

import android.text.Spannable;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Xlp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858350Xlp extends AbstractC858390Xlt {
    public String LJIIIZ;
    public int LJIIJ;
    public final C01GW LJIIJJI;

    @Override // X.AbstractC858320Xlm
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.AbstractC858320Xlm
    public final InterfaceC858310Xll<AVTextExtraStruct> LJII() {
        return this.LJIIJ == 18 ? new InterfaceC858310Xll<AVTextExtraStruct>() { // from class: X.0Xlq
            @Override // X.InterfaceC858310Xll
            public final List<AVTextExtraStruct> getDescriptor() {
                AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
                aVTextExtraStruct.setTagId(this.LIZ.LJIIIIZZ());
                aVTextExtraStruct.type = 6553;
                aVTextExtraStruct.subType = 18;
                return Collections.singletonList(aVTextExtraStruct);
            }
        } : this.LJFF;
    }

    @Override // X.AbstractC858390Xlt, X.AbstractC858320Xlm
    public final String LJIILJJIL() {
        String strLJJIFFI = this.LJIIIZ;
        for (Map.Entry entry : ((Map) this.LJIIJJI.getValue()).entrySet()) {
            strLJJIFFI = u.LJJIFFI(strLJJIFFI, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        return strLJJIFFI;
    }

    @Override // X.AbstractC858320Xlm
    public final String LJFF() {
        return "";
    }

    @Override // X.AbstractC858320Xlm
    public final boolean LIZJ(AbstractC858320Xlm<AVTextExtraStruct> abstractC858320Xlm) {
        if (abstractC858320Xlm instanceof C858350Xlp) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJIIIZ);
            sbLIZ.append(((C858350Xlp) abstractC858320Xlm).LJIIIZ);
            this.LJIIIZ = C2188811AlT.LIZIZ(sbLIZ);
            return true;
        }
        return false;
    }

    @Override // X.AbstractC858320Xlm
    public final String LJIILL(CharSequence charSequence) {
        int length = this.LJIIIZ.length();
        String strLIZIZ = "";
        for (int i = 0; i < length; i++) {
            char cCharAt = this.LJIIIZ.charAt(i);
            if (cCharAt != '\n') {
                if (cCharAt != '&') {
                    if (cCharAt != '<') {
                        if (cCharAt != '>') {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZIZ);
                            sbLIZ.append(this.LJIIIZ.charAt(i));
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

    @Override // X.AbstractC858390Xlt
    public final Spannable LJJ(InterfaceC858060XlM interfaceC858060XlM) {
        return interfaceC858060XlM.LIZ(this).LIZ(interfaceC858060XlM, this);
    }

    public C858350Xlp(int i, int i2, CharSequence charSequence) {
        super(i, i2, i2 - i);
        this.LJIIIZ = charSequence.toString();
        this.LJIIJJI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(620));
    }
}
