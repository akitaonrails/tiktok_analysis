package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JNL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.PcsVideoPlayerView$onPlayProgressChange$1", f = "PcsVideoPlayerView.kt", l = {}, m = "invokeSuspend")
public final class C0JNL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0JO7 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JNL(C0JO7 c0jo7, String str, float f, InterfaceC1364105Vn<? super C0JNL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0jo7;
        this.LLILLJJLI = str;
        this.LLILLL = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JNL(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0JNK c0jnk;
        C1C7U.LIZ("PcsVideoPlayerView@8926.onPlayProgressChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.getPlayerChannel().LJ.getValue().LIZ && (c0jnk = this.LL.LLILZLL) != null && c0jnk.LIZJ(this.LLILLJJLI)) {
            this.LL.getPlayerChannel().LJ.setValue(new C0JNF(true, false));
        }
        if (this.LL.getPlayerChannel().LJFF.getValue().booleanValue()) {
            this.LL.getPlayerChannel().LJFF.setValue(false);
        }
        if (!this.LL.getPlayerChannel().LJII.getValue().booleanValue() && this.LL.getPlayerChannel().LJ.getValue().LIZ) {
            this.LL.getPlayerChannel().LIZJ.setValue(C2286608xc.LIZLLL(this.LLILLL));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PcsVideoPlayerView@8926.onPlayProgressChange$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PcsVideoPlayerView@8926.onPlayProgressChange$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
