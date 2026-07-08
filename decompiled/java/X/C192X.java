package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.192X, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C192X extends C193N<C05YF, C214741192d, C214740192c> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final Function0<C214741192d> LLJ;
    public final C214740192c LLJI;
    public final InterfaceC1738600vLO LLJIJIL;
    public final C10J3 LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C192X.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C192X.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJILLL = 8;
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
    }

    @Override // X.C193N
    public AnonymousClass1931<?, C214741192d, C214740192c> F4() {
        return new AnonymousClass1931<C192U, C214741192d, C214740192c>() { // from class: X.192W
            public boolean LIZJ;

            @Override // X.AnonymousClass1931
            public final AbstractC1738640vLS LJ(Context context, ViewGroup viewGroup) {
                this.LIZJ = false;
                return new C192U(C10FP.LIZ(context, viewGroup));
            }

            @Override // X.AnonymousClass1931
            public final void LIZLLL(AbstractC1738640vLS abstractC1738640vLS, C193X c193x, C1664690tQB c1664690tQB, Object obj) {
                AbstractC214739192b abstractC214739192b = (AbstractC214739192b) abstractC1738640vLS;
                if (!this.LIZJ) {
                    C127K c127k = abstractC214739192b.LL;
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_film_star;
                    c127k.setIcon(c419910GdJ);
                    c127k.setTitle(c127k.getContext().getString(2131849971));
                    c127k.setSubtitle(c127k.getContext().getString(2131849970));
                    ICommerceToolsTcmService iCommerceToolsTcmService = (ICommerceToolsTcmService) PluggableExtentionKt.pluggableSpi$default(ICommerceToolsTcmService.class, false, false, false, 14, null);
                    if (iCommerceToolsTcmService != null) {
                        iCommerceToolsTcmService.LJ(abstractC214739192b.LL, this.LIZLLL.O4(), this.LIZLLL.P4());
                    }
                    this.LIZJ = true;
                }
            }
        };
    }

    public final C19EG O4() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLJILJILJ[1]);
    }

    public final VideoPublishEditModel P4() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJILJILJ[0]);
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJI;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJIJIL;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJILJIL;
    }

    public C214740192c K4() {
        return this.LLJI;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C214741192d> o2() {
        return this.LLJ;
    }

    public C192X(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJ = AFwS223S0000000_32.get$arr$(94);
        this.LLJI = new C214740192c();
        this.LLJIJIL = EnumC214771193h.EDIT_PAGE_TCM;
        this.LLJILJIL = AnonymousClass1937.LIZ;
    }
}
