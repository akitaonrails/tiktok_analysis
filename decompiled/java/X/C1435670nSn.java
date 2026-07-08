package X;

import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import java.util.Iterator;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nSn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435670nSn extends AbstractC1434490nQt {
    public C1434960nRe LLILZLL;
    public C1431070nLN LLIZ;
    public volatile DMMediaModel LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1129));

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.EXTRACT;
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        String str;
        String str2;
        C1435510nSX c1435510nSX = (C1435510nSX) this.LLJ.getValue();
        if (c1435510nSX != null) {
            c1435510nSX.LIZIZ();
        }
        this.LLIZ = c1431070nLN;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    C1434960nRe c1434960nRe = (C1434960nRe) next;
                    this.LLILZLL = c1434960nRe;
                    this.LLIZLLLIL = c1434960nRe.LIZ.creativeModel.dmMediaModel;
                    DMMediaModel dMMediaModel = this.LLIZLLLIL;
                    if (dMMediaModel != null && dMMediaModel.skipExtractVideoCover) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("skip extract video cover, output cover file ");
                        DMMediaModel dMMediaModel2 = this.LLIZLLLIL;
                        if (dMMediaModel2 != null) {
                            str = dMMediaModel2.outputCoverFile;
                        } else {
                            str = null;
                        }
                        sbLIZ.append(str);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C1431070nLN c1431070nLN2 = this.LLIZ;
                        if (c1431070nLN2 == null) {
                            c1431070nLN2 = null;
                        }
                        DMMediaModel dMMediaModel3 = this.LLIZLLLIL;
                        if (dMMediaModel3 == null || (str2 = dMMediaModel3.outputCoverFile) == null) {
                            str2 = "";
                        }
                        c1431070nLN2.LIZIZ(new C1436050nTP(str2), EnumC2251001D8o.OUTER);
                        C1435510nSX c1435510nSX2 = (C1435510nSX) this.LLJ.getValue();
                        if (c1435510nSX2 != null) {
                            c1435510nSX2.LIZ();
                        }
                        C1431070nLN c1431070nLN3 = this.LLIZ;
                        if (c1431070nLN3 == null) {
                            c1431070nLN3 = null;
                        }
                        c1431070nLN3.LJ(null, false);
                        return;
                    }
                    C1435510nSX c1435510nSX3 = (C1435510nSX) this.LLJ.getValue();
                    if (c1435510nSX3 != null) {
                        c1435510nSX3.LIZ();
                    }
                    C1431070nLN c1431070nLN4 = this.LLIZ;
                    if (c1431070nLN4 == null) {
                        c1431070nLN4 = null;
                    }
                    c1431070nLN4.LJ(null, false);
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }
}
