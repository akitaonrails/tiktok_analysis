package X;

import Y.ACListenerS162S0100000_28;
import android.view.View;
import android.widget.TextView;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.common.LiveEventObserver;
import com.ss.android.ugc.aweme.friends.model.RelationDataSource;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0zll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908710zll extends AbstractC1908820zlw {
    public final C1908730zln LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public C1385220m9Q LLJJ;

    @Override // X.InterfaceC1908750zlp
    public final void LIZ() {
        NextLiveData<FollowStatus> nextLiveData;
        LiveEventObserver<FollowStatus> liveEventObserver = this.LLILZLL;
        if (liveEventObserver == null || (nextLiveData = liveEventObserver.LL) == null) {
            return;
        }
        nextLiveData.removeObserver(liveEventObserver);
    }

    @Override // X.AbstractC1908820zlw
    public final void LJIIIIZZ() {
        C1908730zln c1908730zln = this.LLJILJIL;
        View.OnClickListener aCListenerS162S0100000_28 = new ACListenerS162S0100000_28(this, 86);
        if (C1848410yCV.LIZ) {
            aCListenerS162S0100000_28 = new f(aCListenerS162S0100000_28);
        }
        a aVar = new a(aCListenerS162S0100000_28);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1908730zln);
        }
        c1908730zln.setOnClickListener(aVar);
    }

    @Override // X.AbstractC1908820zlw
    public final void LJIILJJIL() {
        this.LLILZLL = RelationDataSource.INSTANCE.get().subscribe(LJFF(), this);
        LJII().LLILLL.observe(LJFF(), this.LLIZLLLIL);
    }

    public C1908710zll(C1908730zln c1908730zln) {
        super(c1908730zln);
        this.LLJILJIL = c1908730zln;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 676));
        this.LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 677));
    }

    @Override // X.AbstractC1908820zlw, X.InterfaceC1908750zlp
    public final void LLLLZIL(C1908870zm1 c1908870zm1) {
        NextLiveData<FollowStatus> nextLiveData;
        if (!(c1908870zm1 instanceof C1385220m9Q)) {
            return;
        }
        LiveEventObserver<FollowStatus> liveEventObserver = this.LLILZLL;
        if (liveEventObserver != null && (nextLiveData = liveEventObserver.LL) != null) {
            nextLiveData.removeObserver(liveEventObserver);
        }
        this.LLJJ = (C1385220m9Q) c1908870zm1;
        super.LLLLZIL(c1908870zm1);
    }

    @Override // X.AbstractC1908820zlw
    public final boolean LJIIJ(int i, Function2<? super Boolean, ? super C0XIR, Unit> function2) {
        boolean zLJIIJ = super.LJIIJ(i, function2);
        if (C0OBG.LIZ(300L, this.LLJILJIL)) {
            return false;
        }
        return zLJIIJ;
    }

    @Override // X.AbstractC1908820zlw
    public final void LJIIL(int i, Integer num) {
        EnumC1357230lQH enumC1357230lQH;
        int iIntValue;
        Map<Boolean, Integer> map;
        Integer num2;
        Map<Boolean, Integer> map2;
        Integer num3;
        int iIntValue2;
        Map<Boolean, Integer> map3;
        Integer num4;
        Map<Boolean, Integer> map4;
        Integer num5;
        C0SY7 c0sy7 = C0SY7.UNFOLLOW;
        if (i == c0sy7.getValue()) {
            int value = c0sy7.getValue();
            if (num != null && num.intValue() == value) {
                i = C0SY7.UNFOLLOW_BUT_BE_FOLLOWED.getValue();
            }
        }
        C1385220m9Q c1385220m9Q = this.LLJJ;
        if (c1385220m9Q != null && (enumC1357230lQH = c1385220m9Q.LIZLLL) != null) {
            int i2 = C1357240lQI.LIZ[enumC1357230lQH.ordinal()];
            boolean z = false;
            int iIntValue3 = 72;
            if (i2 != 1) {
                if (i2 == 2) {
                    C1385220m9Q c1385220m9Q2 = this.LLJJ;
                    if (c1385220m9Q2 != null && (map4 = c1385220m9Q2.LJFF) != null && (num5 = map4.get(Boolean.TRUE)) != null) {
                        iIntValue2 = num5.intValue();
                    } else {
                        iIntValue2 = 72;
                    }
                    C1385220m9Q c1385220m9Q3 = this.LLJJ;
                    if (c1385220m9Q3 != null && (map3 = c1385220m9Q3.LJFF) != null && (num4 = map3.get(Boolean.FALSE)) != null) {
                        iIntValue3 = num4.intValue();
                    }
                    if (C0SY5.LIZ.contains(Integer.valueOf(i))) {
                        TuxTextView tuxTextView = (TuxTextView) this.LLJILJILJ.getValue();
                        tuxTextView.setText("+");
                        tuxTextView.setTextColorRes(R.attr.a1r);
                        tuxTextView.setTuxFont(iIntValue2);
                        TuxTextView tuxTextView2 = (TuxTextView) this.LLJILLL.getValue();
                        C426750GoL.LJIIIZ(tuxTextView2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), null, null, null, false, 30);
                        tuxTextView2.setTextColorRes(R.attr.a1r);
                        tuxTextView2.setTuxFont(iIntValue2);
                        this.LLJILJIL.setClickable(true);
                        return;
                    }
                    if (!C0SY5.LIZIZ.contains(Integer.valueOf(i))) {
                        return;
                    }
                    TuxTextView tuxTextView3 = (TuxTextView) this.LLJILJILJ.getValue();
                    tuxTextView3.setText("·");
                    tuxTextView3.setTextColorRes(R.attr.a1k);
                    tuxTextView3.setTuxFont(iIntValue3);
                    TuxTextView tuxTextView4 = (TuxTextView) this.LLJILLL.getValue();
                    C426750GoL.LJIIIZ(tuxTextView4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, null, false, 30);
                    tuxTextView4.setTextColorRes(R.attr.a1k);
                    tuxTextView4.setTuxFont(iIntValue3);
                    C1908730zln c1908730zln = this.LLJILJIL;
                    C1385220m9Q c1385220m9Q4 = this.LLJJ;
                    if (c1385220m9Q4 != null && c1385220m9Q4.LJ) {
                        z = true;
                    }
                    c1908730zln.setClickable(z);
                    return;
                }
                return;
            }
            C786410Ut5.LLLLZLL((TuxTextView) this.LLJILJILJ.getValue(), 8);
            C1385220m9Q c1385220m9Q5 = this.LLJJ;
            if (c1385220m9Q5 != null && (map2 = c1385220m9Q5.LJFF) != null && (num3 = map2.get(Boolean.TRUE)) != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = 72;
            }
            C1385220m9Q c1385220m9Q6 = this.LLJJ;
            if (c1385220m9Q6 != null && (map = c1385220m9Q6.LJFF) != null && (num2 = map.get(Boolean.FALSE)) != null) {
                iIntValue3 = num2.intValue();
            }
            if (C0SY5.LIZ.contains(Integer.valueOf(i))) {
                TuxTextView tuxTextView5 = (TuxTextView) this.LLJILLL.getValue();
                tuxTextView5.setTextColorRes(R.attr.a1r);
                tuxTextView5.setTuxFont(iIntValue);
            } else {
                if (!C0SY5.LIZIZ.contains(Integer.valueOf(i))) {
                    return;
                }
                TuxTextView tuxTextView6 = (TuxTextView) this.LLJILLL.getValue();
                C1385220m9Q c1385220m9Q7 = this.LLJJ;
                if (c1385220m9Q7 != null && c1385220m9Q7.LJI) {
                    tuxTextView6.setTextColorRes(R.attr.zi);
                } else {
                    tuxTextView6.setTextColorRes(R.attr.a1k);
                }
                tuxTextView6.setTuxFont(iIntValue3);
            }
        }
    }

    @Override // X.AbstractC1908820zlw
    public final void LJIILIIL(int i, Integer num, String str) {
        String str2 = str;
        if (!Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), str2) && i != C0SY7.SAME_USER.getValue()) {
            if (this.LLJ) {
                C786410Ut5.u0(this.LLJILJIL, 0);
                this.LLJ = false;
            }
            TextView textView = (TextView) this.LLJILLL.getValue();
            if (!this.LLJI) {
                str2 = null;
            }
            textView.setText(LJ(i, num, str2, null, false));
            return;
        }
        C786410Ut5.u0(this.LLJILJIL, 8);
        this.LLJ = true;
    }
}
