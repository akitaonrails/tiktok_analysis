package X;

import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.061n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.bot.repo.IMAIBotInfoManager$getBotInfoByScene$list$3", f = "IMAIBotInfoManager.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C15409061n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends IMAIBotInfo>>, Object> {
    public int LL;
    public final /* synthetic */ C15407061l LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15409061n(C15407061l c15407061l, int i, InterfaceC1364105Vn<? super C15409061n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c15407061l;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15409061n(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMAIBotInfoManager@49d1.getBotInfoByScene$list$3");
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
            C062B c062b = this.LLILLJJLI.LLILLL;
            List listSingletonList = Collections.singletonList(C2286608xc.LJ(this.LLILLL));
            this.LL = 1;
            obj = c062b.LIZ(1, listSingletonList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMAIBotInfoManager@49d1.getBotInfoByScene$list$3");
                return objLJFF;
            }
        }
        Object second = ((Pair) obj).getSecond();
        C1C7U.LIZIZ("IMAIBotInfoManager@49d1.getBotInfoByScene$list$3");
        return second;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends IMAIBotInfo>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
