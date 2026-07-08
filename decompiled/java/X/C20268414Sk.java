package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14Sk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.viewmodel.DetailTakoBottomEntranceViewModel$bindData$1$3", f = "DetailTakoBottomEntranceViewModel.kt", l = {}, m = "invokeSuspend")
public final class C20268414Sk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20268514Sl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20268414Sk(C20268514Sl c20268514Sl, InterfaceC1364105Vn<? super C20268414Sk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20268514Sl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20268414Sk(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DetailTakoBottomEntranceViewModel@9e34.bindData$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LL.LIZLLL);
        c2344009Gk.LJIIIIZZ("entrance_type", "inflow_bottom_bar");
        c2344009Gk.LJIIIIZZ("group_id", this.LL.LJFF);
        c2344009Gk.LJIIIIZZ("aweme_type", this.LL.LJI);
        c2344009Gk.LJIIIIZZ("search_id", this.LL.LJ);
        c2344009Gk.LJIIIIZZ("words_content", this.LL.LJII);
        c2344009Gk.LJIIIIZZ("words_source", this.LL.LJIIIIZZ);
        c2344009Gk.LJIIIIZZ("last_feed_group_id", ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILZ);
        C20268514Sl c20268514Sl = this.LL;
        String str = c20268514Sl.LJIIIZ;
        if (str != null) {
            c2344009Gk.LJFF("word_id", str);
        }
        String str2 = c20268514Sl.LJIIJ;
        if (str2 != null) {
            c2344009Gk.LJFF("impr_id", str2);
        }
        String str3 = c20268514Sl.LJIIJJI;
        if (str3 != null) {
            c2344009Gk.LJFF("recall_info", str3);
        }
        String str4 = c20268514Sl.LJIIL;
        if (str4 != null) {
            c2344009Gk.LJFF("search_intent", str4);
        }
        String str5 = c20268514Sl.LJIILIIL;
        if (str5 != null) {
            c2344009Gk.LJFF("tako_intent", str5);
        }
        C20684815ws.LJIILLIIL("tikbot_entrance_show", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DetailTakoBottomEntranceViewModel@9e34.bindData$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
