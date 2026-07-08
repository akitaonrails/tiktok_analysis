package X;

import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.061p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.bot.repo.IMAIBotInfoManager$getBotInfoById$1", f = "IMAIBotInfoManager.kt", l = {66}, m = "invokeSuspend")
public final class C15411061p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super IMAIBotInfo>, Object> {
    public int LL;
    public final /* synthetic */ C15407061l LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15411061p(C15407061l c15407061l, long j, InterfaceC1364105Vn<? super C15411061p> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c15407061l;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15411061p(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMAIBotInfoManager@49d1.getBotInfoById$1");
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
            C15415061t c15415061t = this.LLILLJJLI.LL;
            long j = this.LLILLL;
            this.LL = 1;
            obj = c15415061t.LIZ(j);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMAIBotInfoManager@49d1.getBotInfoById$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IMAIBotInfoManager@49d1.getBotInfoById$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super IMAIBotInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
