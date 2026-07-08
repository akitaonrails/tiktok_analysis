package X;

import Y.ALAdapterS16S0100000_20;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.api.anchor_data.FinishEncourageLOP;
import tikcast.api.anchor_data.FinishEncourageTask;

/* JADX INFO: renamed from: X.0kuK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337420kuK extends AbstractC1337430kuL implements InterfaceC1838190xw1 {
    public FinishEncourageLOP LJIJ;
    public TuxTextView LJIJI;
    public ImageView LJIJJ;
    public TuxTextView LJIJJLI;
    public C1295960jpS LJIL;
    public LinearLayout LJJ;
    public LinearLayout LJJI;
    public final ArrayList<C1838180xw0> LJJIFFI = new ArrayList<>();
    public int LJJII;

    @Override // X.InterfaceC1838190xw1
    public final void LIZ() {
    }

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final long LJFF() {
        FinishEncourageLOP finishEncourageLOP = this.LJIJ;
        return (finishEncourageLOP == null || !finishEncourageLOP.isLevelUp) ? 2250L : 1750L;
    }

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final void LJI() {
        try {
            C1295960jpS c1295960jpS = this.LJIL;
            if (c1295960jpS != null) {
                c1295960jpS.pauseAnimation();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            Iterator<C1838180xw0> it2 = this.LJJIFFI.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        super.LJI();
    }

    @Override // X.AbstractC1337430kuL
    public final void LJIILIIL() {
        C1295960jpS c1295960jpS = this.LJIL;
        if (c1295960jpS != null) {
            C1296260jpw.LIZ(c1295960jpS);
        }
        TuxTextView tuxTextView = this.LJIJI;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        TuxTextView tuxTextView2 = this.LJIJJLI;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
        }
    }

    @Override // X.AbstractC1337430kuL
    public final void LJIILJJIL() {
        View view = this.LIZ;
        if (view == null) {
            return;
        }
        AnimatorSet animatorSetLJIIJ = AbstractC1337430kuL.LJIIJ(view);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorSetLJIIJ);
        animatorSet.addListener(new ALAdapterS16S0100000_20(this, 8));
        this.LIZIZ = animatorSet;
        animatorSet.start();
    }

    @Override // X.InterfaceC20482815Cw
    public final AbstractC1337320kuA getContainerType() {
        return C1337350kuD.LIZJ;
    }

    @Override // X.InterfaceC1838190xw1
    public final void LIZLLL(int i) {
        this.LJJII++;
        int size = this.LJJIFFI.size();
        int i2 = this.LJJII;
        if (i2 >= 0 && i2 < size) {
            ((C1838180xw0) ListProtector.get(this.LJJIFFI, i2)).i0(this.LJJII);
        }
        if (i == C1697810uHb.LJIIJ(this.LJJIFFI)) {
            LJIIIZ();
        }
    }

    @Override // X.InterfaceC20482815Cw
    public final View LJIIIIZZ(Context context, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ghs, viewGroup, false);
        this.LJIJI = (TuxTextView) viewTd.findViewById(R.id.zwp);
        this.LJIJJ = (ImageView) viewTd.findViewById(R.id.lok);
        this.LJIJJLI = (TuxTextView) viewTd.findViewById(R.id.zwq);
        this.LJIL = (C1295960jpS) viewTd.findViewById(R.id.ns0);
        this.LJJ = (LinearLayout) viewTd.findViewById(R.id.try_res_0x7f0a6a69);
        this.LJJI = (LinearLayout) viewTd.findViewById(R.id.nf7);
        this.LIZ = viewTd;
        C786410Ut5.T4(viewTd, 0.0f);
        return viewTd;
    }

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final void LIZIZ(int i, int i2, Object obj) {
        FinishEncourageLOP finishEncourageLOP;
        List<FinishEncourageTask> list;
        Context context;
        int iLIZIZ;
        String str;
        super.LIZIZ(i, i2, obj);
        if ((obj instanceof FinishEncourageLOP) && (finishEncourageLOP = (FinishEncourageLOP) obj) != null) {
            this.LJIJ = finishEncourageLOP;
            boolean z = true;
            if (!finishEncourageLOP.isLevelUp) {
                z = false;
            }
            String str2 = "";
            if (z) {
                TuxTextView tuxTextView = this.LJIJI;
                String str3 = finishEncourageLOP.finishTitle;
                if (str3 != null) {
                    str2 = str3;
                }
                if (tuxTextView != null) {
                    tuxTextView.LJJJJI(this.LJI);
                }
                Typeface typefaceLJIIJJI = LJIIJJI();
                if (tuxTextView != null) {
                    tuxTextView.setTypeface(typefaceLJIIJJI);
                    tuxTextView.setText(str2);
                }
                C1295960jpS c1295960jpS = this.LJIL;
                if (c1295960jpS != null) {
                    C1143680frq.LJIILL(c1295960jpS, "tiktok_live_broadcast_demand_12", "ttlive_finish_encourage_lop_weak.zip", false, new C1339360kxS(this, 1));
                }
                C500260Jjc.LJIILIIL(this.LJJ);
                ImageView imageView = this.LJIJJ;
                if (imageView != null) {
                    C500260Jjc.LJIILIIL(imageView);
                }
                TuxTextView tuxTextView2 = this.LJIJI;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 8);
                    return;
                }
                return;
            }
            TuxTextView tuxTextView3 = this.LJIJI;
            if (tuxTextView3 != null) {
                C500260Jjc.LJIILIIL(tuxTextView3);
            }
            C1295960jpS c1295960jpS2 = this.LJIL;
            if (c1295960jpS2 != null) {
                C500260Jjc.LJIILIIL(c1295960jpS2);
            }
            ImageView imageView2 = this.LJIJJ;
            if (imageView2 != null) {
                C500260Jjc.LLFFF(imageView2);
            }
            C1143680frq.LIZLLL(this.LJIJJ, "tiktok_live_broadcast_demand_13", "ttlive_finish_encourage_lop_ongoing_weak.png");
            TuxTextView tuxTextView4 = this.LJIJJLI;
            if (tuxTextView4 != null) {
                FinishEncourageLOP finishEncourageLOP2 = this.LJIJ;
                if (finishEncourageLOP2 != null && (str = finishEncourageLOP2.progressTitle) != null) {
                    str2 = str;
                }
                tuxTextView4.setText(str2);
            }
            C500260Jjc.LLFFF(this.LJJ);
            FinishEncourageLOP finishEncourageLOP3 = this.LJIJ;
            if (finishEncourageLOP3 != null) {
                list = finishEncourageLOP3.taskList;
            } else {
                list = null;
            }
            LinearLayout linearLayout = this.LJJI;
            if (linearLayout != null) {
                C786410Ut5.LJJJJJL(linearLayout);
            }
            this.LJJIFFI.clear();
            if (list == null) {
                return;
            }
            int i3 = 0;
            for (FinishEncourageTask finishEncourageTask : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    FinishEncourageTask finishEncourageTask2 = finishEncourageTask;
                    View view = this.LIZ;
                    if (view != null && (context = view.getContext()) != null) {
                        C1838180xw0 c1838180xw0 = new C1838180xw0(context);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        if (i3 != 0) {
                            iLIZIZ = (int) C497740JfY.LIZIZ(4.0f);
                        } else {
                            iLIZIZ = 0;
                        }
                        layoutParams.topMargin = iLIZIZ;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1838180xw0);
                        c1838180xw0.setLayoutParams(layoutParams);
                        C1838180xw0.j0(c1838180xw0, finishEncourageTask2, this);
                        LinearLayout linearLayout2 = this.LJJI;
                        if (linearLayout2 != null) {
                            linearLayout2.addView(c1838180xw0);
                        }
                        this.LJJIFFI.add(c1838180xw0);
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
