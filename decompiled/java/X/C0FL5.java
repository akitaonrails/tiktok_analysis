package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import irm.AkS77S0100000_5;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FL5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FL5 extends AbstractC388250FKd {
    public final ViewGroup LIZIZ;
    public final C388200FJy LIZJ;
    public final Context LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LIZIZ() {
        this.LIZJ.LJIIJ.LIZLLL(AFwS234S0000000_5.get$arr$(534), true);
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() {
        this.LIZJ.LJIIJ.LIZLLL(new AwS584S0100000_5(this, 1127), true);
    }

    @Override // X.AbstractC388250FKd
    public final void LJIIIIZZ(int i) {
        this.LIZIZ.setBackgroundColor(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FL5(ViewGroup viewGroup, C388200FJy c388200FJy) {
        int iIntValue;
        super(c388200FJy);
        Context context = viewGroup.getContext();
        this.LIZIZ = viewGroup;
        this.LIZJ = c388200FJy;
        this.LIZLLL = context;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1582));
        this.LJ = c01gwLIZIZ;
        this.LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1595));
        this.LJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1588));
        this.LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1596));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1a, (Context) c01gwLIZIZ.getValue());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        LJIIIIZZ(iIntValue);
        LJIIIZ(new C388380FKq(c388200FJy), new AwS549S0100000_5(this, 1583));
        LJIIIZ(new C0FLP(c388200FJy), new AwS549S0100000_5(this, 1584));
        LJIIIZ(new C0FL6(c388200FJy), new AwS549S0100000_5(this, 1585));
        LJIIIZ(new C0FLL(c388200FJy), new AwS549S0100000_5(this, 1587));
        c388200FJy.LJIIJ.LIZ(new C2217381BqS() { // from class: X.0FJr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387990FJd) obj).LIZLLL;
            }
        }).LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1126));
    }

    public static void LJIIJ(int i, View view) {
        if (view instanceof ViewGroup) {
            Iterator<View> it2 = new C0FL8((ViewGroup) view).iterator();
            while (true) {
                C0FX4 c0fx4 = (C0FX4) it2;
                if (!c0fx4.hasNext()) {
                    break;
                } else {
                    LJIIJ(i, (View) c0fx4.next());
                }
            }
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public final <T extends C0FLA & InterfaceC388800FMg> void LJIIIZ(T t, Function0<Boolean> function0) {
        if (function0.invoke().booleanValue()) {
            C0FLM c0flm = new C0FLM((Context) this.LJ.getValue());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0flm);
            c0flm.setLayoutParams(layoutParams);
            c0flm.setIcon(t.LIZ());
            c0flm.setText(t.LIZJ());
            C786410Ut5.I7(new AkS77S0100000_5(t, 7), c0flm);
            t.LIZLLL(c0flm);
            if (this.LIZIZ.getChildCount() > 0) {
                View view = new View(this.LIZLLL);
                C786410Ut5.W5(view, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, (Context) this.LJ.getValue());
                if (numLIZJ != null) {
                    view.setBackgroundColor(numLIZJ.intValue());
                }
                t.LJ(view);
                this.LIZIZ.addView(view);
            }
            this.LIZIZ.addView(c0flm);
            this.LIZJ.LIZLLL((C0FKZ) t);
        }
    }
}
