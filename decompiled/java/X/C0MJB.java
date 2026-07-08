package X;

import Y.AgS171S0300000_22;
import com.ss.android.ugc.aweme.story.share.IShareToStoryVideoStreamController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MJB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.SocialEditRootScene$subscribeStreamingDownloadCompletion$1", f = "SocialEditRootScene.kt", l = {895}, m = "invokeSuspend")
public final class C0MJB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ IShareToStoryVideoStreamController LLILLL;
    public final /* synthetic */ C1455250nyN LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MJB(IShareToStoryVideoStreamController iShareToStoryVideoStreamController, C1455250nyN c1455250nyN, InterfaceC1364105Vn<? super C0MJB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = iShareToStoryVideoStreamController;
        this.LLILZ = c1455250nyN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0MJB c0mjb = new C0MJB(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0mjb.LLILLJJLI = obj;
        return c0mjb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialEditRootScene@8880.subscribeStreamingDownloadCompletion$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C2252331DDr c2252331DDrLIZJ = this.LLILLL.LIZJ();
            AgS171S0300000_22 agS171S0300000_22 = new AgS171S0300000_22(interfaceC497601wk, this.LLILZ, this.LLILLL, 0);
            this.LL = 1;
            c2252331DDrLIZJ.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDrLIZJ, agS171S0300000_22, this) == objLJFF) {
                C1C7U.LIZIZ("SocialEditRootScene@8880.subscribeStreamingDownloadCompletion$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
