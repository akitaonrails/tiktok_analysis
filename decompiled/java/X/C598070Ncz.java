package X;

import Y.AgS290S0100000_9;
import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.dsp.dm.repo.Dsp2ttDmRepoOperator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ncz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.viewmodel.MusicDetailViewModel$fetchMusicDetail$2", f = "MusicDetailViewModel.kt", l = {51}, m = "invokeSuspend")
public final class C598070Ncz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MusicDetailViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598070Ncz(MusicDetailViewModel musicDetailViewModel, InterfaceC1364105Vn<? super C598070Ncz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = musicDetailViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598070Ncz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicDetailViewModel@3b0b.fetchMusicDetail$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Dsp2ttDmRepoOperator dsp2ttDmRepoOperator = (Dsp2ttDmRepoOperator) ((InterfaceC736910SvR) this.LLILLJJLI.LL.getValue()).getOperator();
            String str = this.LLILLJJLI.LLILLJJLI;
            if (str != null) {
                InterfaceC346201Wa<C0O7A<C0O1N>> musicDetail = dsp2ttDmRepoOperator.getMusicDetail(str);
                AgS290S0100000_9 agS290S0100000_9 = new AgS290S0100000_9(this.LLILLJJLI, 27);
                this.LL = 1;
                if (musicDetail.collect(agS290S0100000_9, this) == objLJFF) {
                    C1C7U.LIZIZ("MusicDetailViewModel@3b0b.fetchMusicDetail$2");
                    return objLJFF;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicDetailViewModel@3b0b.fetchMusicDetail$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
