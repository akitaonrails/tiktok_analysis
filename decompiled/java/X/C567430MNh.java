package X;

import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MNh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.CommentForwardResolver$prepareForwardResNormalStyle$1", f = "CommentForwardResolver.kt", l = {384, 385, 453, 454, 455}, m = "invokeSuspend")
public final class C567430MNh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public float LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C0MND LLJ;
    public final /* synthetic */ ForwardMedia LLJI;
    public final /* synthetic */ VideoPublishEditModel LLJIJIL;
    public final /* synthetic */ long LLJILJIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C567430MNh(C0MND c0mnd, ForwardMedia forwardMedia, VideoPublishEditModel videoPublishEditModel, long j, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C567430MNh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = c0mnd;
        this.LLJI = forwardMedia;
        this.LLJIJIL = videoPublishEditModel;
        this.LLJILJIL = j;
        this.LLJILJILJ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C567430MNh c567430MNh = new C567430MNh(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c567430MNh.LLIZLLLIL = obj;
        return c567430MNh;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0416  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C567430MNh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
