package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0XmD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858590XmD extends AbstractC858390Xlt {
    public String LJIIIZ;
    public int LJIIJ;

    @Override // X.AbstractC858320Xlm
    public final String LJFF() {
        return this.LJIIJ == 520 ? "as" : "ap";
    }

    @Override // X.AbstractC858320Xlm
    public final InterfaceC858310Xll<AVTextExtraStruct> LJII() {
        return new InterfaceC858310Xll<AVTextExtraStruct>() { // from class: X.0XmC
            @Override // X.InterfaceC858310Xll
            public final List<AVTextExtraStruct> getDescriptor() {
                AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
                aVTextExtraStruct.setTagId(this.LIZ.LJIIIIZZ());
                aVTextExtraStruct.type = 6553;
                return Collections.singletonList(aVTextExtraStruct);
            }
        };
    }

    @Override // X.AbstractC858390Xlt, X.AbstractC858320Xlm
    public final String LJIILJJIL() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC858390Xlt, X.AbstractC858320Xlm
    public final CharSequence LJIIIZ(CharSequence charSequence) {
        return AbstractC858390Xlt.LJIJJLI(this.LJIIIZ);
    }

    public C858590XmD(int i, int i2) {
        super(i, i2, i2 - i);
        this.LJIIIZ = "";
        this.LJIIJ = 520;
    }
}
