package X;

import android.content.Context;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS657S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MLq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.CommentForwardResolver$resolve$1$saveDraftTask$1", f = "CommentForwardResolver.kt", l = {190}, m = "invokeSuspend")
public final class C567000MLq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0MN4 LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ VideoPublishEditModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567000MLq(C0MN4 c0mn4, Context context, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C567000MLq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0mn4;
        this.LLILZ = context;
        this.LLILZIL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567000MLq(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentForwardResolver@871e.resolve$1$saveDraftTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0MN4 c0mn4 = this.LLILLL;
            Context context = this.LLILZ;
            VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
            this.LL = context;
            this.LLILLJJLI = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            if (!c0mn4.getAutoSaveDraft()) {
                C2243608qg.LIZ(null, c23260099m);
            }
            C1438840nXu c1438840nXu = C1438840nXu.LIZ;
            C1388190mED.LIZ(context);
            C1438920nY2 c1438920nY2 = new C1438920nY2(videoPublishEditModel, new AwS657S0100000_8(c23260099m, 0));
            c1438840nXu.getClass();
            C1438840nXu.LIZ(c1438920nY2);
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentForwardResolver@871e.resolve$1$saveDraftTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CommentForwardResolver@871e.resolve$1$saveDraftTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
