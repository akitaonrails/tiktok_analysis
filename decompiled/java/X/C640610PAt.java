package X;

import Y.ARunnableS21S0101000_10;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.ability.SearchDislikeAbilityImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.ability.SearchDislikeAbilityImpl$dislikeOuterStreamItemByAdapterPosition$1", f = "SearchDislikeAbilityImpl.kt", l = {244}, m = "invokeSuspend")
public final class C640610PAt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchDislikeAbilityImpl LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ SearchMixFeed LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C640610PAt(SearchDislikeAbilityImpl searchDislikeAbilityImpl, int i, SearchMixFeed searchMixFeed, InterfaceC1364105Vn<? super C640610PAt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchDislikeAbilityImpl;
        this.LLILLL = i;
        this.LLILZ = searchMixFeed;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C640610PAt(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF;
        RecyclerView.ViewHolder viewHolder;
        C1C7U.LIZ("SearchDislikeAbilityImpl@9c2a.dislikeOuterStreamItemByAdapterPosition$1");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            SearchDislikeAbilityImpl searchDislikeAbilityImpl = this.LLILLJJLI;
            Taco tacoLIZ = C0PCE.LIZ(searchDislikeAbilityImpl.LLILLL, false);
            Integer numValueOf = null;
            if (tacoLIZ != null) {
                InterfaceC588610N6t interfaceC588610N6t = tacoLIZ.LLILLJJLI;
                if (interfaceC588610N6t != null) {
                    objLJFF = interfaceC588610N6t.LJFF();
                } else {
                    objLJFF = null;
                }
                if ((objLJFF instanceof RecyclerView.ViewHolder) && (viewHolder = (RecyclerView.ViewHolder) objLJFF) != null) {
                    numValueOf = Integer.valueOf(viewHolder.getBindingAdapterPosition());
                }
            }
            searchDislikeAbilityImpl.LLIZLLLIL = numValueOf;
            if (this.LLILLJJLI.LLILLL.getItemAnimator() == null) {
                this.LLILLJJLI.LLILLL.setItemAnimator(new C423520Gj8());
            }
            if (C1829907Er.LIZ() == 1) {
                C0PFX.LIZ(this.LLILLJJLI.LLILLL.findViewHolderForAdapterPosition(this.LLILLL), this.LLILZ, C0PL1.HIDE_DOC);
                this.LLILLJJLI.LIZ(this.LLILZ);
            } else if (C1829907Er.LIZ() == 2) {
                SearchDislikeAbilityImpl searchDislikeAbilityImpl2 = this.LLILLJJLI;
                SearchMixFeed searchMixFeed = this.LLILZ;
                this.LL = 1;
                if (searchDislikeAbilityImpl2.LIZIZ(searchMixFeed, this) == objLJFF2) {
                    C1C7U.LIZIZ("SearchDislikeAbilityImpl@9c2a.dislikeOuterStreamItemByAdapterPosition$1");
                    return objLJFF2;
                }
            }
        }
        SearchDislikeAbilityImpl searchDislikeAbilityImpl3 = this.LLILLJJLI;
        Integer num = searchDislikeAbilityImpl3.LLIZLLLIL;
        if (num != null) {
            HandlerHook.viewPost(searchDislikeAbilityImpl3.LLILLL, new ARunnableS21S0101000_10(num.intValue(), searchDislikeAbilityImpl3, 4));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchDislikeAbilityImpl@9c2a.dislikeOuterStreamItemByAdapterPosition$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
