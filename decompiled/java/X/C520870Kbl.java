package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kbl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.enigma.EnigmaCommentAction$createLeftCustomButton$2", f = "EnigmaCommentAction.kt", l = {131}, m = "invokeSuspend")
public final class C520870Kbl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C520860Kbk LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C520870Kbl(C520860Kbk c520860Kbk, long j, InterfaceC1364105Vn<? super C520870Kbl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c520860Kbk;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C520870Kbl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EnigmaCommentAction@6086.createLeftCustomButton$2");
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
            this.LLILLJJLI.getClass();
            long jLJI = (C520860Kbk.LJI() - this.LLILLL) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLJI, this) == objLJFF) {
                C1C7U.LIZIZ("EnigmaCommentAction@6086.createLeftCustomButton$2");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.LJ) {
            this.LLILLJJLI.LJII(EnumC520880Kbm.READY);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EnigmaCommentAction@6086.createLeftCustomButton$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
