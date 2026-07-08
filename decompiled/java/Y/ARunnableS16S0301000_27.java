package Y;

import X.AbstractC1810950xE5;
import X.C0GY9;
import X.C1308910kAL;
import X.C1797100wrk;
import X.C1810980xE8;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1796910wrR;
import Y.AUListenerS275S0100000_27;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class ARunnableS16S0301000_27 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        RankListViewModel rankListViewModelLJIIIZ;
        RankListV2Response.RankView rankView;
        List<RankListV2Response.RankInfo> list;
        RankListFragment rankListFragment = (RankListFragment) this.l0;
        View view = rankListFragment.LLJJJIL;
        if (view != null) {
            RankListV2Response.RankInfo rankInfo = (RankListV2Response.RankInfo) this.l1;
            TextView textView = (TextView) this.l2;
            final int i = this.i3;
            if (rankListFragment.isAdded()) {
                SparseBooleanArray sparseBooleanArray = C1810980xE8.LIZ;
                SparseBooleanArray sparseBooleanArray2 = C1810980xE8.LIZ;
                if (!sparseBooleanArray2.get(rankListFragment.LLILLL.LIZIZ.type) || rankInfo.rank <= 0) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                RankListController rankListController = rankListFragment.LLILZIL;
                sbLIZ.append((rankListController == null || (rankListViewModelLJIIIZ = rankListController.LJIIIZ()) == null || (rankView = rankListViewModelLJIIIZ.LLILLJJLI) == null || (list = rankView.ranks) == null) ? 99 : list.size());
                sbLIZ.append('+');
                textView.setText(C2188811AlT.LIZIZ(sbLIZ));
                final View viewFindViewById = view.findViewById(R.id.sr1);
                final View viewFindViewById2 = view.findViewById(R.id.sr0);
                final TextView textView2 = (TextView) view.findViewById(R.id.sqz);
                final String str = rankInfo.rankStr;
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, textView.getContext());
                int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
                final int i2 = rankListFragment.LLILLL.LIZIZ.type;
                SparseBooleanArray sparseBooleanArray3 = C1810980xE8.LIZIZ;
                if (sparseBooleanArray3.get(i2)) {
                    return;
                }
                sparseBooleanArray2.put(i2, false);
                sparseBooleanArray3.put(i2, true);
                C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                C786410Ut5.ed(viewFindViewById2, (viewFindViewById.getHeight() + viewFindViewById2.getHeight()) / 2.0f);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((viewFindViewById.getHeight() + viewFindViewById2.getHeight()) / 2.0f, 0.0f);
                valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.7f, 0.01f, 1.0f, 1.01f));
                valueAnimatorOfFloat.setDuration(500L);
                valueAnimatorOfFloat.setStartDelay(500L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(viewFindViewById2, 167));
                valueAnimatorOfFloat.start();
                textView2.setTextColor(iIntValue);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
                valueAnimatorOfFloat2.setDuration(300L);
                valueAnimatorOfFloat2.setStartDelay(500L);
                valueAnimatorOfFloat2.addUpdateListener(new AUListenerS254S0100000_4(textView2, 21));
                valueAnimatorOfFloat2.addListener(new AbstractC1810950xE5() { // from class: X.0xE7
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        textView2.setText(str);
                        C786410Ut5.S4(1.0f, textView2);
                        textView2.setTextColor(i);
                        C786410Ut5.cd((viewFindViewById.getHeight() + textView2.getHeight()) / 2.0f, textView2);
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat((viewFindViewById.getHeight() + textView2.getHeight()) / 2.0f, 0.0f);
                        valueAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
                        valueAnimatorOfFloat3.setDuration(500L);
                        valueAnimatorOfFloat3.setStartDelay(1000L);
                        valueAnimatorOfFloat3.addUpdateListener(new AUListenerS275S0100000_27(textView2, 100));
                        final int i3 = i2;
                        valueAnimatorOfFloat3.addListener(new AbstractC1810950xE5() { // from class: X.0xE6
                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator2) {
                                SparseBooleanArray sparseBooleanArray4 = C1810980xE8.LIZ;
                                C1810980xE8.LIZIZ.put(i3, false);
                            }
                        });
                        valueAnimatorOfFloat3.start();
                    }
                });
                valueAnimatorOfFloat2.start();
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (viewFindViewById.getHeight() + viewFindViewById2.getHeight()) / (-2));
                valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.7f, 0.01f, 1.0f, 1.01f));
                valueAnimatorOfInt.setDuration(500L);
                valueAnimatorOfInt.setStartDelay(1400L);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(viewFindViewById2, 168));
                valueAnimatorOfInt.addListener(new AbstractC1810950xE5() { // from class: X.0xE4
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        C786410Ut5.LJLLLLLL(4, viewFindViewById2);
                    }
                });
                valueAnimatorOfInt.start();
            }
        }
    }

    public static final void run$0(ARunnableS16S0301000_27 aRunnableS16S0301000_27) {
        boolean zLIZ;
        C1C7U.LIZ("RankListFragment@6ae0.initCurrentBottomBar$1$1$1");
        try {
            aRunnableS16S0301000_27.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RankListFragment@6ae0.initCurrentBottomBar$1$1$1");
    }

    public static final void run$1(ARunnableS16S0301000_27 aRunnableS16S0301000_27) {
        boolean zLIZ;
        C1C7U.LIZ("PayManager@437b.chargePay$1$onPositive$1");
        try {
            C1797100wrk.LIZIZ.LJII((InterfaceC1796910wrR) aRunnableS16S0301000_27.l0, -1, aRunnableS16S0301000_27.i3, (Throwable) aRunnableS16S0301000_27.l1, ((Diamond) aRunnableS16S0301000_27.l2).iapId);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PayManager@437b.chargePay$1$onPositive$1");
    }

    public static final void run$2(ARunnableS16S0301000_27 aRunnableS16S0301000_27) {
        boolean zLIZ;
        C1C7U.LIZ("PayManager@437b.chargePayForNonLiveBusiness$createFailBlock$1$2");
        try {
            C1797100wrk.LIZIZ.LJII((InterfaceC1796910wrR) aRunnableS16S0301000_27.l0, -1, aRunnableS16S0301000_27.i3, (Throwable) aRunnableS16S0301000_27.l1, ((Diamond) aRunnableS16S0301000_27.l2).iapId);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PayManager@437b.chargePayForNonLiveBusiness$createFailBlock$1$2");
    }

    public ARunnableS16S0301000_27(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i3 = i;
    }
}
