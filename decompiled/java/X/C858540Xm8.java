package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0Xm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858540Xm8 extends AbstractC858390Xlt {
    public int LJIIIZ;
    public String LJIIJ;

    @Override // X.AbstractC858320Xlm
    public final InterfaceC858310Xll<AVTextExtraStruct> LJII() {
        return new InterfaceC858310Xll<AVTextExtraStruct>() { // from class: X.0Xm9
            @Override // X.InterfaceC858310Xll
            public final List<AVTextExtraStruct> getDescriptor() {
                AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
                C858540Xm8 c858540Xm8 = this.LIZ;
                String str = c858540Xm8.LJIIJ;
                if (str == null) {
                    str = null;
                }
                aVTextExtraStruct.hashTagName = str;
                aVTextExtraStruct.setTagId(c858540Xm8.LJIIIIZZ());
                aVTextExtraStruct.subType = c858540Xm8.LJIIIZ;
                aVTextExtraStruct.type = 1;
                return Collections.singletonList(aVTextExtraStruct);
            }
        };
    }

    @Override // X.AbstractC858390Xlt, X.AbstractC858320Xlm
    public final String LJIILJJIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('#');
        String str = this.LJIIJ;
        if (str == null) {
            str = null;
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC858320Xlm
    public final String LJFF() {
        return "h";
    }

    @Override // X.AbstractC858390Xlt, X.AbstractC858320Xlm
    public final CharSequence LJIIIZ(CharSequence charSequence) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('#');
        String str = this.LJIIJ;
        if (str == null) {
            str = null;
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C858540Xm8(int i, int i2) {
        super(i, i2, i2 - i);
    }
}
