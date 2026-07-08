package X;

import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0dM1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1047070dM1 implements InterfaceC1106350etd, InterfaceC1047120dM6 {
    public static int LJIILIIL;
    public static boolean LJIILJJIL;
    public static C1040210dAx LJIILLIIL;
    public static NonAdWebModel LJIJ;
    public final Context LIZ;
    public final SparkContext LIZIZ;
    public final AnchorCommonStruct LIZJ;
    public final Aweme LIZLLL;
    public final NonAdWebModel LJ;
    public final String LJFF;
    public TuxNavBar LJI;
    public C0OM1 LJII;
    public long LJIIIIZZ;
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(560));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1033));
    public static int LJIIJJI = 1;
    public static long LJIIL = System.currentTimeMillis();
    public static String LJIILL = "";
    public static long LJIIZILJ = System.currentTimeMillis();
    public static ArrayList<Integer> LJIJI = new ArrayList<>();
    public static long LJIJJ = System.currentTimeMillis();

    @Override // X.InterfaceC1047120dM6
    public final void destroy() {
        if (!LJIILJJIL) {
            C1040580dBY c1040580dBY = new C1040580dBY(LJIJ);
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJI, AFwS252S0000000_16.get$arr$(739));
        }
        C1040580dBY c1040580dBY2 = new C1040580dBY(LJIJ);
        C1040750dBp.LIZ.getClass();
        c1040580dBY2.log(C1040750dBp.LJIIIIZZ, AFwS252S0000000_16.get$arr$(740));
        new C1050610dRj().LJJIII("ttelite_ba_video_product_anchor_9_stay", this.LIZLLL, this.LIZJ, this.LJFF, Long.valueOf(System.currentTimeMillis() - this.LJIIIIZZ), "");
    }

    @Override // X.InterfaceC1106350etd
    public final View LIZ() {
        this.LJIIIIZZ = System.currentTimeMillis();
        LJIIZILJ = System.currentTimeMillis();
        LJIIJJI = 1;
        LJIIL = System.currentTimeMillis();
        LJIILIIL = 0;
        LJIILJJIL = false;
        LJIILL = "";
        LJIILLIIL = null;
        LJIIZILJ = System.currentTimeMillis();
        LJIJ = this.LJ;
        LJIJI = new ArrayList<>();
        View viewSd = C786410Ut5.Sd(R.layout.p7, C786410Ut5.ne(this.LIZ), null);
        C786410Ut5.W5(viewSd, new ViewGroup.LayoutParams(-1, ((Number) this.LJIIIZ.getValue()).intValue()));
        C631450Opj.LIZ(viewSd, null, Float.valueOf(C418440Gaw.LIZIZ(10)), Float.valueOf(C418440Gaw.LIZIZ(10)), null, null, 25);
        SparkContext sparkContext = this.LIZIZ;
        C1077510e97 c1077510e97 = new C1077510e97(1);
        sparkContext.getClass();
        sparkContext.LJJ(AbstractC1539010q9T.class, c1077510e97);
        sparkContext.LJJJJZI(new C1077550e9B(this, 6));
        sparkContext.LJJ(InterfaceC1047120dM6.class, this);
        this.LJI = (TuxNavBar) viewSd.findViewById(R.id.bmt);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZIZ = "back_btn";
        c1251150ifB.LJI = true;
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_x_mark;
        c1251150ifB2.LIZIZ = "close_all_btn";
        c1251150ifB2.LJI = false;
        c0om1.LJ(c1251150ifB, c1251150ifB2);
        C1251150ifB c1251150ifB3 = new C1251150ifB();
        c1251150ifB3.LIZLLL();
        c1251150ifB3.LIZJ = R.raw.icon_ellipsis_horizontal;
        c1251150ifB3.LIZIZ = "more";
        c1251150ifB3.LJI = true;
        c0om1.LIZIZ(c1251150ifB3);
        this.LJII = c0om1;
        TuxNavBar tuxNavBar = this.LJI;
        if (tuxNavBar != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, tuxNavBar.getContext());
            if (numLIZJ != null) {
                tuxNavBar.setNavBackground(numLIZJ.intValue());
            }
            C0OM1 c0om12 = this.LJII;
            if (c0om12 != null) {
                tuxNavBar.setNavActions(c0om12);
            }
            View viewLJII = tuxNavBar.LJII("back_btn");
            if (viewLJII != null) {
                C786410Ut5.I7(new ACListenerS151S0100000_16(this, 178), viewLJII);
            }
            View viewLJII2 = tuxNavBar.LJII("close_all_btn");
            if (viewLJII2 != null) {
                C786410Ut5.I7(new ACListenerS151S0100000_16(this, 179), viewLJII2);
            }
            View viewLJII3 = tuxNavBar.LJII("more");
            if (viewLJII3 != null) {
                C786410Ut5.I7(new ACListenerS151S0100000_16(this, 180), viewLJII3);
            }
        }
        return viewSd;
    }

    public final void LIZIZ(int i) {
        new C1050610dRj().LJJIII("ttelite_ba_video_product_anchor_action_sheet_click", this.LIZLLL, this.LIZJ, this.LJFF, Integer.valueOf(i), "");
    }

    @Override // X.InterfaceC1047120dM6
    public final void LJLILLLLZI(String str) {
        TuxNavBar tuxNavBar = this.LJI;
        if (tuxNavBar != null) {
            C1250250idj c1250250idj = new C1250250idj();
            if (str == null) {
                str = "";
            }
            c1250250idj.LIZJ = str;
            tuxNavBar.LJIJJ(c1250250idj);
        }
    }

    public C1047070dM1(Context context, SparkContext sparkContext, AnchorCommonStruct anchorCommonStruct, Aweme aweme, NonAdWebModel nonAdWebModel, String str) {
        this.LIZ = context;
        this.LIZIZ = sparkContext;
        this.LIZJ = anchorCommonStruct;
        this.LIZLLL = aweme;
        this.LJ = nonAdWebModel;
        this.LJFF = str;
    }
}
