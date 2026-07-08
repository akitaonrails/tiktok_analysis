package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.TemplateEditFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0v9H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731090v9H extends C09AY implements Function1<C0SZ5, Unit> {
    public final /* synthetic */ C13IQ<? extends Object> LL;
    public final /* synthetic */ Assembler LLILLJJLI;
    public final /* synthetic */ TemplateEditFragment LLILLL;
    public final /* synthetic */ TemplateItem LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1731090v9H(C13IQ<? extends Object> c13iq, Assembler assembler, TemplateEditFragment templateEditFragment, TemplateItem templateItem, long j, long j2, boolean z) {
        super(1);
        this.LL = c13iq;
        this.LLILLJJLI = assembler;
        this.LLILLL = templateEditFragment;
        this.LLILZ = templateItem;
        this.LLILZIL = j;
        this.LLILZLL = j2;
        this.LLIZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0SZ5 c0sz5) {
        C0SZ5 c0sz52 = c0sz5;
        c0sz52.LLIZLLLIL = R.id.i27;
        c0sz52.LL = this.LL;
        this.LLILLJJLI.DQ2(this.LLILLL, new C1731100v9I(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ));
        return Unit.LIZ;
    }
}
