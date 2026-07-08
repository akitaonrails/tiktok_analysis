package X;

import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.CommentForwardResolver$prepareForwardResNormalStyle$1$downloadVideoTask$1", f = "CommentForwardResolver.kt", l = {331}, m = "invokeSuspend")
public final class C567100MMa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C567180MMi>, Object> {
    public int LL;
    public final /* synthetic */ ForwardMedia LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567100MMa(ForwardMedia forwardMedia, InterfaceC1364105Vn<? super C567100MMa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = forwardMedia;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567100MMa(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$downloadVideoTask$1");
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
            C567250MMp c567250MMp = new C567250MMp();
            ForwardVideo forwardVideo = this.LLILLJJLI.video;
            C567230MMn c567230MMn = new C567230MMn(forwardVideo, C567120MMc.LIZ(forwardVideo, true, false, 4));
            this.LL = 1;
            obj = C1D7S.LIZ(c567250MMp, c567230MMn, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$downloadVideoTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$downloadVideoTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C567180MMi> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
