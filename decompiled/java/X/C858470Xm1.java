package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0Xm1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858470Xm1 extends AbstractC858390Xlt {
    public final C858610XmF LJIIIZ;
    public int LJIIJ;
    public EnumC858180XlY LJIIJJI;
    public String LJIIL;

    @Override // X.AbstractC858320Xlm
    public final InterfaceC858310Xll<AVTextExtraStruct> LJII() {
        return new InterfaceC858310Xll<AVTextExtraStruct>() { // from class: X.0Xm2
            @Override // X.InterfaceC858310Xll
            public final List<AVTextExtraStruct> getDescriptor() {
                AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
                C858470Xm1 c858470Xm1 = this.LIZ;
                aVTextExtraStruct.setTagId(c858470Xm1.LJIIIIZZ());
                aVTextExtraStruct.setSecUid(c858470Xm1.LJIIIZ.LIZIZ);
                aVTextExtraStruct.userId = c858470Xm1.LJIIIZ.LIZ;
                aVTextExtraStruct.type = 0;
                aVTextExtraStruct.atUserType = "";
                aVTextExtraStruct.subType = c858470Xm1.LIZJ instanceof C858400Xlu ? 2 : c858470Xm1.LJIIJ;
                return Collections.singletonList(aVTextExtraStruct);
            }
        };
    }

    @Override // X.AbstractC858390Xlt, X.AbstractC858320Xlm
    public final String LJIILJJIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        String str = this.LJIIL;
        if (str == null) {
            str = null;
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC858320Xlm
    public final String LJFF() {
        return "m";
    }

    @Override // X.AbstractC858390Xlt, X.AbstractC858320Xlm
    public final CharSequence LJIIIZ(CharSequence charSequence) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        String str = this.LJIIL;
        if (str == null) {
            str = null;
        }
        sbLIZ.append(str);
        return AbstractC858390Xlt.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C858470Xm1(int i, int i2, C858610XmF c858610XmF) {
        super(i, i2, i2 - i);
        this.LJIIIZ = c858610XmF;
        this.LJIIJJI = EnumC858180XlY.VIDEO;
    }
}
