package X;

import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.CommentForwardResolver$prepareForwardResSmallCardStyle$1", f = "CommentForwardResolver.kt", l = {553, 554, 555, 605, 606, 607}, m = "invokeSuspend")
public final class C567440MNi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int[] LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public float LLIZLLLIL;
    public int LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ C0MND LLJIJIL;
    public final /* synthetic */ ForwardMedia LLJILJIL;
    public final /* synthetic */ VideoPublishEditModel LLJILJILJ;
    public final /* synthetic */ long LLJILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C567440MNi(C0MND c0mnd, ForwardMedia forwardMedia, VideoPublishEditModel videoPublishEditModel, long j, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C567440MNi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJIJIL = c0mnd;
        this.LLJILJIL = forwardMedia;
        this.LLJILJILJ = videoPublishEditModel;
        this.LLJILLL = j;
        this.LLJJ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C567440MNi c567440MNi = new C567440MNi(this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
        c567440MNi.LLJI = obj;
        return c567440MNi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0511  */
    /* JADX WARN: Type inference failed for: r14v12, types: [T, X.0MNo] */
    /* JADX WARN: Type inference failed for: r14v8, types: [T, X.0MNo] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 1756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C567440MNi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
