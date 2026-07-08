package X;

import Y.AObjectS360S0100000_17;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0eUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090950eUn implements InterfaceC1091020eUu {
    public final View LIZ;
    public final C1091250eVH LIZIZ;
    public final InterfaceC1090750eUT LIZJ;
    public final Function1<BarrageMessage, InterfaceC1102120emo> LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 428));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS561S0100000_17(this, 432));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 431));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS561S0100000_17(this, 427));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 433));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 429));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 434));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 430));
    public FrameLayout LJIIL;

    public final C16F5 LIZIZ() {
        return (C16F5) this.LJII.getValue();
    }

    public final LinearLayout LIZJ() {
        return (LinearLayout) this.LJIIIZ.getValue();
    }

    public final void LIZLLL(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.LJ.getValue();
        if (constraintLayout != null) {
            C786410Ut5.LL(0, constraintLayout);
        }
        FrameLayout frameLayout = this.LJIIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.eqx));
        C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.i5j));
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03ae A[Catch: Exception -> 0x03da, TryCatch #0 {Exception -> 0x03da, blocks: (B:200:0x0325, B:201:0x032a, B:204:0x0332, B:206:0x0342, B:209:0x0349, B:210:0x034f, B:212:0x035b, B:213:0x0365, B:214:0x0369, B:216:0x036f, B:217:0x0389, B:219:0x038d, B:221:0x03a0, B:225:0x03b3, B:222:0x03ae), top: B:264:0x0325 }] */
    @Override // X.InterfaceC1091020eUu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1090910eUj r26, X.C1090940eUm r27) {
        /*
            Method dump skipped, instruction units count: 1162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1090950eUn.LIZ(X.0eUj, X.0eUm):void");
    }

    public C1090950eUn(View view, C1091250eVH c1091250eVH, InterfaceC1090750eUT interfaceC1090750eUT, AObjectS360S0100000_17 aObjectS360S0100000_17) {
        this.LIZ = view;
        this.LIZIZ = c1091250eVH;
        this.LIZJ = interfaceC1090750eUT;
        this.LIZLLL = aObjectS360S0100000_17;
    }
}
