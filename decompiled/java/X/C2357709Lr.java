package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS617S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.09Lr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.VideoChosenResultFromAddSceneImpl$compressSingleVideo$2", f = "VideoChosenResultFromAddSceneImpl.kt", l = {264}, m = "invokeSuspend")
public final class C2357709Lr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends String>>, Object> {
    public InterfaceC2357009Lk LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC2357009Lk LLILLL;
    public final /* synthetic */ VideoSegment LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C536080L0s LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2357709Lr(InterfaceC2357009Lk interfaceC2357009Lk, VideoSegment videoSegment, int i, C536080L0s c536080L0s, InterfaceC1364105Vn<? super C2357709Lr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC2357009Lk;
        this.LLILZ = videoSegment;
        this.LLILZIL = i;
        this.LLILZLL = c536080L0s;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2357709Lr(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("VideoChosenResultFromAddSceneImpl@77d1.compressSingleVideo$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC2357009Lk interfaceC2357009Lk = this.LLILLL;
            VideoSegment videoSegment = this.LLILZ;
            int i2 = this.LLILZIL;
            C536080L0s c536080L0s = this.LLILZLL;
            this.LL = interfaceC2357009Lk;
            this.LLILLJJLI = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            interfaceC2357009Lk.LIZ(null, videoSegment, false, false, null, new C2357809Ls(i2, new C118300cf(), c536080L0s), null, new AwS617S0100000_3(c23260099m, 21));
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("VideoChosenResultFromAddSceneImpl@77d1.compressSingleVideo$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("VideoChosenResultFromAddSceneImpl@77d1.compressSingleVideo$2");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
