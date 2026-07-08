package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Xlu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858400Xlu extends AbstractC858390Xlt {
    public C858470Xm1 LJIIIZ;

    public C858400Xlu() {
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
        return new InterfaceC858310Xll<AVTextExtraStruct>() { // from class: X.0Xm7
            @Override // X.InterfaceC858310Xll
            public final List<AVTextExtraStruct> getDescriptor() {
                ArrayList arrayList = new ArrayList();
                C858470Xm1 c858470Xm1 = this.LIZ.LJIIIZ;
                if (c858470Xm1 == null) {
                    c858470Xm1 = null;
                }
                arrayList.addAll(c858470Xm1.LJI());
                AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) C13LP.LJJLIIIJL(arrayList);
                if (aVTextExtraStruct != null) {
                    aVTextExtraStruct.subType = 2;
                }
                return arrayList;
            }
        };
    }

    @Override // X.AbstractC858320Xlm
    public final boolean LJIIJJI() {
        return this.LJIIIZ != null;
    }

    @Override // X.AbstractC858320Xlm
    public final String LJFF() {
        return "rc";
    }

    public C858400Xlu(int i) {
        super(0, 0, 0);
    }

    @Override // X.AbstractC858320Xlm
    public final boolean LIZJ(AbstractC858320Xlm<AVTextExtraStruct> abstractC858320Xlm) {
        if (LJIIZILJ(abstractC858320Xlm)) {
            return true;
        }
        if (this.LJIIIZ == null && (abstractC858320Xlm instanceof C858470Xm1)) {
            AbstractC858390Xlt abstractC858390Xlt = (AbstractC858390Xlt) abstractC858320Xlm;
            LJIILLIIL(abstractC858390Xlt);
            C858470Xm1 c858470Xm1 = (C858470Xm1) abstractC858390Xlt;
            c858470Xm1.LJIIJJI = EnumC858180XlY.COMMENT;
            this.LJIIIZ = c858470Xm1;
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unexpected text block, type: ");
        sbLIZ.append(abstractC858320Xlm.getClass().getSimpleName());
        sbLIZ.append(", reference=");
        sbLIZ.append(abstractC858320Xlm);
        AbstractC858390Xlt.LJJIIJZLJL("ReplyCommentChainTextBlock", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    @Override // X.AbstractC858390Xlt, X.AbstractC858320Xlm
    public final void LJIILIIL(String str) {
        super.LJIILIIL(str);
        C858470Xm1 c858470Xm1 = this.LJIIIZ;
        if (c858470Xm1 == null) {
            c858470Xm1 = null;
        }
        LJJII(c858470Xm1);
    }

    @Override // X.AbstractC858390Xlt
    public final AVTextExtraStruct LJIJ(AwS558S0100000_14 awS558S0100000_14) {
        return AVTextExtraStructHelper.createCommentChainBoundaryStruct((String) awS558S0100000_14.invoke());
    }

    @Override // X.AbstractC858390Xlt
    public final void LJIJI(CharSequence[] charSequenceArr) {
        super.LJIJI(charSequenceArr);
        C858470Xm1 c858470Xm1 = this.LJIIIZ;
        if (c858470Xm1 == null) {
            c858470Xm1 = null;
        }
        AbstractC858390Xlt.LJJIII(charSequenceArr, c858470Xm1);
    }

    @Override // X.AbstractC858390Xlt
    public final void LJIJJ(CharSequence[] charSequenceArr) {
        super.LJIJJ(charSequenceArr);
        C858470Xm1 c858470Xm1 = this.LJIIIZ;
        if (c858470Xm1 == null) {
            c858470Xm1 = null;
        }
        AbstractC858390Xlt.LJJIIJ(charSequenceArr, c858470Xm1);
    }

    @Override // X.AbstractC858390Xlt
    public final void LJJIFFI(InterfaceC858060XlM interfaceC858060XlM, CharSequence[] charSequenceArr) {
        super.LJJIFFI(interfaceC858060XlM, charSequenceArr);
        C858470Xm1 c858470Xm1 = this.LJIIIZ;
        if (c858470Xm1 == null) {
            c858470Xm1 = null;
        }
        AbstractC858390Xlt.LJJI(charSequenceArr, interfaceC858060XlM, c858470Xm1);
    }
}
