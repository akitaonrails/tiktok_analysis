package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Xlw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858420Xlw extends AbstractC858390Xlt {
    public C858540Xm8 LJIIIZ;
    public C858500Xm4 LJIIJ;

    public C858420Xlw() {
        super(0, 0, 0);
    }

    @Override // X.AbstractC858320Xlm
    public final String LIZLLL(String str) {
        return "";
    }

    @Override // X.AbstractC858320Xlm
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.AbstractC858320Xlm
    public final boolean LJIIL() {
        return false;
    }

    @Override // X.AbstractC858390Xlt
    public final boolean LJIL() {
        return true;
    }

    @Override // X.AbstractC858320Xlm
    public final InterfaceC858310Xll<AVTextExtraStruct> LJII() {
        return new InterfaceC858310Xll<AVTextExtraStruct>() { // from class: X.0Xm5
            @Override // X.InterfaceC858310Xll
            public final List<AVTextExtraStruct> getDescriptor() {
                ArrayList arrayList = new ArrayList();
                C858420Xlw c858420Xlw = this.LIZ;
                C858540Xm8 c858540Xm8 = c858420Xlw.LJIIIZ;
                if (c858540Xm8 == null) {
                    c858540Xm8 = null;
                }
                arrayList.addAll(c858540Xm8.LJI());
                C858500Xm4 c858500Xm4 = c858420Xlw.LJIIJ;
                arrayList.addAll((c858500Xm4 != null ? c858500Xm4 : null).LJI());
                AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) C13LP.LJJLIIIJL(arrayList);
                if (aVTextExtraStruct != null) {
                    aVTextExtraStruct.type = 0;
                    aVTextExtraStruct.subType = 1;
                }
                return arrayList;
            }
        };
    }

    @Override // X.AbstractC858320Xlm
    public final boolean LJIIJJI() {
        return (this.LJIIIZ == null || this.LJIIJ == null) ? false : true;
    }

    @Override // X.AbstractC858320Xlm
    public final String LJFF() {
        return "s";
    }

    public C858420Xlw(int i) {
        super(0, 0, 0);
    }

    @Override // X.AbstractC858320Xlm
    public final boolean LIZJ(AbstractC858320Xlm<AVTextExtraStruct> abstractC858320Xlm) {
        if (LJIIZILJ(abstractC858320Xlm)) {
            return true;
        }
        if (this.LJIIIZ == null && (abstractC858320Xlm instanceof C858540Xm8)) {
            AbstractC858390Xlt abstractC858390Xlt = (AbstractC858390Xlt) abstractC858320Xlm;
            LJIILLIIL(abstractC858390Xlt);
            this.LJIIIZ = (C858540Xm8) abstractC858390Xlt;
            return true;
        }
        if (this.LJIIJ == null && (abstractC858320Xlm instanceof C858500Xm4)) {
            AbstractC858390Xlt abstractC858390Xlt2 = (AbstractC858390Xlt) abstractC858320Xlm;
            LJIILLIIL(abstractC858390Xlt2);
            this.LJIIJ = (C858500Xm4) abstractC858390Xlt2;
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unexpected text block, type: ");
        sbLIZ.append(abstractC858320Xlm.getClass().getSimpleName());
        sbLIZ.append(", reference=");
        sbLIZ.append(abstractC858320Xlm);
        AbstractC858390Xlt.LJJIIJZLJL("StitchChainTextBlock", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    @Override // X.AbstractC858390Xlt, X.AbstractC858320Xlm
    public final void LJIILIIL(String str) {
        super.LJIILIIL(str);
        C858540Xm8 c858540Xm8 = this.LJIIIZ;
        C858500Xm4 c858500Xm4 = null;
        if (c858540Xm8 == null) {
            c858540Xm8 = null;
        }
        LJJII(c858540Xm8);
        C858500Xm4 c858500Xm42 = this.LJIIJ;
        if (c858500Xm42 != null) {
            c858500Xm4 = c858500Xm42;
        }
        LJJII(c858500Xm4);
    }

    @Override // X.AbstractC858390Xlt
    public final AVTextExtraStruct LJIJ(AwS558S0100000_14 awS558S0100000_14) {
        return AVTextExtraStructHelper.createStitchChainBoundaryStruct((String) awS558S0100000_14.invoke());
    }

    @Override // X.AbstractC858390Xlt
    public final void LJIJI(CharSequence[] charSequenceArr) {
        super.LJIJI(charSequenceArr);
        C858540Xm8 c858540Xm8 = this.LJIIIZ;
        C858500Xm4 c858500Xm4 = null;
        if (c858540Xm8 == null) {
            c858540Xm8 = null;
        }
        AbstractC858390Xlt.LJJIII(charSequenceArr, c858540Xm8);
        C858500Xm4 c858500Xm42 = this.LJIIJ;
        if (c858500Xm42 != null) {
            c858500Xm4 = c858500Xm42;
        }
        AbstractC858390Xlt.LJJIII(charSequenceArr, c858500Xm4);
    }

    @Override // X.AbstractC858390Xlt
    public final void LJIJJ(CharSequence[] charSequenceArr) {
        super.LJIJJ(charSequenceArr);
        C858540Xm8 c858540Xm8 = this.LJIIIZ;
        C858500Xm4 c858500Xm4 = null;
        if (c858540Xm8 == null) {
            c858540Xm8 = null;
        }
        AbstractC858390Xlt.LJJIIJ(charSequenceArr, c858540Xm8);
        C858500Xm4 c858500Xm42 = this.LJIIJ;
        if (c858500Xm42 != null) {
            c858500Xm4 = c858500Xm42;
        }
        AbstractC858390Xlt.LJJIIJ(charSequenceArr, c858500Xm4);
    }

    @Override // X.AbstractC858390Xlt
    public final void LJJIFFI(InterfaceC858060XlM interfaceC858060XlM, CharSequence[] charSequenceArr) {
        super.LJJIFFI(interfaceC858060XlM, charSequenceArr);
        C858540Xm8 c858540Xm8 = this.LJIIIZ;
        C858500Xm4 c858500Xm4 = null;
        if (c858540Xm8 == null) {
            c858540Xm8 = null;
        }
        AbstractC858390Xlt.LJJI(charSequenceArr, interfaceC858060XlM, c858540Xm8);
        C858500Xm4 c858500Xm42 = this.LJIIJ;
        if (c858500Xm42 != null) {
            c858500Xm4 = c858500Xm42;
        }
        AbstractC858390Xlt.LJJI(charSequenceArr, interfaceC858060XlM, c858500Xm4);
    }
}
