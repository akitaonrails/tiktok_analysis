package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.lynx.MixSparkCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z60, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882820z60 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882820z60(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MixSparkCard mixSparkCard;
        InterfaceC1883030z6L interfaceC1883030z6LLIZ = C1882840z62.LIZ(this.LL);
        if ((interfaceC1883030z6LLIZ instanceof MixSparkCard) && (mixSparkCard = (MixSparkCard) interfaceC1883030z6LLIZ) != null) {
            mixSparkCard.LJJJJLI();
        }
        return Unit.LIZ;
    }
}
