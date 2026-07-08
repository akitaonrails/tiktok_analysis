package X;

import Y.AObserverS206S0100000_2;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.legacy.select.RecUserSelectCell;
import com.ss.android.ugc.aweme.legacy.select.SelectedCardVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS72S0210000_21;

/* JADX INFO: renamed from: X.06Uv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1617106Uv implements C06V1 {
    public final C1617506Uz LIZ;
    public Function1<? super List<? extends IMUser>, Unit> LIZIZ;
    public Function0<Unit> LIZJ;
    public C1397510mTF LIZLLL;
    public ViewOnAttachStateChangeListenerC20604515jv LJ;
    public TuxTextView LJFF;
    public TuxTextView LJI;
    public C197039127h LJII;
    public SelectedCardVM LJIIIIZZ;

    public final C1397650mTT LIZLLL() {
        C1397620mTQ c1397620mTQ;
        List<C1397650mTT> list;
        C1397510mTF c1397510mTF = this.LIZLLL;
        if (c1397510mTF == null) {
            c1397510mTF = null;
        }
        AbstractC1391450mJT abstractC1391450mJTLJII = c1397510mTF.LJII();
        if (!(abstractC1391450mJTLJII instanceof C1397620mTQ) || (c1397620mTQ = (C1397620mTQ) abstractC1391450mJTLJII) == null || (list = c1397620mTQ.LJ) == null) {
            return null;
        }
        return (C1397650mTT) C13LP.LJJJLZIJ(0, list);
    }

    @Override // X.C06V1
    public final void dismiss() {
        C1397510mTF c1397510mTF = this.LIZLLL;
        if (c1397510mTF == null) {
            c1397510mTF = null;
        }
        c1397510mTF.LIZIZ(null);
    }

    @Override // X.C06V1
    public final void show() {
        C1397510mTF c1397510mTF = this.LIZLLL;
        if (c1397510mTF == null) {
            c1397510mTF = null;
        }
        if (c1397510mTF.LJIIIZ()) {
            return;
        }
        C1397510mTF c1397510mTF2 = this.LIZLLL;
        (c1397510mTF2 != null ? c1397510mTF2 : null).LIZLLL();
    }

    public C1617106Uv(C1617506Uz c1617506Uz) {
        View view;
        SelectedCardVM selectedCardVM;
        this.LIZ = c1617506Uz;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(c1617506Uz.LIZ(), null);
        C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jv, new ViewGroup.LayoutParams(-1, -2));
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(RecUserSelectCell.class);
        this.LJ = viewOnAttachStateChangeListenerC20604515jv;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c1617506Uz.LIZ()), R.layout.ekj, null, false);
        this.LJFF = (TuxTextView) viewTd.findViewById(R.id.xzv);
        this.LJI = (TuxTextView) viewTd.findViewById(R.id.fi1);
        TuxTextView tuxTextView = this.LJFF;
        (tuxTextView == null ? null : tuxTextView).setText(2131833932);
        TuxTextView tuxTextView2 = this.LJI;
        (tuxTextView2 == null ? null : tuxTextView2).setText(2131833929);
        C1397580mTM c1397580mTM = new C1397580mTM(c1617506Uz.LIZ());
        c1397580mTM.LJIIJ = new C1617406Uy(viewTd);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LJ;
        C384000F3u.LIZ(c1397580mTM, viewOnAttachStateChangeListenerC20604515jv2 == null ? null : viewOnAttachStateChangeListenerC20604515jv2);
        C985403tE.LIZ(c1397580mTM, AFwS229S0000000_2.get$arr$(924));
        c1397580mTM.LJ(new AwS581S0100000_2(this, OppoPermissionPopupMaskDelayExp.DEFAULT));
        c1397580mTM.LIZLLL(new AwS581S0100000_2(this, 701));
        this.LIZLLL = new C1397510mTF(c1397580mTM);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LJ;
        Object parent = (viewOnAttachStateChangeListenerC20604515jv3 == null ? null : viewOnAttachStateChangeListenerC20604515jv3).getParent();
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        if (view != null) {
            C426750GoL.LJIIIZ(view, 0, null, 0, null, false, 26);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.weight = 1.0f;
                C786410Ut5.W5(view, layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        C1397510mTF c1397510mTF = this.LIZLLL;
        View viewLJI = (c1397510mTF == null ? null : c1397510mTF).LJI(R.id.dc7);
        ViewGroup.LayoutParams layoutParams3 = viewLJI.getLayoutParams();
        if (layoutParams3 != null) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.weight = 0.0f;
            layoutParams4.height = -2;
            C786410Ut5.W5(viewLJI, layoutParams4);
            C1397650mTT c1397650mTTLIZLLL = LIZLLL();
            if (c1397650mTTLIZLLL != null) {
                c1397650mTTLIZLLL.LIZ(new AwS581S0100000_2(this, 702));
            }
            SelectedCardVM selectedCardVM2 = (SelectedCardVM) new ViewModelProvider(c1617506Uz).get(SelectedCardVM.class);
            this.LJIIIIZZ = selectedCardVM2;
            if (selectedCardVM2 == null) {
                selectedCardVM = null;
            } else {
                selectedCardVM = selectedCardVM2;
            }
            selectedCardVM.LL = c1617506Uz.LL;
            selectedCardVM.LLILLJJLI = "share_pop_up";
            (selectedCardVM2 == null ? null : selectedCardVM2).LLIZLLLIL.observe(c1617506Uz, new AObserverS206S0100000_2(this, 22));
            SelectedCardVM selectedCardVM3 = this.LJIIIIZZ;
            (selectedCardVM3 == null ? null : selectedCardVM3).LLJI.observe(c1617506Uz, new AObserverS206S0100000_2(this, 23));
            SelectedCardVM selectedCardVM4 = this.LJIIIIZZ;
            (selectedCardVM4 == null ? null : selectedCardVM4).LLJILJIL.observe(c1617506Uz, new AObserverS206S0100000_2(this, 24));
            SelectedCardVM selectedCardVM5 = this.LJIIIIZZ;
            (selectedCardVM5 != null ? selectedCardVM5 : null).LLJILLL.observe(c1617506Uz, new AObserverS206S0100000_2(this, 25));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    @Override // X.C06V1
    public final void LIZ(AwS72S0210000_21 awS72S0210000_21) {
        this.LIZIZ = awS72S0210000_21;
    }

    @Override // X.C06V1
    public final void LIZIZ(AwS563S0100000_19 awS563S0100000_19) {
        this.LIZJ = awS563S0100000_19;
    }

    @Override // X.C06V1
    public final void LIZJ(List<? extends User> list) {
        SelectedCardVM selectedCardVM = this.LJIIIIZZ;
        TuxTextView tuxTextView = null;
        if (selectedCardVM == null) {
            selectedCardVM = null;
        }
        NextLiveData<List<C1486105rn>> nextLiveData = selectedCardVM.LLIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends User> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1486105rn(it2.next()));
        }
        nextLiveData.postValue(arrayList);
        selectedCardVM.LLJ.postValue(Integer.valueOf(list.size()));
        if (list.size() > 1) {
            TuxTextView tuxTextView2 = this.LJFF;
            if (tuxTextView2 != null) {
                tuxTextView = tuxTextView2;
            }
            tuxTextView.setText(2131833931);
            return;
        }
        TuxTextView tuxTextView3 = this.LJFF;
        if (tuxTextView3 != null) {
            tuxTextView = tuxTextView3;
        }
        tuxTextView.setText(2131833932);
    }
}
