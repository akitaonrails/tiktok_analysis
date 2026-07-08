package X;

import android.app.Activity;
import com.ss.android.ugc.airemix.api.model.AIRemixAwemeEntranceModel;
import com.ss.android.ugc.airemix.api.service.AIRemixLaunchParam;
import com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixCommonEntranceInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.airemix.IMAIRemixBridgeService$openAIRemix$1", f = "IMAIRemixBridgeService.kt", l = {76}, m = "invokeSuspend")
public final class C563080M6o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public AIRemixCommonEntranceInfo LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ InterfaceC563090M6p LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Aweme LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Activity LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C563080M6o(InterfaceC563090M6p interfaceC563090M6p, String str, Aweme aweme, String str2, Activity activity, InterfaceC1364105Vn<? super C563080M6o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = interfaceC563090M6p;
        this.LLILZIL = str;
        this.LLILZLL = aweme;
        this.LLIZ = str2;
        this.LLIZLLLIL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C563080M6o(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZLLL;
        AIRemixCommonEntranceInfo aIRemixCommonEntranceInfo;
        Object objLIZIZ = obj;
        C1C7U.LIZ("IMAIRemixBridgeService@d1fb.openAIRemix$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                aIRemixCommonEntranceInfo = this.LLILLJJLI;
                strLIZLLL = (String) this.LL;
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            strLIZLLL = this.LLILZ.LIZLLL(this.LLILZIL);
            aIRemixCommonEntranceInfo = new AIRemixCommonEntranceInfo(null, C0M70.DM_SHARE_CARD.getMobName(), UUID.randomUUID().toString(), null, "chat", null);
            InterfaceC563090M6p interfaceC563090M6p = this.LLILZ;
            Aweme aweme = this.LLILZLL;
            this.LL = strLIZLLL;
            this.LLILLJJLI = aIRemixCommonEntranceInfo;
            this.LLILLL = 1;
            objLIZIZ = interfaceC563090M6p.LIZIZ(aweme, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("IMAIRemixBridgeService@d1fb.openAIRemix$1");
                return objLJFF;
            }
        }
        AIRemixLaunchParam aIRemixLaunchParam = new AIRemixLaunchParam(this.LLILZIL, null, null, null, aIRemixCommonEntranceInfo, (AIRemixAwemeEntranceModel) objLIZIZ, 206);
        IAIRemixEntranceMobService.LIZ.getClass();
        C0M73.LIZ().LJIILIIL(strLIZLLL, this.LLIZ, C0M70.DM_SHARE_CARD.getShootName());
        this.LLILZ.LJI(this.LLIZLLLIL, aIRemixLaunchParam);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMAIRemixBridgeService@d1fb.openAIRemix$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
