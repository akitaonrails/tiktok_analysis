package X;

import com.ss.android.ugc.airemix.api.IAIRemixService;
import com.ss.android.ugc.airemix.api.model.AIRemixAwemeEntranceModel;
import com.ss.android.ugc.airemix.api.service.AIRemixLaunchParam;
import com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixCommonEntranceInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.multi.maker.AIRemixAnchorMaker$whenMyAnchorClicked$1", f = "AIRemixAnchorMaker.kt", l = {111}, m = "invokeSuspend")
public final class C563180M6y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0M72 LL;
    public InterfaceC563090M6p LLILLJJLI;
    public Object LLILLL;
    public AIRemixCommonEntranceInfo LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public final /* synthetic */ C0M72 LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C563180M6y(C0M72 c0m72, InterfaceC1364105Vn<? super C563180M6y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c0m72;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C563180M6y(this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC563090M6p interfaceC563090M6pLIZ;
        C0M72 c0m72;
        String strLIZLLL;
        AIRemixCommonEntranceInfo aIRemixCommonEntranceInfo;
        String aid;
        String str;
        UrlModel originCover;
        List<String> urlList;
        Object objLIZIZ = obj;
        C1C7U.LIZ("AIRemixAnchorMaker@fd51.whenMyAnchorClicked$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLIZ;
        if (i != 0) {
            if (i == 1) {
                aid = (String) this.LLILZLL;
                str = (String) this.LLILZIL;
                aIRemixCommonEntranceInfo = this.LLILZ;
                strLIZLLL = (String) this.LLILLL;
                interfaceC563090M6pLIZ = this.LLILLJJLI;
                c0m72 = this.LL;
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            IAIRemixService.LIZ.getClass();
            interfaceC563090M6pLIZ = C563030M6j.LIZ().LIZ();
            if (interfaceC563090M6pLIZ != null) {
                c0m72 = this.LLIZLLLIL;
                Aweme awemeLJIIZILJ = c0m72.LJIIZILJ();
                strLIZLLL = interfaceC563090M6pLIZ.LIZLLL(awemeLJIIZILJ.getAid());
                String mobName = c0m72.LLJ.getMobName();
                InterfaceC1392640mLO interfaceC1392640mLO = c0m72.LL;
                if (interfaceC1392640mLO == null) {
                    interfaceC1392640mLO = null;
                }
                aIRemixCommonEntranceInfo = new AIRemixCommonEntranceInfo(null, mobName, UUID.randomUUID().toString(), null, interfaceC1392640mLO.Cf(), null);
                aid = awemeLJIIZILJ.getAid();
                Video video = awemeLJIIZILJ.getVideo();
                if (video != null && (originCover = video.getOriginCover()) != null && (urlList = originCover.getUrlList()) != null) {
                    str = (String) C13LP.LJJJLL(urlList);
                } else {
                    str = null;
                }
                this.LL = c0m72;
                this.LLILLJJLI = interfaceC563090M6pLIZ;
                this.LLILLL = strLIZLLL;
                this.LLILZ = aIRemixCommonEntranceInfo;
                this.LLILZIL = str;
                this.LLILZLL = aid;
                this.LLIZ = 1;
                objLIZIZ = interfaceC563090M6pLIZ.LIZIZ(awemeLJIIZILJ, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("AIRemixAnchorMaker@fd51.whenMyAnchorClicked$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AIRemixAnchorMaker@fd51.whenMyAnchorClicked$1");
            return unit;
        }
        AIRemixLaunchParam aIRemixLaunchParam = new AIRemixLaunchParam(aid, null, null, str, aIRemixCommonEntranceInfo, (AIRemixAwemeEntranceModel) objLIZIZ, 198);
        IAIRemixEntranceMobService.LIZ.getClass();
        IAIRemixEntranceMobService iAIRemixEntranceMobServiceLIZ = C0M73.LIZ();
        InterfaceC1392640mLO interfaceC1392640mLO2 = c0m72.LL;
        if (interfaceC1392640mLO2 == null) {
            interfaceC1392640mLO2 = null;
        }
        iAIRemixEntranceMobServiceLIZ.LJIILIIL(strLIZLLL, interfaceC1392640mLO2.Cf(), c0m72.LLJ.getShootName());
        interfaceC563090M6pLIZ.LJI(c0m72.LJIILJJIL(), aIRemixLaunchParam);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIRemixAnchorMaker@fd51.whenMyAnchorClicked$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
