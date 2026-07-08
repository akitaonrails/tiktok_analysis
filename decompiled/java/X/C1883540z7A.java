package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0z7A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883540z7A {
    public static final float LJIIJ = (int) C497740JfY.LIZIZ(28.0f);
    public static final float LJIIJJI = (int) C497740JfY.LIZIZ(40.0f);
    public final InterfaceC1883090z6R LIZ;
    public final C422240Gh4 LIZIZ;
    public int LJ;
    public float LJIIIIZZ;
    public boolean LJIIIZ;
    public float LIZJ = (int) C497740JfY.LIZIZ(76.0f);
    public final List<String> LIZLLL = new ArrayList();
    public final C01GW LJFF = C452501pT.LIZIZ(new C1883530z79(this));
    public final C01GW LJI = C452501pT.LIZIZ(new C1866660yfw(this));
    public final C01GW LJII = C452501pT.LIZIZ(new C1866670yfx(this));

    public static void LIZ(C1888650zFP c1888650zFP, int i) {
        Context context;
        View view;
        TextView textView;
        View view2;
        if (c1888650zFP != null && (view2 = c1888650zFP.LJ) != null) {
            context = view2.getContext();
        } else {
            context = null;
        }
        int iLIZLLL = C497740JfY.LIZLLL(i, context);
        if (c1888650zFP != null && (view = c1888650zFP.LJ) != null && (textView = (TextView) view.findViewById(R.id.wy8)) != null) {
            textView.setTextColor(iLIZLLL);
        }
    }

    public C1883540z7A(InterfaceC1883090z6R interfaceC1883090z6R, C422240Gh4 c422240Gh4, C21594519fD c21594519fD) {
        this.LIZ = interfaceC1883090z6R;
        this.LIZIZ = c422240Gh4;
        c422240Gh4.LIZIZ(new InterfaceC1883670z7N() { // from class: X.0z7L
            @Override // X.InterfaceC1883670z7N
            public final void LIZJ(C1888650zFP c1888650zFP) {
            }

            @Override // X.InterfaceC1883670z7N
            public final void LIZ(C1888650zFP c1888650zFP) {
                this.LIZ.getClass();
                C1883540z7A.LIZ(c1888650zFP, R.attr.ezt);
            }

            @Override // X.InterfaceC1883670z7N
            public final void LIZIZ(C1888650zFP c1888650zFP, boolean z, boolean z2) {
                int i;
                this.LIZ.getClass();
                C1883540z7A.LIZ(c1888650zFP, R.attr.ezq);
                C1883540z7A c1883540z7A = this.LIZ;
                if (c1888650zFP != null) {
                    i = c1888650zFP.LIZLLL;
                } else {
                    i = -1;
                }
                c1883540z7A.LJ = i;
            }
        });
        this.LIZIZ.setupWithViewPager(c21594519fD);
        c422240Gh4.setTouchInterceptor$livegame_impl_release(new C1883660z7M(this));
    }
}
