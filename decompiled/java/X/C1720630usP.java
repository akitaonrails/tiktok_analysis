package X;

import com.bytedance.pipo.stellar.base.fragment.StellarFragment;
import com.bytedance.pipo.stellar.base.model.CardDO;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0usP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720630usP extends C09AY implements Function1<C20248814Kw, Unit> {
    public final /* synthetic */ CardDO LL;
    public final /* synthetic */ InterfaceC1720550usH LLILLJJLI;
    public final /* synthetic */ StellarFragment LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1720630usP(CardDO cardDO, InterfaceC1720550usH interfaceC1720550usH, StellarFragment stellarFragment, boolean z, int i) {
        super(1);
        this.LL = cardDO;
        this.LLILLJJLI = interfaceC1720550usH;
        this.LLILLL = stellarFragment;
        this.LLILZ = z;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20248814Kw c20248814Kw) {
        C20248814Kw c20248814Kw2 = c20248814Kw;
        c20248814Kw2.LIZ = new AwS570S0100000_26(this.LL, 46);
        C20248814Kw.LIZJ(c20248814Kw2, true, true, 1.0f, 0, null, null, null, 120);
        InterfaceC1720550usH interfaceC1720550usH = this.LLILLJJLI;
        c20248814Kw2.LIZIZ(new C1720290urr(this.LLILZIL, this.LLILLL, interfaceC1720550usH, this.LLILZ));
        return Unit.LIZ;
    }
}
