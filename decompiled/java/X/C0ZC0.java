package X;

import Y.ACListenerS149S0100000_14;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.widget.multi.ActivityIcon;
import com.ss.android.ugc.aweme.inbox.widget.multi.ActivityPod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZC0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZC0 extends AbstractC1903430zdF<ActivityPod> implements C0Z37<ActivityPod>, C0Z9B, InterfaceC1508640pMU {
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final int LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public AnimatorSet LLJJLIIIJLLLLLLLZ;
    public AnimatorSet LLJL;

    @Override // X.C0Z9B
    public final void C1(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
    }

    @Override // X.C0Z9B
    public final List<Animator> D5(boolean z) {
        return null;
    }

    @Override // X.C0Z9B
    public final void LJLL(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
    }

    @Override // X.C0Z9B
    public final void LLLLZI(float f) {
    }

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "ActivityVH";
    }

    @Override // X.C0Z9B
    public final C0HZQ b() {
        return null;
    }

    @Override // X.C0Z9B
    public final List<View> LLLLJI() {
        return (List) this.LLJJJJLIIL.getValue();
    }

    @Override // X.C0Z9B
    public final List<View> M() {
        return (List) this.LLJJL.getValue();
    }

    public final C422820Gi0 T5() {
        return (C422820Gi0) this.LLJILJILJ.getValue();
    }

    @Override // X.C0Z9B
    public final C0Z9D g3() {
        return (C0Z9D) this.LLJJJJJIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    @Override // X.AbstractC1903430zdF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void reportShowEvent() {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZC0.reportShowEvent():void");
    }

    @Override // X.AbstractC1903430zdF, X.C0Z32
    public final void onAttach() {
        super.onAttach();
        MultiViewModel multiViewModelN5 = N5();
        if (multiViewModelN5 == null || multiViewModelN5.LLJLLIL) {
            return;
        }
        ActivityPod activityPod = (ActivityPod) this.LLILLL;
        if ((activityPod != null ? activityPod.dataType : null) == EnumC895370ZAp.SHOP) {
            int layoutPosition = getLayoutPosition() - this.LLJJJ;
            ActivityPod activityPod2 = (ActivityPod) this.LLILLL;
            C2252408s6.LIZ(new C895330ZAl("show", layoutPosition, activityPod2.extra, activityPod2.createTime, activityPod2.readPoint, activityPod2.uniqueItemIdForFirstScreen()));
            MultiViewModel multiViewModelN52 = N5();
            if (multiViewModelN52 != null) {
                multiViewModelN52.LLJLLIL = true;
            }
        }
    }

    @Override // X.C0Z9B
    public final AnimatorSet l0() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C0Z9B
    public final AnimatorSet v3() {
        return this.LLJL;
    }

    @Override // X.C0Z9B, X.InterfaceC892580Yzw
    public final void LJLJI(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
        C0Z9A.LIZJ(this, interfaceC887660Ys0);
    }

    @Override // X.C0Z9B
    public final void LLIIII(AnimatorSet animatorSet) {
        this.LLJJLIIIJLLLLLLLZ = animatorSet;
    }

    @Override // X.C0Z9B
    public final void LLILII(AnimatorSet animatorSet) {
        this.LLJL = animatorSet;
    }

    @Override // X.AbstractC1903430zdF
    public final void P5(C1906880zio c1906880zio) {
        boolean z;
        if (c1906880zio.LIZ != -1) {
            z = true;
        } else {
            z = false;
        }
        C1906880zio c1906880zio2 = null;
        if (z) {
            TuxIconView tuxIconView = (TuxIconView) this.LLJI.getValue();
            ViewGroup.LayoutParams layoutParams = ((View) this.LLJI.getValue()).getLayoutParams();
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zio.LIZ)));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zio.LIZ)));
            C786410Ut5.M6(tuxIconView, layoutParams);
        }
        if (c1906880zio.LIZLLL != -1) {
            ((TuxTextView) this.LLJIJIL.getValue()).setTuxFont(c1906880zio.LIZLLL);
        }
        if (c1906880zio.LJ != -1) {
            ((TuxTextView) this.LLJIJIL.getValue()).LJJJJI(c1906880zio.LJ);
        }
        if (c1906880zio.LJFF != -1) {
            ((TuxTextView) this.LLJILLL.getValue()).setTuxFont(c1906880zio.LJFF);
        }
        if (c1906880zio.LJII != -1) {
            ((TextView) this.LLJILLL.getValue()).setTextColor(c1906880zio.LJII);
        }
        if (c1906880zio.LJIIIZ != -1 && (((View) this.LLJILJIL.getValue()).getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) this.LLJILJIL.getValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) this.LLJILJIL.getValue()).getLayoutParams();
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zio.LJIIIZ)));
            C786410Ut5.i6(linearLayoutCompat, marginLayoutParams);
        }
        if (c1906880zio.LJIIJJI != -1) {
            c1906880zio2 = c1906880zio;
        }
        if ((((View) this.LLJJIJI.getValue()).getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && c1906880zio2 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.LLJJIJI.getValue();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ((View) this.LLJJIJI.getValue()).getLayoutParams();
            marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zio2.LJIIJJI))));
            C786410Ut5.m6(constraintLayout, marginLayoutParams2);
        }
        if (c1906880zio.LJIIJ != -1) {
            ((TuxTextView) this.LLJJI.getValue()).setTuxFont(c1906880zio.LJIIJ);
        }
    }

    @Override // X.AbstractC1903430zdF
    public final void R5(AbstractC895380ZAq abstractC895380ZAq) {
        EnumC895310ZAj enumC895310ZAj;
        String strLIZLLL;
        ActivityPod activityPod = (ActivityPod) abstractC895380ZAq;
        String string = activityPod.newNoticeContent;
        if (string.length() == 0) {
            string = this.itemView.getContext().getString(2131836066);
        }
        String str = (String) C13LP.LJJJLL(activityPod.title);
        if (str != null) {
            ((TextView) this.LLJIJIL.getValue()).setText(str);
        }
        if (activityPod.LLILLJJLI != null) {
            ((TuxIconView) this.LLJI.getValue()).setImageDrawable(activityPod.LLILLJJLI);
        }
        ActivityIcon activityIcon = activityPod.smallAvatarUrl;
        if (activityIcon == null) {
            C786410Ut5.j(T5(), 8);
        } else if (activityIcon.urlModel != null) {
            C786410Ut5.j(T5(), 0);
            C1324840ka2.LJFF(T5(), activityIcon.urlModel);
            U5(false);
        } else if (activityIcon.resId != -1) {
            C786410Ut5.j(T5(), 0);
            T5().setImageURI(C1325880kbi.LIZIZ(activityIcon.resId));
            U5(true);
        } else if (C123100dR.LIZ(activityIcon.url)) {
            C786410Ut5.j(T5(), 0);
            C1324840ka2.LJIIJ(T5(), activityIcon.url, -1, -1);
            U5(true);
        } else {
            C786410Ut5.j(T5(), 8);
        }
        ((TextView) this.LLJILLL.getValue()).setText(string);
        String str2 = activityPod.newNoticeTime;
        if (str2 != null && str2.length() != 0) {
            C786410Ut5.LLLLZLL((TuxTextView) this.LLJJI.getValue(), 0);
            TextView textView = (TextView) this.LLJJI.getValue();
            C296870BkL.LIZ.getClass();
            if (C296870BkL.LIZ()) {
                strLIZLLL = C2215101Bmm.LIZJ(activityPod.createTime * 1000);
            } else {
                C1866820ygC.LIZ.getClass();
                if (C1866820ygC.LIZ()) {
                    long j = activityPod.createTime * 1000;
                    boolean zLIZIZ = C1866820ygC.LIZIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" · ");
                    sbLIZ.append(C2215101Bmm.LJI(j, zLIZIZ));
                    strLIZLLL = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZLLL = C1356610lPH.LIZLLL(activityPod.createTime * 1000, this.itemView.getContext());
                }
            }
            textView.setText(strLIZLLL);
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) this.LLJJI.getValue(), 8);
        }
        int i = C895340ZAm.LIZ[activityPod.readPoint.type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C786410Ut5.LLLLLLIL((C426770GoN) this.LLJJ.getValue(), 8);
                } else {
                    throw new C1954807lC();
                }
            } else {
                C426770GoN c426770GoN = (C426770GoN) this.LLJJ.getValue();
                c426770GoN.setVariant(0);
                C786410Ut5.LLLLLLIL(c426770GoN, 0);
            }
        } else {
            C426770GoN c426770GoN2 = (C426770GoN) this.LLJJ.getValue();
            c426770GoN2.setVariant(1);
            c426770GoN2.setCount(activityPod.readPoint.unreadCount);
            C786410Ut5.LLLLLLIL(c426770GoN2, 0);
        }
        if (C1902710zc5.LIZJ()) {
            C786410Ut5.LLLLLLIL((C426770GoN) this.LLJJ.getValue(), 8);
        }
        if (!C1902710zc5.LIZJ() && ((enumC895310ZAj = ((ActivityPod) this.LLILLL).readPoint.type) == EnumC895310ZAj.COUNT || enumC895310ZAj == EnumC895310ZAj.DOT)) {
            TuxTextView tuxTextView = (TuxTextView) this.LLJIJIL.getValue();
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(42);
            }
            TuxTextView tuxTextView2 = (TuxTextView) this.LLJILLL.getValue();
            if (tuxTextView2 != null) {
                tuxTextView2.setTuxFont(52);
                tuxTextView2.setTextColorRes(R.attr.a1h);
            }
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) this.LLJIJIL.getValue();
            if (tuxTextView3 != null) {
                tuxTextView3.setTuxFont(41);
            }
            TuxTextView tuxTextView4 = (TuxTextView) this.LLJILLL.getValue();
            if (tuxTextView4 != null) {
                tuxTextView4.setTuxFont(51);
                tuxTextView4.setTextColorRes(R.attr.a1k);
            }
        }
        if (activityPod.showArrow) {
            C786410Ut5.LLLLLLZZ((TuxIconView) this.LLJJIII.getValue(), 0);
        } else {
            C786410Ut5.LLLLLLZZ((TuxIconView) this.LLJJIII.getValue(), 8);
        }
    }

    public final void U5(boolean z) {
        Integer num;
        if (z) {
            C1331100kk8 c1331100kk8 = T5().getHierarchy().LIZJ;
            if (c1331100kk8 != null && (num = (Integer) this.LLJJIJIL.getValue()) != null) {
                c1331100kk8.LJ(C418440Gaw.LIZIZ(1), num.intValue());
                return;
            }
            return;
        }
        C1331100kk8 c1331100kk82 = T5().getHierarchy().LIZJ;
        if (c1331100kk82 == null) {
            return;
        }
        c1331100kk82.LJFF(0.0f);
    }

    public C0ZC0(int i, View view) {
        super(view);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1579));
        this.LLJ = c01gwLIZIZ;
        this.LLJI = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1574));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1582));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1568));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1575));
        this.LLJILLL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1569));
        this.LLJJ = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1576));
        this.LLJJI = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1581));
        this.LLJJIII = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1573));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1577));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1571));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1565));
        this.LLJJJ = i;
        this.LLJJJIL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1566));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1578));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1570));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1567));
        this.LLJJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1572));
        C786410Ut5.I7(new ACListenerS149S0100000_14(this, 80), (View) c01gwLIZIZ.getValue());
        C1906140zhc c1906140zhc = C1906140zhc.LIZ;
        View view2 = (View) c01gwLIZIZ.getValue();
        EnumC1906160zhe enumC1906160zhe = EnumC1906160zhe.CELL;
        c1906140zhc.getClass();
        C1906140zhc.LIZ(view2, enumC1906160zhe, 0.0f);
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        I5(i, interfaceC1891350zJl);
    }
}
