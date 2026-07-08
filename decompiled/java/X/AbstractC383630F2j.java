package X;

import Y.ACListenerS140S0100000_5;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC383630F2j {
    public final View LIZ;
    public String LIZIZ = "";
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1180));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1183));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1182));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1179));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1178));
    public final C01GW LJII;
    public Function0<Unit> LJIIIIZZ;

    public final SmartImageView LIZ() {
        return (SmartImageView) this.LJI.getValue();
    }

    public final View LIZIZ() {
        return (View) this.LIZJ.getValue();
    }

    public final void LIZJ() {
        C786410Ut5.LJLLLLLL(8, this.LIZ);
        C786410Ut5.LJLLLLLL(8, (View) this.LIZLLL.getValue());
        C786410Ut5.LLFF(8, LIZ());
        C786410Ut5.u5(LIZ(), 1.0f);
        this.LIZIZ = "";
    }

    public final void LIZLLL(C379170Etn c379170Etn, boolean z) {
        EnumC1338240kve enumC1338240kve;
        C1331670kl3 c1331670kl3LJII;
        C1331670kl3 c1331670kl3LJII2;
        C786410Ut5.LJLLLLLL(0, this.LIZ);
        C369780Eee.LIZ.getClass();
        boolean zLIZIZ = C369780Eee.LIZIZ();
        if (zLIZIZ) {
            if (z) {
                C786410Ut5.LLFF(0, LIZ());
                C786410Ut5.u5(LIZ(), 0.2f);
            } else {
                C786410Ut5.LLFF(8, LIZ());
                C786410Ut5.u5(LIZ(), 1.0f);
            }
        }
        String strLIZIZ = c379170Etn.LIZIZ();
        if (!Intrinsics.LJFF(this.LIZIZ, strLIZIZ)) {
            this.LIZIZ = strLIZIZ;
            if (zLIZIZ && z) {
                enumC1338240kve = EnumC1338240kve.FIT_CENTER;
            } else {
                enumC1338240kve = EnumC1338240kve.CENTER_CROP;
            }
            ImageView imageView = (ImageView) this.LJFF.getValue();
            if (C2471909mP.LJJIIZI(strLIZIZ)) {
                c1331670kl3LJII = C1331660kl2.LJIIIZ(strLIZIZ);
            } else {
                c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(strLIZIZ));
            }
            c1331670kl3LJII.LJJ = enumC1338240kve;
            c1331670kl3LJII.LJJIJL(imageView.getContext());
            c1331670kl3LJII.LJJI(imageView);
            c1331670kl3LJII.LJIIJ(new C391440FWk(this, 2));
            if (zLIZIZ && z) {
                SmartImageView smartImageViewLIZ = LIZ();
                String str = this.LIZIZ;
                if (C2471909mP.LJJIIZI(str)) {
                    c1331670kl3LJII2 = C1331660kl2.LJIIIZ(str);
                } else {
                    c1331670kl3LJII2 = C1331660kl2.LJII(new C0VSJ(str));
                }
                c1331670kl3LJII2.LJJ = EnumC1338240kve.CENTER_CROP;
                c1331670kl3LJII2.LJJIFFI = new C1332060klg(20, 3, 0);
                c1331670kl3LJII2.LJJ(smartImageViewLIZ);
                C786410Ut5.h3(c1331670kl3LJII2);
            }
        }
    }

    public AbstractC383630F2j(View view, Function0 function0, Function0 function02) {
        this.LIZ = view;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1181));
        this.LJII = c01gwLIZIZ;
        C383680F2o.LIZIZ((View) c01gwLIZIZ.getValue());
        C786410Ut5.I7(new ACListenerS140S0100000_5(function0, 125), (View) c01gwLIZIZ.getValue());
        C786410Ut5.I7(new ACListenerS140S0100000_5(function02, 126), LIZIZ());
    }
}
