package X;

import Y.ALAdapterS24S0100000_29;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.anim.MoreActionFlipController$handler$1;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.10uP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19395510uP {
    public static int LJIILJJIL;
    public static String LJIILL = "";
    public final View LIZ;
    public final View LIZIZ;
    public final List<View> LIZJ = new ArrayList();
    public final List<View> LIZLLL = new ArrayList();
    public final List<View> LJ = new ArrayList();
    public long LJFF = 10000;
    public boolean LJI;
    public Function0<Unit> LJII;
    public GetMoreActionResp LJIIIIZZ;
    public Context LJIIIZ;
    public AnimatorSet LJIIJ;
    public AnimatorSet LJIIJJI;
    public final MoreActionFlipController$handler$1 LJIIL;
    public final C01GW LJIILIIL;

    public final View LIZIZ() {
        RadiusLayout radiusLayout;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LJIIIZ), R.layout.bwh, (ViewGroup) this.LIZIZ.findViewById(R.id.glp), false);
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C0H9H.LIZIZ(36);
            layoutParams.height = C0H9H.LIZIZ(36);
            C786410Ut5.W5(viewTd, layoutParams);
        }
        if ((viewTd instanceof RadiusLayout) && (radiusLayout = (RadiusLayout) viewTd) != null) {
            radiusLayout.setRadius(C418440Gaw.LIZIZ(4));
        }
        return viewTd;
    }

    public final void LJFF() {
        if (this.LJI) {
            removeCallbacksAndMessages(null);
            AnimatorSet animatorSet = this.LJIIJ;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.LJIIJ = null;
            AnimatorSet animatorSet2 = this.LJIIJJI;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.LJIIJJI = null;
            Function0<Unit> function0 = this.LJII;
            if (function0 != null) {
                function0.invoke();
            }
            LIZ(0L);
        }
    }

    public final void LIZ(long j) {
        if (!this.LJI) {
            return;
        }
        this.LJI = false;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) this.LIZJ).iterator();
        while (it2.hasNext()) {
            arrayList.add(C621740Oa4.LIZ(0.0f, 1.0f, (View) it2.next()));
        }
        for (View view : (ArrayList) this.LIZLLL) {
            Animator animatorLIZ = C621740Oa4.LIZ(1.0f, 0.0f, view);
            animatorLIZ.addListener(new ALAdapterS24S0100000_29(view, 11));
            arrayList.add(animatorLIZ);
        }
        for (View view2 : (ArrayList) this.LJ) {
            Animator animatorLIZ2 = C621740Oa4.LIZ(1.0f, 0.0f, view2);
            animatorLIZ2.addListener(new ALAdapterS24S0100000_29(view2, 12));
            arrayList.add(animatorLIZ2);
            arrayList.add(C621740Oa4.LIZIZ(0.0f, C418440Gaw.LIZIZ(-36), view2));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(C1619980sG4.LJIILIIL());
        animatorSet.setDuration(j);
        animatorSet.addListener(new ALAdapterS24S0100000_29(this, 13));
        animatorSet.start();
        this.LJIIJJI = animatorSet;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.anim.MoreActionFlipController$handler$1] */
    public C19395510uP(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.LIZ = constraintLayout;
        this.LIZIZ = constraintLayout2;
        final Looper mainLooper = Looper.getMainLooper();
        this.LJIIL = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.anim.MoreActionFlipController$handler$1
        };
        this.LJIILIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 821));
    }

    public final void LIZJ(View view, TuxTextView tuxTextView) {
        int iAbs;
        int i = 1;
        if (LJIILJJIL != 1) {
            return;
        }
        if (C444960Hcc.LIZIZ()) {
            iAbs = Math.abs(view.getLeft() - tuxTextView.getRight());
        } else {
            iAbs = Math.abs(view.getRight() - tuxTextView.getLeft());
        }
        int iLIZIZ = iAbs - C0H9H.LIZIZ(8);
        int iLIZIZ2 = C0H9H.LIZIZ(36);
        int iLIZIZ3 = iLIZIZ2;
        while (iLIZIZ3 <= iLIZIZ) {
            iLIZIZ3 += C0H9H.LIZIZ(4) + iLIZIZ2;
            i++;
        }
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > 3) {
            i2 = 3;
        }
        GetMoreActionResp getMoreActionResp = this.LJIIIIZZ;
        if (getMoreActionResp != null) {
            LJ(getMoreActionResp, i2);
        }
    }

    public final void LJ(GetMoreActionResp getMoreActionResp, int i) {
        int size;
        int iIntValue;
        List<Product> listSubList;
        boolean z;
        if (LJIILJJIL != 1) {
            return;
        }
        try {
            LinearLayout linearLayout = (LinearLayout) this.LIZIZ.findViewById(R.id.glp);
            C786410Ut5.LJJJJJL(linearLayout);
            int i2 = i - 1;
            List<Product> list = getMoreActionResp.product;
            if (list != null) {
                size = list.size();
            } else {
                size = 1;
            }
            if (i2 > size) {
                i2 = size;
            }
            if (i2 < 1) {
                i2 = 1;
            }
            List<Product> list2 = getMoreActionResp.product;
            if (list2 != null && (listSubList = list2.subList(0, i2)) != null) {
                int i3 = 0;
                for (Product product : listSubList) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        Product product2 = product;
                        View viewLIZIZ = LIZIZ();
                        if (i3 > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        LIZLLL(viewLIZIZ, "", false, z);
                        linearLayout.addView(viewLIZIZ);
                        SmartImageView smartImageView = (SmartImageView) viewLIZIZ.findViewById(R.id.gmy);
                        int iLIZ = C1210230hbB.LIZ(36, viewLIZIZ.getContext());
                        String strLJI = C1743690vTb.LJI(product2.LIZIZ(), iLIZ, iLIZ, EnumC1769850w9n.LIVE_POP_CARD);
                        C1326790kdB.LIZ.getClass();
                        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(strLJI);
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bq);
                        c1331670kl3LIZLLL.LJJIIZI(c384050F3z.LIZ(smartImageView.getContext()));
                        c1331670kl3LIZLLL.LJJ(smartImageView);
                        C786410Ut5.h3(c1331670kl3LIZLLL);
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            Integer num = getMoreActionResp.productNum;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            int i5 = iIntValue - i2;
            if (i5 >= 0 && i5 > 0 && i - i2 > 0) {
                View viewLIZIZ2 = LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('+');
                sbLIZ.append(i5);
                LIZLLL(viewLIZIZ2, C2188811AlT.LIZIZ(sbLIZ), true, true);
                linearLayout.addView(viewLIZIZ2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZLLL(View view, String str, boolean z, boolean z2) {
        Drawable drawable = null;
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.gn2);
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(72);
                tuxTextView.setMinTextSize(12.0f);
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                tuxTextView.setText(str);
                C0H9H.LJFF(C0H9H.LIZIZ(2), tuxTextView);
                C0H9H.LIZLLL(C0H9H.LIZIZ(2), tuxTextView);
            }
            View viewFindViewById = view.findViewById(R.id.gn0);
            if (viewFindViewById != null) {
                Drawable drawable2 = (Drawable) this.LJIILIIL.getValue();
                if (drawable2 != null) {
                    drawable2.setAlpha(20);
                    drawable = drawable2;
                }
                viewFindViewById.setBackground(drawable);
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.gmy));
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.gn1));
        } else {
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.gn2));
            C786410Ut5.LJLLLLLL(0, view.findViewById(R.id.gmy));
            View viewFindViewById2 = view.findViewById(R.id.gn0);
            if (viewFindViewById2 != null) {
                Drawable drawable3 = (Drawable) this.LJIILIIL.getValue();
                if (drawable3 != null) {
                    drawable3.setAlpha(10);
                    drawable = drawable3;
                }
                viewFindViewById2.setBackground(drawable);
                C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            }
            C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.gn1), 8);
        }
        if (z2) {
            C0H9H.LJFF(C0H9H.LIZIZ(4), view);
        } else {
            C0H9H.LJFF(C0H9H.LIZIZ(0), view);
        }
    }
}
