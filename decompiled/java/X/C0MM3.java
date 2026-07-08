package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MM3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.CommentForwardResolver$prepareForwardResNormalStyle$1$extractSourceCoverTask$1", f = "CommentForwardResolver.kt", l = {350, 351}, m = "invokeSuspend")
public final class C0MM3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ ForwardMedia LLILZ;
    public final /* synthetic */ AnonymousClass0957<C567180MMi> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MM3(ForwardMedia forwardMedia, AnonymousClass0957<C567180MMi> anonymousClass0957, InterfaceC1364105Vn<? super C0MM3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = forwardMedia;
        this.LLILZIL = anonymousClass0957;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MM3(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int sourceWidth;
        int sourceHeight;
        C1C7U.LIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$extractSourceCoverTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$extractSourceCoverTask$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sourceHeight = this.LLILLJJLI;
            sourceWidth = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            float fMin = Math.min(this.LLILZ.video.getSourceWidth() / 256.0f, this.LLILZ.video.getSourceHeight() / 256.0f);
            sourceWidth = (int) (this.LLILZ.video.getSourceWidth() / fMin);
            sourceHeight = (int) (this.LLILZ.video.getSourceHeight() / fMin);
            AnonymousClass0957<C567180MMi> anonymousClass0957 = this.LLILZIL;
            this.LL = sourceWidth;
            this.LLILLJJLI = sourceHeight;
            this.LLILLL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$extractSourceCoverTask$1");
                return objLJFF;
            }
        }
        C567330MMx c567330MMx = new C567330MMx();
        C0MN0 c0mn0 = new C0MN0(((C567180MMi) obj).LIZ, this.LLILZ, sourceWidth, sourceHeight, ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LIZIZ());
        this.LLILLL = 2;
        obj = C1D7S.LIZ(c567330MMx, c0mn0, this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$extractSourceCoverTask$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$extractSourceCoverTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
