package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Xk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.avatar.ChangAvatarActionStage$loadResourceAndPublish$1", f = "ChangAvatarActionStage.kt", l = {226, 230, 231, 233, 241}, m = "invokeSuspend")
public final class C2388209Xk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ VideoPublishEditModel LLILZLL;
    public final /* synthetic */ C1465460oEq LLIZ;
    public final /* synthetic */ C1443550nfV LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2388209Xk(VideoPublishEditModel videoPublishEditModel, C1465460oEq c1465460oEq, C1443550nfV c1443550nfV, InterfaceC1364105Vn<? super C2388209Xk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = videoPublishEditModel;
        this.LLIZ = c1465460oEq;
        this.LLIZLLLIL = c1443550nfV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2388209Xk c2388209Xk = new C2388209Xk(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c2388209Xk.LLILZIL = obj;
        return c2388209Xk;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0152  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2388209Xk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
