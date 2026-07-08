package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.supplementalinfocomponent.model.AnoleSupplementalInfoData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cDX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003370cDX extends AbstractC1014240cV4 {
    public final C01GW LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    public final AnoleSupplementalInfoData LJJ() {
        return (AnoleSupplementalInfoData) this.LLJLIL.getValue();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIILL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleSupplementalInfoComponent,type:");
        sbLIZ.append(this.LL.type);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        super.LJII(anoleComponentAppearModel);
        C1003350cDV c1003350cDV = (C1003350cDV) this.LLJLL.getValue();
        c1003350cDV.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) c1003350cDV.LIZLLL.getValue(), new AwS595S0100000_16(this.LL, 58));
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        TuxTextView tuxTextView;
        UrlModel urlModel;
        int iIntValue;
        Integer num;
        super.Fk(viewGroup, interfaceC1014340cVE);
        this.LLJJI = new C1009390cNF(-1.0d, -2.0d);
        AnoleSupplementalInfoData anoleSupplementalInfoDataLJJ = LJJ();
        if (anoleSupplementalInfoDataLJJ != null && anoleSupplementalInfoDataLJJ.title != null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.ql, this.LLJJIII, false);
            this.LLJJIJIL = viewTd;
            String str = null;
            if (viewTd != null) {
                tuxTextView = (TuxTextView) viewTd.findViewById(R.id.tv_supplemental_info);
            } else {
                tuxTextView = null;
            }
            this.LLJLILLLLZIIL = tuxTextView;
            if (tuxTextView != null) {
                AnoleSupplementalInfoData anoleSupplementalInfoDataLJJ2 = LJJ();
                if (anoleSupplementalInfoDataLJJ2 != null && (num = anoleSupplementalInfoDataLJJ2.maxLines) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 2;
                }
                tuxTextView.setMaxLines(iIntValue);
            }
            AnoleSupplementalInfoData anoleSupplementalInfoDataLJJ3 = LJJ();
            if (anoleSupplementalInfoDataLJJ3 != null && (urlModel = anoleSupplementalInfoDataLJJ3.icon) != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c1331670kl3LJIIIIZZ.LJIIJJI = iLIZIZ;
                c1331670kl3LJIIIIZZ.LJIIL = iLIZIZ2;
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZIZ3;
                c1331670kl3LJIIIIZZ.LJIIIZ = iLIZIZ4;
                c1331670kl3LJIIIIZZ.LJJIIJ(new C0H2F() { // from class: X.0H2E
                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0H2C(bitmap, this.LL, null), 3);
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0H2D(this.LL, null), 3);
                    }
                });
            } else {
                TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
                if (tuxTextView2 != null) {
                    AnoleSupplementalInfoData anoleSupplementalInfoDataLJJ4 = LJJ();
                    if (anoleSupplementalInfoDataLJJ4 != null) {
                        str = anoleSupplementalInfoDataLJJ4.title;
                    }
                    tuxTextView2.setText(str);
                }
            }
            View view = this.LLJJIJIL;
            if (view != null) {
                C1003890cEN c1003890cEN = AbstractViewOnClickListenerC1003880cEM.LLILLL;
                AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16(this, 57);
                c1003890cEN.getClass();
                C786410Ut5.I7(new C1003560cDq(awS595S0100000_16), view);
            }
            C2271391DvN.LIZ(this.LLJJIJIL, (C1A5L) C2271381DvM.LLZZJLIL.getValue());
        }
    }

    public C1003370cDX(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 22));
        this.LLJLL = C452501pT.LIZIZ(new AwS417S0200000_16(c1009340cNA, anoleComponentModel, 5));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(20));
    }
}
