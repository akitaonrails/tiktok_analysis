package X;

import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.splitshoot.s;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0swh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646410swh extends C09AY implements Function0<s> {
    public final /* synthetic */ ShortVideoContext LL;
    public final /* synthetic */ C1DRG LLILLJJLI;
    public final /* synthetic */ C560530Lyd<C1647390syH> LLILLL;
    public final /* synthetic */ h0<Integer> LLILZ;
    public final /* synthetic */ C385670FAf<Boolean> LLILZIL;
    public final /* synthetic */ C385670FAf<Unit> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C538770LBb<Integer> LLIZLLLIL;
    public final /* synthetic */ List<InterfaceC1646450swl> LLJ;
    public final /* synthetic */ LiveEvent<C1646670sx7> LLJI;
    public final /* synthetic */ C1646430swj LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1646410swh(ShortVideoContext shortVideoContext, C1DRG c1drg, C560530Lyd c560530Lyd, h0 h0Var, C385670FAf c385670FAf, h0 h0Var2, String str, C538770LBb c538770LBb, List list, C560530Lyd c560530Lyd2, C1646430swj c1646430swj) {
        super(0);
        this.LL = shortVideoContext;
        this.LLILLJJLI = c1drg;
        this.LLILLL = c560530Lyd;
        this.LLILZ = h0Var;
        this.LLILZIL = c385670FAf;
        this.LLILZLL = h0Var2;
        this.LLIZ = str;
        this.LLIZLLLIL = c538770LBb;
        this.LLJ = list;
        this.LLJI = c560530Lyd2;
        this.LLJIJIL = c1646430swj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final s invoke() {
        s sVar = new s(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI);
        this.LLJIJIL.LIZ.add(R.id.sz5, sVar.LLLFFI, "SplitShootComponent");
        return sVar;
    }
}
