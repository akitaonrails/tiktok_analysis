package X;

import android.webkit.WebBackForwardList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dBE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040380dBE extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ C1040740dBo LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;
    public final /* synthetic */ C238400w2 LLILLL;
    public final /* synthetic */ C238400w2 LLILZ;
    public final /* synthetic */ C238400w2 LLILZIL;
    public final /* synthetic */ WebBackForwardList LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;
    public final /* synthetic */ C259800zU<String> LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040380dBE(C1040740dBo c1040740dBo, C238400w2 c238400w2, C238400w2 c238400w22, C238400w2 c238400w23, C238400w2 c238400w24, WebBackForwardList webBackForwardList, C259800zU<String> c259800zU, C259800zU<String> c259800zU2, String str) {
        super(1);
        this.LL = c1040740dBo;
        this.LLILLJJLI = c238400w2;
        this.LLILLL = c238400w22;
        this.LLILZ = c238400w23;
        this.LLILZIL = c238400w24;
        this.LLILZLL = webBackForwardList;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = c259800zU2;
        this.LLJ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        int size;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1043500dGG.LIZ.getClass();
        c1023640ckE2.withParam(C1043500dGG.LJIILJJIL, Integer.valueOf(this.LL.LLILLL));
        c1023640ckE2.withParam(C1043500dGG.LJIILLIIL, this.LL.LLJI);
        c1023640ckE2.withParam(C1043500dGG.LJJIII, this.LL.LLJI);
        c1023640ckE2.withParam(C1043500dGG.LJIIZILJ, Long.valueOf(this.LLILLJJLI.element));
        c1023640ckE2.withParam(C1043500dGG.LJIJ, Long.valueOf(this.LLILLL.element));
        c1023640ckE2.withParam(C1043500dGG.LJJ, Long.valueOf(this.LLILZ.element));
        c1023640ckE2.withParam(C1043500dGG.LJJI, Long.valueOf(this.LLILZIL.element));
        c1023640ckE2.withParam(C1043500dGG.LJLLI, Integer.valueOf(this.LL.LLJJIII));
        C1002190cBd c1002190cBd = C1043500dGG.LJJIJLIJ;
        WebBackForwardList webBackForwardList = this.LLILZLL;
        if (webBackForwardList != null) {
            size = webBackForwardList.getSize();
        } else {
            size = -1;
        }
        c1023640ckE2.withParam(c1002190cBd, Integer.valueOf(size));
        c1023640ckE2.withParam(C1043500dGG.LJJIL, this.LLIZ.element);
        c1023640ckE2.withParam(C1043500dGG.LJJIZ, this.LLIZLLLIL.element);
        c1023640ckE2.withParam(C1043500dGG.LIZLLL, this.LLJ);
        C1002190cBd c1002190cBd2 = C1043500dGG.LJJZ;
        float currentOffset = this.LL.LL.getCurrentOffset();
        C844470XAv.LIZ.getClass();
        c1023640ckE2.withParam(c1002190cBd2, Double.valueOf(currentOffset / C12ES.LJIIIIZZ(C844470XAv.LIZ())));
        c1023640ckE2.withParam(C1043500dGG.LJJJZ, Integer.valueOf(this.LL.LL.getWebLoadStatusModel().loadingStatus));
        c1023640ckE2.withParam(C1043500dGG.LJJLIIJ, Integer.valueOf(this.LL.LL.getAllClickCount()));
        c1023640ckE2.withParam(C1043500dGG.LJJZZI, Integer.valueOf(this.LL.LL.getAllScrollCount()));
        return Unit.LIZ;
    }
}
