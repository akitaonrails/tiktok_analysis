package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cNB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009350cNB extends AbstractC1014240cV4 {
    public final InterfaceC430190Gtt LLJLIL;
    public LinearLayout LLJLILLLLZIIL;
    public final List<AtomicBoolean> LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZJ() {
        super.LIZJ();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        super.LJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f0  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.ArrayList] */
    @Override // X.AbstractC1014240cV4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel r24) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1009350cNB.LJII(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel):void");
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIIIIZZ(String str) {
        super.LJIIIIZZ(str);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleEvent ");
        sbLIZ.append(abstractC1003980cEW);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Ck(Function1<? super Boolean, Unit> function1) {
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        super.Fk(viewGroup, interfaceC1014340cVE);
        LinearLayout linearLayout = null;
        View viewSd = C786410Ut5.Sd(R.layout.pk, C786410Ut5.ne(this.LLILZ), null);
        this.LLJJIJIL = viewSd;
        if (viewSd != null) {
            linearLayout = (LinearLayout) viewSd.findViewById(R.id.eqx);
        }
        this.LLJLILLLLZIIL = linearLayout;
    }

    public C1009350cNB(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context, InterfaceC430190Gtt interfaceC430190Gtt) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = interfaceC430190Gtt;
        this.LLJLL = new ArrayList();
        this.LLJLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(c1009340cNA, 841));
        this.LLJLLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 840));
    }
}
