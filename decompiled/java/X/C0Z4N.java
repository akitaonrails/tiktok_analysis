package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import avg.f;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AwS558S0100000_14;
import mf.a;

/* JADX INFO: renamed from: X.0Z4N, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public abstract class C0Z4N extends RecyclerView.ViewHolder {
    public final InterfaceC893300Z2q LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    public abstract void I5(C860410Xp9 c860410Xp9, String str, C869590Y9l c869590Y9l);

    public final TuxTextView N5() {
        return (TuxTextView) this.LLILZIL.getValue();
    }

    public final SmartImageView P5() {
        return (SmartImageView) this.LLIZ.getValue();
    }

    public final TuxIconView R5() {
        return (TuxIconView) this.LLIZLLLIL.getValue();
    }

    public final TuxTextView S5() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    public final void L5(View.OnClickListener onClickListener) {
        C786410Ut5.R7((LinearLayout) this.LLILZLL.getValue(), onClickListener);
        C786410Ut5.h9(S5(), onClickListener);
        C786410Ut5.Q8(P5(), onClickListener);
        C786410Ut5.I7(onClickListener, this.itemView);
        View view = (View) this.LLILLJJLI.getValue();
        if (C1848410yCV.LIZ) {
            onClickListener = new f(onClickListener);
        }
        a aVar = new a(onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(view);
        }
        view.setOnClickListener(aVar);
    }

    public final void T5(C860410Xp9 c860410Xp9) {
        InterfaceC879330YeZ interfaceC879330YeZ = c860410Xp9.LL;
        if (interfaceC879330YeZ instanceof C455420HtU) {
            C786410Ut5.LJLLLLLL(0, P5());
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(C904290Zdj.LIZ(C904090ZdP.LIZ(((C455420HtU) c860410Xp9.LL).LIZJ))));
            c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIIZZ.LJJ(P5());
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            C786410Ut5.LJLLLLLL(8, S5());
            return;
        }
        if (interfaceC879330YeZ instanceof C459160HzW) {
            S5().setText(((C459160HzW) c860410Xp9.LL).LIZ);
            C786410Ut5.LJLLLLLL(0, S5());
            C786410Ut5.LJLLLLLL(8, P5());
        } else if (interfaceC879330YeZ instanceof C879290YeV) {
        } else {
            throw new C1954807lC();
        }
    }

    public C0Z4N(View view, C892120YzC c892120YzC) {
        super(view);
        this.LL = c892120YzC;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1512));
        this.LLILLL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1513));
        this.LLILZ = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1515));
        this.LLILZIL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1508));
        this.LLILZLL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1514));
        this.LLIZ = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1509));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1510));
        this.LLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1511));
    }
}
