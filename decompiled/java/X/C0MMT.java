package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0MMT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.CommentForwardResolver$prepareForwardResNormalStyle$1$downloadCanvasStyleTask$1", f = "CommentForwardResolver.kt", l = {340}, m = "invokeSuspend")
public final class C0MMT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0MMC>, Object> {
    public int LL;

    public C0MMT(InterfaceC1364105Vn<? super C0MMT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MMT(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$downloadCanvasStyleTask$1");
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
            C0MMX c0mmx = new C0MMX();
            C0MMD c0mmd = new C0MMD();
            this.LL = 1;
            obj = C1D7S.LIZ(c0mmx, c0mmd, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$downloadCanvasStyleTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$downloadCanvasStyleTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0MMC> interfaceC1364105Vn) {
        return new C0MMT(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
