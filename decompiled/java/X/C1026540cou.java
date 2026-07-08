package X;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1026540cou extends AbstractC1026640cp4<C1026780cpI> {
    public final C1026780cpI LJIILL;
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 730));

    @Override // X.AbstractC1026640cp4
    public final String LJIILLIIL() {
        return "boc";
    }

    @Override // X.InterfaceC1026720cpC
    public final boolean LJ() {
        C1026780cpI c1026780cpI = this.LJIILL;
        return c1026780cpI.LIZIZ.LJIIJ ? C815510Vyv.LIZIZ(UriProtector.parse(c1026780cpI.LIZJ)) : c1026780cpI.LIZJ.length() > 0;
    }

    @Override // X.InterfaceC1026870cpR
    public final String getUrl() {
        String str = this.LJIILL.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getUrl() = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        return str;
    }

    @Override // X.AbstractC1026640cp4
    public final /* bridge */ /* synthetic */ AbstractC1026880cpS LJIILL() {
        return this.LJIILL;
    }

    public C1026540cou(C1026780cpI c1026780cpI) {
        this.LJIILL = c1026780cpI;
    }

    @Override // X.InterfaceC1026720cpC
    public final Object LIZLLL(C1026650cp5 c1026650cp5) {
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) this.LJIILLIIL.getValue());
        LJIILIIL().LJIILL(intent, EnumC1025640cnS.BROWSER);
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        LJIILIIL().LJIILL(intentCreateChooser, EnumC1025640cnS.OPEN_BROWSER_BY_CHOOSER);
        return LJIJI(intentCreateChooser);
    }
}
