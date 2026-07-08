package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903530zdP extends AbstractC1903430zdF<C895420ZAu> implements InterfaceC1071060dyi, C0Z37<C895420ZAu>, C0Z9B, InterfaceC1508640pMU {
    public final InterfaceC1903540zdQ LLJ;
    public C11NJ LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public AnimatorSet LLJILLL;
    public AnimatorSet LLJJ;

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
        return "ContactPermissionVH";
    }

    @Override // X.C0Z9B
    public final C0HZQ b() {
        return null;
    }

    @Override // X.InterfaceC1071060dyi
    public final void E0() {
        EnumC1903590zdV.CONTACTS.markAction(true);
        if (N5() != null) {
            C1075780e6K.LIZIZ("find_friends", EnumC1903600zdW.TOP);
        }
    }

    @Override // X.C0Z9B
    public final List<View> LLLLJI() {
        return (List) this.LLJIJIL.getValue();
    }

    @Override // X.C0Z9B
    public final List<View> M() {
        return (List) this.LLJILJIL.getValue();
    }

    @Override // X.C0Z9B
    public final C0Z9D g3() {
        return (C0Z9D) this.LLJILJILJ.getValue();
    }

    @Override // X.InterfaceC1071060dyi
    public final void C5() {
        MultiViewModel multiViewModelN5 = N5();
        if (multiViewModelN5 != null) {
            multiViewModelN5.NQ2(this.LLILLL);
        }
    }

    @Override // X.AbstractC1903430zdF, X.C0Z32
    public final void onAttach() {
        super.onAttach();
        C11NJ c11nj = new C11NJ();
        this.LLJI = c11nj;
        this.LLJ.setUFRSubscription(c11nj);
    }

    @Override // X.AbstractC1903430zdF, X.C0Z32
    public final void onDetach() {
        super.onDetach();
        C11NJ c11nj = this.LLJI;
        if (c11nj == null) {
            c11nj = null;
        }
        c11nj.dispose();
    }

    @Override // X.AbstractC1903430zdF
    public final void reportShowEvent() {
        MultiViewModel multiViewModelN5 = N5();
        if (multiViewModelN5 != null && !multiViewModelN5.LLJLILLLLZIIL) {
            multiViewModelN5.LLJLILLLLZIIL = true;
            C1075780e6K.LIZIZ("authorize_card_show", EnumC1903600zdW.TOP);
        }
        EnumC1903590zdV.CONTACTS.markExposure();
    }

    @Override // X.C0Z9B
    public final AnimatorSet l0() {
        return this.LLJILLL;
    }

    @Override // X.C0Z9B
    public final AnimatorSet v3() {
        return this.LLJJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1903530zdP(View view) {
        super(view);
        InterfaceC1903540zdQ interfaceC1903540zdQ = (InterfaceC1903540zdQ) view;
        this.LLJ = interfaceC1903540zdQ;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 955));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 957));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 956));
        interfaceC1903540zdQ.setActionListener(this);
        interfaceC1903540zdQ.setEnterFrom("notification_page");
        this.LLILLJJLI = AFwS217S0000000_28.get$arr$(683);
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC19332710kH(this, 7));
        C1906140zhc c1906140zhc = C1906140zhc.LIZ;
        EnumC1906160zhe enumC1906160zhe = EnumC1906160zhe.CELL;
        c1906140zhc.getClass();
        C1906140zhc.LIZ(view, enumC1906160zhe, 0.0f);
    }

    @Override // X.C0Z9B, X.InterfaceC892580Yzw
    public final void LJLJI(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
        C0Z9A.LIZJ(this, interfaceC887660Ys0);
    }

    @Override // X.C0Z9B
    public final void LLIIII(AnimatorSet animatorSet) {
        this.LLJILLL = animatorSet;
    }

    @Override // X.C0Z9B
    public final void LLILII(AnimatorSet animatorSet) {
        this.LLJJ = animatorSet;
    }

    @Override // X.AbstractC1903430zdF
    public final void P5(C1906880zio c1906880zio) {
        this.LLJ.r(c1906880zio);
    }

    @Override // X.AbstractC1903430zdF
    public final void R5(AbstractC895380ZAq abstractC895380ZAq) {
        this.LLJ.d0(EnumC1071070dyj.CONTACT, EnumC992790bwT.INBOX_NORMAL);
        this.LLJ.setUFRExternalParams(C2097908Jt.LIZJ(new Pair("position", "top")));
        this.LLJ.LLLLLLL(C1903550zdR.LIZ(((C895420ZAu) abstractC895380ZAq).LLILLL));
    }

    @Override // X.InterfaceC1071060dyi
    public final void o2(EnumC1071070dyj enumC1071070dyj) {
        C1903610zdX.LIZ.getClass();
        if (C1903610zdX.LIZ() && enumC1071070dyj == EnumC1071070dyj.CONTACT) {
            EnumC1903590zdV.CONTACTS.markDelete();
            MultiViewModel multiViewModelN5 = N5();
            if (multiViewModelN5 != null) {
                multiViewModelN5.NQ2(this.LLILLL);
            }
        }
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        I5(i, interfaceC1891350zJl);
    }
}
