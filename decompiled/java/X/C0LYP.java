package X;

import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationComponent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LYP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationComponent$onCreate$2$3$1$6", f = "AIGCGenerationComponent.kt", l = {264}, m = "invokeSuspend")
public final class C0LYP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0LYS LLILLJJLI;
    public final /* synthetic */ AIGCGenerationComponent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LYP(C0LYS c0lys, AIGCGenerationComponent aIGCGenerationComponent, InterfaceC1364105Vn<? super C0LYP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0lys;
        this.LLILLL = aIGCGenerationComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LYP(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CreativeModel creativeModel;
        C1C7U.LIZ("AIGCGenerationComponent@e333.onCreate$2$3$1$6");
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
            long j = ((C0LYD) this.LLILLJJLI).LIZIZ;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("AIGCGenerationComponent@e333.onCreate$2$3$1$6");
                return objLJFF;
            }
        }
        AIGCGenerationComponent aIGCGenerationComponent = this.LLILLL;
        aIGCGenerationComponent.i3(new AwS587S0100000_8(aIGCGenerationComponent, 504));
        C544640LXq c544640LXq = C544640LXq.LIZ;
        ShortVideoContext shortVideoContext = this.LLILLL.getShortVideoContext();
        AIGCOfflineModel aIGCOfflineModel = null;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            aIGCOfflineModel = creativeModel.aigcOfflineModel;
        }
        c544640LXq.getClass();
        Map mapLJ = C2097608Jq.LJ();
        c544640LXq.getClass();
        C544640LXq.LIZ("ai_i2i_draft_page_show", aIGCOfflineModel, "video_shoot_page", mapLJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCGenerationComponent@e333.onCreate$2$3$1$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
