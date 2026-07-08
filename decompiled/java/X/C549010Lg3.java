package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Lg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549010Lg3 extends C09AY implements Function1<C0LAB, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ IAITheaterCreationLauncher.EnterParams LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C549010Lg3(int i, IAITheaterCreationLauncher.EnterParams enterParams, String str, Long l, String str2, int i2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = enterParams;
        this.LLILLL = str;
        this.LLILZ = l;
        this.LLILZIL = str2;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0LAB c0lab) {
        String creationId;
        C0LAB c0lab2 = c0lab;
        c0lab2.LIZLLL(C0LQY.AI_THEATER, "ai_biz");
        c0lab2.LIZ(0, "is_draft");
        c0lab2.LIZ(this.LL, "self_cast");
        CreativeInfo creativeInfo = this.LLILLJJLI.creativeInfo;
        if (creativeInfo != null) {
            creationId = creativeInfo.getCreationId();
        } else {
            creationId = null;
        }
        c0lab2.LJ("creation_id", creationId);
        c0lab2.LIZ(0, "result");
        c0lab2.LJ("result_code", this.LLILLL);
        c0lab2.LIZLLL(this.LLILZ, "cost_time");
        c0lab2.LJ("cameo_id_list", this.LLILZIL);
        c0lab2.LIZ(this.LLILZLL, "message_round");
        return Unit.LIZ;
    }
}
