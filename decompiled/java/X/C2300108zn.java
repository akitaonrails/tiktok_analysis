package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08zn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.avatar.ChangAvatarActionStage$loadResourceAndPublish$1$musicLoaderJob$1", f = "ChangAvatarActionStage.kt", l = {220}, m = "invokeSuspend")
public final class C2300108zn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1443550nfV LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2300108zn(C1443550nfV c1443550nfV, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C2300108zn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1443550nfV;
        this.LLILZ = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2300108zn c2300108zn = new C2300108zn(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2300108zn.LLILLJJLI = obj;
        return c2300108zn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChangAvatarActionStage@89ff.loadResourceAndPublish$1$musicLoaderJob$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C19EG c19eg = this.LLILLL.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLILZ;
            this.LL = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            if (!videoPublishEditModel.creativeModel.changeAvatarModel.isFromSocialAvatar) {
                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C428501lb(c19eg, videoPublishEditModel, c23260099m, null), 3);
            } else {
                C189200o6.m2constructorimpl(false);
                c23260099m.resumeWith(false);
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ChangAvatarActionStage@89ff.loadResourceAndPublish$1$musicLoaderJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ChangAvatarActionStage@89ff.loadResourceAndPublish$1$musicLoaderJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
