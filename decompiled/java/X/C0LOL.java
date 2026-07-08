package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LOL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.config.AIPortraitConfigKt$AI_PORTRAIT_CONFIG$11$2$1", f = "AIPortraitConfig.kt", l = {}, m = "invokeSuspend")
public final class C0LOL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ CameoDraft LLILLJJLI;
    public final /* synthetic */ AIGCEntranceInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LOL(Context context, CameoDraft cameoDraft, AIGCEntranceInfo aIGCEntranceInfo, InterfaceC1364105Vn<? super C0LOL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = cameoDraft;
        this.LLILLL = aIGCEntranceInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LOL(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitConfigKt@d663.AI_PORTRAIT_CONFIG$11$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LL;
        CameoDraft cameoDraft = this.LLILLJJLI;
        AIGCEntranceInfo aIGCEntranceInfo = this.LLILLL;
        if (context != null) {
            String str = cameoDraft.taskId;
            if (str == null) {
                str = "";
            }
            AIGCDraft aIGCDraft = new AIGCDraft(C0LOM.LIZ, true, str, aIGCEntranceInfo, cameoDraft, null);
            C547860LeC.LIZ.getClass();
            C547860LeC.LJFF().LIZJ(context, aIGCDraft);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitConfigKt@d663.AI_PORTRAIT_CONFIG$11$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
