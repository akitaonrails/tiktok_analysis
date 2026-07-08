package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pipo.payments.IPipoExternalPaymentsService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS2S1600000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0uYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708450uYl extends C09AY implements Function2<C19EG, IPipoExternalPaymentsService, Unit> {
    public final /* synthetic */ C1708220uYO LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1708320uYY LLILZ;
    public final /* synthetic */ InterfaceC1708270uYT LLILZIL;
    public final /* synthetic */ Function1<String, Unit> LLILZLL;
    public final /* synthetic */ Function1<C1708320uYY, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708450uYl(C1708220uYO c1708220uYO, Context context, String str, C1708320uYY c1708320uYY, C1709880ub4 c1709880ub4, AwS605S0100000_26 awS605S0100000_26, C1708590uYz c1708590uYz) {
        super(2);
        this.LL = c1708220uYO;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = c1708320uYY;
        this.LLILZIL = c1709880ub4;
        this.LLILZLL = awS605S0100000_26;
        this.LLIZ = c1708590uYz;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C19EG c19eg, IPipoExternalPaymentsService iPipoExternalPaymentsService) {
        iPipoExternalPaymentsService.LIZJ(c19eg, new AwS2S1600000_26(this.LL, (C1708220uYO) this.LLILLJJLI, (Context) this.LLILLL, (String) this.LLILZ, (C1708320uYY) this.LLILZIL, (InterfaceC1708270uYT) this.LLILZLL, (Function1<? super String, Unit>) this.LLIZ, (Function1<? super C1708320uYY, Unit>) 0));
        return Unit.LIZ;
    }
}
