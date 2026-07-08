package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0Xm4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858500Xm4 extends AbstractC858390Xlt {
    public final String LJIIIZ;
    public final C858610XmF LJIIJ;
    public final long LJIIJJI;
    public int LJIIL;
    public String LJIILIIL;

    @Override // X.AbstractC858320Xlm
    public final InterfaceC858310Xll<AVTextExtraStruct> LJII() {
        return new InterfaceC858310Xll<AVTextExtraStruct>() { // from class: X.0Xm3
            @Override // X.InterfaceC858310Xll
            public final List<AVTextExtraStruct> getDescriptor() {
                AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
                C858500Xm4 c858500Xm4 = this.LIZ;
                aVTextExtraStruct.awemeId = c858500Xm4.LJIIIZ;
                aVTextExtraStruct.setTagId(c858500Xm4.LJIIIIZZ());
                aVTextExtraStruct.setSecUid(c858500Xm4.LJIIJ.LIZIZ);
                aVTextExtraStruct.userId = c858500Xm4.LJIIJ.LIZ;
                aVTextExtraStruct.commentId = c858500Xm4.LJIIJJI;
                aVTextExtraStruct.type = 5;
                aVTextExtraStruct.subType = c858500Xm4.LJIIL;
                Object obj = c858500Xm4.LIZJ;
                if ((obj instanceof C858410Xlv) || (obj instanceof C858420Xlw)) {
                    aVTextExtraStruct.type = 0;
                    aVTextExtraStruct.subType = 1;
                } else if (obj instanceof C858430Xlx) {
                    aVTextExtraStruct.type = 0;
                    aVTextExtraStruct.subType = 16;
                }
                return Collections.singletonList(aVTextExtraStruct);
            }
        };
    }

    @Override // X.AbstractC858390Xlt, X.AbstractC858320Xlm
    public final String LJIILJJIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        String str = this.LJIILIIL;
        if (str == null) {
            str = null;
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC858320Xlm
    public final String LJFF() {
        return "v";
    }

    @Override // X.AbstractC858390Xlt, X.AbstractC858320Xlm
    public final CharSequence LJIIIZ(CharSequence charSequence) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        String str = this.LJIILIIL;
        if (str == null) {
            str = null;
        }
        sbLIZ.append(str);
        return AbstractC858390Xlt.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C858500Xm4(int i, int i2, String str, C858610XmF c858610XmF, long j) {
        super(i, i2, i2 - i);
        this.LJIIIZ = str;
        this.LJIIJ = c858610XmF;
        this.LJIIJJI = j;
        this.LJIIL = 6;
    }
}
