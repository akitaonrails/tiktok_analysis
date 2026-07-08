package X;

import com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yGQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850840yGQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0TLO LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1850840yGQ(C0TLO c0tlo, int i, String str) {
        super(0);
        this.LL = c0tlo;
        this.LLILLJJLI = i;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<GiftPickWithScore> listLJIIJJI;
        C0TLO c0tlo = this.LL;
        GiftPickWithScore giftPickWithScore = c0tlo.LLILLJJLI;
        if (giftPickWithScore != null) {
            C323580CmK c323580CmK = new C323580CmK(2);
            c323580CmK.LIZ(giftPickWithScore);
            c323580CmK.LIZIZ(c0tlo.LL.toArray(new GiftPickWithScore[0]));
            listLJIIJJI = C1697810uHb.LJIIJJI(c323580CmK.LIZLLL(new GiftPickWithScore[c323580CmK.LIZJ()]));
        } else {
            listLJIIJJI = c0tlo.LL;
        }
        C0TLO c0tlo2 = this.LL;
        C1AI0.LJIIJ(listLJIIJJI, c0tlo2.LLILZLL, this.LLILLJJLI, c0tlo2.LLILLL, c0tlo2.LLJ, c0tlo2.LLIZ, this.LLILLL, "click", c0tlo2.LLILZ);
        C0TLO c0tlo3 = this.LL;
        if (!c0tlo3.LLILLL) {
            C1AI0.LJII(c0tlo3.LLILZLL, "click", null);
        }
        if (this.LL.LLIZLLLIL) {
            C784440Upu.LIZ().LIZIZ(new C1103910eph("click", null));
        }
        return Unit.LIZ;
    }
}
