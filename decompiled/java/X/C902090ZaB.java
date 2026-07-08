package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902090ZaB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C901890ZZr LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ BaseTemplate LLILLL;
    public final /* synthetic */ UrlModel LLILZ;
    public final /* synthetic */ C0ZSW LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C902090ZaB(C901890ZZr c901890ZZr, C869590Y9l c869590Y9l, BaseTemplate baseTemplate, UrlModel urlModel, C0ZSW c0zsw, String str) {
        super(0);
        this.LL = c901890ZZr;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = baseTemplate;
        this.LLILZ = urlModel;
        this.LLILZIL = c0zsw;
        this.LLILZLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZLLL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, null);
        return Unit.LIZ;
    }
}
