package X;

import Y.ACListenerS164S0100000_30;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.AwS491S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.14TH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14TH implements C14TI {
    public View LIZ;
    public SmartImageView LIZIZ;
    public ImageView LIZJ;
    public View LIZLLL;

    @Override // X.C14TI
    public final void LIZIZ() {
    }

    @Override // X.C14TI
    public final int layoutRes() {
        return R.layout.b9k;
    }

    @Override // X.C14TI
    public final ImageView getIconView() {
        ImageView imageView = this.LIZJ;
        return imageView == null ? this.LIZIZ : imageView;
    }

    @Override // X.C14TI
    public final void LIZJ(AwS491S0200000_30 awS491S0200000_30) {
        awS491S0200000_30.invoke(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    @Override // X.C14TI
    public final void LIZ(View view, AwS574S0100000_30 awS574S0100000_30, AwS609S0100000_30 awS609S0100000_30) {
        View view2;
        this.LIZIZ = (SmartImageView) view.findViewById(R.id.xvc);
        if (((Boolean) C287280BNu.LIZ.getValue()).booleanValue()) {
            this.LIZJ = (ImageView) view.findViewById(R.id.xvd);
            SmartImageView smartImageView = this.LIZIZ;
            if (smartImageView != null) {
                C786410Ut5.LLFF(8, smartImageView);
            }
        }
        if (C04WD.LIZ()) {
            this.LIZLLL = view.findViewById(R.id.xvf);
        }
        View viewFindViewById = view.findViewById(R.id.xvg);
        this.LIZ = viewFindViewById;
        if (viewFindViewById != null) {
            C14TJ.LIZ.getClass();
            ITakoService iTakoService = C14TJ.LIZIZ;
            if (iTakoService != null) {
                iTakoService.LJLJLLL(new C14F8(viewFindViewById, this));
            }
        }
        View view3 = this.LIZ;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS164S0100000_30(awS609S0100000_30, 50), view3);
        }
        if (((Boolean) C07G7.LIZ.getValue()).booleanValue()) {
            View view4 = this.LIZ;
            if (view4 != null) {
                C786410Ut5.T4(view4, 0.0f);
            }
            View view5 = this.LIZ;
            if (view5 != null) {
                C786410Ut5.I7(null, view5);
            }
            View view6 = this.LIZ;
            if (view6 != null) {
                view6.setClickable(false);
            }
        }
        Set setLJLIIL = C13LQ.LJLIIL(new String[]{"local_test", "daily_monkey_test", "monkey"});
        C844470XAv.LIZ.getClass();
        if (setLJLIIL.contains(C844470XAv.LJIILL) && (view2 = this.LIZ) != null) {
            view2.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.14TE
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view7) {
                    C14TF.LIZIZ.LJI().LIZ(false);
                    C1389890mGx c1389890mGx = new C1389890mGx(view7);
                    c1389890mGx.LJIIJ("Keva Store Cleared");
                    c1389890mGx.LJIIJJI();
                    return true;
                }
            });
        }
        C2271391DvN.LIZ(this.LIZ, (C1A5L) C2271381DvM.LJJLIIIJL.getValue());
        awS574S0100000_30.invoke();
    }
}
