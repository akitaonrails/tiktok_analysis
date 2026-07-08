package X;

import Y.ACListenerS164S0100000_30;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS491S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.14TG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14TG implements C14TI {
    public View LIZ;
    public View LIZIZ;
    public View LIZJ;
    public SmartImageView LIZLLL;
    public ImageView LJ;
    public View LJFF;
    public SmartImageView LJI;
    public TuxTextView LJII;
    public C21415018rM LJIIIIZZ;
    public final int[] LJIIIZ = new int[2];
    public Function1<? super View, Unit> LJIIJ;

    @Override // X.C14TI
    public final void LIZIZ() {
    }

    @Override // X.C14TI
    public final int layoutRes() {
        return R.layout.b9l;
    }

    @Override // X.C14TI
    public final ImageView getIconView() {
        ImageView imageView = this.LJ;
        return imageView == null ? this.LIZLLL : imageView;
    }

    public C14TG() {
        C418440Gaw.LIZIZ(16);
        C418440Gaw.LIZIZ(16);
        C418440Gaw.LIZIZ(24);
    }

    @Override // X.C14TI
    public final void LIZJ(AwS491S0200000_30 awS491S0200000_30) {
        awS491S0200000_30.invoke(this.LIZLLL, this.LJ, this.LJFF);
        SmartImageView smartImageView = this.LJI;
        if (smartImageView != null) {
            C786410Ut5.u5(smartImageView, 0.0f);
        }
        C339190DRl.LIZIZ(this.LJII);
        C339190DRl.LIZIZ(this.LJIIIIZZ);
        int[] iArr = this.LJIIIZ;
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // X.C14TI
    public final void LIZ(View view, AwS574S0100000_30 awS574S0100000_30, AwS609S0100000_30 awS609S0100000_30) {
        View view2;
        this.LIZ = view;
        C426750GoL.LIZLLL(view.getContext());
        this.LJIIJ = awS609S0100000_30;
        this.LIZIZ = view.findViewById(R.id.xvk);
        this.LIZLLL = (SmartImageView) view.findViewById(R.id.xvc);
        if (((Boolean) C287280BNu.LIZ.getValue()).booleanValue()) {
            this.LJ = (ImageView) view.findViewById(R.id.xvd);
            SmartImageView smartImageView = this.LIZLLL;
            if (smartImageView != null) {
                C786410Ut5.LLFF(8, smartImageView);
            }
        }
        if (C04WD.LIZ()) {
            this.LJFF = view.findViewById(R.id.xvf);
        }
        this.LJI = (SmartImageView) view.findViewById(R.id.xvn);
        this.LJII = (TuxTextView) view.findViewById(R.id.xvj);
        this.LJIIIIZZ = (C21415018rM) view.findViewById(R.id.xvo);
        this.LIZJ = view.findViewById(R.id.xvm);
        C14TJ.LIZ.getClass();
        ITakoService iTakoService = C14TJ.LIZIZ;
        if (iTakoService != null) {
            iTakoService.LJLIL(new C14F9(view, this));
        }
        View view3 = this.LIZJ;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS164S0100000_30(awS609S0100000_30, 49), view3);
        }
        if (((Boolean) C07G7.LIZ.getValue()).booleanValue()) {
            View view4 = this.LIZJ;
            if (view4 != null) {
                C786410Ut5.T4(view4, 0.0f);
            }
            View view5 = this.LIZJ;
            if (view5 != null) {
                C786410Ut5.I7(null, view5);
            }
            View view6 = this.LIZJ;
            if (view6 != null) {
                view6.setClickable(false);
            }
        }
        Set setLJLIIL = C13LQ.LJLIIL(new String[]{"local_test", "daily_monkey_test", "monkey"});
        C844470XAv.LIZ.getClass();
        if (setLJLIIL.contains(C844470XAv.LJIILL) && (view2 = this.LIZJ) != null) {
            view2.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.14TD
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
        C2271391DvN.LIZ(this.LIZJ, (C1A5L) C2271381DvM.LJJLIIIJL.getValue());
        awS574S0100000_30.invoke();
    }
}
