package X;

import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.061o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.bot.repo.IMAIBotInfoManager$getBotInfoByScene$list$1", f = "IMAIBotInfoManager.kt", l = {43}, m = "invokeSuspend")
public final class C15410061o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends IMAIBotInfo>>, Object> {
    public int LL;
    public final /* synthetic */ C15407061l LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15410061o(C15407061l c15407061l, int i, InterfaceC1364105Vn<? super C15410061o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c15407061l;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15410061o(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMAIBotInfoManager@49d1.getBotInfoByScene$list$1");
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
            int i2 = this.LLILLL;
            this.LL = 1;
            obj = C15415061t.LJFF(i2);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMAIBotInfoManager@49d1.getBotInfoByScene$list$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IMAIBotInfoManager@49d1.getBotInfoByScene$list$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends IMAIBotInfo>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
