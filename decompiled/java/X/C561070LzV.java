package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS5S2201000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LzV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$handleClickDraft$1", f = "DraftBoxFragment.kt", l = {1655}, m = "invokeSuspend")
public final class C561070LzV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftBoxFragment LLILLJJLI;
    public final /* synthetic */ C0M0P LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561070LzV(DraftBoxFragment draftBoxFragment, C0M0P c0m0p, int i, String str, String str2, InterfaceC1364105Vn<? super C561070LzV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftBoxFragment;
        this.LLILLL = c0m0p;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561070LzV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxFragment@80e.handleClickDraft$1");
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
            Context context = this.LLILLJJLI.getContext();
            if (context != null) {
                DraftBoxFragment draftBoxFragment = this.LLILLJJLI;
                C0M0P c0m0p = this.LLILLL;
                int i2 = this.LLILZ;
                String str = this.LLILZIL;
                String str2 = this.LLILZLL;
                C556820Lse c556820Lse = C556820Lse.LIZ;
                long j = draftBoxFragment.LLLLJI;
                C561130Lzb c561130LzbWR = draftBoxFragment.WR();
                AwS5S2201000_8 awS5S2201000_8 = new AwS5S2201000_8(draftBoxFragment, i2, c0m0p, str, str2, 0);
                AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(draftBoxFragment, 498);
                this.LL = 1;
                if (c556820Lse.LIZJ(context, j, c561130LzbWR, c0m0p, awS5S2201000_8, awS552S0100000_8, this) == objLJFF) {
                    C1C7U.LIZIZ("DraftBoxFragment@80e.handleClickDraft$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.handleClickDraft$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
