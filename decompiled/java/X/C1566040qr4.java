package X;

import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qr4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566040qr4 extends C09AY implements Function1<C1566060qr6, Unit> {
    public final /* synthetic */ RootPanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566040qr4(RootPanelComponent rootPanelComponent) {
        super(1);
        this.LL = rootPanelComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1566060qr6 c1566060qr6) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RootPanelComponent>>> ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" :onStart");
        c1566060qr6.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }
}
