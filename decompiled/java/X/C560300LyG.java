package X;

import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineEffectHandler$processV2VGenerationRequest$1", f = "AIGCOfflineEffectHandler.kt", l = {986}, m = "invokeSuspend")
public final class C560300LyG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C578910MnB LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ EnumC579010MnL LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C560300LyG(C578910MnB c578910MnB, int i, EnumC579010MnL enumC579010MnL, InterfaceC1364105Vn<? super C560300LyG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c578910MnB;
        this.LLILLL = i;
        this.LLILZ = enumC579010MnL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C560300LyG(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJIJJLI;
        CreativeInfo creativeInfo;
        CreativeModel creativeModel;
        C1C7U.LIZ("AIGCOfflineEffectHandler@7df1.processV2VGenerationRequest$1");
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
            C578910MnB c578910MnB = this.LLILLJJLI;
            int i2 = this.LLILLL;
            EnumC579010MnL enumC579010MnL = this.LLILZ;
            this.LL = 1;
            obj = c578910MnB.LJJIJIL(i2, enumC579010MnL, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIGCOfflineEffectHandler@7df1.processV2VGenerationRequest$1");
                return objLJFF;
            }
        }
        AIGCOfflineModel aIGCOfflineModel = (AIGCOfflineModel) obj;
        int i3 = 0;
        if (aIGCOfflineModel == null) {
            this.LLILLJJLI.LJJJ(false);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AIGCOfflineEffectHandler@7df1.processV2VGenerationRequest$1");
            return unit;
        }
        ShortVideoContext shortVideoContext = this.LLILLJJLI.LLILLJJLI;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            creativeModel.aigcOfflineModel = aIGCOfflineModel;
        }
        C544640LXq c544640LXq = C544640LXq.LIZ;
        if (shortVideoContext != null) {
            strLJIJJLI = shortVideoContext.LJIJJLI();
        } else {
            strLJIJJLI = null;
        }
        c544640LXq.LIZJ(aIGCOfflineModel, strLJIJJLI);
        C578910MnB c578910MnB2 = this.LLILLJJLI;
        InterfaceC560310LyH interfaceC560310LyH = c578910MnB2.LLIZLLLIL;
        ShortVideoContext shortVideoContext2 = c578910MnB2.LLILLJJLI;
        if (shortVideoContext2 == null || (creativeInfo = shortVideoContext2.creativeInfo) == null) {
            creativeInfo = new CreativeInfo(null, i3, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }
        interfaceC560310LyH.XM2(aIGCOfflineModel, creativeInfo, false);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineEffectHandler@7df1.processV2VGenerationRequest$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
