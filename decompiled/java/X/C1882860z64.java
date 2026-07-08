package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.lynx.MixSparkCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z64, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882860z64 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882860z64(String str, boolean z) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MixSparkCard mixSparkCard;
        InterfaceC1883030z6L interfaceC1883030z6LLIZ = C1882840z62.LIZ(this.LL);
        if ((interfaceC1883030z6LLIZ instanceof MixSparkCard) && (mixSparkCard = (MixSparkCard) interfaceC1883030z6LLIZ) != null) {
            String str = this.LL;
            boolean z = this.LLILLJJLI;
            C1883920z7m c1883920z7m = mixSparkCard.LLJJL;
            if (Intrinsics.LJFF(c1883920z7m != null ? c1883920z7m.LIZIZ() : null, str) && !mixSparkCard.LLJLIL) {
                String str2 = (String) mixSparkCard.LLJJIJIL.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onBusinessFinishedLoading, success: ");
                sbLIZ.append(z);
                C1882870z65.LIZ(mixSparkCard, str2, C2188811AlT.LIZIZ(sbLIZ));
                if (z) {
                    mixSparkCard.LJJIJL();
                } else {
                    mixSparkCard.LJJJJ(1202, "lynx business error");
                    mixSparkCard.LJJIJIIJIL();
                }
            }
        }
        return Unit.LIZ;
    }
}
