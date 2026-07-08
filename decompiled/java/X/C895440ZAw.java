package X;

import Y.ACListenerS117S0200000_14;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.widget.multi.ArchiveEntranceViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895440ZAw extends AbstractC1903430zdF<C895240ZAc> implements C0Z9B, C0Z37<C895240ZAc> {
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
    public AnimatorSet LLJJJ;
    public AnimatorSet LLJJJIL;
    public ArchiveEntranceViewModel LLJJJJ;

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

    @Override // X.C0Z9B
    public final C0HZQ b() {
        return null;
    }

    @Override // X.C0Z9B
    public final List<View> LLLLJI() {
        return (List) this.LLJJIJIIJIL.getValue();
    }

    @Override // X.C0Z9B
    public final List<View> M() {
        return (List) this.LLJJIJIL.getValue();
    }

    @Override // X.C0Z9B
    public final C0Z9D g3() {
        return (C0Z9D) this.LLJJIJI.getValue();
    }

    @Override // X.C0Z9B
    public final AnimatorSet l0() {
        return this.LLJJJ;
    }

    @Override // X.C0Z9B
    public final AnimatorSet v3() {
        return this.LLJJJIL;
    }

    public C895440ZAw(View view) {
        super(view);
        this.LLJ = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1591));
        this.LLJI = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1588));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1594));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1585));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1589));
        this.LLJILLL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1592));
        this.LLJJ = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1593));
        this.LLJJI = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1583));
        this.LLJJIII = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1590));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1586));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1584));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1587));
    }

    @Override // X.C0Z9B, X.InterfaceC892580Yzw
    public final void LJLJI(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
        C0Z9A.LIZJ(this, interfaceC887660Ys0);
    }

    @Override // X.C0Z9B
    public final void LLIIII(AnimatorSet animatorSet) {
        this.LLJJJ = animatorSet;
    }

    @Override // X.C0Z9B
    public final void LLILII(AnimatorSet animatorSet) {
        this.LLJJJIL = animatorSet;
    }

    @Override // X.AbstractC1903430zdF
    public final void R5(AbstractC895380ZAq abstractC895380ZAq) {
        String string;
        AbstractC895450ZAx c895470ZAz;
        int iIntValue;
        int iIntValue2;
        Activity activityL5;
        C895240ZAc c895240ZAc = (C895240ZAc) abstractC895380ZAq;
        this.itemView.setBackground(null);
        TuxIconView tuxIconView = (TuxIconView) this.LLJI.getValue();
        tuxIconView.setIconRes(c895240ZAc.LLILLL);
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        tuxIconView.setTintColorRes(R.attr.a0o);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zw);
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        tuxIconView.setBackground(c384050F3z.LIZ(tuxIconView.getContext()));
        C786410Ut5.LJJJJJL((LinearLayout) this.LLJJ.getValue());
        ArrayList arrayList = new ArrayList();
        if (c895240ZAc.LLJ == 50 && (activityL5 = L5()) != null) {
            TuxIconView tuxIconView2 = new TuxIconView(activityL5, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            C786410Ut5.M6(tuxIconView2, layoutParams);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_pin_fill;
            c419910GdJ.LIZIZ = iLIZIZ;
            c419910GdJ.LIZJ = iLIZIZ;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            tuxIconView2.setTuxIcon(c419910GdJ);
            arrayList.add(tuxIconView2);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((ViewGroup) this.LLJJ.getValue()).addView((View) it2.next());
        }
        TextView textView = (TextView) this.LLJIJIL.getValue();
        Activity activityL52 = L5();
        CharSequence charSequence = "";
        if (activityL52 == null || (string = activityL52.getString(c895240ZAc.LLILLJJLI)) == null) {
            string = "";
        }
        textView.setText(string);
        TextView textView2 = (TextView) this.LLJILJIL.getValue();
        if (c895240ZAc.LLILZ.length() != 0) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            c1360520lVa.LIZ.append((CharSequence) c895240ZAc.LLILZ);
            charSequence = c1360520lVa.LIZ;
        }
        textView2.setText(charSequence);
        C786410Ut5.LLLLZLL((TuxTextView) this.LLJILLL.getValue(), 8);
        if (c895240ZAc.LLILZIL.unreadCount > 0) {
            C417460GYm c417460GYm = (C417460GYm) this.LLJILJILJ.getValue();
            c417460GYm.setVariant(1);
            c417460GYm.setCount(c895240ZAc.LLILZIL.unreadCount);
            C786410Ut5.g0(c417460GYm, 0);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, c417460GYm.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c417460GYm.setBadgeBackgroundColor(iIntValue);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, c417460GYm.getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            c417460GYm.setBadgeContentColor(iIntValue2);
        } else {
            C786410Ut5.g0((C417460GYm) this.LLJILJILJ.getValue(), 8);
        }
        if (!C1902710zc5.LIZJ() && c895240ZAc.LLIZ) {
            c895470ZAz = new C0ZB0(0);
        } else {
            c895470ZAz = new C895470ZAz(0);
        }
        ((TuxTextView) this.LLJIJIL.getValue()).setTuxFont(c895470ZAz.LIZLLL());
        TuxTextView tuxTextView = (TuxTextView) this.LLJILJIL.getValue();
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(c895470ZAz.LIZJ());
            tuxTextView.setTextColorRes(c895470ZAz.LIZIZ());
        }
        C786410Ut5.I7(new ACListenerS117S0200000_14(c895240ZAc, this, 36), this.itemView);
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC913830Zt7(c895240ZAc, this, 1));
        ArchiveEntranceViewModel archiveEntranceViewModel = this.LLJJJJ;
        if (archiveEntranceViewModel != null && !archiveEntranceViewModel.LLILLL) {
            ArchiveEntranceViewModel.vQ2("show", "show", c895240ZAc, Integer.valueOf(getLayoutPosition() - 1));
            ArchiveEntranceViewModel archiveEntranceViewModel2 = this.LLJJJJ;
            if (archiveEntranceViewModel2 != null) {
                archiveEntranceViewModel2.LLILLL = true;
            }
        }
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        I5(i, interfaceC1891350zJl);
    }
}
