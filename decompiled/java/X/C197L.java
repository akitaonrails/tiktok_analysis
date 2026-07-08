package X;

import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.CachePoweredTexts;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.PoweredTextItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.197L, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C197L extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C197G LL;
    public final /* synthetic */ CachePoweredTexts LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ PoweredTextItem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C197L(C197G c197g, CachePoweredTexts cachePoweredTexts, int i, PoweredTextItem poweredTextItem) {
        super(0);
        this.LL = c197g;
        this.LLILLJJLI = cachePoweredTexts;
        this.LLILLL = i;
        this.LLILZ = poweredTextItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C197G c197g = this.LL;
        if (!c197g.LJ) {
            this.LLILLJJLI.currentIndex = this.LLILLL + 1;
            PoweredTextItem poweredTextItem = this.LLILZ;
            c197g.LJII = false;
            c197g.LIZJ.LIZJ(poweredTextItem, c197g.LIZLLL);
        }
        this.LL.LJ = false;
        return Unit.LIZ;
    }
}
