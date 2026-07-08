package X;

import Y.AgS208S0200000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS553S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0Oxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compose.MentionVideoListPageKt$MentionVideoListFooter$1$1", f = "MentionVideoListPage.kt", l = {427}, m = "invokeSuspend")
public final class C636420Oxk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690050u55 LLILLJJLI;
    public final /* synthetic */ C05P0<C636350Oxd> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C636420Oxk(C1690050u55 c1690050u55, C05P0<C636350Oxd> c05p0, InterfaceC1364105Vn<? super C636420Oxk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690050u55;
        this.LLILLL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C636420Oxk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionVideoListPageKt@5e1a.MentionVideoListFooter$1$1");
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
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS553S0100000_9(this.LLILLJJLI, 1836));
            AgS208S0200000_25 agS208S0200000_25 = new AgS208S0200000_25(this.LLILLJJLI, this.LLILLL, 18);
            this.LL = 1;
            if (c095dLJIIIZ.collect(agS208S0200000_25, this) == objLJFF) {
                C1C7U.LIZIZ("MentionVideoListPageKt@5e1a.MentionVideoListFooter$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MentionVideoListPageKt@5e1a.MentionVideoListFooter$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
