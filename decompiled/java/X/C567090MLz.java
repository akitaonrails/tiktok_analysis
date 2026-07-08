package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.CommentForwardResolver$prepareForwardResNormalStyle$1$calculateCanvasBgTask$1", f = "CommentForwardResolver.kt", l = {366, 364}, m = "invokeSuspend")
public final class C567090MLz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CanvasBackground>, Object> {
    public C0MOP LL;
    public int LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<Bitmap> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567090MLz(AnonymousClass0957<Bitmap> anonymousClass0957, InterfaceC1364105Vn<? super C567090MLz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0957;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567090MLz(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0MOP c0mop;
        C1C7U.LIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$calculateCanvasBgTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$calculateCanvasBgTask$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0mop = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            c0mop = new C0MOP();
            AnonymousClass0957<Bitmap> anonymousClass0957 = this.LLILLL;
            this.LL = c0mop;
            this.LLILLJJLI = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$calculateCanvasBgTask$1");
                return objLJFF;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (C295690BiR.LIZ()) {
            i2 = 3;
        }
        C0MM1 c0mm1 = new C0MM1(bitmap, i2);
        this.LL = null;
        this.LLILLJJLI = 2;
        c0mop.getClass();
        obj = C1D7S.LIZ(c0mop, c0mm1, this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$calculateCanvasBgTask$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$calculateCanvasBgTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CanvasBackground> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
