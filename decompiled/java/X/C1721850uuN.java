package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.pipo.ttpay.recharge.qrcode.QrCodeFragment;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.DownloadImageConfig;
import defpackage.LogoLayoutParamsModel;
import defpackage.c5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS142S0110000_26;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0uuN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721850uuN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ QrCodeFragment LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721850uuN(QrCodeFragment qrCodeFragment, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        super(0);
        this.LL = qrCodeFragment;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
        this.LLJ = str8;
        this.LLJI = str9;
        this.LLJIJIL = str10;
        this.LLJILJIL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        DialogC1389620mGW dialogC1389620mGWWR = this.LL.WR();
        if (dialogC1389620mGWWR != null) {
            C0FNV.LIZJ(dialogC1389620mGWWR);
        }
        QrCodeFragment qrCodeFragment = this.LL;
        qrCodeFragment.LLJLLL = new AwS142S0110000_26(qrCodeFragment, this.LLJILJIL, 5);
        QrCodeFragment qrCodeFragment2 = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        String str4 = this.LLILZIL;
        String str5 = this.LLILZLL;
        String str6 = this.LLIZ;
        String str7 = this.LLIZLLLIL;
        String str8 = this.LLJ;
        String str9 = this.LLJI;
        String str10 = this.LLJIJIL;
        qrCodeFragment2.getClass();
        DownloadImageConfig downloadImageConfig = c5.LIZ().downloadImageConfig;
        if (u.LJIJI(downloadImageConfig != null ? downloadImageConfig.style : null, "v2", true)) {
            qrCodeFragment2.LLJL = (View) qrCodeFragment2.LLJJLIIIJLLLLLLLZ.getValue();
            View view = qrCodeFragment2.getView();
            TuxTextView tuxTextView = view != null ? (TuxTextView) view.findViewById(R.id.xpz) : null;
            View view2 = qrCodeFragment2.getView();
            TuxTextView tuxTextView2 = view2 != null ? (TuxTextView) view2.findViewById(R.id.xrj) : null;
            View view3 = qrCodeFragment2.getView();
            TuxTextView tuxTextView3 = view3 != null ? (TuxTextView) view3.findViewById(R.id.xpi) : null;
            View view4 = qrCodeFragment2.getView();
            ImageView imageView = view4 != null ? (ImageView) view4.findViewById(R.id.keg) : null;
            View view5 = qrCodeFragment2.getView();
            TuxTextView tuxTextView4 = view5 != null ? (TuxTextView) view5.findViewById(R.id.ayt) : null;
            View view6 = qrCodeFragment2.getView();
            ImageView imageView2 = view6 != null ? (ImageView) view6.findViewById(R.id.kdh) : null;
            LogoLayoutParamsModel logoLayoutParamsModel = c5.LIZ().logoLayoutParams;
            Integer numValueOf = (logoLayoutParamsModel == null || (num4 = logoLayoutParamsModel.width) == null) ? null : Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num4)));
            LogoLayoutParamsModel logoLayoutParamsModel2 = c5.LIZ().logoLayoutParams;
            Integer numValueOf2 = (logoLayoutParamsModel2 == null || (num3 = logoLayoutParamsModel2.height) == null) ? null : Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num3)));
            if (numValueOf != null && numValueOf2 != null && imageView2 != null) {
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                layoutParams.width = numValueOf.intValue();
                layoutParams.height = numValueOf2.intValue();
                C786410Ut5.c6(imageView2, layoutParams);
            }
            QrCodeFragment.cS(imageView, str4);
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, str.length() > 0 ? 0 : 8);
                tuxTextView.setText(str);
            }
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, str10.length() > 0 ? 0 : 8);
                tuxTextView2.setText(str10);
            }
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, str3.length() > 0 ? 0 : 8);
                tuxTextView3.setText(str3);
            }
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, str8.length() > 0 ? 0 : 4);
                if (str8.length() == 0) {
                    str8 = " ";
                }
                tuxTextView4.setText(str8);
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str9);
            c1331670kl3LJIIIZ.LJJI(imageView2);
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LJIIIZ.LJIIL(new C1775620wJ6(qrCodeFragment2, 1));
        } else {
            qrCodeFragment2.LLJL = (View) qrCodeFragment2.LLJJL.getValue();
            View view7 = qrCodeFragment2.getView();
            TextView textView = view7 != null ? (TextView) view7.findViewById(R.id.xri) : null;
            View view8 = qrCodeFragment2.getView();
            ImageView imageView3 = view8 != null ? (ImageView) view8.findViewById(R.id.kef) : null;
            View view9 = qrCodeFragment2.getView();
            TuxTextView tuxTextView5 = view9 != null ? (TuxTextView) view9.findViewById(R.id.hgg) : null;
            View view10 = qrCodeFragment2.getView();
            TuxTextView tuxTextView6 = view10 != null ? (TuxTextView) view10.findViewById(R.id.hgi) : null;
            View view11 = qrCodeFragment2.getView();
            TuxTextView tuxTextView7 = view11 != null ? (TuxTextView) view11.findViewById(R.id.ayq) : null;
            View view12 = qrCodeFragment2.getView();
            TuxTextView tuxTextView8 = view12 != null ? (TuxTextView) view12.findViewById(R.id.ays) : null;
            View view13 = qrCodeFragment2.getView();
            ImageView imageView4 = view13 != null ? (ImageView) view13.findViewById(R.id.kdg) : null;
            LogoLayoutParamsModel logoLayoutParamsModel3 = c5.LIZ().logoLayoutParams;
            Integer numValueOf3 = (logoLayoutParamsModel3 == null || (num2 = logoLayoutParamsModel3.width) == null) ? null : Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num2)));
            LogoLayoutParamsModel logoLayoutParamsModel4 = c5.LIZ().logoLayoutParams;
            Integer numValueOf4 = (logoLayoutParamsModel4 == null || (num = logoLayoutParamsModel4.height) == null) ? null : Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num)));
            if (numValueOf3 != null && numValueOf4 != null && imageView4 != null) {
                ViewGroup.LayoutParams layoutParams2 = imageView4.getLayoutParams();
                layoutParams2.width = numValueOf3.intValue();
                layoutParams2.height = numValueOf4.intValue();
                C786410Ut5.c6(imageView4, layoutParams2);
            }
            QrCodeFragment.cS(imageView3, str4);
            if (textView != null) {
                textView.setText(str2);
            }
            if (str6.length() <= 0 || str5.length() <= 0) {
                if (tuxTextView5 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView5, 8);
                }
                if (tuxTextView6 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView6, 8);
                }
            } else {
                if (tuxTextView5 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView5, 0);
                }
                if (tuxTextView6 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView6, 0);
                }
                if (tuxTextView5 != null) {
                    tuxTextView5.setText(str5);
                }
                if (tuxTextView6 != null) {
                    tuxTextView6.setText(str6);
                }
            }
            if (str7.length() <= 0 || str8.length() <= 0) {
                if (tuxTextView7 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView7, 8);
                }
                if (tuxTextView8 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView8, 8);
                }
            } else {
                if (tuxTextView7 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView7, 0);
                }
                if (tuxTextView8 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView8, 0);
                }
                if (tuxTextView7 != null) {
                    tuxTextView7.setText(str7);
                }
                if (tuxTextView8 != null) {
                    tuxTextView8.setText(str8);
                }
            }
            C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str9);
            c1331670kl3LJIIIZ2.LJJI(imageView4);
            c1331670kl3LJIIIZ2.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LJIIIZ2.LJIIL(new C1775620wJ6(qrCodeFragment2, 1));
        }
        return Unit.LIZ;
    }
}
