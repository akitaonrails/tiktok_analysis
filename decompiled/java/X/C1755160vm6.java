package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBodyWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vm6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1755160vm6 extends C2217421BqW implements Function1<Integer, Unit> {
    public C1755160vm6(SeaPdpBodyWidget seaPdpBodyWidget) {
        super(1, seaPdpBodyWidget, SeaPdpBodyWidget.class, "notifyGodaV1ItemDidBind", "notifyGodaV1ItemDidBind(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((SeaPdpBodyWidget) this.receiver).LJIIJJI(num.intValue());
        return Unit.LIZ;
    }
}
